def solution(a, b, c, d):
    answer = 0
    s = [a,b,c,d]
    s.sort()
    
    if s[0] == s[3]:
        answer= s[0]*1111
    elif s[1] == s[3] or s[0] == s[2]:
        answer= (10*s[2]+(s[0]+s[3]-s[2]))**2
    elif s[0]==s[1] and s[2]==s[3]:
        answer= (s[3]+s[1])*(s[3]-s[1])
    elif s[0]==s[1] and s[2]!=s[3]:
        answer=s[2]*s[3]
    elif s[1]==s[2] and s[0]!=s[3]:
        answer=s[0]*s[3]
    elif s[2]==s[3] and s[0]!=s[1]:
        answer=s[0]*s[1]
    else:
        answer= s[0]
    return answer
#자바로 한번 풀다가 해볼만은 한데 뭔가 계속 안 풀려서 힌트보고 대충 이런 식이
#구나 한 다음에 복습 겸으로 파이썬으로 바꿔서 한번 풀었다.. 