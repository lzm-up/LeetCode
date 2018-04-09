# -*- coding: utf-8 -*-

def longestPalindrome(s):
    start = 0
    end = 0
    for i in range(len(s)):
        len1 = expandAroundCenter(s,i,i)
        len2 = expandAroundCenter(s,i,i+1)

def expandAroundCenter(s,left,right):
    
    