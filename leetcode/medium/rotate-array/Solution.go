func rotate(nums []int, k int) {
	n := len(nums)
	if n == 0 || k%n == 0 {
		return
	}
	k %= n

	reverse := func(start, end int) {
		for start < end {
			nums[start], nums[end] = nums[end], nums[start]
			start++
			end--
		}
	}
	reverse(0, n-1)
	reverse(0, k-1)
	reverse(k, n-1)
}

