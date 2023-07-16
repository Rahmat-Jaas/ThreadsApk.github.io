package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.C02220Ah;

public class KtLambdaShape6S1100000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public String A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape6S1100000_I2(String str, Object obj, int i) {
        super(1);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03fe, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0402, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0426, code lost:
        X.C128957ke.A04(r0, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0495, code lost:
        return X.C41062Lvj.A00((android.content.Context) r3.A00, r2, r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0496, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r2.isEmpty() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30) {
        /*
            r29 = this;
            r3 = r29
            r4 = r30
            int r0 = r3.A02
            switch(r0) {
                case 2: goto L_0x0015;
                case 3: goto L_0x0015;
                case 4: goto L_0x0331;
                case 5: goto L_0x03da;
                case 6: goto L_0x03cb;
                case 7: goto L_0x03bc;
                case 8: goto L_0x03ad;
                case 9: goto L_0x039e;
                case 10: goto L_0x038f;
                case 11: goto L_0x0380;
                case 12: goto L_0x0371;
                case 13: goto L_0x0568;
                case 14: goto L_0x03ec;
                case 15: goto L_0x033c;
                case 16: goto L_0x0331;
                case 17: goto L_0x0319;
                case 18: goto L_0x0319;
                case 19: goto L_0x0526;
                case 20: goto L_0x02ff;
                case 21: goto L_0x02e7;
                case 22: goto L_0x051a;
                case 23: goto L_0x026e;
                case 24: goto L_0x025d;
                case 25: goto L_0x01ab;
                case 26: goto L_0x019c;
                case 27: goto L_0x0189;
                case 28: goto L_0x0502;
                case 29: goto L_0x04d0;
                case 30: goto L_0x0498;
                case 31: goto L_0x016a;
                case 32: goto L_0x016a;
                case 33: goto L_0x0134;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0009;
                case 37: goto L_0x0009;
                case 38: goto L_0x0009;
                case 39: goto L_0x0009;
                case 40: goto L_0x0121;
                case 41: goto L_0x0110;
                case 42: goto L_0x00a0;
                case 43: goto L_0x0477;
                case 44: goto L_0x0462;
                case 45: goto L_0x0086;
                case 46: goto L_0x006f;
                case 47: goto L_0x005b;
                case 48: goto L_0x0442;
                case 49: goto L_0x042b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r3.A00
            X.EAV r1 = (X.EAV) r1
            java.lang.String r0 = r3.A01
            r1.A0A(r0)
        L_0x0012:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x0014:
            return r5
        L_0x0015:
            java.lang.Object r0 = r3.A00
            X.7r0 r0 = (X.AnonymousClass7r0) r0
            java.lang.String r3 = r3.A01
            java.util.Map r0 = r0.A01
            java.lang.Object r2 = r0.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x002c
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            java.lang.String r1 = "MediaStoreDataModule"
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "Failed to publish update: no observers bound to "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r3)
            X.C30967GcS.A02(r1, r0)
            goto L_0x0012
        L_0x003b:
            java.util.Iterator r1 = r2.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.7HV r0 = (X.AnonymousClass7HV) r0
            if (r0 != 0) goto L_0x0057
            r1.remove()
            goto L_0x003f
        L_0x0057:
            r0.A0B(r3, r4)
            goto L_0x003f
        L_0x005b:
            X.Gv3 r4 = (X.C31731Gv3) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.String r0 = r3.A01
            X.EPn r1 = new X.EPn
            r1.<init>(r4, r0)
            java.lang.Object r0 = r3.A00
            X.Inj r0 = (X.C35124Inj) r0
            X.JjY r0 = r0.A0B
            goto L_0x0082
        L_0x006f:
            X.Gv3 r4 = (X.C31731Gv3) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.String r0 = r3.A01
            X.EPn r1 = new X.EPn
            r1.<init>(r4, r0)
            java.lang.Object r0 = r3.A00
            X.CsJ r0 = (X.C23440CsJ) r0
            X.JjY r0 = r0.A02
        L_0x0082:
            r0.A00(r1)
            goto L_0x0012
        L_0x0086:
            X.IRw r4 = (X.IRw) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.5fi r0 = r4.A0O
            java.lang.String r2 = r3.A01
            java.lang.Object r1 = r3.A00
            java.util.Map r1 = (java.util.Map) r1
            X.C18200wM.A1S(r2, r1)
            com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi r0 = r0.A00
            if (r0 == 0) goto L_0x0012
            r0.updateParticipants(r2, r1)
            goto L_0x0012
        L_0x00a0:
            android.view.View r0 = X.C86124wJ.A0L(r4)
            java.lang.Object r6 = r0.getTag()
            r0 = 74
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C04220Ms.A0C(r6, r0)
            X.9lt r6 = (X.C165399lt) r6
            java.lang.Object r5 = r3.A00
            X.BTt r5 = (X.C20212BTt) r5
            X.C3T r4 = r5.A00
            r0 = r4
            com.instagram.reels.fragment.ReelViewerFragment r0 = (com.instagram.reels.fragment.ReelViewerFragment) r0
            X.Ayp r2 = r0.A0Q
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0580
            X.Ayp r0 = r6.A05
            boolean r0 = X.C04220Ms.A0I(r0, r2)
            if (r0 == 0) goto L_0x0012
            com.instagram.service.session.UserSession r5 = r5.A01
            boolean r0 = r2.A0O(r5)
            if (r0 != 0) goto L_0x0012
            X.BKH r4 = r4.AbP()
            if (r4 == 0) goto L_0x057b
            java.lang.String r2 = r3.A01
            if (r2 == 0) goto L_0x0108
            X.BKU r0 = r4.A0M
            if (r0 == 0) goto L_0x0576
            java.util.List r0 = X.BKU.A1G(r0)
            if (r0 == 0) goto L_0x0108
            java.util.Iterator r1 = r0.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r1.next()
            X.BOh r0 = (X.C20100BOh) r0
            com.instagram.model.shopping.Product r0 = r0.A09()
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            java.lang.String r0 = r0.A0j
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ea
            r1.remove()
            goto L_0x00ea
        L_0x0108:
            X.Aqb r1 = r6.A16
            r0 = 0
            X.C17490ACc.A00(r4, r1, r0, r5)
            goto L_0x0012
        L_0x0110:
            long r4 = X.C18190wL.A08(r4)
            java.lang.Object r0 = r3.A00
            X.7wc r0 = (X.C133877wc) r0
            com.facebook.quicklog.reliability.UserFlowLogger r1 = r0.A01
            java.lang.String r0 = r3.A01
            r1.flowMarkPoint(r4, r0)
            goto L_0x0012
        L_0x0121:
            long r4 = X.C18190wL.A08(r4)
            java.lang.Object r0 = r3.A00
            X.7wc r0 = (X.C133877wc) r0
            com.facebook.quicklog.reliability.UserFlowLogger r2 = r0.A01
            java.lang.String r1 = r3.A01
            java.lang.String r0 = ""
            r2.flowEndFail(r4, r1, r0)
            goto L_0x0012
        L_0x0134:
            r5 = r4
            X.CJx r5 = (X.C22164CJx) r5
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.util.List r0 = r5.A0B
            java.lang.String r4 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0143:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.DsH r0 = (X.C25803DsH) r0
            java.lang.String r0 = r0.A07
            boolean r0 = X.C04220Ms.A0I(r0, r4)
            if (r0 == 0) goto L_0x0143
        L_0x0158:
            X.DsH r1 = (X.C25803DsH) r1
            if (r1 == 0) goto L_0x0014
            java.lang.Object r0 = r3.A00
            X.BBH r0 = (X.BBH) r0
            X.BZI r0 = r0.A00
            java.lang.String r0 = r0.A0f
            r1.A0J(r0)
            return r5
        L_0x0168:
            r1 = 0
            goto L_0x0158
        L_0x016a:
            java.lang.String r1 = X.C18210wN.A0f(r4)
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0178
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0182
        L_0x0178:
            java.lang.String r0 = " "
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0182
            goto L_0x0012
        L_0x0182:
            java.lang.Object r0 = r3.A00
            X.C86134wK.A1L(r0, r1)
            goto L_0x0012
        L_0x0189:
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r2 = r3.A00
            X.0YM r2 = (X.AnonymousClass0YM) r2
            java.lang.String r1 = r3.A01
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r2.invoke(r1, r4, r0)
            goto L_0x0012
        L_0x019c:
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r1 = r3.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            java.lang.String r0 = r3.A01
            r1.invoke(r0, r4)
            goto L_0x0012
        L_0x01ab:
            X.7HD r4 = (X.AnonymousClass7HD) r4
            r5 = 0
            X.C04220Ms.A0B(r4, r5)
            java.lang.Object r0 = r3.A00
            X.56Z r0 = (X.AnonymousClass56Z) r0
            java.lang.String r3 = r3.A01
            X.C04220Ms.A0B(r3, r5)
            r26 = 1
            r9 = 0
            r10 = 1013(0x3f5, float:1.42E-42)
            X.5J1 r2 = new X.5J1
            r7 = r4
            r8 = r9
            r11 = r26
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            X.4wE r4 = r0.A0D
        L_0x01cb:
            java.lang.Object r6 = r4.getValue()
            r12 = r6
            X.5IX r12 = (X.AnonymousClass5IX) r12
            java.util.List r7 = r12.A0B
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x01dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r0 = r1.next()
            X.5J1 r0 = (X.AnonymousClass5J1) r0
            r24 = 1015(0x3f7, float:1.422E-42)
            r18 = r9
            r19 = r9
            r20 = r0
            r21 = r9
            r22 = r9
            r23 = r9
            r25 = r5
            r27 = r5
            r28 = r5
            X.5J1 r0 = X.AnonymousClass5J1.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r8.add(r0)
            goto L_0x01dc
        L_0x0204:
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
        L_0x0209:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0258
            java.lang.Object r0 = r7.next()
            boolean r0 = X.AnonymousClass5J1.A01(r0, r3)
            if (r0 == 0) goto L_0x0255
            if (r1 < 0) goto L_0x0258
            int r7 = r1 + 1
            java.util.List r0 = r8.subList(r5, r7)
            java.util.List r1 = X.AnonymousClass00J.A0X(r2, r0)
            int r0 = r8.size()
            java.util.List r0 = r8.subList(r7, r0)
            java.util.List r16 = X.AnonymousClass00J.A0V(r0, r1)
        L_0x0231:
            r18 = 8388351(0x7ffeff, float:1.1754583E-38)
            r10 = r9
            r11 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            X.5IX r0 = X.AnonymousClass5IX.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r4.ADi(r6, r0)
            if (r0 == 0) goto L_0x01cb
            goto L_0x0012
        L_0x0255:
            int r1 = r1 + 1
            goto L_0x0209
        L_0x0258:
            java.util.List r16 = X.AnonymousClass00J.A0X(r2, r8)
            goto L_0x0231
        L_0x025d:
            X.7HD r4 = (X.AnonymousClass7HD) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r1 = r3.A00
            X.56Z r1 = (X.AnonymousClass56Z) r1
            java.lang.String r0 = r3.A01
            r1.A0B(r4, r0)
            goto L_0x0012
        L_0x026e:
            int r4 = X.AnonymousClass0wJ.A04(r4)
            java.lang.Object r7 = r3.A00
            X.56Z r7 = (X.AnonymousClass56Z) r7
            java.lang.String r3 = r3.A01
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.util.List r0 = X.AnonymousClass5IX.A01(r7)
            java.util.Iterator r2 = r0.iterator()
        L_0x0284:
            boolean r0 = r2.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x02e5
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass5J1.A01(r1, r3)
            if (r0 == 0) goto L_0x0284
        L_0x0295:
            X.5J1 r1 = (X.AnonymousClass5J1) r1
            if (r1 == 0) goto L_0x0012
            X.8s2 r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x029f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.8lm r0 = (X.C146178lm) r0
            int r0 = r0.AnQ()
            if (r0 != r4) goto L_0x029f
        L_0x02b2:
            X.8lm r1 = (X.C146178lm) r1
            if (r1 == 0) goto L_0x0012
            com.instagram.common.gallery.Medium r6 = r1.Av8()
            if (r6 == 0) goto L_0x0012
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape3S0001000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape3S0001000_I2
            r0.<init>(r4, r1)
            X.AnonymousClass56Z.A03(r7, r3, r0)
            X.4qz r5 = X.AnonymousClass3J5.A00(r7)
            r2 = 3
            X.E5N r1 = X.C18250wR.A0J(r8, r2)
            r4 = 2
            r0 = 105(0x69, float:1.47E-43)
            X.0gQ r3 = r1.BQy(r0, r2)
            r2 = 0
            r1 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r7, (X.C146958n9) r8, (int) r1)
            X.C25237DiI.A00(r2, r3, r0, r5, r4)
            goto L_0x0012
        L_0x02e3:
            r1 = r8
            goto L_0x02b2
        L_0x02e5:
            r1 = r8
            goto L_0x0295
        L_0x02e7:
            X.8pw r2 = X.C86144wL.A0J(r4)
            java.lang.Object r1 = r3.A00
            X.6vX r1 = (X.C115596vX) r1
            java.lang.String r0 = r3.A01
            boolean r0 = r1.A07(r0)
            float r0 = X.C86164wN.A01(r0)
            X.7Wz r2 = (X.C123457Wz) r2
            r2.A00 = r0
            goto L_0x0012
        L_0x02ff:
            X.8mv r4 = X.C86124wJ.A0Q(r4)
            java.lang.String r0 = r3.A01
            X.AnonymousClass7Aq.A02(r4, r0)
            java.lang.Object r1 = r3.A00
            r0 = 30
            kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11 r2 = new kotlin.jvm.internal.KtLambdaShape31S0100000_I2_11
            r2.<init>(r1, r0)
            r1 = 0
            X.77Z r0 = X.C103976b2.A07
            X.C146828mv.A00(r0, r4, r1, r2)
            goto L_0x0012
        L_0x0319:
            java.lang.Object r0 = r3.A00
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            boolean r0 = X.AnonymousClass7Kx.A0R(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r4 instanceof com.facebook.graphql.impls.ShippingAddressResponseImpl
            if (r0 == 0) goto L_0x032b
            r5 = r4
            com.facebook.graphql.impls.ShippingAddressResponseImpl r5 = (com.facebook.graphql.impls.ShippingAddressResponseImpl) r5
        L_0x032b:
            X.6cZ r6 = new X.6cZ
            r6.<init>(r5)
            return r6
        L_0x0331:
            java.lang.Object r1 = r3.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r3.A01
            r1.invoke(r0)
            goto L_0x0012
        L_0x033c:
            boolean r2 = X.AnonymousClass0wJ.A1X(r4)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r3.A00
            X.58M r0 = (X.AnonymousClass58M) r0
            com.fbpay.logging.LoggingContext r4 = r0.A0v()
            java.lang.String r7 = r3.A01
            X.587 r0 = r0.A1O
            java.util.LinkedHashMap r5 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r5, r2)
            java.lang.String r6 = "selected_shipping_option"
            X.09x r1 = X.C128957ke.A00(r1, r7)
            java.lang.String r0 = "client_load_shippingoption_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 366(0x16e, float:5.13E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r8 = 5
            kotlin.jvm.internal.KtLambdaShape1S2200000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape1S2200000_I2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0426
        L_0x0371:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.Object r1 = r3.A00
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r3.A01
            r2.DAS(r0, r1)
            goto L_0x0012
        L_0x0380:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.DAQ(r1, r0)
            goto L_0x0012
        L_0x038f:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.DAP(r1, r0)
            goto L_0x0012
        L_0x039e:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.CYK(r1, r0)
            goto L_0x0012
        L_0x03ad:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.CYJ(r1, r0)
            goto L_0x0012
        L_0x03bc:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.BPz(r1, r0)
            goto L_0x0012
        L_0x03cb:
            X.8mi r2 = X.C86104wH.A0N(r4)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            java.util.Map r0 = (java.util.Map) r0
            r2.AGC(r1, r0)
            goto L_0x0012
        L_0x03da:
            java.lang.Object r0 = r3.A00
            X.5Ei r0 = (X.C89395Ei) r0
            X.5ix r1 = r0.A02
            if (r1 == 0) goto L_0x03e9
            java.lang.String r0 = r3.A01
            r1.handleMessage(r0)
            goto L_0x0012
        L_0x03e9:
            java.lang.String r0 = "messageHandler"
            goto L_0x03fe
        L_0x03ec:
            boolean r2 = X.AnonymousClass0wJ.A1X(r4)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = r3.A00
            X.58J r0 = (X.AnonymousClass58J) r0
            com.fbpay.logging.LoggingContext r4 = r0.A02
            if (r4 != 0) goto L_0x0403
            java.lang.String r0 = "loggingContext"
        L_0x03fe:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0403:
            java.lang.String r6 = r3.A01
            X.587 r0 = r0.A0S
            boolean r8 = r0.A03
            java.util.LinkedHashMap r5 = X.AnonymousClass7Kr.A07(r0)
            X.C86104wH.A1V(r5, r2)
            X.09x r1 = X.C128957ke.A00(r1, r6)
            java.lang.String r0 = "client_load_ecpotc_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 291(0x123, float:4.08E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r7 = 6
            kotlin.jvm.internal.KtLambdaShape3S1210000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape3S1210000_I2
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x0426:
            X.C128957ke.A04(r0, r4, r3)
            goto L_0x0012
        L_0x042b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.String r1 = r3.A01
            X.8QL r0 = X.AnonymousClass8QL.A00
            java.util.Map r2 = X.AnonymousClass8vI.A02(r4, r1, r0)
            r1 = 0
            r0 = 15
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1100000_I2_1
            r5.<init>((java.lang.String) r1, (int) r0, (java.util.Map) r2)
            return r5
        L_0x0442:
            X.JQF r4 = (X.JQF) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r3.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.H1T r5 = X.C18180wK.A0P(r0)
            java.lang.Class<X.657> r1 = X.AnonymousClass657.class
            java.lang.Class<X.71g> r0 = X.C1185271g.class
            r5.A0B(r1, r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "browse_session_id"
            r5.A0O(r0, r1)
            X.C35771J3h.A00(r5, r4)
            return r5
        L_0x0462:
            X.8qu r4 = (X.C148368qu) r4
            if (r4 == 0) goto L_0x0496
            X.8qt r0 = r4.BJd()
            if (r0 == 0) goto L_0x0496
            X.8qs r0 = r0.AoB()
            if (r0 == 0) goto L_0x0496
            X.MfH r2 = r0.A9k()
            goto L_0x048b
        L_0x0477:
            X.8qq r4 = (X.C148328qq) r4
            if (r4 == 0) goto L_0x0496
            X.8qp r0 = r4.B7i()
            if (r0 == 0) goto L_0x0496
            X.8qo r0 = r0.AoA()
            if (r0 == 0) goto L_0x0496
            X.MfH r2 = r0.A9k()
        L_0x048b:
            java.lang.Object r1 = r3.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r3.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2230000_I2 r5 = X.C41062Lvj.A00(r1, r2, r0)
            return r5
        L_0x0496:
            r2 = 0
            goto L_0x048b
        L_0x0498:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r4
            r7 = 0
            X.C04220Ms.A0B(r4, r7)
            java.lang.Object r8 = r4.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r8
            java.lang.String r6 = r3.A01
            java.lang.Object r5 = r3.A00
            X.0YY r5 = (X.AnonymousClass0YY) r5
            java.lang.Object r0 = r8.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x04b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x054b
            java.lang.Object r1 = r2.next()
            X.9S0 r1 = (X.AnonymousClass9S0) r1
            java.lang.String r0 = r1.A08
            boolean r0 = X.C04220Ms.A0I(r0, r6)
            if (r0 == 0) goto L_0x04cc
            java.lang.Object r1 = r5.invoke(r1)
        L_0x04cc:
            r3.add(r1)
            goto L_0x04b4
        L_0x04d0:
            X.AP0 r4 = (X.AP0) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            android.view.MotionEvent r6 = r4.A00
            X.C04220Ms.A05(r6)
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0500
            java.lang.Object r0 = r3.A00
            X.9FF r0 = (X.AnonymousClass9FF) r0
            X.B48 r5 = r0.A02
            X.9CZ r2 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A07
            com.instagram.user.model.User r1 = r2.A0B(r0)
            java.lang.String r0 = r3.A01
            android.view.View$OnTouchListener r1 = r5.A0C(r2, r1, r0)
            android.view.View r0 = r4.A01
            boolean r0 = r1.onTouch(r0, r6)
        L_0x04fb:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0500:
            r0 = 0
            goto L_0x04fb
        L_0x0502:
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r3.A00
            X.9En r0 = (X.C154969En) r0
            X.B48 r2 = r0.A03
            X.9CZ r1 = r0.A02
            java.lang.String r0 = r3.A01
            X.C04220Ms.A05(r0)
            android.view.View$OnTouchListener r5 = r2.A0C(r1, r4, r0)
            return r5
        L_0x051a:
            java.lang.Object r1 = r3.A00
            X.6vX r1 = (X.C115596vX) r1
            java.lang.String r0 = r3.A01
            X.7W8 r5 = new X.7W8
            r5.<init>(r1, r0)
            return r5
        L_0x0526:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.String r3 = r3.A01
            r6 = 0
            java.util.Iterator r2 = r4.iterator()
        L_0x0533:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0567
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.fbpay.w3c.models.W3CCardDetail r0 = (com.fbpay.w3c.models.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r0 = r0.A07
            boolean r0 = X.C04220Ms.A0I(r0, r3)
            if (r0 == 0) goto L_0x0533
            return r1
        L_0x054b:
            java.lang.Object r2 = r8.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r8.A00
            X.5IG r0 = (X.AnonymousClass5IG) r0
            X.AnonymousClass0wJ.A1O(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2
            r1.<init>((X.AnonymousClass5IG) r0, (java.util.List) r3, (java.util.List) r2)
            java.lang.Object r0 = r4.A01
            X.9S0 r0 = (X.AnonymousClass9S0) r0
            X.C04220Ms.A0B(r0, r7)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r6.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r1, (X.AnonymousClass9S0) r0)
        L_0x0567:
            return r6
        L_0x0568:
            r2 = 0
            X.C04220Ms.A0B(r4, r2)
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            kotlin.jvm.internal.KtLambdaShape6S1200000_I2 r5 = new kotlin.jvm.internal.KtLambdaShape6S1200000_I2
            r5.<init>(r0, r4, r1, r2)
            return r5
        L_0x0576:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r1)
            throw r0
        L_0x057b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x0580:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape6S1100000_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
