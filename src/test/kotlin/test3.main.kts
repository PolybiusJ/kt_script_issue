@file:Import("../../main/kotlin/Inst.kt")

import org.example.Inst

val inst = Inst()
inst.id = 100001
inst.name = "JetBrains"

println("kts test 3: ${inst.name}")