package com.study.code.levelzero;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberOfConcatenations {
    /**
     * 이어 붙인 수
     *
     * 문제 설명
     * 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        StringBuilder oddSum = new StringBuilder();
        StringBuilder evenSum = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenSum.append(num);
            } else {
                oddSum.append(num);
            }
        }

        System.out.println(Integer.parseInt(evenSum.toString()) + Integer.parseInt(oddSum.toString()));

        // 다른사람 풀이
        System.out.println(Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining()))
                           + Integer.parseInt(Arrays.stream(num_list).filter(value -> value % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining())));
    }
}
