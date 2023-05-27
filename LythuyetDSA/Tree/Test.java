package src.LythuyetDSA.Tree;

public class Test {


    public static void main(String[] args) {
    /*    //Minh họa cây tìm kiếm nhị phân
        BinarySearchTree new1 = new BinarySearchTree();
        new1.Root = BinarySearchTree.insert(new1.Root, 5);
        new1.Root = BinarySearchTree.insert(new1.Root, 1);
        new1.Root = BinarySearchTree.insert(new1.Root, 6);
        new1.Root = BinarySearchTree.insert(new1.Root, 0);
        new1.Root = BinarySearchTree.insert(new1.Root, 3);
        new1.Root = BinarySearchTree.insert(new1.Root, 7);
        new1.Root = BinarySearchTree.insert(new1.Root, 2);
        new1.Root = BinarySearchTree.insert(new1.Root, 4);

        System.out.println("Done!");*/

        //Duyệt kiểu pre-order
        /*TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n2.right = n5;
        BinarySearchTree.PreOrder(n0);

        System.out.println("Done!");*/

        TreeNode n0 = new TreeNode(5);
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(11);
        TreeNode n4 = new TreeNode(13);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(1);

        n0.left = n1; n0.right = n2;
        n1.left = n3;
        n3.left = n6; n3.right = n7;
        n2.left = n4; n2.right = n5;
        n5.right = n8;


    }
}
