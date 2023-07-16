package X;

/* renamed from: X.3aG  reason: invalid class name and case insensitive filesystem */
public final class C62543aG {
    public final C144018hh A00;

    public static final C57943Dd A00(String str, boolean z) {
        int i;
        if (C04220Ms.A0I(str, "3pd_trial_control")) {
            i = 2131821215;
        } else if (C04220Ms.A0I(str, "3pd_trial_inline_opt_in")) {
            i = 2131821212;
            if (z) {
                i = 2131821213;
            }
        } else if (C04220Ms.A0I(str, "3pd_trial_go_to_settings")) {
            i = 2131821214;
        } else if (C04220Ms.A0I(str, "3pd_trial_decide")) {
            i = 2131821210;
            if (z) {
                i = 2131821211;
            }
        } else if (C04220Ms.A0I(str, "fewer_ads_test_group_content")) {
            i = 2131827470;
        } else if (C04220Ms.A0I(str, "fewer_ads_control_group_content")) {
            i = 2131827463;
        } else if (!C04220Ms.A0I(str, "activity_feed_notification_3PD_content")) {
            return AnonymousClass2LU.A00("");
        } else {
            i = 2131820969;
        }
        return AnonymousClass1kC.A00(new Object[0], i);
    }

    public static final C57943Dd A01(String str, boolean z) {
        int i;
        if (C04220Ms.A0I(str, "3pd_trial_control")) {
            i = 2131821222;
        } else if (C04220Ms.A0I(str, "3pd_trial_inline_opt_in")) {
            i = 2131821219;
            if (z) {
                i = 2131821220;
            }
        } else if (C04220Ms.A0I(str, "3pd_trial_go_to_settings")) {
            i = 2131821221;
        } else if (C04220Ms.A0I(str, "3pd_trial_decide")) {
            i = 2131821217;
            if (z) {
                i = 2131821218;
            }
        } else if (C04220Ms.A0I(str, "fewer_ads_test_group_content")) {
            i = 2131827471;
        } else if (C04220Ms.A0I(str, "fewer_ads_control_group_content")) {
            i = 2131827464;
        } else if (!C04220Ms.A0I(str, "activity_feed_notification_3PD_content")) {
            return AnonymousClass2LU.A00("");
        } else {
            i = 2131820971;
        }
        return AnonymousClass1kC.A00(new Object[0], i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r2 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A02(java.lang.String r1, boolean r2) {
        /*
            java.lang.String r0 = "3pd_trial_control"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x004a
        L_0x001a:
            r0 = 2131231943(0x7f0804c7, float:1.8079981E38)
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0022:
            java.lang.String r0 = "3pd_trial_decide"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0030
            r0 = 2131231903(0x7f08049f, float:1.80799E38)
            if (r2 == 0) goto L_0x001d
            goto L_0x001a
        L_0x0030:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x004a
            r0 = 0
            return r0
        L_0x004a:
            r0 = 2131231909(0x7f0804a5, float:1.8079912E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62543aG.A02(java.lang.String, boolean):java.lang.Integer");
    }

    public C62543aG(C144018hh r1) {
        this.A00 = r1;
    }
}
