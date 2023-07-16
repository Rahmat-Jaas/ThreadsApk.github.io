package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6WD  reason: invalid class name */
public final class AnonymousClass6WD {
    public static Integer A00(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        if (type.isArray() && componentType != null && Parcelable.class.isAssignableFrom(componentType)) {
            return AnonymousClass006.A0j;
        }
        if (type.isArray() && componentType != null && String.class.isAssignableFrom(componentType)) {
            return AnonymousClass006.A0u;
        }
        if (type.isArray() && componentType != null && Byte.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass006.A15;
        }
        if (type.isArray() && componentType != null && Integer.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass006.A1L;
        }
        if (Bundle.class.isAssignableFrom(type)) {
            return AnonymousClass006.A0Y;
        }
        if (Parcelable.class.isAssignableFrom(type)) {
            return AnonymousClass006.A00;
        }
        if (IBinder.class.isAssignableFrom(type)) {
            return AnonymousClass006.A01;
        }
        if (IInterface.class.isAssignableFrom(type)) {
            return AnonymousClass006.A1C;
        }
        if (type == List.class || type == ArrayList.class) {
            if (AnonymousClass7G3.A02(field) != String.class || AnonymousClass7G3.A03(field)) {
                return AnonymousClass006.A0N;
            }
            return AnonymousClass006.A0C;
        } else if (type == Map.class || type == HashMap.class) {
            return AnonymousClass006.A08;
        } else {
            if (type == Integer.TYPE || type == Integer.class) {
                return AnonymousClass006.A02;
            }
            if (type == Boolean.TYPE || type == Boolean.class) {
                return AnonymousClass006.A04;
            }
            if (type == Long.TYPE || type == Long.class) {
                return AnonymousClass006.A03;
            }
            if (type == Float.TYPE || type == Float.class) {
                return AnonymousClass006.A05;
            }
            if (type == Double.TYPE || type == Double.class) {
                return AnonymousClass006.A06;
            }
            if (type == Byte.TYPE || type == Byte.class) {
                return AnonymousClass006.A09;
            }
            if (type == String.class) {
                return AnonymousClass006.A07;
            }
            throw C18250wR.A0V(AnonymousClass0wJ.A0t("Type is not yet usable with SafeParcelUtil: ", type));
        }
    }
}
