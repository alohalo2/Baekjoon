class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) { // 배열에서 인접하지 않은 3개의 수를 더하기 위해 for문 3개 사용
            for (int j = i + 1; j < nums.length - 1; j++) { // 대신 i = 0, j = i + 1, k = j + 1 이런 식으로 중복 
                for (int k = j + 1; k < nums.length; k++) { // index를 제거함
                    sum = nums[i] + nums[j] + nums[k];
                    
                    if(isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i < num / 2; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}