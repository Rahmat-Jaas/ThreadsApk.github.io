package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape345S0100000_1_I2 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape345S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03d8, code lost:
        r3.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03dc, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e2, code lost:
        r3.A0T(r0, r6);
        X.C18200wM.A1K(r3, r4);
        X.C18190wL.A1I(r3, "login");
        X.C18180wK.A1B(r3, r1);
        X.C63683i7.A08(r3);
        r1 = r7.A0B;
        X.C04220Ms.A0B(r1, 0);
        r1 = X.C18190wL.A0m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0263, code lost:
        X.C63813iO.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0266, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b2, code lost:
        r3.A0T("source", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x037d, code lost:
        r1.setSelection(r1.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0384, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x039b, code lost:
        X.C18180wK.A1P(r8, 0, r9);
        r4 = X.C18200wM.A00();
        r1 = X.AnonymousClass269.A00();
        r3 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(X.C13330nS.A02(r8), "register_password_focused"), 2622);
        X.AnonymousClass0wJ.A1A(r3, r4, r1);
        X.AnonymousClass269.A06(r3, r1);
        X.C18180wK.A1B(r3, r4);
        X.C63683i7.A08(r3);
        X.C18240wQ.A15(r3, r9);
        X.C63683i7.A09(r3, r8);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03ca, code lost:
        if (r7 == null) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03cc, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03ce, code lost:
        X.C18210wN.A19(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03d1, code lost:
        if (r6 == null) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03d3, code lost:
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03d5, code lost:
        X.C18190wL.A1I(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFocusChange(android.view.View r11, boolean r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0385;
                case 1: goto L_0x0372;
                case 2: goto L_0x0325;
                case 3: goto L_0x0305;
                case 4: goto L_0x02b9;
                case 5: goto L_0x0271;
                case 6: goto L_0x023d;
                case 7: goto L_0x0214;
                case 8: goto L_0x01ff;
                case 9: goto L_0x01b6;
                case 10: goto L_0x018b;
                case 11: goto L_0x013c;
                case 12: goto L_0x0126;
                case 13: goto L_0x0103;
                case 14: goto L_0x00e0;
                case 15: goto L_0x006d;
                case 16: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r2 = r10.A00
            X.4Jz r2 = (X.C71734Jz) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x03db
            r0 = 1
            r2.A01 = r0
            android.view.View r1 = r2.A02
            r0 = 0
            r1.setVisibility(r0)
            X.Hwe r1 = r2.A00
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "searchProvider"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0023:
            java.lang.String r0 = ""
            r1.Coi(r0)
            return
        L_0x0029:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r6 = r10.A00
            X.1cm r6 = (X.C23211cm) r6
            double r1 = X.C18200wM.A00()
            double r4 = X.AnonymousClass269.A00()
            X.0bf r0 = r6.A08
            X.0nS r3 = X.C13330nS.A02(r0)
            java.lang.String r0 = "register_username_focused"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2623(0xa3f, float:3.676E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            X.AnonymousClass0wJ.A1A(r3, r1, r4)
            X.C18180wK.A19(r3)
            X.AnonymousClass269.A05(r3)
            X.C18180wK.A1A(r3, r4)
            java.lang.String r0 = "account_linking"
            X.C18210wN.A19(r3, r0)
            X.2AT r0 = X.AnonymousClass2AT.A0D
            X.265 r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.C18190wL.A1I(r3, r0)
            X.0bf r0 = r6.A08
            X.C63683i7.A09(r3, r0)
            X.C18180wK.A1B(r3, r1)
            goto L_0x03d8
        L_0x006d:
            java.lang.Object r0 = r10.A00
            X.1cN r0 = (X.AnonymousClass1cN) r0
            if (r12 == 0) goto L_0x03db
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Dsp r2 = X.C25567Do3.A02(r0)
            X.27u r4 = X.C314827u.USER
            X.0nS r1 = r2.A0W
            java.lang.String r0 = "ig_camera_blacklist_tap_search"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 850(0x352, float:1.191E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x03db
            java.lang.String r0 = "blacklist_type"
            r3.A0O(r4, r0)
            X.6BO r1 = X.AnonymousClass6BO.ACTION
            java.lang.String r0 = "event_type"
            r3.A0O(r1, r0)
            X.0kW r0 = r2.A0T
            X.C18180wK.A1C(r3, r0)
            int r0 = r2.A02
            X.D2w r1 = X.C25831Dsp.A02(r0)
            java.lang.String r0 = "camera_position"
            r3.A0O(r1, r0)
            java.lang.Long r1 = X.C18210wN.A0V()
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r3.A0S(r0, r1)
            java.lang.String r1 = r2.A0K
            java.lang.String r0 = "camera_session_id"
            r3.A0T(r0, r1)
            X.D3K r1 = X.C25831Dsp.A01(r2)
            java.lang.String r0 = "capture_type"
            r3.A0O(r1, r0)
            X.9zz r1 = r2.A06
            java.lang.String r0 = "entry_point"
            r3.A0O(r1, r0)
            X.D36 r1 = r2.A08
            java.lang.String r0 = "media_type"
            r3.A0O(r1, r0)
            X.D3Q r0 = X.D3Q.POST_CAPTURE
            X.C18240wQ.A13(r0, r3)
            X.C18190wL.A1L(r3)
            goto L_0x03d8
        L_0x00e0:
            if (r12 != 0) goto L_0x03db
            java.lang.Object r2 = r10.A00
            X.1cl r2 = (X.AnonymousClass1cl) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03db
            r0 = 2131832595(0x7f112f13, float:1.9298248E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.Cth(r1, r0)
            return
        L_0x0103:
            if (r12 != 0) goto L_0x03db
            java.lang.Object r2 = r10.A00
            X.1ck r2 = (X.AnonymousClass1ck) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A08
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03db
            r0 = 2131832595(0x7f112f13, float:1.9298248E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.Cth(r1, r0)
            return
        L_0x0126:
            java.lang.Object r0 = r10.A00
            X.1cg r0 = (X.C23201cg) r0
            if (r12 == 0) goto L_0x0138
            X.0bf r8 = r0.A09
            X.25r r7 = r0.A0F
            X.2AT r0 = X.AnonymousClass2AT.A09
            X.265 r6 = r0.A00
            java.lang.String r9 = "one_page_registration"
            goto L_0x039b
        L_0x0138:
            X.C23201cg.A03(r0)
            return
        L_0x013c:
            java.lang.Object r4 = r10.A00
            X.1cg r4 = (X.C23201cg) r4
            if (r12 == 0) goto L_0x0183
            X.0bf r0 = r4.A09
            X.0nS r3 = X.C13330nS.A02(r0)
            double r1 = X.C18200wM.A00()
            X.25r r0 = r4.A0F
            if (r0 == 0) goto L_0x0180
            java.lang.String r6 = r0.A00
        L_0x0152:
            java.lang.String r0 = "register_full_name_focused"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2621(0xa3d, float:3.673E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            double r4 = X.AnonymousClass269.A00()
            X.AnonymousClass0wJ.A1A(r3, r1, r4)
            X.C18210wN.A19(r3, r6)
            X.2AT r0 = X.AnonymousClass2AT.A09
            X.265 r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.AnonymousClass269.A08(r3, r0)
            X.C18180wK.A19(r3)
            X.C18180wK.A1B(r3, r1)
            double r0 = X.AnonymousClass269.A00()
            X.C18200wM.A1K(r3, r0)
            goto L_0x03d8
        L_0x0180:
            java.lang.String r6 = ""
            goto L_0x0152
        L_0x0183:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A0A
            if (r0 == 0) goto L_0x03db
            r0.A04()
            return
        L_0x018b:
            if (r12 == 0) goto L_0x03db
            double r1 = X.C18200wM.A00()
            double r4 = X.AnonymousClass269.A00()
            java.lang.Object r7 = r10.A00
            X.1ca r7 = (X.C23151ca) r7
            X.0bf r0 = r7.A0B
            X.0nS r3 = X.C13330nS.A02(r0)
            java.lang.String r0 = "log_in_password_focus"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2379(0x94b, float:3.334E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            X.AnonymousClass0wJ.A1A(r3, r1, r4)
            X.AnonymousClass269.A05(r3)
            java.lang.String r6 = "waterfall_log_in"
            java.lang.String r0 = "containermodule"
            goto L_0x01e2
        L_0x01b6:
            if (r12 == 0) goto L_0x03db
            double r1 = X.C18200wM.A00()
            double r4 = X.AnonymousClass269.A00()
            java.lang.Object r7 = r10.A00
            X.1ca r7 = (X.C23151ca) r7
            X.0bf r0 = r7.A0B
            X.0nS r3 = X.C13330nS.A02(r0)
            java.lang.String r0 = "log_in_username_focus"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2381(0x94d, float:3.336E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            X.AnonymousClass0wJ.A1A(r3, r1, r4)
            X.C18180wK.A19(r3)
            java.lang.String r6 = X.AnonymousClass269.A04()
            java.lang.String r0 = "waterfall_id"
        L_0x01e2:
            r3.A0T(r0, r6)
            X.C18200wM.A1K(r3, r4)
            java.lang.String r0 = "login"
            X.C18190wL.A1I(r3, r0)
            X.C18180wK.A1B(r3, r1)
            X.C63683i7.A08(r3)
            X.0bf r1 = r7.A0B
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.String r1 = X.C18190wL.A0m(r1)
            goto L_0x02b2
        L_0x01ff:
            java.lang.Object r1 = r10.A00
            X.1dk r1 = (X.C23401dk) r1
            android.view.View r0 = r1.A02
            if (r0 == 0) goto L_0x03db
            if (r12 == 0) goto L_0x0210
            X.C09860go.A0K(r0)
            X.C23401dk.A02(r1)
            return
        L_0x0210:
            r11.requestFocus()
            return
        L_0x0214:
            if (r12 != 0) goto L_0x03db
            java.lang.Object r4 = r10.A00
            X.3G5 r4 = (X.AnonymousClass3G5) r4
            android.widget.EditText r0 = r4.A06
            java.lang.String r3 = X.AnonymousClass0wJ.A0n(r0)
            android.widget.EditText r2 = r4.A05
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r2)
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x03db
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x03db
            r0 = 1
            r4.A01 = r0
            android.graphics.drawable.Drawable r1 = r4.A04
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            r0 = 2131832184(0x7f112d78, float:1.9297415E38)
            goto L_0x0263
        L_0x023d:
            if (r12 != 0) goto L_0x03db
            java.lang.Object r3 = r10.A00
            X.3G5 r3 = (X.AnonymousClass3G5) r3
            android.widget.EditText r2 = r3.A06
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r2)
            java.lang.String r0 = r0.trim()
            r2.setText(r0)
            int r1 = r0.length()
            r0 = 6
            if (r1 >= r0) goto L_0x0267
            r0 = 1
            r3.A02 = r0
            android.graphics.drawable.Drawable r1 = r3.A04
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            r0 = 2131832179(0x7f112d73, float:1.9297405E38)
        L_0x0263:
            X.C63813iO.A04(r0)
            return
        L_0x0267:
            r0 = 0
            r3.A02 = r0
            android.graphics.drawable.Drawable r1 = r3.A03
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
            return
        L_0x0271:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r6 = r10.A00
            X.1c4 r6 = (X.AnonymousClass1c4) r6
            long r1 = java.lang.System.currentTimeMillis()
            long r4 = X.AnonymousClass269.A01()
            X.0bf r0 = r6.A07
            X.0nS r3 = X.C13330nS.A02(r0)
            java.lang.String r0 = "password_reset_field_pwd_conf_focus"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2470(0x9a6, float:3.461E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x03db
            X.C18230wP.A1F(r3, r1)
            X.C18190wL.A1G(r3, r1, r4)
            double r0 = (double) r4
            X.C18180wK.A1A(r3, r0)
            java.lang.String r0 = "password_reset"
            X.AnonymousClass269.A08(r3, r0)
            X.C18240wQ.A15(r3, r0)
            X.C18180wK.A1G(r3)
            X.0bf r0 = r6.A07
            java.lang.String r1 = X.C18190wL.A0m(r0)
        L_0x02b2:
            java.lang.String r0 = "source"
            r3.A0T(r0, r1)
            goto L_0x03d8
        L_0x02b9:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r7 = r10.A00
            X.1c4 r7 = (X.AnonymousClass1c4) r7
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = X.AnonymousClass269.A01()
            X.0bf r0 = r7.A07
            X.0nS r1 = X.C13330nS.A02(r0)
            java.lang.String r0 = "password_reset_field_pwd_focus"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2471(0x9a7, float:3.463E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0302
            X.C18230wP.A1F(r2, r5)
            X.C18190wL.A1G(r2, r5, r3)
            double r0 = (double) r3
            X.C18180wK.A1A(r2, r0)
            java.lang.String r0 = "password_reset"
            X.AnonymousClass269.A08(r2, r0)
            X.C18240wQ.A15(r2, r0)
            X.C18180wK.A1G(r2)
            X.0bf r0 = r7.A07
            java.lang.String r1 = X.C18190wL.A0m(r0)
            java.lang.String r0 = "source"
            r2.A0T(r0, r1)
            r2.Bb4()
        L_0x0302:
            android.widget.EditText r1 = r7.A02
            goto L_0x037d
        L_0x0305:
            java.lang.Object r1 = r10.A00
            com.instagram.igds.components.search.InlineSearchBox r1 = (com.instagram.igds.components.search.InlineSearchBox) r1
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r1.A0D
            android.text.Editable r0 = r0.getText()
            X.C04220Ms.A06(r0)
            int r0 = r0.length()
            boolean r0 = X.C18180wK.A1W(r0)
            com.instagram.igds.components.search.InlineSearchBox.A00(r1, r0)
            android.view.View$OnFocusChangeListener r0 = r1.A00
            if (r0 == 0) goto L_0x03db
            r0.onFocusChange(r11, r12)
            return
        L_0x0325:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r2 = r10.A00
            X.1aM r2 = (X.AnonymousClass1aM) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0Oa r0 = r2.A03
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r6 = X.C18180wK.A0Q(r1, r0)
            X.DaD r0 = X.AnonymousClass2O0.A00()
            r0.A00()
            android.os.Bundle r0 = r2.requireArguments()
            java.lang.String r5 = "event_id"
            java.lang.String r4 = r0.getString(r5)
            android.os.Bundle r0 = r2.requireArguments()
            java.lang.String r3 = "response_page_type"
            java.io.Serializable r1 = r0.getSerializable(r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.events.viewmodel.EventRSVPType"
            X.C04220Ms.A0C(r1, r0)
            X.253 r1 = (X.AnonymousClass253) r1
            java.lang.String r2 = X.AnonymousClass2O3.A00(r1)
            X.1YZ r1 = new X.1YZ
            r1.<init>()
            android.os.Bundle r0 = X.C18180wK.A06()
            r0.putString(r5, r4)
            r0.putString(r3, r2)
            X.C18180wK.A0x(r0, r1, r6)
            return
        L_0x0372:
            if (r12 == 0) goto L_0x03db
            X.C09860go.A0K(r11)
            java.lang.Object r0 = r10.A00
            X.13Q r0 = (X.AnonymousClass13Q) r0
            android.widget.EditText r1 = r0.A00
        L_0x037d:
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x0385:
            if (r12 == 0) goto L_0x03db
            java.lang.Object r0 = r10.A00
            X.1cf r0 = (X.AnonymousClass1cf) r0
            X.0i6 r8 = r0.getSession()
            X.25r r7 = r0.Aiy()
            X.265 r6 = r0.BDt()
            java.lang.String r9 = r0.getModuleName()
        L_0x039b:
            r0 = 0
            X.C18180wK.A1P(r8, r0, r9)
            double r4 = X.C18200wM.A00()
            double r1 = X.AnonymousClass269.A00()
            X.0nS r3 = X.C13330nS.A02(r8)
            java.lang.String r0 = "register_password_focused"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2622(0xa3e, float:3.674E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            X.AnonymousClass0wJ.A1A(r3, r4, r1)
            X.AnonymousClass269.A06(r3, r1)
            X.C18180wK.A1B(r3, r4)
            X.C63683i7.A08(r3)
            X.C18240wQ.A15(r3, r9)
            X.C63683i7.A09(r3, r8)
            r0 = 0
            if (r7 == 0) goto L_0x03dc
            java.lang.String r1 = r7.A00
        L_0x03ce:
            X.C18210wN.A19(r3, r1)
            if (r6 == 0) goto L_0x03d5
            java.lang.String r0 = r6.A01
        L_0x03d5:
            X.C18190wL.A1I(r3, r0)
        L_0x03d8:
            r3.Bb4()
        L_0x03db:
            return
        L_0x03dc:
            r1 = r0
            goto L_0x03ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape345S0100000_1_I2.onFocusChange(android.view.View, boolean):void");
    }
}
