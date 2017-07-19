#!/bin/python

import sys

n = int(raw_input().strip())
arr = map(int,raw_input().strip().split(' '))
print float(len(filter(lambda x:x>0,arr)))/n
print float(len(filter(lambda x:x<0,arr)))/n
print float(len(filter(lambda x:x==0,arr)))/n