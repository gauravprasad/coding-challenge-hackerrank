if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *lines = input().rstrip().split()
        scores = list(map(float, lines))
        student_marks[name] = scores
    scores = student_marks[input()]
    print("%.2f" % (sum(scores)/len(scores)))

