from collections import Counter


if __name__ == '__main__':
    x = int(input())
    shoeSizes = list(map(int, input().rstrip().split()))
    n = int(input())
    shoeSizesCount = dict(Counter(shoeSizes))
    earning = 0
    for _ in range(n):
        size, price = tuple(map(int, input().split()))
        if shoeSizesCount.get(size) != None and shoeSizesCount.get(size) !=0:
            earning += price
            shoeSizesCount[size] = shoeSizesCount.get(size) - 1
    print(earning)

