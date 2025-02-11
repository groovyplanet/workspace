package quiz01;


import java.util.*;




class Solution {
    public int[] solution(int[] num_list) {
        StringBuilder sb = new StringBuilder();

        for(int num : num_list) {
            sb.append(num + " ");
        }
        sb.reverse();
        
        // 뒤집은 문자열에서 앞뒤 공백을 제거
        String[] x = sb.toString().trim().split(" ");

        int[] answer = Arrays.stream(x)
                            .mapToInt(Integer::parseInt)
                            .toArray();

        return answer;
    }
}


//문제 설명
//문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을
//return 하는 solution 함수를 완성해 주세요.