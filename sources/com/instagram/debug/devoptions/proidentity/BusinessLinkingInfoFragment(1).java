package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass2KD;
import X.AnonymousClass3C3;
import X.AnonymousClass3I4;
import X.AnonymousClass3LA;
import X.AnonymousClass3LY;
import X.AnonymousClass3W9;
import X.AnonymousClass3WK;
import X.AnonymousClass42T;
import X.AnonymousClass4n8;
import X.AnonymousClass4u2;
import X.AnonymousClass671;
import X.AnonymousClass6QR;
import X.AnonymousClass70P;
import X.AnonymousClass70Q;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7J3;
import X.AnonymousClass7JS;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.AnonymousClass7WY;
import X.C04220Ms;
import X.C04530Oa;
import X.C101176Qe;
import X.C10300i6;
import X.C110456li;
import X.C115656vh;
import X.C120537Bh;
import X.C120767Cj;
import X.C14030oh;
import X.C146288ly;
import X.C146348m5;
import X.C147178nW;
import X.C147188nY;
import X.C147258p3;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C210618t;
import X.C31580Grx;
import X.C34640IcN;
import X.C564137c;
import X.C564437f;
import X.C564537g;
import X.C564637h;
import X.C571039t;
import X.C61533Tu;
import X.C62633aR;
import X.C63233h2;
import X.C63813iO;
import X.C67463zb;
import X.C689346a;
import X.C689446b;
import X.C78784iz;
import X.C81354ne;
import X.C82034oy;
import X.C82394pY;
import X.C84134sb;
import X.C968666z;
import X.C98236Es;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.business.onelink.queries.businessaccount.IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl;
import com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkLoggedOutWAMiddlewareQueryResponseImpl;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

public final class BusinessLinkingInfoFragment extends C34640IcN implements C82034oy, CallerContextable {
    public static final int $stable = 8;
    public final CallerContext CALLER_CONTEXT;
    public C81354ne authConfig = AnonymousClass42T.A00;
    public final C82394pY bizAccountInfoListener;
    public final KtCSuperShape0S4100000_I2 callerInfo;
    public final C82394pY fbPageInfoListener;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public String getModuleName() {
        return "business_linking_info";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        registerEventListeners();
    }

