package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.user.model.User;

/* renamed from: X.43w  reason: invalid class name and case insensitive filesystem */
public final class C684543w implements C11630kW {
    public static final String __redex_internal_original_name = "TransparencyLogger";
    public C13330nS A00;

    public final String getModuleName() {
        return AnonymousClass3Q7.A00(19, 12, 67);
    }

    public final void A00(C29027Fgb fgb, User user, String str, boolean z) {
        C318829i r3;
        if (z) {
            r3 = C318829i.OPENED_BOTTOMSHEET;
        } else {
            r3 = C318829i.VIEWED;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "ig_authenticity_consumer"), 801);
        C18220wO.A1E(r3, A0I);
        A0I.A0O(fgb, "screen");
        A0I.A0S("target_user_id", AnonymousClass0wJ.A0d(user.getId()));
        if (user.A1M() != null) {
            A0I.A0T("product", user.A1M());
        }
        if (str != null) {
            A0I.A0S("post_id", AnonymousClass0wJ.A0d(str));
        }
        A0I.Bb4();
    }

    public C684543w(C10300i6 r2) {
        this.A00 = C13330nS.A01(this, r2);
    }
}
