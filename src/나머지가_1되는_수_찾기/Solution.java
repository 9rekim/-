package 나머지가_1되는_수_찾기;

class Solution {
    public int solution(int n) {
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                return i;
            }
        }
        return n-1;
    }
}