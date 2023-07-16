package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.barcelona.R;
import com.instagram.nux.ndx.util.NdxStepsManager$updateEligibleStepsStore$1;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3zM  reason: invalid class name and case insensitive filesystem */
public final class C67323zM implements CallerContextable {
    public static final String __redex_internal_original_name = "LoginUtil";

    public static AnonymousClass3GF A02(AnonymousClass2L8 r13) {
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        if (r13 instanceof AnonymousClass1j8) {
            z = true;
        } else {
            AnonymousClass1TP r1 = (AnonymousClass1TP) ((AnonymousClass1j9) r13).A00;
            str = r1.mErrorType;
            z8 = r1.A02;
            z3 = r1.isCheckpointRequired();
            z6 = r1.hasErrorType("invalid_one_tap_nonce");
            z5 = r1.hasErrorType("invalid_google_token_nonce");
            z2 = r1.hasErrorType("bad_password");
            z7 = r1.hasErrorType("invalid_user");
            z4 = r1.hasErrorType("inactive user");
            z9 = r1.hasErrorType("unusable_password");
        }
        return new AnonymousClass3GF(str, z, z2, z3, z4, z5, z6, false, z7, z8, z9);
    }

    public static void A04(Activity activity, Uri uri, C11630kW r10, UserSession userSession) {
        A07(activity, uri, r10, userSession, C18200wM.A00(), true, false, false, false);
    }

    public static void A05(Activity activity, Uri uri, C11630kW r9, UserSession userSession) {
        A07(activity, uri, r9, userSession, C18200wM.A00(), false, false, false, false);
    }

    public static void A08(Activity activity, C11630kW r8, UserSession userSession) {
        A07(activity, (Uri) null, r8, userSession, C18200wM.A00(), false, false, false, false);
    }

    public static Uri A00(Activity activity) {
        Bundle A0C;
        String A0i;
        if (activity == null || (A0C = C18190wL.A0C(activity)) == null || (A0i = C18190wL.A0i(A0C)) == null) {
            return null;
        }
        return C15430rJ.A01(A0i);
    }

    public static Uri A01(Fragment fragment) {
        String A0i;
        Bundle bundle = fragment.mArguments;
        if (bundle == null || (A0i = C18190wL.A0i(bundle)) == null) {
            return null;
        }
        return C15430rJ.A01(A0i);
    }

