package com.study.code.levelzero;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LastTwoElement {

    /**
     * 마지막 두 원소
     *
     * 문제 설명
     * 정수 리스트 numList가 주어질 때,
     * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
     * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] numList = {2, 1, 6};
        int numLength = numList.length;
        int[] numListResult = new int[numLength + 1];
        int idx = 0;

        for (int num : numList) {
            numListResult[idx] = num;
            idx++;
        }

        if (numList[numLength-1] > numList[numLength-2]) {
            numListResult[idx] = numList[numLength-1] - numList[numLength-2];
        } else {
            numListResult[idx] = numList[numLength-1] * 2;
        }


        // 다른사람 풀이
        int[] answer = new int[numList.length+1];

        for(int i = 0; i < numList.length; i++) {
            answer[i] = numList[i];
        }

        int last = numList[numList.length-1];
        int before = numList[numList.length-2];

        answer[answer.length-1] = last > before ? last - before : last*2;

    }
}
