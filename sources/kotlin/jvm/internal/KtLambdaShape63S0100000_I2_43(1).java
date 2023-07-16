package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape63S0100000_I2_43 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape63S0100000_I2_43(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0314, code lost:
        r1.A02(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033a, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0084, code lost:
        if (r1 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0218, code lost:
        return X.AnonymousClass3Zh.A01(X.AnonymousClass0wJ.A0X(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0331;
                case 1: goto L_0x0318;
                case 2: goto L_0x02f4;
                case 3: goto L_0x02e1;
                case 4: goto L_0x0331;
                case 5: goto L_0x02c0;
                case 6: goto L_0x02bd;
                case 7: goto L_0x02b4;
                case 8: goto L_0x0005;
                case 9: goto L_0x02bd;
                case 10: goto L_0x02b4;
                case 11: goto L_0x0005;
                case 12: goto L_0x02a9;
                case 13: goto L_0x0291;
                case 14: goto L_0x0286;
                case 15: goto L_0x026f;
                case 16: goto L_0x025b;
                case 17: goto L_0x0252;
                case 18: goto L_0x02bd;
                case 19: goto L_0x02b4;
                case 20: goto L_0x0005;
                case 21: goto L_0x0242;
                case 22: goto L_0x0238;
                case 23: goto L_0x022d;
                case 24: goto L_0x0223;
                case 25: goto L_0x0219;
                case 26: goto L_0x020a;
                case 27: goto L_0x02bd;
                case 28: goto L_0x02b4;
                case 29: goto L_0x0005;
                case 30: goto L_0x01fa;
                case 31: goto L_0x01ed;
                case 32: goto L_0x01e6;
                case 33: goto L_0x02bd;
                case 34: goto L_0x02b4;
                case 35: goto L_0x0005;
                case 36: goto L_0x01d6;
                case 37: goto L_0x01be;
                case 38: goto L_0x01b1;
                case 39: goto L_0x019f;
                case 40: goto L_0x0192;
                case 41: goto L_0x0185;
                case 42: goto L_0x016d;
                case 43: goto L_0x0165;
                case 44: goto L_0x0156;
                case 45: goto L_0x02bd;
                case 46: goto L_0x02b4;
                case 47: goto L_0x0005;
                case 48: goto L_0x0111;
                case 49: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r2 = X.C18180wK.A0H(r0)
            return r2
        L_0x000e:
            java.lang.Object r3 = r10.A00
            X.0zW r3 = (X.C19230zW) r3
            X.4wE r1 = r3.A09
            X.Chw r0 = X.C22884Chw.A00
            r1.CrC(r0)
            boolean r0 = r3 instanceof X.C25641oa
            if (r0 == 0) goto L_0x006e
            X.1oa r3 = (X.C25641oa) r3
            X.24S r0 = r3.A02
            java.lang.String r7 = r0.A00
            r2 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            X.4wG r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0036
            r2 = 1
        L_0x0036:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r3.A03
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            com.instagram.service.session.UserSession r0 = r3.A06
            X.49W r3 = X.AnonymousClass2MQ.A00(r0)
            X.0nS r0 = r3.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x0338
            X.AnonymousClass49W.A03(r2, r3)
            X.2AB r1 = X.AnonymousClass2AB.A0P
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r1, r2, r0)
            X.Lcg r0 = X.C40326Lcg.A0A
            java.lang.String r0 = X.AnonymousClass2AH.A00(r0, r2, r3)
            X.C62443a0.A02(r2, r0)
            java.util.Map r0 = X.AnonymousClass49W.A02(r6, r5, r4, r7)
            X.C18200wM.A1J(r2, r0)
            goto L_0x0338
        L_0x006e:
            X.1ob r3 = (X.C25651ob) r3
            X.49Y r5 = r3.A04
            X.24S r8 = r3.A03
            X.4wE r0 = r3.A0B
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9 = 1
            if (r0 == 0) goto L_0x0086
            boolean r1 = X.AnonymousClass8bQ.A0n(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0087
        L_0x0086:
            r0 = 1
        L_0x0087:
            r2 = r0 ^ 1
            X.4wG r0 = r3.A0D
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0097
            r9 = 0
        L_0x0097:
            boolean r7 = r3.A03
            java.lang.Boolean r0 = r3.A02
            if (r0 == 0) goto L_0x010f
            boolean r6 = r0.booleanValue()
        L_0x00a1:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.AnonymousClass49Y.A00(r5)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x0338
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "chat_creation_source"
            r3.put(r0, r1)
            if (r2 == 0) goto L_0x010c
            java.lang.String r1 = "True"
        L_0x00ba:
            java.lang.String r0 = "has_thread_name"
            r3.put(r0, r1)
            java.lang.String r1 = "False"
            r2 = r1
            java.lang.String r0 = "has_thread_photo"
            r3.put(r0, r1)
            if (r9 == 0) goto L_0x00cb
            java.lang.String r1 = "True"
        L_0x00cb:
            java.lang.String r0 = "limited_to_subscribers"
            r3.put(r0, r1)
            if (r7 == 0) goto L_0x010a
            java.lang.String r1 = "True"
        L_0x00d4:
            java.lang.String r0 = "is_thread_pinned_to_profile"
            r3.put(r0, r1)
            if (r6 == 0) goto L_0x00dd
            java.lang.String r2 = "True"
        L_0x00dd:
            java.lang.String r0 = "comments_enabled"
            r3.put(r0, r2)
            X.AnonymousClass49Y.A03(r4, r5)
            X.2AE r0 = X.AnonymousClass2AE.A0Z
            X.AnonymousClass2A4.A00(r0, r4)
            X.Lci r0 = X.C40328Lci.A08
            X.C18230wP.A1D(r0, r4)
            X.2AA r0 = X.AnonymousClass2AA.A04
            X.C18240wQ.A13(r0, r4)
            if (r9 == 0) goto L_0x0107
            X.2AG r1 = X.AnonymousClass2AG.SUBSCRIBER_BROADCAST
        L_0x00f8:
            java.lang.String r0 = "parent_surface"
            r4.A0O(r1, r0)
            java.lang.String r0 = r5.A00
            X.C62443a0.A02(r4, r0)
            X.C18200wM.A1J(r4, r3)
            goto L_0x0338
        L_0x0107:
            X.2AG r1 = X.AnonymousClass2AG.BROADCAST
            goto L_0x00f8
        L_0x010a:
            r1 = r2
            goto L_0x00d4
        L_0x010c:
            java.lang.String r1 = "False"
            goto L_0x00ba
        L_0x010f:
            r6 = 0
            goto L_0x00a1
        L_0x0111:
            java.lang.Object r1 = r10.A00
            X.1bs r1 = (X.C23071bs) r1
            android.app.Application r3 = X.C18190wL.A09(r1)
            X.0Oa r0 = r1.A0K
            com.instagram.service.session.UserSession r8 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r1.A0I
            X.49Y r4 = X.C18240wQ.A0P(r0)
            X.0Oa r0 = r1.A0J
            java.lang.Object r6 = r0.getValue()
            X.49W r6 = (X.AnonymousClass49W) r6
            X.0Oa r0 = r1.A0A
            java.lang.Object r7 = r0.getValue()
            X.20y r7 = (X.AnonymousClass20y) r7
            X.0Oa r0 = r1.A0C
            java.lang.Object r5 = r0.getValue()
            X.24S r5 = (X.AnonymousClass24S) r5
            X.0Oa r0 = r1.A0E
            r0.getValue()
            X.0Oa r0 = r1.A0G
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            X.10l r2 = new X.10l
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0156:
            java.lang.Object r0 = r10.A00
            X.1bs r0 = (X.C23071bs) r0
            X.0Oa r0 = r0.A0K
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49W r2 = X.AnonymousClass2MQ.A00(r0)
            return r2
        L_0x0165:
            java.lang.Object r0 = r10.A00
            X.1bs r0 = (X.C23071bs) r0
            X.0Oa r0 = r0.A0K
            goto L_0x0210
        L_0x016d:
            java.lang.Object r0 = r10.A00
            X.1bs r0 = (X.C23071bs) r0
            X.0Oa r0 = r0.A0K
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.C18180wK.A0J(r3)
            r0 = 36323594984824760(0x810c1e00091fb8, double:3.034525959555711E-306)
            java.lang.Boolean r2 = X.C63803iN.A05(r2, r3, r0)
            return r2
        L_0x0185:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "subscriber_fan_count_arg"
            java.lang.Integer r2 = X.C18210wN.A0T(r1, r0)
            return r2
        L_0x0192:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "channel_creation_entry_from_chooser"
            java.lang.Boolean r2 = X.C18210wN.A0Q(r1, r0)
            return r2
        L_0x019f:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "social_channel_creation_source"
            java.io.Serializable r2 = r1.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.channels.analytics.ChannelCreationSource"
            X.C04220Ms.A0C(r2, r0)
            return r2
        L_0x01b1:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "subscriber_connected_fan_count_arg"
            java.lang.Integer r2 = X.C18210wN.A0T(r1, r0)
            return r2
        L_0x01be:
            java.lang.Object r0 = r10.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "InterestBasedChannelType"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x01d1
            X.20y r2 = X.AnonymousClass20y.valueOf(r0)
            return r2
        L_0x01d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x01d6:
            java.lang.Object r0 = r10.A00
            X.1bE r0 = (X.AnonymousClass1bE) r0
            X.0Oa r0 = r0.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3wu r2 = new X.3wu
            r2.<init>(r0)
            return r2
        L_0x01e6:
            java.lang.Object r0 = r10.A00
            X.1bE r0 = (X.AnonymousClass1bE) r0
            X.0Oa r0 = r0.A03
            goto L_0x0210
        L_0x01ed:
            java.lang.Object r0 = r10.A00
            X.0zy r0 = (X.C19500zy) r0
            X.4wE r1 = r0.A01
            X.Cht r0 = X.C22881Cht.A00
            r1.CrC(r0)
            goto L_0x0338
        L_0x01fa:
            java.lang.Object r0 = r10.A00
            X.1b3 r0 = (X.AnonymousClass1b3) r0
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3wt r2 = new X.3wt
            r2.<init>(r0)
            return r2
        L_0x020a:
            java.lang.Object r0 = r10.A00
            X.1b3 r0 = (X.AnonymousClass1b3) r0
            X.0Oa r0 = r0.A05
        L_0x0210:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49Y r2 = X.AnonymousClass3Zh.A01(r0)
            return r2
        L_0x0219:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = new com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository
            r2.<init>(r0)
            return r2
        L_0x0223:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.34C r2 = new X.34C
            r2.<init>(r0)
            return r2
        L_0x022d:
            java.lang.Object r0 = r10.A00
            X.4BO r0 = (X.AnonymousClass4BO) r0
            com.instagram.service.session.UserSession r0 = r0.A00
            X.49L r2 = X.AnonymousClass2MV.A00(r0)
            return r2
        L_0x0238:
            java.lang.Object r0 = r10.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.4BO r2 = new X.4BO
            r2.<init>(r0)
            return r2
        L_0x0242:
            java.lang.Object r0 = r10.A00
            X.1bt r0 = (X.C23081bt) r0
            X.0Oa r0 = r0.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3ws r2 = new X.3ws
            r2.<init>(r0)
            return r2
        L_0x0252:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.E2V r2 = X.C18190wL.A0M(r0)
            return r2
        L_0x025b:
            java.lang.Object r0 = r10.A00
            X.10b r0 = (X.C195210b) r0
            com.instagram.service.session.UserSession r3 = r0.A07
            java.lang.Class<X.48n> r2 = X.C694348n.class
            r1 = 35
            kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41 r0 = new kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41
            r0.<init>(r3, r1)
            java.lang.Object r2 = r3.A01(r2, r0)
            return r2
        L_0x026f:
            java.lang.Object r0 = r10.A00
            X.10b r0 = (X.C195210b) r0
            com.instagram.service.session.UserSession r2 = r0.A07
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.Class<X.34C> r1 = X.AnonymousClass34C.class
            r0 = 24
            kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43 r0 = X.C18250wR.A0e(r2, r0)
            java.lang.Object r2 = r2.A01(r1, r0)
            return r2
        L_0x0286:
            java.lang.Object r0 = r10.A00
            X.10b r0 = (X.C195210b) r0
            com.instagram.service.session.UserSession r0 = r0.A07
            X.49L r2 = X.AnonymousClass2MV.A00(r0)
            return r2
        L_0x0291:
            java.lang.Object r2 = r10.A00
            X.1xC r2 = (X.C29161xC) r2
            X.0Oa r0 = r2.A08
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.C8A r0 = (X.C8A) r0
            X.3xM r2 = new X.3xM
            r2.<init>(r0, r1)
            return r2
        L_0x02a9:
            java.lang.Object r0 = r10.A00
            X.1xC r0 = (X.C29161xC) r0
            X.0ZU r0 = r0.A01
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x02b4:
            java.lang.Object r0 = r10.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x02bd:
            java.lang.Object r2 = r10.A00
            return r2
        L_0x02c0:
            java.lang.Object r0 = r10.A00
            X.1xC r0 = (X.C29161xC) r0
            X.10b r3 = X.C29161xC.A0C(r0)
            X.4wE r1 = r3.A0E
            X.20x r0 = X.C304020x.ON
            r1.D7t(r0)
            X.Gh5 r2 = r3.A02
            r1 = 10
            com.facebook.redex.IDxFunctionShape368S0100000_4_I2 r0 = new com.facebook.redex.IDxFunctionShape368S0100000_4_I2
            r0.<init>(r3, r1)
            X.Gh5 r2 = r2.A0E(r0)
            X.Jil r1 = r3.A03
            X.47R r0 = X.AnonymousClass47R.A00
            goto L_0x0314
        L_0x02e1:
            java.lang.Object r0 = r10.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0wh r2 = X.C18330wh.A01(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131830080(0x7f112540, float:1.9293147E38)
            X.C18330wh.A02(r1, r2, r0)
            return r2
        L_0x02f4:
            java.lang.Object r0 = r10.A00
            X.1xC r0 = (X.C29161xC) r0
            X.10b r3 = X.C29161xC.A0C(r0)
            X.4wE r1 = r3.A0E
            X.20x r0 = X.C304020x.ON
            r1.D7t(r0)
            X.Gh5 r2 = r3.A02
            r1 = 12
            com.facebook.redex.IDxFunctionShape368S0100000_4_I2 r0 = new com.facebook.redex.IDxFunctionShape368S0100000_4_I2
            r0.<init>(r3, r1)
            X.Gh5 r2 = r2.A0E(r0)
            X.Jil r1 = r3.A03
            X.7sH r0 = X.C131537sH.A00
        L_0x0314:
            r1.A02(r0, r2)
            goto L_0x0338
        L_0x0318:
            java.lang.Object r1 = r10.A00
            X.1xC r1 = (X.C29161xC) r1
            X.10b r0 = X.C29161xC.A0C(r1)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            java.lang.String r6 = "EncryptedBackupsSettingsFragment"
            com.instagram.service.session.UserSession r2 = r0.A07
            X.9wF r3 = X.C171209wF.A12
            java.lang.String r5 = "https://help.instagram.com/390056059980348"
            r4 = 0
            X.C37412JrW.A06(r1, r2, r3, r4, r5, r6)
            goto L_0x0338
        L_0x0331:
            java.lang.Object r0 = r10.A00
            X.1xC r0 = (X.C29161xC) r0
            X.C29161xC.A0C(r0)
        L_0x0338:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43.invoke():java.lang.Object");
    }
}
