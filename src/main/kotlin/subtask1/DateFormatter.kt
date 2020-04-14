package subtask1

import java.util.Calendar
import java.util.GregorianCalendar
import java.util.Locale
import java.text.SimpleDateFormat
import java.lang.IllegalArgumentException

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        return try {
            val calendar = GregorianCalendar(Locale("ru"))
            calendar.set(Calendar.DAY_OF_MONTH, day.toInt())
            calendar.set(Calendar.MONTH, month.toInt()-1)
            calendar.set(Calendar.YEAR, year.toInt())
            calendar.isLenient = false
            val newDateFormat = SimpleDateFormat("dd MMMM, EEEE")
            newDateFormat.format(calendar.time)
            } catch (i: IllegalArgumentException){
            "Такого дня не существует" }
    }
}
