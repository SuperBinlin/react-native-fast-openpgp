// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * KeyOptions collects a number of parameters along with sensible defaults.
 */
@Suppress("unused")
@ExperimentalUnsignedTypes
class KeyOptions : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : KeyOptions {
        __init(_i, _bb)
        return this
    }
    /**
     * Hash is the default hash function to be used.
     * If zero, SHA-256 is used.
     */
    val hash : Int
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateHash(hash: Int) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putInt(o + bb_pos, hash)
            true
        } else {
            false
        }
    }
    /**
     * Cipher is the cipher to be used.
     * If zero, AES-128 is used.
     */
    val cipher : Int
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateCipher(cipher: Int) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putInt(o + bb_pos, cipher)
            true
        } else {
            false
        }
    }
    /**
     * Compression is the compression algorithm to be
     * applied to the plaintext before encryption. If zero, no
     * compression is done.
     */
    val compression : Int
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateCompression(compression: Int) : Boolean {
        val o = __offset(8)
        return if (o != 0) {
            bb.putInt(o + bb_pos, compression)
            true
        } else {
            false
        }
    }
    /**
     * CompressionLevel is the compression level to use. It must be set to
     * between -1 and 9, with -1 causing the compressor to use the
     * default compression level, 0 causing the compressor to use
     * no compression and 1 to 9 representing increasing (better,
     * slower) compression levels. If Level is less than -1 or
     * more then 9, a non-nil error will be returned during
     * encryption. See the constants above for convenient common
     * settings for Level.
     */
    val compressionLevel : Int
        get() {
            val o = __offset(10)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateCompressionLevel(compressionLevel: Int) : Boolean {
        val o = __offset(10)
        return if (o != 0) {
            bb.putInt(o + bb_pos, compressionLevel)
            true
        } else {
            false
        }
    }
    /**
     * RSABits is the number of bits in new RSA keys made with NewEntity.
     * If zero, then 2048 bit keys are created.
     */
    val rsaBits : Int
        get() {
            val o = __offset(12)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateRsaBits(rsaBits: Int) : Boolean {
        val o = __offset(12)
        return if (o != 0) {
            bb.putInt(o + bb_pos, rsaBits)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsKeyOptions(_bb: ByteBuffer): KeyOptions = getRootAsKeyOptions(_bb, KeyOptions())
        fun getRootAsKeyOptions(_bb: ByteBuffer, obj: KeyOptions): KeyOptions {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createKeyOptions(builder: FlatBufferBuilder, hash: Int, cipher: Int, compression: Int, compressionLevel: Int, rsaBits: Int) : Int {
            builder.startTable(5)
            addRsaBits(builder, rsaBits)
            addCompressionLevel(builder, compressionLevel)
            addCompression(builder, compression)
            addCipher(builder, cipher)
            addHash(builder, hash)
            return endKeyOptions(builder)
        }
        fun startKeyOptions(builder: FlatBufferBuilder) = builder.startTable(5)
        fun addHash(builder: FlatBufferBuilder, hash: Int) = builder.addInt(0, hash, 0)
        fun addCipher(builder: FlatBufferBuilder, cipher: Int) = builder.addInt(1, cipher, 0)
        fun addCompression(builder: FlatBufferBuilder, compression: Int) = builder.addInt(2, compression, 0)
        fun addCompressionLevel(builder: FlatBufferBuilder, compressionLevel: Int) = builder.addInt(3, compressionLevel, 0)
        fun addRsaBits(builder: FlatBufferBuilder, rsaBits: Int) = builder.addInt(4, rsaBits, 0)
        fun endKeyOptions(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}