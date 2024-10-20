public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode input=new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode result = solution.deleteDuplicates(input);
        ListNode head = result;
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}