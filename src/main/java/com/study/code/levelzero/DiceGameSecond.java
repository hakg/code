package com.study.code.levelzero;

public class DiceGameSecond {
    /**
     * 주사위게임 2
     *
     * 문제 설명
     * 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
     *
     * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
     * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
     * 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
     * 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int result = 0;

        if (a == b && a == c) {
            result = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) * ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3));
        } else if (((a == b || a == c) && b != c) || ((b == a || b == c) && a != c)) {
            result = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
        } else {
            result = a + b + c;
        }

        System.out.println(result);


        // 다른사람 풀이
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i) + pow(b,i) + pow(c,i));
        }

    }

    private static int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}
