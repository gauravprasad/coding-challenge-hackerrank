from collections import namedtuple

n = int(input())
StudentDetails = namedtuple('StudentDetails', input().split())
print(sum(list(int(StudentDetails._make(input().split()).MARKS) for _ in range(n)))/n)
