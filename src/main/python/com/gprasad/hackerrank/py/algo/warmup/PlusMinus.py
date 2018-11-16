#!/bin/python

import sys

# n = int(input())
# arr = [map(int,input().strip().split(' '))]
# print(float(len(filter(lambda x:x>0,arr)))/n)
# print(float(len(filter(lambda x:x<0,arr)))/n)
# print(float(len(filter(lambda x:x==0,arr)))/n)

def plusMinus(arr,n):

    print(len([x for x in arr if x > 0])/n)
    print(len([x for x in arr if x < 0])/n)
    print(len([x for x in arr if x == 0])/n)

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr,n)
