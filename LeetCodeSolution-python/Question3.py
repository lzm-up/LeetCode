# -*- coding: utf-8 -*-
def lengthOfLongestSubstring(s):
    n = len(s)
    i = 0
    j = 0
    ans = 0
    se = set()
    while i<n and j<n:
        if(not(s[j] in se)):
            se.add(s[j])
            j+=1
            ans = max(ans,j-i)
        else:
            se.remove(s[i])
            i+=1
    return ans
            

s = 'abcabcbb'
print(lengthOfLongestSubstring(s))

