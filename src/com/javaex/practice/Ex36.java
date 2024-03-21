package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
      
   public static void main(String[] args) {
      // 동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요.
      Scanner sc = new Scanner (System.in);

      System.out.print("500원의 개수 : ");
      int a1 = sc.nextInt();
      
      System.out.print("100원의 개수 : ");
      int b1 = sc.nextInt();
      
      System.out.print("50원의 개수 : ");
      int c1 = sc.nextInt();
      
      System.out.print("10원의 개수 : ");
      int d1 = sc.nextInt();
      
      System.out.println("동전의 총합은" + (500 * a1 + 100*b1 + 50*c1 + 10 * d1) + "원 입니다.");
      

   }

}