package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.79p  reason: invalid class name and case insensitive filesystem */
public final class C1202979p {
    public static final C111396nG A07 = new C111396nG();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        int i;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1202979p) {
            C1202979p r8 = (C1202979p) obj;
            if (this.A02 == r8.A02 && C04220Ms.A0I(this.A04, r8.A04) && this.A06 == r8.A06 && ((i = this.A01) != 1 || r8.A01 != 2 || (str2 = this.A03) == null || A07.A00(str2, r8.A03))) {
                if (i == 2 && r8.A01 == 1 && (str = r8.A03) != null && !A07.A00(str, this.A03)) {
                    return false;
                }
                if (i == r8.A01) {
                    String str3 = this.A03;
                    if (str3 != null) {
                        if (!A07.A00(str3, r8.A03)) {
                            return false;
                        }
                    } else if (r8.A03 != null) {
                        return false;
                    }
                }
                return this.A00 == r8.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((C18180wK.A03(this.A04) + this.A00) * 31) + C86124wJ.A04(this.A06 ? 1 : 0)) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Column{name='");
        A0s.append(this.A04);
        A0s.append(AnonymousClass000.A00(HttpStatus.SC_BAD_GATEWAY));
        A0s.append(this.A05);
        A0s.append("', affinity='");
        A0s.append(this.A00);
        A0s.append("', notNull=");
        A0s.append(this.A06);
        A0s.append(", primaryKeyPosition=");
        A0s.append(this.A02);
        A0s.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A0s.append(str);
        return C18180wK.A0i("'}", A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (X.AnonymousClass8bP.A0j(r2, "DOUB", false) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1202979p(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, boolean r10) {
        /*
            r4 = this;
            X.AnonymousClass0wJ.A1O(r5, r6)
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            r4.A06 = r10
            r4.A02 = r8
            r4.A03 = r7
            r4.A01 = r9
            r3 = 5
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r2 = X.C18220wO.A0u(r0, r6)
            java.lang.String r0 = "INT"
            r1 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 == 0) goto L_0x0029
            r3 = 3
        L_0x0026:
            r4.A00 = r3
            return
        L_0x0029:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "CLOB"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "TEXT"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "BLOB"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "REAL"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "FLOA"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "DOUB"
            boolean r0 = X.AnonymousClass8bP.A0j(r2, r0, r1)
            r3 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0062:
            r3 = 4
            goto L_0x0026
        L_0x0064:
            r3 = 2
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1202979p.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }
}
