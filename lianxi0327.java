/*
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。

示例 1:
输入: 2
输出: [0,1,1]

示例 2:
输入: 5
输出: [0,1,1,2,1,2]
*/
package lianxi0327;

public class lianxi0327 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int num = 10;
		int[] a = S.countBits(num);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
}


class Solution {
    public int[] countBits(int num) {
        int[] a = new int[num+1];
        a[0] = 0;
        int i = 1;
        while(i <= num){
            //i & (i-1) 是吧i最右边的1去掉，即 i中1的个数为 i&(i-1)中1 得个数加1
            // a[i]对应着i中含有1的个数，所以a[i]中1的个数 为a[i&(i+1)]的个数加1
            a[i] = a[i & ( i - 1)] + 1;
            i++;
        } 
        return a;
    }
}