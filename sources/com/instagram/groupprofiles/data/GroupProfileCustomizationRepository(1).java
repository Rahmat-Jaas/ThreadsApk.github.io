package com.instagram.groupprofiles.data;

import X.AnonymousClass2TZ;
import X.C134647y7;
import X.C18190wL;
import X.C27457Enn;
import X.C86074wE;
import X.C86094wG;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GroupProfileCustomizationRepository extends C134647y7 {
    public final UserSession A00;
    public final C86074wE A01;
    public final C86094wG A02;
    public final Context A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.gallery.GalleryItem r14, java.lang.String r15, X.C146958n9 r16) {
        /*
            r13 = this;
            r9 = r15
            r3 = 38
            r4 = r16
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r4)
            if (r0 == 0) goto L_0x006f
            r12 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r12 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x0019:
            java.lang.Object r11 = r12.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r12.A00
            r4 = 2
            r6 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r6) goto L_0x002c
            if (r0 != r4) goto L_0x0075
            X.AnonymousClass0OU.A00(r11)
        L_0x002b:
            return r11
        L_0x002c:
            java.lang.Object r9 = r12.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r12.A01
            com.instagram.groupprofiles.data.GroupProfileCustomizationRepository r0 = (com.instagram.groupprofiles.data.GroupProfileCustomizationRepository) r0
            X.AnonymousClass0OU.A00(r11)
            goto L_0x0058
        L_0x0038:
            X.AnonymousClass0OU.A00(r11)
            if (r14 == 0) goto L_0x007a
            com.instagram.common.gallery.Medium r0 = r14.A01
            if (r0 == 0) goto L_0x007a
            java.lang.String r3 = r0.A0T
            if (r3 == 0) goto L_0x007a
            com.instagram.groupprofiles.data.GroupProfileApiUtil r2 = com.instagram.groupprofiles.data.GroupProfileApiUtil.A00
            android.content.Context r1 = r13.A03
            com.instagram.service.session.UserSession r0 = r13.A00
            r12.A01 = r13
            r12.A02 = r15
            r12.A00 = r6
            java.lang.Object r11 = r2.A01(r1, r0, r3, r12)
            if (r11 == r5) goto L_0x006e
            r0 = r13
        L_0x0058:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x007a
            com.instagram.groupprofiles.data.GroupProfileApiUtil r6 = com.instagram.groupprofiles.data.GroupProfileApiUtil.A00
            com.instagram.service.session.UserSession r8 = r0.A00
            com.instagram.api.schemas.ProfileThemeType r7 = com.instagram.api.schemas.ProfileThemeType.CUSTOM_IMAGE
            r12.A01 = r10
            r12.A02 = r10
            r12.A00 = r4
            java.lang.Object r11 = r6.A02(r7, r8, r9, r10, r11, r12)
            if (r11 != r5) goto L_0x002b
        L_0x006e:
            return r5
        L_0x006f:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r12 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r12.<init>(r13, r4, r3)
            goto L_0x0019
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x007a:
            java.lang.Boolean r5 = X.C18180wK.A0X()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfileCustomizationRepository.A00(com.instagram.common.gallery.GalleryItem, java.lang.String, X.8n9):java.lang.Object");
    }

    public GroupProfileCustomizationRepository(UserSession userSession, Context context) {
        super("Profile", AnonymousClass2TZ.A00(2074567929));
        this.A00 = userSession;
        this.A03 = context;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape1S0200000_I2_1((Integer) null, (List) null, (DefaultConstructorMarker) null, 3, 21));
        this.A01 = A0z;
        this.A02 = A0z;
    }
}
