#!/bin/python

import sys
import math

def getWholeSquareCount(start, end):
    return int(math.floor(math.sqrt(end))-math.ceil(math.sqrt(start))+1)

testCase = input()
for i in range(testCase):
    start,end = raw_input().strip().split(' ')
    print getWholeSquareCount(int(start),int(end))


