package X;

import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.microg.safeparcel.SafeParcelable;

/* renamed from: X.7G3  reason: invalid class name */
public final class AnonymousClass7G3 {
    public static Parcelable.Creator A00(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            return (Parcelable.Creator) declaredField.get((Object) null);
        } catch (NoSuchFieldException unused) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(cls);
            throw C18250wR.A0V(C18180wK.A0i(" is an Parcelable without CREATOR", A0r));
        } catch (IllegalAccessException unused2) {
            StringBuilder A0s = C18190wL.A0s("CREATOR in ");
            A0s.append(cls);
            throw C18250wR.A0V(C18180wK.A0i(" is not accessible", A0s));
        }
    }

    public static Class A02(Field field) {
        Class<SafeParcelable> subClass;
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null && (subClass = field2.subClass()) != SafeParcelable.class && subClass != null) {
            return subClass;
        }
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        if (parameterizedType.getActualTypeArguments().length < 1) {
            return null;
        }
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class) {
            return (Class) type;
        }
        return null;
    }

    public static boolean A03(Field field) {
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null) {
            return field2.useValueParcel();
        }
        throw new IllegalStateException();
    }

    public static Parcelable.Creator A01(Field field) {
        Class<?> type = field.getType();
        if ((!type.isArray() || (type = type.getComponentType()) != null) && Parcelable.class.isAssignableFrom(type)) {
            return A00(type);
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(type);
        throw C18250wR.A0V(C18180wK.A0i(" is not an Parcelable", A0r));
    }
}
