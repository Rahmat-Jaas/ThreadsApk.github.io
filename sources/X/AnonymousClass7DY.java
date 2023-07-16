package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape138S0000000_2_I2;
import com.instagram.adsdatapreferences.consentgrowth.controller.IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.7DY  reason: invalid class name */
public final class AnonymousClass7DY {
    public final AnonymousClass3ED A00;
    public final C34640IcN A01;
    public final Map A02;
    public final UserSession A03;

    public static final void A00(AnonymousClass7DY r5, String str) {
        C63743iE A022 = C63743iE.A02("com.instagram.ads.cad_data_preferences.helpers.ads_personalization_screen_wrapper", C86124wJ.A0z(C18180wK.A0p("entry_point", str)));
        C34640IcN icN = r5.A01;
        FragmentActivity requireActivity = icN.requireActivity();
        IgBloksScreenConfig A0N = C18190wL.A0N(r5.A03);
        C18210wN.A0s(icN.requireActivity(), A0N, 2131824762);
        A022.A0C(requireActivity, A0N);
    }

    public static final void A01(AnonymousClass7DY r13, boolean z) {
        C31580Grx A012 = AnonymousClass3WK.A01(r13.A03);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        Boolean valueOf = Boolean.valueOf(z);
        A002.A03("is_account_opt_out", valueOf);
        A012.AMA(new PandoGraphQLRequest(C63233h2.A04(AnonymousClass0wJ.A1W(valueOf)), "IGAdsPreferencesIsOptedOutFromThirdPartyMutation", A002.getParamsCopy(), A003.getParamsCopy(), IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "update_ig_opt_out_from_third_party"), new IDxFCallbackShape138S0000000_2_I2(0));
    }

    public AnonymousClass7DY(AnonymousClass3ED r2, C34640IcN icN, UserSession userSession, Map map) {
        AnonymousClass0wJ.A1Q(userSession, r2);
        C04220Ms.A0B(map, 4);
        this.A01 = icN;
        this.A03 = userSession;
        this.A00 = r2;
        this.A02 = map;
    }
}
