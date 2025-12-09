class Solution(object):
    def searchRange(self, nums, target):
        def findLeft():
            i, j = 0, len(nums) - 1
            left = -1
            while i <= j:
                mid = (i + j) // 2
                if nums[mid] >= target:
                    j = mid - 1
                else:
                    i = mid + 1
                if nums[mid] == target:
                    left = mid
            return left
        
        def findRight():
            i, j = 0, len(nums) - 1
            right = -1
            while i <= j:
                mid = (i + j) // 2
                if nums[mid] <= target:
                    i = mid + 1
                else:
                    j = mid - 1
                if nums[mid] == target:
                    right = mid
            return right

        return [findLeft(), findRight()]
