public class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode l=new ListNode();
        ListNode nextnode;
        nextnode=l;
        int times=1,result = 0;
        int mark=0;
        while (l1!=null||l2!=null){
            ListNode listnode;
            int i1=0,i2=0;
            if(l1!=null){
                i1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                i2=l2.val;
                l2=l2.next;
            }
            if((i1+i2+mark)<10){
                listnode=new ListNode(i1+i2+mark);
                mark=0;
            }else{
                listnode=new ListNode(i1+i2+mark-10);
                mark=1;
            }
            nextnode.next=listnode;
            nextnode=nextnode.next;
        }
        if(mark==1){
            ListNode listnode=new ListNode(1);
            nextnode.next=listnode;
        }

        l=l.next;
        return l;
    }
}
