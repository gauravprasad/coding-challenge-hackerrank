def miniMaxSum(arr):
    s = sum(arr)
    print(s - max(arr),s - min(arr))

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)