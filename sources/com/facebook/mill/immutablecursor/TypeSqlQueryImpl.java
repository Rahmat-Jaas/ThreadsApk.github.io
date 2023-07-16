package com.facebook.mill.immutablecursor;

import X.AnonymousClass6HF;
import X.AnonymousClass735;
import X.AnonymousClass736;
import X.C04220Ms;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.simplejni.NativeHolder;
import kotlin.Unit;

public final class TypeSqlQueryImpl implements TypeSqlQuery {
    public static final AnonymousClass6HF Companion = new AnonymousClass6HF();
    public static final int SQLITE_BLOB = 4;
    public static final int SQLITE_FLOAT = 2;
    public static final int SQLITE_INTEGER = 1;
    public static final int SQLITE_NULL = 5;
    public static final int SQLITE_TEXT = 3;
    public byte[] columnTypes;
    public NativeHolder mNativeHolder;
    public int size = -1;

    public TypeSqlQueryImpl(NativeHolder nativeHolder) {
        C04220Ms.A0B(nativeHolder, 1);
        this.mNativeHolder = nativeHolder;
        AnonymousClass736.A00();
        AnonymousClass735.A00();
    }

    private final native int getSize();

    private final native boolean isNull(int i);

    public native void close();

    public native byte[] getBlob(int i);

    public native boolean getBoolean(int i);

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public native String getString(int i);

    public native int getType(int i);

    public native boolean next();

    public native void resetPosition();

    public void setColumnTypes(byte[] bArr) {
        C04220Ms.A0B(bArr, 0);
        this.columnTypes = bArr;
    }

    public byte[] getColumnTypes() {
        byte[] bArr = this.columnTypes;
        if (bArr != null) {
            return bArr;
        }
        C04220Ms.A0E("columnTypes");
        throw null;
    }

    public int getCount() {
        int i = this.size;
        if (i != -1) {
            return i;
        }
        int size2 = getSize();
        this.size = size2;
        return size2;
    }

    public Object getAny(int i) {
        int type = getType(i);
        if (type == 1) {
            return Integer.valueOf(getInt(i));
        }
        if (type == 2) {
            return Float.valueOf(getFloat(i));
        }
        if (type == 4) {
            return getBlob(i);
        }
        if (type != 5) {
            return getString(i);
        }
        return Unit.A00;
    }

    public Object getNullableAny(int i) {
        if (isNull(i)) {
            return null;
        }
        return getAny(i);
    }

    public byte[] getNullableBlob(int i) {
        if (isNull(i)) {
            return null;
        }
        return getBlob(i);
    }

    public Boolean getNullableBoolean(int i) {
        if (isNull(i)) {
            return null;
        }
        return Boolean.valueOf(getBoolean(i));
    }

    public Double getNullableDouble(int i) {
        if (isNull(i)) {
            return null;
        }
        return Double.valueOf(getDouble(i));
    }

    public Float getNullableFloat(int i) {
        if (isNull(i)) {
            return null;
        }
        return Float.valueOf(getFloat(i));
    }

    public Integer getNullableInt(int i) {
        if (isNull(i)) {
            return null;
        }
        return Integer.valueOf(getInt(i));
    }

    public Long getNullableLong(int i) {
        if (isNull(i)) {
            return null;
        }
        return Long.valueOf(getLong(i));
    }

    public String getNullableString(int i) {
        if (isNull(i)) {
            return null;
        }
        return getString(i);
    }
}
