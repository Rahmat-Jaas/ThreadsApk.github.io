package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.3PC  reason: invalid class name */
public final class AnonymousClass3PC {
    public static void A00(Activity activity, C36143JIh jIh, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        if (jIh != null) {
            try {
                String A00 = C36536JaD.A00(jIh);
                Bundle A06 = C18180wK.A06();
                A06.putString("ARG_SERIALIZED_MODEL_DATA", A00);
                A06.putString("ARG_TOAST_TEXT", str4);
                A06.putString("ARG_INTRO_TOAST_BUTTON", str5);
                A06.putString("ARG_OUTRO_TOAST_TEXT", str6);
                A06.putString("ARG_INTEGRATION_POINT_ID", str);
                A06.putString("ARG_SURVEY_ID", str2);
                A06.putString("ARG_SESSION_BLOB", str3);
                C63863iT.A08(activity, A06, userSession, TransparentModalActivity.class, "rapid_feedback");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            C63813iO.A0A(activity.getApplicationContext(), 2131829113, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r13 > (X.AnonymousClass3XP.A00(r7, r2).getLong(X.AnonymousClass00U.A0L(X.AnonymousClass3XP.A02, r6), 0) + r15)) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r21.booleanValue() == r4) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r19, com.instagram.service.session.UserSession r20, java.lang.Boolean r21, java.lang.String r22, java.util.Map r23) {
        /*
            r17 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0F(r17)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "tryShow"
            r0 = 2126095077(0x7eb9a2e5, float:1.2337649E38)
            X.C13930oX.A01(r1, r0)     // Catch:{ all -> 0x014a }
        L_0x0010:
            X.0TJ r2 = X.AnonymousClass0TJ.A05     // Catch:{ all -> 0x014a }
            r0 = 36595449234262022(0x82035e00010806, double:3.2064476815690336E-306)
            r5 = r20
            long r15 = X.C63803iN.A03(r2, r5, r0)     // Catch:{ all -> 0x014a }
            r0 = 36876924211036279(0x83035e00020077, double:3.384453590289831E-306)
            java.lang.String r10 = X.C63803iN.A0C(r2, r5, r0)     // Catch:{ all -> 0x014a }
            if (r23 != 0) goto L_0x002c
            java.util.HashMap r23 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x014a }
        L_0x002c:
            r3 = 0
            r7 = r19
            r6 = r22
            boolean r4 = X.AnonymousClass0wJ.A1Z(r7, r6)     // Catch:{ all -> 0x014a }
            X.3XP r2 = X.AnonymousClass3XP.A00     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r1 = X.AnonymousClass3XP.A00(r7, r2)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.AnonymousClass3XP.A01     // Catch:{ all -> 0x014a }
            boolean r0 = r1.getBoolean(r0, r4)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0085
            long r13 = X.C18190wL.A07()     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r9 = X.AnonymousClass3XP.A00(r7, r2)     // Catch:{ all -> 0x014a }
            java.lang.String r8 = X.AnonymousClass3XP.A03     // Catch:{ all -> 0x014a }
            r0 = 0
            long r11 = r9.getLong(r8, r0)     // Catch:{ all -> 0x014a }
            r8 = 86400(0x15180, double:4.26873E-319)
            long r11 = r11 + r8
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            boolean r11 = X.C18180wK.A1X(r8)
            boolean r8 = X.AnonymousClass8bP.A0j(r10, r6, r3)     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x0077
            android.content.SharedPreferences r9 = X.AnonymousClass3XP.A00(r7, r2)     // Catch:{ all -> 0x014a }
            java.lang.String r8 = X.AnonymousClass3XP.A02     // Catch:{ all -> 0x014a }
            java.lang.String r8 = X.AnonymousClass00U.A0L(r8, r6)     // Catch:{ all -> 0x014a }
            long r8 = r9.getLong(r8, r0)     // Catch:{ all -> 0x014a }
            long r8 = r8 + r15
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r11 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            if (r21 == 0) goto L_0x013d
            boolean r0 = r21.booleanValue()     // Catch:{ all -> 0x014a }
            if (r0 != r4) goto L_0x013d
        L_0x0085:
            boolean r0 = r10.contains(r6)     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x00a3
            android.content.SharedPreferences r0 = X.AnonymousClass3XP.A00(r7, r2)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x014a }
            java.lang.String r0 = X.AnonymousClass3XP.A02     // Catch:{ all -> 0x014a }
            java.lang.String r2 = X.AnonymousClass00U.A0L(r0, r6)     // Catch:{ all -> 0x014a }
            long r0 = X.C18190wL.A07()     // Catch:{ all -> 0x014a }
            r4.putLong(r2, r0)     // Catch:{ all -> 0x014a }
            r4.apply()     // Catch:{ all -> 0x014a }
        L_0x00a3:
            r0 = 8
            com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2 r4 = new com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2     // Catch:{ all -> 0x014a }
            r4.<init>(r5, r7, r6, r0)     // Catch:{ all -> 0x014a }
            boolean r0 = r23.isEmpty()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x00d3
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x014a }
            java.util.Iterator r7 = X.AnonymousClass0wJ.A0z(r23)     // Catch:{ all -> 0x014a }
        L_0x00b8:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x00d4
            java.util.Map$Entry r0 = X.C18180wK.A0o(r7)     // Catch:{ all -> 0x014a }
            java.lang.String r2 = X.C18200wM.A0p(r0)     // Catch:{ all -> 0x014a }
            java.lang.String r1 = X.C18230wP.A0u(r0)     // Catch:{ all -> 0x014a }
            X.3SV r0 = new X.3SV     // Catch:{ all -> 0x014a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x014a }
            r10.add(r0)     // Catch:{ all -> 0x014a }
            goto L_0x00b8
        L_0x00d3:
            r10 = 0
        L_0x00d4:
            java.io.StringWriter r9 = X.C18230wP.A0d()     // Catch:{ IOException -> 0x0118 }
            X.MMp r8 = X.C18180wK.A0K(r9)     // Catch:{ IOException -> 0x0118 }
            java.lang.String r0 = "0"
            r8.A0d(r0, r6)     // Catch:{ IOException -> 0x0118 }
            if (r10 == 0) goto L_0x0113
            java.lang.String r0 = "1"
            java.util.Iterator r7 = X.C18190wL.A0t(r8, r0, r10)     // Catch:{ IOException -> 0x0118 }
        L_0x00e9:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x0118 }
            if (r0 == 0) goto L_0x0110
            java.lang.Object r2 = r7.next()     // Catch:{ IOException -> 0x0118 }
            X.3SV r2 = (X.AnonymousClass3SV) r2     // Catch:{ IOException -> 0x0118 }
            if (r2 == 0) goto L_0x00e9
            r8.A0J()     // Catch:{ IOException -> 0x0118 }
            java.lang.String r1 = r2.A00     // Catch:{ IOException -> 0x0118 }
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "context_key"
            r8.A0d(r0, r1)     // Catch:{ IOException -> 0x0118 }
        L_0x0103:
            java.lang.String r1 = r2.A01     // Catch:{ IOException -> 0x0118 }
            if (r1 == 0) goto L_0x010c
            java.lang.String r0 = "context_value"
            r8.A0d(r0, r1)     // Catch:{ IOException -> 0x0118 }
        L_0x010c:
            r8.A0G()     // Catch:{ IOException -> 0x0118 }
            goto L_0x00e9
        L_0x0110:
            r8.A0F()     // Catch:{ IOException -> 0x0118 }
        L_0x0113:
            java.lang.String r1 = X.C18180wK.A0h(r8, r9)     // Catch:{ IOException -> 0x0118 }
            goto L_0x012c
        L_0x0118:
            r2 = move-exception
            java.lang.String r1 = "RapidFeedbackApiUtil"
            java.lang.String r0 = "Error serializing to JSON; use simple integration id as input"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "0"
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r6}     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "{\"%s\":\"%s\"}"
            java.lang.String r1 = X.C18180wK.A0j(r0, r1)     // Catch:{ all -> 0x014a }
        L_0x012c:
            X.1qO r0 = new X.1qO     // Catch:{ all -> 0x014a }
            r0.<init>(r1)     // Catch:{ all -> 0x014a }
            X.H8c r2 = X.C18200wM.A0U(r5, r0)     // Catch:{ all -> 0x014a }
            r2.A00 = r4     // Catch:{ all -> 0x014a }
            r1 = 220(0xdc, float:3.08E-43)
            r0 = 3
            X.C31155GhB.A05(r2, r1, r0, r3, r3)     // Catch:{ all -> 0x014a }
        L_0x013d:
            boolean r0 = com.facebook.systrace.Systrace.A0F(r17)
            if (r0 == 0) goto L_0x0149
            r0 = -1043681818(0xffffffffc1caade6, float:-25.334911)
            X.C13930oX.A00(r0)
        L_0x0149:
            return
        L_0x014a:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0F(r17)
            if (r0 == 0) goto L_0x0157
            r0 = 875257379(0x342b5e23, float:1.5959863E-7)
            X.C13930oX.A00(r0)
        L_0x0157:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PC.A01(android.app.Activity, com.instagram.service.session.UserSession, java.lang.Boolean, java.lang.String, java.util.Map):void");
    }
}
