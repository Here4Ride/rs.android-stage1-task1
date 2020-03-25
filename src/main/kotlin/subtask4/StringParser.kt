package subtask4
class StringParser {
    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val filtered = arrayListOf<String>()
        for (i in inputString.indices) {
            when {
                inputString[i] == '<' -> filtered.add(makeString(inputString.substring(i),'<', '>'))
                inputString[i] == '(' -> filtered.add(makeString(inputString.substring(i),'(', ')'))
                inputString[i] == '[' -> filtered.add(makeString(inputString.substring(i),'[', ']'))
            }
        }
        return filtered.toTypedArray()
    }


    fun makeString(string: String, start: Char, end: Char): String {
        var count = 0
        var got = ""
        for (i in 1 until string.length) {
            if (string[i] == start) {
                count++
            }
             if (string[i] == end && count != 0) {
                count--
            }
             else if (string[i] == end && count == 0) {
                got = string.substring(1, i)
                break
            }


        }
        return got
    }
}


