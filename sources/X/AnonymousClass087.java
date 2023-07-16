package X;

/* renamed from: X.087  reason: invalid class name */
public abstract class AnonymousClass087 implements AnonymousClass0IB {
    public final void Ccz(String str, Integer num, String str2) {
        Ccy(num, str, str2, (Throwable) null);
    }

    public final void CuW(String str, String str2) {
        CuV(new AnonymousClass0IH(str, str2, 1000, (Throwable) null));
    }

    public final void CuX(String str, String str2, int i) {
        CuV(new AnonymousClass0IH(str, str2, i, (Throwable) null));
    }

    public final void Cua(String str, Throwable th, int i) {
        Cuc(str, th.getMessage(), 1, th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.AnonymousClass006.A0j) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ccy(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
        /*
            r4 = this;
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            if (r5 == r0) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r3 = 1
        L_0x000b:
            java.lang.String r2 = "IMPACT_"
            java.lang.String r1 = X.AnonymousClass0I8.A00(r5)
            java.lang.String r0 = "::"
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r1, r0, r6)
            r4.Cuc(r0, r7, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass087.Ccy(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public final void CuY(String str, String str2, Throwable th) {
        CuV(new AnonymousClass0IH(str, str2, 1000, th));
    }

    public final void Cuc(String str, String str2, int i, Throwable th) {
        CuV(new AnonymousClass0IH(str, str2, i, th));
    }

    public final void Cuf(String str, String str2) {
        Ccz(str, AnonymousClass006.A1L, str2);
    }

    public final void Cug(String str, String str2, Throwable th) {
        Ccy(AnonymousClass006.A1L, str, "Choreographer reflection failed.", th);
    }

    public final void Cuh(String str, Throwable th) {
        String str2;
        Integer num = AnonymousClass006.A1L;
        if (th.getMessage() != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        Ccy(num, str, str2, th);
    }

    public final void CuZ(String str, Throwable th) {
        CuY(str, th.getMessage(), th);
    }
}
