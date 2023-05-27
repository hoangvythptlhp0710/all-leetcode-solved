public class Cat {
    private int age = 3;
    private String name = "Meo";
    private String color = "Vang";
    private int size;

    boolean catAge;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCatAge(boolean catAge) {
        this.catAge = catAge;
    }

    public boolean isDung() {
        return dung;
    }

    public void setDung(boolean dung) {
        this.dung = dung;
    }

    public boolean isSai() {
        return sai;
    }

    public void setSai(boolean sai) {
        this.sai = sai;
    }

    public void isCatAge(int age) {
        this.age = age;
        if (age > 0 && age < 20) {
            catAge = true;
        } else {
            catAge = false;
        }
    }

//    public ("static") ("data type") ("functionName") {
//        ...
//        return ("data type");
//    }

    public boolean isCatAge() {
        if (age > 0 && age < 20) {
            catAge = true;
        } else {
            catAge = false;
        }
        return catAge;
    }


    public Cat(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    boolean dung = true;
    boolean sai = false;

    public String meow() {
        return "Meow meow";
    }

//    public String gow

    public class Bow {
        String color;
        int size;

        public Bow(String color, int size) {
            this.color = color;
            this.size = size;
        }

        public void printColor() {
            System.out.print("Cat " + name + " is " + color + ". ");
            System.out.print("The size of " + name + " is " + size + ". ");
            System.out.print("Cat " + name + " has " + this.color + " bow. ");
            System.out.print("The size of bow is " + this.size + ".");
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Bob", "white", 10);
        Cat.Bow bow = cat.new Bow("red", 15);

        bow.printColor();
    }
}




