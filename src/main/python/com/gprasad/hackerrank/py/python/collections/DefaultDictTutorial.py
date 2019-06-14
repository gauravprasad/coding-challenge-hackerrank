from collections import defaultdict

a, b = tuple(map(int, input().split()))
dd = defaultdict(list)
for i in range(a):
    dd[input()].append(str(i+1))
print(dd)
for _ in range(b):
    bVal = input()
    print(' '.join(dd[bVal])) if dd.get(bVal)!= None else print(-1)