// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fmessage.proto

package com.appjishu.fpush.core.proto;

public interface FBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.appjishu.fpush.core.proto.FBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string collapseKey = 1;</code>
   */
  java.lang.String getCollapseKey();
  /**
   * <code>string collapseKey = 1;</code>
   */
  com.google.protobuf.ByteString
      getCollapseKeyBytes();

  /**
   * <code>string payload = 2;</code>
   */
  java.lang.String getPayload();
  /**
   * <code>string payload = 2;</code>
   */
  com.google.protobuf.ByteString
      getPayloadBytes();

  /**
   * <code>string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 notifyType = 5;</code>
   */
  int getNotifyType();

  /**
   * <code>int64 timeToLive = 6;</code>
   */
  long getTimeToLive();

  /**
   * <code>int32 passThrough = 7;</code>
   */
  int getPassThrough();

  /**
   * <code>int32 notifyId = 8;</code>
   */
  int getNotifyId();

  /**
   * <code>string restrictedPackageNames = 9;</code>
   */
  java.lang.String getRestrictedPackageNames();
  /**
   * <code>string restrictedPackageNames = 9;</code>
   */
  com.google.protobuf.ByteString
      getRestrictedPackageNamesBytes();

  /**
   * <code>string extra = 10;</code>
   */
  java.lang.String getExtra();
  /**
   * <code>string extra = 10;</code>
   */
  com.google.protobuf.ByteString
      getExtraBytes();

  /**
   * <code>string apsProperFields = 11;</code>
   */
  java.lang.String getApsProperFields();
  /**
   * <code>string apsProperFields = 11;</code>
   */
  com.google.protobuf.ByteString
      getApsProperFieldsBytes();

  /**
   * <code>int64 timeToSend = 12;</code>
   */
  long getTimeToSend();

  /**
   * <code>string msgId = 13;</code>
   */
  java.lang.String getMsgId();
  /**
   * <code>string msgId = 13;</code>
   */
  com.google.protobuf.ByteString
      getMsgIdBytes();
}
