from collections import deque

n = int(input())
dq = deque()
for _ in range(n):
    op, *val = input().split()
    if op == 'append':
        dq.append(int(val[0]))
    elif op == 'pop':
        dq.pop()
    elif op == 'popleft':
        dq.popleft()
    elif op == 'appendleft':
        dq.appendleft(int(val[0]))
print(*dq)