package com.instagram.ar.core.effectcollection;

import X.AnonymousClass0OY;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0gW;
import X.AnonymousClass3XM;
import X.AnonymousClass5He;
import X.AnonymousClass784;
import X.AnonymousClass7J0;
import X.AnonymousClass7Ja;
import X.AnonymousClass8bb;
import X.C04220Ms;
import X.C04530Oa;
import X.C09810gi;
import X.C09820gj;
import X.C107656h6;
import X.C120467Az;
import X.C1367484f;
import X.C1372486y;
import X.C146958n9;
import X.C148838sG;
import X.C18250wR;
import X.C41253M5p;
import X.C83224qz;
import X.C84714tk;
import X.C86144wL;
import X.D0E;
import X.E5N;
import android.content.Context;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0501000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

public final class EffectCollectionService {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final RoomEffectCollectionRepository A03;
    public final C09810gi A04;
    public final UserSession A05;
    public final C04530Oa A06 = AnonymousClass0OY.A02(new KtLambdaShape28S0100000_I2_8(this, 46));
    public final AnonymousClass0ZU A07;
    public final C83224qz A08;

    public static final C84714tk A07(AnonymousClass5He r6, EffectCollectionService effectCollectionService) {
        AnonymousClass0YP ktSLambdaShape3S0101000_I2;
        AnonymousClass5He r3 = r6;
        AnonymousClass784 r5 = new AnonymousClass784(r6.A01, r6.A03);
        EffectCollectionService effectCollectionService2 = effectCollectionService;
        if (r6.A07) {
            ktSLambdaShape3S0101000_I2 = new KtSLambdaShape9S0301000_I2_1((C146958n9) null, (Object) effectCollectionService, (Object) r6, 7);
        } else {
            ktSLambdaShape3S0101000_I2 = new KtSLambdaShape3S0101000_I2(48, (C146958n9) null);
        }
        return new IDxFlowShape94S0200000_2_I2(28, (Object) new KtSLambdaShape15S0200000_I2(r5, (C146958n9) null, 3), (Object) C86144wL.A0O(new KtSLambdaShape5S0200000_I2((Object) r3, (Object) r5, (C146958n9) null, 35), AnonymousClass7J0.A02(new KtSLambdaShape5S0501000_I2(r3, effectCollectionService2, r5, (C146958n9) null, 1), AnonymousClass7J0.A02(new KtSLambdaShape5S0501000_I2(r3, effectCollectionService2, r5, (C146958n9) null, 0), new C1372486y(ktSLambdaShape3S0101000_I2)))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(X.C113756s5 r11, X.C146958n9 r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r5 = r11
            boolean r0 = r12 instanceof X.C137828Ah
            if (r0 == 0) goto L_0x0068
            r4 = r12
            X.8Ah r4 = (X.C137828Ah) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0013:
            java.lang.Object r6 = r4.A05
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r1) goto L_0x003e
            if (r0 != r2) goto L_0x006e
            X.AnonymousClass0OU.A00(r6)
        L_0x0024:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0026:
            return r3
        L_0x0027:
            X.AnonymousClass0OU.A00(r6)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r10.A03
            r4.A01 = r10
            r4.A02 = r11
            r4.A03 = r13
            r4.A04 = r14
            r4.A00 = r1
            java.lang.Object r6 = r0.A04(r11, r4, r13)
            if (r6 == r3) goto L_0x0026
            r7 = r10
            goto L_0x004b
        L_0x003e:
            boolean r14 = r4.A04
            boolean r13 = r4.A03
            java.lang.Object r5 = r4.A02
            java.lang.Object r7 = r4.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r7 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r7
            X.AnonymousClass0OU.A00(r6)
        L_0x004b:
            if (r13 == 0) goto L_0x0024
            if (r14 == 0) goto L_0x0024
            r8 = 0
            r4.A01 = r8
            r4.A02 = r8
            r4.A00 = r2
            X.4qz r1 = r7.A08
            r9 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 3
            X.C25237DiI.A00(r8, r8, r4, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.A00
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0068:
            X.8Ah r4 = new X.8Ah
            r4.<init>(r10, r12)
            goto L_0x0013
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A09(X.6s5, X.8n9, boolean, boolean):java.lang.Object");
    }

    public /* synthetic */ EffectCollectionService(Context context, RoomEffectCollectionRepository roomEffectCollectionRepository, UserSession userSession, AnonymousClass0ZU r9) {
        C09810gi r4 = C09820gj.A00;
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C83224qz A032 = AnonymousClass7Ja.A03(A0J.AHN(1362142542, 3).CWl(new AnonymousClass8bb((C148838sG) null)));
        C04220Ms.A0B(userSession, 2);
        this.A03 = roomEffectCollectionRepository;
        this.A05 = userSession;
        this.A04 = r4;
        this.A02 = context;
        this.A07 = r9;
        this.A08 = A032;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A01 = timeUnit.toMillis(90);
        this.A00 = timeUnit.toMillis(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r9, com.instagram.ar.core.effectcollection.EffectCollectionService r10, X.C146958n9 r11) {
        /*
            r3 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x006f
            r7 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A02
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r6 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r6) goto L_0x0074
            java.lang.Object r5 = r7.A01
            X.6h7 r5 = (X.C107666h7) r5
            X.AnonymousClass0OU.A00(r0)
        L_0x0028:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            X.01V r3 = r5.A01
            int r2 = r5.A00
            r1 = 3
            if (r0 == 0) goto L_0x0034
            r1 = 2
        L_0x0034:
            r0 = 17642986(0x10d35ea, float:2.593629E-38)
            r3.markerEnd(r0, r2, r1)
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x003d:
            X.AnonymousClass0OU.A00(r0)
            r0 = 0
            X.6h7 r5 = new X.6h7
            r5.<init>()
            X.C04220Ms.A0B(r9, r0)
            X.01V r4 = r5.A01
            int r3 = r5.A00
            r2 = 17642986(0x10d35ea, float:2.593629E-38)
            r4.markerStart((int) r2, (int) r3)
            r0 = 16
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2.A00(r0, r9)
            if (r0 == 0) goto L_0x0079
            java.lang.String r1 = "save_status_update"
            java.lang.String r0 = "effect_update_type"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (java.lang.String) r1)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r10.A03
            r7.A01 = r5
            r7.A00 = r6
            java.lang.Object r0 = r0.A00(r9, r7)
            if (r0 != r8) goto L_0x0028
            return r8
        L_0x006f:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r10, r11, r3)
            goto L_0x0016
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0079:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2, com.instagram.ar.core.effectcollection.EffectCollectionService, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r5.A04 == false) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.ar.core.effectcollection.EffectCollectionService r6, X.AnonymousClass784 r7, X.C25515Dn3 r8, X.C113756s5 r9, java.lang.String r10, X.C146958n9 r11, boolean r12) {
        /*
            r4 = 20
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r4, r11)
            if (r0 == 0) goto L_0x0092
            r3 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0092
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A03
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r4) goto L_0x0099
            java.lang.Object r7 = r3.A02
            X.784 r7 = (X.AnonymousClass784) r7
            java.lang.Object r9 = r3.A01
            X.6s5 r9 = (X.C113756s5) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x002c:
            java.lang.Object r0 = r9.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r0
            java.lang.Object r1 = r0.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A01
            int r0 = X.C86144wL.A08(r0)
            r7.A01(r1, r0)
            return r9
        L_0x003e:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r5 = r9.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r5
            java.lang.Object r0 = r5.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "SAVED"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0075
            X.01V r4 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r4)
            int r3 = X.AnonymousClass784.A00(r7)
            r2 = 17631244(0x10d080c, float:2.5903383E-38)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "effects_empty"
            r4.markerAnnotate((int) r2, (int) r3, (java.lang.String) r1, (java.lang.String) r0)
            int r1 = X.AnonymousClass784.A00(r7)
            r0 = 3
            r4.markerEnd(r2, r1, r0)
            return r9
        L_0x0075:
            if (r12 == 0) goto L_0x007c
            boolean r1 = r5.A04
            r0 = 0
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            X.C86124wJ.A1S(r9, r7, r3, r4)
            if (r0 == 0) goto L_0x008f
            boolean r0 = X.C18220wO.A1U(r10)
            java.lang.Object r0 = r6.A09(r9, r3, r0, r4)
            if (r0 != r2) goto L_0x008f
        L_0x008c:
            if (r0 != r2) goto L_0x002c
            return r2
        L_0x008f:
            kotlin.Unit r0 = kotlin.Unit.A00
            goto L_0x008c
        L_0x0092:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r3.<init>(r6, r11, r4)
            goto L_0x0016
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A01(com.instagram.ar.core.effectcollection.EffectCollectionService, X.784, X.Dn3, X.6s5, java.lang.String, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.ar.core.effectcollection.EffectCollectionService r19, X.C113016qZ r20, X.C146958n9 r21) {
        /*
            r4 = r19
            r3 = 34
            r5 = r21
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x01d6
            r7 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01d6
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r0 = r7.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r5 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r5) goto L_0x01dc
            java.lang.Object r4 = r7.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            X.AnonymousClass0OU.A00(r0)
        L_0x002c:
            X.4qz r5 = r4.A08
            r3 = 0
            r1 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r0, (X.C146958n9) r3, (int) r1)
            r1 = 3
            X.C25237DiI.A00(r3, r3, r2, r5, r1)
            return r0
        L_0x003b:
            X.AnonymousClass0OU.A00(r0)
            X.0ZU r0 = r4.A07
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x005d
            X.0Kh r0 = X.C03690Kh.A01()
            boolean r0 = r0.A09()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x005d
            X.5v3 r0 = X.AnonymousClass5v3.A00
            X.1jB r6 = X.C86164wN.A0R(r0)
            return r6
        L_0x005d:
            com.instagram.service.session.UserSession r1 = r4.A05
            X.0gi r0 = r4.A04
            X.6jS r8 = new X.6jS
            r8.<init>(r0, r1)
            r1 = r20
            java.lang.String r11 = r1.A02
            X.Dn3 r3 = r1.A01
            java.lang.String r10 = r1.A03
            java.lang.String r9 = r1.A04
            java.util.List r0 = r1.A05
            r21 = r0
            long r1 = r1.A00
            r12 = 0
            com.instagram.service.session.UserSession r0 = r8.A01
            r20 = r0
            r19 = 0
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r18 = X.C31032GeB.A01(r20)
            X.D0w r0 = r3.A00
            int r13 = X.C18230wP.A04(r0, r12)
            r0 = 2
            if (r13 != r0) goto L_0x0128
            java.lang.Integer r17 = X.AnonymousClass006.A00
        L_0x008c:
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r13 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "effect_id"
            r13.A0F(r11, r0)
            java.lang.String r0 = "crypto_hash"
            r13.A0F(r10, r0)
            java.lang.String r0 = "revision_id"
            r13.A0F(r9, r0)
            X.3zb r14 = X.C67463zb.A00()
            java.lang.String r15 = "device_capabilities"
            r0 = r18
            r14.A02(r0, r15)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "preview_width"
            r14.A04(r0, r15)
            r16 = 1
            java.lang.String r0 = "preview_height"
            r14.A04(r0, r15)
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r21)
            r0 = 714(0x2ca, float:1.0E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r14.A06(r0, r15)
            if (r15 != 0) goto L_0x00cd
            r16 = 0
        L_0x00cd:
            java.lang.String r0 = "target_effect_id"
            r14.A05(r0, r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "include_preview_image"
            r14.A03(r0, r12)
            java.lang.String r15 = "TAR_BROTLI"
            java.lang.String r0 = "ZIP"
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of(r15, r0)
            X.C04220Ms.A06(r15)
            java.lang.String r0 = "supported_compression_types"
            r14.A06(r0, r15)
            if (r17 == 0) goto L_0x0126
            java.lang.String r15 = "INSTAGRAM__DIRECT__RTC__EFFECTS_BY_ID"
        L_0x00ef:
            java.lang.String r0 = "surface_identity"
            r14.A05(r0, r15)
            java.lang.String r0 = "target_effect_params"
            r14.A02(r13, r0)
            java.lang.String r0 = "formatted_media_count_enabled"
            r14.A03(r0, r12)
            java.util.Map r12 = r18.A07()
            java.lang.String r13 = "supported_texture_formats"
            boolean r0 = r12.containsKey(r13)
            if (r0 == 0) goto L_0x0133
            java.lang.Object r12 = r12.get(r13)
            boolean r0 = r12 instanceof java.util.List
            if (r0 == 0) goto L_0x0133
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r15 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r12 = r12.iterator()
        L_0x011c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x012c
            X.C86124wJ.A1V(r15, r12)
            goto L_0x011c
        L_0x0126:
            r15 = 0
            goto L_0x00ef
        L_0x0128:
            r17 = 0
            goto L_0x008c
        L_0x012c:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r15)
            r14.A06(r13, r0)
        L_0x0133:
            X.AnonymousClass7Ko.A0B(r16)
            java.lang.Class<X.5GL> r12 = X.AnonymousClass5GL.class
            java.lang.String r0 = "IGAREffectsByIdQuery"
            X.3zc r13 = new X.3zc
            r13.<init>(r14, r12, r0)
            java.lang.StringBuilder r12 = X.C18200wM.A0r()
            java.lang.String r0 = r20.getUserId()
            r12.append(r0)
            r0 = 95
            r12.append(r0)
            r12.append(r11)
            r12.append(r0)
            r12.append(r10)
            r12.append(r0)
            r12.append(r9)
            r12.append(r0)
            r0 = r21
            java.lang.String r0 = X.C18200wM.A0m(r0, r12)
            int r9 = r0.hashCode()
            r0 = 539(0x21b, float:7.55E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.lang.String r11 = X.AnonymousClass00U.A0J(r0, r9)
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            boolean r12 = X.C18180wK.A1X(r0)
            r0 = 3
            X.C04220Ms.A0B(r11, r0)
            r9 = 710(0x2c6, float:9.95E-43)
            X.GfJ r10 = new X.GfJ
            r0 = r20
            r10.<init>((X.C10300i6) r0)
            r10.A06(r13)
            if (r12 == 0) goto L_0x01d3
            X.Ifn r0 = X.C34819Ifn.A05
            if (r0 == 0) goto L_0x01d0
            boolean r0 = r0.A04(r11)
            if (r0 != r5) goto L_0x01d0
            java.lang.Integer r0 = X.AnonymousClass006.A0C
        L_0x019b:
            r10.A03 = r0
            r0 = 0
            if (r12 == 0) goto L_0x01a1
            r0 = r11
        L_0x01a1:
            r10.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r10.A04 = r0
            X.H8c r0 = r10.A04()
            X.4tk r10 = X.C04220Ms.A0B(r0, 0)
            r1 = 45
            kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2
            r0 = r19
            r9.<init>(r1, r0)
            r2 = 2
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r1 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r1.<init>((X.AnonymousClass0YP) r9, (X.C84714tk) r10, (int) r2)
            com.facebook.redex.IDxFlowShape76S0300000_2_I2 r0 = new com.facebook.redex.IDxFlowShape76S0300000_2_I2
            r0.<init>(r2, r8, r3, r1)
            r7.A01 = r4
            r7.A00 = r5
            java.lang.Object r0 = X.C25752DrO.A02(r7, r0)
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x01d0:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x019b
        L_0x01d3:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            goto L_0x019b
        L_0x01d6:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r4, r5, r3)
            goto L_0x001a
        L_0x01dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A02(com.instagram.ar.core.effectcollection.EffectCollectionService, X.6qZ, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.ar.core.effectcollection.EffectCollectionService r16, X.C113016qZ r17, X.C146958n9 r18) {
        /*
            r4 = r16
            r0 = r17
            r8 = 10
            r6 = r18
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r8, r6)
            if (r1 == 0) goto L_0x0138
            r3 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r3
            int r5 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r2
            if (r1 == 0) goto L_0x0138
            int r5 = r5 - r2
            r3.A00 = r5
        L_0x001c:
            java.lang.Object r7 = r3.A04
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r3.A00
            r6 = 3
            r5 = 2
            r9 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r9) goto L_0x004f
            if (r1 == r5) goto L_0x00f3
            if (r1 != r6) goto L_0x013f
            X.AnonymousClass0OU.A00(r7)
        L_0x0030:
            return r7
        L_0x0031:
            X.AnonymousClass0OU.A00(r7)
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x012f
            java.util.List r10 = r0.A00()
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r11 = r4.A03
            long r6 = r0.A00
            X.Dn3 r12 = r0.A01
            X.C86114wI.A1J(r4, r0, r10, r3, r9)
            r13 = r10
            r14 = r3
            r15 = r6
            java.lang.Object r7 = r11.A03(r12, r13, r14, r15)
            if (r7 != r2) goto L_0x005e
            return r2
        L_0x004f:
            java.lang.Object r10 = r3.A03
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = r3.A02
            X.6qZ r0 = (X.C113016qZ) r0
            java.lang.Object r4 = r3.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            X.AnonymousClass0OU.A00(r7)
        L_0x005e:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r14 = r7.iterator()
        L_0x006c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x008b
            java.lang.Object r13 = r14.next()
            r6 = r13
            com.instagram.camera.effect.models.CameraAREffect r6 = (com.instagram.camera.effect.models.CameraAREffect) r6
            java.lang.String r12 = r6.A0I
            java.lang.String r6 = r0.A02
            boolean r6 = X.C04220Ms.A0I(r12, r6)
            if (r6 == 0) goto L_0x0087
            r11.add(r13)
            goto L_0x006c
        L_0x0087:
            r1.add(r13)
            goto L_0x006c
        L_0x008b:
            r6 = 0
            int r10 = r10.size()
            int r7 = r7.size()
            if (r10 != r7) goto L_0x00b5
            java.lang.Object r2 = X.AnonymousClass00J.A0C(r11)
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2
            java.util.List r0 = r0.A05
            java.util.List r0 = X.AnonymousClass2FU.A00(r1, r0)
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            boolean r9 = X.C86154wM.A1Y(r9, r2, r0)
            X.6m5 r3 = new X.6m5
            r7 = r6
            r8 = r0
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x00b0:
            X.1jA r7 = X.AnonymousClass1jA.A00(r3)
            return r7
        L_0x00b5:
            r16 = -1
            java.lang.String r12 = r0.A02
            X.Dn3 r11 = r0.A01
            java.util.List r9 = r0.A05
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r1, r8)
            java.util.Iterator r10 = r1.iterator()
        L_0x00c5:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r10.next()
            com.instagram.camera.effect.models.CameraAREffect r7 = (com.instagram.camera.effect.models.CameraAREffect) r7
            java.lang.String r7 = r7.A0I
            X.C04220Ms.A06(r7)
            r8.add(r7)
            goto L_0x00c5
        L_0x00da:
            java.util.List r15 = X.AnonymousClass00J.A0S(r9, r8)
            java.lang.String r13 = r0.A03
            java.lang.String r14 = r0.A04
            r18 = 0
            X.6qZ r10 = new X.6qZ
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)
            X.C86114wI.A1J(r0, r1, r6, r3, r5)
            java.lang.Object r7 = A02(r4, r10, r3)
            if (r7 != r2) goto L_0x00fe
            return r2
        L_0x00f3:
            java.lang.Object r1 = r3.A02
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r0 = r3.A01
            X.6qZ r0 = (X.C113016qZ) r0
            X.AnonymousClass0OU.A00(r7)
        L_0x00fe:
            X.3b6 r7 = (X.C62903b6) r7
            boolean r2 = r7 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x0126
            X.1jA r7 = (X.AnonymousClass1jA) r7
            java.lang.Object r2 = r7.A00
            X.6m5 r2 = (X.C110676m5) r2
            com.instagram.camera.effect.models.CameraAREffect r4 = r2.A00
            java.lang.String r6 = r2.A03
            java.lang.String r7 = r2.A02
            boolean r9 = r2.A05
            java.util.List r2 = r2.A04
            java.util.List r1 = X.AnonymousClass00J.A0V(r1, r2)
            java.util.List r0 = r0.A05
            java.util.List r8 = X.AnonymousClass2FU.A00(r1, r0)
            java.lang.Integer r5 = X.AnonymousClass006.A0j
            X.6m5 r3 = new X.6m5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x00b0
        L_0x0126:
            boolean r0 = r7 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0030
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x012f:
            r3.A00 = r6
            java.lang.Object r7 = A02(r4, r0, r3)
            if (r7 != r2) goto L_0x0030
            return r2
        L_0x0138:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r3.<init>(r4, r6, r8)
            goto L_0x001c
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A03(com.instagram.ar.core.effectcollection.EffectCollectionService, X.6qZ, X.8n9):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1jB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.1jA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.1jB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.1jB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.1jB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A04(com.instagram.ar.core.effectcollection.EffectCollectionService r14, X.C25515Dn3 r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.C146958n9 r19, long r20) {
        /*
            r3 = 32
            r5 = r19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r5)
            if (r0 == 0) goto L_0x00b4
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r2 = r4.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r13 = 1
            if (r0 == 0) goto L_0x008e
            if (r0 != r13) goto L_0x00c9
            java.lang.Object r3 = r4.A01
            X.6s3 r3 = (X.C113736s3) r3
            X.AnonymousClass0OU.A00(r2)
        L_0x002a:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0071
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r1 = r2.A00
            X.6m5 r1 = (X.C110676m5) r1
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0063
            X.5v5 r0 = X.AnonymousClass5v5.A00
        L_0x0040:
            X.1jB r2 = X.C86164wN.A0R(r0)
        L_0x0044:
            r3.A01(r2)
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x005a
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r0 = r2.A00
            X.6m5 r0 = (X.C110676m5) r0
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A00
            if (r0 == 0) goto L_0x00ba
            X.1jA r2 = X.AnonymousClass1jA.A00(r0)
        L_0x0059:
            return r2
        L_0x005a:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0059
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0063:
            java.lang.String r2 = r1.A03
            java.lang.String r1 = r1.A02
            X.5v4 r0 = new X.5v4
            r0.<init>(r2, r1)
            X.1jB r2 = X.C86164wN.A0R(r0)
            goto L_0x0044
        L_0x0071:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c4
            X.1jB r2 = (X.AnonymousClass1jB) r2
            java.lang.Object r1 = r2.A00
            boolean r0 = r1 instanceof X.AnonymousClass5v2
            if (r0 == 0) goto L_0x0080
            X.5v7 r0 = X.AnonymousClass5v7.A00
            goto L_0x0040
        L_0x0080:
            boolean r0 = r1 instanceof X.AnonymousClass5v1
            if (r0 == 0) goto L_0x0087
            X.5v6 r0 = X.AnonymousClass5v6.A00
            goto L_0x0040
        L_0x0087:
            boolean r0 = r1 instanceof X.AnonymousClass5v3
            if (r0 == 0) goto L_0x00bf
            X.5v8 r0 = X.AnonymousClass5v8.A00
            goto L_0x0040
        L_0x008e:
            X.AnonymousClass0OU.A00(r2)
            X.6s3 r3 = new X.6s3
            r6 = r15
            r3.<init>(r15)
            r3.A00(r13)
            X.0ZV r10 = X.AnonymousClass0ZV.A00
            X.6qZ r5 = new X.6qZ
            r7 = r16
            r8 = r17
            r9 = r18
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            r4.A01 = r3
            r4.A00 = r13
            java.lang.Object r2 = A03(r14, r5, r4)
            if (r2 != r1) goto L_0x002a
            return r1
        L_0x00b4:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r14, r5, r3)
            goto L_0x0018
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x00bf:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00c4:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A04(com.instagram.ar.core.effectcollection.EffectCollectionService, X.Dn3, java.lang.String, java.lang.String, java.lang.String, X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.ar.core.effectcollection.EffectCollectionService r11, X.C25515Dn3 r12, java.lang.String r13, X.C146958n9 r14) {
        /*
            r3 = 42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r14)
            r4 = r11
            if (r0 == 0) goto L_0x0045
            r9 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r9.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r0) goto L_0x0056
            X.AnonymousClass0OU.A00(r3)
        L_0x0025:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x004b
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x0030:
            X.AnonymousClass0OU.A00(r3)
            long r10 = r11.A00
            r7 = 0
            r5 = r12
            r6 = r13
            X.AnonymousClass0wJ.A1M(r13, r0, r12)
            r9.A00 = r0
            r8 = r7
            java.lang.Object r3 = A04(r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L_0x0025
            return r2
        L_0x0045:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r9 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r9.<init>(r11, r14, r3, r3)
            goto L_0x0017
        L_0x004b:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0051
            r2 = 0
            return r2
        L_0x0051:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A05(com.instagram.ar.core.effectcollection.EffectCollectionService, X.Dn3, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.instagram.ar.core.effectcollection.EffectCollectionService r12, X.C113756s5 r13, X.C113756s5 r14, X.C146958n9 r15) {
        /*
            r4 = 11
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r4, r15)
            if (r0 == 0) goto L_0x0166
            r3 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0166
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r8 = r3.A04
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r1 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r9) goto L_0x010e
            if (r0 != r1) goto L_0x016d
            java.lang.Object r9 = r3.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = r3.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A01
            X.6jR r4 = (X.C109086jR) r4
            X.AnonymousClass0OU.A00(r8)
        L_0x0033:
            int r7 = r9.size()
            int r6 = r5.size()
            X.01V r5 = r4.A02
            int r3 = r4.A00
            r2 = 17636272(0x10d1bb0, float:2.5917475E-38)
            java.lang.String r0 = "smart_eviction_candidates_count"
            r5.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (int) r7)
            java.lang.String r0 = "maybe_smart_eviction_candidates_count"
            r5.markerAnnotate((int) r2, (int) r3, (java.lang.String) r0, (int) r6)
            r5.markerEnd(r2, r3, r1)
        L_0x004f:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x0052:
            X.AnonymousClass0OU.A00(r8)
            java.lang.Object r10 = r13.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r10 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r10
            java.lang.Object r0 = r10.A00
            X.Dn3 r0 = (X.C25515Dn3) r0
            X.C04220Ms.A0B(r0, r9)
            X.6jR r4 = new X.6jR
            r4.<init>(r0)
            X.01V r8 = r4.A02
            int r7 = r4.A00
            r6 = 17636272(0x10d1bb0, float:2.5917475E-38)
            r8.markerStart((int) r6, (int) r7)
            X.Dn3 r11 = r4.A01
            java.lang.String r5 = r11.A02
            java.lang.String r0 = "product_id"
            r8.markerAnnotate((int) r6, (int) r7, (java.lang.String) r0, (java.lang.String) r5)
            java.lang.String r5 = r11.A01
            java.lang.String r0 = "category_id"
            r8.markerAnnotate((int) r6, (int) r7, (java.lang.String) r0, (java.lang.String) r5)
            if (r14 == 0) goto L_0x0160
            java.lang.Object r0 = r14.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r0
            if (r0 == 0) goto L_0x0160
            java.lang.Object r5 = r0.A01
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            if (r5 == 0) goto L_0x0160
            java.lang.Object r0 = r10.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r5 = X.AnonymousClass00J.A0S(r5, r0)
            if (r5 == 0) goto L_0x0160
            boolean r0 = X.C18190wL.A1a(r5)
            if (r0 == 0) goto L_0x0160
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r7 = r12.A03
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r6 = r5.iterator()
        L_0x00a7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r6.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            X.C04220Ms.A06(r0)
            r8.add(r0)
            goto L_0x00a7
        L_0x00bc:
            X.C86114wI.A1J(r12, r4, r5, r3, r9)
            X.M5p r10 = r7.A00
            java.lang.String r6 = "\n"
            java.lang.StringBuilder r7 = X.C18190wL.A0s(r6)
            java.lang.String r0 = "      SELECT DISTINCT effectId FROM effect_collections_effects "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "      WHERE effectId IN ("
            r7.append(r0)
            int r6 = r8.size()
            X.C116116wS.A00(r7, r6)
            java.lang.String r0 = "  "
            java.lang.String r0 = X.C18180wK.A0i(r0, r7)
            X.MAm r9 = X.Lv1.A00(r0, r6)
            java.util.Iterator r7 = r8.iterator()
            r6 = 1
        L_0x00ea:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = X.C18180wK.A0k(r7)
            X.C86154wM.A1L(r9, r0, r6)
            int r6 = r6 + 1
            goto L_0x00ea
        L_0x00fa:
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            X.M6w r7 = r10.A07
            r6 = 7
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r6, r10, r9)
            java.lang.Object r8 = X.C120467Az.A00(r8, r7, r0, r3)
            if (r8 != r2) goto L_0x011d
            return r2
        L_0x010e:
            java.lang.Object r5 = r3.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A02
            X.6jR r4 = (X.C109086jR) r4
            java.lang.Object r12 = r3.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r12 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r12
            X.AnonymousClass0OU.A00(r8)
        L_0x011d:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r7 = r5.iterator()
        L_0x0127:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r6 = r7.next()
            r0 = r6
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0I
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0127
            r9.add(r6)
            goto L_0x0127
        L_0x0140:
            X.0Oa r0 = r12.A06
            java.lang.Object r10 = r0.getValue()
            X.C86114wI.A1J(r4, r5, r9, r3, r1)
            X.0ZV r11 = X.AnonymousClass0ZV.A00
            java.lang.Integer r8 = X.AnonymousClass006.A01
            r12 = 0
            r13 = 48
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = X.AnonymousClass7Ja.A00(r2, r3, r7)
            if (r0 == r2) goto L_0x015d
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x015d:
            if (r0 != r2) goto L_0x0033
            return r2
        L_0x0160:
            r0 = 4
            r8.markerEnd(r6, r7, r0)
            goto L_0x004f
        L_0x0166:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r3.<init>(r12, r15, r4)
            goto L_0x0016
        L_0x016d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A06(com.instagram.ar.core.effectcollection.EffectCollectionService, X.6s5, X.6s5, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C113016qZ r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x004e
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0053
            java.lang.Object r1 = r5.A01
            X.6s3 r1 = (X.C113736s3) r1
            X.AnonymousClass0OU.A00(r4)
        L_0x0028:
            X.3b6 r4 = (X.C62903b6) r4
            r1.A01(r4)
            return r4
        L_0x002e:
            X.AnonymousClass0OU.A00(r4)
            X.Dn3 r0 = r7.A01
            X.6s3 r1 = new X.6s3
            r1.<init>(r0)
            java.util.List r0 = r7.A00()
            int r0 = r0.size()
            r1.A00(r0)
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r4 = A03(r6, r7, r5)
            if (r4 != r3) goto L_0x0028
            return r3
        L_0x004e:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = X.C86164wN.A0n(r6, r8, r3)
            goto L_0x0016
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A08(X.6qZ, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.C23908D0w r13, X.BB8 r14, X.C146958n9 r15) {
        /*
            r12 = this;
            r3 = 12
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x0030
            r7 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r9 = r7.A04
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r6 = 4
            r10 = 3
            r2 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0052
            if (r0 == r1) goto L_0x0042
            if (r0 == r2) goto L_0x00c3
            if (r0 == r10) goto L_0x0036
            if (r0 == r6) goto L_0x00c3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0030:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r7.<init>(r12, r15, r3)
            goto L_0x0016
        L_0x0036:
            java.lang.Object r1 = r7.A02
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            java.lang.Object r4 = r7.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            X.AnonymousClass0OU.A00(r9)
            goto L_0x00b3
        L_0x0042:
            java.lang.Object r3 = r7.A03
            X.Dn3 r3 = (X.C25515Dn3) r3
            java.lang.Object r14 = r7.A02
            X.BB8 r14 = (X.BB8) r14
            java.lang.Object r4 = r7.A01
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            X.AnonymousClass0OU.A00(r9)
            goto L_0x0068
        L_0x0052:
            X.AnonymousClass0OU.A00(r9)
            X.Dn3 r3 = X.AnonymousClass777.A00(r13)
            java.lang.String r0 = r14.A01
            X.C04220Ms.A06(r0)
            X.C86114wI.A1J(r12, r14, r3, r7, r1)
            java.lang.Object r9 = A05(r12, r3, r0, r7)
            if (r9 == r8) goto L_0x00c8
            r4 = r12
        L_0x0068:
            com.instagram.camera.effect.models.CameraAREffect r9 = (com.instagram.camera.effect.models.CameraAREffect) r9
            if (r9 == 0) goto L_0x00c6
            X.9wD r0 = r14.A00
            r9.CpN(r0)
            boolean r1 = r9.BY8()
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r4.A03
            if (r1 == 0) goto L_0x0088
            r7.A01 = r5
            r7.A02 = r5
            r7.A03 = r5
            r7.A00 = r2
            java.lang.Object r0 = r0.A01(r3, r9, r7)
        L_0x0085:
            if (r0 != r8) goto L_0x00c6
            return r8
        L_0x0088:
            X.C86114wI.A1J(r4, r9, r5, r7, r10)
            X.M5p r11 = r0.A00
            r0 = -1
            r2 = 0
            X.GBb r2 = X.C30955Gc7.A01(r3, r5, r0, r2)
            java.lang.String r10 = r2.A01
            java.lang.String r2 = r9.A0I
            X.C04220Ms.A06(r2)
            X.Lnp r3 = new X.Lnp
            r3.<init>(r10, r2, r0)
            X.M6w r2 = r11.A07
            r1 = 5
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r1, r11, r3)
            java.lang.Object r0 = X.C120467Az.A01(r2, r0, r7)
            if (r0 == r8) goto L_0x00b0
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x00b0:
            if (r0 == r8) goto L_0x00c8
            r1 = r9
        L_0x00b3:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r0.<init>((com.instagram.camera.effect.models.CameraAREffect) r1)
            r7.A01 = r5
            r7.A02 = r5
            r7.A00 = r6
            java.lang.Object r0 = A00(r0, r4, r7)
            goto L_0x0085
        L_0x00c3:
            X.AnonymousClass0OU.A00(r9)
        L_0x00c6:
            kotlin.Unit r8 = kotlin.Unit.A00
        L_0x00c8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0A(X.D0w, X.BB8, X.8n9):java.lang.Object");
    }

    public final Object A0B(String str, C146958n9 r5) {
        C41253M5p m5p = this.A03.A00;
        Object A012 = C120467Az.A01(m5p.A07, new C1367484f(m5p, str), r5);
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A012 != d0e) {
            A012 = Unit.A00;
        }
        if (A012 != d0e) {
            return Unit.A00;
        }
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(java.util.List r10, X.C146958n9 r11) {
        /*
            r9 = this;
            r3 = 31
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x0065
            r8 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A02
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r8.A00
            r6 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r6) goto L_0x006a
            java.lang.Object r5 = r8.A01
            X.6h5 r5 = (X.C107646h5) r5
            X.AnonymousClass0OU.A00(r0)
        L_0x0028:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            X.01V r3 = r5.A01
            int r2 = r5.A00
            r1 = 3
            if (r0 == 0) goto L_0x0034
            r1 = 2
        L_0x0034:
            r0 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerEnd(r0, r2, r1)
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        L_0x003d:
            X.AnonymousClass0OU.A00(r0)
            X.6h5 r5 = new X.6h5
            r5.<init>()
            int r4 = r10.size()
            X.01V r3 = r5.A01
            int r2 = r5.A00
            r1 = 17633701(0x10d11a5, float:2.591027E-38)
            r3.markerStart((int) r1, (int) r2)
            java.lang.String r0 = "effects_count"
            r3.markerAnnotate((int) r1, (int) r2, (java.lang.String) r0, (int) r4)
            com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository r0 = r9.A03
            r8.A01 = r5
            r8.A00 = r6
            java.lang.Object r0 = r0.A05(r10, r8)
            if (r0 != r7) goto L_0x0028
            return r7
        L_0x0065:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r8 = X.C86164wN.A0n(r9, r11, r3)
            goto L_0x0016
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.EffectCollectionService.A0C(java.util.List, X.8n9):java.lang.Object");
    }

    public final C84714tk A0D(AnonymousClass5He r6) {
        Object A072;
        if (r6.A04) {
            A072 = new C1372486y(new KtSLambdaShape9S0301000_I2_1((Object) new KtSLambdaShape1S0300000_I2((C146958n9) null, (Object) this, (Object) r6, 6), (Object) new C1372486y(new KtSLambdaShape9S0301000_I2_1((C146958n9) null, (Object) this, (Object) r6, 8)), (C146958n9) null, 10));
        } else {
            A072 = A07(r6, this);
        }
        C84714tk A012 = AnonymousClass3XM.A01(new C1372486y(new KtSLambdaShape9S0301000_I2_1((Object) new C107656h6(this.A04, this.A05), A072, (C146958n9) null, 11)));
        KtSLambdaShape11S0100000_I2 ktSLambdaShape11S0100000_I2 = new KtSLambdaShape11S0100000_I2(43, (C146958n9) null);
        C04220Ms.A0B(A012, 0);
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) ktSLambdaShape11S0100000_I2, A012, 4);
    }
}
