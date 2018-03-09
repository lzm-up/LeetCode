# -*- coding: utf-8 -*-
class ListNode(object):
    def __init__(self,val):
        self.val = val
        self.next = None
def buildNode(a):
    newNode = ListNode(0)
    first = None
    last = None
    for i in range(len(a)):
        newNode = ListNode(a[i])
        if first == None:
            first = newNode
            last = newNode
        else:
            last.next = newNode
            last = newNode
    return first        
def addTwoNumbers(l1,l2):
    Head = ListNode(0)
    p = l1
    q = l2
    curr = Head
    carry = 0
    while p!=None or q!=None:
        x = p!=None and p.val or 0
        y = q!=None and q.val or 0
        sum = x + y + carry
        carry = int(sum/10)
        curr.next = ListNode(sum%10)
        curr = curr.next
        if p!=None:
            p = p.next
        if q!=None:
            q = q.next
    if carry>0:
        curr.next = ListNode(carry)
    return Head.next;
a = [3,4,2]
b = [4,6,5]
l1 = buildNode(a)
l2 = buildNode(b)
print(addTwoNumbers(l1,l2).val)