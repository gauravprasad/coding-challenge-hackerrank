if __name__ == '__main__':
    n = int(input())
    list = []
    for _ in range(n):
        command, *valIndex = input().rstrip().split()
        if command == 'insert':
            list.insert(int(valIndex[0]), int(valIndex[1]))
        elif command == 'print':
            print(list)
        elif command == 'remove':
            list.remove(int(valIndex[0]))
        elif command == 'append':
            list.append(int(valIndex[0]))
        elif command == 'sort':
            list.sort()
        elif command == 'pop':
            list.pop()
        elif command == 'reverse':
            list.reverse()
