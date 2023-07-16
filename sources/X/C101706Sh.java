package X;

/* renamed from: X.6Sh  reason: invalid class name and case insensitive filesystem */
public final class C101706Sh {
    public static final void A00(C40318LcR lcR, C40318LcR lcR2) {
        if (lcR != lcR2) {
            C10450iM.A03("IGLegacyFragmentModelResponseParser", "Unexpected token");
            StringBuilder A0s = C18190wL.A0s("Expected token ");
            A0s.append(lcR2);
            throw C86154wM.A0V(C86104wH.A0x(lcR, " but found ", A0s));
        }
    }
}