    /* access modifiers changed from: private */
    public final void clearAdAccountInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00.getValue()).AD5(this.callerInfo);
    }

    /* access modifiers changed from: private */
    public final void clearBizAccountInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A01.getValue()).AD5(this.callerInfo);
    }

    /* access modifiers changed from: private */
    public final void clearFBPageInfo() {
        AnonymousClass3LA.A01(AnonymousClass0wJ.A0X(this.userSession$delegate)).AD5(this.callerInfo);
    }

    /* access modifiers changed from: private */
    public final void clearWhatsAppBizInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A03.getValue()).AD5(this.callerInfo);
    }

    /* access modifiers changed from: private */
    public final void fetchNewAdAccountInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00.getValue()).AML(this.callerInfo, this.authConfig, new BusinessLinkingInfoFragment$fetchNewAdAccountInfo$1(this));
    }

    /* access modifiers changed from: private */
    public final void fetchNewBizAccountInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A01.getValue()).AML(this.callerInfo, this.authConfig, new BusinessLinkingInfoFragment$fetchNewBizAccountInfo$1(this));
    }

    /* access modifiers changed from: private */
    public final void fetchNewBizAccountInfoCustom() {
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        C04220Ms.A0B(A0X, 0);
        C564437f r6 = new C564437f(A0X);
        KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2 = this.callerInfo;
        C81354ne r1 = this.authConfig;
        BusinessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1 businessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1 = new BusinessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1(this);
        C04220Ms.A0B(ktCSuperShape0S4100000_I2, 0);
        C04220Ms.A0B(r1, 1);
        C61533Tu r5 = C61533Tu.A00;
        UserSession userSession = r6.A00;
        if (r5.A00(userSession, ktCSuperShape0S4100000_I2.A01)) {
            C31580Grx A01 = AnonymousClass3WK.A01(userSession);
            C564137c r52 = new C564137c(userSession);
            KtLambdaShape40S0100000_I2_20 ktLambdaShape40S0100000_I2_20 = new KtLambdaShape40S0100000_I2_20(r6, 48);
            C564137c r16 = r52;
            AnonymousClass3C3 r15 = new AnonymousClass3C3(r16, (C62633aR) r6.A01.getValue(), A01, ktLambdaShape40S0100000_I2_20, C78784iz.A00);
            GQLCallInputCInputShape0S0000000 A00 = AnonymousClass2KD.A00(ktCSuperShape0S4100000_I2, r1);
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            C67463zb.A01(A00, A002);
            r15.A02.A07(new PandoGraphQLRequest(C63233h2.A01(), "IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQuery", A002.getParamsCopy(), A003.getParamsCopy(), IGOneLinkMiddlewareBusinessAccountWithBusinessInfoQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, C18170wI.A00(530)), new IDxACallbackShape5S0400000_1_I2(6, r1, businessLinkingInfoFragment$fetchNewBizAccountInfoCustom$1, r15, ktCSuperShape0S4100000_I2));
        }
    }

    /* access modifiers changed from: private */
    public final void fetchNewFBPageInfo() {
        AnonymousClass3LA.A01(AnonymousClass0wJ.A0X(this.userSession$delegate)).AML(this.callerInfo, this.authConfig, new BusinessLinkingInfoFragment$fetchNewFBPageInfo$1(this));
    }

    /* access modifiers changed from: private */
    public final void fetchNewWhatsAppBizInfo() {
        ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A03.getValue()).AML(this.callerInfo, this.authConfig, new BusinessLinkingInfoFragment$fetchNewWhatsAppBizInfo$1(this));
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void lookupWhatsAppBizInfo() {
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        C04220Ms.A0B(A0X, 0);
        C564537g r6 = new C564537g(new AnonymousClass3I4(A0X, AnonymousClass006.A01), A0X);
        KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2 = this.callerInfo;
        String userId = AnonymousClass0wJ.A0X(this.userSession$delegate).getUserId();
        BusinessLinkingInfoFragment$lookupWhatsAppBizInfo$1 businessLinkingInfoFragment$lookupWhatsAppBizInfo$1 = new BusinessLinkingInfoFragment$lookupWhatsAppBizInfo$1(this);
        boolean A1Z = AnonymousClass0wJ.A1Z(ktCSuperShape0S4100000_I2, userId);
        C61533Tu r1 = C61533Tu.A00;
        UserSession userSession = r6.A01;
        if (!r1.A00(userSession, ktCSuperShape0S4100000_I2.A01)) {
            r6.A00.A00(ktCSuperShape0S4100000_I2, AnonymousClass42T.A00);
            return;
        }
        String str = ((CallerContext) ktCSuperShape0S4100000_I2.A00).A02;
        C04220Ms.A06(str);
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        A00.A0F(str, "caller");
        String A002 = C18170wI.A00(1071);
        A00.A0F(A002, A002);
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0B(A00, C18170wI.A00(319));
        A003.A0F(userId, "id");
        A003.A0F("IG_USER", AnonymousClass000.A00(935));
        C67463zb A004 = C67463zb.A00();
        C67463zb A005 = C67463zb.A00();
        C67463zb.A01(A003, A004);
        AnonymousClass3WK.A01(userSession).A07(new PandoGraphQLRequest(C63233h2.A01(), "IGOneLinkLoggedOutWAMiddlewareQuery", A004.getParamsCopy(), A005.getParamsCopy(), IGOneLinkLoggedOutWAMiddlewareQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_logged_out_whatsapp_info_monoschema"), new IDxACallbackShape15S0300000_1_I2(A1Z ? 1 : 0, (Object) ktCSuperShape0S4100000_I2, (Object) r6, (Object) businessLinkingInfoFragment$lookupWhatsAppBizInfo$1));
    }

    /* access modifiers changed from: private */
    public final void readCurrentAdAccountInfo() {
        String str;
        C571039t r0 = (C571039t) ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00.getValue()).AbO(this.callerInfo);
        if (r0 != null) {
            str = toReadableInfo(r0);
        } else {
            str = "No Stored Ad Account Info";
        }
        C63813iO.A0B(getContext(), str);
    }

    /* access modifiers changed from: private */
    public final void readCurrentBizAccountInfo() {
        C564637h r0 = (C564637h) ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A01.getValue()).AbO(this.callerInfo);
        if (r0 == null || C63813iO.A02(getContext(), r0.A00, (String) null, 0) == null) {
            C63813iO.A0B(getContext(), "No Stored Biz Account Info");
        }
    }

    /* access modifiers changed from: private */
    public final void readCurrentFBPageInfo() {
        Object AbO = AnonymousClass3LA.A01(AnonymousClass0wJ.A0X(this.userSession$delegate)).AbO(this.callerInfo);
        if (AbO == null || C63813iO.A02(getContext(), AbO.toString(), (String) null, 0) == null) {
            C63813iO.A0B(getContext(), C18170wI.A00(697));
        }
    }

    /* access modifiers changed from: private */
    public final void readCurrentWhatsAppBizInfo() {
        String str;
        C110456li r0 = (C110456li) ((C84134sb) AnonymousClass3LA.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A03.getValue()).AbO(this.callerInfo);
        if (r0 != null) {
            str = toReadableInfo(r0);
        } else {
            str = "No Stored WABiz Info";
        }
        C63813iO.A0B(getContext(), str);
    }

    private final void registerEventListeners() {
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A01(this.fbPageInfoListener, C689446b.class);
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A01(this.bizAccountInfoListener, C689346a.class);
    }

    /* access modifiers changed from: private */
    public final String toReadableInfo(C110456li r3) {
        StringBuilder A0s = C18190wL.A0s("WhatsAppInfo:\n          |accountType = ");
        String str = r3.A01;
        if (str == null) {
            str = "Unknown";
        }
        A0s.append(str);
        A0s.append("\n          |isRisky = ");
        A0s.append(r3.A03);
        A0s.append("\n          |isBanned = ");
        A0s.append(r3.A04);
        A0s.append("\n          |isVerificationEnabled = ");
        A0s.append(r3.A02);
        return AnonymousClass4n8.A09(C18180wK.A0i("\n          |}", A0s), "|");
    }

    /* access modifiers changed from: private */
    public final void toggleAuthConfigType() {
        C81354ne r0;
        String str;
        if (this.authConfig instanceof AnonymousClass42T) {
            r0 = new C210618t();
        } else {
            r0 = AnonymousClass42T.A00;
        }
        C81354ne r02 = r0;
        this.authConfig = r02;
        if (r02 instanceof AnonymousClass42T) {
            str = "AuthConfig is BusinessPersonAuthConfig";
        } else {
            str = "AuthConfig is not BusinessPersonAuthConfig";
        }
        C63813iO.A0B(getContext(), str);
    }

    private final void unregisterEventListeners() {
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A02(this.fbPageInfoListener, C689446b.class);
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A02(this.bizAccountInfoListener, C689346a.class);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            r2.Cqb(2131825007);
            r2.CtT(C18180wK.A1X(getParentFragmentManager().A0I()));
        }
    }

    public C10300i6 getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public BusinessLinkingInfoFragment() {
        CallerContext callerContext = new CallerContext(BusinessLinkingInfoFragment.class);
        this.CALLER_CONTEXT = callerContext;
        this.callerInfo = new KtCSuperShape0S4100000_I2(callerContext, "callerName", "entryPoint", "flow", OptSvcAnalyticsStore.LOGGING_KEY_STEP);
        this.fbPageInfoListener = new BusinessLinkingInfoFragment$fbPageInfoListener$1(this);
        this.bizAccountInfoListener = new BusinessLinkingInfoFragment$bizAccountInfoListener$1(this);
    }

    /* access modifiers changed from: private */
    public final void BizInfoButton(AnonymousClass0ZU r16, String str, C147188nY r18, int i) {
        int i2;
        C147188nY r5 = r18;
        r5.Cvd(-226418618);
        int i3 = i;
        AnonymousClass0ZU r10 = r16;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r5, r10) | i;
        } else {
            i2 = i3;
        }
        String str2 = str;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r5, str2);
        }
        if ((i2 & 91) != 18 || !r5.BCM()) {
            C146348m5 A01 = AnonymousClass70Q.A01(r5, 1, false);
            AnonymousClass70P.A00((C147258p3) null, r5, Modifier.A04(Modifier.A00), C968666z.LARGE, A01, str2, r10, 1573248 | (i2 & 14) | (i2 & 112), 152, false, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new BusinessLinkingInfoFragment$BizInfoButton$1(this, r10, str2, i3));
        }
    }

    /* access modifiers changed from: private */
    public final void BuildDebugOptionList(C147188nY r19, int i) {
        C147188nY r8 = r19;
        r8.Cvd(-151048448);
        Modifier A01 = AnonymousClass7Ad.A01(AnonymousClass7Ad.A00(r8), Modifier.A04(Modifier.A00));
        C146288ly A03 = AnonymousClass7KV.A03(AnonymousClass7J3.A01((float) 8), r8);
        Object A0p = C147188nY.A0p(r8);
        Object A0n = C147188nY.A0n(r8);
        Object A0m = C147188nY.A0m(r8);
        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
        AnonymousClass0YM A00 = C98236Es.A00(A01);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r8;
        C147188nY.A0w(r8, r4, r1);
        AnonymousClass7W3.A0a(r8, r4, A03, A0p);
        AnonymousClass7KP.A07(r8, A0n, A0m, A00);
        r8.Cvb(1242290422);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$1(this), AnonymousClass7JS.A01(r8, 2131825221), r8, 512);
        C101176Qe.A00(r8, (Modifier) null, (AnonymousClass671) null, AnonymousClass7JS.A01(r8, 2131825202), (String) null, (AnonymousClass0ZU) null, 0, 126, false, false);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$2(this), AnonymousClass7JS.A01(r8, 2131825218), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$3(this), AnonymousClass7JS.A01(r8, 2131825214), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$4(this), AnonymousClass7JS.A01(r8, 2131825209), r8, 512);
        Separator(r8, 8);
        C101176Qe.A00(r8, (Modifier) null, (AnonymousClass671) null, AnonymousClass7JS.A01(r8, 2131825205), (String) null, (AnonymousClass0ZU) null, 0, 126, false, false);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$5(this), AnonymousClass7JS.A01(r8, 2131825219), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$6(this), AnonymousClass7JS.A01(r8, 2131825215), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$7(this), AnonymousClass7JS.A01(r8, 2131825210), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$8(this), AnonymousClass7JS.A01(r8, 2131825220), r8, 512);
        Separator(r8, 8);
        C101176Qe.A00(r8, (Modifier) null, (AnonymousClass671) null, AnonymousClass7JS.A01(r8, 2131825200), (String) null, (AnonymousClass0ZU) null, 0, 126, false, false);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$9(this), AnonymousClass7JS.A01(r8, 2131825217), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$10(this), AnonymousClass7JS.A01(r8, 2131825213), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$11(this), AnonymousClass7JS.A01(r8, 2131825212), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$12(this), AnonymousClass7JS.A01(r8, 2131825208), r8, 512);
        Separator(r8, 8);
        C101176Qe.A00(r8, (Modifier) null, (AnonymousClass671) null, AnonymousClass7JS.A01(r8, 2131825199), (String) null, (AnonymousClass0ZU) null, 0, 126, false, false);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$13(this), AnonymousClass7JS.A01(r8, 2131825211), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$14(this), AnonymousClass7JS.A01(r8, 2131825216), r8, 512);
        BizInfoButton(new BusinessLinkingInfoFragment$BuildDebugOptionList$1$15(this), AnonymousClass7JS.A01(r8, 2131825207), r8, 512);
        Separator(r8, 8);
        AnonymousClass7W3.A0f(r4);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new BusinessLinkingInfoFragment$BuildDebugOptionList$2(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void Separator(C147188nY r5, int i) {
        r5.Cvd(1958527279);
        if ((i & 1) != 0 || !r5.BCM()) {
            C120767Cj.A01(r5, C115656vh.A00(AnonymousClass7Kq.A08(Modifier.A04(Modifier.A00), (float) 2), C120537Bh.A00(r5).A0p), 0);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new BusinessLinkingInfoFragment$Separator$1(this, i));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1258449582);
        ComposeView A00 = AnonymousClass6QR.A00(this, AnonymousClass7WY.A00(new BusinessLinkingInfoFragment$onCreateView$1(this), 882965248));
        C14030oh.A09(290766478, A02);
        return A00;
    }

    public void onDestroyView() {
        int A02 = C14030oh.A02(640947510);
        super.onDestroyView();
        unregisterEventListeners();
        C14030oh.A09(447895722, A02);
    }

    /* access modifiers changed from: private */
    public final String toReadableInfo(C571039t r4) {
        StringBuilder A0s = C18190wL.A0s("AdAccountInfo:\n          |accountId = ");
        Object obj = r4.A00;
        Object obj2 = "None";
        if (obj == null) {
            obj = obj2;
        }
        A0s.append(obj);
        A0s.append("\n          |name = ");
        A0s.append(r4.A02);
        A0s.append("\n          |legacyAccountId = ");
        Object obj3 = r4.A01;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0s.append(obj2);
        return AnonymousClass4n8.A09(C18180wK.A0i("\n          |}", A0s), "|");
    }
}
