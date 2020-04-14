package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val a1 = a.toUpperCase().toMutableList()
        val b1 = b.toMutableList()
        val newA1 = a1.intersect(b1).toMutableList()
            return when {
                (newA1 == b1) -> "YES"
                else -> "NO"
            }
    }
}
