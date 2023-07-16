package com.instagram.release.buildinfo;

import X.AnonymousClass3WK;
import X.C04220Ms;
import X.C31580Grx;
import X.C67503zf;
import com.instagram.service.session.UserSession;

public final class BuildInfoApi {
    public final C67503zf A00;
    public final C31580Grx A01;

    public BuildInfoApi(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        C67503zf r2 = new C67503zf();
        C31580Grx A012 = AnonymousClass3WK.A01(userSession);
        C04220Ms.A0B(A012, 2);
        this.A00 = r2;
        this.A01 = A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r2 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C146958n9 r9) {
        /*
            r8 = this;
            r3 = 31
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r9)
            if (r0 == 0) goto L_0x00c6
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c6
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x00a4
            if (r0 != r4) goto L_0x00d4
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = X.C62903b6.A06(r1)
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            r5 = 0
            if (r2 == 0) goto L_0x0097
            java.lang.Class<com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl$XfbMobileBuildIosSelfUpdate> r1 = com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl.XfbMobileBuildIosSelfUpdate.class
            java.lang.String r0 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "build_number"
            int r4 = r1.getIntValue(r0)
        L_0x0043:
            java.lang.Class<com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl$XfbMobileBuildIosSelfUpdate> r1 = com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl.XfbMobileBuildIosSelfUpdate.class
            java.lang.String r0 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "publish_date"
            int r5 = r1.getIntValue(r0)
        L_0x0053:
            r3 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.Class<com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl$XfbMobileBuildIosSelfUpdate> r1 = com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl.XfbMobileBuildIosSelfUpdate.class
            java.lang.String r0 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "version_name"
            java.lang.String r3 = r1.getStringValue(r0)
        L_0x0066:
            java.lang.String r7 = ""
            if (r3 != 0) goto L_0x006b
            r3 = r7
        L_0x006b:
            if (r2 == 0) goto L_0x0080
            java.lang.Class<com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl$XfbMobileBuildIosSelfUpdate> r1 = com.instagram.graphql.instagramschema.MobileBuildIOSSelfUpdateQueryResponseImpl.XfbMobileBuildIosSelfUpdate.class
            java.lang.String r0 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0080
            java.lang.String r0 = "download_url"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x0080
            r7 = r0
        L_0x0080:
            r6 = 2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2
            r2.<init>(r3, r4, r5, r6, r7)
            X.1jA r1 = X.AnonymousClass1jA.A00(r2)
        L_0x008a:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0096
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00cf
            X.1jB r1 = X.AnonymousClass1jB.A01()
        L_0x0096:
            return r1
        L_0x0097:
            r4 = 0
            if (r2 == 0) goto L_0x0053
            goto L_0x0043
        L_0x009b:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x008a
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00a4:
            X.AnonymousClass0OU.A00(r1)
            X.3zf r3 = r8.A00
            java.lang.String r2 = "124024574287414"
            X.3zb r1 = r3.A00
            java.lang.String r0 = "app_id"
            r1.A05(r0, r2)
            r3.A02 = r4
            X.8mD r1 = r3.build()
            X.Grx r0 = r8.A01
            X.C04220Ms.A06(r1)
            r6.A00 = r4
            java.lang.Object r1 = r0.A06(r1, r6)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x00c6:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r6.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x00cf:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.buildinfo.BuildInfoApi.A00(X.8n9):java.lang.Object");
    }
}
