package X;

import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7JZ  reason: invalid class name */
public final class AnonymousClass7JZ {
    public static final String A00(UserSession userSession, int i) {
        AnonymousClass0TJ r2;
        long j;
        if (i == 0) {
            r2 = AnonymousClass0TJ.A05;
            j = 36882271445713175L;
        } else if (i == 1) {
            r2 = AnonymousClass0TJ.A05;
            j = 36882271445778712L;
        } else if (i != 2) {
            return null;
        } else {
            r2 = AnonymousClass0TJ.A05;
            j = 36882271445844249L;
        }
        String A0C = C63803iN.A0C(r2, userSession, j);
        if (!A06(userSession, A0C)) {
            return A0C;
        }
        C10450iM.A03("Nav3", AnonymousClass00U.A0L("Duplicate header icon already used as tab: ", A0C));
        return null;
    }

    public static final boolean A05(UserSession userSession, String str) {
        AnonymousClass8bH A02 = AnonymousClass8bH.A02(0, 2);
        if (!(A02 instanceof Collection) || !((Collection) A02).isEmpty()) {
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                if (C04220Ms.A0I(str, A00(userSession, ((C1367083z) it).A00()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, String str) {
        AnonymousClass0TJ r2;
        long j;
        String A0C;
        C04220Ms.A0B(str, 1);
        AnonymousClass8bH A02 = AnonymousClass8bH.A02(0, 4);
        if (!(A02 instanceof Collection) || !((Collection) A02).isEmpty()) {
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                int A00 = ((C1367083z) it).A00();
                if (A00 != 0) {
                    if (A00 == 1) {
                        r2 = AnonymousClass0TJ.A05;
                        j = 36882271445254419L;
                    } else if (A00 == 2) {
                        r2 = AnonymousClass0TJ.A05;
                        j = 36882271445319956L;
                    } else if (A00 == 3) {
                        r2 = AnonymousClass0TJ.A05;
                        j = 36882271445385493L;
                    } else if (A00 != 4) {
                        A0C = null;
                    } else {
                        r2 = AnonymousClass0TJ.A05;
                        j = 36882271445451030L;
                    }
                    A0C = C63803iN.A0C(r2, userSession, j);
                } else {
                    r2 = AnonymousClass0TJ.A05;
                    j = 36882271445188882L;
                    A0C = C63803iN.A0C(r2, userSession, j);
                }
                if (str.equals(A0C)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        return C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342162330705859676L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (X.C63173fJ.A05(r3, 18304742593663951L) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (X.C63173fJ.A05(r3, r1) == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0.length() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.instagram.service.session.UserSession r6) {
        /*
            if (r6 == 0) goto L_0x00bf
            boolean r0 = A01(r6)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = X.C18200wM.A0g()
            if (r0 == 0) goto L_0x0015
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            java.lang.String r0 = "activity_and_creation_in_header"
            if (r1 == 0) goto L_0x0049
            android.content.SharedPreferences r2 = X.C18200wM.A0C()
            java.lang.String r1 = "session_based_client_config_success_fetched"
            boolean r1 = X.C18190wL.A1X(r2, r1)
            if (r1 != 0) goto L_0x0049
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x003e
            r1 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x0049
        L_0x003e:
            java.lang.String r1 = "none"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            return r0
        L_0x0049:
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r5 = "session_based_client_config_success_fetched"
            r4 = 0
            boolean r1 = r1.getBoolean(r5, r4)
            if (r1 != 0) goto L_0x0096
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x006e
            r1 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x0096
        L_0x006e:
            r1 = 18304742593991635(0x410811000513d3, double:1.894818316909318E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x0096
            r1 = 18304742593860561(0x410811000313d1, double:1.8948183168575107E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x0090
            r1 = 18304742593729488(0x410811000113d0, double:1.8948183168057038E-307)
        L_0x0089:
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x00b3
            goto L_0x003e
        L_0x0090:
            r1 = 18304798428238824(0x41081e000013e8, double:1.894840385536036E-307)
            goto L_0x0089
        L_0x0096:
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            boolean r1 = r1.getBoolean(r5, r4)
            if (r1 != 0) goto L_0x00b3
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x003e
            r1 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            goto L_0x0089
        L_0x00b3:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36874892691374130(0x83018500000032, double:3.383168849075215E-306)
            java.lang.String r0 = X.C63803iN.A0C(r2, r6, r0)
            goto L_0x003e
        L_0x00bf:
            java.lang.String r0 = "none"
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JZ.A02(com.instagram.service.session.UserSession):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (X.C18200wM.A0C().getBoolean("session_based_client_config_success_fetched", false) != false) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.service.session.UserSession r6) {
        /*
            boolean r0 = A01(r6)
            java.lang.String r5 = "enabled"
            java.lang.String r3 = "disabled"
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "clips"
            boolean r2 = A06(r6, r0)
            if (r2 != 0) goto L_0x0015
            r5 = r3
        L_0x0015:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r3 = "Nav3Enabled, reel table %s"
        L_0x001b:
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0032
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = java.lang.String.format(r3, r0)
            X.C04220Ms.A06(r0)
        L_0x0032:
            return r2
        L_0x0033:
            java.lang.String r0 = X.C18200wM.A0g()
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c6
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            java.lang.String r5 = "session_based_client_config_success_fetched"
            boolean r0 = r0.getBoolean(r5, r4)
            if (r0 != 0) goto L_0x008e
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x008e
            r0 = 18304742593991635(0x410811000513d3, double:1.894818316909318E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x008e
            r0 = 18304742593860561(0x410811000313d1, double:1.8948183168575107E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x007e
            r0 = 18304742593729488(0x410811000113d0, double:1.8948183168057038E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r3 = "3rd place"
            goto L_0x001b
        L_0x007e:
            r0 = 18304798428238824(0x41081e000013e8, double:1.894840385536036E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r3 = "4rd place"
            goto L_0x001b
        L_0x008e:
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            boolean r0 = r0.getBoolean(r5, r4)
            if (r0 != 0) goto L_0x00ab
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r0 = X.C63173fJ.A05(r3, r0)
            if (r0 == 0) goto L_0x00ab
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r3 = "5rd place"
            goto L_0x001b
        L_0x00ab:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311942738084642(0x81018500020322, double:3.027157031797429E-306)
            boolean r2 = X.C63803iN.A0E(r2, r6, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r3 = "final place, isEnabledFromPanoramaV2: %s, isEnabledFromVideoTab: %s"
            goto L_0x001b
        L_0x00c6:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18304742593663951(0x410811000013cf, double:1.8948183167798E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x00e0
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r0 = "session_based_client_config_success_fetched"
            boolean r0 = r1.getBoolean(r0, r4)
            r2 = 1
            if (r0 == 0) goto L_0x00e2
        L_0x00e0:
            r2 = 0
            r5 = r3
        L_0x00e2:
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r3 = "device id is null, reel table %s"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JZ.A03(com.instagram.service.session.UserSession):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.instagram.service.session.UserSession r6) {
        /*
            boolean r0 = A01(r6)
            r4 = 0
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = X.C18200wM.A0g()
            r5 = 1
            if (r0 == 0) goto L_0x0073
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0073
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            java.lang.String r3 = "session_based_client_config_success_fetched"
            boolean r0 = r0.getBoolean(r3, r4)
            if (r0 != 0) goto L_0x0055
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0055
            r0 = 18304742593991635(0x410811000513d3, double:1.894818316909318E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0055
            r0 = 18304742593860561(0x410811000313d1, double:1.8948183168575107E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x004f
            r0 = 18304742593729488(0x410811000113d0, double:1.8948183168057038E-307)
        L_0x0048:
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0067
            return r5
        L_0x004f:
            r0 = 18304798428238824(0x41081e000013e8, double:1.894840385536036E-307)
            goto L_0x0048
        L_0x0055:
            android.content.SharedPreferences r0 = X.C18200wM.A0C()
            boolean r0 = r0.getBoolean(r3, r4)
            if (r0 != 0) goto L_0x0067
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            goto L_0x0048
        L_0x0067:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311942738019105(0x81018500010321, double:3.027157031755983E-306)
            boolean r4 = X.C63803iN.A0E(r2, r6, r0)
            return r4
        L_0x0073:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18304742593926098(0x410811000413d2, double:1.8948183168834144E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x008d
            android.content.SharedPreferences r1 = X.C18200wM.A0C()
            java.lang.String r0 = "session_based_client_config_success_fetched"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x008d
            r4 = 1
        L_0x008d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JZ.A04(com.instagram.service.session.UserSession):boolean");
    }
}
