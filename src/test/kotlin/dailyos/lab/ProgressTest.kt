package dailyos.lab

import kotlin.test.Test
import kotlin.test.assertEquals

class ProgressTest {
    @Test
    fun truncatesThePercentage() {
        assertEquals(85, completionPercent(done = 6, total = 7))
    }

    @Test
    fun emptyDayIsZeroPercent() {
        assertEquals(0, completionPercent(done = 0, total = 0))
    }
}
