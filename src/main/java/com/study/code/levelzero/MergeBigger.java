package com.study.code.levelzero;

public class MergeBigger {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 91;
        String str1 = String.valueOf(num1) + String.valueOf(num2); // valueOf => Integer.toString 문자열로 변환하여 붙이기
        String str2 = String.valueOf(num2) + String.valueOf(num1);

        if (Integer.parseInt(str1) > Integer.parseInt(str2)) {
            System.out.println(Integer.parseInt(str1));
        } else {
            System.out.println(Integer.parseInt(str2));
        }

        // 다른사람풀이 "" + 숫자or문자 => 문자열 / 숫자or문자 + "" => 숫자
        System.out.println(Integer.parseInt("" + num1 + num2) + "/" + Integer.parseInt("" + num2 + num1));
    }
}
