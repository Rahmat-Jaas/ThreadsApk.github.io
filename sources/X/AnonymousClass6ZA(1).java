package X;

/* renamed from: X.6ZA  reason: invalid class name */
public final class AnonymousClass6ZA {
    public static final boolean A00;

    static {
        Object obj;
        try {
            obj = Class.forName("android.os.Build");
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
        A00 = !(obj instanceof AnonymousClass0OW);
    }
}
