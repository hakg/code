package com.study.code.levelzero;

public class ConditionString {

    /**
     * 조건 문자열
     *
     * 문제 설명
     * 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
     *
     * 두 수가 n과 m이라면
     * ">", "=" : n >= m
     * "<", "=" : n <= m
     * ">", "!" : n > m
     * "<", "!" : n < m
     * 두 문자열 ineq와 eq가 주어집니다.
     * ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
     * 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을
     * 아니면 0을 return하도록 solution 함수를 완성해주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;
        int result = 0;

        if ("<".equals(ineq) && "=".equals(eq)) {
            if (n <= m) {
                result = 1;
            } else {
                result = 0;
            }
        } else if (">".equals(ineq) && "=".equals(eq)) {
            if (n >= m) {
                result = 1;
            } else {
                result = 0;
            }
        } else if ("<".equals(ineq) && "!".equals(eq)) {
            if (n < m) {
                result = 1;
            } else {
                result = 0;
            }
        } else if (">".equals(ineq) && "!".equals(eq)) {
            if (n > m) {
                result = 1;
            } else {
                result = 0;
            }
        }

        // 다른사람 풀이
        boolean answer = false;
        if (ineq.equals(">") && eq.equals("=")) {
            answer = n >= m;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m;
        } else {
            answer = n < m;
        }

        System.out.println(answer ? 1 : 0);

    }


}
