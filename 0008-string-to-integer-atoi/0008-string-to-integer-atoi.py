class Solution:
    def myAtoi(self, s: str) -> int:
        i = 0
        n = len(s)

        while i < n and s[i] == ' ' :
            i += 1

        sign = 1
        if i < n and s[i] == '-':
            sign = -1
            i +=1

        elif i < n and s[i] == '+':
            i += 1

        number = 0
        while i<n and '0' <= s[i] <= '9':
            digit = ord(s[i]) - ord('0')
            number = number*10 + digit
            i += 1

        number = number * sign

        INT_MIN = -2**31
        INT_MAX = 2**31 - 1
        if number <INT_MIN:
            return INT_MIN

        if number > INT_MAX:
            return INT_MAX
        
        return number

        