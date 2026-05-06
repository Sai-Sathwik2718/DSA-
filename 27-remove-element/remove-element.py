class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        for i in nums:
            if i==val:
                nums.remove(i),nums.append(i)
        count=0
        for i in nums:
            if i!=val:
                count+=1
        return count