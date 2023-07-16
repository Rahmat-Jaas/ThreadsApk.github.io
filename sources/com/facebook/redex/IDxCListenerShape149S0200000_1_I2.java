package com.facebook.redex;

import X.AnonymousClass1f5;
import X.AnonymousClass1f6;
import android.widget.CompoundButton;

public class IDxCListenerShape149S0200000_1_I2 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape149S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(IDxCListenerShape149S0200000_1_I2 iDxCListenerShape149S0200000_1_I2, boolean z) {
        if (z) {
            ((AnonymousClass1f5) iDxCListenerShape149S0200000_1_I2.A01).A01.invoke(iDxCListenerShape149S0200000_1_I2.A00);
        }
    }

    public static final void A01(IDxCListenerShape149S0200000_1_I2 iDxCListenerShape149S0200000_1_I2, boolean z) {
        if (z) {
            ((AnonymousClass1f6) iDxCListenerShape149S0200000_1_I2.A01).A02.invoke(iDxCListenerShape149S0200000_1_I2.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        r1 = ((X.AnonymousClass10z) r9.A01).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x0013;
                case 2: goto L_0x0082;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00ff;
                case 6: goto L_0x0113;
                case 7: goto L_0x0146;
                case 8: goto L_0x0190;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.4MC r0 = (X.AnonymousClass4MC) r0
            r0.A0C = r11
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.A08
            if (r0 == 0) goto L_0x0012
            r0.onCheckedChanged(r10, r11)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r9.A00
            X.37a r0 = (X.C563937a) r0
            X.1TL r0 = r0.A00
            java.lang.Integer r1 = r0.A01
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r9.A01
            X.10y r0 = (X.C196610y) r0
            int r6 = r1.intValue()
            X.1bh r3 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A06
            if (r0 > 0) goto L_0x0012
            java.util.Set r5 = r3.A0A
            if (r11 != 0) goto L_0x007e
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x003d
            r5.remove(r1)
        L_0x003d:
            java.util.List r0 = r3.A07
            java.util.Iterator r8 = r0.iterator()
        L_0x0043:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r2 = r8.next()
            X.37a r2 = (X.C563937a) r2
            X.1TL r7 = r2.A00
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x0061
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x0061
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.A00 = r0
        L_0x0061:
            if (r11 == 0) goto L_0x0076
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L_0x0043
            java.lang.Integer r0 = r7.A01
            boolean r0 = X.AnonymousClass00J.A0k(r5, r0)
            if (r0 != 0) goto L_0x0043
            r1 = 0
        L_0x0073:
            r2.A01 = r1
            goto L_0x0043
        L_0x0076:
            int r0 = r5.size()
            r1 = 1
            if (r0 != r4) goto L_0x0043
            goto L_0x0073
        L_0x007e:
            r5.add(r1)
            goto L_0x003d
        L_0x0082:
            java.lang.Object r0 = r9.A00
            X.1TK r0 = (X.AnonymousClass1TK) r0
            java.lang.Integer r3 = r0.A01
            if (r3 == 0) goto L_0x0012
            java.lang.Object r0 = r9.A01
            X.10z r0 = (X.AnonymousClass10z) r0
            X.1bg r1 = r0.A00
            androidx.recyclerview.widget.RecyclerView r0 = r1.A00
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A06
            if (r0 > 0) goto L_0x0012
            java.util.Set r2 = r1.A09
            if (r11 != 0) goto L_0x00b1
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L_0x00a5
            r2.remove(r3)
        L_0x00a5:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r1.A04
            if (r1 == 0) goto L_0x0012
            boolean r0 = X.C18190wL.A1a(r2)
            r1.setPrimaryButtonEnabled(r0)
            return
        L_0x00b1:
            r2.add(r3)
            goto L_0x00a5
        L_0x00b5:
            java.lang.Object r3 = r9.A00
            X.1wA r3 = (X.AnonymousClass1wA) r3
            X.1lP r2 = r3.A04
            if (r2 == 0) goto L_0x00df
            com.instagram.service.session.UserSession r0 = r2.A06
            if (r0 == 0) goto L_0x00df
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r0)
            java.lang.String r0 = "rageshake_v2_enabled"
            X.AnonymousClass0wJ.A13(r1, r0, r11)
            java.lang.String r1 = "RageShakeSensorHelper"
            java.lang.String r0 = "UserPreferences setRageShakeEnabledNewFlow is set"
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.String r0 = "enableOrDisableRageShakeListener start"
            X.AnonymousClass0LU.A0C(r1, r0)
            boolean r0 = X.AnonymousClass1lP.A00(r2)
            if (r0 == 0) goto L_0x00f3
            r2.A02()
        L_0x00df:
            X.3Ga r1 = r3.A02
            if (r11 == 0) goto L_0x00f0
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x00e5:
            r1.A00(r0)
            java.lang.Object r0 = r9.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass1wA.A0B(r0, r3)
            return
        L_0x00f0:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x00e5
        L_0x00f3:
            r2.A03()
            goto L_0x00df
        L_0x00f7:
            A00(r9, r11)
            return
        L_0x00fb:
            A01(r9, r11)
            return
        L_0x00ff:
            java.lang.Object r3 = r9.A00
            X.1x0 r3 = (X.AnonymousClass1x0) r3
            java.lang.Object r2 = r9.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r11 == 0) goto L_0x0110
            X.9tz r1 = X.C169839tz.PrivacyStatusPrivate
        L_0x010b:
            r0 = 0
            X.AnonymousClass1x0.A0B(r3, r1, r2, r0)
            return
        L_0x0110:
            X.9tz r1 = X.C169839tz.PrivacyStatusPublic
            goto L_0x010b
        L_0x0113:
            java.lang.Object r2 = r9.A00
            X.1wN r2 = (X.AnonymousClass1wN) r2
            com.instagram.service.session.UserSession r0 = r2.A00
            if (r11 == 0) goto L_0x0135
            X.C62423Zt.A02(r0)
            r1 = 0
            X.3Xk r0 = r2.A01
            r0.A07 = r1
            X.C18210wN.A1G(r2)
            java.lang.Object r0 = r9.A01
            X.1tl r0 = (X.C28161tl) r0
            r2 = 1
        L_0x012b:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "data_saver_mode_on"
            X.AnonymousClass0wJ.A11(r1, r0, r2)
            return
        L_0x0135:
            X.C62423Zt.A02(r0)
            r1 = 1
            X.3Xk r0 = r2.A01
            r0.A07 = r1
            X.C18210wN.A1G(r2)
            java.lang.Object r0 = r9.A01
            X.1tl r0 = (X.C28161tl) r0
            r2 = 0
            goto L_0x012b
        L_0x0146:
            java.lang.Object r0 = r9.A00
            X.1wN r0 = (X.AnonymousClass1wN) r0
            com.instagram.service.session.UserSession r6 = r0.A00
            r5 = 0
            r2 = 1
            X.C04220Ms.A0B(r6, r2)
            X.5dy r4 = X.AnonymousClass6JQ.A00(r6)
            java.lang.String r3 = "user_setting"
            java.lang.Object r0 = r9.A01
            X.1tl r0 = (X.C28161tl) r0
            if (r11 == 0) goto L_0x017c
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A02(r0)
            java.lang.String r0 = "high_quality_media_upload"
            X.AnonymousClass0wJ.A11(r1, r0, r2)
            r1 = 0
            java.lang.String r0 = "high_quality_upload_on"
            X.C62423Zt.A01(r5, r6, r3, r0, r5)
            r0 = 681252206(0x289b156e, float:1.721775E-14)
        L_0x016f:
            long r1 = r4.flowStartForMarker(r0, r3, r1)
            java.lang.String r0 = "entry_point"
            r4.flowAnnotate((long) r1, (java.lang.String) r0, (java.lang.String) r3)
            r4.flowEndSuccess(r1)
            return
        L_0x017c:
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r0)
            java.lang.String r1 = "high_quality_media_upload"
            r0 = 0
            X.AnonymousClass0wJ.A11(r2, r1, r0)
            r1 = 0
            java.lang.String r0 = "high_quality_upload_off"
            X.C62423Zt.A01(r5, r6, r3, r0, r5)
            r0 = 681257100(0x289b288c, float:1.7226041E-14)
            goto L_0x016f
        L_0x0190:
            java.lang.Object r1 = r9.A01
            X.38O r1 = (X.AnonymousClass38O) r1
            X.3iC r0 = r1.A00
            com.instagram.service.session.UserSession r3 = r0.A08
            java.lang.String r2 = r1.A01
            X.0kW r1 = r0.A03
            java.lang.String r0 = "logout_d1_toggle_tapped"
            X.C36242Qo.A00(r1, r3, r0, r2, r11)
            return
        L_0x01a2:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A04
            if (r2 == 0) goto L_0x01b1
            int r1 = r5.size()
            r0 = 2
            if (r1 == r0) goto L_0x01ae
            r4 = 0
        L_0x01ae:
            r2.setPrimaryButtonEnabled(r4)
        L_0x01b1:
            X.10y r2 = r3.A01
            if (r2 != 0) goto L_0x01bc
            java.lang.String r0 = "adapter"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x01bc:
            java.util.List r1 = r3.A07
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.util.List r0 = r2.A01
            r0.clear()
            r0.addAll(r1)
            r2.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape149S0200000_1_I2.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
