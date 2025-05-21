package Heap_ques;

import java.util.*;

public class Kth_largest_element_using_maxheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// maxheap
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int ans=0;
        while (!pq.isEmpty() && k-->0){
            ans = pq.poll();
        }
        System.out.println(ans);
    }
}
