package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1bi  reason: invalid class name and case insensitive filesystem */
public final class C22981bi extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "CreatePostFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public C84654td A05;
    public BusinessNavBar A06;
    public String A07;
    public String A08;

    public final String getModuleName() {
        return "create_post_fragment";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("create_post", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.Crj(C18190wL.A0H(this, 133), R.drawable.instagram_x_pano_outline_24).setColorFilter(C63393hP.A00(C121907Is.A00(getContext(), R.attr.textColorPrimary)));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100 && i != 100 && i != 101 && i != 102) {
            return;
        }
        if (i2 == -1 || i2 == 9683) {
            C18180wK.A12(this);
            AnonymousClass3LY.A00(this.A01).CWx(new C688545s());
            AnonymousClass3LY.A00(this.A01).CWx(new C688345q());
            if (getContext() instanceof Activity) {
                getRootActivity();
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A05 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-641466168);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A01 = C18180wK.A0V(A072);
        this.A02 = A072.getString("entry_point");
        this.A08 = A072.getString("ARG_TITLE", requireContext().getString(2131835642));
        this.A07 = A072.getString("ARG_SUB_TITLE", requireContext().getString(2131835641));
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A05, this, this.A01);
        this.A00 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("create_post", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(532475056, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (r14.A03 != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = -1505111734(0xffffffffa649d14a, float:-7.0019523E-16)
            int r9 = X.C14030oh.A02(r0)
            r0 = 2131497210(0x7f0c10fa, float:1.8618007E38)
            r4 = 0
            r1 = r16
            android.view.View r10 = r15.inflate(r0, r1, r4)
            com.instagram.service.session.UserSession r2 = r14.A01
            r11 = 0
            X.C04220Ms.A0B(r2, r4)
            r0 = 36315808208522043(0x81050900000b3b, double:3.0296015708670415E-306)
            X.0e5 r0 = X.AnonymousClass0e5.A00(r0)
            r5 = 1
            java.lang.Object r0 = X.C67333zN.A00(r2, r0, r5)
            X.C04220Ms.A06(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r14.A03 = r0
            com.instagram.service.session.UserSession r2 = r14.A01
            X.C04220Ms.A0B(r2, r4)
            r0 = 36315808208587580(0x81050900010b3c, double:3.0296015709084873E-306)
            boolean r0 = X.C67333zN.A06(r2, r0, r5)
            r14.A04 = r0
            if (r0 != 0) goto L_0x0045
            boolean r0 = r14.A03
            r2 = 0
            if (r0 == 0) goto L_0x0053
        L_0x0045:
            r2 = 1
            android.content.Context r1 = r14.requireContext()
            r0 = 2131835640(0x7f113af8, float:1.9304424E38)
            java.lang.String r0 = r1.getString(r0)
            r14.A08 = r0
        L_0x0053:
            boolean r0 = r14.A03
            boolean r3 = r14.A04
            if (r0 == 0) goto L_0x01af
            android.content.Context r1 = r14.requireContext()
            r0 = 2131835637(0x7f113af5, float:1.9304418E38)
            if (r3 == 0) goto L_0x0065
            r0 = 2131835639(0x7f113af7, float:1.9304422E38)
        L_0x0065:
            java.lang.String r0 = r1.getString(r0)
            r14.A07 = r0
        L_0x006b:
            r0 = 2131307406(0x7f092b8e, float:1.8233038E38)
            com.instagram.igds.components.headline.IgdsHeadline r3 = X.C18240wQ.A0S(r10, r0)
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x0080
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0080
            r0 = 2131232839(0x7f080847, float:1.8081799E38)
            r3.A08(r0, r5)
        L_0x0080:
            java.lang.String r0 = r14.A08
            r3.setHeadline((java.lang.CharSequence) r0)
            java.lang.String r1 = r14.A07
            r0 = 0
            r3.setBody(r1, r0)
            r3.setVisibility(r4)
            r0 = 2131308201(0x7f092ea9, float:1.823465E38)
            int r1 = X.C18230wP.A03(r10, r0)
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            X.C18190wL.A18(r10, r0, r1)
            r8 = 2131307619(0x7f092c63, float:1.823347E38)
            X.C18190wL.A18(r10, r8, r1)
            r0 = 2131299802(0x7f090dda, float:1.8217616E38)
            android.view.View r0 = X.C18180wK.A0E(r10, r0)
            r0.setVisibility(r1)
            r0 = 2131303605(0x7f091cb5, float:1.822533E38)
            android.view.View r1 = r10.findViewById(r0)
            com.instagram.business.ui.BusinessNavBar r1 = (com.instagram.business.ui.BusinessNavBar) r1
            r14.A06 = r1
            if (r1 == 0) goto L_0x00d9
            r0 = 2131824519(0x7f110f87, float:1.9281868E38)
            if (r2 == 0) goto L_0x00c0
            r0 = 2131824532(0x7f110f94, float:1.9281895E38)
        L_0x00c0:
            r1.setPrimaryButtonText((int) r0)
            com.instagram.business.ui.BusinessNavBar r1 = r14.A06
            r0 = 2131306622(0x7f09287e, float:1.8231448E38)
            android.view.View r0 = r10.findViewById(r0)
            r1.A01(r0)
            com.instagram.business.ui.BusinessNavBar r1 = r14.A06
            com.facebook.redex.IDxCListenerShape2S0110000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape2S0110000_1_I2
            r0.<init>(r4, r14, r2)
            r1.setPrimaryButtonOnclickListeners(r0)
        L_0x00d9:
            if (r2 == 0) goto L_0x01ba
            r0 = 2131308820(0x7f093114, float:1.8235906E38)
            android.view.ViewGroup r7 = X.C18240wQ.A0G(r10, r0)
            android.content.Context r5 = r14.getContext()
            boolean r6 = r14.A04
            boolean r12 = r14.A03
            X.C04220Ms.A0B(r5, r4)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            r0 = 2131832716(0x7f112f8c, float:1.9298494E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131832715(0x7f112f8b, float:1.9298492E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131232872(0x7f080868, float:1.8081866E38)
            X.3hB r0 = new X.3hB
            r0.<init>((java.lang.String) r3, (java.lang.String) r2, (int) r1)
            r4.add(r0)
            if (r12 == 0) goto L_0x0125
            r0 = 2131824521(0x7f110f89, float:1.9281872E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131824520(0x7f110f88, float:1.928187E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131232915(0x7f080893, float:1.8081953E38)
            X.3hB r0 = new X.3hB
            r0.<init>((java.lang.String) r3, (java.lang.String) r2, (int) r1)
            r4.add(r0)
        L_0x0125:
            if (r6 == 0) goto L_0x0140
            r0 = 2131835613(0x7f113add, float:1.930437E38)
            java.lang.String r3 = r5.getString(r0)
            r0 = 2131835612(0x7f113adc, float:1.9304367E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 2131233065(0x7f080929, float:1.8082257E38)
            X.3hB r0 = new X.3hB
            r0.<init>((java.lang.String) r3, (java.lang.String) r2, (int) r1)
            r4.add(r0)
        L_0x0140:
            java.util.Iterator r13 = r4.iterator()
        L_0x0144:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r2 = r13.next()
            X.3hB r2 = (X.C63283hB) r2
            android.view.LayoutInflater r1 = r14.getLayoutInflater()
            r0 = 2131497211(0x7f0c10fb, float:1.8618009E38)
            android.view.View r6 = r1.inflate(r0, r7, r11)
            r0 = 2131233782(0x7f080bf6, float:1.8083711E38)
            r6.setBackgroundResource(r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r14)
            r0 = 2131165197(0x7f07000d, float:1.7944604E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMargins(r11, r1, r11, r1)
            java.lang.String r12 = r2.A09
            java.lang.String r5 = r2.A07
            android.content.Context r1 = r14.getContext()
            int r0 = r2.A02
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r3 = X.AnonymousClass0wJ.A0L(r6, r0)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r6, r8)
            r0 = 2131301509(0x7f091485, float:1.8221078E38)
            android.widget.ImageView r1 = X.C18200wM.A0J(r6, r0)
            r3.setText(r12)
            r0 = 79
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r11)
            r3.setTypeface(r0)
            r2.setText(r5)
            r1.setImageDrawable(r4)
            r7.addView(r6)
            goto L_0x0144
        L_0x01af:
            if (r3 == 0) goto L_0x006b
            android.content.Context r1 = r14.requireContext()
            r0 = 2131835638(0x7f113af6, float:1.930442E38)
            goto L_0x0065
        L_0x01ba:
            r0 = 667344933(0x27c6e025, float:5.5199058E-15)
            X.C14030oh.A09(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22981bi.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onStart() {
        int A022 = C14030oh.A02(135705717);
        super.onStart();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            getRootActivity();
        }
        C14030oh.A09(-227404053, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-487326068);
        super.onStop();
        if (this.A02.equals("profile") && (getContext() instanceof Activity)) {
            getRootActivity();
        }
        C14030oh.A09(-1333443333, A022);
    }
}
