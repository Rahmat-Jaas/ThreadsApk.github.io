package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;

/* renamed from: X.6Fa  reason: invalid class name and case insensitive filesystem */
public final class C98316Fa {
    public static final Bundle A00(Pair... pairArr) {
        C04220Ms.A0B(pairArr, 0);
        Bundle bundle = new Bundle(r6);
        for (Pair pair : pairArr) {
            String str = (String) pair.A00;
            Object obj = pair.A01;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, AnonymousClass0wJ.A1X(obj));
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, C86124wJ.A00(obj));
            } else if (obj instanceof Float) {
                bundle.putFloat(str, C18240wQ.A00(obj));
            } else if (obj instanceof Integer) {
                bundle.putInt(str, AnonymousClass0wJ.A04(obj));
            } else if (obj instanceof Long) {
                bundle.putLong(str, C18190wL.A08(obj));
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else {
                if (obj instanceof Object[]) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    C04220Ms.A0A(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str, (Parcelable[]) obj);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str, (String[]) obj);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw C18190wL.A0a(AnonymousClass00U.A0e("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, '\"'));
                    }
                } else if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        C04220Ms.A0B(str, 1);
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        C04220Ms.A0B(str, 1);
                        bundle.putSize(str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        C04220Ms.A0B(str, 1);
                        bundle.putSizeF(str, (SizeF) obj);
                    } else {
                        throw C18190wL.A0a(AnonymousClass00U.A0e(C28174Ezk.A00(382), obj.getClass().getCanonicalName(), " for key \"", str, '\"'));
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }
}
