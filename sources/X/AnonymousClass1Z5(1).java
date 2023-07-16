package X;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.instagram.barcelona.R;

/* renamed from: X.1Z5  reason: invalid class name */
public final class AnonymousClass1Z5 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "IgMeShortUrlFragment";
    public C10300i6 A00;
    public final Handler A01 = C18250wR.A08();

    public final String getModuleName() {
        return "ig_me_short_url";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.Cjt(C05030Qo.A03(this.A00), R.layout.action_bar_title_logo, C18220wO.A03(AnonymousClass0wJ.A0B(this)), 0);
        r5.CtT(true);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-650061888);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(requireArguments());
        String string = requireArguments().getString("com.instagram.android.fragment.ARGUMENTS_KEY_SHORT_CODE");
        if (!TextUtils.isEmpty(string)) {
            H1T A0O = C18180wK.A0O(this.A00);
            A0O.A0J("notifications/shorturl/");
            A0O.A0O("short_code", string);
            C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0O, AnonymousClass1SG.class, AnonymousClass3MX.class), 174);
        } else {
            C63753iH.A02(getActivity(), this.mArguments);
        }
        C14030oh.A09(-181127773, A02);
    }
}
