package dailyos.lab

fun completionPercent(done: Int, total: Int): Int =
    if (total == 0) 0 else (done * 100 / total).coerceIn(0, 100)
