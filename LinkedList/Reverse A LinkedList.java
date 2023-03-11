
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode reverseList(ListNode head) {
        //using 3 Nodes to reverse the list
        ListNode curr = head;
        //storing the prev node
        ListNode prev = null;
        //iterating on the LL
        while(curr!=null){
            //storing next node address
            ListNode nxtOfCurr = curr.next;
            //setting current node's to prev node
            curr.next = prev;
            //changing prev pointer to current node
            prev = curr;
            //changing current node to next of current node
            curr = nxtOfCurr;
        }
        //returning prev since it will be our new head 
        return prev;
    }
}