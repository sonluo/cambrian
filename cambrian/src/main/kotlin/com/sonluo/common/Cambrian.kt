package com.sonluo.common

class Cambrian {

    fun hello() {
        println(
            GREETING + SIGNATURE + POWERED_BY
        )
    }

    private companion object {

        const val LINE_WIDTH = 80

        val NEW_LINE = System.lineSeparator() ?: "\n"

        val signatures = arrayOf(
            "Fred Suvn",
            "2019-01-09",
            "0.0.0"
        )

        val GREETING = """
            Cambrian is a common lib for kotlin.
        """.trimIndent()

        val SIGNATURE = {
            val stringBuilder = StringBuilder()
            for (signature in signatures) {
                stringBuilder
                    .append(NEW_LINE)
                    .append(signature.padStart(LINE_WIDTH, ' '))
            }
            stringBuilder.toString()
        }.invoke()


        private const val SUVN = "suvn.org"
        val POWERED_BY = NEW_LINE + NEW_LINE + SUVN.padStart(LINE_WIDTH, ' ')
    }
}