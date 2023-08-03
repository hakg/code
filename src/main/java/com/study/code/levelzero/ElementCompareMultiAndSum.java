package com.study.code.levelzero;

import java.util.Arrays;

public class ElementCompareMultiAndSum {
    /**
     * 원소들의 곱과 합
     *
     * 문제 설명
     * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] num_list = {5, 8, 7, 4};
        int multipleSumResult = 0;
        int multipleResult = 1;

        for (int a : num_list) {
            multipleSumResult += a;
            multipleResult *= a;
        }

        System.out.println(multipleResult >= (int)Math.pow(multipleSumResult, 2) ? 0 : 1);

        // 다른사람 풀이
        System.out.println((Arrays.stream(num_list)
                                  .reduce((acc, i) -> acc * i)
                                  .getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2)) ? 1 : 0);
    }
}
