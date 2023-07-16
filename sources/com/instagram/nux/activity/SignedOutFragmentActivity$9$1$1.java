package com.instagram.nux.activity;

import X.C14260p5;
import X.C73194Rh;

public class SignedOutFragmentActivity$9$1$1 implements C14260p5 {
    public final /* synthetic */ C73194Rh A00;

    public SignedOutFragmentActivity$9$1$1(C73194Rh r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CMI(X.AnonymousClass060 r8, X.AnonymousClass066 r9) {
        /*
            r7 = this;
            X.060 r0 = X.AnonymousClass060.ON_RESUME
            if (r8 != r0) goto L_0x006c
            X.4Rh r2 = r7.A00
            X.1mc r1 = r2.A00
            com.instagram.nux.activity.SignedOutFragmentActivity r5 = r1.A01
            X.0pE r0 = r5.mLifecycleRegistry
            r0.A08(r7)
            android.os.Bundle r4 = r1.A00
            boolean r6 = r2.A01
            X.0m7 r0 = r5.getSupportFragmentManager()
            r3 = 2131302403(0x7f091803, float:1.8222891E38)
            androidx.fragment.app.Fragment r0 = r0.A0L(r3)
            if (r0 != 0) goto L_0x006c
            X.01J r2 = X.C18220wO.A0L(r5)
            android.os.Bundle r1 = X.C18190wL.A0C(r5)
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x007b
            X.0bf r0 = r5.A04
            boolean r0 = X.AnonymousClass3WW.A02(r0)
            if (r0 != 0) goto L_0x00f8
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r0 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            java.lang.String r5 = "reg_gdpr_entrance"
            if (r0 == r1) goto L_0x006d
            X.3YV r0 = X.AnonymousClass3YV.A00()
            java.lang.Integer r0 = r0.A01()
            if (r0 == r1) goto L_0x006d
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r4, r0)
            X.C63463hW.A01()
            X.C18190wL.A13(r4, r0)
            X.1cj r0 = new X.1cj
            r0.<init>()
        L_0x0060:
            r0.setArguments(r4)
            r2.A0D(r0, r3)
        L_0x0066:
            r2.A0K(r5)
        L_0x0069:
            r2.A00()
        L_0x006c:
            return
        L_0x006d:
            X.C63463hW.A03()
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r4, r0)
            X.1bG r0 = new X.1bG
            r0.<init>()
            goto L_0x0060
        L_0x007b:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0096
            X.C63463hW.A03()
            X.1d4 r1 = new X.1d4
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.AymhLoginLandingFragment"
        L_0x0092:
            r2.A0G(r1, r0, r3)
            goto L_0x0069
        L_0x0096:
            X.0bf r0 = r5.A04
            X.3hk r1 = X.C63533hk.A02(r0)
            X.0bf r0 = r5.A04
            java.util.List r0 = r1.A08(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00e8
            if (r6 == 0) goto L_0x00e8
            X.3FR r1 = r5.A01
            android.os.Bundle r0 = X.C18190wL.A0C(r5)
            java.util.List r0 = r1.A00(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e8
            boolean r0 = X.C63593hs.A05()
            if (r0 != 0) goto L_0x00dc
            r1 = 2130970427(0x7f04073b, float:1.7549564E38)
            r0 = 1
            boolean r0 = X.C121907Is.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x00dc
            X.C63463hW.A03()
            X.1bJ r1 = new X.1bJ
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.FacebookLandingFragment"
            goto L_0x0092
        L_0x00dc:
            X.C63463hW.A03()
            X.1ca r1 = X.C18250wR.A0O(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.LoginLandingFragment"
            goto L_0x0092
        L_0x00e8:
            X.C63463hW.A03()
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = new com.instagram.nux.fragment.OneTapLoginLandingFragment
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.nux.OneTapLoginLandingFragment"
            goto L_0x0092
        L_0x00f8:
            X.3VH r0 = X.AnonymousClass3VH.A00()
            java.lang.Integer r0 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            if (r0 == r1) goto L_0x011d
            X.3YV r0 = X.AnonymousClass3YV.A00()
            java.lang.Integer r0 = r0.A01()
            if (r0 == r1) goto L_0x011d
            X.1cm r1 = new X.1cm
            r1.<init>()
            r1.setArguments(r4)
            r5.A00 = r1
            java.lang.String r0 = "android.secondaryaccount.CreateUsernameFragment"
            r2.A0G(r1, r0, r3)
            goto L_0x0069
        L_0x011d:
            X.C63463hW.A03()
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r4, r0)
            X.1bG r0 = new X.1bG
            r0.<init>()
            r0.setArguments(r4)
            r2.A0D(r0, r3)
            java.lang.String r5 = "reg_gdpr_entrance"
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.activity.SignedOutFragmentActivity$9$1$1.CMI(X.060, X.066):void");
    }
}
