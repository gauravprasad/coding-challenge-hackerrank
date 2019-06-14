
def gradingStudents(grades):
    updatedGrade = []
    for x in grades:
        if x >=38 and x%5 > 2:
            updatedGrade.append(str(((x // 5) + 1 ) * 5))
        else:
            updatedGrade.append(str(x))
    return updatedGrade

if __name__ == '__main__':
    n = int(input())
    grades = []
    for _ in range(n):
        grades_item = int(input())
        grades.append(grades_item)
    result = gradingStudents(grades)
    print('\n'.join(result))