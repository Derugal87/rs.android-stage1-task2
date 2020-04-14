package subtask5

import kotlin.reflect.KClass
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any  {

        return when(blockB){
            String::class -> {
                blockA.filterIsInstance<String>().joinToString ("")
            }
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                blockA.filterIsInstance<LocalDate>().max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> ""
        }
    }
}
