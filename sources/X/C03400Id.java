package X;

/* renamed from: X.0Id  reason: invalid class name and case insensitive filesystem */
public enum C03400Id {
    Unknown(true, 0),
    UnlikelyHidden(true, 2),
    LikelyHidden(true, 3);
    
    public final boolean A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        Unknown = new C03400Id("Unknown", true, true, 0);
        new C03400Id("CertainlyNotHidden", true, false, 1);
        UnlikelyHidden = new C03400Id("UnlikelyHidden", true, true, 2);
        LikelyHidden = new C03400Id("LikelyHidden", false, true, 3);
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r4 != false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C03400Id(boolean r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r5)
            if (r3 != 0) goto L_0x0008
            r0 = 0
            if (r4 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.AnonymousClass0KW.A03(r0)
            r1.A01 = r3
            r1.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03400Id.<init>(java.lang.String, boolean, boolean, int):void");
    }
}
