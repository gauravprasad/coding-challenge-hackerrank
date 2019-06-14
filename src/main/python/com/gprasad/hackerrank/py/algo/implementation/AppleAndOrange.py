def countApplesAndOranges(s, t, a, b, apples, oranges):
    applesCount = len([x for x in apples if (a + x) >= s and (a + x) <= t])
    orangesCount = len([x for x in oranges if (b + x) >= s and (b + x) <= t])
    print(str(applesCount) + '\n' + str(orangesCount))


if __name__ == '__main__':
    s, t = (map(int, input().rstrip().split()))
    a, b = (map(int, input().rstrip().split()))
    m, n = (map(int, input().rstrip().split()))
    apples = list(map(int, input().rstrip().split()))
    oranges = list(map(int, input().rstrip().split()))
    countApplesAndOranges(s, t, a, b, apples, oranges)
