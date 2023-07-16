package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass5He;
import X.AnonymousClass784;
import X.C146958n9;
import X.C25768Drg;
import X.C39142Kno;
import X.EFO;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import kotlin.Unit;

public class KtSLambdaShape5S0501000_I2 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape5S0501000_I2(C25768Drg drg, EFO efo, C146958n9 r4) {
        super(3, r4);
        this.A06 = 2;
        this.A01 = efo;
        this.A05 = drg;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        KtSLambdaShape5S0501000_I2 ktSLambdaShape5S0501000_I2;
        C146958n9 r5 = (C146958n9) obj3;
        switch (this.A06) {
            case 0:
                KtSLambdaShape5S0501000_I2 ktSLambdaShape5S0501000_I22 = new KtSLambdaShape5S0501000_I2((AnonymousClass5He) this.A02, (EffectCollectionService) this.A05, (AnonymousClass784) this.A01, r5, 0);
                ktSLambdaShape5S0501000_I22.A03 = obj;
                ktSLambdaShape5S0501000_I22.A04 = obj2;
                return ktSLambdaShape5S0501000_I22.invokeSuspend(Unit.A00);
            case 1:
                ktSLambdaShape5S0501000_I2 = new KtSLambdaShape5S0501000_I2((AnonymousClass5He) this.A02, (EffectCollectionService) this.A05, (AnonymousClass784) this.A01, r5, 1);
                ktSLambdaShape5S0501000_I2.A03 = obj;
                ktSLambdaShape5S0501000_I2.A04 = obj2;
                break;
            default:
                ktSLambdaShape5S0501000_I2 = new KtSLambdaShape5S0501000_I2((C25768Drg) this.A05, (EFO) this.A01, r5);
                ktSLambdaShape5S0501000_I2.A02 = obj;
                ktSLambdaShape5S0501000_I2.A03 = obj2;
                break;
        }
        return ktSLambdaShape5S0501000_I2.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x028a, code lost:
        X.AnonymousClass0OU.A00(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x028f, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r0 != r1) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A06
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x008b;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r0 = r2.A00
            r8 = 3
            r10 = 2
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L_0x003e
            if (r0 == r4) goto L_0x028a
            if (r0 != r10) goto L_0x028a
            java.lang.Object r11 = r2.A04
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r9 = r2.A03
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r6 = r2.A02
            X.4r0 r6 = (X.C83234r0) r6
            X.AnonymousClass0OU.A00(r22)
        L_0x0024:
            java.lang.String r0 = r11.getAbsolutePath()
            X.C04220Ms.A06(r0)
            X.6tx r0 = X.C25562Dny.A02(r0, r9)
            r2.A02 = r7
            r2.A03 = r7
            r2.A04 = r7
            r2.A00 = r8
            java.lang.Object r0 = r6.emit(r0, r2)
        L_0x003b:
            if (r0 != r1) goto L_0x028d
            return r1
        L_0x003e:
            X.AnonymousClass0OU.A00(r22)
            java.lang.Object r6 = r2.A02
            X.4r0 r6 = (X.C83234r0) r6
            java.lang.Object r9 = r2.A03
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r3 = r2.A01
            X.EFO r3 = (X.EFO) r3
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x005c
            r2.A02 = r7
            r2.A00 = r4
            java.lang.Object r0 = r6.emit(r7, r2)
            goto L_0x003b
        L_0x005c:
            java.io.File r3 = r3.BFo()
            r0 = 1048(0x418, float:1.469E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.File r11 = X.C86154wM.A0U(r3, r0)
            boolean r0 = r11.exists()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r5 = r2.A05
            X.Drg r5 = (X.C25768Drg) r5
            X.Ew2 r4 = r5.A0A
            r3 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r11, (X.C146958n9) r7, (int) r3)
            r2.A02 = r6
            r2.A03 = r9
            r2.A04 = r11
            r2.A00 = r10
            java.lang.Object r0 = X.C25599DoZ.A00(r2, r4, r0)
            if (r0 != r1) goto L_0x0024
            return r1
        L_0x008b:
            int r0 = r2.A00
            r15 = 1
            if (r0 == 0) goto L_0x0097
            if (r0 == r15) goto L_0x028a
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0097:
            X.AnonymousClass0OU.A00(r22)
            java.lang.Object r8 = r2.A03
            X.4r0 r8 = (X.C83234r0) r8
            java.lang.Object r7 = r2.A04
            java.lang.Object r4 = r2.A05
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            java.lang.Object r9 = r2.A02
            X.5He r9 = (X.AnonymousClass5He) r9
            java.lang.Object r6 = r2.A01
            boolean r0 = r7 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00b9
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r0 = X.C86164wN.A0M(r7)
        L_0x00b2:
            r2.A00 = r15
            java.lang.Object r0 = X.C25817DsW.A02(r2, r0, r8)
            goto L_0x003b
        L_0x00b9:
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0285
            long r13 = r4.A01
            r5 = 0
            X.Dn3 r10 = r9.A01
            java.lang.String r12 = r9.A03
            java.lang.Integer r11 = r9.A02
            boolean r3 = r9.A06
            boolean r0 = r9.A05
            X.5He r9 = new X.5He
            r16 = r15
            r17 = r3
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r15, r16, r17, r18)
            r3 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r0.<init>((X.C146958n9) r5, (java.lang.Object) r4, (java.lang.Object) r9, (int) r3)
            X.86y r4 = new X.86y
            r4.<init>(r0)
            r3 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r7, (X.C146958n9) r5, (int) r3)
            X.4tk r0 = X.AnonymousClass7J0.A02(r0, r4)
            goto L_0x00b2
        L_0x00eb:
            int r3 = r2.A00
            r17 = 1
            if (r3 == 0) goto L_0x00fa
            r0 = r17
            if (r3 == r0) goto L_0x028a
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00fa:
            X.AnonymousClass0OU.A00(r22)
            java.lang.Object r6 = r2.A03
            X.4r0 r6 = (X.C83234r0) r6
            java.lang.Object r5 = r2.A04
            X.6s5 r5 = (X.C113756s5) r5
            if (r5 == 0) goto L_0x012e
            java.lang.Object r4 = r2.A01
            X.784 r4 = (X.AnonymousClass784) r4
            java.lang.Object r0 = r5.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r0
            java.lang.Object r3 = r0.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r0 = r0.A01
            int r0 = X.C86144wL.A08(r0)
            r4.A01(r3, r0)
            X.1jA r0 = X.AnonymousClass1jA.A00(r5)
        L_0x0120:
            com.facebook.redex.IDxFlowShape250S0100000_1_I2 r3 = X.C86164wN.A0M(r0)
        L_0x0124:
            r0 = r17
            r2.A00 = r0
            java.lang.Object r0 = X.C25817DsW.A02(r2, r3, r6)
            goto L_0x003b
        L_0x012e:
            java.lang.Object r7 = r2.A05
            com.instagram.ar.core.effectcollection.EffectCollectionService r7 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r7
            android.content.Context r0 = r7.A02
            boolean r0 = X.AnonymousClass0fS.A09(r0)
            if (r0 == 0) goto L_0x0161
            java.lang.Object r5 = r2.A02
            X.5He r5 = (X.AnonymousClass5He) r5
            java.lang.Object r4 = r2.A01
            X.784 r4 = (X.AnonymousClass784) r4
            X.0ZU r0 = r7.A07
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0164
            X.0Kh r0 = X.C03690Kh.A01()
            boolean r0 = r0.A09()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0164
            X.5uz r0 = X.C94485uz.A00
        L_0x015c:
            X.1jB r0 = X.C86164wN.A0R(r0)
            goto L_0x0120
        L_0x0161:
            X.5v0 r0 = X.AnonymousClass5v0.A00
            goto L_0x015c
        L_0x0164:
            com.instagram.service.session.UserSession r3 = r7.A05
            X.0gi r0 = r7.A04
            r16 = 0
            X.6jS r8 = new X.6jS
            r8.<init>(r0, r3)
            X.Dn3 r3 = r5.A01
            java.lang.String r9 = r5.A03
            boolean r0 = r5.A06
            r20 = r0
            boolean r0 = r5.A05
            r19 = r0
            com.instagram.service.session.UserSession r0 = r8.A01
            r18 = r0
            java.lang.String r12 = r3.A02
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r15 = X.C31032GeB.A01(r18)
            r10 = 0
            X.3zb r11 = X.C67463zb.A00()
            java.lang.String r13 = "device_capabilities"
            r11.A02(r15, r13)
            java.lang.String r13 = "TAR_BROTLI"
            java.lang.String r0 = "ZIP"
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r13, r0)
            X.C04220Ms.A06(r13)
            java.lang.String r0 = "supported_compression_types"
            r11.A06(r0, r13)
            java.lang.String r0 = "cursor"
            r11.A05(r0, r9)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "preview_width"
            r11.A04(r0, r14)
            java.lang.String r0 = "preview_height"
            r11.A04(r0, r14)
            java.lang.String r13 = r3.A01
            java.lang.String r0 = "product_category_identifier"
            r11.A05(r0, r13)
            java.lang.String r0 = "product"
            r11.A05(r0, r12)
            r0 = 1361(0x551, float:1.907E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.A04(r0, r14)
            r0 = 1359(0x54f, float:1.904E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.A04(r0, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "include_preview_image"
            r11.A03(r0, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "include_flm_effects"
            r11.A03(r0, r14)
            java.lang.String r14 = "CAMERA"
            java.lang.String r0 = "effect_action_sheet_surface"
            r11.A05(r0, r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "formatted_media_count_enabled"
            r11.A03(r0, r14)
            java.util.Map r15 = r15.A07()
            java.lang.String r14 = "supported_texture_formats"
            boolean r0 = r15.containsKey(r14)
            if (r0 == 0) goto L_0x0225
            java.lang.Object r15 = r15.get(r14)
            boolean r0 = r15 instanceof java.util.List
            if (r0 == 0) goto L_0x0225
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r16 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r15 = r15.iterator()
        L_0x0212:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x021e
            r0 = r16
            X.C86124wJ.A1V(r0, r15)
            goto L_0x0212
        L_0x021e:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r16)
            r11.A06(r14, r0)
        L_0x0225:
            java.lang.Class<X.5GE> r0 = X.AnonymousClass5GE.class
            java.lang.String r15 = "IGAREffectCollectionQuery"
            X.3zc r14 = new X.3zc
            r14.<init>(r11, r0, r15)
            java.lang.StringBuilder r11 = X.C18200wM.A0r()
            java.lang.String r0 = r18.getUserId()
            r11.append(r0)
            r0 = 95
            r11.append(r0)
            r11.append(r12)
            r11.append(r0)
            r11.append(r13)
            r11.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r9, r11)
            int r9 = r0.hashCode()
            java.lang.String r0 = "effect_collection_"
            java.lang.String r9 = X.AnonymousClass00U.A0J(r0, r9)
            r0 = 3
            X.C04220Ms.A0B(r9, r0)
            r11 = 697(0x2b9, float:9.77E-43)
            X.GfJ r9 = new X.GfJ
            r0 = r18
            r9.<init>((X.C10300i6) r0)
            r9.A06(r14)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r9.A03 = r0
            r9.A05 = r10
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r11 = X.C86104wH.A0O(r9, r11)
            r0 = 7
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r9.<init>((X.C146958n9) r10, (java.lang.Object) r8, (java.lang.Object) r3, (int) r0)
            r3 = 4
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r0 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r0.<init>((X.AnonymousClass0YP) r9, (X.C84714tk) r11, (int) r3)
            X.86t r3 = new X.86t
            r3.<init>(r5, r7, r4, r0)
            goto L_0x0124
        L_0x0285:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x028a:
            X.AnonymousClass0OU.A00(r22)
        L_0x028d:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape5S0501000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape5S0501000_I2(AnonymousClass5He r2, EffectCollectionService effectCollectionService, AnonymousClass784 r4, C146958n9 r5, int i) {
        super(3, r5);
        this.A06 = i;
        this.A05 = effectCollectionService;
        this.A02 = r2;
        this.A01 = r4;
    }
}
