class Solution {
    public String multiply(String num1, String num2) {
    if(num1.equals("0") || num2.equals("0"))
            return "0";
        if(num1.length()>num2.length()){
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int num1_len = num1.length(), num2_len = num2.length();
        int res[] = new int[num1_len+num2_len];
        Arrays.fill(res, 0);
        for(int i=num1_len-1;i>=0;i--){
            for(int j=num2_len-1;j>=0;j--){
                int p1 = i+j, p2 = p1+1;
                int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + res[p2];
                res[p2] = sum%10;
                res[p1] += sum/10;
            }
        }
        String output = ""; int idx = -1;
        for(int i=0;i<num1_len+num2_len && res[i] == 0;i++)
            idx = i;
        for(int i=idx+1;i<num1_len+num2_len;i++)
            output += Integer.toString(res[i]);
        return output;
    }
}
