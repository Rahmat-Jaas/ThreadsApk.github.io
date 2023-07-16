package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

/* renamed from: X.1ax  reason: invalid class name and case insensitive filesystem */
public final class C22881ax extends C34640IcN implements C11630kW, C82424pb, C82034oy, C84264sr {
    public static final String __redex_internal_original_name = "SafetyStepFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public String A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public C84654td A08;
    public C24711ju A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final C04530Oa A0C = C62373Zc.A03(new KtLambdaShape40S0100000_I2_20(this, 32));
    public final C04530Oa A0D = C62373Zc.A03(new KtLambdaShape40S0100000_I2_20(this, 33));
    public final C04530Oa A0E = C80644m9.A00(this);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final String getModuleName() {
        return "safety_step_fragment";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        this.A08 = C67293zJ.A01(this);
    }

    public static final void A00(C26743EUq eUq, C22881ax r9, String str) {
        String str2 = null;
        String str3 = null;
        String str4 = r9.A03;
        if (eUq.A06()) {
            str3 = ((C85814vo) eUq.A03()).getErrorMessage();
            str2 = ((C85814vo) eUq.A03()).getErrorType();
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r9.A00;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        } else {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("safety", str4, str, str3, str2, (Map) null, (Map) null, (Map) null));
        }
    }

    public static final void A01(C22881ax r11, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r11.A00;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        String str2 = r11.A03;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r11.A06) {
            A0y.put("hide_more_comments_setting", String.valueOf(r11.A05));
        }
        if (r11.A07) {
            A0y.put("hide_message_requests_setting", String.valueOf(r11.A04));
        }
        businessFlowAnalyticsLogger.Be5(new C37408JrQ("safety", str2, str, (String) null, (String) null, (Map) null, A0y, (Map) null));
    }

    public final void CCX() {
        A01(this, "continue");
        if (this.A06) {
            Context requireContext = requireContext();
            AnonymousClass06E A002 = AnonymousClass06E.A00(this);
            H1T A0O = AnonymousClass0wJ.A0O(AnonymousClass0wJ.A0U(this.A0E));
            A0O.A0J("accounts/set_comment_filter/");
            A0O.A0C(C85814vo.class, AnonymousClass3Za.class, true);
            A0O.A0K("config_value", this.A05 ? 1 : 0);
            C32165H8c A0Q = C18190wL.A0Q(A0O);
            C63873iU.A0E(A0Q, this, 21);
            C31155GhB.A01(requireContext, A002, A0Q);
        }
        if (this.A07) {
            C04530Oa r7 = this.A0E;
            UserSession A0X = AnonymousClass0wJ.A0X(r7);
            C04220Ms.A0B(A0X, 1);
            C37010Jil jil = new C37010Jil((C30087FzX) null);
            A0X.A01(C58303Ew.class, C75804cq.A00);
            if (!AnonymousClass3WI.A02(A0X) || !C35402Nh.A00(A0X).booleanValue()) {
                Context requireContext2 = requireContext();
                AnonymousClass06E A003 = AnonymousClass06E.A00(this);
                H1T A0O2 = AnonymousClass0wJ.A0O(AnonymousClass0wJ.A0U(r7));
                A0O2.A0J("accounts/set_hide_message_requests_global/");
                A0O2.A0C(C85814vo.class, AnonymousClass3Za.class, true);
                A0O2.A0K("config_value", this.A04 ? 1 : 0);
                C32165H8c A0Q2 = C18190wL.A0Q(A0O2);
                C63873iU.A0E(A0Q2, this, 22);
                C31155GhB.A01(requireContext2, A003, A0Q2);
            } else {
                boolean z = this.A04;
                AnonymousClass3WI.A01(jil, A0X, new C69984Bt(this), z);
                C18230wP.A1K(A0X, AnonymousClass0wJ.A0Y(A0X), z);
            }
        }
        C62423Zt.A01(this, AnonymousClass0wJ.A0X(this.A0E), "igwb", "primary_button_did_tapped", (String) null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        String str = this.A03;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (this.A06) {
            A0y.put("hide_more_comments_setting", String.valueOf(this.A05));
        }
        if (this.A07) {
            A0y.put("hide_message_requests_setting", String.valueOf(this.A04));
        }
        businessFlowAnalyticsLogger.BcE(new C37408JrQ("safety", str, (String) null, (String) null, (String) null, (Map) null, A0y, (Map) null));
        C84654td r0 = this.A08;
        if (r0 != null) {
            ((BusinessConversionActivity) r0).Bel((Bundle) null);
        }
        this.A0D.getValue();
    }

    public final void CJ9() {
        A01(this, "skip");
        C62423Zt.A01(this, AnonymousClass0wJ.A0X(this.A0E), "igwb", "secondary_button_did_tapped", (String) null);
        C84654td r1 = this.A08;
        if (r1 != null) {
            ((BusinessConversionActivity) r1).A0J((Bundle) null, true);
        }
        this.A0D.getValue();
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
        }
        if (!AnonymousClass0wJ.A1X(this.A0C.getValue()) && r3 != null) {
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 166);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0E);
    }

    public final boolean onBackPressed() {
        C84654td r0 = this.A08;
        if (r0 == null) {
            return true;
        }
        C18230wP.A1Q(r0);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        C311924p r2;
        int A022 = C14030oh.A02(335311956);
        super.onCreate(bundle);
        this.A03 = C18190wL.A0k(this);
        C04620Ok r1 = C06810aP.A01;
        C04530Oa r3 = this.A0E;
        User A012 = r1.A01(AnonymousClass0wJ.A0X(r3));
        Boolean A0i = A012.A0i();
        if (A0i != null) {
            this.A06 = !A0i.booleanValue();
        }
        boolean z = !A012.A3X();
        this.A07 = z;
        if (!z && !this.A06) {
            this.A07 = true;
            this.A06 = true;
            C10450iM.A03("safety_step_fragment", "Both settings are already on");
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3);
        C84654td r12 = this.A08;
        String str = null;
        if (r12 != null) {
            r2 = r12.Aiz();
        } else {
            r2 = C311924p.SHORTENED_CREATOR_CONVERSION_FLOW;
        }
        C84654td r13 = this.A08;
        if (r13 != null) {
            str = C18200wM.A0q(((BusinessConversionActivity) r13).A0B);
        }
        BusinessFlowAnalyticsLogger A002 = C37076Jk8.A00(r2, this, A0U, str);
        if (A002 != null) {
            this.A00 = A002;
            C14030oh.A09(-621006612, A022);
            return;
        }
        IllegalStateException A0a = C18180wK.A0a("received null flowType or unexpected value for flowType");
        C14030oh.A09(-222337591, A022);
        throw A0a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010e, code lost:
        if (r14.A06 == false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = -334002398(0xffffffffec178722, float:-7.327438E26)
            int r2 = X.C14030oh.A02(r0)
            r3 = 0
            X.C04220Ms.A0B(r15, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r4 = r14.A00
            if (r4 != 0) goto L_0x0014
            X.C18240wQ.A0p()
            r0 = 0
            throw r0
        L_0x0014:
            java.lang.String r6 = "safety"
            r8 = 0
            java.lang.String r7 = r14.A03
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            X.0Ok r1 = X.C06810aP.A01
            X.0Oa r0 = r14.A0E
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.user.model.User r5 = r1.A01(r0)
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0040
            java.lang.Boolean r0 = r5.A0i()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x003b:
            java.lang.String r0 = "hide_more_comments_setting"
            r11.put(r0, r1)
        L_0x0040:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.A3X()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hide_message_requests_setting"
            r11.put(r0, r1)
        L_0x0051:
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.Bdt(r5)
            r0 = 2131496988(0x7f0c101c, float:1.8617556E38)
            r1 = r16
            android.view.View r5 = r15.inflate(r0, r1, r3)
            r0 = 2131306510(0x7f09280e, float:1.8231221E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r5, r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0147
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x013c
            r0 = 2131835106(0x7f1138e2, float:1.9303341E38)
            r1.setHeadline((int) r0)
            r0 = 2131835105(0x7f1138e1, float:1.930334E38)
        L_0x0080:
            r1.setBody((int) r0)
            r0 = 2131232087(0x7f080557, float:1.8080273E38)
            r1.A08(r0, r3)
            r0 = 2131301424(0x7f091430, float:1.8220905E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0136
            r14.A02 = r4
            r4.setVisibility(r3)
            X.24V r0 = X.AnonymousClass24V.TYPE_SWITCH
            r4.setTextCellType(r0)
            r0 = 2131232248(0x7f0805f8, float:1.80806E38)
            r4.A05(r0)
            r0 = 2131835116(0x7f1138ec, float:1.9303361E38)
            java.lang.String r0 = X.C18180wK.A0g(r14, r0)
            r4.A0H(r0)
            boolean r1 = r14.A06
            r0 = 2131835109(0x7f1138e5, float:1.9303347E38)
            if (r1 == 0) goto L_0x00ba
            r0 = 2131835114(0x7f1138ea, float:1.9303357E38)
        L_0x00ba:
            java.lang.String r0 = X.C18180wK.A0g(r14, r0)
            r4.A0G(r0)
            boolean r0 = r14.A04
            r4.setChecked(r0)
            r0 = 7
            X.C18230wP.A1N(r4, r14, r0)
        L_0x00ca:
            r0 = 2131301426(0x7f091432, float:1.822091E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r5, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0130
            r14.A01 = r1
            r1.setVisibility(r3)
            X.24V r0 = X.AnonymousClass24V.TYPE_SWITCH
            r1.setTextCellType(r0)
            r0 = 2131232587(0x7f08074b, float:1.8081287E38)
            r1.A05(r0)
            r0 = 2131835113(0x7f1138e9, float:1.9303355E38)
            java.lang.String r0 = X.C18180wK.A0g(r14, r0)
            r1.A0H(r0)
            r0 = 2131835112(0x7f1138e8, float:1.9303353E38)
            java.lang.String r0 = X.C18180wK.A0g(r14, r0)
            r1.A0G(r0)
            boolean r0 = r14.A05
            r1.setChecked(r0)
            r0 = 8
            X.C18230wP.A1N(r1, r14, r0)
        L_0x0105:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0110
            boolean r0 = r14.A06
            r4 = 2131835110(0x7f1138e6, float:1.930335E38)
            if (r0 != 0) goto L_0x0113
        L_0x0110:
            r4 = 2131835111(0x7f1138e7, float:1.9303351E38)
        L_0x0113:
            r3 = 2131831869(0x7f112c3d, float:1.9296776E38)
            r0 = 2131297577(0x7f090529, float:1.8213103E38)
            android.view.View r1 = r5.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1
            X.1ju r0 = new X.1ju
            r0.<init>((X.C84264sr) r14, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r1, (int) r4, (int) r3)
            r14.A09 = r0
            r14.registerLifecycleListener(r0)
            r0 = 1995151414(0x76eb9836, float:2.3892128E33)
            X.C14030oh.A09(r0, r2)
            return r5
        L_0x0130:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0105
        L_0x0136:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x00ca
        L_0x013c:
            r0 = 2131835104(0x7f1138e0, float:1.9303337E38)
            r1.setHeadline((int) r0)
            r0 = 2131835103(0x7f1138df, float:1.9303335E38)
            goto L_0x0080
        L_0x0147:
            r0 = 2131835108(0x7f1138e4, float:1.9303345E38)
            r1.setHeadline((int) r0)
            r0 = 2131835107(0x7f1138e3, float:1.9303343E38)
            goto L_0x0080
        L_0x0152:
            r1 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22881ax.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-831642313);
        super.onDestroyView();
        C24711ju r0 = this.A09;
        if (r0 == null) {
            C04220Ms.A0E("businessNavBarHelper");
            throw null;
        }
        unregisterLifecycleListener(r0);
        C14030oh.A09(1831060114, A022);
    }

    public final void onStart() {
        String str;
        int A022 = C14030oh.A02(817817808);
        super.onStart();
        boolean z = this.A0B;
        this.A05 = z;
        this.A04 = this.A0A;
        if (this.A06) {
            IgdsListCell igdsListCell = this.A01;
            if (igdsListCell == null) {
                str = "commentSwitch";
                C04220Ms.A0E(str);
                throw null;
            }
            igdsListCell.setChecked(z);
        }
        if (this.A07) {
            IgdsListCell igdsListCell2 = this.A02;
            if (igdsListCell2 == null) {
                str = "messageSwitch";
                C04220Ms.A0E(str);
                throw null;
            }
            igdsListCell2.setChecked(this.A04);
        }
        C14030oh.A09(-1859739362, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1345090128);
        this.A0B = this.A05;
        this.A0A = this.A04;
        super.onStop();
        C14030oh.A09(1214529011, A022);
    }
}
