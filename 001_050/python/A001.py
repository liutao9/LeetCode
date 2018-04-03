class Solution:
    def twoSum(self, nums, target):
        result = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i]+nums[j] == target:
                    result.append(i)
                    result.append(j)
                    return result

print(Solution().twoSum([2, 7, 13, 15], 9))
#print(Solution.twoSum([2, 7, 13, 15], 9))       ###带括号和不带括号是有差别的。
                                                 ###带括号就是实例化一个类的对象，直接使用对象中的方法。