import java.io.*;
import java.math.*;
import java.util.*;
public class Cycledetection {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nData) {
            this.data = nData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nData) {
            SinglyLinkedListNode n = new SinglyLinkedListNode(nData);

            if (this.head == null) {
                this.head = n;
            } else {
                this.tail.next = n;
            }

            this.tail = n;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode n, String s, BufferedWriter bufferedWriter) throws IOException {
        while (n != null) {
            bufferedWriter.write(String.valueOf(n.data));

            n = n.next;

            if (n!= null) {
                bufferedWriter.write(s);
            }
        }
    }
    static boolean hasCycle(SinglyLinkedListNode head) {

    if (head == null){
        return false;
    }

    SinglyLinkedListNode slow = head;
    SinglyLinkedListNode fast = head;

    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast){
            return true;
        }
    }

    return false;
    }

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = s.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int index = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }

          	SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
            SinglyLinkedListNode temp = llist.head;

            for (int i = 0; i < llistCount; i++) {
                if (i == index) {
                    extra = temp;
                }

                if (i != llistCount-1) {
                    temp = temp.next;
                }
            }

      		temp.next = extra;

            boolean result = hasCycle(llist.head);

            bufferedWriter.write(String.valueOf(result ? 1 : 0));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
