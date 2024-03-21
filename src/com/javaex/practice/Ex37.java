package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {
      
   public static void main(String[] args) {
      //사용자에게 연필의 개수와 인원수를 입력 받아 모든 인원에게 같은 수의 연필을 나눠주려고 한다
	  // 1인당 연필의 받을 수 있는 연필의 개수와 나머지를 구하시오
      Scanner sc = new Scanner (System.in);
      

      System.out.print("전체 연필갯수를 입력해주세요: ");
      int pencil = sc.nextInt();
      
      System.out.print("전체 인원수를 입력해주세요: ");
      int people = sc.nextInt();
      
      System.out.println("1인당 연필의 갯수는"+ (pencil / people) + "입니다.");
      System.out.println("연필의 나머지 갯수는"+ (pencil % people) + "입니다.");
      

   }

}