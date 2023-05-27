/* Đặc điểm của Singly Linked List
        1.  Chỉ cần lưu node đầu tiên (head) là có thể truy xuất cả mảng
        2.  Khả năng truy xuất 1 phần tử của mảng: O(n)
        3.  Khả năng thêm và xóa 1 phần tử: O(1)*
                        (*: vị trí đó phải biết trước)
         */


        /*
        Thao tác xóa phần tử ở giữa list:
        Giả sử có 3 phần tử theo thứ tự: prev, cur, next
        1.  Xác định 3 phần tử trên
        2.  Trỏ prev vào next
        3.  Giải phóng vùng nhớ dành cho cur (C++)
        */

package src.LythuyetDSA.Sort;

public class single_linkedlist {
    public static class Node{
        public Integer val;
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static void printLinkedList(Node head){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;

            while (temp != null){
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }
    /*
Thao tác thêm phần tử vào đầu list (ví dụ):
     1.  Trỏ phần tử (new) vào (head)
     2.  Gán (head) = (new)
*/
    public static Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode != null){
            newNode.next = headNode;
        }
        return newNode;
    }

/*
Thao tác thêm phần tử vào cuối list (ví dụ)
     1.  Xác định phần tử cuối cùng (last)(trỏ vào null)
     2.  Trỏ last vào new thay vì trò vào null
         */

    public static Node addToLast(Node headNode, int value){
        Node newNode = new Node(value);
        if (headNode == null){
            return null;
        }
        else{
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
       return headNode;
    }

            /*
        Thao tác thêm phần tử vào giữa list (ví dụ):
        1.  Tìm vị trí muốn nhét phần tử (new) vào => Xác định (cur) và (next)
        2.  Trỏ phàn tử (new) vào next
        3.  Trò phần tử (current) vào new
         */

    public static Node addToBetween(Node headNode, int value, int index){

        if (index == 0){
            return addToHead(headNode, value);
        }
        else{
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode != null){
                count++;
                if (count == index){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }

        return headNode;
    }

/*
        Xóa phần tử ở đầu list
        1.  Xác định next
        2.  Trỏ head vào next.

         */

    public static Node deleteTheHeadNode(Node headNode) {
        Node lastNode = headNode;
        Node prevNode = null;
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }
    /*
            Xóa phần tử ở cuối list
            1.  Xác định prev và last(cạnh nhau)
            2.  Trỏ prev về NULL (X)
             */
    public static Node deleteTheLastNode(Node headNode){
        if (headNode == null){
            return null;
        }
        else {
            Node lastNode = headNode;
            Node prevNode = null;
            while (lastNode.next != null) {
                prevNode = lastNode;
                lastNode = lastNode.next;
            }

            if (prevNode == null) {
                return null;
            } else {
                prevNode.next = lastNode.next;
            }
        }
        return headNode;
    }

    /*
        Thao tác xóa phần tử ở giữa list:
        Giả sử có 3 phần tử theo thứ tự: prev, cur, next
        1.  Xác định 3 phần tử trên
        2.  Trỏ prev vào next
        */

    public static Node deleteTheBetweenNode(Node headNode, int index){
        if (headNode == null || index < 0){
            return null;
        }
        if (index == 0){
            return deleteTheHeadNode(headNode);
        }
        Node cur = headNode;
        Node prev = null;
        int count = 0;
        boolean isFound = false;
        while (cur != null){
            if (count == index){//xoa phan tu current
                isFound = true;
                break;
            }

            prev = cur;
            cur = cur.next;
            count++;
        }
        if (isFound){
            if(prev == null){
                //cur là node cuối
                return null;
            }
            else{
                if (cur != null)
                    prev.next = cur.next;
            }
        }
        return headNode;
    }



    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);
        n1 = deleteTheBetweenNode(n1, 2);
        printLinkedList(n1);
        n1 = deleteTheBetweenNode(n1,1);
        printLinkedList(n1);
    }
}
