package X;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.service.session.UserSession;

/* renamed from: X.3iS  reason: invalid class name and case insensitive filesystem */
public final class C63853iS {
    public static final AnonymousClass3EJ A00 = new AnonymousClass3EJ(new AnonymousClass439());

    public static void A0A(NotificationManager notificationManager, Context context, boolean z) {
        NotificationManager notificationManager2 = notificationManager;
        if (z && C09650fs.A04(context)) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("IG", context.getString(2131831908)));
        }
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, "ig_posting_status", "IG", context.getResources().getString(2131831901), 2, 0, 1, true, true);
    }

    public static String A00(Context context, C10300i6 r6) {
        if (context == null || r6 == null) {
            return "ig_live_videos";
        }
        try {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, r6, 36320575622289484L);
            if (A0E != C18180wK.A1Z(AnonymousClass3Zd.A01(context, "ig_heads_up_live_videos", false), Boolean.TRUE)) {
                NotificationManager A03 = C18250wR.A03(context);
                AnonymousClass7Ko.A07(A03, "NotificationManager should never be null");
                A09(A03, context, A0E);
            }
            return !A0E ? "ig_live_videos" : "ig_heads_up_live_videos";
        } catch (Exception unused) {
            return "ig_live_videos";
        }
    }

    public static String A01(Context context, C10300i6 r6) {
        if (context == null || r6 == null) {
            return "ig_comments";
        }
        try {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, r6, 36320575622223947L);
            if (A0E != C18180wK.A1Z(AnonymousClass3Zd.A01(context, "ig_heads_up_comments", false), Boolean.TRUE)) {
                NotificationManager A03 = C18250wR.A03(context);
                AnonymousClass7Ko.A07(A03, "NotificationManager should never be null");
                A08(A03, context, A0E);
            }
            return !A0E ? "ig_comments" : "ig_heads_up_comments";
        } catch (Exception unused) {
            return "ig_comments";
        }
    }

    public static String A02(Context context, C10300i6 r6) {
        if (!(context == null || r6 == null)) {
            try {
                NotificationManager A03 = C18250wR.A03(context);
                if (A03 != null) {
                    C29841zO A002 = AnonymousClass2LV.A00(context, r6);
                    String str = A002.A02;
                    if (AnonymousClass3Zd.A00(context, str) == null) {
                        A06(A03, context, A002);
                    }
                    return str;
                }
            } catch (Exception e) {
                C10450iM.A00().CuY("NotificationChannelsHelper", "NotificationChannelsHelper#remindersChannelIdBasedOnAlertingLevelQE failed", e);
                return "ig_reminders";
            }
        }
        return "ig_reminders";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if ((r6 instanceof com.instagram.service.session.UserSession) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0164, code lost:
        if (X.AnonymousClass0wJ.A1U(r3) != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01cf, code lost:
        if (r1 != false) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(android.app.NotificationManager r15, android.content.Context r16, X.C10300i6 r17) {
        /*
            java.lang.String r1 = "Unable to get notification channels"
            java.util.List r12 = r15.getNotificationChannels()     // Catch:{ Exception -> 0x0213 }
            if (r12 == 0) goto L_0x0218
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0218
            java.lang.String r1 = "NotificationChannelsHelper"
            X.0rm r0 = new X.0rm
            r0.<init>(r1)
            X.3EJ r9 = new X.3EJ
            r9.<init>(r0)
            X.3SB r0 = X.AnonymousClass3SB.A01
            r1 = r16
            if (r0 != 0) goto L_0x0027
            X.3SB r0 = new X.3SB
            r0.<init>(r1)
            X.AnonymousClass3SB.A01 = r0
        L_0x0027:
            boolean r4 = X.C09660ft.A01(r1)
            android.content.SharedPreferences r7 = r0.A00
            java.lang.String r3 = "NOTIFICATIONS_ARE_ENABLED"
            r0 = 1
            boolean r8 = r7.getBoolean(r3, r0)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "LAST_FULL_LOGGING_TS_FOR_"
            r6 = r17
            java.lang.String r0 = r6.getToken()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r5, r0)
            long r0 = X.C18180wK.A05(r7, r0)
            long r10 = r10 - r0
            long r1 = X.AnonymousClass3SB.A02
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            boolean r0 = r6 instanceof com.instagram.service.session.UserSession
            r17 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0055:
            r17 = 0
        L_0x0057:
            if (r4 != r8) goto L_0x005b
            if (r17 == 0) goto L_0x0069
        L_0x005b:
            if (r4 == 0) goto L_0x01f9
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x005f:
            r9.A00(r6, r0)
            android.content.SharedPreferences$Editor r0 = r7.edit()
            X.AnonymousClass0wJ.A13(r0, r3, r4)
        L_0x0069:
            java.util.Iterator r16 = r12.iterator()
        L_0x006d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r8 = r16.next()
            android.app.NotificationChannel r8 = (android.app.NotificationChannel) r8
            java.lang.String r14 = r8.getId()
            java.lang.String r4 = "_IS_ENABLED"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r4)
            boolean r1 = X.C18190wL.A1X(r7, r0)
            r2 = 0
            int r0 = r8.getImportance()
            if (r0 == 0) goto L_0x008f
            r2 = 1
        L_0x008f:
            if (r17 != 0) goto L_0x01d5
            if (r1 != r2) goto L_0x01d5
            java.lang.String r0 = "_IMPORTANCE"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r14, r0)
            r0 = 3
            int r1 = r7.getInt(r1, r0)
            java.lang.String r0 = "_SHOULD_SHOW_LIGHT"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r0)
            r2 = 0
            boolean r13 = r7.getBoolean(r0, r2)
            java.lang.String r0 = "_SHOULD_VIBRATE"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r0)
            boolean r12 = r7.getBoolean(r0, r2)
            java.lang.String r0 = "_LOCKSCREEN_VISIBILITY"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r0)
            r10 = 1
            int r2 = r7.getInt(r0, r10)
            java.lang.String r0 = "_SOUND"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r0)
            java.lang.String r11 = X.C18200wM.A0h(r7, r0)
            X.3EJ r0 = A00
            X.0kW r0 = r0.A00
            X.0nS r3 = X.C13330nS.A01(r0, r6)
            java.lang.String r0 = "notification_channel_settings_changed"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 2440(0x988, float:3.419E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            java.lang.String r0 = "channel_id"
            r3.A0T(r0, r14)
            int r0 = r8.getImportance()
            if (r1 == r0) goto L_0x01d2
            int r15 = r8.getImportance()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "old_importance"
            X.0A2 r14 = r3.A00
            r14.A6J(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.String r0 = "new_importance"
            r14.A6J(r0, r1)
            r1 = 1
        L_0x0100:
            boolean r0 = r8.shouldShowLights()
            if (r13 == r0) goto L_0x0114
            boolean r0 = r8.shouldShowLights()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "should_show_light"
            r3.A0Q(r0, r1)
            r1 = 1
        L_0x0114:
            boolean r0 = r8.shouldVibrate()
            if (r12 == r0) goto L_0x0128
            boolean r0 = r8.shouldVibrate()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "should_vibrate"
            r3.A0Q(r0, r1)
            r1 = 1
        L_0x0128:
            int r0 = r8.getLockscreenVisibility()
            if (r2 == r0) goto L_0x0147
            int r12 = r8.getLockscreenVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "old_lockscreen_visibility"
            X.0A2 r2 = r3.A00
            r2.A6J(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "new_lockscreen_visibility"
            r2.A6J(r0, r1)
            r1 = 1
        L_0x0147:
            android.net.Uri r0 = r8.getSound()
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.equals(r11, r0)
            if (r0 != 0) goto L_0x01cf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "sound_changed"
            r3.A0Q(r0, r1)
        L_0x0160:
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0169
        L_0x0166:
            r3.Bb4()
        L_0x0169:
            android.content.SharedPreferences$Editor r2 = r7.edit()
            java.lang.String r3 = r8.getId()
            java.lang.String r4 = X.AnonymousClass00U.A0L(r3, r4)
            r1 = 0
            int r0 = r8.getImportance()
            if (r0 == 0) goto L_0x017d
            r1 = 1
        L_0x017d:
            r2.putBoolean(r4, r1)
            java.lang.String r0 = "_IMPORTANCE"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r3, r0)
            int r0 = r8.getImportance()
            r2.putInt(r1, r0)
            java.lang.String r0 = "_SHOULD_SHOW_LIGHT"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r3, r0)
            boolean r0 = r8.shouldShowLights()
            r2.putBoolean(r1, r0)
            java.lang.String r0 = "_SHOULD_VIBRATE"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r3, r0)
            boolean r0 = r8.shouldVibrate()
            r2.putBoolean(r1, r0)
            java.lang.String r0 = "_LOCKSCREEN_VISIBILITY"
            java.lang.String r1 = X.AnonymousClass00U.A0L(r3, r0)
            int r0 = r8.getLockscreenVisibility()
            r2.putInt(r1, r0)
            android.net.Uri r0 = r8.getSound()
            if (r0 == 0) goto L_0x01cc
            java.lang.String r1 = r0.toString()
        L_0x01be:
            java.lang.String r0 = "_SOUND"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r3, r0)
            r2.putString(r0, r1)
            r2.apply()
            goto L_0x006d
        L_0x01cc:
            java.lang.String r1 = ""
            goto L_0x01be
        L_0x01cf:
            if (r1 == 0) goto L_0x0169
            goto L_0x0160
        L_0x01d2:
            r1 = 0
            goto L_0x0100
        L_0x01d5:
            X.0kW r0 = r9.A00
            X.0nS r1 = X.C13330nS.A01(r0, r6)
            if (r2 == 0) goto L_0x01f0
            java.lang.String r0 = "notification_channel_enabled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2439(0x987, float:3.418E-42)
        L_0x01e5:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "channel_id"
            r3.A0T(r0, r14)
            goto L_0x0166
        L_0x01f0:
            java.lang.String r0 = "notification_channel_disabled"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2438(0x986, float:3.416E-42)
            goto L_0x01e5
        L_0x01f9:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x005f
        L_0x01fd:
            if (r17 == 0) goto L_0x0212
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = r7.edit()
            java.lang.String r0 = r6.getToken()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r5, r0)
            X.AnonymousClass0wJ.A12(r1, r0, r2)
        L_0x0212:
            return
        L_0x0213:
            java.lang.String r0 = "NotificationChannelsHelper"
            X.C10450iM.A03(r0, r1)
        L_0x0218:
            java.lang.String r0 = "NotificationChannelsHelper"
            X.C10450iM.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63853iS.A07(android.app.NotificationManager, android.content.Context, X.0i6):void");
    }

    public static void A08(NotificationManager notificationManager, Context context, boolean z) {
        String str = "ig_comments";
        String str2 = "ig_heads_up_comments";
        if (z) {
            str2 = str;
        }
        NotificationManager notificationManager2 = notificationManager;
        AnonymousClass3Zd.A03(notificationManager, str2);
        if (z) {
            str = "ig_heads_up_comments";
        }
        String string = context.getResources().getString(2131831886);
        int i = 3;
        if (z) {
            i = 4;
        }
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, str, "IG", string, i, 0, 1, false, true);
    }

    public static void A09(NotificationManager notificationManager, Context context, boolean z) {
        String str = "ig_live_videos";
        String str2 = "ig_heads_up_live_videos";
        if (z) {
            str2 = str;
        }
        NotificationManager notificationManager2 = notificationManager;
        AnonymousClass3Zd.A03(notificationManager, str2);
        if (z) {
            str = "ig_heads_up_live_videos";
        }
        String string = context.getResources().getString(2131831896);
        int i = 3;
        if (z) {
            i = 4;
        }
        AnonymousClass3Zd.A02(notificationManager2, (Uri) null, str, "IG", string, i, 0, 1, false, true);
    }

    public static void A0B(Context context) {
        Intent A05 = C18250wR.A05("android.settings.APP_NOTIFICATION_SETTINGS");
        A05.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C16420t2.A00().A09().A09(context, A05);
    }

    public static void A0C(Context context, C10300i6 r5) {
        Integer num;
        AnonymousClass3SB r3 = AnonymousClass3SB.A01;
        if (r3 == null) {
            r3 = new AnonymousClass3SB(context);
            AnonymousClass3SB.A01 = r3;
        }
        boolean A01 = C09660ft.A01(context);
        AnonymousClass3EJ r1 = A00;
        if (A01) {
            num = AnonymousClass006.A00;
        } else {
            num = AnonymousClass006.A01;
        }
        r1.A00(r5, num);
        AnonymousClass0wJ.A13(r3.A00.edit(), "NOTIFICATIONS_ARE_ENABLED", A01);
    }

    public static void A0D(Context context, C10300i6 r2, boolean z) {
        if (z) {
            A0C(context, r2);
        }
        NotificationManager A03 = C18250wR.A03(context);
        if (A03 == null) {
            C10450iM.A03("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
        } else {
            A07(A03, context, r2);
        }
    }

    public static void A0E(Context context, String str) {
        Intent A05 = C18250wR.A05("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        A05.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        A05.putExtra("android.provider.extra.CHANNEL_ID", str);
        C16420t2.A00().A09().A09(context, A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if ((r7 instanceof com.instagram.service.session.UserSession) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F(android.content.Context r6, X.C10300i6 r7) {
        /*
            X.3SB r0 = X.AnonymousClass3SB.A01
            if (r0 != 0) goto L_0x000b
            X.3SB r0 = new X.3SB
            r0.<init>(r6)
            X.AnonymousClass3SB.A01 = r0
        L_0x000b:
            boolean r6 = X.C09660ft.A01(r6)
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "NOTIFICATIONS_ARE_ENABLED"
            r0 = 1
            boolean r5 = r2.getBoolean(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "LAST_FULL_LOGGING_TS_FOR_"
            java.lang.String r0 = r7.getToken()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            long r0 = X.C18180wK.A05(r2, r0)
            long r3 = r3 - r0
            long r1 = X.AnonymousClass3SB.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            boolean r0 = r7 instanceof com.instagram.service.session.UserSession
            r1 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            r0 = 1
            if (r6 != r5) goto L_0x003d
            if (r1 != 0) goto L_0x003d
            r0 = 0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63853iS.A0F(android.content.Context, X.0i6):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        r2 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(android.content.Context r4, X.C10300i6 r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r2 = A03(r4, r5, r7)
            java.lang.String r1 = "ig_other"
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0156
            if (r8 == 0) goto L_0x001d
            r3 = -1
            int r0 = r8.hashCode()
            java.lang.String r2 = "ig_shopping_drops"
            switch(r0) {
                case -2112036847: goto L_0x0085;
                case -2087444809: goto L_0x0090;
                case -1372693202: goto L_0x009c;
                case -971609053: goto L_0x00a8;
                case -393940263: goto L_0x00b3;
                case -307187846: goto L_0x00bf;
                case -147112977: goto L_0x00cb;
                case 3321751: goto L_0x00d6;
                case 3446944: goto L_0x00e1;
                case 557357479: goto L_0x00ed;
                case 835198941: goto L_0x00f9;
                case 950398559: goto L_0x0104;
                case 1227036430: goto L_0x010f;
                case 1271059305: goto L_0x0118;
                case 1316977209: goto L_0x0123;
                case 1544803905: goto L_0x012f;
                case 1981798234: goto L_0x013b;
                case 2026707488: goto L_0x014a;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = "ig_direct_video_chat"
            switch(r3) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0083;
                case 2: goto L_0x0083;
                case 3: goto L_0x001e;
                case 4: goto L_0x0068;
                case 5: goto L_0x006b;
                case 6: goto L_0x0070;
                case 7: goto L_0x0073;
                case 8: goto L_0x0076;
                case 9: goto L_0x0079;
                case 10: goto L_0x007c;
                case 11: goto L_0x007c;
                case 12: goto L_0x0081;
                default: goto L_0x001d;
            }
        L_0x001d:
            r2 = r1
        L_0x001e:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0156
            if (r6 == 0) goto L_0x002f
            int r0 = r6.hashCode()
            java.lang.String r2 = "ig_shopping_drops"
            switch(r0) {
                case -1331586071: goto L_0x0030;
                case -1190461686: goto L_0x003b;
                case -971609053: goto L_0x0048;
                case -942901024: goto L_0x0053;
                case 1227036430: goto L_0x005e;
                default: goto L_0x002f;
            }
        L_0x002f:
            return r1
        L_0x0030:
            java.lang.String r0 = "direct"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "ig_direct"
            return r2
        L_0x003b:
            java.lang.String r0 = "iglive"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = A00(r4, r5)
            return r2
        L_0x0048:
            java.lang.String r0 = "video_call_incoming"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "ig_direct_video_chat"
            return r2
        L_0x0053:
            java.lang.String r0 = "ROLL_CALL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "ig_alerts"
            return r2
        L_0x005e:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x0065:
            java.lang.String r0 = "ig_direct"
            goto L_0x0083
        L_0x0068:
            java.lang.String r0 = "ig_likes"
            goto L_0x0083
        L_0x006b:
            java.lang.String r0 = A01(r4, r5)
            goto L_0x0083
        L_0x0070:
            java.lang.String r0 = "ig_friends_on_instagram"
            goto L_0x0083
        L_0x0073:
            java.lang.String r0 = "ig_photos_of_you"
            goto L_0x0083
        L_0x0076:
            java.lang.String r0 = "ig_first_posts_and_stories"
            goto L_0x0083
        L_0x0079:
            java.lang.String r0 = "ig_private_user_follow_request"
            goto L_0x0083
        L_0x007c:
            java.lang.String r0 = A00(r4, r5)
            goto L_0x0083
        L_0x0081:
            java.lang.String r0 = "ig_alerts"
        L_0x0083:
            r2 = r0
            goto L_0x001e
        L_0x0085:
            java.lang.String r0 = "rollcall_story"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 12
            goto L_0x0018
        L_0x0090:
            java.lang.String r0 = "live_broadcast_revoke"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 11
            goto L_0x0018
        L_0x009c:
            java.lang.String r0 = "live_broadcast"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 10
            goto L_0x0018
        L_0x00a8:
            java.lang.String r0 = "video_call_incoming"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0018
        L_0x00b3:
            java.lang.String r0 = "popular"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 14
            goto L_0x0018
        L_0x00bf:
            java.lang.String r0 = "gdpr_consent"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 16
            goto L_0x0018
        L_0x00cb:
            java.lang.String r0 = "usertag"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 7
            goto L_0x0018
        L_0x00d6:
            java.lang.String r0 = "like"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 4
            goto L_0x0018
        L_0x00e1:
            java.lang.String r0 = "post"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 8
            goto L_0x0018
        L_0x00ed:
            java.lang.String r0 = "underage_appeal"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 15
            goto L_0x0018
        L_0x00f9:
            java.lang.String r0 = "video_call_ended"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 2
            goto L_0x0018
        L_0x0104:
            java.lang.String r0 = "comment"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 5
            goto L_0x0018
        L_0x010f:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0018
            r3 = 3
            goto L_0x0018
        L_0x0118:
            java.lang.String r0 = "contactjoined"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 6
            goto L_0x0018
        L_0x0123:
            java.lang.String r0 = "private_user_follow_request"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 9
            goto L_0x0018
        L_0x012f:
            java.lang.String r0 = "default"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 17
            goto L_0x0018
        L_0x013b:
            r0 = 525(0x20d, float:7.36E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 0
            goto L_0x0018
        L_0x014a:
            java.lang.String r0 = "explore_hashtag"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 13
            goto L_0x0018
        L_0x0156:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63853iS.A04(android.content.Context, X.0i6, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A05(Context context, UserSession userSession, String str) {
        switch (str.hashCode()) {
            case -1660159711:
                if (str.equals("tagged_in_bio")) {
                    return "ig_mentions_in_bio";
                }
                return "";
            case -1618365534:
                if (str.equals("video_call")) {
                    return "ig_direct_video_chat";
                }
                return "";
            case -1534353675:
                if (str.equals("view_count")) {
                    return "ig_view_counts";
                }
                return "";
            case -1461524499:
                if (str.equals("notification_reminders")) {
                    return A02(context, userSession);
                }
                return "";
            case -1372693202:
                if (str.equals("live_broadcast")) {
                    return A00(context, userSession);
                }
                return "";
            case -1307214883:
                if (str.equals("new_follower")) {
                    return "ig_new_followers";
                }
                return "";
            case -1112862244:
                if (str.equals("comment_likes")) {
                    return "ig_comment_likes";
                }
                return "";
            case -602415628:
                if (str.equals("comments")) {
                    return A01(context, userSession);
                }
                return "";
            case -562217912:
                if (str.equals("contact_joined")) {
                    return "ig_friends_on_instagram";
                }
                return "";
            case -160912177:
                if (str.equals("first_post")) {
                    return "ig_first_posts_and_stories";
                }
                return "";
            case -139282336:
                if (str.equals("user_tagged")) {
                    return "ig_photos_of_you";
                }
                return "";
            case 102974396:
                if (str.equals("likes")) {
                    return "ig_likes";
                }
                return "";
            case 106069776:
                if (str.equals("other")) {
                    return "ig_other";
                }
                return "";
            case 295987376:
                if (str.equals("report_updated")) {
                    return "ig_support_requests";
                }
                return "";
            case 536242609:
                if (str.equals("pending_direct_share")) {
                    return "ig_direct_requests";
                }
                return "";
            case 565271564:
                if (str.equals("announcements")) {
                    return "ig_product_announcements";
                }
                return "";
            case 639774245:
                if (str.equals("follow_request_accepted")) {
                    return "ig_private_user_follow_request";
                }
                return "";
            case 718888547:
                if (str.equals("like_and_comment_on_photo_user_tagged")) {
                    return "ig_likes_and_comments_on_photos_of_you";
                }
                return "";
            case 1134925464:
                if (str.equals("felix_upload_result")) {
                    return "ig_igtv_video_updates";
                }
                return "";
            case 1752343173:
                if (str.equals("direct_share_activity")) {
                    return "ig_direct";
                }
                return "";
            default:
                return "";
        }
    }

    public static void A06(NotificationManager notificationManager, Context context, C29841zO r13) {
        C29841zO[] values = C29841zO.values();
        int length = values.length;
        int i = 0;
        while (true) {
            NotificationManager notificationManager2 = notificationManager;
            if (i < length) {
                C29841zO r0 = values[i];
                if (r0 != r13) {
                    AnonymousClass3Zd.A03(notificationManager, r0.A02);
                }
                i++;
            } else {
                AnonymousClass3Zd.A02(notificationManager2, r13.A01, r13.A02, "IG", context.getResources().getString(2131831903), r13.A00, 0, 1, r13.A03, true);
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v36 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r9v38 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r9v40 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r9v45 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r9v47 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r9v49 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r9v53 */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r9v55 */
    /* JADX WARNING: type inference failed for: r9v56 */
    /* JADX WARNING: type inference failed for: r9v57 */
    /* JADX WARNING: type inference failed for: r9v58 */
    /* JADX WARNING: type inference failed for: r9v59 */
    /* JADX WARNING: type inference failed for: r9v60 */
    /* JADX WARNING: type inference failed for: r9v61 */
    /* JADX WARNING: type inference failed for: r9v62 */
    /* JADX WARNING: type inference failed for: r9v63 */
    /* JADX WARNING: type inference failed for: r9v64 */
    /* JADX WARNING: type inference failed for: r9v65 */
    /* JADX WARNING: type inference failed for: r9v66 */
    /* JADX WARNING: type inference failed for: r9v67 */
    /* JADX WARNING: type inference failed for: r9v68 */
    /* JADX WARNING: type inference failed for: r9v69 */
    /* JADX WARNING: type inference failed for: r9v70 */
    /* JADX WARNING: type inference failed for: r9v71 */
    /* JADX WARNING: type inference failed for: r9v72 */
    /* JADX WARNING: type inference failed for: r9v73 */
    /* JADX WARNING: type inference failed for: r9v74 */
    /* JADX WARNING: type inference failed for: r9v75 */
    /* JADX WARNING: type inference failed for: r9v76 */
    /* JADX WARNING: type inference failed for: r9v77 */
    /* JADX WARNING: type inference failed for: r9v78 */
    /* JADX WARNING: type inference failed for: r9v79 */
    /* JADX WARNING: type inference failed for: r9v80 */
    /* JADX WARNING: type inference failed for: r9v81 */
    /* JADX WARNING: type inference failed for: r9v82 */
    /* JADX WARNING: type inference failed for: r9v83 */
    /* JADX WARNING: type inference failed for: r9v84 */
    /* JADX WARNING: type inference failed for: r9v85 */
    /* JADX WARNING: type inference failed for: r9v86 */
    /* JADX WARNING: type inference failed for: r9v87 */
    /* JADX WARNING: type inference failed for: r9v88 */
    /* JADX WARNING: type inference failed for: r9v89 */
    /* JADX WARNING: type inference failed for: r9v90 */
    /* JADX WARNING: type inference failed for: r9v91 */
    /* JADX WARNING: type inference failed for: r9v92 */
    /* JADX WARNING: type inference failed for: r9v93 */
    /* JADX WARNING: type inference failed for: r9v94 */
    /* JADX WARNING: type inference failed for: r9v95 */
    /* JADX WARNING: type inference failed for: r9v96 */
    /* JADX WARNING: type inference failed for: r9v97 */
    /* JADX WARNING: type inference failed for: r9v98 */
    /* JADX WARNING: type inference failed for: r9v99 */
    /* JADX WARNING: type inference failed for: r9v100 */
    /* JADX WARNING: type inference failed for: r9v101 */
    /* JADX WARNING: type inference failed for: r9v102 */
    /* JADX WARNING: type inference failed for: r9v103 */
    /* JADX WARNING: type inference failed for: r9v104 */
    /* JADX WARNING: type inference failed for: r9v105 */
    /* JADX WARNING: type inference failed for: r9v106 */
    /* JADX WARNING: type inference failed for: r9v107 */
    /* JADX WARNING: type inference failed for: r9v108 */
    /* JADX WARNING: type inference failed for: r9v109 */
    /* JADX WARNING: type inference failed for: r9v110 */
    /* JADX WARNING: type inference failed for: r9v111 */
    /* JADX WARNING: type inference failed for: r9v112 */
    /* JADX WARNING: type inference failed for: r9v113 */
    /* JADX WARNING: type inference failed for: r9v114 */
    /* JADX WARNING: type inference failed for: r9v115 */
    /* JADX WARNING: type inference failed for: r9v116 */
    /* JADX WARNING: type inference failed for: r9v117 */
    /* JADX WARNING: type inference failed for: r9v118 */
    /* JADX WARNING: type inference failed for: r9v119 */
    /* JADX WARNING: type inference failed for: r9v120 */
    /* JADX WARNING: type inference failed for: r9v121 */
    /* JADX WARNING: type inference failed for: r9v122 */
    /* JADX WARNING: type inference failed for: r9v123 */
    /* JADX WARNING: type inference failed for: r9v124 */
    /* JADX WARNING: type inference failed for: r9v125 */
    /* JADX WARNING: type inference failed for: r9v126 */
    /* JADX WARNING: type inference failed for: r9v127 */
    /* JADX WARNING: type inference failed for: r9v128 */
    /* JADX WARNING: type inference failed for: r9v129 */
    /* JADX WARNING: type inference failed for: r9v130 */
    /* JADX WARNING: type inference failed for: r9v131 */
    /* JADX WARNING: type inference failed for: r9v132 */
    /* JADX WARNING: type inference failed for: r9v133 */
    /* JADX WARNING: type inference failed for: r9v134 */
    /* JADX WARNING: type inference failed for: r9v135 */
    /* JADX WARNING: type inference failed for: r9v136 */
    /* JADX WARNING: type inference failed for: r9v137 */
    /* JADX WARNING: type inference failed for: r9v138 */
    /* JADX WARNING: type inference failed for: r9v139 */
    /* JADX WARNING: type inference failed for: r9v140 */
    /* JADX WARNING: type inference failed for: r9v141 */
    /* JADX WARNING: type inference failed for: r9v142 */
    /* JADX WARNING: type inference failed for: r9v143 */
    /* JADX WARNING: type inference failed for: r9v144 */
    /* JADX WARNING: type inference failed for: r9v145 */
    /* JADX WARNING: type inference failed for: r9v146 */
    /* JADX WARNING: type inference failed for: r9v147 */
    /* JADX WARNING: type inference failed for: r9v148 */
    /* JADX WARNING: type inference failed for: r9v149 */
    /* JADX WARNING: type inference failed for: r9v150 */
    /* JADX WARNING: type inference failed for: r9v151 */
    /* JADX WARNING: type inference failed for: r9v152 */
    /* JADX WARNING: type inference failed for: r9v153 */
    /* JADX WARNING: type inference failed for: r9v154 */
    /* JADX WARNING: type inference failed for: r9v155 */
    /* JADX WARNING: type inference failed for: r9v156 */
    /* JADX WARNING: type inference failed for: r9v157 */
    /* JADX WARNING: type inference failed for: r9v158 */
    /* JADX WARNING: type inference failed for: r9v159 */
    /* JADX WARNING: type inference failed for: r9v160 */
    /* JADX WARNING: type inference failed for: r9v161 */
    /* JADX WARNING: type inference failed for: r9v162 */
    /* JADX WARNING: type inference failed for: r9v163 */
    /* JADX WARNING: type inference failed for: r9v164 */
    /* JADX WARNING: type inference failed for: r9v165 */
    /* JADX WARNING: type inference failed for: r9v166 */
    /* JADX WARNING: type inference failed for: r9v167 */
    /* JADX WARNING: type inference failed for: r9v168 */
    /* JADX WARNING: type inference failed for: r9v169 */
    /* JADX WARNING: type inference failed for: r9v170 */
    /* JADX WARNING: type inference failed for: r9v171 */
    /* JADX WARNING: type inference failed for: r9v172 */
    /* JADX WARNING: type inference failed for: r9v173 */
    /* JADX WARNING: type inference failed for: r9v174 */
    /* JADX WARNING: type inference failed for: r9v175 */
    /* JADX WARNING: type inference failed for: r9v176 */
    /* JADX WARNING: type inference failed for: r9v177 */
    /* JADX WARNING: type inference failed for: r9v178 */
    /* JADX WARNING: type inference failed for: r9v179 */
    /* JADX WARNING: type inference failed for: r9v180 */
    /* JADX WARNING: type inference failed for: r9v181 */
    /* JADX WARNING: type inference failed for: r9v182 */
    /* JADX WARNING: type inference failed for: r9v183 */
    /* JADX WARNING: type inference failed for: r9v184 */
    /* JADX WARNING: type inference failed for: r9v185 */
    /* JADX WARNING: type inference failed for: r9v186 */
    /* JADX WARNING: type inference failed for: r9v187 */
    /* JADX WARNING: type inference failed for: r9v188 */
    /* JADX WARNING: type inference failed for: r9v189 */
    /* JADX WARNING: type inference failed for: r9v190 */
    /* JADX WARNING: type inference failed for: r9v191 */
    /* JADX WARNING: type inference failed for: r9v192 */
    /* JADX WARNING: type inference failed for: r9v193 */
    /* JADX WARNING: type inference failed for: r9v194 */
    /* JADX WARNING: type inference failed for: r9v195 */
    /* JADX WARNING: type inference failed for: r9v196 */
    /* JADX WARNING: type inference failed for: r9v197 */
    /* JADX WARNING: type inference failed for: r9v198 */
    /* JADX WARNING: type inference failed for: r9v199 */
    /* JADX WARNING: type inference failed for: r9v200 */
    /* JADX WARNING: type inference failed for: r9v201 */
    /* JADX WARNING: type inference failed for: r9v202 */
    /* JADX WARNING: type inference failed for: r9v203 */
    /* JADX WARNING: type inference failed for: r9v204 */
    /* JADX WARNING: type inference failed for: r9v205 */
    /* JADX WARNING: type inference failed for: r9v206 */
    /* JADX WARNING: type inference failed for: r9v207 */
    /* JADX WARNING: type inference failed for: r9v208 */
    /* JADX WARNING: type inference failed for: r9v209 */
    /* JADX WARNING: type inference failed for: r9v210 */
    /* JADX WARNING: type inference failed for: r9v211 */
    /* JADX WARNING: type inference failed for: r9v212 */
    /* JADX WARNING: type inference failed for: r9v213 */
    /* JADX WARNING: type inference failed for: r9v214 */
    /* JADX WARNING: type inference failed for: r9v215 */
    /* JADX WARNING: type inference failed for: r9v216 */
    /* JADX WARNING: type inference failed for: r9v217 */
    /* JADX WARNING: type inference failed for: r9v218 */
    /* JADX WARNING: type inference failed for: r9v219 */
    /* JADX WARNING: type inference failed for: r9v220 */
    /* JADX WARNING: type inference failed for: r9v221 */
    /* JADX WARNING: type inference failed for: r9v222 */
    /* JADX WARNING: type inference failed for: r9v223 */
    /* JADX WARNING: type inference failed for: r9v224 */
    /* JADX WARNING: type inference failed for: r9v225 */
    /* JADX WARNING: type inference failed for: r9v226 */
    /* JADX WARNING: type inference failed for: r9v227 */
    /* JADX WARNING: type inference failed for: r9v228 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r13, X.C10300i6 r14, java.lang.String r15) {
        /*
            java.lang.String r10 = "ig_other"
            if (r15 == 0) goto L_0x0021
            r9 = -1
            int r0 = r15.hashCode()
            java.lang.String r8 = "text_post_app_mention"
            java.lang.String r7 = "text_post_app_user_followed"
            java.lang.String r6 = "text_post_app_reply"
            java.lang.String r5 = "text_post_app_quote_post"
            java.lang.String r4 = "text_post_app_accepted_user_follow_request"
            java.lang.String r3 = "text_post_app_private_follow_request"
            java.lang.String r2 = "text_post_app_repost"
            java.lang.String r1 = "text_post_app_like"
            switch(r0) {
                case -2137336791: goto L_0x0ab3;
                case -2102919056: goto L_0x0aa7;
                case -2087444809: goto L_0x0a9b;
                case -2047271981: goto L_0x0a8f;
                case -2022783564: goto L_0x0a83;
                case -1953611308: goto L_0x0a77;
                case -1933150048: goto L_0x0a6b;
                case -1885162274: goto L_0x0a5f;
                case -1857721452: goto L_0x0a53;
                case -1856406207: goto L_0x0a47;
                case -1842994800: goto L_0x0a3c;
                case -1813565398: goto L_0x0a2c;
                case -1774504636: goto L_0x0a20;
                case -1757346357: goto L_0x0a14;
                case -1731345665: goto L_0x0a08;
                case -1695377065: goto L_0x09fd;
                case -1677115218: goto L_0x09f1;
                case -1674386166: goto L_0x09e5;
                case -1660159711: goto L_0x09d9;
                case -1574027804: goto L_0x09cd;
                case -1569021109: goto L_0x09c1;
                case -1540609647: goto L_0x09ad;
                case -1526685094: goto L_0x09a1;
                case -1524232326: goto L_0x0995;
                case -1486374397: goto L_0x0989;
                case -1472568428: goto L_0x097d;
                case -1453616659: goto L_0x0971;
                case -1386866553: goto L_0x0965;
                case -1372693202: goto L_0x0959;
                case -1330197520: goto L_0x094d;
                case -1307214883: goto L_0x0941;
                case -1306514533: goto L_0x0935;
                case -1301259932: goto L_0x0929;
                case -1289541294: goto L_0x091d;
                case -1275894555: goto L_0x0911;
                case -1267790293: goto L_0x0905;
                case -1267331802: goto L_0x08f9;
                case -1265246962: goto L_0x08ed;
                case -1236050907: goto L_0x08e1;
                case -1217082036: goto L_0x08d5;
                case -1200082662: goto L_0x08c9;
                case -1198298078: goto L_0x08bf;
                case -1178005012: goto L_0x08b3;
                case -1162687579: goto L_0x08a7;
                case -1135564092: goto L_0x089b;
                case -1126816384: goto L_0x088f;
                case -1123646841: goto L_0x0883;
                case -1121527489: goto L_0x0877;
                case -1106313727: goto L_0x086b;
                case -1096306741: goto L_0x085f;
                case -971609053: goto L_0x0853;
                case -954201959: goto L_0x0847;
                case -925467783: goto L_0x083b;
                case -913036636: goto L_0x082f;
                case -885025563: goto L_0x0823;
                case -875002185: goto L_0x0817;
                case -847438019: goto L_0x080b;
                case -818980110: goto L_0x07ff;
                case -808068321: goto L_0x07f3;
                case -769340174: goto L_0x07e7;
                case -756875122: goto L_0x07db;
                case -734481234: goto L_0x07cf;
                case -697224731: goto L_0x07c3;
                case -687634452: goto L_0x07b7;
                case -672464592: goto L_0x07ab;
                case -660535410: goto L_0x079f;
                case -632526634: goto L_0x0793;
                case -625626430: goto L_0x0787;
                case -602245381: goto L_0x077b;
                case -593662069: goto L_0x0770;
                case -591387640: goto L_0x0764;
                case -562217912: goto L_0x0758;
                case -547519719: goto L_0x074d;
                case -546207813: goto L_0x0741;
                case -511002940: goto L_0x0735;
                case -488751509: goto L_0x0729;
                case -471625048: goto L_0x071d;
                case -469118703: goto L_0x0711;
                case -459046805: goto L_0x0705;
                case -445062908: goto L_0x06f9;
                case -444918457: goto L_0x06e9;
                case -420332607: goto L_0x06dd;
                case -418198198: goto L_0x06d1;
                case -417336616: goto L_0x06c5;
                case -390364013: goto L_0x06b9;
                case -371953802: goto L_0x06ad;
                case -366906995: goto L_0x06a1;
                case -344974562: goto L_0x0697;
                case -323422923: goto L_0x068b;
                case -309357048: goto L_0x0681;
                case -307187846: goto L_0x0675;
                case -304907360: goto L_0x0669;
                case -290495150: goto L_0x065d;
                case -280283050: goto L_0x0651;
                case -267850458: goto L_0x0645;
                case -238575446: goto L_0x0639;
                case -224909781: goto L_0x062e;
                case -198720596: goto L_0x061e;
                case -187786581: goto L_0x0612;
                case -160912177: goto L_0x0606;
                case -147112977: goto L_0x05fa;
                case -139282336: goto L_0x05ee;
                case -103857933: goto L_0x05e2;
                case -97124431: goto L_0x05d6;
                case -92994072: goto L_0x05cc;
                case -89002897: goto L_0x05c0;
                case -84075461: goto L_0x05b4;
                case -74123313: goto L_0x05a8;
                case -48829670: goto L_0x059c;
                case -19085772: goto L_0x0590;
                case 3009503: goto L_0x0584;
                case 3321751: goto L_0x0578;
                case 3446944: goto L_0x056c;
                case 3556498: goto L_0x0560;
                case 61791015: goto L_0x0554;
                case 92664121: goto L_0x0548;
                case 103149417: goto L_0x053c;
                case 118807481: goto L_0x0530;
                case 152565738: goto L_0x0524;
                case 156608718: goto L_0x051a;
                case 184250114: goto L_0x050e;
                case 206566848: goto L_0x0502;
                case 295987376: goto L_0x04f6;
                case 296104144: goto L_0x04ea;
                case 324171375: goto L_0x04de;
                case 344285418: goto L_0x04d3;
                case 352352772: goto L_0x04c7;
                case 393866503: goto L_0x04bb;
                case 435144458: goto L_0x04af;
                case 469702526: goto L_0x04a3;
                case 535918816: goto L_0x0497;
                case 538043614: goto L_0x048b;
                case 552567418: goto L_0x047f;
                case 557357479: goto L_0x0473;
                case 565256046: goto L_0x0467;
                case 566036496: goto L_0x045b;
                case 568982331: goto L_0x044f;
                case 593658707: goto L_0x0443;
                case 601899204: goto L_0x0437;
                case 626712134: goto L_0x042b;
                case 641814964: goto L_0x041f;
                case 659030007: goto L_0x0413;
                case 663545635: goto L_0x0407;
                case 711754413: goto L_0x03fb;
                case 713969956: goto L_0x03ef;
                case 714204858: goto L_0x03df;
                case 717447420: goto L_0x03d3;
                case 728186734: goto L_0x03c7;
                case 781807631: goto L_0x03bb;
                case 787249496: goto L_0x03af;
                case 789211672: goto L_0x03a3;
                case 795385207: goto L_0x0397;
                case 826222930: goto L_0x038b;
                case 830269490: goto L_0x037f;
                case 835198941: goto L_0x0373;
                case 842386606: goto L_0x0367;
                case 846433253: goto L_0x035b;
                case 847566336: goto L_0x034f;
                case 848058770: goto L_0x0344;
                case 936938451: goto L_0x0338;
                case 946725162: goto L_0x032c;
                case 950398559: goto L_0x0320;
                case 951117504: goto L_0x0314;
                case 957743319: goto L_0x0308;
                case 982500120: goto L_0x02fc;
                case 983344450: goto L_0x02f0;
                case 1007573942: goto L_0x02e4;
                case 1020129289: goto L_0x02d8;
                case 1025042645: goto L_0x02cc;
                case 1054299071: goto L_0x02c0;
                case 1076274777: goto L_0x02b4;
                case 1086965870: goto L_0x02a8;
                case 1126829305: goto L_0x029c;
                case 1133147624: goto L_0x0291;
                case 1136414394: goto L_0x0285;
                case 1189340826: goto L_0x0279;
                case 1206711977: goto L_0x026d;
                case 1209368341: goto L_0x0261;
                case 1215941979: goto L_0x0255;
                case 1226409732: goto L_0x0249;
                case 1233099618: goto L_0x023d;
                case 1252973282: goto L_0x0231;
                case 1271059305: goto L_0x0225;
                case 1276331536: goto L_0x0219;
                case 1280583649: goto L_0x020d;
                case 1314689267: goto L_0x0201;
                case 1316977209: goto L_0x01f5;
                case 1342837379: goto L_0x01e9;
                case 1350646482: goto L_0x01dd;
                case 1352201912: goto L_0x01d1;
                case 1381736685: goto L_0x01c5;
                case 1400148999: goto L_0x01b5;
                case 1494209082: goto L_0x01a9;
                case 1512892351: goto L_0x019f;
                case 1536403929: goto L_0x0195;
                case 1539594266: goto L_0x0189;
                case 1545657058: goto L_0x017d;
                case 1552386812: goto L_0x0171;
                case 1573587365: goto L_0x0165;
                case 1574018455: goto L_0x0159;
                case 1611387480: goto L_0x014d;
                case 1623040524: goto L_0x0141;
                case 1665995718: goto L_0x0135;
                case 1677710649: goto L_0x0129;
                case 1691996248: goto L_0x011d;
                case 1701036565: goto L_0x0111;
                case 1706406026: goto L_0x0105;
                case 1715775127: goto L_0x00f9;
                case 1724420895: goto L_0x00ed;
                case 1765823574: goto L_0x00e1;
                case 1788917712: goto L_0x00d5;
                case 1811698044: goto L_0x00c9;
                case 1831034768: goto L_0x00bd;
                case 1850301507: goto L_0x00b1;
                case 1864168171: goto L_0x00a5;
                case 1868922880: goto L_0x0099;
                case 1894611782: goto L_0x008e;
                case 1903645214: goto L_0x0083;
                case 1933086467: goto L_0x0078;
                case 1955189143: goto L_0x006d;
                case 1985308587: goto L_0x0062;
                case 1988196344: goto L_0x0057;
                case 2008141324: goto L_0x004c;
                case 2028508622: goto L_0x0041;
                case 2046431615: goto L_0x0038;
                case 2137571325: goto L_0x002d;
                case 2144789231: goto L_0x0022;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.String r0 = "ig_direct_video_chat"
            switch(r9) {
                case 0: goto L_0x0b03;
                case 1: goto L_0x0b03;
                case 2: goto L_0x0b00;
                case 3: goto L_0x0b00;
                case 4: goto L_0x0b00;
                case 5: goto L_0x0b00;
                case 6: goto L_0x0b00;
                case 7: goto L_0x0b00;
                case 8: goto L_0x0b00;
                case 9: goto L_0x0b00;
                case 10: goto L_0x0b00;
                case 11: goto L_0x0b00;
                case 12: goto L_0x0b00;
                case 13: goto L_0x0b00;
                case 14: goto L_0x0b00;
                case 15: goto L_0x0b00;
                case 16: goto L_0x0b00;
                case 17: goto L_0x0b00;
                case 18: goto L_0x0b00;
                case 19: goto L_0x0b00;
                case 20: goto L_0x0b00;
                case 21: goto L_0x0b00;
                case 22: goto L_0x0b00;
                case 23: goto L_0x0b00;
                case 24: goto L_0x0b00;
                case 25: goto L_0x0b00;
                case 26: goto L_0x0b00;
                case 27: goto L_0x0b00;
                case 28: goto L_0x0ac1;
                case 29: goto L_0x0ac1;
                case 30: goto L_0x0afd;
                case 31: goto L_0x0af8;
                case 32: goto L_0x0af8;
                case 33: goto L_0x0af8;
                case 34: goto L_0x0af8;
                case 35: goto L_0x0af8;
                case 36: goto L_0x0af8;
                case 37: goto L_0x0af5;
                case 38: goto L_0x0af2;
                case 39: goto L_0x0af2;
                case 40: goto L_0x0aef;
                case 41: goto L_0x0aef;
                case 42: goto L_0x0aec;
                case 43: goto L_0x0aec;
                case 44: goto L_0x0aec;
                case 45: goto L_0x0aec;
                case 46: goto L_0x0aec;
                case 47: goto L_0x0ae9;
                case 48: goto L_0x0ae6;
                case 49: goto L_0x0ae3;
                case 50: goto L_0x0ae3;
                case 51: goto L_0x0ae3;
                case 52: goto L_0x0ae3;
                case 53: goto L_0x0ae3;
                case 54: goto L_0x0ae3;
                case 55: goto L_0x0ae3;
                case 56: goto L_0x0ae3;
                case 57: goto L_0x0ae3;
                case 58: goto L_0x0ae3;
                case 59: goto L_0x0ae0;
                case 60: goto L_0x0ae0;
                case 61: goto L_0x0ae0;
                case 62: goto L_0x0ae0;
                case 63: goto L_0x0ae0;
                case 64: goto L_0x0ae0;
                case 65: goto L_0x0ae0;
                case 66: goto L_0x0ae0;
                case 67: goto L_0x0ae0;
                case 68: goto L_0x0ae0;
                case 69: goto L_0x0ae0;
                case 70: goto L_0x0add;
                case 71: goto L_0x0add;
                case 72: goto L_0x0add;
                case 73: goto L_0x0add;
                case 74: goto L_0x0add;
                case 75: goto L_0x0add;
                case 76: goto L_0x0add;
                case 77: goto L_0x0add;
                case 78: goto L_0x0ad8;
                case 79: goto L_0x0ad8;
                case 80: goto L_0x0ad8;
                case 81: goto L_0x0ad8;
                case 82: goto L_0x0ad8;
                case 83: goto L_0x0ad8;
                case 84: goto L_0x0ad3;
                case 85: goto L_0x0ad3;
                case 86: goto L_0x0ad3;
                case 87: goto L_0x0ad3;
                case 88: goto L_0x0ad3;
                case 89: goto L_0x0ad3;
                case 90: goto L_0x0ad3;
                case 91: goto L_0x0ad3;
                case 92: goto L_0x0ad3;
                case 93: goto L_0x0ad3;
                case 94: goto L_0x0ad3;
                case 95: goto L_0x0ad3;
                case 96: goto L_0x0ad3;
                case 97: goto L_0x0ad3;
                case 98: goto L_0x0ad3;
                case 99: goto L_0x0ad3;
                case 100: goto L_0x0ad3;
                case 101: goto L_0x0ad3;
                case 102: goto L_0x0ad3;
                case 103: goto L_0x0ad3;
                case 104: goto L_0x0ad3;
                case 105: goto L_0x0ad3;
                case 106: goto L_0x0ad3;
                case 107: goto L_0x0ad3;
                case 108: goto L_0x0ad3;
                case 109: goto L_0x0ad3;
                case 110: goto L_0x0ad3;
                case 111: goto L_0x0ad3;
                case 112: goto L_0x0ad3;
                case 113: goto L_0x0ad0;
                case 114: goto L_0x0ad0;
                case 115: goto L_0x0ad0;
                case 116: goto L_0x0ad0;
                case 117: goto L_0x0ad0;
                case 118: goto L_0x0ad0;
                case 119: goto L_0x0ad0;
                case 120: goto L_0x0ad0;
                case 121: goto L_0x0ad0;
                case 122: goto L_0x0ad0;
                case 123: goto L_0x0ad0;
                case 124: goto L_0x0acd;
                case 125: goto L_0x0acd;
                case 126: goto L_0x0aca;
                case 127: goto L_0x0aca;
                case 128: goto L_0x0ac9;
                case 129: goto L_0x0ac8;
                case 130: goto L_0x0ac7;
                case 131: goto L_0x0ac6;
                case 132: goto L_0x0ac5;
                case 133: goto L_0x0ac4;
                case 134: goto L_0x0ac3;
                case 135: goto L_0x0ac2;
                case 136: goto L_0x0abf;
                default: goto L_0x0021;
            }
        L_0x0021:
            return r10
        L_0x0022:
            java.lang.String r0 = "story_ads_preview"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 208(0xd0, float:2.91E-43)
            goto L_0x001c
        L_0x002d:
            java.lang.String r0 = "instaversary"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 181(0xb5, float:2.54E-43)
            goto L_0x001c
        L_0x0038:
            boolean r0 = r15.equals(r8)
            if (r0 == 0) goto L_0x001c
            r9 = 129(0x81, float:1.81E-43)
            goto L_0x001c
        L_0x0041:
            java.lang.String r0 = "product_rejected"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 195(0xc3, float:2.73E-43)
            goto L_0x001c
        L_0x004c:
            java.lang.String r0 = "feed_suite_organic_campaign"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 85
            goto L_0x001c
        L_0x0057:
            java.lang.String r0 = "unseen_notification_reminders"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 107(0x6b, float:1.5E-43)
            goto L_0x001c
        L_0x0062:
            java.lang.String r0 = "set_bio"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 108(0x6c, float:1.51E-43)
            goto L_0x001c
        L_0x006d:
            java.lang.String r0 = "settled_ad_account"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 203(0xcb, float:2.84E-43)
            goto L_0x001c
        L_0x0078:
            java.lang.String r0 = "promote_contact_import"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 119(0x77, float:1.67E-43)
            goto L_0x001c
        L_0x0083:
            java.lang.String r0 = "branded_content_sponsor_boosted_ad_deleted"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 148(0x94, float:2.07E-43)
            goto L_0x001c
        L_0x008e:
            java.lang.String r0 = "branded_content_violation"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 150(0x96, float:2.1E-43)
            goto L_0x001c
        L_0x0099:
            java.lang.String r0 = "campaign_logout_push"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 152(0x98, float:2.13E-43)
            goto L_0x001c
        L_0x00a5:
            java.lang.String r0 = "branded_content_tagged"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 43
            goto L_0x001c
        L_0x00b1:
            java.lang.String r0 = "churned_find_friends"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 96
            goto L_0x001c
        L_0x00bd:
            java.lang.String r0 = "ig_public_verification"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x001c
        L_0x00c9:
            java.lang.String r0 = "support_ticket"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 125(0x7d, float:1.75E-43)
            goto L_0x001c
        L_0x00d5:
            java.lang.String r0 = "subscribed_highlight_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 213(0xd5, float:2.98E-43)
            goto L_0x001c
        L_0x00e1:
            java.lang.String r0 = "direct_v2_channel"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 8
            goto L_0x001c
        L_0x00ed:
            java.lang.String r0 = "direct_v2_hashtag"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 11
            goto L_0x001c
        L_0x00f9:
            java.lang.String r0 = "product_announcement"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 118(0x76, float:1.65E-43)
            goto L_0x001c
        L_0x0105:
            java.lang.String r0 = "recent_follow_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 197(0xc5, float:2.76E-43)
            goto L_0x001c
        L_0x0111:
            java.lang.String r0 = "resurrected_user_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 76
            goto L_0x001c
        L_0x011d:
            java.lang.String r0 = "generic_confirm"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 175(0xaf, float:2.45E-43)
            goto L_0x001c
        L_0x0129:
            java.lang.String r0 = "video_view_count"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 41
            goto L_0x001c
        L_0x0135:
            java.lang.String r0 = "shopping_user_media_featured"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 205(0xcd, float:2.87E-43)
            goto L_0x001c
        L_0x0141:
            java.lang.String r0 = "page_likes"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 103(0x67, float:1.44E-43)
            goto L_0x001c
        L_0x014d:
            java.lang.String r0 = "fb_ig_content_sharing"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 165(0xa5, float:2.31E-43)
            goto L_0x001c
        L_0x0159:
            java.lang.String r0 = "direct_v2_media_share"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 18
            goto L_0x001c
        L_0x0165:
            java.lang.String r0 = "media_on_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 185(0xb9, float:2.59E-43)
            goto L_0x001c
        L_0x0171:
            java.lang.String r0 = "direct_v2_highlights_reaction"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 12
            goto L_0x001c
        L_0x017d:
            java.lang.String r0 = "like_on_tag"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 38
            goto L_0x001c
        L_0x0189:
            java.lang.String r0 = "introduction"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 113(0x71, float:1.58E-43)
            goto L_0x001c
        L_0x0195:
            boolean r0 = r15.equals(r7)
            if (r0 == 0) goto L_0x001c
            r9 = 131(0x83, float:1.84E-43)
            goto L_0x001c
        L_0x019f:
            boolean r0 = r15.equals(r6)
            if (r0 == 0) goto L_0x001c
            r9 = 130(0x82, float:1.82E-43)
            goto L_0x001c
        L_0x01a9:
            java.lang.String r0 = "comment_subscribed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 34
            goto L_0x001c
        L_0x01b5:
            r0 = 793(0x319, float:1.111E-42)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 215(0xd7, float:3.01E-43)
            goto L_0x001c
        L_0x01c5:
            java.lang.String r0 = "branded_content_sponsor_boosted_ad_created"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 147(0x93, float:2.06E-43)
            goto L_0x001c
        L_0x01d1:
            java.lang.String r0 = "media_delete_on_content_violation"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 184(0xb8, float:2.58E-43)
            goto L_0x001c
        L_0x01dd:
            java.lang.String r0 = "follower_activity_reminders"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 99
            goto L_0x001c
        L_0x01e9:
            java.lang.String r0 = "direct_v2_sent_user_reaction"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 24
            goto L_0x001c
        L_0x01f5:
            java.lang.String r0 = "private_user_follow_request"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 54
            goto L_0x001c
        L_0x0201:
            java.lang.String r0 = "user_data_policy"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 222(0xde, float:3.11E-43)
            goto L_0x001c
        L_0x020d:
            java.lang.String r0 = "canvas_preview"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 153(0x99, float:2.14E-43)
            goto L_0x001c
        L_0x0219:
            java.lang.String r0 = "follower_activity"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 98
            goto L_0x001c
        L_0x0225:
            java.lang.String r0 = "contactjoined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 64
            goto L_0x001c
        L_0x0231:
            java.lang.String r0 = "find_facebook_friends"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 169(0xa9, float:2.37E-43)
            goto L_0x001c
        L_0x023d:
            java.lang.String r0 = "welcome"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 112(0x70, float:1.57E-43)
            goto L_0x001c
        L_0x0249:
            java.lang.String r0 = "branded_content_untagged"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 42
            goto L_0x001c
        L_0x0255:
            java.lang.String r0 = "live_views"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 81
            goto L_0x001c
        L_0x0261:
            java.lang.String r0 = "tag_followed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 57
            goto L_0x001c
        L_0x026d:
            java.lang.String r0 = "live_likes"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 78
            goto L_0x001c
        L_0x0279:
            java.lang.String r0 = "fb_invite_accepted"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 168(0xa8, float:2.35E-43)
            goto L_0x001c
        L_0x0285:
            java.lang.String r0 = "direct_v2_item_seen"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 14
            goto L_0x001c
        L_0x0291:
            java.lang.String r0 = "direct_raven_mark_seen"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 3
            goto L_0x001c
        L_0x029c:
            java.lang.String r0 = "business_message_request_reminder"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 94
            goto L_0x001c
        L_0x02a8:
            java.lang.String r0 = "reply_to_comment_with_threading"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 31
            goto L_0x001c
        L_0x02b4:
            java.lang.String r0 = "trending_story_sticker"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 88
            goto L_0x001c
        L_0x02c0:
            java.lang.String r0 = "geo_ip_block_by_court"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 176(0xb0, float:2.47E-43)
            goto L_0x001c
        L_0x02cc:
            java.lang.String r0 = "story_suite_organic_campaign"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 84
            goto L_0x001c
        L_0x02d8:
            java.lang.String r0 = "recommend_accounts"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 198(0xc6, float:2.77E-43)
            goto L_0x001c
        L_0x02e4:
            java.lang.String r0 = "promote_story"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 122(0x7a, float:1.71E-43)
            goto L_0x001c
        L_0x02f0:
            java.lang.String r0 = "geo_ip_block_by_third_party"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 177(0xb1, float:2.48E-43)
            goto L_0x001c
        L_0x02fc:
            java.lang.String r0 = "ad_report_update"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 145(0x91, float:2.03E-43)
            goto L_0x001c
        L_0x0308:
            java.lang.String r0 = "set_fullname"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 109(0x6d, float:1.53E-43)
            goto L_0x001c
        L_0x0314:
            java.lang.String r0 = "confirm"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 156(0x9c, float:2.19E-43)
            goto L_0x001c
        L_0x0320:
            java.lang.String r0 = "comment"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 33
            goto L_0x001c
        L_0x032c:
            java.lang.String r0 = "direct_v2_generic"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 10
            goto L_0x001c
        L_0x0338:
            java.lang.String r0 = "new_user_password_set"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 188(0xbc, float:2.63E-43)
            goto L_0x001c
        L_0x0344:
            java.lang.String r0 = "direct_raven_pending"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 0
            goto L_0x001c
        L_0x034f:
            java.lang.String r0 = "subscribed_reel_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 214(0xd6, float:3.0E-43)
            goto L_0x001c
        L_0x035b:
            java.lang.String r0 = "story_polling_sticker_result"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 209(0xd1, float:2.93E-43)
            goto L_0x001c
        L_0x0367:
            java.lang.String r0 = "igtv_video_post_failure"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 127(0x7f, float:1.78E-43)
            goto L_0x001c
        L_0x0373:
            java.lang.String r0 = "video_call_ended"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 29
            goto L_0x001c
        L_0x037f:
            java.lang.String r0 = "fb_first_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 70
            goto L_0x001c
        L_0x038b:
            java.lang.String r0 = "direct_v2_reel_mention"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 21
            goto L_0x001c
        L_0x0397:
            java.lang.String r0 = "comment_like"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 37
            goto L_0x001c
        L_0x03a3:
            java.lang.String r0 = "top_post_monthly"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 217(0xd9, float:3.04E-43)
            goto L_0x001c
        L_0x03af:
            java.lang.String r0 = "remind_follow_requests"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 56
            goto L_0x001c
        L_0x03bb:
            java.lang.String r0 = "activation_promote_fb_connect"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 93
            goto L_0x001c
        L_0x03c7:
            java.lang.String r0 = "introduction_explore"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 115(0x73, float:1.61E-43)
            goto L_0x001c
        L_0x03d3:
            java.lang.String r0 = "direct_v2_profile"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 19
            goto L_0x001c
        L_0x03df:
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 27
            goto L_0x001c
        L_0x03ef:
            java.lang.String r0 = "direct_v2_like"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 15
            goto L_0x001c
        L_0x03fb:
            java.lang.String r0 = "copyright_violation"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 160(0xa0, float:2.24E-43)
            goto L_0x001c
        L_0x0407:
            java.lang.String r0 = "direct_v2_raven"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 20
            goto L_0x001c
        L_0x0413:
            java.lang.String r0 = "direct_v2_media"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 17
            goto L_0x001c
        L_0x041f:
            java.lang.String r0 = "fb_ig_followee_on_fb_recently_followed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 49
            goto L_0x001c
        L_0x042b:
            java.lang.String r0 = "promote_fb_connect"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 120(0x78, float:1.68E-43)
            goto L_0x001c
        L_0x0437:
            java.lang.String r0 = "silent_push"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 206(0xce, float:2.89E-43)
            goto L_0x001c
        L_0x0443:
            java.lang.String r0 = "ad_approved"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 141(0x8d, float:1.98E-43)
            goto L_0x001c
        L_0x044f:
            java.lang.String r0 = "email_was_changed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 163(0xa3, float:2.28E-43)
            goto L_0x001c
        L_0x045b:
            java.lang.String r0 = "direct_v2_shared_archived_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 26
            goto L_0x001c
        L_0x0467:
            java.lang.String r0 = "follower_media_activity_with_owner"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 172(0xac, float:2.41E-43)
            goto L_0x001c
        L_0x0473:
            java.lang.String r0 = "underage_appeal"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 220(0xdc, float:3.08E-43)
            goto L_0x001c
        L_0x047f:
            java.lang.String r0 = "captcha"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 154(0x9a, float:2.16E-43)
            goto L_0x001c
        L_0x048b:
            java.lang.String r0 = "platform_test"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 193(0xc1, float:2.7E-43)
            goto L_0x001c
        L_0x0497:
            java.lang.String r0 = "roll_call"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 136(0x88, float:1.9E-43)
            goto L_0x001c
        L_0x04a3:
            java.lang.String r0 = "session_level_survey"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 123(0x7b, float:1.72E-43)
            goto L_0x001c
        L_0x04af:
            java.lang.String r0 = "live_with_broadcast_revoke"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 83
            goto L_0x001c
        L_0x04bb:
            java.lang.String r0 = "branded_content_whitelisted"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 44
            goto L_0x001c
        L_0x04c7:
            java.lang.String r0 = "user_followed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 55
            goto L_0x001c
        L_0x04d3:
            java.lang.String r0 = "direct_v2_pending"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 1
            goto L_0x001c
        L_0x04de:
            java.lang.String r0 = "school_unlock"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 202(0xca, float:2.83E-43)
            goto L_0x001c
        L_0x04ea:
            java.lang.String r0 = "gdpr_parental_consent"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 174(0xae, float:2.44E-43)
            goto L_0x001c
        L_0x04f6:
            java.lang.String r0 = "report_updated"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 124(0x7c, float:1.74E-43)
            goto L_0x001c
        L_0x0502:
            java.lang.String r0 = "claim_unconfirmed_email"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 155(0x9b, float:2.17E-43)
            goto L_0x001c
        L_0x050e:
            java.lang.String r0 = "story_poll_close"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 210(0xd2, float:2.94E-43)
            goto L_0x001c
        L_0x051a:
            boolean r0 = r15.equals(r5)
            if (r0 == 0) goto L_0x001c
            r9 = 135(0x87, float:1.89E-43)
            goto L_0x001c
        L_0x0524:
            java.lang.String r0 = "addressbook_contact_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 59
            goto L_0x001c
        L_0x0530:
            java.lang.String r0 = "fb_ig_content_sharing_non_ig_followee"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 166(0xa6, float:2.33E-43)
            goto L_0x001c
        L_0x053c:
            java.lang.String r0 = "login"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 182(0xb6, float:2.55E-43)
            goto L_0x001c
        L_0x0548:
            java.lang.String r0 = "adhoc"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 140(0x8c, float:1.96E-43)
            goto L_0x001c
        L_0x0554:
            java.lang.String r0 = "igtv_video_post_success"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 126(0x7e, float:1.77E-43)
            goto L_0x001c
        L_0x0560:
            java.lang.String r0 = "test"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 216(0xd8, float:3.03E-43)
            goto L_0x001c
        L_0x056c:
            java.lang.String r0 = "post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 194(0xc2, float:2.72E-43)
            goto L_0x001c
        L_0x0578:
            java.lang.String r0 = "like"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 30
            goto L_0x001c
        L_0x0584:
            java.lang.String r0 = "aymt"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 146(0x92, float:2.05E-43)
            goto L_0x001c
        L_0x0590:
            java.lang.String r0 = "school_invite"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 201(0xc9, float:2.82E-43)
            goto L_0x001c
        L_0x059c:
            java.lang.String r0 = "comment_on_tag"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 39
            goto L_0x001c
        L_0x05a8:
            java.lang.String r0 = "explore_video"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 164(0xa4, float:2.3E-43)
            goto L_0x001c
        L_0x05b4:
            java.lang.String r0 = "live_with_broadcast"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 82
            goto L_0x001c
        L_0x05c0:
            java.lang.String r0 = "delta_checkpoint"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 161(0xa1, float:2.26E-43)
            goto L_0x001c
        L_0x05cc:
            boolean r0 = r15.equals(r4)
            if (r0 == 0) goto L_0x001c
            r9 = 133(0x85, float:1.86E-43)
            goto L_0x001c
        L_0x05d6:
            java.lang.String r0 = "school_email_confirmed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 200(0xc8, float:2.8E-43)
            goto L_0x001c
        L_0x05e2:
            java.lang.String r0 = "story_poll_result_share"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 211(0xd3, float:2.96E-43)
            goto L_0x001c
        L_0x05ee:
            java.lang.String r0 = "user_tagged"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 45
            goto L_0x001c
        L_0x05fa:
            java.lang.String r0 = "usertag"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 223(0xdf, float:3.12E-43)
            goto L_0x001c
        L_0x0606:
            java.lang.String r0 = "first_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 71
            goto L_0x001c
        L_0x0612:
            java.lang.String r0 = "password_reset"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 190(0xbe, float:2.66E-43)
            goto L_0x001c
        L_0x061e:
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.I17.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 143(0x8f, float:2.0E-43)
            goto L_0x001c
        L_0x062e:
            java.lang.String r0 = "direct_raven_replayed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 4
            goto L_0x001c
        L_0x0639:
            java.lang.String r0 = "follow_versary"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 89
            goto L_0x001c
        L_0x0645:
            java.lang.String r0 = "resurrected_reel_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 75
            goto L_0x001c
        L_0x0651:
            java.lang.String r0 = "verify_email"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 225(0xe1, float:3.15E-43)
            goto L_0x001c
        L_0x065d:
            java.lang.String r0 = "hot_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 179(0xb3, float:2.51E-43)
            goto L_0x001c
        L_0x0669:
            java.lang.String r0 = "interest_story"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 87
            goto L_0x001c
        L_0x0675:
            java.lang.String r0 = "gdpr_consent"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 173(0xad, float:2.42E-43)
            goto L_0x001c
        L_0x0681:
            boolean r0 = r15.equals(r3)
            if (r0 == 0) goto L_0x001c
            r9 = 132(0x84, float:1.85E-43)
            goto L_0x001c
        L_0x068b:
            java.lang.String r0 = "follow_request_approved"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 48
            goto L_0x001c
        L_0x0697:
            boolean r0 = r15.equals(r2)
            if (r0 == 0) goto L_0x001c
            r9 = 134(0x86, float:1.88E-43)
            goto L_0x001c
        L_0x06a1:
            java.lang.String r0 = "media_created"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 183(0xb7, float:2.56E-43)
            goto L_0x001c
        L_0x06ad:
            java.lang.String r0 = "introduction_follow"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 116(0x74, float:1.63E-43)
            goto L_0x001c
        L_0x06b9:
            java.lang.String r0 = "password_reset_optimized"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 191(0xbf, float:2.68E-43)
            goto L_0x001c
        L_0x06c5:
            java.lang.String r0 = "reinstate_after_appeal"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 199(0xc7, float:2.79E-43)
            goto L_0x001c
        L_0x06d1:
            java.lang.String r0 = "tag_follow_based_on_engagement"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 58
            goto L_0x001c
        L_0x06dd:
            java.lang.String r0 = "direct_v2_reel_reaction"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 22
            goto L_0x001c
        L_0x06e9:
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 23
            goto L_0x001c
        L_0x06f9:
            java.lang.String r0 = "media_comment"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 36
            goto L_0x001c
        L_0x0705:
            java.lang.String r0 = "two_factor_enable_or_disable"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 219(0xdb, float:3.07E-43)
            goto L_0x001c
        L_0x0711:
            java.lang.String r0 = "password_reset_phished"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 192(0xc0, float:2.69E-43)
            goto L_0x001c
        L_0x071d:
            java.lang.String r0 = "fb_ig_outstanding_fb_notifications"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 167(0xa7, float:2.34E-43)
            goto L_0x001c
        L_0x0729:
            java.lang.String r0 = "story_highlight_added"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 77
            goto L_0x001c
        L_0x0735:
            java.lang.String r0 = "post_first_photo"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 74
            goto L_0x001c
        L_0x0741:
            java.lang.String r0 = "popular_media_in_your_network"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 91
            goto L_0x001c
        L_0x074d:
            java.lang.String r0 = "direct_media_share_mention"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 2
            goto L_0x001c
        L_0x0758:
            java.lang.String r0 = "contact_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 61
            goto L_0x001c
        L_0x0764:
            java.lang.String r0 = "contact_invite"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 157(0x9d, float:2.2E-43)
            goto L_0x001c
        L_0x0770:
            java.lang.String r0 = "direct_raven_screenshot"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 5
            goto L_0x001c
        L_0x077b:
            java.lang.String r0 = "close_friend_story"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 86
            goto L_0x001c
        L_0x0787:
            java.lang.String r0 = "direct_v2_location"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 16
            goto L_0x001c
        L_0x0793:
            java.lang.String r0 = "first_reel_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 72
            goto L_0x001c
        L_0x079f:
            java.lang.String r0 = "stories_question_response"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 207(0xcf, float:2.9E-43)
            goto L_0x001c
        L_0x07ab:
            java.lang.String r0 = "direct_v2_user_reaction"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 25
            goto L_0x001c
        L_0x07b7:
            java.lang.String r0 = "direct_v2_highlights_share"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 13
            goto L_0x001c
        L_0x07c3:
            java.lang.String r0 = "hello_world"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 102(0x66, float:1.43E-43)
            goto L_0x001c
        L_0x07cf:
            java.lang.String r0 = "churn_reminders"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 95
            goto L_0x001c
        L_0x07db:
            java.lang.String r0 = "branded_content_unwhitelisted"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 149(0x95, float:2.09E-43)
            goto L_0x001c
        L_0x07e7:
            java.lang.String r0 = "comment_subscribed_on_like"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 35
            goto L_0x001c
        L_0x07f3:
            java.lang.String r0 = "follower_activity_with_location"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 100
            goto L_0x001c
        L_0x07ff:
            java.lang.String r0 = "follower_follow"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 101(0x65, float:1.42E-43)
            goto L_0x001c
        L_0x080b:
            java.lang.String r0 = "direct_v2_channel_direct_invites"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 9
            goto L_0x001c
        L_0x0817:
            java.lang.String r0 = "contact_joined_phone"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 63
            goto L_0x001c
        L_0x0823:
            java.lang.String r0 = "contact_joined_email"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 62
            goto L_0x001c
        L_0x082f:
            java.lang.String r0 = "story_views"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 40
            goto L_0x001c
        L_0x083b:
            java.lang.String r0 = "two_factor_disabled"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 218(0xda, float:3.05E-43)
            goto L_0x001c
        L_0x0847:
            java.lang.String r0 = "account_privacy_change"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 138(0x8a, float:1.93E-43)
            goto L_0x001c
        L_0x0853:
            java.lang.String r0 = "video_call_incoming"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 28
            goto L_0x001c
        L_0x085f:
            java.lang.String r0 = "fb_friend_connected"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 66
            goto L_0x001c
        L_0x086b:
            java.lang.String r0 = "bestie_added"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 60
            goto L_0x001c
        L_0x0877:
            java.lang.String r0 = "download_your_data"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 162(0xa2, float:2.27E-43)
            goto L_0x001c
        L_0x0883:
            java.lang.String r0 = "multi_author_story"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 186(0xba, float:2.6E-43)
            goto L_0x001c
        L_0x088f:
            java.lang.String r0 = "nearby_business"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 187(0xbb, float:2.62E-43)
            goto L_0x001c
        L_0x089b:
            java.lang.String r0 = "fb_ig_friend_request_pending"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 50
            goto L_0x001c
        L_0x08a7:
            java.lang.String r0 = "credit_card_expiring"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 97
            goto L_0x001c
        L_0x08b3:
            java.lang.String r0 = "account_reactivated"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 139(0x8b, float:1.95E-43)
            goto L_0x001c
        L_0x08bf:
            boolean r0 = r15.equals(r1)
            if (r0 == 0) goto L_0x001c
            r9 = 128(0x80, float:1.794E-43)
            goto L_0x001c
        L_0x08c9:
            java.lang.String r0 = "ad_rejected"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 144(0x90, float:2.02E-43)
            goto L_0x001c
        L_0x08d5:
            java.lang.String r0 = "vkontakte_contact_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 69
            goto L_0x001c
        L_0x08e1:
            java.lang.String r0 = "fb_ig_friend_request_pending_non_ig_followee"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 51
            goto L_0x001c
        L_0x08ed:
            java.lang.String r0 = "ad_finished"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 142(0x8e, float:1.99E-43)
            goto L_0x001c
        L_0x08f9:
            java.lang.String r0 = "contact_point_changed"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 158(0x9e, float:2.21E-43)
            goto L_0x001c
        L_0x0905:
            java.lang.String r0 = "fb_contact_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 65
            goto L_0x001c
        L_0x0911:
            java.lang.String r0 = "feed_interest_content"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 92
            goto L_0x001c
        L_0x091d:
            java.lang.String r0 = "shopping_onboarding"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 204(0xcc, float:2.86E-43)
            goto L_0x001c
        L_0x0929:
            java.lang.String r0 = "accounts_you_may_follow"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 137(0x89, float:1.92E-43)
            goto L_0x001c
        L_0x0935:
            java.lang.String r0 = "introduction_confirm"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 114(0x72, float:1.6E-43)
            goto L_0x001c
        L_0x0941:
            java.lang.String r0 = "new_follower"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 52
            goto L_0x001c
        L_0x094d:
            java.lang.String r0 = "unsettled_ad_account"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 221(0xdd, float:3.1E-43)
            goto L_0x001c
        L_0x0959:
            java.lang.String r0 = "live_broadcast"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 80
            goto L_0x001c
        L_0x0965:
            java.lang.String r0 = "story_producer_expire_media"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 106(0x6a, float:1.49E-43)
            goto L_0x001c
        L_0x0971:
            java.lang.String r0 = "fb_ig_followee_on_fb_recently_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 67
            goto L_0x001c
        L_0x097d:
            java.lang.String r0 = "verify_email_for_recovery"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 226(0xe2, float:3.17E-43)
            goto L_0x001c
        L_0x0989:
            java.lang.String r0 = "copyright_video"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 159(0x9f, float:2.23E-43)
            goto L_0x001c
        L_0x0995:
            java.lang.String r0 = "introduction_share"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 117(0x75, float:1.64E-43)
            goto L_0x001c
        L_0x09a1:
            java.lang.String r0 = "unseen_activity"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 111(0x6f, float:1.56E-43)
            goto L_0x001c
        L_0x09ad:
            r12 = 39
            r11 = 17
            r0 = 79
            java.lang.String r0 = X.AnonymousClass3Q5.A00(r12, r11, r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 224(0xe0, float:3.14E-43)
            goto L_0x001c
        L_0x09c1:
            java.lang.String r0 = "follower_media_activity"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 171(0xab, float:2.4E-43)
            goto L_0x001c
        L_0x09cd:
            java.lang.String r0 = "promote_first_photo"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 121(0x79, float:1.7E-43)
            goto L_0x001c
        L_0x09d9:
            java.lang.String r0 = "tagged_in_bio"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 47
            goto L_0x001c
        L_0x09e5:
            java.lang.String r0 = "find_friend_activity"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 170(0xaa, float:2.38E-43)
            goto L_0x001c
        L_0x09f1:
            java.lang.String r0 = "promote_account"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 104(0x68, float:1.46E-43)
            goto L_0x001c
        L_0x09fd:
            java.lang.String r0 = "direct_share_received"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 6
            goto L_0x001c
        L_0x0a08:
            java.lang.String r0 = "set_profile_photo"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 110(0x6e, float:1.54E-43)
            goto L_0x001c
        L_0x0a14:
            java.lang.String r0 = "hide_preview"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 178(0xb2, float:2.5E-43)
            goto L_0x001c
        L_0x0a20:
            java.lang.String r0 = "recap_digest"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 196(0xc4, float:2.75E-43)
            goto L_0x001c
        L_0x0a2c:
            r0 = 95
            java.lang.String r0 = X.I17.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 151(0x97, float:2.12E-43)
            goto L_0x001c
        L_0x0a3c:
            java.lang.String r0 = "direct_v2_business_unread_reminder"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 7
            goto L_0x001c
        L_0x0a47:
            java.lang.String r0 = "birthday_highlights"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 90
            goto L_0x001c
        L_0x0a53:
            java.lang.String r0 = "twitter_contact_joined"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 68
            goto L_0x001c
        L_0x0a5f:
            java.lang.String r0 = "new_business_follower"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 53
            goto L_0x001c
        L_0x0a6b:
            java.lang.String r0 = "story_poll_vote"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 212(0xd4, float:2.97E-43)
            goto L_0x001c
        L_0x0a77:
            java.lang.String r0 = "password_change"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 189(0xbd, float:2.65E-43)
            goto L_0x001c
        L_0x0a83:
            java.lang.String r0 = "story_daily_digest"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 105(0x69, float:1.47E-43)
            goto L_0x001c
        L_0x0a8f:
            java.lang.String r0 = "story_mentions"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 46
            goto L_0x001c
        L_0x0a9b:
            java.lang.String r0 = "live_broadcast_revoke"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 79
            goto L_0x001c
        L_0x0aa7:
            java.lang.String r0 = "first_bestie_post"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 73
            goto L_0x001c
        L_0x0ab3:
            java.lang.String r0 = "mentioned_comment"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r9 = 32
            goto L_0x001c
        L_0x0abf:
            java.lang.String r0 = "ig_alerts"
        L_0x0ac1:
            return r0
        L_0x0ac2:
            return r5
        L_0x0ac3:
            return r2
        L_0x0ac4:
            return r4
        L_0x0ac5:
            return r3
        L_0x0ac6:
            return r7
        L_0x0ac7:
            return r6
        L_0x0ac8:
            return r8
        L_0x0ac9:
            return r1
        L_0x0aca:
            java.lang.String r0 = "ig_igtv_video_updates"
            return r0
        L_0x0acd:
            java.lang.String r0 = "ig_support_requests"
            return r0
        L_0x0ad0:
            java.lang.String r0 = "ig_product_announcements"
            return r0
        L_0x0ad3:
            java.lang.String r0 = A02(r13, r14)
            return r0
        L_0x0ad8:
            java.lang.String r0 = A00(r13, r14)
            return r0
        L_0x0add:
            java.lang.String r0 = "ig_first_posts_and_stories"
            return r0
        L_0x0ae0:
            java.lang.String r0 = "ig_friends_on_instagram"
            return r0
        L_0x0ae3:
            java.lang.String r0 = "ig_new_followers"
            return r0
        L_0x0ae6:
            java.lang.String r0 = "ig_private_user_follow_request"
            return r0
        L_0x0ae9:
            java.lang.String r0 = "ig_mentions_in_bio"
            return r0
        L_0x0aec:
            java.lang.String r0 = "ig_photos_of_you"
            return r0
        L_0x0aef:
            java.lang.String r0 = "ig_view_counts"
            return r0
        L_0x0af2:
            java.lang.String r0 = "ig_likes_and_comments_on_photos_of_you"
            return r0
        L_0x0af5:
            java.lang.String r0 = "ig_comment_likes"
            return r0
        L_0x0af8:
            java.lang.String r0 = A01(r13, r14)
            return r0
        L_0x0afd:
            java.lang.String r0 = "ig_likes"
            return r0
        L_0x0b00:
            java.lang.String r0 = "ig_direct"
            return r0
        L_0x0b03:
            java.lang.String r0 = "ig_direct_requests"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63853iS.A03(android.content.Context, X.0i6, java.lang.String):java.lang.String");
    }
}
