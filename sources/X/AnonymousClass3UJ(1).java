package X;

/* renamed from: X.3UJ  reason: invalid class name */
public final class AnonymousClass3UJ {
    public final C10300i6 A00;

    public AnonymousClass3UJ(C10300i6 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(GJX gjx) {
        AnonymousClass3Ud A01 = gjx.A01("IG-Set-Password-Encryption-Pub-Key");
        AnonymousClass3Ud A012 = gjx.A01("IG-Set-Password-Encryption-Key-Id");
        if (A01 != null && A012 != null) {
            C58623Gm r2 = C58623Gm.A01;
            if (r2 == null) {
                r2 = new C58623Gm(C10600ic.A00);
                C58623Gm.A01 = r2;
            }
            r2.A01(A01.A01, A012.A01);
        }
    }

    public final void A01(GJX gjx, GXK gxk) {
        AnonymousClass3Ud A01;
        if (C48982qe.A00(gxk.A08) && (A01 = gjx.A01("X-IG-Set-WWW-Claim")) != null) {
            C685044b.A00(this.A00).A01(A01.A01);
        }
    }
}
