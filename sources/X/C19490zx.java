package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4300000_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape44S0100000_I2_24;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
public final class C19490zx extends C62793ak {
    public final M5J A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final C04530Oa A04;

    public C19490zx(UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        String str3 = C37741K2b.A01(userSession).A03;
        C04220Ms.A06(str3);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("ads/ads_manager/fetch_promotion_information_v2/");
        A0O.A0O("media_id", str);
        A0O.A0O("fb_auth_token", str2);
        A0O.A0P("flow_id", str3);
        C25817DsW.A06(AnonymousClass3J5.A00(this), C04220Ms.A0B(AnonymousClass0wJ.A0T(A0O, C22151To.class, AnonymousClass3LG.class), 0));
        C04530Oa A022 = AnonymousClass0OY.A02(new KtLambdaShape44S0100000_I2_24(this, 26));
        this.A04 = A022;
        IDxFlowShape93S0200000_1_I2 iDxFlowShape93S0200000_1_I2 = new IDxFlowShape93S0200000_1_I2(1, (Object) this, (Object) new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape7S0200000_I2_2(this, (C146958n9) null, 5), (C84714tk) A022.getValue(), 34));
        this.A00 = C29110FiC.A00((C27952Ew2) null, C25753DrP.A04(new AnonymousClass175((KtCSuperShape0S4300000_I2) null, false), AnonymousClass3J5.A00(this), iDxFlowShape93S0200000_1_I2, AnonymousClass74I.A00), 3);
    }
}
