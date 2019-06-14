if __name__ == '__main__':
    n = int(input())
    s = set(map(int, input().rstrip().split()))
    m = int(input())
    for _ in range(m):
        command, *number = input().rstrip().split()
        if command == 'pop':
            s.pop()
        elif command == 'remove':
            s.remove(int(number[0]))
        elif command == 'discard':
            s.discard(int(number[0]))
    print(sum(s))
