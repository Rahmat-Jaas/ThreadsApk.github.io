package X;

/* renamed from: X.6uW  reason: invalid class name and case insensitive filesystem */
public final class C115106uW {
    public final AnonymousClass7A8 A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18190wL.A1Y(this, obj)) {
            C115106uW r5 = (C115106uW) obj;
            if (this.A03 == r5.A03 && this.A02 == r5.A02 && C04220Ms.A0I(this.A00, r5.A00)) {
                Object obj2 = this.A01;
                Object obj3 = r5.A01;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C18210wN.A04(this.A00) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + C18230wP.A05(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r6 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C115106uW(X.AnonymousClass7A8 r4, java.lang.Object r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0018
            if (r6 == 0) goto L_0x001a
            java.lang.String r1 = r4.A02()
            java.lang.String r0 = " does not allow nullable values"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0018:
            if (r6 != 0) goto L_0x002f
        L_0x001a:
            if (r7 == 0) goto L_0x002f
            if (r5 != 0) goto L_0x002f
            java.lang.String r2 = "Argument with type "
            java.lang.String r1 = r4.A02()
            java.lang.String r0 = " has null value but is not nullable."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x002f:
            r3.A00 = r4
            r3.A03 = r6
            r3.A01 = r5
            r3.A02 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115106uW.<init>(X.7A8, java.lang.Object, boolean, boolean):void");
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(C18210wN.A0e(this));
        A0r.append(C18200wM.A0m(this.A00, C18190wL.A0s(" Type: ")));
        A0r.append(AnonymousClass00U.A0o(" Nullable: ", this.A03));
        if (this.A02) {
            A0r.append(C18200wM.A0m(this.A01, C18190wL.A0s(" DefaultValue: ")));
        }
        return C18190wL.A0n(A0r);
    }
}
