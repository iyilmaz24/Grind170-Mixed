class Solution {
    int[] arr;

    public int climbStairs(int n) {
        if (n <= 2) return n;
        arr = new int[n];

        climbFunc(0, n-1);
        return arr[0];
    }

    public int climbFunc(int curr, int targ) {
        if (curr >= targ) return 1;

        if (arr[curr] != 0) return arr[curr];

        arr[curr] = climbFunc(curr + 1, targ) + climbFunc(curr + 2, targ);
        return arr[curr];
    }
}