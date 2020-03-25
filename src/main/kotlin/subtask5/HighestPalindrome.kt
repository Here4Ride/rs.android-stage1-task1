package rsTask.subtask5

class HighestPalindrome {


    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var stringLenght = n
        var changes = k
        var counter = result(digitString)
        var palidrom = digitString.toCharArray()
        for (i in 0 until stringLenght / 2) {
            var left = palidrom[i]
            var right = palidrom[palidrom.size - 1 - i]
            if (left != right) {
                when {
                    changes > counter -> {
                        left = '9'
                        right = '9'
                        changes-=2
                    }
                    counter >  changes -> {
                        if (left.toInt() > right.toInt()) {
                            right = left
                        } else {
                            left = right
                        }
                    }
                    else -> return "-1"
                }
            }
        }
        return palidrom.joinToString("")
    }

    private fun result (digitString: String): Int {
        var count : Int = 0
        for (i in 0 until digitString.length / 2) {
            var first = digitString[i]
            var second = digitString[digitString.length - 1 - i]
            if (first != second)
                count++
        }
        return count
    }
}
