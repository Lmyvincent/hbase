// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SnapshotCleanup.proto

package org.apache.hadoop.hbase.protobuf.generated;

public final class SnapshotCleanupProtos {
  private SnapshotCleanupProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SnapshotCleanupStateOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool snapshot_cleanup_enabled = 1;
    /**
     * <code>required bool snapshot_cleanup_enabled = 1;</code>
     */
    boolean hasSnapshotCleanupEnabled();
    /**
     * <code>required bool snapshot_cleanup_enabled = 1;</code>
     */
    boolean getSnapshotCleanupEnabled();
  }
  /**
   * Protobuf type {@code hbase.pb.SnapshotCleanupState}
   */
  public static final class SnapshotCleanupState extends
      com.google.protobuf.GeneratedMessage
      implements SnapshotCleanupStateOrBuilder {
    // Use SnapshotCleanupState.newBuilder() to construct.
    private SnapshotCleanupState(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SnapshotCleanupState(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SnapshotCleanupState defaultInstance;
    public static SnapshotCleanupState getDefaultInstance() {
      return defaultInstance;
    }

    public SnapshotCleanupState getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SnapshotCleanupState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              snapshotCleanupEnabled_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.internal_static_hbase_pb_SnapshotCleanupState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.internal_static_hbase_pb_SnapshotCleanupState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.class, org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.Builder.class);
    }

    public static com.google.protobuf.Parser<SnapshotCleanupState> PARSER =
        new com.google.protobuf.AbstractParser<SnapshotCleanupState>() {
      public SnapshotCleanupState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SnapshotCleanupState(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SnapshotCleanupState> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool snapshot_cleanup_enabled = 1;
    public static final int SNAPSHOT_CLEANUP_ENABLED_FIELD_NUMBER = 1;
    private boolean snapshotCleanupEnabled_;
    /**
     * <code>required bool snapshot_cleanup_enabled = 1;</code>
     */
    public boolean hasSnapshotCleanupEnabled() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool snapshot_cleanup_enabled = 1;</code>
     */
    public boolean getSnapshotCleanupEnabled() {
      return snapshotCleanupEnabled_;
    }

    private void initFields() {
      snapshotCleanupEnabled_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSnapshotCleanupEnabled()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, snapshotCleanupEnabled_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, snapshotCleanupEnabled_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState other = (org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState) obj;

      boolean result = true;
      result = result && (hasSnapshotCleanupEnabled() == other.hasSnapshotCleanupEnabled());
      if (hasSnapshotCleanupEnabled()) {
        result = result && (getSnapshotCleanupEnabled()
            == other.getSnapshotCleanupEnabled());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasSnapshotCleanupEnabled()) {
        hash = (37 * hash) + SNAPSHOT_CLEANUP_ENABLED_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getSnapshotCleanupEnabled());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hbase.pb.SnapshotCleanupState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.internal_static_hbase_pb_SnapshotCleanupState_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.internal_static_hbase_pb_SnapshotCleanupState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.class, org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        snapshotCleanupEnabled_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.internal_static_hbase_pb_SnapshotCleanupState_descriptor;
      }

      public org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState build() {
        org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState result = new org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.snapshotCleanupEnabled_ = snapshotCleanupEnabled_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState.getDefaultInstance()) return this;
        if (other.hasSnapshotCleanupEnabled()) {
          setSnapshotCleanupEnabled(other.getSnapshotCleanupEnabled());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSnapshotCleanupEnabled()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.protobuf.generated.SnapshotCleanupProtos.SnapshotCleanupState) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool snapshot_cleanup_enabled = 1;
      private boolean snapshotCleanupEnabled_ ;
      /**
       * <code>required bool snapshot_cleanup_enabled = 1;</code>
       */
      public boolean hasSnapshotCleanupEnabled() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool snapshot_cleanup_enabled = 1;</code>
       */
      public boolean getSnapshotCleanupEnabled() {
        return snapshotCleanupEnabled_;
      }
      /**
       * <code>required bool snapshot_cleanup_enabled = 1;</code>
       */
      public Builder setSnapshotCleanupEnabled(boolean value) {
        bitField0_ |= 0x00000001;
        snapshotCleanupEnabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool snapshot_cleanup_enabled = 1;</code>
       */
      public Builder clearSnapshotCleanupEnabled() {
        bitField0_ = (bitField0_ & ~0x00000001);
        snapshotCleanupEnabled_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hbase.pb.SnapshotCleanupState)
    }

    static {
      defaultInstance = new SnapshotCleanupState(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.SnapshotCleanupState)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_SnapshotCleanupState_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hbase_pb_SnapshotCleanupState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SnapshotCleanup.proto\022\010hbase.pb\"8\n\024Sna" +
      "pshotCleanupState\022 \n\030snapshot_cleanup_en" +
      "abled\030\001 \002(\010BK\n*org.apache.hadoop.hbase.p" +
      "rotobuf.generatedB\025SnapshotCleanupProtos" +
      "H\001\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hbase_pb_SnapshotCleanupState_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hbase_pb_SnapshotCleanupState_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hbase_pb_SnapshotCleanupState_descriptor,
              new java.lang.String[] { "SnapshotCleanupEnabled", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
