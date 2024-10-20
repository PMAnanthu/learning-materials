/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode();
        ListNode node = result;
        int reminder=0;
        while (l1!=null || l2!=null || reminder!=0) {
            int num1=0;
            int num2=0;
            if(l1!=null){
                num1=l1.val;
            }
            if(l2!=null){
                num2=l2.val;
            }
            int sum=num1+num2+reminder;
            reminder=0;
            if(sum>=10){
                node.val=sum%10;
                reminder=sum/10;
            }else{
                node.val=sum;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            if(l1!=null || l2!=null || reminder!=0){
                node.next = new ListNode();
                node = node.next;
            }
        }
        return result;
    }


}