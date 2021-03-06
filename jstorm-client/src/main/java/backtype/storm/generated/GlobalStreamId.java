/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalStreamId implements org.apache.thrift.TBase<GlobalStreamId, GlobalStreamId._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GlobalStreamId");

  private static final org.apache.thrift.protocol.TField COMPONENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("componentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STREAM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("streamId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private String componentId; // required
  private String streamId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPONENT_ID((short)1, "componentId"),
    STREAM_ID((short)2, "streamId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMPONENT_ID
          return COMPONENT_ID;
        case 2: // STREAM_ID
          return STREAM_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPONENT_ID, new org.apache.thrift.meta_data.FieldMetaData("componentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STREAM_ID, new org.apache.thrift.meta_data.FieldMetaData("streamId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GlobalStreamId.class, metaDataMap);
  }

  public GlobalStreamId() {
  }

  public GlobalStreamId(
    String componentId,
    String streamId)
  {
    this();
    this.componentId = componentId;
    this.streamId = streamId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GlobalStreamId(GlobalStreamId other) {
    if (other.is_set_componentId()) {
      this.componentId = other.componentId;
    }
    if (other.is_set_streamId()) {
      this.streamId = other.streamId;
    }
  }

  public GlobalStreamId deepCopy() {
    return new GlobalStreamId(this);
  }

  @Override
  public void clear() {
    this.componentId = null;
    this.streamId = null;
  }

  public String get_componentId() {
    return this.componentId;
  }

  public void set_componentId(String componentId) {
    this.componentId = componentId;
  }

  public void unset_componentId() {
    this.componentId = null;
  }

  /** Returns true if field componentId is set (has been assigned a value) and false otherwise */
  public boolean is_set_componentId() {
    return this.componentId != null;
  }

  public void set_componentId_isSet(boolean value) {
    if (!value) {
      this.componentId = null;
    }
  }

  public String get_streamId() {
    return this.streamId;
  }

  public void set_streamId(String streamId) {
    this.streamId = streamId;
  }

  public void unset_streamId() {
    this.streamId = null;
  }

  /** Returns true if field streamId is set (has been assigned a value) and false otherwise */
  public boolean is_set_streamId() {
    return this.streamId != null;
  }

  public void set_streamId_isSet(boolean value) {
    if (!value) {
      this.streamId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPONENT_ID:
      if (value == null) {
        unset_componentId();
      } else {
        set_componentId((String)value);
      }
      break;

    case STREAM_ID:
      if (value == null) {
        unset_streamId();
      } else {
        set_streamId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPONENT_ID:
      return get_componentId();

    case STREAM_ID:
      return get_streamId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPONENT_ID:
      return is_set_componentId();
    case STREAM_ID:
      return is_set_streamId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GlobalStreamId)
      return this.equals((GlobalStreamId)that);
    return false;
  }

  public boolean equals(GlobalStreamId that) {
    if (that == null)
      return false;

    boolean this_present_componentId = true && this.is_set_componentId();
    boolean that_present_componentId = true && that.is_set_componentId();
    if (this_present_componentId || that_present_componentId) {
      if (!(this_present_componentId && that_present_componentId))
        return false;
      if (!this.componentId.equals(that.componentId))
        return false;
    }

    boolean this_present_streamId = true && this.is_set_streamId();
    boolean that_present_streamId = true && that.is_set_streamId();
    if (this_present_streamId || that_present_streamId) {
      if (!(this_present_streamId && that_present_streamId))
        return false;
      if (!this.streamId.equals(that.streamId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_componentId = true && (is_set_componentId());
    builder.append(present_componentId);
    if (present_componentId)
      builder.append(componentId);

    boolean present_streamId = true && (is_set_streamId());
    builder.append(present_streamId);
    if (present_streamId)
      builder.append(streamId);

    return builder.toHashCode();
  }

  public int compareTo(GlobalStreamId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GlobalStreamId typedOther = (GlobalStreamId)other;

    lastComparison = Boolean.valueOf(is_set_componentId()).compareTo(typedOther.is_set_componentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_componentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.componentId, typedOther.componentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_streamId()).compareTo(typedOther.is_set_streamId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_streamId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.streamId, typedOther.streamId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // COMPONENT_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.componentId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // STREAM_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.streamId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.componentId != null) {
      oprot.writeFieldBegin(COMPONENT_ID_FIELD_DESC);
      oprot.writeString(this.componentId);
      oprot.writeFieldEnd();
    }
    if (this.streamId != null) {
      oprot.writeFieldBegin(STREAM_ID_FIELD_DESC);
      oprot.writeString(this.streamId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GlobalStreamId(");
    boolean first = true;

    sb.append("componentId:");
    if (this.componentId == null) {
      sb.append("null");
    } else {
      sb.append(this.componentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("streamId:");
    if (this.streamId == null) {
      sb.append("null");
    } else {
      sb.append(this.streamId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_componentId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'componentId' is unset! Struct:" + toString());
    }

    if (!is_set_streamId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'streamId' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

