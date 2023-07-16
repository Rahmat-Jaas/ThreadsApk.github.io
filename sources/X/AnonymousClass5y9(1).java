package X;

/* renamed from: X.5y9  reason: invalid class name */
public final class AnonymousClass5y9 extends C17716AKu {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y9) {
                AnonymousClass5y9 r5 = (AnonymousClass5y9) obj;
                if (!(C04220Ms.A0I(this.A04, r5.A04) && this.A01 == r5.A01 && C04220Ms.A0I(this.A03, r5.A03) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5y9(java.lang.Integer r3, java.lang.Integer r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r1 = 95
            int r0 = r3.intValue()
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "TAIL_LOADING"
        L_0x000a:
            java.lang.String r0 = X.AnonymousClass00U.A0Y(r5, r0, r6, r1, r1)
            r2.<init>(r0)
            r2.A04 = r5
            r2.A01 = r3
            r2.A03 = r6
            r2.A00 = r7
            r2.A02 = r4
            return
        L_0x001c:
            java.lang.String r0 = "HEAD_LOADING"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5y9.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public final int hashCode() {
        String str;
        int A032 = C18180wK.A03(this.A04);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "TAIL_LOADING";
        } else {
            str = "HEAD_LOADING";
        }
        return ((((C86124wJ.A0J(str, intValue, A032) + AnonymousClass0wJ.A06(this.A03)) * 31) + this.A00) * 31) + C100946Pg.A00(this.A02);
    }
}
