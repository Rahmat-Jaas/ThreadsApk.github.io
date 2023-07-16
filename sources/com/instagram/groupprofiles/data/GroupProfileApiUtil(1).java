package com.instagram.groupprofiles.data;

import X.AnonymousClass0wJ;
import X.AnonymousClass1SI;
import X.C32165H8c;
import X.C59803Ml;
import X.H1T;
import com.instagram.service.session.UserSession;

public final class GroupProfileApiUtil {
    public static final GroupProfileApiUtil A00 = new GroupProfileApiUtil();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(android.content.Context r11, com.instagram.service.session.UserSession r12, java.lang.String r13, X.C146958n9 r14) {
        /*
            r10 = this;
            r8 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3.A00(r8, r14)
            if (r0 == 0) goto L_0x0065
            r2 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0065
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r0 = r2.A02
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r2.A00
            r7 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 != r7) goto L_0x006b
            java.lang.Object r9 = r2.A01
            X.AnonymousClass0OU.A00(r0)
        L_0x0025:
            boolean r0 = r0 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x002a
            r9 = 0
        L_0x002a:
            return r9
        L_0x002b:
            X.AnonymousClass0OU.A00(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            r2.A01 = r6
            r2.A00 = r7
            r5 = 2074567929(0x7ba764f9, float:1.7383231E36)
            r4 = 0
            X.EnC r3 = X.C18220wO.A11(r2)
            X.C04220Ms.A0B(r11, r4)
            int r2 = X.C18200wM.A02(r7, r12, r13)
            X.4Ty r0 = new X.4Ty
            r0.<init>(r11, r12, r13, r6)
            X.H8a r1 = new X.H8a
            r1.<init>(r0, r5)
            com.instagram.common.task.IDxCallbackShape128S0100000_1_I2 r0 = new com.instagram.common.task.IDxCallbackShape128S0100000_1_I2
            r0.<init>(r3, r2)
            r1.A00 = r0
            X.C31155GhB.A05(r1, r5, r8, r7, r4)
            java.lang.Object r0 = r3.A0B()
            if (r0 == r9) goto L_0x002a
            r9 = r6
            goto L_0x0025
        L_0x0065:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3 r2 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0301000_I2_3
            r2.<init>(r10, r14, r8)
            goto L_0x0015
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A01(android.content.Context, com.instagram.service.session.UserSession, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.ProfileThemeType r8, com.instagram.service.session.UserSession r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.C146958n9 r13) {
        /*
            r7 = this;
            r3 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r13)
            if (r0 == 0) goto L_0x0061
            r4 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r6) goto L_0x0066
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "groups/%s/theme/set/"
            r2.A0T(r0, r1)
            java.lang.String r0 = "theme_id"
            r2.A0O(r0, r11)
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "theme_type"
            r2.A0O(r0, r1)
            java.lang.String r0 = "theme_image_upload_id"
            r2.A0O(r0, r12)
            X.H8c r2 = X.AnonymousClass0wJ.A0S(r2)
            r1 = 14
            r4.A00 = r6
            r0 = 2074567929(0x7ba764f9, float:1.7383231E36)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0061:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r4 = X.C18190wL.A0y(r7, r13, r3)
            goto L_0x0016
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A02(com.instagram.api.schemas.ProfileThemeType, com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.service.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.C146958n9 r13, boolean r14, boolean r15, boolean r16) {
        /*
            r7 = this;
            r3 = 44
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r13)
            if (r0 == 0) goto L_0x0072
            r5 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r4) goto L_0x0077
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "groups/%s/edit_profile/"
            r2.A0T(r0, r1)
            java.lang.String r0 = "name"
            r2.A0O(r0, r9)
            java.lang.String r0 = "biography"
            r2.A0O(r0, r11)
            java.lang.String r0 = "url"
            r2.A0O(r0, r12)
            java.lang.String r0 = "is_private"
            r2.A0R(r0, r14)
            java.lang.String r0 = "group_post_approvals_enabled"
            r2.A0R(r0, r15)
            java.lang.String r0 = "is_recommendable"
            r1 = r16
            r2.A0R(r0, r1)
            java.lang.Class<X.1R8> r1 = X.AnonymousClass1R8.class
            java.lang.Class<X.3KQ> r0 = X.AnonymousClass3KQ.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 1505392106(0x59ba75ea, float:6.5604992E15)
            r0 = 14
            r5.A00 = r4
            java.lang.Object r1 = X.C63623hv.A01(r2, r5, r1, r3, r0)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0072:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = X.C18190wL.A0y(r7, r13, r3)
            goto L_0x0016
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A03(com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.8n9, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.service.session.UserSession r8, java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r7 = this;
            r3 = 42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r11)
            if (r0 == 0) goto L_0x0057
            r5 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r4) goto L_0x005d
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.String r0 = "groups/change_profile_picture/"
            r2.A0J(r0)
            X.41X r1 = new X.41X
            r1.<init>(r9, r10)
            X.H1R r0 = r2.A04
            r0.A02 = r1
            java.lang.Class<X.1Rw> r1 = X.C21711Rw.class
            java.lang.Class<X.3Kl> r0 = X.C59343Kl.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r2 = 0
            r1 = 14
            r5.A00 = r4
            r0 = 1167005404(0x458f16dc, float:4578.8574)
            java.lang.Object r1 = X.C63623hv.A01(r3, r5, r0, r2, r1)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0057:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5
            r5.<init>(r7, r11, r3, r3)
            goto L_0x0016
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A04(com.instagram.service.session.UserSession, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.service.session.UserSession r8, java.lang.String r9, java.lang.String r10, X.C146958n9 r11) {
        /*
            r7 = this;
            r3 = 46
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r11)
            if (r0 == 0) goto L_0x004e
            r6 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r4) goto L_0x0053
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r10}
            java.lang.String r0 = "groups/%s/delete_member_invite/%s/"
            r2.A0T(r0, r1)
            X.H8c r2 = X.AnonymousClass0wJ.A0S(r2)
            r1 = 14
            r6.A00 = r4
            r0 = 1223410983(0x48ebc527, float:482857.22)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x004e:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r11, r3)
            goto L_0x0016
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A05(com.instagram.service.session.UserSession, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.instagram.service.session.UserSession r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 43
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r10)
            if (r0 == 0) goto L_0x0052
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r4) goto L_0x0057
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "groups/%s/delete/"
            r2.A0T(r0, r1)
            java.lang.Class<X.1Qn> r1 = X.C21391Qn.class
            java.lang.Class<X.3Jo> r0 = X.C59113Jo.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r6.A00 = r4
            r0 = 1053349905(0x3ec8d811, float:0.39227346)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0052:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r10, r3)
            goto L_0x0016
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A06(com.instagram.service.session.UserSession, java.lang.String, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.service.session.UserSession r8, java.lang.String r9, X.C146958n9 r10) {
        /*
            r7 = this;
            r3 = 45
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r10)
            if (r0 == 0) goto L_0x0052
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 != r4) goto L_0x0057
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002b:
            X.AnonymousClass0OU.A00(r1)
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "groups/%s/remove_profile_picture/"
            r2.A0T(r0, r1)
            java.lang.Class<X.1Rw> r1 = X.C21711Rw.class
            java.lang.Class<X.3Kl> r0 = X.C59343Kl.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 14
            r6.A00 = r4
            r0 = 1701660448(0x656d4720, float:7.0032055E22)
            java.lang.Object r1 = X.C63623hv.A01(r2, r6, r0, r3, r1)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x0052:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r6 = X.C18190wL.A0y(r7, r10, r3)
            goto L_0x0016
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileApiUtil.A07(com.instagram.service.session.UserSession, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final C32165H8c A00(UserSession userSession) {
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("groups/posting_destinations/");
        return AnonymousClass0wJ.A0T(A0P, AnonymousClass1SI.class, C59803Ml.class);
    }
}
