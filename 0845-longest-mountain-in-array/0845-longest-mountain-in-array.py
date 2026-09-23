class Solution:
    def longestMountain(self, arr: list[int]) -> int:
        up =0
        down=0
        max_length = 0

        for i in range(1, len(arr) ):
            if arr[i]> arr[i-1]:
                if down> 0:
                    up = 1
                else:
                    up +=1

                down = 0

            elif arr[i]< arr[i-1]:
                if up>0:
                    down += 1
                    max_length =max(max_length, up+down+1)

                else:
                    down=0
            
            else:
                up = 0
                down = 0

        return max_length

     

        
        