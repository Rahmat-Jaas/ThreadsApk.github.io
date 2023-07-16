package X;

/* renamed from: X.2Cv  reason: invalid class name and case insensitive filesystem */
public final class C32692Cv {
    public static final String A00(MMo mMo) {
        if (mMo.A0f() == C40318LcR.START_OBJECT) {
            StringBuilder A0r = C18200wM.A0r();
            while (mMo.A0g() != C40318LcR.END_OBJECT) {
                if (mMo.A0g() == C40318LcR.START_ARRAY) {
                    while (mMo.A0g() != C40318LcR.END_ARRAY) {
                        A0r.append(mMo.A0p());
                        A0r.append("\n");
                    }
                } else if (mMo.A0f().ordinal() >= 6) {
                    A0r.append(mMo.A0p());
                    A0r.append("\n");
                } else {
                    mMo.A0x();
                }
            }
            return AnonymousClass8bP.A0L(C18190wL.A0n(A0r)).toString();
        }
        mMo.A0x();
        return null;
    }
}
