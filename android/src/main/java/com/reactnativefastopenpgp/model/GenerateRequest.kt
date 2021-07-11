// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class GenerateRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : GenerateRequest {
        __init(_i, _bb)
        return this
    }
    val options : Options? get() = options(Options())
    fun options(obj: Options) : Options? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_2_0_0()
        fun getRootAsGenerateRequest(_bb: ByteBuffer): GenerateRequest = getRootAsGenerateRequest(_bb, GenerateRequest())
        fun getRootAsGenerateRequest(_bb: ByteBuffer, obj: GenerateRequest): GenerateRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createGenerateRequest(builder: FlatBufferBuilder, optionsOffset: Int) : Int {
            builder.startTable(1)
            addOptions(builder, optionsOffset)
            return endGenerateRequest(builder)
        }
        fun startGenerateRequest(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addOptions(builder: FlatBufferBuilder, options: Int) = builder.addOffset(0, options, 0)
        fun endGenerateRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
