package com.instagram.archive.data;

import X.AnonymousClass0ZV;
import X.AnonymousClass2TZ;
import X.C04220Ms;
import X.C04620Ok;
import X.C06810aP;
import X.C134647y7;
import X.C148838sG;
import X.C18190wL;
import X.C18230wP;
import X.C19554AyF;
import X.C27457Enn;
import X.C86074wE;
import X.C86094wG;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ArchiveStoryRecycleBinRepository extends C134647y7 {
    public List A00 = AnonymousClass0ZV.A00;
    public Integer A01;
    public String A02;
    public final ReelStore A03;
    public final UserSession A04;
    public final C06810aP A05;
    public final C86074wE A06;
    public final C86094wG A07;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011c, code lost:
        if (r13.A02 != null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r14, boolean r15) {
        /*
            r13 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r14)
            if (r0 == 0) goto L_0x011f
            r5 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00a2
            if (r0 != r4) goto L_0x0126
            java.lang.Object r5 = r5.A01
            com.instagram.archive.data.ArchiveStoryRecycleBinRepository r5 = (com.instagram.archive.data.ArchiveStoryRecycleBinRepository) r5
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0080
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            X.1Rm r2 = (X.C21611Rm) r2
            java.lang.String r0 = r2.A05
            r5.A02 = r0
            java.util.List r1 = r5.A00
            java.util.List r0 = r2.A06
            if (r0 != 0) goto L_0x0041
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0041:
            java.util.List r4 = X.AnonymousClass00J.A0V(r0, r1)
            r5.A00 = r4
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x0059
            java.lang.Long r0 = r2.A04
            if (r0 == 0) goto L_0x007d
            long r1 = r0.longValue()
            int r0 = (int) r1
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
        L_0x0059:
            r5.A01 = r3
            com.instagram.reels.store.ReelStore r2 = r5.A03
            X.0aP r0 = r5.A05
            com.instagram.user.model.User r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            java.util.Map r4 = X.C25062Dev.A00(r2, r1, r0, r3, r4)
            X.4wE r3 = r5.A06
        L_0x0069:
            java.lang.Object r2 = r3.getValue()
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((java.lang.Integer) r1, (java.util.Map) r4)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0069
        L_0x007a:
            kotlin.Unit r6 = kotlin.Unit.A00
        L_0x007c:
            return r6
        L_0x007d:
            java.lang.Integer r3 = r5.A01
            goto L_0x0059
        L_0x0080:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007a
            X.4wE r5 = r5.A06
        L_0x0086:
            java.lang.Object r3 = r5.getValue()
            r0 = r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            X.C04220Ms.A0B(r1, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((java.lang.Integer) r2, (java.util.Map) r1)
            boolean r0 = r5.ADi(r3, r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x007a
        L_0x00a2:
            X.AnonymousClass0OU.A00(r1)
            if (r15 == 0) goto L_0x011a
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            r13.A00 = r0
            r13.A01 = r3
            r13.A02 = r3
        L_0x00af:
            X.4wE r8 = r13.A06
        L_0x00b1:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Integer r2 = X.AnonymousClass006.A01
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            X.C04220Ms.A0B(r1, r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r0.<init>((java.lang.Integer) r2, (java.util.Map) r1)
            boolean r0 = r8.ADi(r7, r0)
            if (r0 == 0) goto L_0x00b1
            com.instagram.service.session.UserSession r12 = r13.A04
            java.lang.Integer r11 = X.AnonymousClass006.A0Y
            java.lang.String r10 = r13.A02
            r7 = 0
            X.GXN r1 = new X.GXN
            r1.<init>()
            java.lang.String r9 = "max_id"
            r1.A05(r9, r10)
            java.lang.String r0 = "v1:"
            java.lang.String r8 = "archive/reel/scheduled_for_deletion_day_shells_paginated/"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r8)
            java.lang.String r1 = r1.A01(r0)
            X.C04220Ms.A06(r1)
            r0 = -2
            X.H1T r2 = new X.H1T
            r2.<init>(r12, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r2.A0F(r0)
            r2.A0J(r8)
            r2.A0O(r9, r10)
            X.C18200wM.A1M(r2, r11, r1)
            java.lang.Class<X.1Rm> r1 = X.C21611Rm.class
            java.lang.Class<X.3Kg> r0 = X.C59293Kg.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r5.A01 = r13
            r5.A00 = r4
            r0 = 582526129(0x22b8a4b1, float:5.0047674E-18)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r7, r1)
            if (r1 == r6) goto L_0x007c
            r5 = r13
            goto L_0x0029
        L_0x011a:
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L_0x007a
            goto L_0x00af
        L_0x011f:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2
            r5.<init>(r13, r14, r3)
            goto L_0x0016
        L_0x0126:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.ArchiveStoryRecycleBinRepository.A00(X.8n9, boolean):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArchiveStoryRecycleBinRepository(UserSession userSession) {
        super("StoryArchiveRecycleBin", AnonymousClass2TZ.A00(953251634));
        C19554AyF.A02();
        ReelStore A022 = ReelStore.A02(userSession);
        C04220Ms.A06(A022);
        C06810aP A002 = C04620Ok.A00(userSession);
        C04220Ms.A0B(A002, 3);
        this.A04 = userSession;
        this.A03 = A022;
        this.A05 = A002;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0200000_I2((Integer) null, (Map) null, (DefaultConstructorMarker) null, 3, 18));
        this.A06 = A0z;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z);
    }
}
