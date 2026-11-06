package dailyos.lab

import kotlin.test.Test
import kotlin.test.assertEquals

class ProgressTest {
    @Test
    fun truncatesThePercentage() {
        assertEquals(86, completionPercent(done = 6, total = 7))
    }

    @Test
    fun emptyDayIsZeroPercent() {
        assertEquals(0, completionPercent(done = 0, total = 0))
    }

    @Test
    fun neverExceedsOneHundred() {
        assertEquals(100, completionPercent(done = 9, total = 7))
    }
}
