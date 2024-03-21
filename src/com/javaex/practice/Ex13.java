package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		// 다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		//System.out.println(13/5);
		System.out.println(13/5); // 정수랑 정수를 나눠서 int형으로 출력됨
		System.out.println((double)13/5);
		System.out.println(13/(double)5);
		System.out.println((double)13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5)); // (13/5) 이미 정수로 나온값 2를 double로 형변환을 하여서 2.0일 출력 됨
	}

}
