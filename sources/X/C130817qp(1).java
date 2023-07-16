package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.7qp  reason: invalid class name and case insensitive filesystem */
public final class C130817qp implements C147078nM {
    public final MMo A00;
    public final C130857qt A01 = new C130857qt();

    public final Object Acn() {
        return this.A00;
    }

    public final Integer Bhu() {
        this.A00.A0g();
        return CWR();
    }

    public final String CWO() {
        String A0o = this.A00.A0o();
        if (A0o != null) {
            return A0o;
        }
        throw C86154wM.A0V("Parsed field has unexpected null name");
    }

    public final Integer CWR() {
        C40318LcR A0f = this.A00.A0f();
        if (A0f != null) {
            switch (A0f.ordinal()) {
                case 0:
                    return AnonymousClass006.A02;
                case 1:
                    return AnonymousClass006.A0C;
                case 2:
                    return AnonymousClass006.A0N;
                case 3:
                    return AnonymousClass006.A00;
                case 4:
                    return AnonymousClass006.A01;
                case 5:
                    return AnonymousClass006.A0Y;
                case 6:
                    throw C18180wK.A0a("embedded object is not supported");
                case 7:
                    return AnonymousClass006.A0j;
                case 8:
                case 9:
                    return AnonymousClass006.A15;
                case 10:
                case 11:
                    return AnonymousClass006.A1C;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    return AnonymousClass006.A1L;
            }
        }
        throw C18180wK.A0a(AnonymousClass0wJ.A0t("unknown token", A0f));
    }

    public final C146328m3 CWS() {
        C130857qt r1 = this.A01;
        r1.A00 = this.A00;
        return r1;
    }

    public final void CuL() {
        this.A00.A0x();
    }

    public C130817qp(MMo mMo) {
        this.A00 = mMo;
    }
}
