package com.instagram.brandedcontent.repository;

import X.AnonymousClass0OU;
import X.AnonymousClass1j9;
import X.AnonymousClass1jB;
import X.C04220Ms;
import X.C685344e;
import X.CR9;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;

public final class BrandedContentApi {
    public final UserSession A00;

    public BrandedContentApi(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r8 = this;
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r11)
            if (r0 == 0) goto L_0x0067
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r6) goto L_0x0092
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x006c
            return r1
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r1 = r8.A00
            X.H1T r2 = new X.H1T
            r0 = -2
            r2.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r2.A0F(r0)
            java.lang.String r0 = "business/branded_content/change_approval_request_status_for_creator/"
            r2.A0J(r0)
            java.lang.Class<X.5tN> r1 = X.AnonymousClass5tN.class
            java.lang.Class<X.6zi> r0 = X.C118076zi.class
            r2.A0B(r1, r0)
            r0 = 54
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0O(r0, r10)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "new_status"
            X.H8c r3 = X.C18200wM.A0T(r2, r0, r1)
            r2 = 0
            r1 = 14
            r4.A00 = r6
            r0 = 1444377988(0x56177584, float:4.1632745E13)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0067:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r8, r11, r3)
            goto L_0x0015
        L_0x006c:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008d
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r1 = r1.A00
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x007f
            X.1jB r5 = A01(r1)
            return r5
        L_0x007f:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0088
            X.1jB r5 = X.C86164wN.A0R(r7)
            return r5
        L_0x0088:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x008d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A02(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.brandedcontent.model.BrandedContentGatingInfo r9, com.instagram.brandedcontent.model.BrandedContentProjectMetadata r10, java.lang.String r11, java.util.List r12, java.util.List r13, X.C146958n9 r14, boolean r15) {
        /*
            r8 = this;
            r3 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r14)
            if (r0 == 0) goto L_0x0071
            r4 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0071
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r6) goto L_0x007b
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0076
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0030:
            return r5
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r7 = r8.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            r0 = 398(0x18e, float:5.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            X.C04220Ms.A06(r0)
            r2.A0J(r0)
            java.lang.Class<X.5uB> r1 = X.AnonymousClass5uB.class
            java.lang.Class<X.71d> r0 = X.C1184971d.class
            r2.A0B(r1, r0)
            X.C19476Awz.A04(r2, r7, r12, r13, r15)
            X.C19476Awz.A02(r2, r9)
            X.C19476Awz.A03(r2, r10)
            X.H8c r2 = r2.A02()
            r1 = 14
            r4.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x0071:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r8, r14, r3)
            goto L_0x0015
        L_0x0076:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A03(com.instagram.brandedcontent.model.BrandedContentGatingInfo, com.instagram.brandedcontent.model.BrandedContentProjectMetadata, java.lang.String, java.util.List, java.util.List, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r11)
            if (r0 == 0) goto L_0x0072
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r6) goto L_0x00a2
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x007c
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5t6 r0 = (X.AnonymousClass5t6) r0
            X.763 r0 = r0.A00
            if (r0 != 0) goto L_0x0077
            X.C18250wR.A0m()
            throw r7
        L_0x0038:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r8.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            r0 = 803(0x323, float:1.125E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0J(r0)
            java.lang.Class<X.5t6> r1 = X.AnonymousClass5t6.class
            java.lang.Class<X.6yo> r0 = X.C117516yo.class
            r2.A0B(r1, r0)
            if (r9 == 0) goto L_0x0058
            java.lang.String r0 = "added_user_id"
            r2.A0O(r0, r9)
        L_0x0058:
            if (r10 == 0) goto L_0x005f
            java.lang.String r0 = "removed_user_id"
            r2.A0O(r0, r10)
        L_0x005f:
            X.H8c r3 = r2.A02()
            r2 = 0
            r1 = 14
            r4.A00 = r6
            r0 = 50545580(0x30343ac, float:3.8575123E-37)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r8, r11, r3)
            goto L_0x0015
        L_0x0077:
            X.1jA r5 = X.AnonymousClass1jA.A00(r0)
            return r5
        L_0x007c:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x009d
            X.1jB r1 = (X.AnonymousClass1jB) r1
            java.lang.Object r1 = r1.A00
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x008f
            X.1jB r5 = A01(r1)
            return r5
        L_0x008f:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0098
            X.1jB r5 = X.C86164wN.A0R(r7)
            return r5
        L_0x0098:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x009d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A05(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r9, java.util.List r10, java.util.List r11, X.C146958n9 r12) {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r12)
            if (r0 == 0) goto L_0x006f
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r6) goto L_0x0079
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0074
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0030:
            return r5
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r7 = r8.A00
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            r0 = 398(0x18e, float:5.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            X.C04220Ms.A06(r0)
            r2.A0J(r0)
            java.lang.Class<X.5uB> r1 = X.AnonymousClass5uB.class
            java.lang.Class<X.71d> r0 = X.C1184971d.class
            r2.A0B(r1, r0)
            boolean r0 = X.C18190wL.A1a(r11)
            X.C19476Awz.A04(r2, r7, r10, r11, r0)
            X.H8c r2 = r2.A02()
            r1 = 14
            r4.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x006f:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r8, r12, r3)
            goto L_0x0015
        L_0x0074:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A06(java.lang.String, java.util.List, java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r6 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r6, r9)
            if (r0 == 0) goto L_0x005f
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0030
            if (r0 != r6) goto L_0x0069
            X.AnonymousClass0OU.A00(r1)
        L_0x0022:
            r4 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0064
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x002f:
            return r4
        L_0x0030:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_brand/"
            r2.A0J(r0)
            java.lang.Class<X.5tm> r1 = X.C94115tm.class
            java.lang.Class<X.6zj> r0 = X.C118086zj.class
            r2.A0B(r1, r0)
            if (r8 == 0) goto L_0x004c
            java.lang.String r0 = "cursor"
            r2.A0O(r0, r8)
        L_0x004c:
            X.H8c r3 = r2.A02()
            r2 = 0
            r1 = 14
            r5.A00 = r6
            r0 = 132968731(0x7ecf11b, float:3.5651042E-34)
            java.lang.Object r1 = X.C63623hv.A01(r3, r5, r0, r2, r1)
            if (r1 != r4) goto L_0x0022
            return r4
        L_0x005f:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = X.C86124wJ.A15(r7, r9, r6)
            goto L_0x0015
        L_0x0064:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A08(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r10)
            if (r0 == 0) goto L_0x0068
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r4) goto L_0x0080
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            X.3b6 r5 = (X.C62903b6) r5
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003d
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007b
            X.1jB r5 = (X.AnonymousClass1jB) r5
            java.lang.Object r1 = r5.A00
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x006d
            X.1jB r5 = A01(r1)
        L_0x003d:
            return r5
        L_0x003e:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r8.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "business/branded_content/create_brand_approval_request/"
            r2.A0J(r0)
            java.lang.Class<X.5tD> r1 = X.AnonymousClass5tD.class
            java.lang.Class<X.6ze> r0 = X.C118036ze.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "brand_igid"
            X.H8c r3 = X.C18200wM.A0T(r2, r0, r9)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 2124031084(0x7e9a246c, float:1.0244511E38)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0068:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r6 = X.C86124wJ.A15(r8, r10, r3)
            goto L_0x0015
        L_0x006d:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0076
            X.1jB r5 = X.C86164wN.A0R(r7)
            return r5
        L_0x0076:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A09(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(java.lang.String r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r9)
            if (r0 == 0) goto L_0x0073
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r4) goto L_0x007d
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x0078
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x002f:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x003c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x003b:
            return r1
        L_0x003c:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x003b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0045:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "business/branded_content/update_branded_content_opt_in_status/"
            r2.A0J(r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            r2.A0B(r1, r0)
            r0 = 447(0x1bf, float:6.26E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.H8c r3 = X.C18200wM.A0T(r2, r0, r8)
            r2 = 649201540(0x26b20784, float:1.2353268E-15)
            r1 = 0
            r0 = 14
            r5.A00 = r4
            java.lang.Object r1 = X.C63623hv.A01(r3, r5, r2, r1, r0)
            if (r1 != r6) goto L_0x0023
            return r6
        L_0x0073:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = X.C86124wJ.A15(r7, r9, r3)
            goto L_0x0015
        L_0x0078:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0A(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(X.C146958n9 r8) {
        /*
            r7 = this;
            r6 = 0
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r6, r8)
            if (r0 == 0) goto L_0x0055
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0055
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x005f
            X.AnonymousClass0OU.A00(r1)
        L_0x0023:
            r4 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x005a
            X.1jB r4 = X.AnonymousClass1jB.A01()
        L_0x0030:
            return r4
        L_0x0031:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_creator/"
            r2.A0J(r0)
            java.lang.Class<X.5tm> r1 = X.C94115tm.class
            java.lang.Class<X.6zj> r0 = X.C118086zj.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r5.A00 = r3
            r0 = 1900719496(0x714aad88, float:1.0036121E30)
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r0, r6, r1)
            if (r1 != r4) goto L_0x0023
            return r4
        L_0x0055:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = X.C86124wJ.A15(r7, r8, r6)
            goto L_0x0015
        L_0x005a:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0E(X.8n9):java.lang.Object");
    }

    public static AnonymousClass1jB A01(Object obj) {
        return new AnonymousClass1jB(new Integer(((C685344e) ((AnonymousClass1j9) obj).A00).mStatusCode));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r8 = this;
            r3 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r11)
            if (r0 == 0) goto L_0x007a
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r6) goto L_0x0084
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007f
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r8.A00
            r3 = 0
            X.H1T r7 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/bc_pending_tag_megaphone_for_brand/"
            r7.A0J(r0)
            java.lang.Class<X.9M7> r1 = X.AnonymousClass9M7.class
            java.lang.Class<X.6zk> r0 = X.C118096zk.class
            r7.A0B(r1, r0)
            r2 = 31
            r1 = 8
            r0 = 70
            java.lang.String r0 = X.AnonymousClass3Q7.A00(r2, r1, r0)
            r7.A0O(r0, r9)
            if (r10 == 0) goto L_0x0068
            java.lang.String r0 = "_"
            java.util.List r0 = X.C81074n3.A07(r10, r0, r3)
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = X.C18190wL.A0p(r0, r3)
            java.lang.String r0 = "media_id"
            r7.A0O(r0, r1)
        L_0x0068:
            X.H8c r2 = r7.A02()
            r1 = 14
            r4.A00 = r6
            r0 = 141471847(0x86eb067, float:7.182788E-34)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x007a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = X.C18240wQ.A0m(r8, r11, r3)
            goto L_0x0016
        L_0x007f:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A04(java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 45
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r10)
            if (r0 == 0) goto L_0x0069
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r4) goto L_0x0081
            X.AnonymousClass0OU.A00(r1)
        L_0x0025:
            r5 = r1
            X.3b6 r5 = (X.C62903b6) r5
            boolean r0 = r5 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x003e
            boolean r0 = r5 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007c
            X.1jB r5 = (X.AnonymousClass1jB) r5
            java.lang.Object r1 = r5.A00
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x006e
            X.1jB r5 = A01(r1)
        L_0x003e:
            return r5
        L_0x003f:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r8.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "business/branded_content/cancel_brand_approval_request_for_creator/"
            r2.A0J(r0)
            java.lang.Class<X.5tN> r1 = X.AnonymousClass5tN.class
            java.lang.Class<X.6zi> r0 = X.C118076zi.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "brand_igid"
            X.H8c r3 = X.C18200wM.A0T(r2, r0, r9)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 1367811425(0x51872561, float:7.2555962E10)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0025
            return r5
        L_0x0069:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = X.C18240wQ.A0m(r8, r10, r3)
            goto L_0x0016
        L_0x006e:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0077
            X.1jB r5 = X.C86164wN.A0R(r7)
            return r5
        L_0x0077:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007c:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0081:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A07(java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(java.util.List r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 49
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r9)
            if (r0 == 0) goto L_0x0078
            r4 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r6) goto L_0x0090
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x008b
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0032:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x007d
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5sc r0 = (X.AnonymousClass5sc) r0
            X.6d3 r0 = r0.A00
            if (r0 != 0) goto L_0x0086
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0045:
            X.AnonymousClass0OU.A00(r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r8)
            java.lang.String r3 = X.C18190wL.A0n(r0)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/get_organic_permission_with_brands/"
            r2.A0J(r0)
            java.lang.Class<X.5sc> r1 = X.AnonymousClass5sc.class
            java.lang.Class<X.6yD> r0 = X.C117146yD.class
            r2.A0B(r1, r0)
            java.lang.String r0 = "brand_ids"
            X.H8c r3 = X.C18200wM.A0T(r2, r0, r3)
            r2 = 0
            r1 = 14
            r4.A00 = r6
            r0 = 903993422(0x35e1d84e, float:1.6826759E-6)
            java.lang.Object r1 = X.C63623hv.A01(r3, r4, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0078:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r4 = X.C18240wQ.A0m(r7, r9, r3)
            goto L_0x0016
        L_0x007d:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x008a
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0086:
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x008a:
            return r1
        L_0x008b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0B(java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 46
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r8)
            if (r0 == 0) goto L_0x0057
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x0061
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            r5 = r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x005c
            X.1jB r5 = X.AnonymousClass1jB.A01()
        L_0x0031:
            return r5
        L_0x0032:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_sponsors/"
            r2.A0J(r0)
            java.lang.Class<X.5u7> r1 = X.AnonymousClass5u7.class
            java.lang.Class<X.6zf> r0 = X.C118046zf.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 1923560763(0x72a7353b, float:6.6237886E30)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0057:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = X.C18240wQ.A0m(r7, r8, r3)
            goto L_0x0016
        L_0x005c:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0C(X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C146958n9 r8) {
        /*
            r7 = this;
            r3 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r3, r8)
            if (r0 == 0) goto L_0x006a
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r4) goto L_0x0082
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x007d
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0032:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x006f
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.5t6 r0 = (X.AnonymousClass5t6) r0
            X.763 r0 = r0.A00
            if (r0 != 0) goto L_0x0078
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0045:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r0 = r7.A00
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_settings/"
            r2.A0J(r0)
            java.lang.Class<X.5t6> r1 = X.AnonymousClass5t6.class
            java.lang.Class<X.6yo> r0 = X.C117516yo.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r6.A00 = r4
            r0 = 2034397097(0x79426fa9, float:6.3098145E34)
            java.lang.Object r1 = X.C63623hv.A01(r3, r6, r0, r2, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x006a:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r6 = X.C18240wQ.A0m(r7, r8, r3)
            goto L_0x0016
        L_0x006f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x007c
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0078:
            X.1jA r1 = X.AnonymousClass1jA.A00(r0)
        L_0x007c:
            return r1
        L_0x007d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0D(X.8n9):java.lang.Object");
    }

    public static BrandedContentApi A00(Object obj, KtSLambdaShape16S0201000_I2_2 ktSLambdaShape16S0201000_I2_2) {
        AnonymousClass0OU.A00(obj);
        return new BrandedContentApi(((CR9) ktSLambdaShape16S0201000_I2_2.A02).A08());
    }
}
