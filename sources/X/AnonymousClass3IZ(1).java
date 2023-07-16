package X;

/* renamed from: X.3IZ  reason: invalid class name */
public abstract class AnonymousClass3IZ {
    public final C10300i6 A00;
    public final AnonymousClass3UT A01;
    public final String A02;

    public final void A00() {
        AnonymousClass2AF r1;
        if (this instanceof C27391sR) {
            AnonymousClass3UT r12 = this.A01;
            if (!AnonymousClass3UT.A00(r12).A01) {
                boolean A012 = r12.A01();
                C10300i6 r3 = this.A00;
                String str = this.A02;
                if (A012) {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0U;
                } else {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0L;
                }
                C63003bJ.A00(r1, r3, str, (String) null);
                return;
            }
            return;
        }
        boolean z = this instanceof C27341sM;
        boolean z2 = AnonymousClass3UT.A00(this.A01).A01;
        if (z) {
            if (!z2) {
                C10300i6 r32 = this.A00;
                String str2 = this.A02;
                AnonymousClass0wJ.A1N(r32, str2);
                C63003bJ.A00(AnonymousClass2AF.A0Y, r32, str2, (String) null);
            }
        } else if (!z2) {
            C10300i6 r33 = this.A00;
            String str3 = this.A02;
            AnonymousClass0wJ.A1N(r33, str3);
            C63003bJ.A00(AnonymousClass2AF.A0Y, r33, str3, (String) null);
        }
    }

    public final void A01(boolean z) {
        C10300i6 r3;
        String str;
        AnonymousClass2AF r1;
        if (this instanceof C27391sR) {
            C27391sR r4 = (C27391sR) this;
            if (r4 instanceof C27381sQ) {
                if (z) {
                    C10300i6 r32 = r4.A00;
                    String obj = C306222g.IG_SAC_SIGN_UP.toString();
                    AnonymousClass0wJ.A1N(r32, obj);
                    C63003bJ.A00(AnonymousClass2AF.A09, r32, obj, (String) null);
                }
                boolean A1W = C18180wK.A1W(r4.A01.A00);
                r3 = r4.A00;
                str = r4.A02;
                if (A1W) {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0J;
                } else {
                    AnonymousClass0wJ.A1N(r3, str);
                    r1 = AnonymousClass2AF.A0S;
                }
            } else {
                return;
            }
        } else if (!(this instanceof C27341sM) && z) {
            r3 = this.A00;
            str = this.A02;
            AnonymousClass0wJ.A1N(r3, str);
            r1 = AnonymousClass2AF.A09;
        } else {
            return;
        }
        C63003bJ.A00(r1, r3, str, (String) null);
    }

    public final void A02(boolean z, boolean z2) {
        if (this instanceof C27391sR) {
            AnonymousClass3UT r4 = this.A01;
            if (r4.A01() && A03(z, z2)) {
                C10300i6 r3 = this.A00;
                String str = this.A02;
                AnonymousClass0wJ.A1N(r3, str);
                C63003bJ.A00(AnonymousClass2AF.A0P, r3, str, (String) null);
            }
            if (r4.A00 == 0 && A03(z, z2)) {
                C10300i6 r32 = this.A00;
                String str2 = this.A02;
                AnonymousClass0wJ.A1N(r32, str2);
                C63003bJ.A00(AnonymousClass2AF.A0G, r32, str2, (String) null);
                return;
            }
            return;
        }
        boolean z3 = this instanceof C27341sM;
        boolean A03 = A03(z, z2);
        if (z3) {
            if (A03) {
                C10300i6 r33 = this.A00;
                String str3 = this.A02;
                AnonymousClass0wJ.A1N(r33, str3);
                C63003bJ.A00(AnonymousClass2AF.A0C, r33, str3, (String) null);
            }
        } else if (A03 && !AnonymousClass3UT.A00(this.A01).A00) {
            C10300i6 r34 = this.A00;
            String str4 = this.A02;
            AnonymousClass0wJ.A1N(r34, str4);
            C63003bJ.A00(AnonymousClass2AF.A0C, r34, str4, (String) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(boolean r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C27331sL
            if (r0 == 0) goto L_0x0013
            if (r3 == 0) goto L_0x0011
            X.3UT r0 = r2.A01
            X.3AR r0 = X.AnonymousClass3UT.A00(r0)
            boolean r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        L_0x0013:
            if (r3 == 0) goto L_0x0011
            if (r4 == 0) goto L_0x0011
            X.3UT r0 = r2.A01
            X.3AR r0 = X.AnonymousClass3UT.A00(r0)
            boolean r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IZ.A03(boolean, boolean):boolean");
    }

    public AnonymousClass3IZ(C10300i6 r1, AnonymousClass3UT r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }
}
