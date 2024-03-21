package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {
//넓이 = (밑변 * 높이) / 2
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
         System.out.print("가로: ");
         float w = sc.nextFloat();

         System.out.print("세로: ");
         float h = sc.nextFloat();
         
         System.out.println("삼각형의 넓이는" + (w * h) / 2.0 + "입니다.");

   }

}