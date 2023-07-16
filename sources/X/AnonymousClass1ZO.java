package X;

import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1ZO  reason: invalid class name */
public final class AnonymousClass1ZO extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "AutoConfConsentFragment";
    public IgButton A00;
    public IgTextView A01;
    public ProgressButton A02;
    public String A03;
    public String A04;
    public String A05;
    public C18330wh A06;
    public final C04530Oa A07 = C18190wL.A0x(this, 42);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131820822);
    }

    public final String getModuleName() {
        return "auto_conf_consent";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            r15 = this;
            r0 = -1580850036(0xffffffffa1c6248c, float:-1.3426676E-18)
            int r2 = X.C14030oh.A02(r0)
            r3 = 0
            r4 = r16
            X.C04220Ms.A0B(r4, r3)
            r0 = 2131493056(0x7f0c00c0, float:1.8609581E38)
            r1 = r17
            android.view.View r1 = r4.inflate(r0, r1, r3)
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r0 = "REGISTER_START_MESSAGE"
            r8 = 0
            java.lang.String r0 = r4.getString(r0, r8)
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0127
            r15.A04 = r0
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r0 = "NONCE"
            java.lang.String r0 = r4.getString(r0, r8)
            if (r0 == 0) goto L_0x011f
            r15.A03 = r0
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r0 = "SMS_FLOW_TYPE"
            java.lang.String r0 = r4.getString(r0, r8)
            if (r0 == 0) goto L_0x012f
            r15.A05 = r0
            X.C04220Ms.A06(r1)
            r0 = 2131297135(0x7f09036f, float:1.8212206E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r15.A02 = r0
            r0 = 2131297134(0x7f09036e, float:1.8212204E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.common.ui.base.IgButton r4 = (com.instagram.common.ui.base.IgButton) r4
            r0 = 2131821657(0x7f110459, float:1.9276063E38)
            r4.setText(r0)
            r15.A00 = r4
            com.instagram.ui.widget.progressbutton.ProgressButton r4 = r15.A02
            if (r4 != 0) goto L_0x006c
            java.lang.String r0 = "saveButton"
        L_0x0068:
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x006c:
            r0 = 595(0x253, float:8.34E-43)
            X.AnonymousClass0wJ.A16(r4, r0, r15)
            com.instagram.common.ui.base.IgButton r4 = r15.A00
            if (r4 != 0) goto L_0x0078
            java.lang.String r0 = "notSaveButton"
            goto L_0x0068
        L_0x0078:
            r0 = 596(0x254, float:8.35E-43)
            X.AnonymousClass0wJ.A16(r4, r0, r15)
            r0 = 2131297133(0x7f09036d, float:1.8212202E38)
            android.view.View r5 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131821659(0x7f11045b, float:1.9276067E38)
            X.C18200wM.A18(r4, r5, r0)
            r15.A01 = r5
            java.lang.String r0 = "helperButton"
            X.AnonymousClass3X6.A00(r5)
            com.instagram.common.ui.base.IgTextView r4 = r15.A01
            if (r4 != 0) goto L_0x009f
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x009f:
            r0 = 597(0x255, float:8.37E-43)
            X.AnonymousClass0wJ.A16(r4, r0, r15)
            android.os.Bundle r5 = r15.requireArguments()
            r4 = 2
            java.lang.String r0 = "CONSENT_MODE"
            int r0 = r5.getInt(r0, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00f4
            r4 = 2131821655(0x7f110457, float:1.927606E38)
        L_0x00c1:
            java.lang.String r0 = "\n\n"
            java.lang.String r4 = X.AnonymousClass0wJ.A0o(r15, r0, r4)
        L_0x00c7:
            X.C04220Ms.A06(r4)
            r0 = 2131297131(0x7f09036b, float:1.8212198E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r1, r0)
            r0.setText(r4)
            X.0wh r4 = X.C18330wh.A01(r15)
            r0 = 2131830080(0x7f112540, float:1.9293147E38)
            X.C18330wh.A03(r15, r4, r0)
            r15.A06 = r4
            X.0Oa r0 = r15.A07
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.String r6 = "auto_conf_consent"
            java.lang.String r9 = "registration_flow"
            java.lang.String r10 = r15.A05
            if (r10 != 0) goto L_0x010b
            java.lang.String r0 = "smsFlowType"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x00f4:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0103
            r4 = 2131821656(0x7f110458, float:1.9276061E38)
            goto L_0x00c1
        L_0x0103:
            r0 = 2131821654(0x7f110456, float:1.9276057E38)
            java.lang.String r4 = r15.getString(r0)
            goto L_0x00c7
        L_0x010b:
            java.lang.String r7 = "client_reg_show_user_consent"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            X.C62323Yh.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 1750040664(0x684f8058, float:3.9195895E24)
            X.C14030oh.A09(r0, r2)
            return r1
        L_0x011f:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r5)
            r0 = 1982145069(0x7625222d, float:8.373263E32)
            goto L_0x0136
        L_0x0127:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r5)
            r0 = -187567987(0xfffffffff4d1f08d, float:-1.3306506E32)
            goto L_0x0136
        L_0x012f:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r5)
            r0 = 1455169083(0x56bc1e3b, float:1.03419012E14)
        L_0x0136:
            X.C14030oh.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZO.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = C14030oh.A02(518282891);
        super.onResume();
        C14030oh.A09(2101440537, A022);
    }
}
