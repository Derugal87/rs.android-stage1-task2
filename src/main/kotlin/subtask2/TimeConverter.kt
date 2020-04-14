package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val timeArray = arrayOf(
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "quarter",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "half"
        )

        var h = hour.toInt()
        var m = minute.toInt()

        return when(m) {
            0 -> timeArray[h] + " o' clock"
            1 -> timeArray[0] + " minute to " + timeArray[h]
            15 -> timeArray[m] + " past " + timeArray[h]
            30 -> timeArray[m] + " past " + timeArray[h]
            in 2..29 -> timeArray[m] + " minutes past " + timeArray[h]
            59 -> timeArray[0] + " minute to " + timeArray[h + 1]
            45 -> timeArray[60 - m] + " to " + timeArray[h + 1]
            in 31..58 -> timeArray[60 - m] + " minutes to " + timeArray[h + 1]
            else -> ""
        }
    }
}
