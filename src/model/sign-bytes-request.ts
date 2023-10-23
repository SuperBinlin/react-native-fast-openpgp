// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { KeyOptions } from '../model/key-options';


export class SignBytesRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):SignBytesRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsSignBytesRequest(bb:flatbuffers.ByteBuffer, obj?:SignBytesRequest):SignBytesRequest {
  return (obj || new SignBytesRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsSignBytesRequest(bb:flatbuffers.ByteBuffer, obj?:SignBytesRequest):SignBytesRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new SignBytesRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

message(index: number):number|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.readUint8(this.bb!.__vector(this.bb_pos + offset) + index) : 0;
}

messageLength():number {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? this.bb!.__vector_len(this.bb_pos + offset) : 0;
}

messageArray():Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? new Uint8Array(this.bb!.bytes().buffer, this.bb!.bytes().byteOffset + this.bb!.__vector(this.bb_pos + offset), this.bb!.__vector_len(this.bb_pos + offset)) : null;
}

privateKey():string|null
privateKey(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
privateKey(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 8);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

passphrase():string|null
passphrase(optionalEncoding:flatbuffers.Encoding):string|Uint8Array|null
passphrase(optionalEncoding?:any):string|Uint8Array|null {
  const offset = this.bb!.__offset(this.bb_pos, 10);
  return offset ? this.bb!.__string(this.bb_pos + offset, optionalEncoding) : null;
}

options(obj?:KeyOptions):KeyOptions|null {
  const offset = this.bb!.__offset(this.bb_pos, 12);
  return offset ? (obj || new KeyOptions()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startSignBytesRequest(builder:flatbuffers.Builder) {
  builder.startObject(5);
}

static addMessage(builder:flatbuffers.Builder, messageOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, messageOffset, 0);
}

static createMessageVector(builder:flatbuffers.Builder, data:number[]|Uint8Array):flatbuffers.Offset {
  builder.startVector(1, data.length, 1);
  for (let i = data.length - 1; i >= 0; i--) {
    builder.addInt8(data[i]!);
  }
  return builder.endVector();
}

static startMessageVector(builder:flatbuffers.Builder, numElems:number) {
  builder.startVector(1, numElems, 1);
}

static addPrivateKey(builder:flatbuffers.Builder, privateKeyOffset:flatbuffers.Offset) {
  builder.addFieldOffset(2, privateKeyOffset, 0);
}

static addPassphrase(builder:flatbuffers.Builder, passphraseOffset:flatbuffers.Offset) {
  builder.addFieldOffset(3, passphraseOffset, 0);
}

static addOptions(builder:flatbuffers.Builder, optionsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(4, optionsOffset, 0);
}

static endSignBytesRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

}
