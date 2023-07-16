package com.instagram.common.task;

import X.AnonymousClass11E;
import X.AnonymousClass1ZH;
import X.AnonymousClass1cj;
import X.AnonymousClass1x7;
import X.AnonymousClass3TJ;
import X.C10450iM;
import X.C18250wR;
import X.C23151ca;
import X.FR1;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

public class IDxLTaskShape133S0100000_1_I2 extends FR1 {
    public Object A00;
    public final int A01;

    public IDxLTaskShape133S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A02(Exception exc) {
        if (2 - this.A01 != 0) {
            super.A02(exc);
            return;
        }
        AnonymousClass1x7.A0C((AnonymousClass1x7) this.A00, true);
        C10450iM.A07("omvp_app_updates", exc);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str;
        switch (this.A01) {
            case 0:
                ((AnonymousClass1cj) this.A00).A0S = (List) obj;
                return;
            case 1:
                ((C23151ca) this.A00).A0F = (List) obj;
                return;
            case 2:
                AnonymousClass1x7 r1 = (AnonymousClass1x7) this.A00;
                r1.A00 = (AnonymousClass3TJ) obj;
                AnonymousClass1x7.A0C(r1, false);
                return;
            case 3:
                String str2 = (String) obj;
                try {
                    str = C18250wR.A0j(str2).toString(2);
                } catch (JSONException unused) {
                    str = null;
                }
                AnonymousClass11E r12 = ((AnonymousClass1ZH) this.A00).A01;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                r12.A00 = str2;
                r12.notifyItemChanged(0);
                return;
            default:
                super.A03(obj);
                return;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|137) */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C63813iO.A0D(r5.getContext(), X.AnonymousClass00U.A0L("Failure to read raw JSON from ", r5.A00.A00.toString()), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d3, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014b, code lost:
        if (X.C63803iN.A0E(r3, r5, 36320360873924530L) != false) goto L_0x0159;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r21 = this;
            r10 = r21
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0065;
                case 2: goto L_0x02a5;
                case 3: goto L_0x0086;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00ea;
                case 6: goto L_0x0024;
                case 7: goto L_0x01c6;
                case 8: goto L_0x0245;
                case 9: goto L_0x0296;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r10.A00
            X.49j r0 = (X.C696349j) r0
            com.instagram.service.session.UserSession r3 = r0.A02
            java.lang.String r9 = "take_break"
            long r1 = X.C696349j.A01(r0)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Integer r4 = X.AnonymousClass006.A0e
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r5 = 0
            r6 = r5
            r7 = r5
            X.C63583hq.A03(r3, r4, r5, r6, r7, r8, r9)
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.Object r12 = r10.A00
            X.49j r12 = (X.C696349j) r12
            com.instagram.service.session.UserSession r8 = r12.A02
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r6 = 36598752064310212(0x82065f00040bc4, double:3.208536404590938E-306)
            long r13 = X.C63803iN.A03(r4, r8, r6)
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            boolean r0 = X.C18180wK.A1X(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = X.C696349j.A0C(r12)
            if (r0 != 0) goto L_0x02b6
            r0 = 36317277087731238(0x81065f00060e26, double:3.030530495993638E-306)
            boolean r0 = X.C63803iN.A0E(r4, r8, r0)
            if (r0 != 0) goto L_0x02b6
            return r5
        L_0x0052:
            java.lang.Object r0 = r10.A00
            X.1cj r0 = (X.AnonymousClass1cj) r0
            android.content.Context r2 = r0.getContext()
            X.0bf r1 = r0.A0M
            r0 = 0
            X.AnonymousClass0wJ.A1N(r2, r1)
            java.util.List r5 = X.C63633hx.A01(r2, r0, r1, r0, r0)
            return r5
        L_0x0065:
            java.lang.Object r1 = r10.A00
            X.1ca r1 = (X.C23151ca) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x007e
            android.content.Context r2 = r1.getContext()
            X.0bf r1 = r1.A0B
            r0 = 0
            X.AnonymousClass0wJ.A1N(r2, r1)
            java.util.List r5 = X.C63633hx.A01(r2, r0, r1, r0, r0)
            return r5
        L_0x007e:
            java.lang.String r1 = "the context should not bu null."
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0086:
            java.lang.Object r5 = r10.A00
            X.1ZH r5 = (X.AnonymousClass1ZH) r5
            X.3HO r0 = r5.A00
            java.io.File r1 = r0.A01
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r4.<init>(r0)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x00b7 }
        L_0x00a1:
            int r1 = r4.read(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = -1
            if (r1 == r0) goto L_0x00ad
            r0 = 0
            r3.write(r2, r0, r1)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00a1
        L_0x00ad:
            java.lang.String r0 = "UTF-8"
            java.lang.String r5 = r3.toString(r0)     // Catch:{ Exception -> 0x00b7 }
            r4.close()
            return r5
        L_0x00b7:
            android.content.Context r2 = r5.getContext()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Failure to read raw JSON from "
            X.3HO r0 = r5.A00     // Catch:{ all -> 0x00d2 }
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r0.A00     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00d2 }
            r0 = 1
            X.C63813iO.A0D(r2, r1, r0)     // Catch:{ all -> 0x00d2 }
            r4.close()
            goto L_0x02a3
        L_0x00d2:
            r0 = move-exception
            r4.close()
            throw r0
        L_0x00d7:
            java.lang.Object r2 = r10.A00
            X.44Z r2 = (X.AnonymousClass44Z) r2
            com.instagram.service.session.UserSession r1 = r2.A00
            r5 = 0
            r0 = 1
            X.C04220Ms.A0B(r1, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r1)
            X.AnonymousClass44Z.A00(r1, r1, r0, r2)
            return r5
        L_0x00ea:
            java.lang.Object r6 = r10.A00
            X.49j r6 = (X.C696349j) r6
            com.instagram.service.session.UserSession r5 = r6.A02
            com.instagram.user.model.User r3 = X.AnonymousClass0wJ.A0Y(r5)
            X.3am r4 = X.C63043bN.A01
            r2 = 0
            android.content.SharedPreferences r1 = X.C62803am.A01(r4, r5)
            java.lang.String r0 = "HAS_EVER_ENABLED_QUIET_MODE"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x014d
            boolean r0 = r3.A2w()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r3.A3d()
            if (r0 != 0) goto L_0x014d
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36601835850829580(0x82092d00040f0c, double:3.210486603603198E-306)
            long r15 = X.C63803iN.A03(r3, r5, r0)
            r0 = 36601835850698507(0x82092d00020f0b, double:3.210486603520307E-306)
            long r7 = X.C63803iN.A03(r3, r5, r0)
            long r13 = X.AnonymousClass0wJ.A0A()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r11
            long r9 = r15 + r13
            int r0 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            long r13 = r13 + r7
            if (r0 < 0) goto L_0x0135
            r0 = 86400(0x15180, double:4.26873E-319)
            long r13 = r13 + r0
        L_0x0135:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r11
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x014d
            r0 = 36320360873924530(0x81092d000117b2, double:3.0324806947996864E-306)
            boolean r0 = X.C63803iN.A0E(r3, r5, r0)
            if (r0 != 0) goto L_0x0159
        L_0x014d:
            android.content.SharedPreferences r1 = r4.A06(r5)
            java.lang.String r0 = "BYPASS_QUIET_MODE_UPSELL_CHECKS"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x02a3
        L_0x0159:
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            java.util.ArrayList r0 = X.C60573Pq.A00(r5, r4)
            int r3 = r0.size()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36601835851616017(0x82092d00100f11, double:3.210486604100544E-306)
            int r2 = X.C63803iN.A01(r2, r5, r0)
            if (r3 >= r2) goto L_0x02a3
            long r2 = X.C18190wL.A07()
            X.C60573Pq.A01(r5, r4, r2)
            X.43s r2 = new X.43s
            r2.<init>(r6)
            X.3Ui r7 = new X.3Ui
            r7.<init>(r2, r5)
            long r2 = r6.A0G()
            X.3DJ r8 = X.C63823iP.A06(r5, r2)
            java.lang.String r18 = "in_app_upsell"
            com.instagram.service.session.UserSession r5 = r7.A02
            X.0TJ r4 = X.AnonymousClass0TJ.A06
            r2 = 36320360873924530(0x81092d000117b2, double:3.0324806947996864E-306)
            boolean r2 = X.C63803iN.A0E(r4, r5, r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "upsell_in_app_notif_enabled"
            kotlin.Pair r2 = X.C18180wK.A0p(r2, r3)
            long r0 = X.C63803iN.A03(r4, r5, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "in_app_upsell_impressions_limit"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r19 = X.AnonymousClass4WJ.A0G(r2, r0)
            java.lang.String r17 = "ig_quiet_mode_in_app_upsell_impression"
            r9 = 0
            r20 = 3960(0xf78, float:5.549E-42)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            X.AnonymousClass3Ui.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02a3
        L_0x01c6:
            java.lang.Object r2 = r10.A00
            X.49j r2 = (X.C696349j) r2
            android.app.Dialog r0 = r2.A01
            if (r0 == 0) goto L_0x021d
            com.instagram.service.session.UserSession r4 = r2.A02
            X.3am r0 = X.C63043bN.A01
            android.content.SharedPreferences r3 = X.C62803am.A01(r0, r4)
            java.lang.String r1 = "TAB_REMINDER_TYPE"
            java.lang.String r0 = ""
            java.lang.String r1 = r3.getString(r1, r0)
            if (r1 != 0) goto L_0x01e1
            r1 = r0
        L_0x01e1:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = r1.toUpperCase(r0)
            java.lang.String r0 = "take_break"
            boolean r0 = r3.equalsIgnoreCase(r0)
            java.lang.String r1 = "InstagramTimeSpentLogger_shouldDismissReminderDialog"
            if (r0 != 0) goto L_0x0214
            java.lang.String r0 = "scheduled_break"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0214
            java.lang.String r0 = "daily_limit"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0214
            X.24O r0 = X.AnonymousClass24O.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x020e }
            boolean r0 = X.C63193gy.A05(r4, r0)     // Catch:{ IllegalArgumentException -> 0x020e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x021d
            goto L_0x021a
        L_0x020e:
            java.lang.String r0 = "Bad Argument:"
            X.C18250wR.A1G(r0, r3, r1)
            goto L_0x021d
        L_0x0214:
            java.lang.String r0 = "Reminder type should correspond to a reminder dialog:"
            X.C18250wR.A1G(r0, r3, r1)
            goto L_0x021d
        L_0x021a:
            X.C696349j.A06(r2)
        L_0x021d:
            java.lang.String r1 = "time_spent_fully_blocking_screen"
            java.lang.String r0 = "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment"
            boolean r0 = X.C696349j.A0F(r1, r0)
            if (r0 != 0) goto L_0x022f
            java.lang.String r0 = "extension_request_fragment"
            boolean r0 = X.C696349j.A0F(r0, r0)
            if (r0 == 0) goto L_0x0241
        L_0x022f:
            boolean r0 = X.C696349j.A0E(r2)
            if (r0 == 0) goto L_0x0241
            X.C63433hT.A02()
            r2.A0I()
            r2.A0H()
            r0 = 0
            r2.A03 = r0
        L_0x0241:
            r2.A0L()
            goto L_0x02a3
        L_0x0245:
            java.lang.Object r0 = r10.A00
            X.49j r0 = (X.C696349j) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            java.util.List r6 = X.C696349j.A04(r0)
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            r5 = 0
            X.0nS r1 = X.C13330nS.A01(r5, r1)
            java.lang.String r0 = "ig_time_spent_screen_time"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1459(0x5b3, float:2.044E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "ig_ts_screen_time_data_fetch_retry_upload"
            X.C18210wN.A1A(r4, r0)
            long r2 = X.C63433hT.A00()
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "usage_seconds"
            r4.A0R(r0, r1)
            java.lang.String r0 = "weekly_screen_time"
            r4.A0U(r0, r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0292
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r1 = r0.getID()
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "timezone"
            r4.A0T(r0, r1)
        L_0x0292:
            r4.Bb4()
            return r5
        L_0x0296:
            boolean r0 = X.C31156GhE.A06()
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r0 = r10.A00
            X.49j r0 = (X.C696349j) r0
            X.C696349j.A07(r0)
        L_0x02a3:
            r5 = 0
            return r5
        L_0x02a5:
            java.lang.Object r0 = r10.A00     // Catch:{ IllegalStateException -> 0x02b0 }
            android.content.Context r0 = X.C18240wQ.A0C(r0)     // Catch:{ IllegalStateException -> 0x02b0 }
            X.3TJ r5 = X.AnonymousClass3TJ.A00(r0)     // Catch:{ IllegalStateException -> 0x02b0 }
            return r5
        L_0x02b0:
            r0 = move-exception
            r10.A02(r0)
            r5 = 0
            return r5
        L_0x02b6:
            X.3am r9 = X.C63043bN.A01
            android.content.SharedPreferences r1 = X.C62803am.A01(r9, r8)
            java.lang.String r19 = "LAST_SCREEN_TIME_UPLOAD"
            r0 = r19
            long r15 = r1.getLong(r0, r2)
            long r13 = java.lang.System.currentTimeMillis()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x02da
            int r1 = X.C63803iN.A01(r4, r8, r6)
            r0 = 30
            int r0 = java.lang.Math.max(r1, r0)
            X.C696349j.A0A(r12, r0)
            return r5
        L_0x02da:
            android.content.SharedPreferences r0 = X.C62803am.A01(r9, r8)
            java.lang.String r13 = "TIME_SPENT_UUID"
            java.lang.String r11 = ""
            java.lang.String r0 = r0.getString(r13, r11)
            if (r0 != 0) goto L_0x02e9
            r0 = r11
        L_0x02e9:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02fe
            java.lang.String r1 = X.C18180wK.A0e()
            android.content.SharedPreferences r0 = r9.A06(r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C18180wK.A0v(r0, r13, r1)
        L_0x02fe:
            android.content.SharedPreferences r0 = r9.A06(r8)
            java.lang.String r0 = r0.getString(r13, r11)
            if (r0 == 0) goto L_0x0309
            r11 = r0
        L_0x0309:
            boolean r14 = X.C696349j.A0C(r12)
            java.util.TimeZone r12 = java.util.TimeZone.getDefault()
            java.util.Calendar r0 = java.util.Calendar.getInstance(r12)
            long r0 = r0.getTimeInMillis()
            r12.getOffset(r0)
            r17 = 1000(0x3e8, double:4.94E-321)
            X.3VQ r0 = X.AnonymousClass3VQ.A01
            int[] r13 = r0.A02(r2)
            r3 = 7
            int[] r2 = new int[r3]
            if (r14 == 0) goto L_0x0339
            r12 = 1
        L_0x032a:
            int r0 = r13.length
            if (r12 > r0) goto L_0x0339
            if (r12 > r3) goto L_0x0339
            int r1 = 7 - r12
            int r0 = r0 - r12
            r0 = r13[r0]
            r2[r1] = r0
            int r12 = r12 + 1
            goto L_0x032a
        L_0x0339:
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0v()
            r1 = 0
        L_0x033e:
            r0 = r2[r1]
            X.C18200wM.A1U(r13, r0)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x033e
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            com.instagram.api.schemas.ScreenTimeScreenType[] r14 = com.instagram.api.schemas.ScreenTimeScreenType.values()
            int r2 = r14.length
            r1 = 0
        L_0x0355:
            if (r1 >= r2) goto L_0x036e
            r15 = r14[r1]
            com.instagram.api.schemas.ScreenTimeScreenType r0 = com.instagram.api.schemas.ScreenTimeScreenType.UNRECOGNIZED
            if (r15 == r0) goto L_0x036b
            X.C18210wN.A1O(r15, r12)
            long r15 = r9.A03(r15, r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r3.add(r0)
        L_0x036b:
            int r1 = r1 + 1
            goto L_0x0355
        L_0x036e:
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r8)
            java.lang.String r0 = "mental_well_being/update_screen_time/"
            r2.A0J(r0)
            java.lang.String r0 = "screen_time_storage_id"
            r2.A0O(r0, r11)
            java.lang.String r1 = X.C18200wM.A0o(r13)
            java.lang.String r0 = "screen_time_in_sec_per_day"
            r2.A0O(r0, r1)
            java.lang.String r1 = X.C18200wM.A0o(r12)
            java.lang.String r0 = "screen_time_by_screen_keys"
            r2.A0O(r0, r1)
            java.lang.String r1 = X.C18200wM.A0o(r3)
            java.lang.String r0 = "screen_time_by_screen_values"
            r2.A0O(r0, r1)
            java.lang.Long r0 = X.C19591Ayr.A00()
            long r0 = r0.longValue()
            java.lang.String r3 = "timezone_offset"
            r2.A0L(r3, r0)
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()
            r0.add(r11)
            java.lang.String r1 = X.C18200wM.A0o(r0)
            java.lang.String r0 = "excluded_screen_time_storage_ids"
            r2.A0O(r0, r1)
            java.lang.Class<X.1TT> r1 = X.AnonymousClass1TT.class
            java.lang.Class<X.3Pv> r0 = X.C60623Pv.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 184(0xb8, float:2.58E-43)
            X.C63873iU.A0E(r1, r10, r0)
            X.C31155GhB.A03(r1)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.C63803iN.A03(r4, r8, r6)
            long r0 = r0 * r17
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = X.C62803am.A00(r9, r8)
            r0 = r19
            X.AnonymousClass0wJ.A12(r1, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.task.IDxLTaskShape133S0100000_1_I2.call():java.lang.Object");
    }

    public final int getRunnableId() {
        switch (this.A01) {
            case 0:
                return 270;
            case 1:
                return 269;
            case 2:
                return 443;
            case 3:
                return 247;
            case 4:
                return 1039187132;
            case 5:
                return 1440554863;
            case 6:
                return 1218371471;
            case 7:
                return 1869849473;
            case 8:
                return 732786309;
            case 9:
                return 1261828832;
            default:
                return 1133647366;
        }
    }
}
