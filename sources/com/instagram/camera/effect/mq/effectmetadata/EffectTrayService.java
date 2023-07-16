package com.instagram.camera.effect.mq.effectmetadata;

import X.AnonymousClass00J;
import X.AnonymousClass0ZV;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass5He;
import X.AnonymousClass5y1;
import X.AnonymousClass5y3;
import X.C04220Ms;
import X.C09810gi;
import X.C09820gj;
import X.C105796e0;
import X.C115576vV;
import X.C1372386v;
import X.C18170wI;
import X.C18190wL;
import X.C18210wN;
import X.C18250wR;
import X.C19771B9r;
import X.C25240DiL;
import X.C25515Dn3;
import X.C84714tk;
import X.C84874u0;
import X.C86074wE;
import X.C86164wN;
import X.C94975xz;
import X.E5N;
import X.GXO;
import com.facebook.redex.IDxFlowShape76S0300000_2_I2;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class EffectTrayService {
    public final C115576vV A00;
    public final EffectCollectionService A01;
    public final EffectsByIdMetadataService A02;
    public final GXO A03;
    public final C84874u0 A04;
    public final C09810gi A05;
    public final C19771B9r A06;
    public final C86074wE A07 = C18190wL.A0z(C94975xz.A00);

    public /* synthetic */ EffectTrayService(C115576vV r4, EffectCollectionService effectCollectionService, GXO gxo, UserSession userSession, C19771B9r b9r) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C09810gi r0 = C09820gj.A00;
        C04220Ms.A0B(effectCollectionService, 3);
        this.A03 = gxo;
        this.A01 = effectCollectionService;
        this.A06 = b9r;
        this.A00 = r4;
        this.A04 = A0J;
        this.A05 = r0;
        this.A02 = new EffectsByIdMetadataService(effectCollectionService, userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C25515Dn3 r13, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.C146958n9 r18) {
        /*
            r3 = 18
            r4 = r18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r4)
            if (r0 == 0) goto L_0x0050
            r10 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r10.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x0060
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0055
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r4 = r1.A00
            return r4
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r14.A01
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 3
            long r11 = r2.toMillis(r0)
            r6 = r13
            r7 = r15
            X.AnonymousClass0wJ.A1M(r15, r3, r13)
            r10.A00 = r3
            r8 = r16
            r9 = r17
            java.lang.Object r1 = com.instagram.ar.core.effectcollection.EffectCollectionService.A04(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x0050:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r10 = X.C86124wJ.A15(r14, r4, r3)
            goto L_0x0018
        L_0x0055:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x005b
            r4 = 0
            return r4
        L_0x005b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A00(X.Dn3, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, java.lang.String, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C111046mh r5, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6, X.C146958n9 r7) {
        /*
            r3 = 20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r7)
            if (r0 == 0) goto L_0x0053
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r1) goto L_0x0059
            java.lang.Object r6 = r4.A01
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r6 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r6
            X.AnonymousClass0OU.A00(r3)
        L_0x0028:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003a
            X.4wE r1 = r6.A07
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r0 = r3.A00
        L_0x0034:
            r1.CrC(r0)
        L_0x0037:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x003a:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0037
            X.4wE r1 = r6.A07
            X.5y0 r0 = X.AnonymousClass5y0.A00
            goto L_0x0034
        L_0x0043:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService r0 = r6.A02
            r4.A01 = r6
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r5, r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0053:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r4.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x0059:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A01(X.6mh, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C111046mh r13, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r14, X.C146958n9 r15) {
        /*
            r3 = 37
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x00fc
            r4 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r5 = r4.A00
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L_0x002a
            if (r5 == r0) goto L_0x00c6
            if (r5 != r1) goto L_0x0103
            X.AnonymousClass0OU.A00(r2)
        L_0x0027:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x002a:
            X.AnonymousClass0OU.A00(r2)
            X.C86124wJ.A1S(r14, r13, r4, r0)
            X.8n9 r0 = X.C25598DoY.A02(r4)
            X.Eei r7 = new X.Eei
            r7.<init>(r0)
            X.B9r r11 = r14.A06
            if (r11 == 0) goto L_0x00b8
            X.6dz r2 = new X.6dz
            r2.<init>(r7)
            com.instagram.model.shopping.Product r12 = r11.A04()
            if (r12 != 0) goto L_0x0050
            com.instagram.model.shopping.ProductItemWithAR r0 = r11.A01
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.model.shopping.Product r12 = X.C19545Ay6.A00(r0)
        L_0x0050:
            java.lang.String r0 = r11.A07
            X.6iK r6 = r11.A0E
            if (r0 != 0) goto L_0x00c1
            r10 = 0
        L_0x0057:
            java.lang.String r9 = r11.A08
            java.lang.String r8 = r11.A04
            java.lang.String r1 = r11.A09
            X.6iM r5 = new X.6iM
            r5.<init>(r2, r11)
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r12.A00
            java.lang.String r11 = r0.A0j
            com.instagram.model.shopping.Merchant r0 = r0.A0C
            if (r0 == 0) goto L_0x00bf
            java.lang.String r12 = r0.A06
        L_0x006c:
            java.lang.Integer r2 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r2 == r0) goto L_0x00b8
            r6.A00 = r0
            com.instagram.service.session.UserSession r0 = r6.A01
            X.H1T r2 = X.C18180wK.A0O(r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r0 = "commerce/products/%s/ar/"
            r2.A0T(r0, r11)
            java.lang.String r0 = "merchant_id"
            r2.A0O(r0, r12)
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r2.A0P(r0, r10)
            java.lang.String r0 = "ch"
            r2.A0P(r0, r9)
            java.lang.String r0 = "effect_config_id"
            r2.A0P(r0, r8)
            r0 = 484(0x1e4, float:6.78E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0P(r0, r1)
            java.lang.Class<X.9Lc> r1 = X.C155889Lc.class
            java.lang.Class<X.71j> r0 = X.C1185571j.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 28
            com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2
            r0.<init>(r1, r5, r6)
            r2.A00 = r0
            X.C31155GhB.A03(r2)
        L_0x00b8:
            java.lang.Object r2 = r7.A00()
            if (r2 != r3) goto L_0x00d1
            return r3
        L_0x00bf:
            r12 = 0
            goto L_0x006c
        L_0x00c1:
            java.lang.String r10 = X.C19540Ay1.A00(r0)
            goto L_0x0057
        L_0x00c6:
            java.lang.Object r13 = r4.A02
            X.6mh r13 = (X.C111046mh) r13
            java.lang.Object r14 = r4.A01
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r14 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r14
            X.AnonymousClass0OU.A00(r2)
        L_0x00d1:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00ed
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r13.A00 = r1
            X.C86164wN.A1N(r4)
            java.lang.Object r0 = A01(r13, r14, r4)
            if (r0 != r3) goto L_0x0027
            return r3
        L_0x00ed:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0027
            X.4wE r1 = r14.A07
            X.1jB r2 = (X.AnonymousClass1jB) r2
            java.lang.Object r0 = r2.A00
            r1.CrC(r0)
            goto L_0x0027
        L_0x00fc:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r14, r15, r3)
            goto L_0x0016
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A02(X.6mh, com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r10, X.C105796e0 r11, java.lang.String r12, java.util.List r13, X.C146958n9 r14) {
        /*
            r4 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r4, r14)
            if (r0 == 0) goto L_0x0096
            r2 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0096
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r1 = r2.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r2.A00
            r14 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r14) goto L_0x009f
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003f
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            X.6m5 r2 = (X.C110676m5) r2
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00
            if (r0 == 0) goto L_0x009c
            java.util.List r1 = X.C18180wK.A0n(r0)
            java.util.List r0 = r2.A04
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
            return r0
        L_0x003f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0065
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0048:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r11 instanceof X.AnonymousClass5y2
            if (r0 == 0) goto L_0x0067
            X.5y2 r11 = (X.AnonymousClass5y2) r11
            X.Dn3 r7 = r11.A00
        L_0x0053:
            java.lang.String r1 = r7.A01
            if (r13 == 0) goto L_0x0065
            boolean r0 = X.C04220Ms.A0I(r1, r12)
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "EFFECT_BY_ID"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x006c
        L_0x0065:
            r0 = 0
            return r0
        L_0x0067:
            X.5y3 r11 = (X.AnonymousClass5y3) r11
            X.Dn3 r7 = r11.A01
            goto L_0x0053
        L_0x006c:
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            r11.addAll(r13)
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r10.A01
            java.lang.Object r8 = X.C000300e.A0o(r11)
            java.lang.String r8 = (java.lang.String) r8
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.HOURS
            r0 = 3
            long r12 = r4.toMillis(r0)
            r9 = 0
            X.C04220Ms.A0B(r8, r14)
            X.6qZ r6 = new X.6qZ
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r14)
            r2.A00 = r14
            java.lang.Object r1 = r5.A08(r6, r2)
            if (r1 != r3) goto L_0x0024
            return r3
        L_0x0096:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = X.C86124wJ.A15(r10, r14, r4)
            goto L_0x0016
        L_0x009c:
            java.util.List r0 = r2.A04
            return r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A03(com.instagram.camera.effect.mq.effectmetadata.EffectTrayService, X.6e0, java.lang.String, java.util.List, X.8n9):java.lang.Object");
    }

    public static /* synthetic */ C84714tk A04(EffectTrayService effectTrayService, C105796e0 r24, String str, String str2, String str3, List list, int i) {
        C84714tk r23;
        Integer num;
        boolean z;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        List list2 = list;
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        C105796e0 r1 = r24;
        C04220Ms.A0B(r1, 0);
        EffectTrayService effectTrayService2 = effectTrayService;
        if (r1 instanceof AnonymousClass5y3) {
            AnonymousClass5y3 r4 = (AnonymousClass5y3) r1;
            List<C25515Dn3> list3 = r4.A04;
            ArrayList A0w = AnonymousClass0wJ.A0w(list3);
            for (C25515Dn3 dn3 : list3) {
                EffectCollectionService effectCollectionService = effectTrayService2.A01;
                long j = r4.A00;
                if (C04220Ms.A0I(dn3.A01, "SAVED")) {
                    num = null;
                } else {
                    num = r4.A02;
                }
                C115576vV r3 = effectTrayService2.A00;
                if (r3 != null) {
                    z = r3.A05();
                } else {
                    z = true;
                }
                A0w.add(effectCollectionService.A0D(new AnonymousClass5He(dn3, num, (String) null, j, true, true, false, z)));
            }
            Object[] array = AnonymousClass00J.A0N(A0w).toArray(new C84714tk[0]);
            if (array != null) {
                r23 = C25240DiL.A00(effectTrayService2.A04.AHN(818336140, 3), new IDxFlowShape76S0300000_2_I2(5, effectTrayService2, array, r4));
            } else {
                throw C18210wN.A0W(C18170wI.A00(8));
            }
        } else {
            r23 = C86164wN.A0M(new AnonymousClass5y1((CameraAREffect) null, (String) null, (String) null, AnonymousClass0ZV.A00, (List) null, true, true, false));
        }
        return new C1372386v(effectTrayService2, r1, str5, str4, str6, list2, r23);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C111046mh r16, X.C146958n9 r17) {
        /*
            r15 = this;
            r4 = 19
            r5 = r17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r4, r5)
            r8 = r15
            if (r0 == 0) goto L_0x0081
            r3 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r0 = r3.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r6 = r3.A00
            r5 = 3
            r7 = 2
            r4 = 1
            r1 = 0
            if (r6 == 0) goto L_0x003c
            if (r6 == r4) goto L_0x0038
            if (r6 == r7) goto L_0x0038
            if (r6 != r5) goto L_0x0087
            java.lang.Object r1 = r3.A01
            X.4wE r1 = (X.C86074wE) r1
            X.AnonymousClass0OU.A00(r0)
        L_0x0032:
            r1.CrC(r0)
        L_0x0035:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0038:
            X.AnonymousClass0OU.A00(r0)
            goto L_0x0035
        L_0x003c:
            X.AnonymousClass0OU.A00(r0)
            r6 = r16
            java.lang.Integer r0 = r6.A03
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x0065
            if (r0 != r4) goto L_0x0035
            X.4wE r1 = r15.A07
            X.6e0 r9 = r6.A02
            r10 = 0
            java.lang.String r11 = r6.A06
            java.lang.String r12 = r6.A07
            r14 = 6
            r13 = r10
            X.4tk r0 = A04(r8, r9, r10, r11, r12, r13, r14)
            r3.A01 = r1
            r3.A00 = r5
            java.lang.Object r0 = X.C25752DrO.A02(r3, r0)
            if (r0 != r2) goto L_0x0032
            return r2
        L_0x0065:
            X.B9r r0 = r15.A06
            if (r0 == 0) goto L_0x007a
            java.util.List r0 = r6.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007a
            r3.A00 = r4
            java.lang.Object r0 = A02(r6, r15, r3)
        L_0x0077:
            if (r0 != r2) goto L_0x0035
            return r2
        L_0x007a:
            r3.A00 = r7
            java.lang.Object r0 = A01(r6, r15, r3)
            goto L_0x0077
        L_0x0081:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r3.<init>(r15, r5, r4)
            goto L_0x0019
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectmetadata.EffectTrayService.A05(X.6mh, X.8n9):java.lang.Object");
    }
}
