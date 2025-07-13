func check(nums []int) bool {
	count := 0
	n := len(nums)

	for i := 0; i < n; i++ {
		if nums[i] > nums[(i+1)%n] {
			count++
			if count > 1 {
				return false
			}
		}
	}
	return true
}
