package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var fairlySplit = "bon appetit"
        var result = b - ((bill.toMutableList().sum() - bill.get(k)) / 2)
        if (result == 0) {
            return fairlySplit
        } else {
            return result.toString().toLowerCase()
        }
    }
}