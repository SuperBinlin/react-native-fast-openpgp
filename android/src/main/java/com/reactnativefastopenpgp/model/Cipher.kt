// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

@Suppress("unused")
@ExperimentalUnsignedTypes
class Cipher private constructor() {
    companion object {
        const val AES128: Int = 0
        const val AES192: Int = 1
        const val AES256: Int = 2
        val names : Array<String> = arrayOf("AES128", "AES192", "AES256")
        fun name(e: Int) : String = names[e]
    }
}