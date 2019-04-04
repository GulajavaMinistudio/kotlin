/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.collections

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.js.*
import kotlin.ranges.contains
import kotlin.ranges.reversed

/**
 * Reverses elements in the list in-place.
 */
public actual fun <T> MutableList<T>.reverse(): Unit {
    val midPoint = (size / 2) - 1
    if (midPoint < 0) return
    var reverseIndex = lastIndex
    for (index in 0..midPoint) {
        val tmp = this[index]
        this[index] = this[reverseIndex]
        this[reverseIndex] = tmp
        reverseIndex--
    }
}

