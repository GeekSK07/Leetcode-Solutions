class Solution {
    static int thirdMax(int[] a)
    {
        int n = a.length;
        Arrays.sort(a);

        int idx = n - 1 , i , distinctCount = 0;

        while(idx >= 0)
        {
            distinctCount++;
            i = idx - 1;
           
            while(i >= 0 && a[i] == a[idx])
                i--;

            
            if(i == -1)
                return a[n - 1];
            idx = i;

            if(distinctCount == 2)
                return a[idx];
        }
        return -1;
    }
}
