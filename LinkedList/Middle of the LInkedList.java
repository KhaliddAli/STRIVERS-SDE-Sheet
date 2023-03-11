class Solution {
    int getLength(ListNode head){
        ListNode cur = head;
        int len =0;
        while(cur!=null){cur = cur.next; len++;}
        return len;
    }
    public ListNode middleNode(ListNode head) {
        //using a slow and a fast pointer to iterate on the LL
        //when the fast pointer reach null slow pointer will be at the middle node
        ListNode slow = head;
        ListNode fast = head;
        //getting the length of LL to check if its odd length or even length
        int len = getLength(head);
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //if the LL is even length return the second middle element
        if(len%2==0) return slow.next;
        return slow;
    }
}