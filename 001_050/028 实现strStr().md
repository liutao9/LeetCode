# LeetCode 第二十八题 实现StrStr()
> 实现 strStr() 函数。  
> 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle   
> 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。  
> 示例 1:  
> 输入: haystack = "hello", needle = "ll"  
> 输出: 2  
> 示例 2:  
> 输入: haystack = "aaaaa", needle = "bba"  
> 输出: -1  

这道题目需要注意的是一些边缘数据，需要特别注意！
## Java
```
	public int strStr(String haystack, String needle) {
		if (needle.isEmpty())
			return 0;
		int i = 0, j = 0;
		for (i = 0; i <= haystack.length() - needle.length(); i++) {
			for (j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;
			}
			if (j == needle.length())
				return i;
		}
		return -1;
	}

```
## C++
```
class Solution
{
public:
    int strStr(string haystack, string needle)
    {
        if(needle.length()==0)return 0;
        int i,j;
        int len_1 = haystack.length();
        int len_2 = needle.length();
        for(i=0; i<=(len_1-len_2); i++)
        {
            for(j=0; j<needle.length(); j++)
            {
                if(haystack[i+j]!=needle[j])
                    break;
            }
            if(j==needle.length())
                return i;
        }
        return -1;
    }
};
```
### 在这里遇到了一个bug，调了半天才发现，十分奇怪：
```
int main()
{
    Solution s;
    string a="";
    string b = "a";
    cout<<a.length()<<endl;
    cout<<b.length()<<endl;
    cout<<a.length()-b.length()<<endl;
    return 0;
}
```
输出结果为：
```
0
1
4294967295
```
第三个输出不应该是：-1吗？于是又尝试着使用a.size()函数，结果还是一样的。其实string中的size()函数和length()函数作用一样。  
### 如果有同学知道我错在哪了，欢迎来指正！
