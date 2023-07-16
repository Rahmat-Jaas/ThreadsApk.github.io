package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.api.base.IDxACallbackShape0S0500000_1_I2;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.3i4  reason: invalid class name and case insensitive filesystem */
public final class C63663i4 {
    public static final C32165H8c A01(C23921D1j d1j, UserSession userSession, String str, String str2, String str3, String str4, List list, Set set, int i, int i2) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(d1j, set);
        C04220Ms.A0B(str, 3);
        JSONArray A0i = C18250wR.A0i();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C18210wN.A1R(it, A0i);
        }
        H1T h1t = new H1T(userSession, -2);
        C18250wR.A16(h1t);
        h1t.A0J("highlights/create_reel/");
        h1t.A0O("creation_id", String.valueOf(System.currentTimeMillis()));
        h1t.A0O("source", d1j.name());
        h1t.A0O("media_ids", A0i.toString());
        h1t.A0O(DialogModule.KEY_TITLE, str);
        A09(h1t, userSession);
        A0A(h1t, str2, str3, list, i, i2);
        if (str4 != null) {
            h1t.A0O("suggested_reel_id", str4);
        }
        return C18180wK.A0T(h1t, C21701Rv.class, C59303Kh.class);
    }

    public static /* synthetic */ C32165H8c A02(C23921D1j d1j, UserSession userSession, String str, String str2, String str3, String str4, List list, Set set, Set set2, int i, int i2) {
        AnonymousClass0wJ.A1N(userSession, str);
        AnonymousClass0wJ.A1Q(d1j, set);
        C04220Ms.A0B(set2, 4);
        JSONArray A0i = C18250wR.A0i();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C18210wN.A1R(it, A0i);
        }
        JSONArray A0i2 = C18250wR.A0i();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            C18210wN.A1R(it2, A0i2);
        }
        String format = String.format((Locale) null, "highlights/%s/edit_reel/", new Object[]{str});
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        C04220Ms.A06(format);
        A0O.A0J(format);
        A0O.A0O("source", d1j.name());
        A0O.A0O("added_media_ids", A0i.toString());
        A0O.A0O("removed_media_ids", A0i2.toString());
        A0O.A0M("autosave_to_exclusive_highlight", (Boolean) null);
        if (str2 != null) {
            A0O.A0O(DialogModule.KEY_TITLE, str2);
        }
        A09(A0O, userSession);
        A0A(A0O, str3, str4, list, i, i2);
        return C18180wK.A0T(A0O, C21701Rv.class, C59303Kh.class);
    }

    public static final C32165H8c A03(C23921D1j d1j, UserSession userSession, String str, String str2, List list, Set set, Set set2, int i, int i2) {
        AnonymousClass0wJ.A1N(userSession, str);
        C23921D1j d1j2 = d1j;
        C04220Ms.A0B(d1j, 2);
        return A02(d1j2, userSession, str, (String) null, str2, (String) null, list, set, set2, i, i2);
    }

    public static final C32165H8c A04(UserSession userSession, Integer num, String str, boolean z) {
        C04220Ms.A0B(userSession, 0);
        GXN gxn = new GXN();
        gxn.A05("max_id", str);
        gxn.A05("include_memories", String.valueOf(z));
        String A01 = gxn.A01(AnonymousClass00U.A0L("v1:", "archive/reel/day_shells_paginated/"));
        C04220Ms.A06(A01);
        H1T h1t = new H1T(userSession, -2);
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A0J("archive/reel/day_shells_paginated/");
        h1t.A0O("max_id", str);
        String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        if (!z) {
            str2 = "0";
        }
        h1t.A0O("include_memories", str2);
        C18200wM.A1M(h1t, num, A01);
        return AnonymousClass0wJ.A0T(h1t, C21611Rm.class, C59293Kg.class);
    }

    public static final C32165H8c A05(UserSession userSession, Integer num, boolean z, boolean z2) {
        C04220Ms.A0B(userSession, 0);
        GXN gxn = new GXN();
        String str = "0";
        String str2 = str;
        if (z) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        gxn.A05("include_cover", str2);
        String A01 = gxn.A01(AnonymousClass00U.A0L("v1:", "archive/reel/day_shells/"));
        C04220Ms.A06(A01);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J("archive/reel/day_shells/");
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        A0P.A0O("include_cover", str);
        A0P.A0R("is_in_archive_home", z2);
        C18200wM.A1M(A0P, num, A01);
        return AnonymousClass0wJ.A0T(A0P, AnonymousClass1UK.class, C59283Kf.class);
    }

    public static final C32165H8c A06(UserSession userSession, String str, String str2, boolean z) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str2, 2);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        String A0j = C18180wK.A0j("archive/reel/%s/mark_memory_seen/", new Object[]{str});
        C04220Ms.A06(A0j);
        A0O.A0J(A0j);
        A0O.A0O("source", str2);
        A0O.A0R("did_dismiss_badge", z);
        A0O.A0O("timezone_offset", String.valueOf(C19591Ayr.A00().longValue()));
        return AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
    }

    public static final void A08(Context context, C63873iU r11, BKU bku, C308923j r13, UserSession userSession) {
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        BKN bkn = bku.A0f;
        String A0j = C18180wK.A0j("media/%s/only_me/", new Object[]{bkn.A4Y});
        C04220Ms.A06(A0j);
        A0O.A0J(A0j);
        A0O.A0O("media_id", bkn.A4Y);
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0O);
        C18330wh A00 = C18330wh.A00(context);
        A00.setOwnerActivity(C10040hd.A00(context));
        C308923j r5 = r13;
        A0S.A00 = new IDxACallbackShape0S0500000_1_I2(0, r5, context, A00, userSession, bku);
        if (r11 != null) {
            A0S.A00 = r11;
        }
        C31155GhB.A00().schedule(A0S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r24 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.H1T r22, java.lang.String r23, java.lang.String r24, java.util.List r25, int r26, int r27) {
        /*
            r6 = 0
            r5 = r23
            r3 = r24
            if (r23 == 0) goto L_0x000a
            r2 = 0
            if (r24 != 0) goto L_0x000b
        L_0x000a:
            r2 = 1
        L_0x000b:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "Cover media id and cover upload id cannot both be set"
            X.AnonymousClass7Ko.A0F(r2, r0, r1)
            if (r23 != 0) goto L_0x0016
            if (r24 == 0) goto L_0x0142
        L_0x0016:
            java.io.StringWriter r15 = X.C18230wP.A0d()
            X.MMp r4 = X.C18180wK.A0K(r15)     // Catch:{ IOException -> 0x013a }
            if (r23 == 0) goto L_0x0026
            java.lang.String r0 = "media_id"
            r4.A0d(r0, r5)     // Catch:{ IOException -> 0x013a }
            goto L_0x002d
        L_0x0026:
            java.lang.String r0 = "upload_id"
            if (r24 == 0) goto L_0x0133
            r4.A0d(r0, r3)     // Catch:{ IOException -> 0x013a }
        L_0x002d:
            r5 = 93
            r14 = 44
            r3 = 91
            r0 = 72
            java.lang.String r2 = X.C28174Ezk.A00(r0)
            r9 = r25
            r8 = r26
            r7 = r27
            if (r25 == 0) goto L_0x006d
            int r1 = r9.size()     // Catch:{ IOException -> 0x013a }
            r0 = 4
            if (r1 != r0) goto L_0x006d
            float r13 = X.C18230wP.A01(r9, r6)     // Catch:{ IOException -> 0x013a }
            r0 = 1
            float r12 = X.C18230wP.A01(r9, r0)     // Catch:{ IOException -> 0x013a }
            r0 = 2
            float r11 = X.C18230wP.A01(r9, r0)     // Catch:{ IOException -> 0x013a }
            r0 = 3
            float r10 = X.C18230wP.A01(r9, r0)     // Catch:{ IOException -> 0x013a }
            float r1 = (float) r7     // Catch:{ IOException -> 0x013a }
            float r13 = r13 * r1
            float r0 = (float) r8     // Catch:{ IOException -> 0x013a }
            float r12 = r12 * r0
            float r11 = r11 * r1
            float r10 = r10 * r0
            float r11 = r11 - r13
            float r10 = r10 - r12
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            goto L_0x00c0
        L_0x006d:
            java.lang.String r1 = "ArchiveApiUtil"
            if (r25 != 0) goto L_0x00f9
            java.lang.String r0 = "Received CropRect was null when we had a passed in cover id"
        L_0x0073:
            X.C10450iM.A03(r1, r0)     // Catch:{ IOException -> 0x013a }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ IOException -> 0x013a }
            r0.<init>(r6, r6, r7, r8)     // Catch:{ IOException -> 0x013a }
            android.graphics.Rect r0 = X.C25816DsV.A01(r0)     // Catch:{ IOException -> 0x013a }
            android.graphics.RectF r8 = X.C25816DsV.A07(r0, r7, r8)     // Catch:{ IOException -> 0x013a }
            float r0 = r8.left     // Catch:{ IOException -> 0x013a }
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x013a }
            float r0 = r8.top     // Catch:{ IOException -> 0x013a }
            java.lang.Float r6 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x013a }
            float r0 = r8.right     // Catch:{ IOException -> 0x013a }
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x013a }
            float r0 = r8.bottom     // Catch:{ IOException -> 0x013a }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x013a }
            java.lang.Float[] r0 = new java.lang.Float[]{r7, r6, r1, r0}     // Catch:{ IOException -> 0x013a }
            java.util.List r6 = X.C06750aI.A17(r0)     // Catch:{ IOException -> 0x013a }
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ IOException -> 0x013a }
            r1.append(r3)     // Catch:{ IOException -> 0x013a }
            X.GdW r0 = X.C31015GdW.A00(r14)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = r0.A04(r6)     // Catch:{ IOException -> 0x013a }
            r1.append(r0)     // Catch:{ IOException -> 0x013a }
            r1.append(r5)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x013a }
            r4.A0d(r2, r0)     // Catch:{ IOException -> 0x013a }
            goto L_0x00e7
        L_0x00c0:
            float r10 = r10 - r11
            float r1 = java.lang.Math.abs(r10)     // Catch:{ IOException -> 0x013a }
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x006d
            java.lang.StringBuilder r1 = X.C18200wM.A0r()     // Catch:{ IOException -> 0x013a }
            r1.append(r3)     // Catch:{ IOException -> 0x013a }
            X.GdW r0 = X.C31015GdW.A00(r14)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = r0.A04(r9)     // Catch:{ IOException -> 0x013a }
            r1.append(r0)     // Catch:{ IOException -> 0x013a }
            r1.append(r5)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x013a }
            r4.A0d(r2, r0)     // Catch:{ IOException -> 0x013a }
        L_0x00e7:
            r4.A0G()     // Catch:{ IOException -> 0x013a }
            r4.close()     // Catch:{ IOException -> 0x013a }
            java.lang.String r1 = "cover"
            java.lang.String r0 = r15.toString()     // Catch:{ IOException -> 0x013a }
            r2 = r22
            r2.A0O(r1, r0)     // Catch:{ IOException -> 0x013a }
            goto L_0x0132
        L_0x00f9:
            int r11 = r9.size()     // Catch:{ IOException -> 0x013a }
            r10 = 4
            r0 = 1
            if (r11 == r10) goto L_0x0111
            int r0 = r9.size()     // Catch:{ IOException -> 0x013a }
            java.lang.Object[] r9 = X.C18210wN.A1X(r0)     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = "CropRect size was incorrect. Expected sized 4, got size: %d"
        L_0x010b:
            java.lang.String r0 = X.C18180wK.A0j(r0, r9)     // Catch:{ IOException -> 0x013a }
            goto L_0x0073
        L_0x0111:
            java.lang.Object r16 = r9.get(r6)     // Catch:{ IOException -> 0x013a }
            java.lang.Object r17 = r9.get(r0)     // Catch:{ IOException -> 0x013a }
            r0 = 2
            java.lang.Object r18 = r9.get(r0)     // Catch:{ IOException -> 0x013a }
            r0 = 3
            java.lang.Object r19 = r9.get(r0)     // Catch:{ IOException -> 0x013a }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x013a }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x013a }
            java.lang.Object[] r9 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21}     // Catch:{ IOException -> 0x013a }
            java.lang.String r0 = "Passed in invalid crop rect: left: %f, right: %f, top: %f, bottom: %f, coverHeight: %d, coverWidth: %d"
            goto L_0x010b
        L_0x0132:
            return
        L_0x0133:
            java.lang.String r0 = "coverUploadId should not be null"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)     // Catch:{ IOException -> 0x013a }
            throw r0     // Catch:{ IOException -> 0x013a }
        L_0x013a:
            r2 = move-exception
            java.lang.String r1 = "ArchiveApiUtil"
            java.lang.String r0 = "Unable to add highlights cover image data"
            X.C10450iM.A06(r1, r0, r2)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63663i4.A0A(X.H1T, java.lang.String, java.lang.String, java.util.List, int, int):void");
    }

    public static final C32165H8c A00(Context context, UserSession userSession, Integer num, Long l, String str, boolean z) {
        AnonymousClass0wJ.A1N(context, userSession);
        AnonymousClass0wJ.A1Q(str, num);
        String A0V = AnonymousClass00U.A0V("highlights/", str, "/highlights_tray/");
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J(A0V);
        A0P.A0E(num);
        A0P.A0I(A0V);
        if (l != null) {
            A0P.A07(TimeUnit.MINUTES.toMillis(l.longValue()));
        }
        A0P.A0B(IZD.class, C25158Dgr.class);
        A09(A0P, userSession);
        if (z) {
            C18723AkH.A01(context, A0P, userSession, new GWa(context));
        }
        return A0P.A02();
    }

    public static final C32165H8c A07(UserSession userSession, boolean z, boolean z2) {
        ReelAutoArchiveSettingStr reelAutoArchiveSettingStr;
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("users/set_reel_settings/");
        if (z) {
            reelAutoArchiveSettingStr = ReelAutoArchiveSettingStr.ON;
        } else {
            reelAutoArchiveSettingStr = ReelAutoArchiveSettingStr.OFF;
        }
        A0O.A0O("reel_auto_archive", reelAutoArchiveSettingStr.A00);
        if (z2) {
            A0O.A0O("check_pending_archive", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return AnonymousClass0wJ.A0S(A0O);
    }

    public static void A09(H1T h1t, UserSession userSession) {
        Pair A00 = C31032GeB.A00(userSession);
        Object obj = A00.first;
        C04220Ms.A05(obj);
        h1t.A0P((String) obj, (String) A00.second);
    }
}
