package subtask2

    class MiniMaxSum {
        fun getResult(input: IntArray): IntArray {
            var min = input.sortedArray().dropLast(1).sum()
            var max = input.sortedArrayDescending().dropLast(1).sum()
            return intArrayOf(min,max)
        }
    }
