class Solution {
    // Solution 2: Iteration (One Pass)
    public int[] getConcatenation(int[] numbers) {
        int length = numbers.length;
        int[] result = new int[2 * length];
        for(int i =0; i < length;i++){
            result[i] = result[i + length] = numbers[i];
        }
        return result;
    }
}