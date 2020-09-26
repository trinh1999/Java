import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

//    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
//        while (list1.next != null) {
////            System.out.println(list1.val+" ");
//            list1 = list1.next;
//
//        }
//        return list1.next = list2;
//    }

//    public ListNode sx(ListNode Node1, ListNode Node2) {
//        ListNode tmp = new ListNode();
//        while (Node1 != null && Node2 != null)
//            if (Node1.val < Node2.val) {
//                tmp.next = Node1;
//                Node1 = Node1.next;
//            } else {
//                tmp.next = Node2;
//                Node2 = Node2.next;
//            }
//        tmp = tmp.next;
//    }

//        public ListNode mergeTwoList(ListNode list1, ListNode list2){
//        if (list1 == null){
//            return list2;
//        }
//        if (list2==null){
//            return list1;
//        }
//        ListNode kq= new ListNode(0);
//        ListNode merge= kq;
//        while (list1!=null && list2!=null) {
//
//            if (list1.val < list2.val) {
//                merge.next = list1;
//                list1=list1.next;
//            } else {
//                merge.next = list2;
//                list2=list2.next;
//            }
//            merge=merge.next;
//        }
//            while (list1!=null) {
//                merge.next = list1;
//                list1 = list1.next;
//                merge = merge.next;
//            }
//            while (list2!=null){
//                merge.next=list2;
//                list2=list2.next;
//                merge=merge.next;
//
//        }
//        return kq.next;
//    }
      public ListNode mergeTwoList(ListNode l1, ListNode l2){
         if(l1 == null) return l2;
         if(l2 == null) return l1;
         if(l1.val < l2.val){
        l1.next = mergeTwoList(l1.next, l2);
        return l1;
       }  else{
        l2.next = mergeTwoList(l1, l2.next);
        return l2;
       }
     }
    public static void duyet(ListNode linklist) {
        while (linklist != null) {
            System.out.print(linklist.val + " ");
            linklist = linklist.next;
        }
    }

    public static void main(String[] args) {
//        ListNode list1= new ListNode(1);
//        ListNode list11= new ListNode(3);
//        list1.next=list11;
//        ListNode list12= new ListNode(4);
//        list11.next=list12;
//        duyet(list1);
//
//        ListNode list2= new ListNode(1);
//        ListNode list21= new ListNode(2);
//        list2.next=list21;
//        ListNode list22= new ListNode(4);
//        list21.next=list22;
//        System.out.println(" ");
//        duyet(list2);

        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        ListNode listNode4 = new ListNode();

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        listNode1.val = 1;
        listNode2.val = 2;
        listNode3.val = 3;
        listNode4.val = 4;


        ListNode listNode5 = new ListNode();
        ListNode listNode6 = new ListNode();
        ListNode listNode7 = new ListNode();
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = null;
        listNode5.val = 2;
        listNode6.val = 3;
        listNode7.val = 4;
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoList(listNode1, listNode5);
        duyet(listNode1);
//        Collections.sort(listNode1);
    }
}
//        Collections.sort(listNode1);

//        while (listNode1.next!=null){
//            while (listNode1.next!=null){
//                if(listNode1.val<l)
//            }
//        }

//        int a[] = {1,4,2,6,0};
//
//        for(int i = 0 ;i<a.length;i++){
//            for(int j = 0;j<a.length;j++){
//                if(a[i] < a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for(int i = 0; i< a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
//}
