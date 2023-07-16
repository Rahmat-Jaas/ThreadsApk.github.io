package X;

/* renamed from: X.3VH  reason: invalid class name */
public final class AnonymousClass3VH {
    public static AnonymousClass3VH A0B;
    public AnonymousClass3DK A00;
    public AnonymousClass265 A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final synchronized void A01(AnonymousClass3DK r2, Integer num, String str, String str2) {
        AnonymousClass3VH r0 = A0B;
        r0.A02 = num;
        r0.A08 = str;
        r0.A00 = r2;
        r0.A07 = str2;
    }

    public final synchronized void A02(AnonymousClass265 r2, String str, String str2) {
        AnonymousClass3VH r0 = A0B;
        r0.A0A = str;
        r0.A09 = str2;
        r0.A01 = r2;
    }

    public static synchronized AnonymousClass3VH A00() {
        AnonymousClass3VH r0;
        synchronized (AnonymousClass3VH.class) {
            if (A0B == null) {
                AnonymousClass3VH r3 = new AnonymousClass3VH();
                A0B = r3;
                r3.A01(new AnonymousClass3DK(), AnonymousClass006.A1C, "", "");
                A0B.A02(AnonymousClass265.A0z, "", "");
                AnonymousClass3VH r2 = A0B;
                Integer num = AnonymousClass006.A00;
                synchronized (r2) {
                    A0B.A05 = num;
                }
                synchronized (A0B) {
                }
                AnonymousClass3VH r22 = A0B;
                Integer num2 = AnonymousClass006.A0C;
                synchronized (r22) {
                    A0B.A03 = num2;
                }
            }
            r0 = A0B;
        }
        return r0;
    }
}
