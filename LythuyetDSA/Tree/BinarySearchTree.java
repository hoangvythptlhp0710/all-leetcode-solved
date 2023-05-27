package src.LythuyetDSA.Tree;

import src.Leetcode.Tree._112_path_Sum;

public class BinarySearchTree {

    public TreeNode Root;

    public BinarySearchTree(){

    }
// Thêm node trong cây (Leetcode bài 701. Insert a node in bst)
    public static TreeNode insert(TreeNode root, int value){
        // Th1: root == null
        TreeNode insertNode = new TreeNode(value);
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        //Th2: root != null{

        else{
            TreeNode temp = root;
            while (true){
                if (temp.val < value) {
                    if (temp.right == null) {
                        temp.right = insertNode;
                        break;
                    }
                    else{
                        temp = temp.right;
                    }
                }
                else{
                    if (temp.left == null) {
                        temp.left = insertNode;
                        break;
                    }
                    else{
                        temp = temp.left;
                    }
                }
            }
        }
        return root;
    }

// Xóa node trong cây (Leetcode bài 450. Delete a Node in BST)

    public static TreeNode findLeftModeNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode leafModeNode = root;
        while(leafModeNode.left != null){
            leafModeNode = leafModeNode.left;
        }
        return leafModeNode;
    }


    // return: cây mới đã được xóa node
    public static TreeNode deleteNode(TreeNode root, int key){
        if (root == null){
            return null;
        }
        if (key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else { // root.val = key => xoa root

            //th1: root là node lá
            if (root.left == null && root.right == null){
                return null;
            }
            //th2: chỉ có 1 con bên trái
            if (root.left != null && root.right == null){
                return root.left;
            }
            //chỉ có 1 con bên phải
            if (root.left == null && root.right != null){
                return root.right;
            }
            //th3: tồn taị 2 con

            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);

        }

        return root;
    }

//Tìm kiếm trong cây nhị phân (Leetcode bải 700. Search in a Binary Search Tree)
    public static TreeNode searchBST(TreeNode root, int val){
        if (root == null){
            return null;
        }
        if (val < root.val){
            root = searchBST(root.left, val);
        }
        else if (val > root.val){
            root = searchBST(root.right, val);
        }
        return root;
    }
//Duyệt cây
// Pre-Order: Root - Left - Right
    public static void PreOrder(TreeNode currentNode){
        if (currentNode == null) return;
        System.out.print(currentNode.val + " ");
        PreOrder(currentNode.left);
        PreOrder(currentNode.right);
    }
//In-Order: Left - Root - Right
    public static void InOrder(TreeNode currentNode){
        if (currentNode == null) return;
        InOrder(currentNode.left);
        System.out.print(currentNode.val + " ");
        InOrder(currentNode.right);
    }
//Post-Order: Left - Right - Root
    public static void PostOrder(TreeNode currentNode){
        if (currentNode == null) return;
        PostOrder(currentNode.left);
        PostOrder(currentNode.right);
        System.out.print(currentNode.val + " ");
    }
}
