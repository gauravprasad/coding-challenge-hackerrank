import math
import os
import random
import re
import sys

def diagonalDifference(arr, n):
    ld = sum(arr[i][i] for i in range(n))
    rd = sum(arr[i][n-i-1] for i in range(n))
    return  abs(ld-rd)

if __name__ == '__main__':

    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr, n)
    print(result)

    # fptr.write(str(result) + '\n')
    #
    # fptr.close()