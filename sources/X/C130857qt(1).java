package X;

import java.io.IOException;

/* renamed from: X.7qt  reason: invalid class name and case insensitive filesystem */
public final class C130857qt implements C146328m3 {
    public MMo A00;

    public final boolean AAu() {
        C40318LcR A0f;
        MMo mMo = this.A00;
        if (mMo == null || (A0f = mMo.A0f()) == null) {
            throw new IOException();
        }
        int ordinal = A0f.ordinal();
        if (ordinal == 10) {
            return true;
        }
        if (ordinal == 11) {
            return false;
        }
        throw C18190wL.A0a(AnonymousClass0wJ.A0t("illegal token for boolean type ", A0f));
    }

    public final boolean BWX() {
        C40318LcR lcR;
        MMo mMo = this.A00;
        if (mMo != null) {
            lcR = mMo.A0f();
        } else {
            lcR = null;
        }
        return C18180wK.A1Z(lcR, C40318LcR.VALUE_NULL);
    }

    public final long BeP() {
        MMo mMo = this.A00;
        if (mMo != null) {
            return mMo.A0a();
        }
        throw new IOException();
    }

    public final Number BiQ() {
        Number valueOf;
        MMo mMo = this.A00;
        if (mMo != null) {
            C40318LcR A0f = mMo.A0f();
            if (A0f != null) {
                int ordinal = A0f.ordinal();
                if (ordinal == 9) {
                    valueOf = Double.valueOf(mMo.A0Q());
                } else if (ordinal == 8) {
                    valueOf = Long.valueOf(mMo.A0a());
                }
                return valueOf;
            }
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("illegal token for number type ", A0f));
        }
        throw new IOException();
    }

    public final String CwM() {
        String A0p;
        MMo mMo = this.A00;
        if (mMo != null && (A0p = mMo.A0p()) != null) {
            return A0p;
        }
        throw new IOException();
    }
}
