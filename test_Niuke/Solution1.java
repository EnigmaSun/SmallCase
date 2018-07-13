package test_Niuke;

import java.util.Scanner;

import array.Solution;

public class Solution1 {
	 public double Power(double base, int exponent) {
	        int n=0;
	        double res =1,curr = base;
	        if(exponent<0){
	            if(base==0){
	                throw new RuntimeException("分母不能为0");
	            }
	            n= -exponent;
	        }else if(exponent==0){
	            return 1;
	        }else{
	            n=exponent;
	        }
	        while(n!=0){
	            if((n&1)==1){
	                res*=curr;
	            }
	            curr*=curr;
	            n >>=1;
	        }
	        return exponent>=0?(res):(1/res);
	  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double in1= sc.nextInt();
		System.out.println(in1);
		int in2 = sc.nextInt();
		System.out.println(in2);
		Solution1 s= new Solution1();
		System.out.println(s.Power(in1,in2));
		
	}
}
