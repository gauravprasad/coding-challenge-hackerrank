def getSecondhighest(d):
    key = sorted(set(d.keys()))[1]
    print('\n'.join(sorted(d[key])))

if __name__ == '__main__':
    n = int(input())
    d = {}
    for _ in range(n):
        name = input()
        score = float(input())
        if d.get(score) == None:
            d[score] = [name]
        else:
            d.get(score).append(name)
    getSecondhighest(d)

