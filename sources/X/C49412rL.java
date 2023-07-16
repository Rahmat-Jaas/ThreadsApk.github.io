package X;

/* renamed from: X.2rL  reason: invalid class name and case insensitive filesystem */
public final class C49412rL {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        if (r3.A02 < r2) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass2AC r9, X.C61813Vs r10, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r11) {
        /*
            boolean r9 = X.C18240wQ.A1X(r9)
            java.lang.String r5 = r10.A02()
            X.25p r4 = X.C313425p.A0O
            java.lang.Enum r7 = com.facebook.graphql.enums.EnumHelper.A00(r5, r4)
            X.25p r7 = (X.C313425p) r7
            X.C04220Ms.A06(r7)
            X.16c r8 = r11.A00(r7)
            X.3Ee r6 = r11.A02
            int r0 = r8.A00
            int r3 = r0 + 1
            long r0 = X.C18180wK.A04()
            int r2 = (int) r0
            int r1 = r8.A01
            X.16c r0 = new X.16c
            r0.<init>(r1, r3, r2, r9)
            java.lang.String r2 = X.AnonymousClass3P4.A00(r0)
            android.content.SharedPreferences r0 = r6.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r7.toString()
            X.C18180wK.A0v(r1, r0, r2)
            boolean r0 = r10 instanceof X.C28881vi
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "BOTTOMSHEET_UNIFIED_STORIES_FEED"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "xpost_unified_onboarding_upsell_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            java.lang.String r0 = "xpost_unified_onboarding_upsell_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
        L_0x0056:
            int r2 = (int) r0
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0064
            int r0 = r3.A00
            if (r0 < r6) goto L_0x0064
            int r0 = r3.A02
            r7 = 1
            if (r0 >= r2) goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            int r0 = r3.A00
            int r6 = java.lang.Math.max(r0, r6)
            int r0 = r3.A02
            int r2 = java.lang.Math.max(r0, r2)
            int r0 = r3.A01
            X.16c r1 = new X.16c
            r1.<init>(r0, r6, r2, r7)
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r5, r4)
            X.25p r0 = (X.C313425p) r0
            X.C04220Ms.A06(r0)
            r11.A03(r0, r1)
            return
        L_0x0085:
            boolean r0 = r10 instanceof X.C28871vh
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "BOTTOMSHEET_XAR_REELS"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            X.3ZL r1 = X.AnonymousClass3Zu.A03(r0)
            boolean r0 = r1.A07()
            r6 = r0 ^ 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            android.content.SharedPreferences r1 = r1.A04
            java.lang.String r0 = "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS"
            long r0 = X.C18180wK.A05(r1, r0)
            long r0 = r2.toSeconds(r0)
            goto L_0x0056
        L_0x00aa:
            boolean r0 = r10 instanceof X.C28861vg
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "BOTTOMSHEET_CCP_REELS"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.AnonymousClass3Zu.A02(r0)
            java.lang.String r0 = "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT"
            int r6 = X.C18190wL.A04(r1, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r0 = "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS"
            long r0 = X.C18180wK.A05(r1, r0)
            long r0 = r2.toSeconds(r0)
            goto L_0x0056
        L_0x00cd:
            boolean r0 = r10 instanceof X.C28851vf
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = "BOTTOMSHEET_MIGRATION_STORIES_WAVE2"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "story_xpost_user_migration_upsell_second_wave_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            java.lang.String r0 = "story_xpost_user_migration_upsell_second_wave_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x00eb:
            boolean r0 = r10 instanceof X.C28841ve
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "BOTTOMSHEET_MIGRATION_STORIES_WAVE1"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "story_xpost_user_migration_upsell_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            java.lang.String r0 = "story_xpost_user_migration_upsell_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x0109:
            boolean r0 = r10 instanceof X.C28831vd
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "BOTTOMSHEET_MIGRATION_FEED_WAVE2"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "feed_xpost_user_migration_upsell_second_wave_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            java.lang.String r0 = "feed_xpost_user_migration_upsell_second_wave_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x0127:
            boolean r0 = r10 instanceof X.C28821vc
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "BOTTOMSHEET_MIGRATION_FEED_WAVE1"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r0 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            java.lang.String r0 = "feed_xpost_user_migration_upsell_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            java.lang.String r0 = "feed_xpost_user_migration_upsell_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x0145:
            boolean r0 = r10 instanceof X.C28811vb
            if (r0 == 0) goto L_0x0167
            java.lang.String r0 = "DIALOG_STORY"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r2 = r10.A00
            android.content.SharedPreferences r1 = X.C28161tl.A04(r2)
            java.lang.String r0 = "direct_sharesheet_auto_share_to_fb_dialog_display_count"
            int r6 = X.C18190wL.A04(r1, r0)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r2)
            java.lang.String r0 = "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x0167:
            boolean r0 = r10 instanceof X.C28801va
            if (r0 == 0) goto L_0x018a
            java.lang.String r0 = "DIALOG_FEED"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r7 = r10.A00
            r2 = 0
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "feed_fb_autoshare_upsell_dialog_display_count"
            int r6 = r1.getInt(r0, r2)
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "feed_fb_autoshare_upsell_dialog_last_seen_sec"
            long r0 = X.C18180wK.A05(r1, r0)
            goto L_0x0056
        L_0x018a:
            boolean r0 = r10 instanceof X.AnonymousClass1vZ
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "DIALOG_AFTERSHARE_STORY"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r7 = r10.A00
            r2 = 0
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "dialog_after_sharing_story_show_times"
            int r6 = r1.getInt(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "dialog_after_sharing_story_time_stamp"
            long r0 = X.C18180wK.A05(r1, r0)
            long r0 = r2.toSeconds(r0)
            goto L_0x0056
        L_0x01b3:
            java.lang.String r0 = "DIALOG_AFTERSHARE_FEED"
            X.16c r3 = X.C61813Vs.A00(r11, r0)
            com.instagram.service.session.UserSession r7 = r10.A00
            r2 = 0
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "dialog_after_sharing_feed_show_times"
            int r6 = r1.getInt(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            android.content.SharedPreferences r1 = X.C28161tl.A04(r7)
            java.lang.String r0 = "dialog_after_sharing_feed_time_stamp"
            long r0 = X.C18180wK.A05(r1, r0)
            long r0 = r2.toSeconds(r0)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49412rL.A00(X.2AC, X.3Vs, com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository):void");
    }
}
