package X;

/* renamed from: X.1r7  reason: invalid class name and case insensitive filesystem */
public final class C26731r7 extends C24431ij {
    public final C07530bf A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26731r7(X.AnonymousClass601 r13, X.C23151ca r14, X.C07530bf r15) {
        /*
            r12 = this;
            r4 = r14
            r6 = r15
            X.AnonymousClass0wJ.A1P(r15, r14)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r13)
            X.265 r7 = X.AnonymousClass265.A0z
            X.0kW r3 = X.C63913ic.A0A(r13)
            java.lang.Integer r8 = X.AnonymousClass006.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r13)
            android.net.Uri r2 = X.C67323zM.A00(r0)
            r5 = 0
            r0 = r12
            r9 = r5
            r10 = r5
            r11 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26731r7.<init>(X.601, X.1ca, X.0bf):void");
    }

    public final void onFail(AnonymousClass3XX r6) {
        String str;
        int A002 = AnonymousClass0wJ.A00(1790128719, r6);
        super.onFail(r6);
        C61763Vg A02 = C63313hF.A02(this.A00, (C313625r) null, AnonymousClass265.A0z, "next_blocked");
        Object obj = r6.A00;
        AnonymousClass1j3 r0 = (AnonymousClass1j3) obj;
        if (r0 != null) {
            str = r0.mErrorType;
        } else {
            str = null;
        }
        if (!AnonymousClass0wJ.A1W(obj) || str == null) {
            str = this.A00;
            C04220Ms.A06(str);
        }
        A02.A03("error", str);
        A02.A01();
        C14030oh.A0A(10723789, A002);
    }
}
