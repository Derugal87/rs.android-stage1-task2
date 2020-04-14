package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        var abc = mutableSetOf<Char>()
        abc.addAll(inputString.toLowerCase().asIterable().filter { it in 'a'..'z' })
        val isPangram: Boolean = abc.size == 26
        val vowels = setOf('a','e','i','o','u','y')
        val vowReg = "[aeiouy]".toRegex()
        val consReg = "[bcdfghj-np-tvwxz]".toRegex()
        var parts = inputString.replace('\n', ' ').split(' ').filter { it -> it.isNotEmpty() } as MutableList
        for(i in parts.indices)
            parts[i] = if(isPangram) parts[i].count{ a -> vowels.contains(a.toLowerCase())}.toString() + vowReg.replace(parts[i]){m -> m.value.toUpperCase() }
            else parts[i].count{ a -> !vowels.contains(a.toLowerCase()) and (a.toLowerCase() in 'a'..'z')}.toString() + consReg.replace(parts[i]){m -> m.value.toUpperCase() }
        parts.sortWith(compareBy { it -> it[0] })
        return parts.joinToString(" ")
    }
}
