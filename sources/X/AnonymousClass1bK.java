package X;

import android.os.Bundle;

/* renamed from: X.1bK  reason: invalid class name */
public abstract class AnonymousClass1bK extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "DataDownloadBaseFragment";
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C12560m7 r0;
        if (this instanceof C28751uv) {
            C28751uv r1 = (C28751uv) this;
            C09860go.A0I(r1.A02);
            r0 = r1.mFragmentManager;
        } else if (this instanceof C28741uu) {
            C12560m7 r12 = this.mFragmentManager;
            if (r12 == null || r12.A0I() <= 0 || r12.A0F) {
                C18210wN.A14(this);
                return true;
            }
            r12.A1C((String) null, 1);
            return true;
        } else {
            r0 = this.mFragmentManager;
        }
        r0.A16();
        return true;
    }

    public void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A07(r3, 2131827934);
        r3.Crl(C18190wL.A0L(C18180wK.A0N(), this, 269));
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1449483412);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(this.mArguments);
        C24731jw.A01(this);
        C14030oh.A09(1114717213, A02);
    }
}
