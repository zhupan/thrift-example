/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.thrift.generated;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.*;

public class User implements org.apache.thrift.TBase<User, User._Fields>, java.io.Serializable, Cloneable, Comparable<User> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("User");

    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short) 1);
    private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short) 3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new UserStandardSchemeFactory());
        schemes.put(TupleScheme.class, new UserTupleSchemeFactory());
    }

    public int id; // required
    public String username; // required
    public String password; // required

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ID((short) 1, "id"),
        USERNAME((short) 2, "username"),
        PASSWORD((short) 3, "password");

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
            switch (fieldId) {
                case 1: // ID
                    return ID;
                case 2: // USERNAME
                    return USERNAME;
                case 3: // PASSWORD
                    return PASSWORD;
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
    private static final int __ID_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(User.class, metaDataMap);
    }

    public User() {
    }

    public User(
            int id,
            String username,
            String password) {
        this();
        this.id = id;
        setIdIsSet(true);
        this.username = username;
        this.password = password;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public User(User other) {
        __isset_bitfield = other.__isset_bitfield;
        this.id = other.id;
        if (other.isSetUsername()) {
            this.username = other.username;
        }
        if (other.isSetPassword()) {
            this.password = other.password;
        }
    }

    public User deepCopy() {
        return new User(this);
    }

    @Override
    public void clear() {
        setIdIsSet(false);
        this.id = 0;
        this.username = null;
        this.password = null;
    }

    public int getId() {
        return this.id;
    }

    public User setId(int id) {
        this.id = id;
        setIdIsSet(true);
        return this;
    }

    public void unsetId() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
    }

    /**
     * Returns true if field id is set (has been assigned a value) and false otherwise
     */
    public boolean isSetId() {
        return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
    }

    public void setIdIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
    }

    public String getUsername() {
        return this.username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public void unsetUsername() {
        this.username = null;
    }

    /**
     * Returns true if field username is set (has been assigned a value) and false otherwise
     */
    public boolean isSetUsername() {
        return this.username != null;
    }

    public void setUsernameIsSet(boolean value) {
        if (!value) {
            this.username = null;
        }
    }

    public String getPassword() {
        return this.password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public void unsetPassword() {
        this.password = null;
    }

    /**
     * Returns true if field password is set (has been assigned a value) and false otherwise
     */
    public boolean isSetPassword() {
        return this.password != null;
    }

    public void setPasswordIsSet(boolean value) {
        if (!value) {
            this.password = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((Integer) value);
                }
                break;

            case USERNAME:
                if (value == null) {
                    unsetUsername();
                } else {
                    setUsername((String) value);
                }
                break;

            case PASSWORD:
                if (value == null) {
                    unsetPassword();
                } else {
                    setPassword((String) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ID:
                return Integer.valueOf(getId());

            case USERNAME:
                return getUsername();

            case PASSWORD:
                return getPassword();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ID:
                return isSetId();
            case USERNAME:
                return isSetUsername();
            case PASSWORD:
                return isSetPassword();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof User)
            return this.equals((User) that);
        return false;
    }

    public boolean equals(User that) {
        if (that == null)
            return false;

        boolean this_present_id = true;
        boolean that_present_id = true;
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id))
                return false;
            if (this.id != that.id)
                return false;
        }

        boolean this_present_username = true && this.isSetUsername();
        boolean that_present_username = true && that.isSetUsername();
        if (this_present_username || that_present_username) {
            if (!(this_present_username && that_present_username))
                return false;
            if (!this.username.equals(that.username))
                return false;
        }

        boolean this_present_password = true && this.isSetPassword();
        boolean that_present_password = true && that.isSetPassword();
        if (this_present_password || that_present_password) {
            if (!(this_present_password && that_present_password))
                return false;
            if (!this.password.equals(that.password))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(User other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetUsername()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPassword()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User(");
        boolean first = true;

        sb.append("id:");
        sb.append(this.id);
        first = false;
        if (!first) sb.append(", ");
        sb.append("username:");
        if (this.username == null) {
            sb.append("null");
        } else {
            sb.append(this.username);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("password:");
        if (this.password == null) {
            sb.append("null");
        } else {
            sb.append(this.password);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
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
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class UserStandardSchemeFactory implements SchemeFactory {
        public UserStandardScheme getScheme() {
            return new UserStandardScheme();
        }
    }

    private static class UserStandardScheme extends StandardScheme<User> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, User struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.id = iprot.readI32();
                            struct.setIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // USERNAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.username = iprot.readString();
                            struct.setUsernameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // PASSWORD
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.password = iprot.readString();
                            struct.setPasswordIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, User struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(ID_FIELD_DESC);
            oprot.writeI32(struct.id);
            oprot.writeFieldEnd();
            if (struct.username != null) {
                oprot.writeFieldBegin(USERNAME_FIELD_DESC);
                oprot.writeString(struct.username);
                oprot.writeFieldEnd();
            }
            if (struct.password != null) {
                oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
                oprot.writeString(struct.password);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class UserTupleSchemeFactory implements SchemeFactory {
        public UserTupleScheme getScheme() {
            return new UserTupleScheme();
        }
    }

    private static class UserTupleScheme extends TupleScheme<User> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetId()) {
                optionals.set(0);
            }
            if (struct.isSetUsername()) {
                optionals.set(1);
            }
            if (struct.isSetPassword()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetId()) {
                oprot.writeI32(struct.id);
            }
            if (struct.isSetUsername()) {
                oprot.writeString(struct.username);
            }
            if (struct.isSetPassword()) {
                oprot.writeString(struct.password);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, User struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.id = iprot.readI32();
                struct.setIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.username = iprot.readString();
                struct.setUsernameIsSet(true);
            }
            if (incoming.get(2)) {
                struct.password = iprot.readString();
                struct.setPasswordIsSet(true);
            }
        }
    }

}

