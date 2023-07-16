package X;

/* renamed from: X.6vR  reason: invalid class name and case insensitive filesystem */
public final class C115546vR {
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public int A03;
    public final C115086uU A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 2
            X.C04220Ms.A0B(r6, r0)
            java.lang.String r2 = ") offset is outside of text region "
            if (r4 < 0) goto L_0x0049
            X.6uU r0 = r3.A04
            int r1 = r0.A00()
            if (r4 > r1) goto L_0x0049
            if (r5 < 0) goto L_0x0042
            if (r5 > r1) goto L_0x0042
            if (r4 > r5) goto L_0x0035
            r0.A01(r4, r5, r6)
            int r1 = r6.length()
            int r1 = r1 + r4
            if (r1 < 0) goto L_0x002a
            r3.A03 = r1
            r3.A02 = r1
            r0 = -1
            r3.A01 = r0
            r3.A00 = r0
            return
        L_0x002a:
            java.lang.String r0 = "Cannot set selectionStart to a negative value: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0035:
            java.lang.String r1 = "Do not set reversed range: "
            java.lang.String r0 = " > "
            java.lang.String r0 = X.AnonymousClass00U.A01(r4, r5, r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0042:
            java.lang.String r0 = "end ("
            java.lang.IndexOutOfBoundsException r0 = X.C86114wI.A0a(r0, r2, r5, r1)
            throw r0
        L_0x0049:
            java.lang.String r1 = "start ("
            X.6uU r0 = r3.A04
            int r0 = r0.A00()
            java.lang.IndexOutOfBoundsException r0 = X.C86114wI.A0a(r1, r2, r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115546vR.A04(int, int, java.lang.String):void");
    }

    public final char A00(int i) {
        String str;
        int i2;
        C115086uU r6 = this.A04;
        C112606pt r5 = r6.A02;
        if (r5 == null || i < (i2 = r6.A01)) {
            str = r6.A03;
        } else {
            int i3 = r5.A00;
            int i4 = r5.A01;
            int i5 = r5.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = r5.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            str = r6.A03;
            i -= (i6 - r6.A00) + i2;
        }
        return str.charAt(i);
    }

    public final void A02(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            throw C86114wI.A0a("start (", ") offset is outside of text region ", i, this.A04.A00());
        } else if (i2 < 0 || i2 > A002) {
            throw C86114wI.A0a("end (", ") offset is outside of text region ", i2, A002);
        } else if (i < i2) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "Do not set reversed or empty range: ", " > "));
        }
    }

    public final void A03(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            throw C86114wI.A0a("start (", ") offset is outside of text region ", i, this.A04.A00());
        } else if (i2 < 0 || i2 > A002) {
            throw C86114wI.A0a("end (", ") offset is outside of text region ", i2, A002);
        } else if (i <= i2) {
            this.A03 = i;
            this.A02 = i2;
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A01(i, i2, "Do not set reversed range: ", " > "));
        }
    }

    public final String toString() {
        return this.A04.toString();
    }

    public C115546vR(C134747yH r6, long j) {
        int length;
        this.A04 = new C115086uU(r6.A00);
        int A012 = C121767Ia.A01(j);
        this.A03 = A012;
        int A002 = C121767Ia.A00(j);
        this.A02 = A002;
        if (A012 < 0 || A012 > (length = r6.length())) {
            throw C86114wI.A0a("start (", ") offset is outside of text region ", A012, r6.length());
        } else if (A002 < 0 || A002 > length) {
            throw C86114wI.A0a("end (", ") offset is outside of text region ", A002, length);
        } else if (A012 > A002) {
            throw C18190wL.A0a(AnonymousClass00U.A01(A012, A002, "Do not set reversed range: ", " > "));
        }
    }

    public final void A01(int i, int i2) {
        int A002;
        long A003 = AnonymousClass6FM.A00(i, i2);
        this.A04.A01(i, i2, "");
        long A004 = AnonymousClass6FU.A00(AnonymousClass6FM.A00(this.A03, this.A02), A003);
        int A012 = C121767Ia.A01(A004);
        if (A012 >= 0) {
            this.A03 = A012;
            int A005 = C121767Ia.A00(A004);
            if (A005 >= 0) {
                this.A02 = A005;
                int i3 = this.A01;
                if (i3 != -1) {
                    long A006 = AnonymousClass6FU.A00(AnonymousClass6FM.A00(i3, this.A00), A003);
                    if (C121767Ia.A02(A006)) {
                        A002 = -1;
                        this.A01 = -1;
                    } else {
                        this.A01 = C121767Ia.A01(A006);
                        A002 = C121767Ia.A00(A006);
                    }
                    this.A00 = A002;
                    return;
                }
                return;
            }
            throw C18190wL.A0a(AnonymousClass00U.A0J("Cannot set selectionEnd to a negative value: ", A005));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("Cannot set selectionStart to a negative value: ", A012));
    }
}
