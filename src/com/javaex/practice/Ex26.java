package com.javaex.practice;
import java.util.Scanner; 
public class Ex26 {

	public static void main(String[] args) {
		//Scanner sanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("월급을 입력하세요:");
		//int salary = new Scanner.nextInt();
		int salary = scanner.nextInt();
		
		sum = salary * 120;
		
		System.out.print(sum);
		
		
		
	}

}
