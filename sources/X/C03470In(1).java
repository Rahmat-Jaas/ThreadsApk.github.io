package X;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0In  reason: invalid class name and case insensitive filesystem */
public class C03470In {
    public static C03470In A00;
    public static C03470In A01 = new C03470In();
    public static final boolean A02;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 31) {
            z = true;
        }
        A02 = z;
    }

    public static C03470In A00() {
        C03470In r1 = A00;
        AnonymousClass09K r12 = r1;
        if (r1 == null) {
            C03470In r13 = A01;
            A00 = r13;
            r12 = r13;
            if (A02) {
                AnonymousClass09K r14 = AnonymousClass09K.A05;
                AnonymousClass09K r15 = r14;
                if (r14 == null) {
                    AnonymousClass09K r16 = new AnonymousClass09K();
                    AnonymousClass09K.A05 = r16;
                    r15 = r16;
                }
                A00 = r15;
                r12 = r15;
            }
        }
        return r12;
    }

    public Class A01(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Constructor A02(Class cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field A03(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Method A04(Class cls, String str, Class... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Field[] A05(Class cls) {
        try {
            return cls.getDeclaredFields();
        } catch (Throwable unused) {
            return null;
        }
    }
}
