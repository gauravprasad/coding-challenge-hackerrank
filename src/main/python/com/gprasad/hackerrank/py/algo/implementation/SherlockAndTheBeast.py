#!/bin/python

import sys

def decentNum(n):
    count3=0
    count5=0
    while(count3<=n):
        count5=n-count3
        if count5%3==0:return '5'*count5+'3'*count3
        count3+=5
    return '-1'


t = input()
for a0 in xrange(t):
   print(decentNum(input()))


