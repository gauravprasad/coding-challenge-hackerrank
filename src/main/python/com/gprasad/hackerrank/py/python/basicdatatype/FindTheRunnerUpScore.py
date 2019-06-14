if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().rstrip().split())
    print(sorted(set(arr))[-2])