package com.instagram.groupprofiles.data;

import X.AnonymousClass4VZ;
import X.C04220Ms;
import X.C07530bf;
import X.C146958n9;
import X.C18180wK;
import X.C18230wP;
import X.C26743EUq;
import android.content.Context;
import com.instagram.service.session.UserSession;
import java.io.File;

public final class GroupProfileRepository {
    public final Context A00;
    public final C07530bf A01;
    public final UserSession A02;

    public GroupProfileRepository(Context context, C07530bf r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = C18230wP.A09(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.groupprofiles.data.GroupProfileRepository r10, java.io.File r11, X.C146958n9 r12) {
        /*
            r4 = 4
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r4, r12)
            if (r0 == 0) goto L_0x0061
            r2 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0061
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r0 = r2.A02
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r2.A00
            r9 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 != r9) goto L_0x0067
            java.lang.Object r8 = r2.A01
            X.AnonymousClass0OU.A00(r0)
        L_0x0025:
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x002a
            r8 = 0
        L_0x002a:
            return r8
        L_0x002b:
            X.AnonymousClass0OU.A00(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            android.net.Uri r6 = android.net.Uri.fromFile(r11)
            android.content.Context r1 = r10.A00
            com.instagram.service.session.UserSession r0 = r10.A02
            r2.A01 = r7
            r2.A00 = r9
            r5 = 843312933(0x3243ef25, float:1.1404869E-8)
            r4 = 3
            r3 = 0
            X.EnC r2 = X.C18220wO.A11(r2)
            X.H8a r1 = X.C33322Fg.A00(r1, r6, r0, r7, r9)
            com.instagram.common.task.IDxCallbackShape128S0100000_1_I2 r0 = new com.instagram.common.task.IDxCallbackShape128S0100000_1_I2
            r0.<init>(r2, r9)
            r1.A00 = r0
            X.C31155GhB.A05(r1, r5, r4, r9, r3)
            java.lang.Object r0 = r2.A0B()
            if (r0 == r8) goto L_0x002a
            r8 = r7
            goto L_0x0025
        L_0x0061:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r2 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r2.<init>(r10, r12, r4)
            goto L_0x0015
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A02(com.instagram.groupprofiles.data.GroupProfileRepository, java.io.File, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C11630kW r9, com.instagram.user.model.User r10, X.C146958n9 r11, boolean r12) {
        /*
            r8 = this;
            r5 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2.A00(r5, r11)
            if (r0 == 0) goto L_0x0080
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r4.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r7 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r5) goto L_0x0086
            boolean r12 = r4.A05
            java.lang.Object r10 = r4.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r1 = r4.A01
            com.instagram.groupprofiles.data.GroupProfileRepository r1 = (com.instagram.groupprofiles.data.GroupProfileRepository) r1
            X.AnonymousClass0OU.A00(r2)
        L_0x002d:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0047
            r10.A2O(r12)
            com.instagram.service.session.UserSession r0 = r1.A02
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.45h r0 = new X.45h
            r0.<init>()
            r1.CWx(r0)
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x0047:
            r7 = 0
            goto L_0x0042
        L_0x0049:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.service.session.UserSession r2 = r8.A02
            if (r12 == 0) goto L_0x0073
            java.lang.String r0 = r10.getId()
            java.util.List r1 = X.C18180wK.A0n(r0)
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x005a:
            r3 = 0
            X.H8c r2 = X.C34802Ky.A00(r9, r2, r1, r0)
            r1 = 390949354(0x174d69ea, float:6.6372755E-25)
            r0 = 14
            r4.A01 = r8
            r4.A02 = r10
            r4.A05 = r12
            r4.A00 = r5
            java.lang.Object r2 = X.C63623hv.A01(r2, r4, r1, r3, r0)
            if (r2 != r6) goto L_0x007e
            return r6
        L_0x0073:
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = r10.getId()
            java.util.List r0 = X.C18180wK.A0n(r0)
            goto L_0x005a
        L_0x007e:
            r1 = r8
            goto L_0x002d
        L_0x0080:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2
            r4.<init>(r8, r11, r5)
            goto L_0x0015
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A05(X.0kW, com.instagram.user.model.User, X.8n9, boolean):java.lang.Object");
    }

    private final Object A00(C26743EUq eUq, String str, C146958n9 r6) {
        Boolean bool;
        if (eUq != null) {
            bool = Boolean.valueOf(eUq.A06());
        } else {
            bool = null;
        }
        Boolean A0Y = C18180wK.A0Y();
        if (C04220Ms.A0I(bool, A0Y)) {
            Object A03 = eUq.A03();
            C04220Ms.A06(A03);
            return A01(this, (File) A03, str, r6);
        } else if (C04220Ms.A0I(bool, C18180wK.A0X())) {
            return GroupProfileApiUtil.A00.A07(this.A02, str, r6);
        } else {
            if (bool == null) {
                return A0Y;
            }
            throw AnonymousClass4VZ.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.groupprofiles.data.GroupProfileRepository r7, java.io.File r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r3 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x0056
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r0) goto L_0x0035
            if (r1 != r3) goto L_0x005c
            X.AnonymousClass0OU.A00(r5)
        L_0x0027:
            return r5
        L_0x0028:
            X.AnonymousClass0OU.A00(r5)
            X.C18240wQ.A1M(r7, r9, r6, r0)
            java.lang.Object r5 = A02(r7, r8, r6)
            if (r5 != r4) goto L_0x0040
            return r4
        L_0x0035:
            java.lang.Object r9 = r6.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.A01
            com.instagram.groupprofiles.data.GroupProfileRepository r7 = (com.instagram.groupprofiles.data.GroupProfileRepository) r7
            X.AnonymousClass0OU.A00(r5)
        L_0x0040:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0061
            com.instagram.groupprofiles.data.GroupProfileApiUtil r2 = com.instagram.groupprofiles.data.GroupProfileApiUtil.A00
            com.instagram.service.session.UserSession r1 = r7.A02
            r0 = 0
            r6.A01 = r0
            r6.A02 = r0
            r6.A00 = r3
            java.lang.Object r5 = r2.A04(r1, r5, r9, r6)
            if (r5 != r4) goto L_0x0027
            return r4
        L_0x0056:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0061:
            java.lang.Boolean r4 = X.C18180wK.A0X()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A01(com.instagram.groupprofiles.data.GroupProfileRepository, java.io.File, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C26743EUq r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.C146958n9 r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r10 = r19
            r5 = r18
            r3 = 42
            r4 = r23
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r3, r4)
            r6 = r17
            if (r0 == 0) goto L_0x0078
            r13 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r13 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001e:
            java.lang.Object r0 = r13.A04
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r13.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 == r1) goto L_0x0030
            if (r3 != r2) goto L_0x007e
            X.AnonymousClass0OU.A00(r0)
        L_0x002f:
            return r0
        L_0x0030:
            java.lang.Object r5 = r13.A03
            X.EUq r5 = (X.C26743EUq) r5
            java.lang.Object r10 = r13.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r13.A01
            com.instagram.groupprofiles.data.GroupProfileRepository r1 = (com.instagram.groupprofiles.data.GroupProfileRepository) r1
            X.AnonymousClass0OU.A00(r0)
            goto L_0x0062
        L_0x0040:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.groupprofiles.data.GroupProfileApiUtil r7 = com.instagram.groupprofiles.data.GroupProfileApiUtil.A00
            com.instagram.service.session.UserSession r8 = r6.A02
            r13.A01 = r6
            r13.A02 = r10
            r13.A03 = r5
            r13.A00 = r1
            r11 = r21
            r12 = r22
            r14 = r24
            r15 = r25
            r16 = r26
            r9 = r20
            java.lang.Object r0 = r7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == r4) goto L_0x0077
            r1 = r6
        L_0x0062:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0083
            r0 = 0
            r13.A01 = r0
            r13.A02 = r0
            r13.A03 = r0
            r13.A00 = r2
            java.lang.Object r0 = r1.A00(r5, r10, r13)
            if (r0 != r4) goto L_0x002f
        L_0x0077:
            return r4
        L_0x0078:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r13 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r13.<init>(r6, r4, r3)
            goto L_0x001e
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0083:
            java.lang.Boolean r0 = X.C18180wK.A0X()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A03(X.EUq, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.8n9, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
        if (r7.A00(r0, r1, r4) == r3) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C34640IcN r9, java.io.File r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, X.C146958n9 r14, boolean r15, boolean r16) {
        /*
            r8 = this;
            r3 = 39
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r14)
            if (r0 == 0) goto L_0x00c3
            r4 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r7) goto L_0x0083
            if (r0 != r5) goto L_0x00ca
            java.lang.Object r6 = r4.A01
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.AnonymousClass0OU.A00(r1)
        L_0x002b:
            X.34u r0 = new X.34u
            r0.<init>(r6)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x0034:
            return r1
        L_0x0035:
            X.AnonymousClass0OU.A00(r1)
            X.0bf r6 = r8.A01
            X.0BO r0 = r6.A00
            java.util.List r0 = r0.A0F()
            java.lang.Object r0 = X.C18240wQ.A0b(r0)
            X.4Mm r0 = (X.C72144Mm) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.A01()
            com.instagram.registration.model.RegFlowExtras r2 = new com.instagram.registration.model.RegFlowExtras
            r2.<init>()
            X.25r r0 = X.C313625r.SAC
            r2.A03(r0)
            r2.A0J = r1
            r2.A0Z = r11
            r2.A0y = r7
            r2.A0i = r7
            r2.A0E = r12
            r2.A0F = r13
            r2.A0n = r15
            r0 = r16
            r2.A0o = r0
            r4.A01 = r8
            r4.A02 = r10
            r4.A00 = r7
            X.EnC r1 = X.C18220wO.A11(r4)
            r0 = 134(0x86, float:1.88E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = X.C63873iU.A06(r1, r0)
            X.C48942qa.A00(r9, r0, r2, r6)
            java.lang.Object r1 = r1.A0B()
            if (r1 == r3) goto L_0x00b7
            r7 = r8
            goto L_0x008c
        L_0x0083:
            java.lang.Object r10 = r4.A02
            java.lang.Object r7 = r4.A01
            com.instagram.groupprofiles.data.GroupProfileRepository r7 = (com.instagram.groupprofiles.data.GroupProfileRepository) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x008c:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00ba
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r6 = r1.A00
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            com.instagram.service.session.UserSession r0 = r7.A02
            X.Dnj r1 = X.AnonymousClass6VR.A00(r0)
            r2 = 0
            r0 = 0
            r1.A02(r6, r0, r0)
            java.lang.String r1 = r6.getId()
            if (r10 == 0) goto L_0x00b8
            X.5rY r0 = new X.5rY
            r0.<init>(r10)
        L_0x00ae:
            X.C18240wQ.A1M(r6, r2, r4, r5)
            java.lang.Object r0 = r7.A00(r0, r1, r4)
            if (r0 != r3) goto L_0x002b
        L_0x00b7:
            return r3
        L_0x00b8:
            r0 = r2
            goto L_0x00ae
        L_0x00ba:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0034
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00c3:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r4.<init>(r8, r14, r3)
            goto L_0x0016
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00cf:
            java.lang.String r0 = "Invalid logged out session."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            X.1jB r1 = new X.1jB
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A04(X.IcN, java.io.File, java.lang.String, java.lang.String, java.lang.String, X.8n9, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 40
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r8)
            if (r0 == 0) goto L_0x0059
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0059
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r2) goto L_0x005f
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r5.A01
            com.instagram.groupprofiles.data.GroupProfileRepository r1 = (com.instagram.groupprofiles.data.GroupProfileRepository) r1
            X.AnonymousClass0OU.A00(r4)
        L_0x002c:
            boolean r0 = X.AnonymousClass0wJ.A1X(r4)
            if (r0 == 0) goto L_0x0045
            com.instagram.service.session.UserSession r0 = r1.A02
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.46Q r0 = new X.46Q
            r0.<init>(r7)
            r1.CWx(r0)
        L_0x0040:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
        L_0x0044:
            return r3
        L_0x0045:
            r2 = 0
            goto L_0x0040
        L_0x0047:
            X.AnonymousClass0OU.A00(r4)
            com.instagram.groupprofiles.data.GroupProfileApiUtil r1 = com.instagram.groupprofiles.data.GroupProfileApiUtil.A00
            com.instagram.service.session.UserSession r0 = r6.A02
            X.C18240wQ.A1M(r6, r7, r5, r2)
            java.lang.Object r4 = r1.A06(r0, r7, r5)
            if (r4 == r3) goto L_0x0044
            r1 = r6
            goto L_0x002c
        L_0x0059:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A06(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r4 = 49
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r4, r7)
            if (r0 == 0) goto L_0x00af
            r3 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 != r1) goto L_0x00bf
            X.AnonymousClass0OU.A00(r2)
        L_0x0024:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0079
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r0 = r2.A00
            X.1T7 r0 = (X.AnonymousClass1T7) r0
            X.3FW r0 = r0.A00
            java.util.List r0 = r0.A00()
            if (r0 != 0) goto L_0x003a
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x003a:
            X.1jA r2 = X.AnonymousClass1jA.A00(r0)
        L_0x003e:
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0060
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00ba
            X.2L8 r2 = X.AnonymousClass1jB.A00(r2)
            boolean r0 = r2 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0061
            X.1j8 r2 = (X.AnonymousClass1j8) r2
            java.lang.Throwable r0 = r2.A00
            java.lang.String r0 = r0.getLocalizedMessage()
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
        L_0x005b:
            X.1jB r2 = new X.1jB
            r2.<init>(r1)
        L_0x0060:
            return r2
        L_0x0061:
            boolean r0 = r2 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "Unknown Error: status="
            X.1j9 r2 = (X.AnonymousClass1j9) r2
            X.8mT r0 = r2.A00
            X.44e r0 = (X.C685344e) r0
            int r0 = r0.mStatusCode
            java.lang.String r0 = X.AnonymousClass00U.A0J(r1, r0)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r0)
            goto L_0x005b
        L_0x0079:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x003e
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0082:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.service.session.UserSession r0 = r5.A02
            r3.A00 = r1
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "accounts/username_suggestions/"
            r2.A0J(r0)
            java.lang.String r0 = "name"
            r2.A0O(r0, r6)
            java.lang.String r0 = "is_group_profile"
            r2.A0R(r0, r1)
            java.lang.Class<X.1T7> r1 = X.AnonymousClass1T7.class
            java.lang.Class<X.3Nc> r0 = X.C59963Nc.class
            X.H8c r2 = X.C18180wK.A0T(r2, r1, r0)
            r1 = 612978089(0x24894da9, float:5.954584E-17)
            r0 = 0
            java.lang.Object r2 = X.C63623hv.A00(r2, r3, r1, r0)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x00af:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r3 = X.C18190wL.A0y(r5, r7, r4)
            goto L_0x0016
        L_0x00b5:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ba:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileRepository.A07(java.lang.String, X.8n9):java.lang.Object");
    }
}
