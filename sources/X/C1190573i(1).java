package X;

/* renamed from: X.73i  reason: invalid class name and case insensitive filesystem */
public final class C1190573i {
    public static boolean A00;

    public static final synchronized void A00() {
        synchronized (C1190573i.class) {
            if (!A00) {
                A00 = true;
                C36136JIa jIa = new C36136JIa();
                synchronized (AnonymousClass7CI.class) {
                    if (AnonymousClass7CI.A00 != null) {
                        AnonymousClass0JV.A01("FrescoVitoProvider", "Fresco Vito already initialized! Vito must be initialized only once.");
                    }
                    AnonymousClass7CI.A00 = jIa;
                }
            }
        }
    }
}
