package X;

/* renamed from: X.7nZ  reason: invalid class name */
public final class AnonymousClass7nZ implements C41836MeS {
    public final AnonymousClass3Z0 A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        BKU bku;
        AnonymousClass3Z0 r2;
        BKU A0W;
        String str;
        C37415JrZ jrZ = (C37415JrZ) obj;
        String str2 = null;
        if (jrZ != null) {
            bku = C86144wL.A0W(jrZ);
        } else {
            bku = null;
        }
        if (bku != null) {
            BKU A0W2 = C86144wL.A0W(jrZ);
            if (A0W2 == null || !A0W2.BSA() || (A0W = C86144wL.A0W(jrZ)) == null || (str = A0W.A0f.A4i) == null || str.length() == 0) {
                BKU A0W3 = C86144wL.A0W(jrZ);
                if (A0W3 == null || A0W3.A3p()) {
                    return false;
                }
                r2 = this.A00;
                BKU A0W4 = C86144wL.A0W(jrZ);
                if (A0W4 != null) {
                    str2 = A0W4.A0f.A4Y;
                }
            } else {
                BKU A0W5 = C86144wL.A0W(jrZ);
                if (A0W5 == null || A0W5.A3p()) {
                    return false;
                }
                r2 = this.A00;
                BKU A0W6 = C86144wL.A0W(jrZ);
                if (A0W6 != null) {
                    str2 = A0W6.A0f.A4i;
                }
            }
            if (!r2.A03(str2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass7nZ(AnonymousClass3Z0 r1) {
        this.A00 = r1;
    }
}
