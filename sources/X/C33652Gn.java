package X;

/* renamed from: X.2Gn  reason: invalid class name and case insensitive filesystem */
public final class C33652Gn {
    public static final void A00(AnonymousClass601 r10, C63893iY r11) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        C127397h3 A03 = C63893iY.A03(r11, A1Z ? 1 : 0);
        C127397h3 A0K = A03.A0K(41);
        if (A0K != null) {
            C127397h3 A0K2 = A03.A0K(40);
            C18200wM.A1R(C63913ic.A0F(r10));
            C63913ic.A0B(r10);
            if (A0K.A0N(38) != null) {
                A0K.A0N(36);
                A0K.A0T(35, false);
                if (A0K2 != null) {
                    if (A0K2.A0N(38) != null) {
                        A0K2.A0N(36);
                        A0K2.A0T(35, false);
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                if (A03.A0N(42) == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else if (A03.A0N(46) != null) {
                    A03.A0N(38);
                    A03.A0N(44);
                    A03.A0H(36, 0);
                    A03.A0T(43, A1Z);
                    A03.A0T(35, false);
                    if (A03.A0N(45) != null) {
                        throw C18200wM.A0d();
                    }
                    throw C18180wK.A0a("Required value was null.");
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        } else {
            throw C18180wK.A0a("Required value was null.");
        }
    }
}
