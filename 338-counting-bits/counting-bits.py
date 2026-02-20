class Solution:
    def countBits(self, n: int) -> List[int]:
        z=[]
        for  i in range(0,n+1):

            a=list(bin(i))
            b=a.count('1')
            z.append(b)
        return z
