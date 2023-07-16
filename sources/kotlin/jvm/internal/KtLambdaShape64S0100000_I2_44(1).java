package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape64S0100000_I2_44 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape64S0100000_I2_44(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r4 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r4 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bb, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x003f;
                case 2: goto L_0x0057;
                case 3: goto L_0x0069;
                case 4: goto L_0x0076;
                case 5: goto L_0x0088;
                case 6: goto L_0x0097;
                case 7: goto L_0x00a6;
                case 8: goto L_0x00a9;
                case 9: goto L_0x0005;
                case 10: goto L_0x00b2;
                case 11: goto L_0x00a6;
                case 12: goto L_0x00a9;
                case 13: goto L_0x0005;
                case 14: goto L_0x00dc;
                case 15: goto L_0x00f3;
                case 16: goto L_0x00ff;
                case 17: goto L_0x00ff;
                case 18: goto L_0x00ff;
                case 19: goto L_0x010c;
                case 20: goto L_0x0025;
                case 21: goto L_0x002e;
                case 22: goto L_0x0119;
                case 23: goto L_0x0128;
                case 24: goto L_0x0137;
                case 25: goto L_0x0146;
                case 26: goto L_0x0150;
                case 27: goto L_0x0157;
                case 28: goto L_0x0167;
                case 29: goto L_0x0172;
                case 30: goto L_0x017d;
                case 31: goto L_0x0188;
                case 32: goto L_0x0192;
                case 33: goto L_0x0192;
                case 34: goto L_0x0192;
                case 35: goto L_0x01a0;
                case 36: goto L_0x01aa;
                case 37: goto L_0x01bc;
                case 38: goto L_0x01c6;
                case 39: goto L_0x01d1;
                case 40: goto L_0x01e6;
                case 41: goto L_0x00a6;
                case 42: goto L_0x00a9;
                case 43: goto L_0x0005;
                case 44: goto L_0x01f5;
                case 45: goto L_0x01fe;
                case 46: goto L_0x00a6;
                case 47: goto L_0x00a9;
                case 48: goto L_0x0005;
                case 49: goto L_0x0210;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r4 = X.C18180wK.A0H(r0)
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "BroadcastChannelNuxActionType"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0022
            X.21t r4 = X.C305421t.valueOf(r0)
            if (r4 != 0) goto L_0x000d
        L_0x0022:
            X.21t r4 = X.C305421t.Create
            return r4
        L_0x0025:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "thread_id"
            goto L_0x0036
        L_0x002e:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "thread_v2_id"
        L_0x0036:
            java.lang.String r4 = r1.getString(r0)
            if (r4 != 0) goto L_0x000d
            java.lang.String r4 = ""
            return r4
        L_0x003f:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "InterestBasedChannelType"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0052
            X.20y r4 = X.AnonymousClass20y.valueOf(r0)
            return r4
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0057:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "social_channel_creation_source"
            java.io.Serializable r4 = r1.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.channels.analytics.ChannelCreationSource"
            X.C04220Ms.A0C(r4, r0)
            return r4
        L_0x0069:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "channel_creation_entry_from_chooser"
            java.lang.Boolean r4 = X.C18210wN.A0Q(r1, r0)
            return r4
        L_0x0076:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r2 = X.C18230wP.A0D(r0)
            java.lang.String r1 = "interest_based_channel_implicit_audience_type"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0088:
            java.lang.Object r0 = r5.A00
            X.1b6 r0 = (X.AnonymousClass1b6) r0
            X.0Oa r0 = r0.A07
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49Y r4 = X.AnonymousClass3Zh.A01(r0)
            return r4
        L_0x0097:
            java.lang.Object r0 = r5.A00
            X.1b6 r0 = (X.AnonymousClass1b6) r0
            X.0Oa r0 = r0.A07
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49W r4 = X.AnonymousClass2MQ.A00(r0)
            return r4
        L_0x00a6:
            java.lang.Object r4 = r5.A00
            return r4
        L_0x00a9:
            java.lang.Object r0 = r5.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r4 = r0.invoke()
            return r4
        L_0x00b2:
            java.lang.Object r4 = r5.A00
            X.1b6 r4 = (X.AnonymousClass1b6) r4
            X.0Oa r0 = r4.A01
            java.lang.Object r3 = r0.getValue()
            X.20y r3 = (X.AnonymousClass20y) r3
            X.0Oa r0 = r4.A07
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.0Oa r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            X.0Oa r0 = r4.A00
            java.lang.Object r0 = r0.getValue()
            X.21t r0 = (X.C305421t) r0
            X.3xl r4 = new X.3xl
            r4.<init>(r0, r3, r2, r1)
            return r4
        L_0x00dc:
            java.lang.Object r0 = r5.A00
            X.1aq r0 = (X.AnonymousClass1aq) r0
            X.24x r1 = r0.A01
            if (r1 != 0) goto L_0x00eb
            java.lang.String r0 = "initialOption"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x00eb:
            boolean r0 = r0.A02
            X.3xN r4 = new X.3xN
            r4.<init>(r1, r0)
            return r4
        L_0x00f3:
            java.lang.Object r0 = r5.A00
            X.GTG r0 = (X.GTG) r0
            X.Fi1 r0 = r0.A09
            r0.A00()
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x00ff:
            java.lang.Object r0 = r5.A00
            X.GTG r0 = (X.GTG) r0
            X.Fi1 r0 = r0.A09
            X.H4z r0 = r0.A00
            X.C32105H4z.A03(r0)
            goto L_0x01b9
        L_0x010c:
            java.lang.Object r0 = r5.A00
            android.os.Bundle r1 = X.C18230wP.A0D(r0)
            java.lang.String r0 = "audience_type"
            java.lang.Integer r4 = X.C18210wN.A0T(r1, r0)
            return r4
        L_0x0119:
            java.lang.Object r0 = r5.A00
            X.1b4 r0 = (X.AnonymousClass1b4) r0
            X.0Oa r0 = r0.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49Y r4 = X.AnonymousClass3Zh.A01(r0)
            return r4
        L_0x0128:
            java.lang.Object r0 = r5.A00
            X.1b4 r0 = (X.AnonymousClass1b4) r0
            X.0Oa r0 = r0.A06
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.KHq r4 = X.AnonymousClass3LY.A00(r0)
            return r4
        L_0x0137:
            java.lang.Object r1 = r5.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0W(r1, r0)
            X.49J r4 = X.AnonymousClass2M0.A00(r0)
            return r4
        L_0x0146:
            java.lang.Object r0 = r5.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0150:
            java.lang.Object r0 = r5.A00
            X.06B r4 = X.C18230wP.A0K(r0)
            return r4
        L_0x0157:
            java.lang.Object r1 = r5.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0W(r1, r0)
            X.3wv r4 = new X.3wv
            r4.<init>(r0)
            return r4
        L_0x0167:
            java.lang.Object r0 = r5.A00
            X.1oj r0 = (X.AnonymousClass1oj) r0
            com.instagram.service.session.UserSession r0 = r0.A05
            X.49Y r4 = X.AnonymousClass3Zh.A01(r0)
            return r4
        L_0x0172:
            java.lang.Object r0 = r5.A00
            X.1oi r0 = (X.AnonymousClass1oi) r0
            com.instagram.service.session.UserSession r0 = r0.A06
            X.49W r4 = X.AnonymousClass2MQ.A00(r0)
            return r4
        L_0x017d:
            java.lang.Object r0 = r5.A00
            X.1oh r0 = (X.AnonymousClass1oh) r0
            com.instagram.service.session.UserSession r0 = r0.A06
            X.49J r4 = X.AnonymousClass2M0.A00(r0)
            return r4
        L_0x0188:
            java.lang.Object r0 = r5.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.1uL r4 = new X.1uL
            r4.<init>(r0)
            return r4
        L_0x0192:
            java.lang.Object r0 = r5.A00
            X.1uL r0 = (X.C28461uL) r0
            X.4wD r1 = r0.A01
            X.1oq r0 = X.C25741oq.A00
            r1.D7w(r0)
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x01a0:
            java.lang.Object r0 = r5.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.48h r4 = new X.48h
            r4.<init>(r0)
            return r4
        L_0x01aa:
            java.lang.Object r0 = r5.A00
            com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer r0 = (com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer) r0
            X.GCL r0 = r0.A01
            if (r0 == 0) goto L_0x01b9
            X.4wD r1 = r0.A06
            kotlin.Unit r0 = kotlin.Unit.A00
            X.AnonymousClass6W1.A00(r0, r1)
        L_0x01b9:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x01bc:
            java.lang.Object r0 = r5.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.direct.headmojis.service.HeadmojiRepository r4 = new com.instagram.direct.headmojis.service.HeadmojiRepository
            r4.<init>(r0)
            return r4
        L_0x01c6:
            java.lang.Object r0 = r5.A00
            X.CZp r0 = (X.C22434CZp) r0
            com.instagram.service.session.UserSession r0 = r0.A01
            com.instagram.direct.headmojis.service.HeadmojiRepository r4 = X.C35162Mi.A00(r0)
            return r4
        L_0x01d1:
            java.lang.Object r1 = r5.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.lifecycle.LifecycleCoroutineScopeImpl r3 = X.C18200wM.A0M(r1)
            r2 = 0
            r0 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7 r1 = X.C18240wQ.A0n(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x01e6:
            java.lang.Object r0 = r5.A00
            X.CT6 r0 = (X.CT6) r0
            X.0Oa r0 = r0.A07
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.direct.headmojis.service.HeadmojiRepository r4 = X.C35162Mi.A00(r0)
            return r4
        L_0x01f5:
            java.lang.Object r1 = r5.A00
            r0 = 1
            com.facebook.redex.IDxFactoryShape557S0100000_1_I2 r4 = new com.facebook.redex.IDxFactoryShape557S0100000_1_I2
            r4.<init>(r1, r0)
            return r4
        L_0x01fe:
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r1 = r0.mView
            if (r1 == 0) goto L_0x020e
            r0 = 2131301376(0x7f091400, float:1.8220808E38)
            android.view.View r4 = r1.findViewById(r0)
            return r4
        L_0x020e:
            r4 = 0
            return r4
        L_0x0210:
            java.lang.Object r1 = r5.A00
            r0 = 2
            com.facebook.redex.IDxFactoryShape557S0100000_1_I2 r4 = new com.facebook.redex.IDxFactoryShape557S0100000_1_I2
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44.invoke():java.lang.Object");
    }
}
