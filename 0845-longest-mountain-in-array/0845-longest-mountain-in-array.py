class Solution:
    def longestMountain(self, arr: list[int]) -> int:
        n = len(arr)
        max_length = 0

        for i in range(1, n-1):
            
            if arr[i-1]< arr[i] > arr[i+1]:
                left = i
                right = i

                #move left
                while left>0 and arr[left]> arr[left-1]:
                    left -= 1

                #move right
                while right< n-1 and arr[right] > arr[right + 1]:
                    right += 1

                length = right - left + 1
                max_length = max(max_length, length)

        return max_length 

        
        