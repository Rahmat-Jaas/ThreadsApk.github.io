package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.3IP  reason: invalid class name */
public final class AnonymousClass3IP {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle A00(com.instagram.service.session.UserSession r10) {
        /*
            r9 = this;
            r0 = 1
            X.C04220Ms.A0B(r10, r0)
            java.util.Calendar.getInstance()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317277087862312(0x81065f00080e28, double:3.03053049607653E-306)
            boolean r0 = X.C63803iN.A0E(r2, r10, r0)
            if (r0 == 0) goto L_0x0070
            boolean r0 = X.C63433hT.A05(r10)
            r8 = 1
            if (r0 == 0) goto L_0x0070
            java.util.List r7 = X.C60613Pu.A00()
            java.util.List r6 = X.C63043bN.A01(r10)
            X.3am r0 = X.C63043bN.A01
            android.content.SharedPreferences r1 = r0.A06(r10)
            java.lang.String r0 = "LAST_SCREEN_TIME_UPLOAD"
            long r4 = X.C18180wK.A05(r1, r0)
            long r2 = X.AnonymousClass0wJ.A0A()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            r0 = 0
        L_0x0038:
            java.util.List r0 = X.C60613Pu.A01(r7, r6, r0)
        L_0x003c:
            java.lang.String r1 = X.C18200wM.A0o(r0)
            java.lang.String r0 = "serialized_daily_time_spent_in_secs"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            if (r8 == 0) goto L_0x0063
            java.lang.String r1 = "1"
        L_0x004a:
            java.lang.String r0 = "serialized_is_aggregated"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r1 = X.AnonymousClass4WJ.A0G(r2, r0)
            java.lang.String r0 = "com.instagram.mental_well_being.time_spent_screen_shell.component"
            X.3iE r1 = X.C63743iE.A02(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r10)
            android.os.Bundle r0 = X.C62853b1.A00(r0, r1)
            return r0
        L_0x0063:
            java.lang.String r1 = "0"
            goto L_0x004a
        L_0x0066:
            long r2 = r2 - r4
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 / r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            goto L_0x0038
        L_0x0070:
            r8 = 0
            java.util.List r0 = X.C60613Pu.A00()
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IP.A00(com.instagram.service.session.UserSession):android.os.Bundle");
    }

    public final Fragment A01(UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 1);
        C63583hq.A03(userSession, AnonymousClass006.A00, num, (Long) null, (Long) null, (Long) null, "");
        return new AnonymousClass1ae();
    }

    public final Fragment A02(UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 1);
        C63583hq.A03(userSession, AnonymousClass006.A00, num, (Long) null, (Long) null, (Long) null, "");
        AnonymousClass1c8 r1 = new AnonymousClass1c8();
        r1.setArguments(A00(userSession));
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r24 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C37383Jqm A03(android.content.Context r18, androidx.fragment.app.FragmentActivity r19, com.instagram.service.session.UserSession r20, X.C21659By5 r21, long r22, boolean r24) {
        /*
            r17 = this;
            r2 = 0
            r7 = r20
            r3 = r18
            boolean r12 = X.AnonymousClass0wJ.A1Z(r7, r3)
            X.Jj9 r1 = X.C18210wN.A0L(r7)
            r0 = 2131836598(0x7f113eb6, float:1.9306367E38)
            X.C18230wP.A10(r3, r1, r0)
            X.3am r0 = X.C63043bN.A01
            long r8 = r0.A05(r7)
            r6 = r19
            if (r24 == 0) goto L_0x005a
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            r0 = 2131836600(0x7f113eb8, float:1.9306371E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0R = r0
            X.3rK r5 = new X.3rK
            r10 = r22
            r5.<init>(r6, r7, r8, r10)
            r1.A0A = r5
            r1.A0k = r12
        L_0x0037:
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0S = r0
            com.facebook.redex.IDxCListenerShape2S0200100_1_I2 r11 = new com.facebook.redex.IDxCListenerShape2S0200100_1_I2
            r13 = r8
            r15 = r6
            r16 = r7
            r11.<init>(r12, r13, r15, r16)
            r1.A0B = r11
            r1.A0n = r12
        L_0x004d:
            r0 = r21
            if (r21 == 0) goto L_0x0053
            r1.A0J = r0
        L_0x0053:
            r1.A0T = r2
            X.Jqm r0 = r1.A00()
            return r0
        L_0x005a:
            r0 = 2131826219(0x7f11162b, float:1.9285316E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0R = r0
            r1.A0W = r12
            if (r24 == 0) goto L_0x004d
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IP.A03(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.service.session.UserSession, X.By5, long, boolean):X.Jqm");
    }
}
