package test_Niuke;

import java.util.ArrayList;
import java.util.Stack;
/*
 * ���ӣ�https://www.nowcoder.com/questionTerminal/d77d11405cc7470d82554cb392585106
��Դ��ţ����

��˼·������һ��������ջ������ѹջ˳���Ƚ���һ������ջ�У�������1��Ȼ���ж�ջ��Ԫ���ǲ��ǳ�ջ˳��ĵ�һ��Ԫ�أ�������4������Ȼ1��4���������Ǽ���ѹջ��ֱ������Ժ�ʼ��ջ����ջһ��Ԫ�أ��򽫳�ջ˳������ƶ�һλ��ֱ������ȣ�����ѭ����ѹջ˳�������ɣ��������ջ����Ϊ�գ�˵���������в��Ǹ�ջ�ĵ���˳��

������

��ջ1,2,3,4,5

��ջ4,5,3,2,1

����1�븨��ջ����ʱջ��1��4��������ջ2

��ʱջ��2��4��������ջ3

��ʱջ��3��4��������ջ4

��ʱջ��4��4����ջ4�������������һλ����ʱΪ5��,����ջ������1,2,3

��ʱջ��3��5��������ջ5

��ʱջ��5=5����ջ5,�����������һλ����ʱΪ3��,����ջ������1,2,3

��.

����ִ�У������ջΪ�ա������Ϊ��˵���������в��Ǹ�ջ�ĵ���˳��
 */
public class Order {

	public class Solution {
		public boolean IsPopOrder(int[] pushA, int[] popA) {
			if(pushA ==null || popA ==null){
				return false;
			}
			Stack<Integer> s = new Stack<>();
			int j=0;
			for(int i = 0; i<popA.length;i++){
				s.push(pushA[i]);
				while(j<popA.length && s.peek()==popA[j]){
					s.pop();
					j++;
				}
			}
			return s.isEmpty();
			
		}
	}
}
