#include <iostream>

using namespace std;


struct ListNode
{
    ListNode(int x):val(x),next(NULL) {};
    int val;
    ListNode *next;
};

class Solution
{
public:
    ListNode *addTwoNumbers(ListNode *l1, ListNode *l2)
    {
        ListNode preHead(0), *p = &preHead;
        int carry = 0;            ///carry的作用：记录两个链表相加后的高位（进位）；
        while(l1||l2||carry)
        {
            int sum = (l1?l1->val:0)+(l2?l2->val:0)+(carry);
            carry = sum/10;
            p->next = new ListNode(sum%10);
            p = p->next;
            l1 = l1?l1->next:l1;
            l2 = l2?l2->next:l2;
        }
        return preHead.next;
    }
};

void print_list(ListNode *p)
{
    while(p!=NULL)
    {
        cout<<p->val<<" ";
        p = p->next;
    }
    cout<<endl;
}

int main()
{
    ListNode *l1=new ListNode(2);
    ListNode *temp_list_1=new ListNode(3);
    ListNode *temp_list_2=new ListNode(5);
    ListNode *temp_list_3=new ListNode(9);
    ListNode *temp_list_4=new ListNode(9);
    l1->next = temp_list_1;
    temp_list_1->next = temp_list_2;
    temp_list_2->next = temp_list_3;
    temp_list_3->next = temp_list_4;


    ListNode *l2=new ListNode(3);
    ListNode *temp_list_5=new ListNode(7);
    ListNode *temp_list_6=new ListNode(9);
    l2->next = temp_list_5;
    temp_list_5->next = temp_list_6;

    Solution s;
    print_list(l1);
    print_list(l2);
    print_list(s.addTwoNumbers(l1, l2));


    return 0;
}
