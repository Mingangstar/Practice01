package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	//사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름: ");
		
		int r = sc.nextInt();
		final float PI = 3.14f;
		
		System.out.println("구의부피는: " + (4.0/3.0) * PI * (r * r * r) +"입니다." );

	}

}
