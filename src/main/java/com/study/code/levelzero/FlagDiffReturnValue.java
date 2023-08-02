package com.study.code.levelzero;

public class FlagDiffReturnValue {
    /**
     * flag에 따라 다른 값 반환하기
     *
     * 문제 설명
     * 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
     * flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;

        System.out.println(flag ? a + b : a - b);

    }
}
