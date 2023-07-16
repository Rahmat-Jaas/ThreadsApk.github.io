package X;

import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.1nw  reason: invalid class name and case insensitive filesystem */
public final class C25601nw extends C12140lP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C82564pu A01;
    public final /* synthetic */ C67063yo A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25601nw(Context context, C82564pu r8, C67063yo r9, String str) {
        super("MultiNativeAuthVerification", 1206645857, 4, true, true);
        this.A02 = r9;
        this.A00 = context;
        this.A03 = str;
        this.A01 = r8;
    }

    public final void loggedRun() {
        C67063yo r3 = this.A02;
        Context context = this.A00;
        String str = this.A03;
        C82564pu r2 = this.A01;
        C04220Ms.A0B(str, 1);
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        A002.A03("use_fx_upsell_eligibility_checker", false);
        A002.A03("impression_limit_check_enabled", true);
        A002.A03("recently_seen_check_enabled", true);
        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
        AnonymousClass44X A005 = AnonymousClass44X.A00();
        UserSession userSession = r3.A01;
        String A032 = A005.A03(userSession, "ig_android_access_library_fx_ac_eligibility_token_verification");
        if (A032 == null) {
            List A033 = C63693i8.A03(context, userSession, "ig_android_access_library_fx_ac_eligibility_token_verification", userSession.getUserId());
            if (!A033.isEmpty()) {
                A033.get(0);
                A032 = ((AnonymousClass3H2) A033.get(0)).A01.A00;
            } else {
                A032 = null;
            }
        }
        GraphQlCallInput.A05(A004, A032, "sensitive_string_value");
        A002.A02(A004, "native_token");
        A002.A05("entry_point", str);
        A002.A05("target_account_type", "FACEBOOK");
        A002.A05("holdout_type", "H1_2022");
        AnonymousClass7Ko.A0B(true);
        AnonymousClass7Ko.A0B(true);
        AnonymousClass7Ko.A0B(true);
        C18250wR.A12(new PandoGraphQLRequest(C63233h2.A03(true), "IGFXGrowthACUpsellEligibilityConfigQuery", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), IGFXGrowthACUpsellEligibilityConfigQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fx_growth"), r3.A00, r2, 11);
    }
}
