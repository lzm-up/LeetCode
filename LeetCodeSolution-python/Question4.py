# -*- coding: utf-8 -*-

def findMedianSortedArrays(nums1,nums2):
    n = len(nums1)
    m = len(nums2)
    num = []
    for i in range(m+n):
        if i<n:
            num.append(nums1[i])
        else:
            num.append(nums2[i-n])
    num.sort()
    if((m+n)%2 == 0):
        return (num[int((m+n)/2)]+num[int((m+n)/2-1)])/2
    else:
        return num[(m+n-1)/2]
nums1 = [1,3]
nums2 = [2,4]
print(findMedianSortedArrays(nums1,nums2))

    