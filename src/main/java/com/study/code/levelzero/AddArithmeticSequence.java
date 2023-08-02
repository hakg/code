package com.study.code.levelzero;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AddArithmeticSequence {

    /**
     * 등차수열의 특정한 항만 더하기
     *
     * 문제 설명
     * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
     * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
     * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        int answer = 0;
        int cnt = 0;

        for (boolean trueFlag : included) {
            if (trueFlag) {
                answer += cnt == 0 ? a : a + (d * cnt);
            }
            cnt++;
        }

        System.out.println(answer);

        // 다른사람 풀이
        System.out.println(IntStream.range(0, included.length).map(idx -> included[idx] ? a + (idx * d) : 0).sum());

    }
}
