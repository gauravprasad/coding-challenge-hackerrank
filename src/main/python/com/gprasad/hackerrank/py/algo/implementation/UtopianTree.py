#!/bin/python

import sys

def getFinalLen(n):
    initLen = 1
    for i in range(n):
        if (i+1)%2!=0 : initLen=initLen*2
        else : initLen+=1
    return initLen


t = input()
for i in xrange(t):
    print getFinalLen(input())