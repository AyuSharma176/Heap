package Heap_ques;
import java.util.*;
public class Merge_k_sorted_list {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode listNode, ListNode t1) {
                    return listNode.val - t1.val;
                }

                @Override
                public boolean equals(Object o) {
                    return false;
                }
            });
            for(int i=0; i<lists.length; i++) {
                if(lists[i] != null) {
                    pq.add(lists[i]);
                }

            }
            ListNode dummy = new ListNode(0);
            ListNode temp = dummy;
            while(!pq.isEmpty()) {
                ListNode node = pq.poll();
                dummy.next = node;
                dummy=dummy.next;
                if(node.next != null) {
                    pq.add(node.next);
                }
            }
            return temp.next;
        }
    }
}
