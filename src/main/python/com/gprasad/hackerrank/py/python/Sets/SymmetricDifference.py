if __name__ == '__main__':
    s1s = int(input())
    s1 = set(map(int, input().rstrip().split()))
    s2s = int(input())
    s2 = set(map(int, input().rstrip().split()))
    d1 = s1.difference(s2)
    d2 = s2.difference(s1)
    print("\n".join(sorted(list(map(str, d1.union(d2))), key=int)))

