#!/bin/python

import sys

def getCount(num):
    strNum = str(num)
    return len(filter(lambda y: y!=0 and num%y==0,list(map(lambda x: int(x),strNum))))


t = input()
for a0 in xrange(t):
    print getCount(input())

