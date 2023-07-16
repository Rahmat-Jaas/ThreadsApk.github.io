package X;

/* renamed from: X.0qM  reason: invalid class name */
public final class AnonymousClass0qM {
    public static C14890qL A00;

    public static boolean A02(String str) {
        C14890qL r0;
        synchronized (AnonymousClass0qM.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return r0.Baq(str, 0);
    }

    public static void A00(C14890qL r3) {
        synchronized (AnonymousClass0qM.class) {
            if (A00 == null) {
                A00 = r3;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    public static boolean A01() {
        boolean z;
        synchronized (AnonymousClass0qM.class) {
            z = false;
            if (A00 != null) {
                z = true;
            }
        }
        return z;
    }
}
