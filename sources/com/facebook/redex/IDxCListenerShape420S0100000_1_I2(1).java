package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape420S0100000_1_I2 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape420S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        r7 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(r1, "remove_self_followers_dialog_dismissed"), 2634);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r7.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0126, code lost:
        X.AnonymousClass1x0.A0D(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0129, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x000d;
                case 2: goto L_0x007b;
                case 3: goto L_0x003f;
                case 4: goto L_0x0084;
                case 5: goto L_0x0069;
                case 6: goto L_0x00d1;
                case 7: goto L_0x0116;
                case 8: goto L_0x011f;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00ee;
                case 11: goto L_0x00f8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A00
            X.4rx r0 = (X.C83764rx) r0
            r0.Bnz()
        L_0x000c:
            return
        L_0x000d:
            X.2AD r2 = X.AnonymousClass2AD.A0M
            java.lang.Object r1 = r8.A00
            X.3TM r1 = (X.AnonymousClass3TM) r1
            X.2AD r0 = r1.A05
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000c
            com.instagram.service.session.UserSession r3 = r1.A07
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36313686494676600(0x81031b00000678, double:3.0282597904877274E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x000c
            r1 = 0
            android.content.SharedPreferences r0 = X.C28161tl.A04(r3)
            java.lang.String r2 = "upsells_cancel_count_for_link_switcher"
            int r0 = r0.getInt(r2, r1)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C28161tl.A03(r3)
            X.AnonymousClass0wJ.A11(r0, r2, r1)
            return
        L_0x003f:
            java.lang.Object r2 = r8.A00
            X.1iH r2 = (X.AnonymousClass1iH) r2
            com.instagram.service.session.UserSession r0 = r2.A02
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r0)
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            r1.A20(r0)
            X.3Dm r1 = r2.A00
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1 instanceof X.C27511sd
            if (r0 == 0) goto L_0x005e
            X.1sd r1 = (X.C27511sd) r1
            X.1xr r1 = r1.A00
            r0 = 0
            r1.A0C = r0
            return
        L_0x005e:
            boolean r0 = r1 instanceof X.C27501sc
            if (r0 == 0) goto L_0x000c
            X.1sc r1 = (X.C27501sc) r1
            X.1x0 r1 = r1.A00
            r0 = 0
            goto L_0x0126
        L_0x0069:
            java.lang.Object r0 = r8.A00
            X.4rp r0 = (X.C83694rp) r0
            if (r0 == 0) goto L_0x000c
            r0.onCancel()
            return
        L_0x0073:
            java.lang.Object r0 = r8.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.AnonymousClass3LY.A01(r0)
            return
        L_0x007b:
            java.lang.Object r1 = r8.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            r1.setChecked(r0)
            return
        L_0x0084:
            java.lang.Object r0 = r8.A00
            X.3Gh r0 = (X.C58573Gh) r0
            X.1cR r6 = r0.A00
            com.instagram.service.session.UserSession r0 = r6.A06
            X.0nS r1 = X.C13330nS.A02(r0)
            long r4 = java.lang.System.currentTimeMillis()
            double r2 = X.AnonymousClass269.A00()
            java.lang.String r0 = "set_profile_photo_dialog_canceled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2690(0xa82, float:3.77E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = X.C18180wK.A0I(r1, r0)
            X.C18230wP.A1F(r7, r4)
            double r0 = (double) r4
            X.AnonymousClass0wJ.A1A(r7, r0, r2)
            X.C18180wK.A1A(r7, r2)
            java.lang.String r0 = "profile_photo"
            X.AnonymousClass269.A08(r7, r0)
            java.lang.String r0 = "register_flow_add_profile_photo"
            X.C18240wQ.A15(r7, r0)
            X.C63683i7.A08(r7)
            boolean r0 = r6.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_standalone"
            r7.A0Q(r0, r1)
            com.instagram.service.session.UserSession r0 = r6.A06
            X.C63683i7.A09(r7, r0)
            com.instagram.service.session.UserSession r0 = r6.A06
            X.C63683i7.A06(r7, r0)
            goto L_0x00ea
        L_0x00d1:
            java.lang.Object r0 = r8.A00
            X.1x0 r0 = (X.AnonymousClass1x0) r0
            X.0nS r1 = r0.A04
            goto L_0x00de
        L_0x00d8:
            java.lang.Object r0 = r8.A00
            X.1xr r0 = (X.C29371xr) r0
            X.0nS r1 = r0.A03
        L_0x00de:
            java.lang.String r0 = "remove_self_followers_dialog_dismissed"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2634(0xa4a, float:3.691E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = X.C18180wK.A0I(r1, r0)
        L_0x00ea:
            r7.Bb4()
            return
        L_0x00ee:
            java.lang.Object r1 = r8.A00
            X.3Ga r1 = (X.C58533Ga) r1
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r1.A00(r0)
            return
        L_0x00f8:
            java.lang.Object r0 = r8.A00
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = (com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2) r0
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.0m7 r1 = r2.mFragmentManager
            if (r1 == 0) goto L_0x0112
            int r0 = r1.A0I()
            if (r0 <= 0) goto L_0x0112
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x0112
            r1.A0d()
            return
        L_0x0112:
            X.C18210wN.A14(r2)
            return
        L_0x0116:
            java.lang.Object r1 = r8.A00
            X.1x0 r1 = (X.AnonymousClass1x0) r1
            r0 = 0
            r1.A09 = r0
            r0 = 1
            goto L_0x0126
        L_0x011f:
            java.lang.Object r1 = r8.A00
            X.1x0 r1 = (X.AnonymousClass1x0) r1
            r0 = 0
            r1.A09 = r0
        L_0x0126:
            X.AnonymousClass1x0.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape420S0100000_1_I2.onCancel(android.content.DialogInterface):void");
    }
}
