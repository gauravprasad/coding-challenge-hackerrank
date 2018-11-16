#!/bin/python
from datetime import datetime
import sys


# time = raw_input().strip()
# print datetime.strptime(time, '%I:%M:%S%p').strftime('%H:%M:%S')

def timeConversion(s):
    return datetime.strptime(s, '%I:%M:%S%p').strftime('%H:%M:%S')


if __name__ == '__main__':
    s = input()
    result = timeConversion(s)
    print(result)