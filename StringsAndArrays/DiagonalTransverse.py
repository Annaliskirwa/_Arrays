# Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.


# solution from leetcode: Approach 1: Diagonal Iteration and Reversal

# Space complexity: O(min(N, M))
# Time complexity: O(N.M)



class Solution:
    
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        # Check for empty matrices
        if not matrix or not matrix[0]:
            return []
        
        # Variables to track the size of the matrix
        N, M = len(matrix), len(matrix[0])
        
        # The two arrays as explained in the algorithm
        result, intermediate = [], []
        
        # We have to go over all the elements in the first
        # row and the last column to cover all possible diagonals
        for d in range(N + M - 1):
            
            # Clear the intermediate array everytime we start
            # to process another diagonal
            intermediate.clear()
            
            # We need to figure out the "head" of this diagonal
            # The elements in the first row and the last column
            # are the respective heads.
            r, c = 0 if d < M else d - M + 1, d if d < M else M - 1
            
            # Iterate until one of the indices goes out of scope
            # Take note of the index math to go down the diagonal
            while r < N and c > -1:
                intermediate.append(matrix[r][c])
                r += 1
                c -= 1
            
            # Reverse even numbered diagonals. The
            # article says we have to reverse odd 
            # numbered articles but here, the numbering
            # is starting from 0 :P
            if d % 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        return result        




# Refactored code
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        N,M = len(matrix), len(matrix[0])
        
        result, intermediate = [], []
        
        for d in range(N+M-1):
            intermediate.clear()
            r, c = 0 if d < M else d -M+1, d if d < M else M-1
            
            while r < N and c > -1:
                intermediate.append(matrix[r][c])
                r +=1
                c -=1
                
            if d % 2 == 0:
                result.extend(intermediate[::-1])
            else:
                result.extend(intermediate)
        return result



# Approach 2: Using Simulation

# Space complexity: O(1)
# Time complexity: O(N.M)

# Simulation pseudo code for  finding the head of the next diagonal

# tail = [i, j]
# if direction == up, then {
#     if [i, j +1] is within bounds, then{
#         next_head  = [ i, j + 1]
#     }
#     else{
#         next_head =[ i+1, j]
#     }
# }
# else{
#     if [i+1, j] is within bounds, then{
#         next_head = [i +1, j]
#     }
#     else{
#         next_head = [i, j+1]
#     }
# }

# Solution

class Solution:
    def findDiagonalOrder(self,  matrix:List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []

        N, M = len(matrix), len(matrix[0])

        row, column = 0, 0

        direction = 1

        result = []

        while row < N and column < M:

            result.append(matrix[row][column])

            new_row = row + (-1 if direction ==1 else 1)

            new_column = column + (1 if direction == 1 else -1)

            if new_row < 0 or new_row == N or new_column < 0 or new_column == M:
                if direction:
                    row += (column == M-1)
                    column += (column < M-1)

                else:
                    column += (row == N -1)
                    row += (row < N - 1)

                direction = 1 - direction

            else:
                row = new_row
                column = new_column

        return result
