package subtask1
class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var index = 1
        val someList = sadArray.toMutableList()
        while (index < someList.size - 1) {
            if ( index != 0 && someList[index] > someList[index + 1] + someList[index - 1]) {
                someList.removeAt(index)
                index --}
                 else {
                index ++}

        }
                  return someList.toIntArray()
    }
}






