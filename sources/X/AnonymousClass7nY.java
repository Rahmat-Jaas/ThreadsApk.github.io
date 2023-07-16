package X;

/* renamed from: X.7nY  reason: invalid class name */
public final class AnonymousClass7nY implements C41836MeS {
    public final boolean A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        BKU bku;
        BKU A0W;
        C37415JrZ jrZ = (C37415JrZ) obj;
        if (jrZ != null) {
            bku = C86144wL.A0W(jrZ);
        } else {
            bku = null;
        }
        if (bku != null && ((A0W = C86144wL.A0W(jrZ)) == null || !A0W.BYi())) {
            if (C19540Ay1.A04(C86144wL.A0W(jrZ))) {
                return this.A00;
            }
            C35393Iu1 iu1 = jrZ.A0P;
            if (iu1 == C35393Iu1.A0S || iu1 == C35393Iu1.A0D) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass7nY(boolean z) {
        this.A00 = z;
    }
}
