package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Zq  reason: invalid class name */
public final class AnonymousClass3Zq {
    public static synchronized C566838d A00(UserSession userSession) {
        C566838d r0;
        synchronized (AnonymousClass3Zq.class) {
            r0 = (C566838d) userSession.A00(C566838d.class);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r4, X.C63873iU r5, com.instagram.service.session.UserSession r6, java.lang.String r7, java.util.List r8) {
        /*
            X.44X r1 = X.AnonymousClass44X.A00()
            java.lang.String r0 = "ig_android_growth_fx_access_contact_point_nux"
            java.lang.String r2 = r1.A03(r6, r0)
            java.lang.String r1 = X.C18190wL.A0l(r6)
            java.lang.String r4 = X.C18230wP.A0i(r4)
            if (r4 != 0) goto L_0x0017
            r0 = 0
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            X.AnonymousClass7Ko.A0B(r0)
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r6)
            java.lang.String r0 = "accounts/contact_point_prefill/"
            r3.A0J(r0)
            java.lang.String r0 = "usage"
            r3.A0O(r0, r7)
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = "big_blue_token"
            r3.A0O(r0, r2)
        L_0x0030:
            if (r4 == 0) goto L_0x0058
            r2 = 0
            r1 = 9
            r0 = 25
            java.lang.String r0 = X.C61943Wl.A01(r2, r1, r0)
            r3.A0O(r0, r4)
        L_0x003e:
            if (r8 == 0) goto L_0x0061
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0061
            org.json.JSONArray r2 = X.C18250wR.A0i()
            java.util.Iterator r1 = r8.iterator()
        L_0x004e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            X.C18210wN.A1R(r1, r2)
            goto L_0x004e
        L_0x0058:
            java.lang.String r0 = "phone_id"
            r3.A0O(r0, r1)
            goto L_0x003e
        L_0x005e:
            X.C18230wP.A1I(r3, r2)
        L_0x0061:
            java.lang.Class<X.1TS> r1 = X.AnonymousClass1TS.class
            java.lang.Class<X.3PZ> r0 = X.AnonymousClass3PZ.class
            X.H8c r0 = X.C18180wK.A0T(r3, r1, r0)
            r0.A00 = r5
            X.C31155GhB.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Zq.A01(android.content.Context, X.3iU, com.instagram.service.session.UserSession, java.lang.String, java.util.List):void");
    }

    public static void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        AnonymousClass7Ko.A0B(C18210wN.A1U(str));
        AnonymousClass7Ko.A0B(C18210wN.A1U(str2));
        C25786Drz A00 = C63463hW.A00(fragmentActivity, userSession);
        C23191ce r4 = new C23191ce();
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString(C62983bG.A00(), str);
        A0E.putString(C62983bG.A03(39, 17, 95), str2);
        C18180wK.A0x(A0E, r4, A00);
    }
}
