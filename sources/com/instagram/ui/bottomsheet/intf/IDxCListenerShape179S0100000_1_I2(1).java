package com.instagram.ui.bottomsheet.intf;

import X.AnonymousClass01V;
import X.C04220Ms;
import X.C23361de;
import X.C72044Lv;

public class IDxCListenerShape179S0100000_1_I2 extends C72044Lv {
    public Object A00;
    public final int A01;

    public IDxCListenerShape179S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BkO(float f) {
        if (2 - this.A01 == 0 && ((C23361de) this.A00).A03 != null) {
            AnonymousClass01V r2 = AnonymousClass01V.A0p;
            C04220Ms.A06(r2);
            if (r2.isMarkerOn(857814227, 0)) {
                r2.markerEnd(857814227, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r6.A0D = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        X.C04220Ms.A0E(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r6.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        X.C22641Yw.A02(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BuL() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x0006;
                case 2: goto L_0x0005;
                case 3: goto L_0x012f;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r6 = r10.A00
            X.1Yw r6 = (X.C22641Yw) r6
            java.lang.Integer r0 = r6.A0D
            java.lang.Integer r9 = X.AnonymousClass006.A01
            r5 = 0
            if (r0 == r9) goto L_0x001e
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r6.A0A
            if (r0 != 0) goto L_0x001b
            java.lang.String r4 = "confirmationCodeEditText"
        L_0x0017:
            X.C04220Ms.A0E(r4)
            throw r5
        L_0x001b:
            X.C09860go.A0K(r0)
        L_0x001e:
            java.lang.Integer r0 = r6.A0D
            if (r0 == 0) goto L_0x0005
            int r0 = r0.intValue()
            java.lang.String r8 = "loggedOutSession"
            r3 = 0
            java.lang.String r4 = "qplLogger"
            r2 = 203167632(0xc1c1790, float:1.2024893E-31)
            switch(r0) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00af;
                case 3: goto L_0x00bb;
                case 4: goto L_0x0060;
                case 5: goto L_0x0034;
                case 6: goto L_0x00d5;
                default: goto L_0x0031;
            }
        L_0x0031:
            r6.A0D = r5
            return
        L_0x0034:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "HELP_CENTER"
            r1.markerPoint(r2, r0)
            X.3Xr r7 = com.instagram.simplewebview.SimpleWebViewActivity.A01
            android.content.Context r4 = r6.requireContext()
            X.0bf r3 = r6.A09
            if (r3 == 0) goto L_0x0077
            r2 = 217(0xd9, float:3.04E-43)
            r1 = 52
            r0 = 33
            java.lang.String r1 = X.C63833iQ.A07(r2, r1, r0)
            r0 = 2131837083(0x7f11409b, float:1.9307351E38)
            java.lang.String r0 = r6.getString(r0)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = X.C18250wR.A0P(r1, r0)
            r7.A02(r4, r3, r0)
            goto L_0x0031
        L_0x0060:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "REQUEST_SUPPORT"
            r1.markerPoint(r2, r0)
            android.content.Context r7 = r6.requireContext()
            X.0bf r0 = r6.A09
            if (r0 == 0) goto L_0x0077
            java.lang.String r4 = r6.A0E
            if (r4 != 0) goto L_0x007b
            java.lang.String r8 = "pk"
        L_0x0077:
            X.C04220Ms.A0E(r8)
            throw r5
        L_0x007b:
            java.lang.String r3 = r6.A0G
            if (r3 != 0) goto L_0x0082
            java.lang.String r8 = "twoFacIdentifier"
            goto L_0x0077
        L_0x0082:
            X.H1T r2 = X.C18180wK.A0P(r0)
            r2.A0F(r9)
            java.lang.String r0 = "two_factor/start_two_fac_support/"
            r2.A0J(r0)
            java.lang.Class<X.1Tn> r1 = X.C22141Tn.class
            java.lang.Class<X.3N9> r0 = X.AnonymousClass3N9.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "user_id"
            java.lang.String r0 = X.C63833iQ.A09(r2, r0, r4)
            java.lang.String r1 = X.C18220wO.A0g(r7, r2, r0, r3)
            java.lang.String r0 = X.C63833iQ.A00()
            X.H8c r1 = X.C18200wM.A0T(r2, r0, r1)
            X.3iU r0 = r6.A0R
            r1.A00 = r0
            r6.schedule(r1)
            goto L_0x0031
        L_0x00af:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "SWITCH_TO_BACKUP_CODE"
            r1.markerPoint(r2, r0)
            X.24b r0 = X.C310624b.BACKUP_CODE
            goto L_0x00fd
        L_0x00bb:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "SWITCH_TO_AUTH_APP"
            r1.markerPoint(r2, r0)
            X.24b r0 = X.C310624b.AUTHENTICATOR_APP
            goto L_0x00fd
        L_0x00c7:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "RESEND_CODE_CLICK"
            r1.markerPoint(r2, r0)
            X.C22641Yw.A03(r6, r3)
            goto L_0x0031
        L_0x00d5:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "SWITCH_TO_WHATSAPP"
            r1.markerPoint(r2, r0)
            X.24b r0 = X.C310624b.WHATSAPP
            r6.A06 = r0
            X.C22641Yw.A01(r6)
            goto L_0x00ff
        L_0x00e6:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A05
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "SWITCH_TO_SMS"
            r1.markerPoint(r2, r0)
            java.lang.String r0 = r6.A0F
            java.lang.String r4 = "smsNotAllowedReason"
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0104
            X.24b r0 = X.C310624b.SMS
        L_0x00fd:
            r6.A06 = r0
        L_0x00ff:
            X.C22641Yw.A02(r6)
            goto L_0x0031
        L_0x0104:
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r6)
            java.lang.String r0 = r6.A0F
            if (r0 == 0) goto L_0x0017
            r2.A0p(r0)
            r1 = 2131831976(0x7f112ca8, float:1.9296993E38)
            X.3k2 r0 = X.C64313k2.A00
            r2.A0P(r0, r1)
            r2.A0q(r3)
            X.AnonymousClass0wJ.A1K(r2)
            goto L_0x0031
        L_0x011f:
            java.lang.Object r1 = r10.A00
            X.1wA r1 = (X.AnonymousClass1wA) r1
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x0005
            X.3Ga r1 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r1.A00(r0)
            return
        L_0x012f:
            java.lang.Object r1 = r10.A00
            X.3ad r1 = (X.C62743ad) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x013c
            X.Lcc r0 = X.C40322Lcc.FETCHING_CANCELLED
            X.C62743ad.A00(r0, r1)
        L_0x013c:
            X.3If r0 = r1.A08
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.bottomsheet.intf.IDxCListenerShape179S0100000_1_I2.BuL():void");
    }
}
