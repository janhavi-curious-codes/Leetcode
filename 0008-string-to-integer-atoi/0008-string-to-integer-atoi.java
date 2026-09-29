class Solution {
    public int myAtoi(String s) {
        int i =0;
        int n = s.length();

        while(i<n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i<n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if (i<n && s.charAt(i) == '+'){
            i++;
        }

        long limit;

        if (sign == 1) {
            limit = Integer.MAX_VALUE;
        } else {
            limit = (long) Integer.MAX_VALUE + 1;
        }

        long number = 0;

        // 4. Read digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            // Check overflow BEFORE number * 10 + digit
            if (number > (limit - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            number = number*10 + digit;
            i++;
        }
        number = number * sign;
        
        

        return (int) number;
    }
}