package com.instagram.clips.viewer.recipesheet;

import X.AnonymousClass0wJ;
import X.AnonymousClass59H;
import X.AnonymousClass8v3;
import X.C83224qz;
import com.instagram.service.session.UserSession;

public final class RecipeSheetRemoteRelatedClipsDataSource extends AnonymousClass59H {
    public final AnonymousClass8v3 A00;
    public final C83224qz A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r9, java.lang.String r10, X.C146958n9 r11, X.AnonymousClass0YP r12) {
        /*
            r5 = 1
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r5, r11)
            if (r0 == 0) goto L_0x00c2
            r4 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c2
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            if (r0 == 0) goto L_0x007c
            if (r0 != r5) goto L_0x00ce
            java.lang.Object r12 = r4.A02
            X.0YP r12 = (X.AnonymousClass0YP) r12
            java.lang.Object r9 = r4.A01
            com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource r9 = (com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource) r9
            X.AnonymousClass0OU.A00(r1)
        L_0x002a:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0073
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r2 = r1.A00
            X.C2k r2 = (X.C21835C2k) r2
            java.lang.String r1 = r2.AxY()
            if (r1 == 0) goto L_0x0043
            java.util.List r0 = r2.AXq()
            r12.invoke(r1, r0)
        L_0x0043:
            boolean r0 = r2.BRb()
            if (r0 != 0) goto L_0x0054
            X.8v3 r0 = r9.A00
            X.4wE r1 = r0.A0B
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.CrC(r0)
        L_0x0054:
            X.1jA r1 = X.C62903b6.A03()
        L_0x0058:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0070
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00c9
            X.8v3 r2 = r9.A00
            X.4wE r1 = r2.A0B
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.CrC(r0)
            X.4wE r0 = r2.A0A
            X.C86074wE.A01(r0, r5)
        L_0x0070:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        L_0x0073:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x0058
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x007c:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r8 = r9.A02
            java.lang.String r1 = r9.A03
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            X.H1T r7 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.String r0 = "clips/recipe_sheet_clips/"
            r7.A0J(r0)
            r0 = 1009(0x3f1, float:1.414E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0P(r0, r1)
            java.lang.String r0 = "max_id"
            r7.A0P(r0, r10)
            java.lang.Class<X.Aim> r2 = X.C18633Aim.class
            X.0Ou r1 = new X.0Ou
            r1.<init>(r8)
            X.CY0 r0 = new X.CY0
            r0.<init>(r1, r2)
            r7.A01 = r0
            X.H8c r2 = r7.A02()
            r1 = 14
            r4.A01 = r9
            r4.A02 = r12
            r4.A00 = r5
            r0 = 770071300(0x2de65b04, float:2.6188392E-11)
            java.lang.Object r1 = X.C63623hv.A01(r2, r4, r0, r3, r1)
            if (r1 != r6) goto L_0x002a
            return r6
        L_0x00c2:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r4.<init>(r9, r11, r5)
            goto L_0x0015
        L_0x00c9:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource.A00(com.instagram.clips.viewer.recipesheet.RecipeSheetRemoteRelatedClipsDataSource, java.lang.String, X.8n9, X.0YP):java.lang.Object");
    }

    public RecipeSheetRemoteRelatedClipsDataSource(AnonymousClass8v3 r1, UserSession userSession, String str, C83224qz r4) {
        AnonymousClass0wJ.A1R(r4, r1);
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = r4;
        this.A00 = r1;
    }
}
