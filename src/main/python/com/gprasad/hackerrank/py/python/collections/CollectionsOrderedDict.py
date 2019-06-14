from collections import OrderedDict

n = int(input())
od = OrderedDict()
for _ in range(n):
    item, space, price = input().rpartition(' ')
    od[item] = od.get(item,0)+int(price)
for i in od:
    print(i, od[i])