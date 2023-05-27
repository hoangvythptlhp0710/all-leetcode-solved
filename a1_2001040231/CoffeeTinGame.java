package src.a1_2001040231;

import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;
import utils.TextIO;

import java.util.Arrays;

/**
 * @overview A program that performs the coffee tin game on a
 * tin of beans and display result on the standard output
 *
 * @author dmle
 */


public class CoffeeTinGame {
    /** constant value for the green bean */
    @DomainConstraint(mutable = false, optional = false)
    private static final char GREEN = 'G';
    /** constant value for the blue bean */
    @DomainConstraint(mutable = false, optional = false)
    private static final char BLUE = 'B';
    /** constant for removed beans */
    @DomainConstraint(mutable = false, optional = false)
    private static final char REMOVED = '-';
    /** the null character */
    @DomainConstraint(mutable = false, optional = false)
    private static final char NULL = '\u0000';
    @DomainConstraint(mutable = false, optional = false, length = 30)
    private static final char[] BeansBag = {BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE, BLUE,
                                            GREEN, GREEN, GREEN, GREEN, GREEN, GREEN, GREEN, GREEN, GREEN, GREEN,
                                            REMOVED, REMOVED, REMOVED, REMOVED, REMOVED, REMOVED, REMOVED, REMOVED, REMOVED, REMOVED};

    /**
     * Performs the coffee tin game to determine the colour of the last bean
     *
     * @requires tin is not null /\ tin.length > 0
     * @modifies tin
     * @effects <pre>
     * take out two beans from tin
     * if same colour
     * throw both away, put one blue bean back
     * else
     * put green bean back
     * let p0 = initial number of green beans
     * if p0 = 1
     * result = ‘G’
     * else
     * result = ‘B’
     * </pre>
     */
    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            // take two beans from tin
            char[] takeTwo = takeTwo(tin);
            char b1 = takeTwo[0];
            char b2 = takeTwo[1];
            // process beans to update tin
            updateTin(tin, b1, b2);
        }
        return anyBean(tin);
    }

    /**
     * @effects
     * if tin has at least two beans
     *  return true
     * else
     *  return false
     */
    private static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }
            if (count >= 2) // enough beans
                return true;
        }
        // not enough beans
        return false;
    }

    /**
     * @requires tin has at least 2 beans left
     * @modifies tin
     * @effects remove any two beans from tin and return them
     */
    private static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);
        return new char[]{first, second};
    }


    /**
     * @requires tin has at least one bean
     * @modifies tin
     * @effects remove any bean from tin and return it
     * @return a bean that removed from tin
     */
    public static char takeOne(char[] tin) {
        int index = randInt(tin.length);
        while (tin[index] == REMOVED) {
            index = randInt(tin.length);
        }
        char removedBean = tin[index];
        tin[index] = REMOVED;
        return removedBean;
    }

    /**
     * @requires tin has vacant positions for new beans
     * @modifies tin
     * @effects place bean into any vacant position in tin
     */
    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) { // vacant position
                tin[i] = bean;
                break;
            }
        }
    }

    /**
     * @effects if there are beans in tin
     * return any such bean
     * else
     * return ’\u0000’ (null character)
     */
    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }
        // no beans left
        return NULL;
    }


    /**
     * accepts as input a positive integer n and returns as output an integer number randomly selected from the range [0, n)
     *
     * @return an integer number
     * e.g: randInt(5) = 0 /\ 1 /\ 2 /\ 3 /\ 4
     */
    public static int randInt(int n) {
        return (int) (Math.random() * n);
    }

    /**
     * randomly find and return a bean in BeansBag that matches the bean type
     *
     * @requires beans bag not null /\ bean type not null
     * @modifies BeansBag
     * @effect take out any bean from BeansBag
     * if selected bean matches the bean type
     *  return it
     * else
     *  continue select and compare
     * @return a bean matches the bean type
     */
    public static char getBean(char[] BeansBag, char bean) {
        char selectedBean = takeOne(BeansBag);
        while (selectedBean != bean) {
            selectedBean = takeOne(BeansBag);
        }
        return selectedBean;
    }

    /**
     * Updates the tin
     *
     * @require tin not null /\ tin.length > 0
     * @effect if two beans are same color
     *  throw them both away
     *  put a blue bean back in
     * else
     *  throw away the blue one
     *  put the green one back
     */
    public static void updateTin(char[] tin, char b1, char b2) {
        if (b1 == BLUE && b2 == BLUE) {
            char desiredBean = getBean(BeansBag, BLUE); // sửa lại ngắn hơn để trông khác
            putIn(tin, desiredBean);
        } else if (b1 == GREEN && b2 == GREEN) {
            char desiredBean = getBean(BeansBag, BLUE);
            putIn(tin, desiredBean);
        } else {
            putIn(tin, GREEN);
        }
    }


    // TODO: đặt lên đầu hoặc cuối
    /**
     * @effects initialise a coffee tin
     * {@link TextIO#putf}: display tin content
     * {@link #tinGame(char[])}: perform coffee tin game on tin
     * {@link TextIO#putf}: display tin content
     * if last bean is correct
     * {@link TextIO#putf}: display last bean
     * else
     * {@link TextIO#putf}: display error message
     */
    public static void main(String[] args) {
        // initialise some beans
        char[] tin = {BLUE, BLUE, GREEN, BLUE, GREEN, GREEN, BLUE, BLUE, GREEN, GREEN, GREEN, BLUE};

        // count number of greens
        int greens = 0;
        for (char bean : tin) {
            if (bean == GREEN)
                greens++;
        }

        final char last = (greens % 2 == 1) ? GREEN : BLUE;
        // p0 = green parity /\
        // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)

        // print the content of tin before the game
        TextIO.putf("tin before: %s %n", Arrays.toString(tin));

        // perform the game
        char lastBean = tinGame(tin);
        // lastBean = last \/ lastBean != last

        // print the content of tin and last bean
        TextIO.putf("tin after: %s %n", Arrays.toString(tin));

        // check if last bean as expected and print
        if (lastBean == last) {
            TextIO.putf("last bean: %c ", lastBean);
        } else {
            TextIO.putf("Oops, wrong last bean: %c (expected: %c)%n",
                    lastBean, last);
        }
    }
}
