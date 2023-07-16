package X;

import java.lang.reflect.Field;

/* renamed from: X.0QW  reason: invalid class name */
public final class AnonymousClass0QW extends AnonymousClass01Q {
    public static Class A00;
    public static boolean A01;
    public static final AnonymousClass0QW A02 = new AnonymousClass0QW();
    public static final AnonymousClass0K9 A03 = new AnonymousClass0K9("AppThreadBinderCode");

    public AnonymousClass0QW(int i, String str) {
        super("Binder", str, (String) null, i, false);
    }

    public final Field A02(C03410If r4, Class cls, String str) {
        Field A0I;
        Field A0I2 = r4.A0I((C03400Id) null, cls, str);
        if (A0I2 == null) {
            A0I2 = null;
            if ((str == null || (!str.startsWith("TRANSACTION_") && !str.endsWith("_TRANSACTION"))) && (A0I = r4.A0I((C03400Id) null, cls, AnonymousClass00U.A0L("TRANSACTION_", str))) != null) {
                return A0I;
            }
        }
        return A0I2;
    }

    public final Class A01(C03190Eu r4, C03410If r5) {
        boolean z = A01;
        Class cls = A00;
        if (!z && cls == null) {
            cls = r5.A0E("android.app.IApplicationThread$Stub");
            Class A0E = r5.A0E("android.app.IApplicationThread");
            if (cls == null) {
                cls = A0E;
                if (A0E == null) {
                    A03.A07("Could not find binder key class to use.", new Object[0]);
                    cls = null;
                }
            }
            A00 = cls;
            A01 = true;
        }
        return cls;
    }

    public AnonymousClass0QW() {
        super("Binder", "TRANSACTION_scheduleTransaction", "android.app.servertransaction.ClientTransaction", -19842, true);
    }
}
