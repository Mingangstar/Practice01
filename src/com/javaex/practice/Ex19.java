package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		// 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요

		int num01 =40;
		int num02 =50;
		int result = (num01++) + (++num02);
		
		
		System.out.println(result); //91
		System.out.println(num01); //41
		System.out.println(num02); //51
	}

}
