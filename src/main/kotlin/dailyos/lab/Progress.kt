package dailyos.lab

fun completionPercent(done: Int, total: Int): Int =
    if (total == 0) 0 else (done * 100 / total).coerceIn(0, 100)

fun progressLabel(percent: Int): String = if (percent >= 100) "Terminé" else "En cours"

fun shortLabel(percent: Int): String = if (percent >= 100) "Done" else "$percent %"
