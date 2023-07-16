package X;

/* renamed from: X.2KT  reason: invalid class name */
public final class AnonymousClass2KT {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C63873iU r5, X.C145538kf r6, com.instagram.model.business.BusinessInfo r7, com.instagram.service.session.UserSession r8) {
        /*
            r0 = 1
            X.C04220Ms.A0B(r8, r0)
            r3 = 0
            com.instagram.model.business.PublicPhoneContact r0 = r7.A01     // Catch:{ IOException -> 0x0018 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r2 = X.AnonymousClass2R3.A00(r0)     // Catch:{ IOException -> 0x0018 }
            goto L_0x000f
        L_0x000e:
            r2 = r3
        L_0x000f:
            com.instagram.model.business.Address r0 = r7.A00     // Catch:{ IOException -> 0x0019 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = X.AnonymousClass2R2.A00(r0)     // Catch:{ IOException -> 0x0019 }
            goto L_0x0020
        L_0x0018:
            r2 = r3
        L_0x0019:
            java.lang.String r1 = "EditProfessionalAccountContact"
            java.lang.String r0 = "Couldn't serialize edit business parameters"
            X.C10450iM.A03(r1, r0)
        L_0x0020:
            X.H1T r4 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.String r0 = "accounts/update_business_info/"
            X.C18220wO.A1J(r4, r0)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "public_email"
            r4.A0O(r0, r1)
            java.lang.String r0 = "public_phone_contact"
            r4.A0O(r0, r2)
            java.lang.String r0 = "business_address"
            r4.A0O(r0, r3)
            boolean r0 = r7.A0R
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            r1 = r2
            if (r0 == 0) goto L_0x0044
            r1 = r3
        L_0x0044:
            java.lang.String r0 = "should_show_public_contacts"
            r4.A0O(r0, r1)
            java.lang.String r1 = r7.A0J
            java.lang.String r0 = "page_id"
            r4.A0O(r0, r1)
            boolean r0 = r7.A0O
            r1 = r2
            if (r0 == 0) goto L_0x0056
            r1 = r3
        L_0x0056:
            java.lang.String r0 = "is_profile_audio_call_enabled"
            r4.A0O(r0, r1)
            boolean r0 = r7.A0M
            if (r0 != 0) goto L_0x0060
            r3 = r2
        L_0x0060:
            java.lang.String r0 = "is_call_to_action_enabled"
            X.H8c r0 = X.C18200wM.A0T(r4, r0, r3)
            r0.A00 = r5
            r6.schedule(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KT.A00(X.3iU, X.8kf, com.instagram.model.business.BusinessInfo, com.instagram.service.session.UserSession):void");
    }
}
