package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49j  reason: invalid class name and case insensitive filesystem */
public final class C696349j implements AnonymousClass0i4, C10270i0 {
    public static Fragment A0F;
    public long A00 = 0;
    public Dialog A01;
    public UserSession A02;
    public AnonymousClass24O A03;
    public boolean A04 = false;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public long A08 = 0;
    public long A09 = 0;
    public long A0A = 0;
    public TimeInAppReminder A0B;
    public final Handler A0C = AnonymousClass0wJ.A0F();
    public final L5D A0D;
    public final Runnable A0E = new AnonymousClass4QT(this);

    public static synchronized void A08(C696349j r14) {
        synchronized (r14) {
            long currentTimeMillis = System.currentTimeMillis();
            r14.A05 = currentTimeMillis;
            UserSession userSession = r14.A02;
            AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
            if (C63803iN.A03(r8, userSession, 36597609603467957L) > 0 || C63803iN.A03(r8, userSession, 36597609603533494L) > 0) {
                long j = r14.A0A;
                long j2 = 0;
                if (j > 0) {
                    long j3 = r14.A09;
                    if (j3 > 0) {
                        long j4 = (currentTimeMillis - j3) / 1000;
                        long j5 = j3 - j;
                        if (j4 > C63803iN.A03(r8, userSession, 36597609603467957L)) {
                            r14.A00 = 0;
                        } else {
                            r14.A00 += j5 / 1000;
                        }
                        if (j4 <= C63803iN.A03(r8, userSession, 36597609603533494L)) {
                            j2 = r14.A08 + (j5 / 1000);
                        }
                        r14.A08 = j2;
                    }
                }
            }
            r14.A0A = System.currentTimeMillis();
        }
    }

