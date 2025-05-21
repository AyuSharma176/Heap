package Heap_ques;


import java.util.*;

public class Kth_largest_element_using_minheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();// minheap
        for (int i = 0; i < k ;i++) {
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(!pq.isEmpty()&&nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
