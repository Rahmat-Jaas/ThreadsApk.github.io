package com.instagram.monetization.onboarding.repository;

import X.AnonymousClass0i4;
import X.C04220Ms;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.api.MonetizationApi;
import java.util.HashMap;
import java.util.List;

public final class OnboardingRepository implements AnonymousClass0i4 {
    public final HashMap A00;
    public final MonetizationApi A01;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.api.schemas.UserMonetizationProductType r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 4
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2.A00(r3, r14)
            if (r0 == 0) goto L_0x008e
            r4 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r9 = r4.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r4.A00
            r10 = 0
            r8 = 3
            r7 = 14
            r6 = 2
            r3 = 12
            r2 = 1
            r0 = 10
            if (r1 == 0) goto L_0x006a
            if (r1 == r2) goto L_0x00cd
            if (r1 == r6) goto L_0x0104
            if (r1 != r8) goto L_0x00a4
            java.lang.Object r13 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.AnonymousClass0OU.A00(r9)
        L_0x0036:
            X.3b6 r9 = (X.C62903b6) r9
            boolean r0 = r9 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x009b
            X.1jA r9 = (X.AnonymousClass1jA) r9
            java.lang.Object r0 = r9.A00
            X.5te r0 = (X.C94035te) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0048:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r3 = r4.next()
            X.6l5 r3 = (X.C110076l5) r3
            java.util.HashMap r2 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r3.A00
            if (r0 == 0) goto L_0x0094
            java.util.List r7 = r3.A03
            java.lang.String r9 = r3.A01
            java.lang.String r8 = r3.A02
            r11 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2
            r6.<init>((java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10, (int) r11)
            r2.put(r0, r6)
            goto L_0x0048
        L_0x006a:
            X.AnonymousClass0OU.A00(r9)
            int r1 = r13.ordinal()
            if (r1 == r0) goto L_0x00bb
            if (r1 == r3) goto L_0x00bb
            if (r1 == r7) goto L_0x00bb
            r0 = 15
            if (r1 == r0) goto L_0x00a9
            r0 = 5
            if (r1 == r0) goto L_0x00a9
            com.instagram.monetization.api.MonetizationApi r0 = r12.A01
            r4.A01 = r12
            r4.A02 = r13
            r4.A00 = r8
            java.lang.Object r9 = r0.A07(r4)
            if (r9 == r5) goto L_0x014d
            r1 = r12
            goto L_0x0036
        L_0x008e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0401000_I2_2
            r4.<init>(r12, r14, r3)
            goto L_0x0015
        L_0x0094:
            java.lang.String r0 = "productType"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x009b:
            boolean r0 = r9 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x013b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00a9:
            com.instagram.monetization.api.MonetizationApi r1 = r12.A01
            java.lang.String r0 = r13.A00
            r4.A01 = r12
            r4.A02 = r13
            r4.A00 = r6
            java.lang.Object r9 = r1.A06(r0, r4)
            if (r9 == r5) goto L_0x014d
            r1 = r12
            goto L_0x010d
        L_0x00bb:
            com.instagram.monetization.api.MonetizationApi r1 = r12.A01
            java.lang.String r0 = r13.A00
            r4.A01 = r12
            r4.A02 = r13
            r4.A00 = r2
            java.lang.Object r9 = r1.A06(r0, r4)
            if (r9 == r5) goto L_0x014d
            r1 = r12
            goto L_0x00d6
        L_0x00cd:
            java.lang.Object r13 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.AnonymousClass0OU.A00(r9)
        L_0x00d6:
            X.3b6 r9 = (X.C62903b6) r9
            boolean r0 = r9 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00fb
            X.1jA r9 = (X.AnonymousClass1jA) r9
            java.lang.Object r2 = r9.A00
            X.6lb r2 = (X.C110386lb) r2
            java.util.HashMap r4 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r2.A01
            java.lang.String r0 = r0.A00
            com.instagram.api.schemas.UserMonetizationProductType r3 = X.AnonymousClass2FJ.A00(r0)
            java.util.List r0 = r2.A02
            java.util.List r2 = X.C101986Tj.A00(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2
            r0.<init>(r2)
            r4.put(r3, r0)
            goto L_0x013b
        L_0x00fb:
            boolean r0 = r9 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x013b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0104:
            java.lang.Object r13 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.AnonymousClass0OU.A00(r9)
        L_0x010d:
            X.3b6 r9 = (X.C62903b6) r9
            boolean r0 = r9 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0144
            X.1jA r9 = (X.AnonymousClass1jA) r9
            java.lang.Object r4 = r9.A00
            X.6lb r4 = (X.C110386lb) r4
            java.util.HashMap r3 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r4.A01
            java.lang.String r0 = r0.A00
            com.instagram.api.schemas.UserMonetizationProductType r2 = X.AnonymousClass2FJ.A00(r0)
            java.util.List r0 = r4.A02
            java.util.List r7 = X.C101986Tj.A00(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = r4.A00
            r8 = 0
            if (r0 == 0) goto L_0x0142
            java.lang.String r9 = r0.A00
            java.lang.String r8 = r0.A01
        L_0x0132:
            r11 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2
            r6.<init>((java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10, (int) r11)
            r3.put(r2, r6)
        L_0x013b:
            java.util.HashMap r0 = r1.A00
            java.lang.Object r0 = r0.get(r13)
            return r0
        L_0x0142:
            r9 = r8
            goto L_0x0132
        L_0x0144:
            boolean r0 = r9 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x013b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x014d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A01(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    public final List A05(UserMonetizationProductType userMonetizationProductType) {
        C04220Ms.A0B(userMonetizationProductType, 0);
        KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2 = (KtCSuperShape0S2101000_I2) this.A00.get(userMonetizationProductType);
        if (ktCSuperShape0S2101000_I2 != null) {
            return (List) ktCSuperShape0S2101000_I2.A01;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.UserMonetizationProductType r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0052
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0042
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = X.C86154wM.A0w(r5, r7, r3)
            goto L_0x0016
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "Onboarding network request failed"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x004d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A00(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.UserMonetizationProductType r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0052
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0042
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A03(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = X.C86154wM.A0w(r5, r7, r3)
            goto L_0x0016
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "Onboarding network request failed"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x004d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A02(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.api.schemas.UserMonetizationProductType r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0052
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0042
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = X.C86154wM.A0w(r5, r7, r3)
            goto L_0x0016
        L_0x0042:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "Onboarding network request failed"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x004d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A03(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.api.schemas.UserMonetizationProductType r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0053
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            X.3b6 r3 = (X.C62903b6) r3
            boolean r0 = r3 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0043
            X.1jA r3 = (X.AnonymousClass1jA) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A05(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r4.<init>(r5, r7, r3, r3)
            goto L_0x0016
        L_0x0043:
            boolean r0 = r3 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "Onboarding network request failed"
            java.io.IOException r0 = X.C86154wM.A0V(r0)
            throw r0
        L_0x004e:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A04(com.instagram.api.schemas.UserMonetizationProductType, X.8n9):java.lang.Object");
    }

    public final void A06(UserMonetizationProductType userMonetizationProductType, int i) {
        KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2 = (KtCSuperShape0S2101000_I2) this.A00.get(userMonetizationProductType);
        if (ktCSuperShape0S2101000_I2 != null) {
            ktCSuperShape0S2101000_I2.A00 = i;
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public OnboardingRepository(MonetizationApi monetizationApi, HashMap hashMap) {
        this.A01 = monetizationApi;
        this.A00 = hashMap;
    }
}
