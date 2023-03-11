class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //we will use a Dummy head Node to store the new LinkedList
        ListNode head = new ListNode(-1);
        //using a current Node pointer for resultant LL
        ListNode curr = head;
        //using the merge sort's merge method
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        //adding the remaining nodes from any of the list left with elements
        if(list1!=null) curr.next = list1;
        
        if(list2!=null) curr.next = list2;
        //storing a new head of resultant LL
        ListNode hhead = head.next;
        //deleting the dummy head node
        head.next = null;
        head = hhead;

        return head;
    }
}