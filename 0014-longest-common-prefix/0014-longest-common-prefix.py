class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        
        a=[]
        for i in zip(*strs):
           if all(j==i[0] for j in i):
            a.append(i[0])
           else:
            break
        return ''.join(a) 

        