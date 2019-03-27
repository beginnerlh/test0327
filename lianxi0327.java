/*
 * ����һ���Ǹ����� num������ 0 �� i �� num ��Χ�е�ÿ������ i ����������������е� 1 ����Ŀ����������Ϊ���鷵�ء�

ʾ�� 1:
����: 2
���: [0,1,1]

ʾ�� 2:
����: 5
���: [0,1,1,2,1,2]
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
            //i & (i-1) �ǰ�i���ұߵ�1ȥ������ i��1�ĸ���Ϊ i&(i-1)��1 �ø�����1
            // a[i]��Ӧ��i�к���1�ĸ���������a[i]��1�ĸ��� Ϊa[i&(i+1)]�ĸ�����1
            a[i] = a[i & ( i - 1)] + 1;
            i++;
        } 
        return a;
    }
}