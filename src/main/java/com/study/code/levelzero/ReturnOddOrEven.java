package com.study.code.levelzero;

public class ReturnOddOrEven {
    /**
     * 홀짝에 따라 다른 값 반환하기
     *
     * 문제 설명
     * 양의 정수 n이 매개변수로 주어질 때,
     * n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
     * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는
     * solution 함수를 작성해 주세요.
     * @param args
     */
    public static void main(String[] args) {
        int n = 10;
        int result = 0;

        while(true) {
            if (n >= 0) {
                if (n % 2 == 1) {
                    result += n;
                    n = n - 2;
                } else {
                    result += n * n;
                    n = n - 2;
                }
            } else {
                break;
            }
        }
        System.out.println(result);
    }

    /**
     * 다른사람 풀이 
     * 스트림과 람다를 활용
     *
     * if(n%2 == 0) {
     *     return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
     * }
     * return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
     *
     *
     * */
}
