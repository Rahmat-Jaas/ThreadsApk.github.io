package com.instagram.brandedcontent.repository;

import X.AnonymousClass0ZV;
import X.C18180wK;
import X.C18190wL;
import X.C27457Enn;
import X.C37010Jil;
import X.C684443u;
import X.C86074wE;
import X.C86094wG;
import X.DIV;
import X.H8D;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.monetization.api.MonetizationApi;

public final class BrandedContentSettingsRepository {
    public final BrandedContentProjectRepository A00;
    public final C684443u A01;
    public final BrandedContentApi A02;
    public final C37010Jil A03 = C37010Jil.A00();
    public final H8D A04;
    public final C86074wE A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C86094wG A08;
    public final C86094wG A09;
    public final C86094wG A0A;
    public final C86094wG A0B;
    public final C86094wG A0C;
    public final MonetizationApi A0D;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.service.session.UserSession r6, X.C146958n9 r7, boolean r8) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x0047
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r2) goto L_0x004c
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r1.<init>(r6)
            if (r8 == 0) goto L_0x0044
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x003b:
            r4.A00 = r2
            java.lang.Object r1 = r1.A0A(r0, r4)
            if (r1 != r3) goto L_0x0024
            return r3
        L_0x0044:
            java.lang.String r0 = "not_opted_in"
            goto L_0x003b
        L_0x0047:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r5, r7, r3)
            goto L_0x0016
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A00(com.instagram.service.session.UserSession, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.List r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x008d
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r7) goto L_0x002a
            if (r0 != r6) goto L_0x0093
            X.AnonymousClass0OU.A00(r2)
        L_0x0027:
            kotlin.Unit r4 = kotlin.Unit.A00
        L_0x0029:
            return r4
        L_0x002a:
            java.lang.Object r3 = r5.A01
            X.AnonymousClass0OU.A00(r2)
            goto L_0x006c
        L_0x0030:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.monetization.api.MonetizationApi r3 = r8.A0D
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.UserMonetizationProductType r0 = (com.instagram.api.schemas.UserMonetizationProductType) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x003d
        L_0x004f:
            r5.A01 = r8
            r5.A00 = r7
            com.instagram.service.session.UserSession r0 = r3.A00
            X.H8c r3 = com.instagram.monetization.api.MonetizationApi.A00(r0, r2)
            r2 = 352238759(0x14febca7, float:2.5721856E-26)
            r1 = 0
            r0 = 14
            X.4tk r1 = X.C63623hv.A03(r3, r2, r1, r0)
            r0 = 22
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r2 = X.C86124wJ.A0V(r1, r0)
            if (r2 == r4) goto L_0x0029
            r3 = r8
        L_0x006c:
            r0 = 12
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r1 = new com.facebook.redex.IDxFlowShape251S0100000_2_I2
            r1.<init>(r2, r0)
            r0 = 50
            com.facebook.redex.IDxFlowShape253S0100000_4_I2 r2 = new com.facebook.redex.IDxFlowShape253S0100000_4_I2
            r2.<init>((X.C84714tk) r1, (int) r0)
            r0 = 62
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r1 = new com.facebook.redex.IDxFCollectorShape230S0100000_2_I2
            r1.<init>(r3, r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x008d:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A01(java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C146958n9 r7, boolean r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x005b
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x002b
            if (r2 != r1) goto L_0x0060
            X.AnonymousClass0OU.A00(r0)
        L_0x0024:
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = r6.A02
            r4.A00 = r1
            if (r8 == 0) goto L_0x0058
            java.lang.String r1 = "business/branded_content/onboard_creator_to_creator_marketplace/"
        L_0x0036:
            com.instagram.service.session.UserSession r0 = r0.A00
            r3 = 19346664(0x12734e8, float:3.0711014E-38)
            X.H1T r2 = new X.H1T
            r2.<init>(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A0F(r0)
            r2.A0J(r1)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 0
            java.lang.Object r0 = X.C63623hv.A00(r1, r4, r3, r0)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0058:
            java.lang.String r1 = "business/branded_content/offboard_creator_from_creator_marketplace/"
            goto L_0x0036
        L_0x005b:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r6, r7, r3)
            goto L_0x0016
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A02(X.8n9, boolean):java.lang.Object");
    }

    public BrandedContentSettingsRepository(BrandedContentProjectRepository brandedContentProjectRepository, C684443u r3, BrandedContentApi brandedContentApi, H8D h8d, MonetizationApi monetizationApi) {
        this.A0D = monetizationApi;
        this.A02 = brandedContentApi;
        this.A04 = h8d;
        this.A00 = brandedContentProjectRepository;
        this.A01 = r3;
        C27457Enn A0z = C18190wL.A0z(AnonymousClass0ZV.A00);
        this.A07 = A0z;
        this.A0C = A0z;
        C27457Enn A0z2 = C18190wL.A0z(DIV.A01);
        this.A06 = A0z2;
        this.A0B = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(C18180wK.A0X());
        this.A05 = A0z3;
        this.A0A = A0z3;
        this.A09 = brandedContentProjectRepository.A02;
        this.A08 = r3.A05;
    }
}
