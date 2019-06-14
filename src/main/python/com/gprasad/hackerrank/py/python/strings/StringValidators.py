if __name__ == '__main__':
    s = input()
    print(s)
    print(list(map(s.isalnum(),s)))
    # print(any(list(map(s.isalnum(),s))))
    # print(any(list(map(s.isalpha(),s))))
    # print(any(list(map(s.isdigit(),s))))
    # print(any(list(map(s.islower(),s))))
    # print(any(list(map(s.isupper(),s))))