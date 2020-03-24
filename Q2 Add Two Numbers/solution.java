/**
 * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) { val = x; }
//  * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(l1.next != null){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        sb1.append(l1.val);
        
        while(l2.next != null){
            sb2.append(l2.val);
            l2 = l2.next;
        }
        sb2.append(l2.val);
        
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        
        int num = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        
        StringBuilder sb3 = new StringBuilder(String.valueOf(num));
        sb3 = sb3.reverse();
        
        ListNode obj = new ListNode();
        ListNode head = obj;
        for(int i=0;i<sb3.length()-1;i++){
            obj.val = Integer.parseInt(sb3.charAt(i)+"");
            ListNode nextNode = new ListNode();
            obj.next = nextNode;
            obj = obj.next;
        }
        obj.val = Integer.parseInt(sb3.charAt(sb3.length()-1)+"");
        obj.next = null;
        return head;
    }
}