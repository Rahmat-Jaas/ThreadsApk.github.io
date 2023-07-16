package com.instagram.ar.core.discovery.minigallery.services;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3Q8;
import X.AnonymousClass4VZ;
import X.AnonymousClass5vB;
import X.AnonymousClass7J0;
import X.C03690Kh;
import X.C04220Ms;
import X.C10300i6;
import X.C107686h9;
import X.C107696hA;
import X.C109076jQ;
import X.C1372286u;
import X.C1372486y;
import X.C146958n9;
import X.C18170wI;
import X.C18230wP;
import X.C25515Dn3;
import X.C31032GeB;
import X.C31082GfJ;
import X.C63803iN;
import X.C67463zb;
import X.C67473zc;
import X.C84714tk;
import X.C86104wH;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C89555Fv;
import X.CQ0;
import X.D1X;
import X.F70;
import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.facebook.smartcapture.logging.SCEventNames;
import com.google.common.collect.ImmutableList;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0301100_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape7S0401000_I2;

public final class MiniGalleryService {
    public String A00 = "";
    public final MiniGalleryCategoriesService A01;
    public final EffectCollectionService A02;
    public final UserSession A03;

    public static Object A00(IDxFCollectorShape84S0200000_2_I2 iDxFCollectorShape84S0200000_2_I2, Object obj, Object obj2, KtCImplShape1S0301000_I2 ktCImplShape1S0301000_I2) {
        F70 f70 = (F70) iDxFCollectorShape84S0200000_2_I2.A01;
        MiniGalleryService miniGalleryService = f70.A0D;
        String str = ((CQ0) obj).A02;
        C25515Dn3 A012 = C25515Dn3.A03.A01(f70.A03.A00, ((KtCSuperShape0S2100000_I2) f70.A04.A01.getValue()).A01);
        ktCImplShape1S0301000_I2.A01 = obj2;
        ktCImplShape1S0301000_I2.A00 = 1;
        return miniGalleryService.A05(A012, str, ktCImplShape1S0301000_I2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r10, X.C25515Dn3 r11, java.lang.String r12, java.util.ArrayList r13, java.util.List r14, X.C146958n9 r15) {
        /*
            r9 = r12
            r4 = r13
            r3 = 28
            r5 = r15
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x00c6
            r6 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c6
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r6.A02
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r15 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r15) goto L_0x00d5
            java.lang.Object r4 = r6.A01
            java.util.AbstractCollection r4 = (java.util.AbstractCollection) r4
            X.AnonymousClass0OU.A00(r1)
        L_0x002b:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00d2
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            X.6m5 r2 = (X.C110676m5) r2
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = X.C18180wK.A0n(r0)
            java.util.List r0 = r2.A04
            java.util.List r0 = X.AnonymousClass00J.A0V(r0, r1)
        L_0x0045:
            java.util.List r0 = X.AnonymousClass00J.A0V(r4, r0)
            java.util.HashSet r5 = X.C18200wM.A0u()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0055:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            X.C86164wN.A1G(r0, r1, r5, r3)
            goto L_0x0055
        L_0x0068:
            java.util.List r0 = r2.A04
            goto L_0x0045
        L_0x006b:
            X.AnonymousClass0OU.A00(r1)
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            r12.addAll(r14)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r13.iterator()
        L_0x007d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r8.next()
            r1 = r2
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            java.lang.String r0 = r1.A0I
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = r1.A0I
            boolean r0 = r14.contains(r0)
            if (r0 != 0) goto L_0x007d
            r3.add(r2)
            goto L_0x007d
        L_0x009e:
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = r10.A02
            if (r9 != 0) goto L_0x00a8
            java.lang.Object r9 = X.C000300e.A0o(r12)
            java.lang.String r9 = (java.lang.String) r9
        L_0x00a8:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 2
            long r13 = r2.toMillis(r0)
            r10 = 0
            r8 = r11
            X.C18180wK.A1P(r9, r15, r11)
            X.6qZ r7 = new X.6qZ
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            r6.A01 = r4
            r6.A00 = r15
            java.lang.Object r1 = r3.A08(r7, r6)
            if (r1 != r5) goto L_0x002b
            return r5
        L_0x00c6:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r6 = X.C86164wN.A0n(r10, r15, r3)
            goto L_0x0019
        L_0x00cc:
            r4.clear()
            r4.addAll(r3)
        L_0x00d2:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.Dn3, java.lang.String, java.util.ArrayList, java.util.List, X.8n9):java.lang.Object");
    }

    public final C84714tk A07(D1X d1x, boolean z, boolean z2, boolean z3) {
        long A09;
        D1X d1x2 = d1x;
        C04220Ms.A0B(d1x, 0);
        if (z) {
            A09 = 0;
        } else {
            A09 = C86164wN.A09(AnonymousClass0TJ.A05, this.A03, TimeUnit.HOURS, 36601822965665529L);
        }
        MiniGalleryCategoriesService miniGalleryCategoriesService = this.A01;
        C109076jQ r5 = new C109076jQ(d1x);
        return new IDxFlowShape94S0200000_2_I2(28, (Object) new KtSLambdaShape15S0200000_I2(r5, (C146958n9) null, 1), (Object) C86154wM.A0O(new KtSLambdaShape5S0200000_I2((Object) r5, (C146958n9) null, 30, 42), AnonymousClass7J0.A02(new KtSLambdaShape7S0401000_I2((C146958n9) null, (Object) miniGalleryCategoriesService, (Object) d1x, 2), AnonymousClass7J0.A02(new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(miniGalleryCategoriesService, d1x2, (C146958n9) null, z3, z2), C86144wL.A0O(new KtSLambdaShape11S0100000_I2(r5, (C146958n9) null, 40), new C1372486y(new KtSLambdaShape1S0301100_I2(miniGalleryCategoriesService, d1x2, (C146958n9) null, A09)))))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C111016me r12, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r13, X.C113756s5 r14, X.C146958n9 r15) {
        /*
            r3 = 18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r15)
            r6 = r13
            if (r0 == 0) goto L_0x002a
            r11 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r11.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r2) goto L_0x0087
            if (r0 == r5) goto L_0x0087
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002a:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r11.<init>(r13, r15, r3)
            goto L_0x0017
        L_0x0030:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r1 = r14.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r1
            java.lang.Object r0 = r1.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r9 = X.C18200wM.A0s(r0)
            java.util.List r10 = r12.A05
            if (r10 == 0) goto L_0x006c
            java.lang.Object r0 = r1.A00
            X.Dn3 r0 = (X.C25515Dn3) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r12.A04
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r8 = r12.A03
            X.D1X r0 = r12.A00
            X.D0w r1 = r0.A00
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.String r0 = "EFFECT_BY_ID"
            X.Dn3 r7 = new X.Dn3
            r7.<init>(r1, r0)
            X.C86124wJ.A1S(r14, r9, r11, r2)
            java.lang.Object r0 = A02(r6, r7, r8, r9, r10, r11)
        L_0x0069:
            if (r0 != r4) goto L_0x0092
            return r4
        L_0x006c:
            java.lang.String r3 = r12.A03
            if (r3 == 0) goto L_0x0092
            X.D1X r0 = r12.A00
            X.D0w r2 = r0.A00
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r1 = "EFFECT_BY_ID"
            X.Dn3 r0 = new X.Dn3
            r0.<init>(r2, r1)
            X.C86124wJ.A1S(r14, r9, r11, r5)
            java.lang.Object r0 = A03(r13, r0, r3, r9, r11)
            goto L_0x0069
        L_0x0087:
            java.lang.Object r9 = r11.A02
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r14 = r11.A01
            X.6s5 r14 = (X.C113756s5) r14
            X.AnonymousClass0OU.A00(r1)
        L_0x0092:
            boolean r2 = r14.A02
            java.lang.String r1 = r14.A01
            X.G7K r0 = new X.G7K
            r0.<init>(r1, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A01(X.6me, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.6s5, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r14, X.C25515Dn3 r15, java.lang.String r16, java.util.ArrayList r17, X.C146958n9 r18) {
        /*
            r5 = r17
            r3 = 27
            r4 = r18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r4)
            if (r0 == 0) goto L_0x0080
            r12 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r12 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r12.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r2) goto L_0x0085
            java.lang.Object r5 = r12.A01
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            X.AnonymousClass0OU.A00(r1)
        L_0x002d:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003a
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            r5.add(r3, r0)
        L_0x003a:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x003d:
            X.AnonymousClass0OU.A00(r1)
            boolean r0 = r5 instanceof java.util.Collection
            r9 = r16
            if (r0 == 0) goto L_0x0067
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0067
        L_0x004c:
            com.instagram.ar.core.effectcollection.EffectCollectionService r7 = r14.A02
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            r0 = 2
            long r13 = r6.toMillis(r0)
            r10 = 0
            r8 = r15
            X.AnonymousClass0wJ.A1M(r9, r2, r15)
            r12.A01 = r5
            r12.A00 = r2
            r11 = r10
            java.lang.Object r1 = com.instagram.ar.core.effectcollection.EffectCollectionService.A04(r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r4) goto L_0x002d
            return r4
        L_0x0067:
            java.util.Iterator r1 = r5.iterator()
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            boolean r0 = X.C04220Ms.A0I(r0, r9)
            if (r0 == 0) goto L_0x006b
            goto L_0x003a
        L_0x0080:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r12 = X.C86164wN.A0n(r14, r4, r3)
            goto L_0x001a
        L_0x0085:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.Dn3, java.lang.String, java.util.ArrayList, X.8n9):java.lang.Object");
    }

    public static final C84714tk A04(MiniGalleryService miniGalleryService, D1X d1x, String str, String str2, String str3) {
        Integer num;
        String str4;
        C84714tk A0O;
        UserSession userSession = miniGalleryService.A03;
        switch (d1x.ordinal()) {
            case 0:
            case 1:
                num = AnonymousClass006.A00;
                break;
            case 2:
                num = AnonymousClass006.A0C;
                break;
            case 3:
                num = AnonymousClass006.A0N;
                break;
            case 4:
                num = AnonymousClass006.A0Y;
                break;
            case 5:
                num = AnonymousClass006.A0j;
                break;
            default:
                throw AnonymousClass4VZ.A00();
        }
        String str5 = str;
        String str6 = str2;
        AnonymousClass0wJ.A1Q(str5, str2);
        String str7 = str3;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327761102514335L) || (!C03690Kh.A01().A09())) {
            C107696hA r5 = new C107696hA(userSession);
            C107686h9 r6 = new C107686h9(num);
            GQLCallInputCInputShape0S0000000 A012 = C31032GeB.A01(userSession);
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            A002.A0F(str5, AnonymousClass3Q8.A00(9, 10, 35));
            C67463zb A003 = C67463zb.A00();
            A003.A05("query", str6);
            switch (r6.A01.intValue()) {
                case 0:
                    str4 = "INSTAGRAM__STORIES__PRECAPTURE__SEARCH_V2";
                    break;
                case 1:
                    str4 = "INSTAGRAM__STORIES__POSTCAPTURE__SEARCH";
                    break;
                case 2:
                    str4 = "INSTAGRAM__LIVE__PRECAPTURE__SEARCH_V2";
                    break;
                case 3:
                    str4 = "INSTAGRAM__REELS__PRECAPTURE__SEARCH_V2";
                    break;
                case 4:
                    str4 = "INSTAGRAM__REELS__POSTCAPTURE__SEARCH_V2";
                    break;
                default:
                    str4 = "INSTAGRAM__DIRECT__RTC__SEARCH_V2";
                    break;
            }
            A003.A05("surface", str4);
            A003.A02(A012, "device_capabilities");
            A003.A04(SCEventNames.Params.PREVIEW_WIDTH, 240);
            A003.A04(SCEventNames.Params.PREVIEW_HEIGHT, 240);
            A003.A02(A002, "context");
            A003.A05("cursor", str3);
            ImmutableList of = ImmutableList.of("TAR_BROTLI", "ZIP");
            C04220Ms.A06(of);
            A003.A06("supported_compression_types", of);
            A003.A04(C18170wI.A00(451), 24);
            A003.A03("formatted_media_count_enabled", false);
            C67473zc r0 = new C67473zc(A003, C89555Fv.class, "CommonAREffectSearchQuery");
            C31082GfJ gfJ = new C31082GfJ((C10300i6) userSession);
            gfJ.A06(r0);
            gfJ.A03 = AnonymousClass006.A00;
            gfJ.A05 = null;
            A0O = C86154wM.A0O(new KtSLambdaShape5S0200000_I2((Object) r5, (C146958n9) null, 37, 42), new IDxFlowShape251S0100000_2_I2(C86144wL.A0O(new KtSLambdaShape11S0100000_I2(r5, (C146958n9) null, 44), new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape5S0200000_I2(r6, (C146958n9) null, 36), (C84714tk) C86104wH.A0O(gfJ, 744), 4)), 7));
        } else {
            A0O = C86164wN.A0M(C86164wN.A0R(AnonymousClass5vB.A00));
        }
        return new C1372286u(miniGalleryService, d1x, str6, str7, A0O);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C25515Dn3 r14, java.lang.String r15, X.C146958n9 r16) {
        /*
            r13 = this;
            r3 = 36
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r4)
            if (r0 == 0) goto L_0x004e
            r10 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r10 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r10.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r10.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x005e
            X.AnonymousClass0OU.A00(r1)
        L_0x0026:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0053
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r4 = r1.A00
            return r4
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r13.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 2
            long r11 = r2.toMillis(r0)
            r8 = 0
            r6 = r14
            r7 = r15
            X.AnonymousClass0wJ.A1M(r15, r3, r14)
            r10.A00 = r3
            r9 = r8
            java.lang.Object r1 = com.instagram.ar.core.effectcollection.EffectCollectionService.A04(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L_0x0026
            return r4
        L_0x004e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r10 = X.C86114wI.A0x(r13, r4, r3)
            goto L_0x0018
        L_0x0053:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0059
            r4 = 0
            return r4
        L_0x0059:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A05(X.Dn3, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r15.A07 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C84714tk A06(X.C111016me r15) {
        /*
            r14 = this;
            X.777 r2 = X.C25515Dn3.A03
            X.D1X r0 = r15.A00
            X.D0w r1 = r0.A00
            java.lang.String r0 = r15.A01
            X.Dn3 r5 = r2.A01(r1, r0)
            java.lang.String r7 = r15.A02
            if (r7 == 0) goto L_0x001a
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x001f
        L_0x001a:
            boolean r0 = r15.A07
            r11 = 1
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r11 = 0
        L_0x0020:
            com.instagram.service.session.UserSession r4 = r14.A03
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36601822965731066(0x82092a00010efa, double:3.2104784550150137E-306)
            long r8 = X.C86164wN.A09(r2, r4, r3, r0)
            r6 = 0
            boolean r13 = r15.A06
            r10 = 0
            r12 = 1
            X.5He r4 = new X.5He
            r4.<init>(r5, r6, r7, r8, r10, r11, r12, r13)
            com.instagram.ar.core.effectcollection.EffectCollectionService r0 = r14.A02
            X.4tk r3 = com.instagram.ar.core.effectcollection.EffectCollectionService.A07(r4, r0)
            com.instagram.service.session.UserSession r1 = r0.A05
            X.0gi r0 = r0.A04
            X.6h6 r2 = new X.6h6
            r2.<init>(r0, r1)
            r0 = 11
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (X.C146958n9) r6, (int) r0)
            X.86y r0 = new X.86y
            r0.<init>(r1)
            X.4tk r1 = X.AnonymousClass3XM.A01(r0)
            com.facebook.redex.IDxFlowShape76S0300000_2_I2 r0 = new com.facebook.redex.IDxFlowShape76S0300000_2_I2
            r0.<init>(r12, r14, r15, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A06(X.6me):X.4tk");
    }

    public /* synthetic */ MiniGalleryService(Context context, EffectCollectionService effectCollectionService, UserSession userSession) {
        MiniGalleryCategoriesService miniGalleryCategoriesService = new MiniGalleryCategoriesService(C18230wP.A09(context), userSession);
        C04220Ms.A0B(effectCollectionService, 3);
        this.A03 = userSession;
        this.A02 = effectCollectionService;
        this.A01 = miniGalleryCategoriesService;
    }
}
