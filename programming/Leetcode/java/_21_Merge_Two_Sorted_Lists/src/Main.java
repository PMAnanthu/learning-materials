public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution=new Solution();
        ListNode node1=new ListNode();
        ListNode node2=new ListNode();
        ListNode temp = solution.mergeTwoLists(node1, node2);
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}