package com.study.code.levelzero;

public class CommonMultiple {
    /**
     * 공배수
     *
     * 문제 설명
     * 정수 number와 n, m이 주어집니다.
     * number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을
     * return하도록 solution 함수를 완성해주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;

        if (number % n == 0 && number % m == 0) {
            System.out.println("공배수 맞음");
        } else {
            System.out.println("공배수 아님");
        }
    }
}
