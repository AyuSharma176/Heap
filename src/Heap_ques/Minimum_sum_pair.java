package Heap_ques;
import java.util.*;
public class Minimum_sum_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int ans=0;
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            int sum=x+y;
            ans+=sum;
            pq.add(sum);
        }
        System.out.println(ans);
    }
}
