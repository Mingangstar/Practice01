package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		// 아래의 출력결과를 예상하여 작성하세요. 
		
		int a = 13;
			
		System.out.println((a>13) && (a>=13)); //0
		System.out.println((a>13) || (a>=13)); //1
		System.out.println((a/3 ==4 ) && (a%3 == 2));//0
		System.out.println((a/3 == 4) ||(a%3 == 2));//1
		System.out.println((a/3 == 4) && (a%3 == 2) || (a/3 ==4));//1

	}

}
