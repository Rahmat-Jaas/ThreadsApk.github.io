package X;

/* renamed from: X.0Er  reason: invalid class name */
public final class AnonymousClass0Er {
    public static AnonymousClass0Er A07;
    public static C03600Jw A08;
    public static boolean A09;
    public static boolean A0A;
    public static final AnonymousClass0K9 A0B;
    public static final Object A0C = new Object();
    public final AnonymousClass013 A00 = new AnonymousClass013(this);
    public final C03220Ey A01;
    public final C020809r A02;
    public final C03190Eu A03;
    public final AnonymousClass0F0 A04;
    public final AnonymousClass0F2 A05;
    public final C03410If A06;

    public AnonymousClass0Er(C03190Eu r7, C03220Ey r8, AnonymousClass0F0 r9, C03410If r10) {
        this.A06 = r10;
        this.A01 = r8;
        this.A03 = r7;
        this.A04 = r9;
        AnonymousClass0F2 r4 = new AnonymousClass0F2(r7, r10);
        this.A05 = r4;
        this.A02 = new C020809r(this, r7, r9, r4, r10);
    }

    static {
        AnonymousClass0K9 r2 = new AnonymousClass0K9("ActivityLifecycleHook");
        A0B = r2;
        C03600Jw r1 = r2.A00;
        if (r1 == null) {
            synchronized (r2) {
                r1 = r2.A00;
                if (r1 == null) {
                    r1 = new C03600Jw(r2.A01);
                    r2.A00 = r1;
                }
            }
        }
        A08 = r1;
    }
}
