class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        ptrHead = ListNode(0)
        p = ptrHead
        carry = 0
        while((l1 is not None) or (l2 is not None) or carry != 0):
            sum = (l1.val if (l1 is not None) else 0) + (l2.val if (l2 is not None) else 0) + carry
            carry = int(sum/10)
            p.next = ListNode(sum % 10)
            p = p.next
            l1 = l1.next if l1 is not None else l1
            l2 = l2.next if l2 is not None else l2
        return ptrHead.next

    def print_list(self, l):
        while(l is not None):
            print(l.val)
            l = l.next

l1 = ListNode(2)
temp_1 = ListNode(3)
temp_2 = ListNode(5)
temp_3 = ListNode(9)
temp_4 = ListNode(9)
l1.next = temp_1
temp_1.next = temp_2
temp_2.next = temp_3
temp_3.next = temp_4
#Solution().print_list(l1)

l2 = ListNode(3)
temp_5 = ListNode(7)
temp_6 = ListNode(9)
l2.next = temp_5
temp_5.next = temp_6
#Solution().print_list(l2)

l = Solution().addTwoNumbers(l1, l2)
Solution().print_list(l)


