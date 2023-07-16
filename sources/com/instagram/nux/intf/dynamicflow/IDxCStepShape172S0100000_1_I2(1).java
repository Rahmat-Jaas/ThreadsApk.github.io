package com.instagram.nux.intf.dynamicflow;

import X.AnonymousClass2AQ;
import X.AnonymousClass3IX;
import X.AnonymousClass3XW;

public class IDxCStepShape172S0100000_1_I2 extends AnonymousClass3IX {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCStepShape172S0100000_1_I2(AnonymousClass3XW r1, AnonymousClass2AQ r2, String str, int i) {
        super(r2, str);
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 2: goto L_0x003e;
                case 3: goto L_0x0005;
                case 4: goto L_0x004d;
                case 5: goto L_0x0011;
                case 6: goto L_0x005e;
                case 7: goto L_0x0082;
                case 8: goto L_0x0005;
                case 9: goto L_0x00af;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00cf;
                case 12: goto L_0x00eb;
                case 13: goto L_0x010c;
                case 14: goto L_0x0172;
                case 15: goto L_0x01ae;
                case 16: goto L_0x01da;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r0 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0227
        L_0x000f:
            r5 = 1
        L_0x0010:
            return r5
        L_0x0011:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r2 = r0.A00
            X.25r r1 = r2.A01
            X.25r r0 = X.C313625r.A03
            if (r1 == r0) goto L_0x000f
            X.25r r0 = X.C313625r.SAC
            if (r1 != r0) goto L_0x0227
            com.instagram.service.session.UserSession r1 = r2.A00
            if (r1 == 0) goto L_0x000f
            X.0Ok r0 = X.C06810aP.A01
            r0.A01(r1)
            com.instagram.service.session.UserSession r0 = r2.A00
            X.3hk r1 = X.C63533hk.A02(r0)
            com.instagram.service.session.UserSession r0 = r2.A00
            java.lang.String r0 = r0.getUserId()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x000f
            goto L_0x0227
        L_0x003e:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r1 = r0.A00
            com.instagram.service.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x0227
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0227
            goto L_0x000f
        L_0x004d:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r0 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L_0x0227
            X.38d r0 = X.AnonymousClass3Zq.A00(r0)
            if (r0 == 0) goto L_0x0227
            goto L_0x000f
        L_0x005e:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r2 = r0.A00
            X.25r r1 = r2.A01
            r5 = 0
            if (r1 == 0) goto L_0x0010
            X.25r r0 = X.C313625r.PHONE
            if (r1 != r0) goto L_0x0010
            com.instagram.service.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getUserId()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0010
            com.instagram.service.session.UserSession r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            goto L_0x000f
        L_0x0082:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r0 = r0.A00
            com.instagram.service.session.UserSession r3 = r0.A00
            if (r3 == 0) goto L_0x0227
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36325123992593344(0x810d82000023c0, double:3.035492910225384E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x000f
            X.C04620Ok.A00(r3)
            com.instagram.user.model.User r0 = X.C18250wR.A0R(r3)
            X.MeW r0 = r0.A05
            java.lang.Boolean r0 = r0.BBw()
            boolean r5 = X.C18210wN.A1T(r0)
            return r5
        L_0x00af:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r0 = r0.A00
            X.25r r1 = r0.A01
            if (r1 == 0) goto L_0x0227
            X.25r r0 = X.C313625r.EMAIL
            if (r1 != r0) goto L_0x0227
            goto L_0x000f
        L_0x00bf:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r0 = r0.A00
            X.25r r1 = r0.A01
            if (r1 == 0) goto L_0x0227
            X.25r r0 = X.C313625r.PHONE
            if (r1 != r0) goto L_0x0227
            goto L_0x000f
        L_0x00cf:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r2 = r0.A00
            X.25r r1 = r2.A01
            X.25r r0 = X.C313625r.SAC
            r5 = 0
            if (r1 != r0) goto L_0x00e3
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            if (r1 != r0) goto L_0x00e3
            return r5
        L_0x00e3:
            boolean r0 = r2.A00()
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x00eb:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r2 = r0.A00
            X.25r r1 = r2.A01
            X.25r r0 = X.C313625r.A03
            if (r1 != r0) goto L_0x0227
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0227
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18300232878000118(0x4103f7000007f6, double:1.8930358403141905E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0227
            goto L_0x000f
        L_0x010c:
            X.0TJ r4 = X.AnonymousClass0TJ.A06
            r0 = 18307568682146928(0x410aa300001c70, double:1.8959353353650374E-307)
            boolean r0 = X.C63173fJ.A05(r4, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0126
            r0 = 18307568682278002(0x410aa300021c72, double:1.8959353354168447E-307)
            boolean r0 = X.C63173fJ.A05(r4, r0)
            if (r0 == 0) goto L_0x0126
            return r5
        L_0x0126:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r1 = r0.A00
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0010
            com.instagram.service.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r0.getUserId()
        L_0x013a:
            X.1sh r0 = X.C27551sh.A03(r0)
            if (r0 == 0) goto L_0x022b
            java.util.Map r0 = r0.A04
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x014e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r2 = r3.next()
            X.3V7 r2 = (X.AnonymousClass3V7) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "IDENTITY_SYNCING"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x014e
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0010
            if (r1 != 0) goto L_0x014e
            return r5
        L_0x0170:
            r0 = 0
            goto L_0x013a
        L_0x0172:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r4 = r0.A00
            com.instagram.service.session.UserSession r3 = r4.A00
            r5 = 0
            if (r3 == 0) goto L_0x0010
            X.1z6 r2 = X.C35692Ol.A00(r3)
            java.lang.Class<X.3yp> r0 = X.C67073yp.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            boolean r0 = r2.A05(r1, r0)
            if (r0 != 0) goto L_0x0195
            X.25r r1 = r4.A01
            X.25r r0 = X.C313625r.A03
            if (r1 != r0) goto L_0x0010
        L_0x0195:
            boolean r0 = X.C63363hM.A05(r3)
            if (r0 == 0) goto L_0x0010
            X.3yu r1 = X.C67123yu.A04
            if (r1 != 0) goto L_0x01a6
            X.3yu r1 = new X.3yu
            r1.<init>(r3)
            X.C67123yu.A04 = r1
        L_0x01a6:
            monitor-enter(r1)
            boolean r0 = r1.A01     // Catch:{ all -> 0x0242 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0010
            goto L_0x000f
        L_0x01ae:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r2 = r0.A00
            com.instagram.service.session.UserSession r3 = r2.A00
            if (r3 == 0) goto L_0x0227
            X.25r r1 = r2.A01
            X.25r r0 = X.C313625r.SAC
            if (r1 != r0) goto L_0x01ce
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326425367684656(0x810eb100002630, double:3.0363159050733464E-306)
        L_0x01c5:
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r5 = r0.booleanValue()
            return r5
        L_0x01ce:
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0227
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323217027112675(0x810bc600001ee3, double:3.034286937576675E-306)
            goto L_0x01c5
        L_0x01da:
            java.lang.Object r0 = r6.A00
            X.3XW r0 = (X.AnonymousClass3XW) r0
            X.3yp r1 = r0.A00
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0227
            com.instagram.service.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = r0.getUserId()
        L_0x01ec:
            X.1sh r0 = X.C27551sh.A03(r0)
            r4 = 1
            if (r0 == 0) goto L_0x000f
            java.util.Map r0 = r0.A04
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r0 = X.C18200wM.A0s(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0201:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r2 = r3.next()
            X.3V7 r2 = (X.AnonymousClass3V7) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "IDENTITY_SYNCING"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x021f
            java.lang.String r0 = "IDENTITY_SYNCING_AFTER_NUX_LINKING"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0201
        L_0x021f:
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0201
        L_0x0227:
            r5 = 0
            return r5
        L_0x0229:
            r0 = 0
            goto L_0x01ec
        L_0x022b:
            r0 = 18301714641783767(0x41055000010bd7, double:1.8936215111787927E-307)
            boolean r0 = X.C63173fJ.A05(r4, r0)
            if (r0 == 0) goto L_0x0238
            X.0TJ r4 = X.AnonymousClass0TJ.A05
        L_0x0238:
            r0 = 18301714641718230(0x41055000000bd6, double:1.893621511152889E-307)
            boolean r5 = X.C63173fJ.A05(r4, r0)
            return r5
        L_0x0242:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.intf.dynamicflow.IDxCStepShape172S0100000_1_I2.A00():boolean");
    }
}
