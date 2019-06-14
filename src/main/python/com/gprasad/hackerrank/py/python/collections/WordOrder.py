from collections import OrderedDict

n = int(input())
od = OrderedDict()
for _ in range(n):
    word = input()
    od[word] = od.get(word,0) + 1
print(len(od))
print(' '.join(map(str, od.values())))