    public static void A07(Activity activity, Uri uri, C11630kW r22, UserSession userSession, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        Bundle bundle;
        String string;
        PackageManager packageManager;
        Intent launchIntentForPackage;
        String moduleName;
        AnonymousClass1o2.A01("log_in").A06();
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        C57473Be r4 = new C57473Be(activity2, userSession2, AnonymousClass006.A00);
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        long currentTimeMillis = System.currentTimeMillis();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new NdxStepsManager$updateEligibleStepsStore$1(r4, (C146958n9) null, 3, currentTimeMillis), C84874u0.A00(A0J, 1260133026, 3), 3);
        User A0Y = AnonymousClass0wJ.A0Y(userSession2);
        AnonymousClass3WX.A01(A0Y.B4M(), A0Y.getId(), A0Y.BK7());
        C11630kW r3 = r22;
        if (!z || userSession2.multipleAccountHelper.A0L()) {
            if (C62433Zv.A02(CallerContext.A00(C67323zM.class), userSession2, "ig_login_util")) {
                C18180wK.A1K(C15730rn.A00(r3, "fb_existing_credentials_deleted"), userSession2);
            }
            C67363zQ.A0E(userSession2, false, false, true);
        } else if (C19573AyZ.A03(userSession2)) {
            AnonymousClass3LY.A00(userSession2).CWx(new C688045n());
        }
        if (activity2 instanceof C83644rk) {
            C83644rk r2 = (C83644rk) activity2;
            if (r2.BRB()) {
                String Ar0 = r2.Ar0();
                if (Ar0 == null || Ar0.isEmpty()) {
                    Ar0 = "0";
                }
                long A0B = C18200wM.A0B(userSession2);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession2), "ig_account_added"), 761);
                Long valueOf = Long.valueOf(A0B);
                A0I.A0S("pk_added", valueOf);
                A0I.A0S("updated_accounts_count", C18230wP.A0f(userSession2.multipleAccountHelper.A0B()));
                A0I.A0S("from_pk", AnonymousClass0wJ.A0d(Ar0));
                A0I.A0S("to_pk", valueOf);
                if (r22 == null) {
                    moduleName = null;
                } else {
                    moduleName = r3.getModuleName();
                }
                C18240wQ.A15(A0I, moduleName);
                A0I.Bb4();
                C63453hV.A01(AnonymousClass28R.INTRA_APP, userSession2, valueOf, valueOf, C18180wK.A0e(), "new_account_created", (String) null, (String) null, (String) null, d, true, false, true);
            }
        }
        Bundle A0C = C18190wL.A0C(activity2);
        if (A0C == null || !A0C.getBoolean("LAUNCH_CALLING_APPLICATION_PACKAGE") || (string = A0C.getString("CALLING_APPLICATION_PACKAGE_NAME")) == null || !C15610rb.A00.contains(string) || (packageManager = activity2.getPackageManager()) == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(string)) == null) {
            Uri uri2 = uri;
            Intent A03 = C62333Yi.A01().A03(activity2, 0);
            if (uri != null) {
                A03.setData(uri2);
            }
            A03.addFlags(268468224);
            A03.putExtra("LOGIN_EVENT", true);
            if (z2) {
                A03.putExtra("FORCE_LOGOUT_LOGIN_EVENT", true);
            }
            if (z3) {
                A03.putExtra("REACTIVATION_EVENT", true);
            }
            if (z4) {
                A03.putExtra("NDX_ACCOUNT_LOGIN_EVENT", true);
            }
            Class<AnonymousClass1Xb> cls = AnonymousClass1Xb.class;
            List A032 = AnonymousClass3ZR.A03(AnonymousClass3ZR.A00(activity2));
            if (A032 == null || A032.isEmpty() || !cls.isInstance(A032.get(A032.size() - 1)) || (bundle = ActivityOptions.makeCustomAnimation(activity2, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle()) == null) {
                C10650ih.A02(activity2, A03);
            } else {
                C10650ih.A00.A07().A07(activity2, A03, bundle);
            }
        } else {
            C10650ih.A0A(activity2, launchIntentForPackage);
        }
        activity2.finish();
    }

    public static void A06(Activity activity, Uri uri, C11630kW r9, UserSession userSession) {
        A07(activity, uri, r9, userSession, C18200wM.A00(), false, false, false, false);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static com.instagram.service.session.UserSession A03(android.content.Context r21, X.C11630kW r22, X.C07530bf r23, com.instagram.user.model.User r24, java.lang.String r25, boolean r26) {
        /*
            java.lang.String r5 = X.AnonymousClass269.A04()
            android.content.Context r0 = r21.getApplicationContext()
            r8 = r23
            X.7ek r1 = X.C18250wR.A0C(r8)
            monitor-enter(r1)
            monitor-exit(r1)
            r6 = r26
            if (r26 == 0) goto L_0x0024
            X.01V r3 = X.AnonymousClass01V.A0p
            r2 = 46333953(0x2c30001, float:2.8652677E-37)
            java.lang.String r1 = "afterAccountSwitch"
            r3.A0d(r2, r1)
            r2 = 4340(0x10f4, float:6.082E-42)
            r1 = 0
            r3.endAllMarkers(r2, r1)
        L_0x0024:
            X.0RA r3 = X.AnonymousClass0RG.A00()
            r4 = 0
            X.C04220Ms.A0B(r0, r4)
            X.0QC r1 = r3.A06
            com.instagram.service.session.UserSession r2 = r1.A00
            if (r2 == 0) goto L_0x0037
            X.0RK r1 = r3.A02
            r1.A02(r0, r2)
        L_0x0037:
            X.4KA r2 = new X.4KA
            r7 = r24
            r2.<init>(r8, r7, r6)
            X.C04220Ms.A0B(r7, r4)
            X.0RA r1 = X.AnonymousClass0RG.A00()
            com.instagram.service.session.UserSession r1 = r1.A02(r2, r7)
            X.3mW r2 = X.C64543mW.A00(r1)
            X.3BA r2 = r2.A00
            X.32i r2 = r2.A01
            r10 = 0
            r2.A00 = r10
            X.01V r3 = X.AnonymousClass01V.A0p
            java.lang.String r2 = r7.getId()
            r3.A0l(r2)
            java.lang.Class<X.3hs> r8 = X.C63593hs.class
            monitor-enter(r8)
            X.33y r2 = X.C63593hs.A02     // Catch:{ all -> 0x050c }
            android.content.SharedPreferences r2 = r2.A00     // Catch:{ all -> 0x050c }
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch:{ all -> 0x050c }
            java.lang.String r2 = "number_of_login_attempts"
            X.AnonymousClass0wJ.A11(r3, r2, r4)     // Catch:{ all -> 0x050c }
            monitor-exit(r8)
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r2 = 36318488268640731(0x810779000811db, double:3.0312964516778356E-306)
            boolean r2 = X.C63803iN.A0E(r8, r1, r2)
            if (r2 == 0) goto L_0x04c2
            X.1tl r9 = X.AnonymousClass3WS.A01(r1)
            r2 = 36318488268181973(0x810779000111d5, double:3.031296451387715E-306)
            boolean r2 = X.C63803iN.A0E(r8, r1, r2)
            if (r2 == 0) goto L_0x00c4
            X.DpN r3 = X.C25643DpN.A00(r1)
            java.lang.String r2 = "launcher"
            boolean r2 = r3.A01(r2)
            if (r2 == 0) goto L_0x00c4
            android.content.SharedPreferences r12 = r9.A00
            java.lang.String r11 = "mobile_config_last_sync_time_peak"
            r2 = 0
            long r16 = r12.getLong(r11, r2)
            long r12 = android.os.SystemClock.elapsedRealtime()
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x00ad
            int r11 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            r15 = 0
            if (r11 != 0) goto L_0x00ae
        L_0x00ad:
            r15 = 1
        L_0x00ae:
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 - r16
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 32
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.HOURS
            long r11 = r12.convert(r2, r11)
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x00c4
            if (r15 == 0) goto L_0x00d6
        L_0x00c4:
            X.3Vx r2 = X.C61823Vx.A01
            r2.A05(r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            android.content.SharedPreferences$Editor r11 = X.C28161tl.A02(r9)
            java.lang.String r9 = "mobile_config_last_sync_time_peak"
            X.AnonymousClass0wJ.A12(r11, r9, r2)
        L_0x00d6:
            X.0gW r3 = X.AnonymousClass0gN.A00()
            X.1mM r2 = new X.1mM
            r2.<init>(r0)
            r3.AKp(r2)
            X.49X r11 = X.AnonymousClass49X.A00(r1)
            X.3an r2 = X.C62813an.A01(r1)
            X.3Yv r9 = r2.A00
            java.lang.String r3 = r1.getUserId()
            java.util.HashMap r2 = r9.A00
            java.lang.Object r2 = r2.remove(r3)
            if (r2 == 0) goto L_0x0101
            java.util.HashMap r2 = r9.A00
            java.util.Collection r2 = r2.values()
            r9.A03(r2)
        L_0x0101:
            r9 = r25
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x04bd
            X.0dD r2 = X.C08360dF.A00()
            r11 = 1
            android.content.SharedPreferences$Editor r3 = X.C18220wO.A0B(r2)
            java.lang.String r2 = "has_child_account_login"
            X.AnonymousClass0wJ.A13(r3, r2, r11)
            java.lang.String r2 = r1.getUserId()
            java.lang.Long r11 = X.AnonymousClass0wJ.A0d(r2)
            X.0nS r3 = X.C13330nS.A02(r1)
            java.lang.String r2 = "ig_one_login_nonce_received"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r2)
            r2 = 1392(0x570, float:1.95E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r2)
            java.lang.String r13 = "waterfall_id"
            r3.A0T(r13, r5)
            java.lang.String r2 = "main_account_id"
            r3.A0S(r2, r11)
            r3.Bb4()
            X.0BO r2 = r1.multipleAccountHelper
            java.util.List r11 = r2.A0G(r10)
            X.0nS r3 = X.C13330nS.A02(r1)
            java.lang.String r2 = "ig_one_login_request_sent"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r2)
            r2 = 1393(0x571, float:1.952E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r12 = X.C18180wK.A0I(r3, r2)
            r12.A0T(r13, r5)
            java.util.Set r11 = X.AnonymousClass3JN.A00(r11)
            java.lang.String r3 = "array_logged_in_account_ids"
            X.0A2 r2 = r12.A00
            r2.A7d(r11, r3)
            r12.Bb4()
            X.0BO r2 = r1.multipleAccountHelper
            java.util.List r3 = r2.A0G(r10)
            java.lang.String r2 = ","
            java.lang.String r12 = android.text.TextUtils.join(r2, r3)
            X.H1T r11 = X.AnonymousClass0wJ.A0O(r1)
            java.lang.String r2 = "multiple_accounts/multi_account_login/"
            r11.A0J(r2)
            java.lang.Class<X.1Sv> r3 = X.C21961Sv.class
            java.lang.Class<X.3JP> r2 = X.AnonymousClass3JP.class
            r11.A0B(r3, r2)
            java.lang.String r13 = X.C09140ev.A00(r0)
            r3 = 9
            r2 = 25
            java.lang.String r2 = X.C61943Wl.A01(r4, r3, r2)
            X.C18180wK.A0t(r0, r11, r2, r13)
            java.lang.String r2 = "mac_login_nonce"
            r11.A0O(r2, r9)
            java.lang.String r2 = "logged_in_user_ids"
            X.H8c r3 = X.C18200wM.A0T(r11, r2, r12)
            X.1hK r2 = new X.1hK
            r11 = r22
            r2.<init>(r11, r1, r5)
            r3.A00 = r2
            X.C31155GhB.A03(r3)
        L_0x01a5:
            X.3Yv r5 = X.C62353Yv.A00(r1)
            java.lang.String r3 = r7.getId()
            java.util.HashMap r2 = r5.A01
            java.lang.Object r2 = r2.remove(r3)
            if (r2 == 0) goto L_0x01be
            java.util.HashMap r2 = r5.A01
            java.util.Collection r2 = r2.values()
            r5.A04(r2)
        L_0x01be:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto L_0x01c7
            X.AnonymousClass7GV.A01()
        L_0x01c7:
            boolean r2 = X.C63853iS.A0F(r0, r1)
            X.C63853iS.A0D(r0, r1, r2)
            if (r26 == 0) goto L_0x050b
            X.0TJ r5 = X.AnonymousClass0TJ.A06
            r2 = 36321009413921233(0x8109c4000019d1, double:3.032890834105062E-306)
            boolean r2 = X.C63803iN.A0E(r5, r1, r2)
            boolean r2 = X.C18180wK.A1V(r2)
            if (r2 == 0) goto L_0x01f9
            android.net.Uri r12 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r2 = X.C63853iS.A0F(r0, r1)
            if (r2 == 0) goto L_0x01ec
            X.C63853iS.A0C(r0, r1)
        L_0x01ec:
            android.app.NotificationManager r11 = X.C18250wR.A03(r0)
            if (r11 != 0) goto L_0x0221
            java.lang.String r3 = "NotificationChannelsHelper"
            java.lang.String r2 = "Unable to fetch the Notification Manager Service"
            X.C10450iM.A03(r3, r2)
        L_0x01f9:
            boolean r2 = X.C34832Lb.A00(r0, r1)
            if (r2 == 0) goto L_0x021c
            r2 = 36312934875399392(0x81026c000004e0, double:3.027784463430293E-306)
            boolean r2 = X.C63803iN.A0E(r8, r1, r2)
            if (r2 == 0) goto L_0x021c
            X.36q r2 = X.C563036q.A01
            if (r2 != 0) goto L_0x0215
            X.36q r2 = new X.36q
            r2.<init>()
            X.C563036q.A01 = r2
        L_0x0215:
            com.instagram.contacts.ccu.impl.CCUPluginImpl r2 = r2.A00
            if (r2 == 0) goto L_0x021c
            r2.initScheduler(r0, r1)
        L_0x021c:
            java.lang.Class<X.3hV> r5 = X.C63453hV.class
            monitor-enter(r5)
            goto L_0x04c9
        L_0x0221:
            X.C63853iS.A07(r11, r0, r1)
            X.3SB r2 = X.AnonymousClass3SB.A01
            if (r2 != 0) goto L_0x022f
            X.3SB r2 = new X.3SB
            r2.<init>(r0)
            X.AnonymousClass3SB.A01 = r2
        L_0x022f:
            android.content.SharedPreferences r5 = r2.A00
            java.lang.String r3 = "CHANNELS_VERSION"
            r7 = 1
            int r6 = r5.getInt(r3, r7)
            r2 = 2
            if (r6 >= r2) goto L_0x04b5
            java.lang.String r2 = "likes"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "comments"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "comment_likes"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "likes_and_comments_on_photos_of_you"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "view_counts"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "photos_of_you"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "mentions_in_bio"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "private_user_follow_request"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "new_followers"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "friends_on_instagram"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "first_posts_and_stories"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "live_videos"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "reminders"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "product_announcements"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "support_requests"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "igtv_video_updates"
            r11.deleteNotificationChannel(r2)
            java.lang.String r2 = "other"
            r11.deleteNotificationChannel(r2)
        L_0x0290:
            java.lang.String r2 = "ig_direct_incoming_video_chat"
            r11.deleteNotificationChannel(r2)
        L_0x0295:
            java.lang.String r2 = "ig_direct_incoming_video_call"
            r11.deleteNotificationChannel(r2)
        L_0x029a:
            r6 = 4
            android.content.SharedPreferences$Editor r2 = r5.edit()
            X.AnonymousClass0wJ.A11(r2, r3, r6)
            boolean r2 = X.C09650fs.A04(r0)
            if (r2 == 0) goto L_0x0474
            r2 = 2131831907(0x7f112c63, float:1.9296853E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r14 = "DIRECT"
            android.app.NotificationChannelGroup r2 = new android.app.NotificationChannelGroup
            r2.<init>(r14, r3)
            r11.createNotificationChannelGroup(r2)
            r2 = 2131099717(0x7f060045, float:1.7811795E38)
            int r17 = r0.getColor(r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831892(0x7f112c54, float:1.9296822E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_direct_requests"
            r20 = r7
            r18 = r4
            r19 = r7
            r16 = r6
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831891(0x7f112c53, float:1.929682E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_direct"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831893(0x7f112c55, float:1.9296824E38)
            java.lang.String r15 = r3.getString(r2)
            r2 = 2131100210(0x7f060232, float:1.7812795E38)
            int r17 = r0.getColor(r2)
            java.lang.String r13 = "ig_direct_video_chat"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 2131831908(0x7f112c64, float:1.9296855E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r5 = "IG"
            android.app.NotificationChannelGroup r2 = new android.app.NotificationChannelGroup
            r2.<init>(r5, r3)
            r11.createNotificationChannelGroup(r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831895(0x7f112c57, float:1.9296829E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_likes"
            r16 = 3
            r12 = r10
            r14 = r5
            r17 = r4
            r18 = r7
            r19 = r4
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 36320575622223947(0x81095f0000184b, double:3.0326165024889597E-306)
            boolean r2 = X.C63803iN.A0E(r8, r1, r2)
            X.C63853iS.A08(r11, r0, r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831885(0x7f112c4d, float:1.9296808E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_comment_likes"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831894(0x7f112c56, float:1.9296826E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_likes_and_comments_on_photos_of_you"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831906(0x7f112c62, float:1.929685E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_view_counts"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831900(0x7f112c5c, float:1.9296839E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_photos_of_you"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831897(0x7f112c59, float:1.9296833E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_mentions_in_bio"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831883(0x7f112c4b, float:1.9296804E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_private_user_follow_request"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831898(0x7f112c5a, float:1.9296835E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_new_followers"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831888(0x7f112c50, float:1.9296814E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_friends_on_instagram"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831887(0x7f112c4f, float:1.9296812E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_first_posts_and_stories"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.C63853iS.A0A(r11, r0, r4)
            r2 = 36320575622289484(0x81095f0001184c, double:3.0326165025304055E-306)
            boolean r2 = X.C63803iN.A0E(r8, r1, r2)
            X.C63853iS.A09(r11, r0, r2)
            X.1zO r2 = X.AnonymousClass2LV.A00(r0, r1)
            X.C63853iS.A06(r11, r0, r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831902(0x7f112c5e, float:1.9296843E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_product_announcements"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831904(0x7f112c60, float:1.9296847E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_support_requests"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831884(0x7f112c4c, float:1.9296806E38)
            java.lang.String r21 = r3.getString(r2)
            java.lang.String r19 = "ig_alerts"
            r17 = r11
            r18 = r10
            r20 = r5
            r22 = r6
            r23 = r4
            r24 = r7
            r25 = r7
            r26 = r7
            X.AnonymousClass3Zd.A02(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 2131831910(0x7f112c66, float:1.9296859E38)
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r3 = "IGTV"
            android.app.NotificationChannelGroup r2 = new android.app.NotificationChannelGroup
            r2.<init>(r3, r9)
            r11.createNotificationChannelGroup(r2)
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2131831890(0x7f112c52, float:1.9296818E38)
            java.lang.String r15 = r9.getString(r2)
            java.lang.String r13 = "ig_igtv_video_updates"
            r14 = r3
            r17 = r4
            r18 = r7
            r19 = r4
            r20 = r7
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r9 = r0.getResources()
            r2 = 2131831889(0x7f112c51, float:1.9296816E38)
            java.lang.String r15 = r9.getString(r2)
            java.lang.String r13 = "ig_igtv_recommended_videos"
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831909(0x7f112c65, float:1.9296857E38)
            java.lang.String r15 = r3.getString(r2)
            r2 = 2131099717(0x7f060045, float:1.7811795E38)
            int r17 = r0.getColor(r2)
            java.lang.String r13 = "ig_shopping_drops"
            r14 = r5
            r16 = r6
            r18 = r4
            r19 = r7
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0474:
            r2 = 2131831908(0x7f112c64, float:1.9296855E38)
            java.lang.String r3 = r0.getString(r2)
            java.lang.String r5 = "IG"
            android.app.NotificationChannelGroup r2 = new android.app.NotificationChannelGroup
            r2.<init>(r5, r3)
            r11.createNotificationChannelGroup(r2)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831905(0x7f112c61, float:1.9296849E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "uploads"
            r16 = 2
            r12 = r10
            r14 = r5
            r17 = r4
            r18 = r7
            r19 = r4
            r20 = r7
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131831899(0x7f112c5b, float:1.9296837E38)
            java.lang.String r15 = r3.getString(r2)
            java.lang.String r13 = "ig_other"
            r16 = 3
            X.AnonymousClass3Zd.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01f9
        L_0x04b5:
            r2 = 3
            if (r6 < r2) goto L_0x0290
            r2 = 4
            if (r6 >= r2) goto L_0x029a
            goto L_0x0295
        L_0x04bd:
            r11.A04()
            goto L_0x01a5
        L_0x04c2:
            X.3Vx r2 = X.C61823Vx.A01
            r2.A05(r1)
            goto L_0x00d6
        L_0x04c9:
            boolean r0 = X.C63453hV.A04     // Catch:{ all -> 0x0507 }
            if (r0 == 0) goto L_0x04fa
            monitor-enter(r5)     // Catch:{ all -> 0x0507 }
            X.01V r6 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x04f6 }
            X.C04220Ms.A06(r6)     // Catch:{ all -> 0x04f6 }
            long r2 = X.C63453hV.A01     // Catch:{ all -> 0x04f6 }
            r7 = 857811724(0x33212b0c, float:3.7524885E-8)
            r6.A0b(r7, r2)     // Catch:{ all -> 0x04f6 }
            java.lang.String r2 = "entry_point"
            java.lang.String r0 = X.C63453hV.A02     // Catch:{ all -> 0x04f6 }
            r6.markerAnnotate((int) r7, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x04f6 }
            java.lang.String r2 = "native_or_bloks"
            java.lang.String r0 = X.C63453hV.A03     // Catch:{ all -> 0x04f6 }
            r6.markerAnnotate((int) r7, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x04f6 }
            r8 = 2
            X.0Kk r0 = X.C63453hV.A05     // Catch:{ all -> 0x04f6 }
            long r9 = r0.now()     // Catch:{ all -> 0x04f6 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x04f6 }
            r6.markerEnd(r7, r8, r9, r11)     // Catch:{ all -> 0x04f6 }
            goto L_0x04f9
        L_0x04f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0507 }
            throw r0     // Catch:{ all -> 0x0507 }
        L_0x04f9:
            monitor-exit(r5)     // Catch:{ all -> 0x0507 }
        L_0x04fa:
            X.C63453hV.A04 = r4     // Catch:{ all -> 0x0507 }
            r2 = 0
            X.C63453hV.A01 = r2     // Catch:{ all -> 0x0507 }
            java.lang.String r0 = ""
            X.C63453hV.A02 = r0     // Catch:{ all -> 0x0507 }
            X.C63453hV.A03 = r0     // Catch:{ all -> 0x0507 }
            goto L_0x050a
        L_0x0507:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x050a:
            monitor-exit(r5)
        L_0x050b:
            return r1
        L_0x050c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67323zM.A03(android.content.Context, X.0kW, X.0bf, com.instagram.user.model.User, java.lang.String, boolean):com.instagram.service.session.UserSession");
    }
}
