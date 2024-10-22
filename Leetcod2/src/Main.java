
public class Main {
    public static void main(String[] args) {
        ListNode answer = new ListNode(0);
        ListNode nextnode;
        nextnode=answer;
        ListNode node = new ListNode(1);
        nextnode.next=node;
        nextnode=answer;
        System.out.println(nextnode.next.val);
        System.out.println(answer.next.val);
    }
}
