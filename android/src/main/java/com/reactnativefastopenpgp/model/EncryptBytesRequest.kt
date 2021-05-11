// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class EncryptBytesRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : EncryptBytesRequest {
        __init(_i, _bb)
        return this
    }
    fun message(j: Int) : UByte {
        val o = __offset(4)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val messageLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    val messageAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(4, 1)
    fun messageInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 4, 1)
    fun mutateMessage(j: Int, message: UByte) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, message.toByte())
            true
        } else {
            false
        }
    }
    val publicKey : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val publicKeyAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun publicKeyInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    val options : KeyOptions? get() = options(KeyOptions())
    fun options(obj: KeyOptions) : KeyOptions? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val signed : Entity? get() = signed(Entity())
    fun signed(obj: Entity) : Entity? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val fileHints : FileHints? get() = fileHints(FileHints())
    fun fileHints(obj: FileHints) : FileHints? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsEncryptBytesRequest(_bb: ByteBuffer): EncryptBytesRequest = getRootAsEncryptBytesRequest(_bb, EncryptBytesRequest())
        fun getRootAsEncryptBytesRequest(_bb: ByteBuffer, obj: EncryptBytesRequest): EncryptBytesRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createEncryptBytesRequest(builder: FlatBufferBuilder, messageOffset: Int, publicKeyOffset: Int, optionsOffset: Int, signedOffset: Int, fileHintsOffset: Int) : Int {
            builder.startTable(5)
            addFileHints(builder, fileHintsOffset)
            addSigned(builder, signedOffset)
            addOptions(builder, optionsOffset)
            addPublicKey(builder, publicKeyOffset)
            addMessage(builder, messageOffset)
            return endEncryptBytesRequest(builder)
        }
        fun startEncryptBytesRequest(builder: FlatBufferBuilder) = builder.startTable(5)
        fun addMessage(builder: FlatBufferBuilder, message: Int) = builder.addOffset(0, message, 0)
        fun createMessageVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startMessageVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addPublicKey(builder: FlatBufferBuilder, publicKey: Int) = builder.addOffset(1, publicKey, 0)
        fun addOptions(builder: FlatBufferBuilder, options: Int) = builder.addOffset(2, options, 0)
        fun addSigned(builder: FlatBufferBuilder, signed: Int) = builder.addOffset(3, signed, 0)
        fun addFileHints(builder: FlatBufferBuilder, fileHints: Int) = builder.addOffset(4, fileHints, 0)
        fun endEncryptBytesRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}