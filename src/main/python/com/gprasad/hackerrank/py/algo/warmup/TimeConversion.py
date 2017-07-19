#!/bin/python
from datetime import *
import sys


time = raw_input().strip()
print datetime.strptime(time, '%I:%M:%S%p').strftime('%H:%M:%S')