    public static void A09(C696349j r9, int i) {
        try {
            C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r9, 7), 1869849473, 3, (int) C18220wO.A09(i), false, true);
        } catch (Exception e) {
            C10450iM.A07("InstagramTimeSpentLogger_scheduleReminderTaskWithFallback", e);
            try {
                C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r9, 7), 1869849473, 3, (int) C18220wO.A09(10), false, true);
            } catch (Exception e2) {
                C10450iM.A07("InstagramTimeSpentLogger_handleSchedulingFailure", e2);
            }
        }
    }

    public static void A0A(C696349j r6, int i) {
        C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r6, 6), 1218371471, 3, (int) C18220wO.A09(i), true, true);
    }

    public static boolean A0F(String str, String str2) {
        String str3;
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = H5O.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity == null) {
            return false;
        }
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Fragment A0O = supportFragmentManager.A0O(str);
        if (A0O != null) {
            return A0O.isVisible();
        }
        for (Fragment fragment : supportFragmentManager.A0T.A04()) {
            if (fragment.isVisible() && (str3 = fragment.mTag) != null && str3.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void A0K() {
        AnonymousClass3VQ.A01.A01(this.A0B, 0);
        C18180wK.A0v(C62803am.A00(C63043bN.A01, this.A02), "TAB_REMINDER_TYPE", "");
    }

    public final synchronized void Bks(C10300i6 r11) {
        String str;
        UserSession userSession;
        String string;
        this.A09 = System.currentTimeMillis();
        Fragment fragment = A0F;
        if (fragment == null || !fragment.isVisible()) {
            if (A0F("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment")) {
                userSession = this.A02;
                str = C62803am.A01(C63043bN.A01, userSession).getString("TAB_REMINDER_TYPE", "");
                if (str == null) {
                    str = "";
                }
            } else {
                Iterator it = C63433hT.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C34640IcN icN = (C34640IcN) it.next();
                        if (icN.isVisible()) {
                            Bundle bundle = icN.mArguments;
                            if (bundle != null && (string = bundle.getString("reminder_type")) != null && AnonymousClass24O.valueOf(string).ordinal() == 1) {
                                userSession = this.A02;
                                str = "take_break";
                            }
                        }
                    }
                }
            }
            C04220Ms.A0B(userSession, 0);
            C63583hq.A03(userSession, AnonymousClass006.A0A, (Integer) null, (Long) null, (Long) null, (Long) null, str);
        } else {
            UserSession userSession2 = this.A02;
            C04220Ms.A0B(userSession2, 0);
            C63583hq.A03(userSession2, AnonymousClass006.A08, (Integer) null, (Long) null, (Long) null, (Long) null, "take_break");
        }
        try {
            UserSession userSession3 = this.A02;
            if (C63823iP.A0D(userSession3)) {
                C63823iP.A0A(userSession3);
            }
            if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A02, 36316134627150828L)) {
                C63583hq.A00(userSession3, A01(this));
            }
        } catch (Exception e) {
            C10450iM.A07("quiet_mode_background_tasks", e);
        }
        return;
    }

    public final synchronized void onSessionWillEnd() {
        UserSession userSession;
        this.A09 = System.currentTimeMillis();
        if (AnonymousClass1lQ.A00() != null) {
            AnonymousClass1lQ.A00().A00.remove(this);
        }
        if (A0D(this)) {
            A0K();
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A02, 36316134627150828L)) {
            C63583hq.A00(this.A02, A01(this));
        }
        L5D l5d = this.A0D;
        if (!(l5d == null || (userSession = this.A02) == null || AnonymousClass3LY.A00(userSession) == null)) {
            AnonymousClass3LY.A00(userSession).A02(l5d, AnonymousClass46R.class);
        }
        this.A0C.removeCallbacks(this.A0E);
    }

    public static final long A00() {
        int[] A022 = AnonymousClass3VQ.A01.A02(AnonymousClass0wJ.A0A() / 1000);
        int length = A022.length;
        if (length > 0) {
            return (long) A022[length - 1];
        }
        return 0;
    }

    public static C696349j A03(UserSession userSession) {
        return (C696349j) C18180wK.A0c(userSession, C696349j.class, 32);
    }

    public static void A05(C696349j r9) {
        UserSession userSession = r9.A02;
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r6, userSession, 36316134627150828L)) {
            long j = r9.A06;
            UserSession userSession2 = r9.A02;
            if (C63803iN.A03(r6, userSession2, 36597609604385468L) < C18240wQ.A09(j)) {
                if (C31156GhE.A06()) {
                    A07(r9);
                } else {
                    C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r9, 9), 1261828832, 3, (int) TimeUnit.SECONDS.toMillis(C63803iN.A03(r6, userSession2, 36597609604254395L)), false, false);
                }
                r9.A06 = System.currentTimeMillis();
            }
        }
    }

    public static void A06(C696349j r1) {
        Dialog dialog = r1.A01;
        if (dialog != null) {
            dialog.dismiss();
            r1.A01 = null;
        }
    }

    public static boolean A0B(C696349j r7) {
        UserSession userSession = r7.A02;
        long A042 = C63043bN.A01.A04(userSession);
        boolean A022 = C63043bN.A02(userSession);
        long A002 = A00() - C63043bN.A00(userSession);
        if (A042 <= 0 || !A022 || A002 < A042) {
            return false;
        }
        return true;
    }

    public static boolean A0C(C696349j r2) {
        C84674tf A0Z = AnonymousClass0wJ.A0Y(r2.A02).A0Z();
        if (A0Z == null || A0Z.BYw() == null || !A0Z.BYw().booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0D(C696349j r3) {
        return C63803iN.A0E(AnonymousClass0TJ.A05, r3.A02, 36316134626036703L);
    }

    public static boolean A0E(C696349j r4) {
        UserSession userSession = r4.A02;
        String string = C62803am.A01(C63043bN.A01, userSession).getString("TAB_REMINDER_TYPE", "");
        if (string == null) {
            string = "";
        }
        if (string.equals("guardian_daily_limit_near") || string.equals("scheduled_break_reminder")) {
            C10450iM.A03("InstagramTimeSpentLogger_shouldDismissBlockingScreen", AnonymousClass00U.A0L("Reminder type should correspond to a blocking screen:", string));
            return false;
        } else if ((A0F("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") || A0F("extension_request_fragment", "extension_request_fragment")) && !A0B(r4) && C63193gy.A01(userSession) == null) {
            return true;
        } else {
            return false;
        }
    }

    public final void A0H() {
        C84454tA ArU;
        XFBYPRequestStatus BDh;
        String id;
        UserSession userSession = this.A02;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36322370918554945L) && this.A03 == AnonymousClass24O.DAILY_LIMIT && C63043bN.A02(userSession)) {
            C04620Ok r0 = C06810aP.A01;
            C04220Ms.A0A(userSession);
            C84674tf A0Z = r0.A01(userSession).A0Z();
            if (A0Z != null && (ArU = A0Z.ArU()) != null && (BDh = ArU.BDh()) != null && BDh.equals(XFBYPRequestStatus.ACCEPTED) && (id = ArU.getId()) != null && !C62803am.A01(C63043bN.A01, userSession).getBoolean(AnonymousClass00U.A0L("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", id), false)) {
                C73444Sl r2 = new C73444Sl(ArU, this, id);
                C63643hy.A03(r2);
                C63643hy.A06(r2, 2000);
            }
        }
    }

    public final void A0I() {
        C31155GhB.A05(AnonymousClass3OP.A01(this.A02, "mute_all", "cancel"), 604052308, 3, true, true);
    }

    public final void A0J() {
        H1T A0O = C18180wK.A0O(this.A02);
        A0O.A0J("mental_well_being/get_daily_limit_settings/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C21531Re.class, C59103Jn.class);
        C63873iU.A0E(A0T, this, 185);
        C31155GhB.A03(A0T);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0L() {
        /*
            r23 = this;
            r9 = r23
            monitor-enter(r9)
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x028b }
            r3 = 86400(0x15180, double:4.26873E-319)
            X.24O[] r8 = X.AnonymousClass24O.values()     // Catch:{ all -> 0x028b }
            int r7 = r8.length     // Catch:{ all -> 0x028b }
            r6 = 0
            r5 = 0
        L_0x0011:
            if (r5 >= r7) goto L_0x01a9
            r2 = r8[r5]     // Catch:{ all -> 0x028b }
            int r1 = r2.ordinal()     // Catch:{ all -> 0x0289 }
            r21 = 0
            if (r1 == r6) goto L_0x0095
            r14 = 1
            if (r1 == r14) goto L_0x0079
            r0 = 2
            if (r1 == r0) goto L_0x0066
            r0 = 3
            if (r1 == r0) goto L_0x0034
            r0 = 4
            if (r1 == r0) goto L_0x0034
            java.lang.String r11 = "InstagramTimeSpentLogger_handleSchedulingFailure"
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0289 }
            X.C18250wR.A1G(r1, r0, r11)     // Catch:{ all -> 0x0289 }
            goto L_0x01a5
        L_0x0034:
            com.instagram.service.session.UserSession r11 = r9.A02     // Catch:{ all -> 0x0289 }
            X.0Ok r0 = X.C06810aP.A01     // Catch:{ all -> 0x0289 }
            X.C04220Ms.A0A(r11)     // Catch:{ all -> 0x0289 }
            com.instagram.user.model.User r0 = r0.A01(r11)     // Catch:{ all -> 0x0289 }
            X.4tf r0 = r0.A0Z()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            java.lang.Boolean r0 = r0.BXf()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            X.C04220Ms.A0B(r11, r6)     // Catch:{ all -> 0x0289 }
            java.util.List r1 = X.C62803am.A02(r11)     // Catch:{ all -> 0x0289 }
            if (r1 == 0) goto L_0x01a5
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x00a2
            goto L_0x01a5
        L_0x0066:
            com.instagram.service.session.UserSession r11 = r9.A02     // Catch:{ all -> 0x0289 }
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r12 = r0.A04(r11)     // Catch:{ all -> 0x0289 }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            boolean r0 = X.C63043bN.A02(r11)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            goto L_0x00b8
        L_0x0079:
            boolean r0 = A0D(r9)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            com.instagram.service.session.UserSession r11 = r9.A02     // Catch:{ all -> 0x0289 }
            X.3am r1 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r12 = r1.A05(r11)     // Catch:{ all -> 0x0289 }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            android.content.SharedPreferences$Editor r1 = X.C62803am.A00(r1, r11)     // Catch:{ all -> 0x0289 }
            java.lang.String r0 = "HAS_USER_EVER_SET_BREAKS"
            X.AnonymousClass0wJ.A13(r1, r0, r14)     // Catch:{ all -> 0x0289 }
            goto L_0x00b8
        L_0x0095:
            com.instagram.service.session.UserSession r11 = r9.A02     // Catch:{ all -> 0x0289 }
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r12 = r0.A04(r11)     // Catch:{ all -> 0x0289 }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            goto L_0x00b8
        L_0x00a2:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0289 }
        L_0x00a6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0289 }
            X.4t9 r0 = (X.C84444t9) r0     // Catch:{ all -> 0x0289 }
            boolean r0 = X.C63193gy.A04(r0)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x00a6
        L_0x00b8:
            long r12 = X.AnonymousClass0wJ.A0A()     // Catch:{ all -> 0x0289 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r0
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0289 }
            long r19 = r19 / r0
            long r19 = r19 - r12
            X.0TJ r12 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x0289 }
            r0 = 36598752064179139(0x82065f00020bc3, double:3.208536404508047E-306)
            long r17 = X.C63803iN.A03(r12, r11, r0)     // Catch:{ all -> 0x0289 }
            long r13 = X.C63043bN.A00(r11)     // Catch:{ all -> 0x0289 }
            int r1 = r2.ordinal()     // Catch:{ all -> 0x0289 }
            if (r1 == r6) goto L_0x017c
            r0 = 1
            if (r1 == r0) goto L_0x015b
            r0 = 2
            if (r1 == r0) goto L_0x0152
            r0 = 3
            r15 = 0
            if (r1 == r0) goto L_0x00f5
            r0 = 4
            if (r1 == r0) goto L_0x00f5
            java.lang.String r11 = "InstagramTimeSpentLogger_handleSchedulingFailure"
            java.lang.String r1 = "Unrecognized reminder type "
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0289 }
            X.C18250wR.A1G(r1, r0, r11)     // Catch:{ all -> 0x0289 }
            goto L_0x0191
        L_0x00f5:
            X.0Ok r0 = X.C06810aP.A01     // Catch:{ all -> 0x0289 }
            X.C04220Ms.A0A(r11)     // Catch:{ all -> 0x0289 }
            com.instagram.user.model.User r0 = r0.A01(r11)     // Catch:{ all -> 0x0289 }
            X.4tf r0 = r0.A0Z()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            java.lang.Boolean r0 = r0.BXf()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            X.4t9 r0 = X.C63193gy.A02(r11)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            java.lang.Integer r1 = r0.BDN()     // Catch:{ all -> 0x0289 }
            if (r1 == 0) goto L_0x0191
            X.4t9 r0 = X.C63193gy.A01(r11)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x012f
            X.24O r0 = X.AnonymousClass24O.SCHEDULED_BREAK     // Catch:{ all -> 0x0289 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            long r15 = A00()     // Catch:{ all -> 0x0289 }
            goto L_0x0191
        L_0x012f:
            X.4t9 r0 = X.C63193gy.A02(r11)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0191
            int r0 = r1.intValue()     // Catch:{ all -> 0x0289 }
            long r0 = (long) r0     // Catch:{ all -> 0x0289 }
            int r11 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0191
            X.24O r11 = X.AnonymousClass24O.SCHEDULED_BREAK_REMINDER     // Catch:{ all -> 0x0289 }
            boolean r11 = r2.equals(r11)     // Catch:{ all -> 0x0289 }
            if (r11 != 0) goto L_0x0148
            r17 = 0
        L_0x0148:
            long r15 = A00()     // Catch:{ all -> 0x0289 }
            long r0 = r0 - r19
            long r15 = r15 + r0
            long r15 = r15 - r17
            goto L_0x0191
        L_0x0152:
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r15 = r0.A04(r11)     // Catch:{ all -> 0x0289 }
            long r15 = r15 - r17
            goto L_0x0190
        L_0x015b:
            long r15 = A00()     // Catch:{ all -> 0x0289 }
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r13 = r0.A05(r11)     // Catch:{ all -> 0x0289 }
            r0 = 36597609603467957(0x820555000b0ab5, double:3.2078139077539755E-306)
            long r11 = X.C63803iN.A03(r12, r11, r0)     // Catch:{ all -> 0x0289 }
            int r0 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0190
            long r0 = r9.A00     // Catch:{ all -> 0x0289 }
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0179
            goto L_0x018e
        L_0x0179:
            long r15 = r15 + r13
            long r15 = r15 - r0
            goto L_0x0191
        L_0x017c:
            boolean r0 = A0B(r9)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0187
            long r15 = A00()     // Catch:{ all -> 0x0289 }
            goto L_0x0191
        L_0x0187:
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x0289 }
            long r15 = r0.A04(r11)     // Catch:{ all -> 0x0289 }
            goto L_0x0190
        L_0x018e:
            r13 = 5
        L_0x0190:
            long r15 = r15 + r13
        L_0x0191:
            long r11 = A00()     // Catch:{ all -> 0x028b }
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01a5
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x028b }
            r10.put(r2, r0)     // Catch:{ all -> 0x028b }
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            r3 = r15
        L_0x01a5:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x01a9:
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x028b }
            java.util.Iterator r7 = X.C18190wL.A0u(r10)     // Catch:{ all -> 0x028b }
        L_0x01b1:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x01db
            java.util.Map$Entry r2 = X.C18180wK.A0o(r7)     // Catch:{ all -> 0x028b }
            java.lang.Object r1 = r2.getValue()     // Catch:{ all -> 0x028b }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x028b }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x028b }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r2.getKey()     // Catch:{ all -> 0x028b }
            X.24O r1 = (X.AnonymousClass24O) r1     // Catch:{ all -> 0x028b }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x028b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x028b }
            r5.put(r1, r0)     // Catch:{ all -> 0x028b }
            goto L_0x01b1
        L_0x01db:
            X.24O r2 = X.AnonymousClass24O.SCHEDULED_BREAK     // Catch:{ all -> 0x028b }
            boolean r0 = r5.containsKey(r2)     // Catch:{ all -> 0x028b }
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x028b }
            if (r0 != 0) goto L_0x01f7
            java.util.Set r0 = r5.keySet()     // Catch:{ all -> 0x028b }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ all -> 0x028b }
            r2 = r0[r6]     // Catch:{ all -> 0x028b }
            X.24O r2 = (X.AnonymousClass24O) r2     // Catch:{ all -> 0x028b }
            if (r2 != 0) goto L_0x01fc
        L_0x01f7:
            r9.A0K()     // Catch:{ all -> 0x028b }
            goto L_0x0287
        L_0x01fc:
            X.411 r5 = new X.411     // Catch:{ all -> 0x028b }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x028b }
            r9.A0B = r5     // Catch:{ all -> 0x028b }
            X.3VQ r1 = X.AnonymousClass3VQ.A01     // Catch:{ all -> 0x028b }
            int r0 = (int) r3     // Catch:{ all -> 0x028b }
            r1.A01(r5, r0)     // Catch:{ all -> 0x028b }
            com.instagram.service.session.UserSession r3 = r9.A02     // Catch:{ all -> 0x028b }
            X.0TJ r4 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x028b }
            r0 = 36316134627150828(0x81055500110bec, double:3.0298079993222674E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0243
            X.24O r0 = X.AnonymousClass24O.TAKE_A_BREAK     // Catch:{ all -> 0x028b }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0243
            long r7 = r9.A07     // Catch:{ all -> 0x028b }
            com.instagram.service.session.UserSession r3 = r9.A02     // Catch:{ all -> 0x028b }
            r0 = 36597609604385468(0x82055500190abc, double:3.207813908334213E-306)
            long r10 = X.C63803iN.A03(r4, r3, r0)     // Catch:{ all -> 0x028b }
            long r7 = X.C18240wQ.A09(r7)     // Catch:{ all -> 0x028b }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0243
            X.C04220Ms.A0B(r3, r6)     // Catch:{ all -> 0x028b }
            java.lang.Integer r0 = X.AnonymousClass006.A0J     // Catch:{ all -> 0x028b }
            X.C63583hq.A01(r3, r0)     // Catch:{ all -> 0x028b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x028b }
            r9.A07 = r0     // Catch:{ all -> 0x028b }
        L_0x0243:
            com.instagram.service.session.UserSession r10 = r9.A02     // Catch:{ all -> 0x028b }
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x028b }
            X.3am r0 = X.C63043bN.A01     // Catch:{ all -> 0x028b }
            android.content.SharedPreferences$Editor r1 = X.C62803am.A00(r0, r10)     // Catch:{ all -> 0x028b }
            java.lang.String r0 = "TAB_REMINDER_TYPE"
            X.C18180wK.A0v(r1, r0, r3)     // Catch:{ all -> 0x028b }
            int r1 = r2.ordinal()     // Catch:{ all -> 0x0289 }
            if (r1 == r6) goto L_0x0287
            r2 = 1
            if (r1 == r2) goto L_0x026c
            r0 = 2
            if (r1 == r0) goto L_0x0287
            r0 = 3
            if (r1 == r0) goto L_0x0287
            r0 = 4
            if (r1 == r0) goto L_0x0287
            java.lang.String r1 = "InstagramTimeSpentLogger_handleSchedulingFailure"
            java.lang.String r0 = "Unrecognized reminder type "
            X.C18250wR.A1G(r0, r3, r1)     // Catch:{ all -> 0x0289 }
            goto L_0x0287
        L_0x026c:
            r0 = 36316134626495460(0x81055500070be4, double:3.02980799890781E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)     // Catch:{ all -> 0x0289 }
            if (r0 == 0) goto L_0x0287
            X.C04220Ms.A0B(r10, r6)     // Catch:{ all -> 0x0289 }
            java.lang.Integer r11 = X.AnonymousClass006.A0J     // Catch:{ all -> 0x0289 }
            r12 = 0
            java.lang.String r16 = "take_break"
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r2
            X.C63583hq.A04(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0289 }
        L_0x0287:
            monitor-exit(r9)
            return
        L_0x0289:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x028b }
        L_0x028b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696349j.A0L():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (X.C63043bN.A02(r2) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bku(X.C10300i6 r10) {
        /*
            r9 = this;
            com.instagram.service.session.UserSession r2 = r9.A02
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36316134627019754(0x810555000f0bea, double:3.029807999239376E-306)
            boolean r0 = X.C63803iN.A0E(r7, r2, r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = X.C31156GhE.A06()
            if (r0 == 0) goto L_0x0086
        L_0x0015:
            A08(r9)
            A05(r9)
            com.instagram.service.session.UserSession r3 = r9.A02
            r0 = 36316134626102240(0x81055500010be0, double:3.029807998659136E-306)
            boolean r0 = X.C63803iN.A0E(r7, r3, r0)
            if (r0 != 0) goto L_0x002f
            boolean r1 = X.C63043bN.A02(r2)
            r0 = 5
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            A09(r9, r0)
            r0 = 36598752064310212(0x82065f00040bc4, double:3.208536404590938E-306)
            long r3 = X.C63803iN.A03(r7, r2, r0)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            r0 = 5
            A0A(r9, r0)
        L_0x0046:
            boolean r0 = A0C(r9)
            if (r0 == 0) goto L_0x004f
            r9.A0J()
        L_0x004f:
            X.3am r0 = X.C63043bN.A01
            long r3 = r0.A05(r2)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            com.instagram.service.session.UserSession r5 = r9.A02
            r0 = 36316134627150828(0x81055500110bec, double:3.0298079993222674E-306)
            boolean r0 = X.C63803iN.A0E(r7, r5, r0)
            if (r0 == 0) goto L_0x0086
            r0 = 10
            long r3 = r3 + r0
            int r1 = (int) r3
            r0 = 10
            com.instagram.common.task.IDxLTaskShape133S0100000_1_I2 r3 = new com.instagram.common.task.IDxLTaskShape133S0100000_1_I2     // Catch:{ Exception -> 0x0080 }
            r3.<init>(r9, r0)     // Catch:{ Exception -> 0x0080 }
            r4 = 1133647366(0x43921606, float:292.17206)
            r5 = 3
            r7 = 0
            r8 = 1
            long r0 = X.C18220wO.A09(r1)     // Catch:{ Exception -> 0x0080 }
            int r6 = (int) r0     // Catch:{ Exception -> 0x0080 }
            X.C31155GhB.A04(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "InstagramTimeSpentLogger_scheduleShouldHaveSeenTakeABreakTask"
            X.C10450iM.A07(r0, r1)
        L_0x0086:
            boolean r0 = X.C31156GhE.A06()
            if (r0 == 0) goto L_0x009d
            r0 = 5
            com.instagram.common.task.IDxLTaskShape133S0100000_1_I2 r3 = new com.instagram.common.task.IDxLTaskShape133S0100000_1_I2
            r3.<init>(r9, r0)
            r4 = 1440554863(0x55dd1f6f, float:3.03908845E13)
            r5 = 3
            r7 = 0
            r8 = 1
            r6 = 5000(0x1388, float:7.006E-42)
            X.C31155GhB.A04(r3, r4, r5, r6, r7, r8)
        L_0x009d:
            boolean r0 = X.C63823iP.A0D(r2)
            if (r0 == 0) goto L_0x00f0
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r1.A01(r2)
            boolean r0 = r0.A2w()
            if (r0 == 0) goto L_0x00f0
            boolean r0 = X.C31156GhE.A06()
            if (r0 == 0) goto L_0x00f0
            X.C63823iP.A0A(r2)     // Catch:{ Exception -> 0x00ea }
            X.MeW r0 = X.C18240wQ.A0W(r2, r1)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r1 = r0.ArG()     // Catch:{ Exception -> 0x00ea }
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = r0.getID()     // Catch:{ Exception -> 0x00ea }
            if (r1 == 0) goto L_0x00d1
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x00ea }
            if (r0 == 0) goto L_0x00d1
            return
        L_0x00d1:
            X.3H1 r5 = X.C54442zS.A00(r2)     // Catch:{ Exception -> 0x00ea }
            X.4UT r4 = new X.4UT     // Catch:{ Exception -> 0x00ea }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00ea }
            X.3V6 r3 = r5.A00     // Catch:{ Exception -> 0x00ea }
            r2 = 0
            r0 = 20
            kotlin.coroutines.jvm.internal.KtSLambdaShape19S0101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape19S0101000_I2     // Catch:{ Exception -> 0x00ea }
            r1.<init>(r5, r2, r0)     // Catch:{ Exception -> 0x00ea }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ Exception -> 0x00ea }
            r3.A00(r0, r4, r1)     // Catch:{ Exception -> 0x00ea }
            return
        L_0x00ea:
            r1 = move-exception
            java.lang.String r0 = "quiet_mode_startup_tasks"
            X.C10450iM.A07(r0, r1)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696349j.Bku(X.0i6):void");
    }

    public C696349j(UserSession userSession) {
        this.A02 = userSession;
        A0L();
        AnonymousClass1lQ.A00().A01(this);
        this.A0D = new IDxObjectShape277S0100000_1_I2(this, 10);
    }

    public static long A01(C696349j r6) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = r6.A0A;
        if (j <= 0 || currentTimeMillis < j) {
            return 0;
        }
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j);
    }

    public static AnonymousClass3DJ A02(AnonymousClass1ae r3) {
        return C63823iP.A06(AnonymousClass1ae.A00(r3), A03(AnonymousClass1ae.A00(r3)).A0G());
    }

    public static List A04(C696349j r10) {
        if (!A0C(r10)) {
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, r10.A02, 36316134627609582L)) {
                return Collections.emptyList();
            }
        }
        List A012 = C63433hT.A01(false, false);
        if (!A012.isEmpty() && Collections.frequency(A012, Double.valueOf(0.0d)) != A012.size()) {
            return A012;
        }
        UserSession userSession = r10.A02;
        C04220Ms.A0B(userSession, 0);
        C63583hq.A03(userSession, AnonymousClass006.A0b, (Integer) null, (Long) null, (Long) null, (Long) null, (String) null);
        return A012;
    }

    public static void A07(C696349j r15) {
        String str;
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        List A042 = A04(r15);
        UserSession userSession = r15.A02;
        C04220Ms.A0B(A042, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_time_spent_screen_time"), 1459);
        C18210wN.A1A(A0I, "ig_ts_session_start");
        A0I.A0R("usage_seconds", Double.valueOf((double) C63433hT.A00()));
        A0I.A0U("weekly_screen_time", A042);
        if (userSession != null) {
            if (!A042.isEmpty()) {
                AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
                if (C63803iN.A0E(r3, userSession, 36327052432910186L)) {
                    String id = TimeZone.getDefault().getID();
                    C04220Ms.A06(id);
                    A0I.A0T("timezone", id);
                    A0I.A0U("weekly_screen_time_utc", C63433hT.A01(true, C63803iN.A0E(r3, userSession, 36327052433237870L)));
                }
            }
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327052433500017L)) {
                try {
                    AnonymousClass376 r1 = (AnonymousClass376) AnonymousClass3VQ.A01.A00.get();
                    if (r1 != null) {
                        synchronized (r1) {
                            timeInAppControllerWrapper = r1.A00;
                        }
                        if (timeInAppControllerWrapper != null) {
                            str = timeInAppControllerWrapper.getCurrentState();
                        } else {
                            str = "no_state";
                        }
                    } else {
                        str = "unknown_state";
                    }
                } catch (Throwable unused) {
                    str = "exception";
                }
                A0I.A0V("extra_event_data", AnonymousClass4WK.A0O(C18180wK.A0p("AppStateManagerCurrentState", str)));
            }
        }
        A0I.Bb4();
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316134627478509L) && A0C(r15)) {
            if (A042.isEmpty() || Collections.frequency(A042, Double.valueOf(0.0d)) == A042.size()) {
                C31155GhB.A04(new IDxLTaskShape133S0100000_1_I2(r15, 8), 732786309, 3, 120000, false, true);
                C04220Ms.A0B(userSession, 0);
                C63583hq.A03(userSession, AnonymousClass006.A0c, (Integer) null, (Long) null, (Long) null, (Long) null, (String) null);
            }
        }
    }

    public final long A0G() {
        long currentTimeMillis = (System.currentTimeMillis() - this.A05) / 1000;
        if (C63803iN.A03(AnonymousClass0TJ.A05, this.A02, 36597609603533494L) > 0) {
            return currentTimeMillis + this.A08;
        }
        return currentTimeMillis;
    }
}
