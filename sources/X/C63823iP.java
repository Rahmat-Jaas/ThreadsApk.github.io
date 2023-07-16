package X;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3iP  reason: invalid class name and case insensitive filesystem */
public final class C63823iP {
    public static final long A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        long A03 = A03(userSession, AnonymousClass0wJ.A0Y(userSession)) + (AnonymousClass0wJ.A0A() / 1000);
        if (System.currentTimeMillis() / 1000 > A03) {
            return A03 + SandboxRepository.CACHE_TTL;
        }
        return A03;
    }

    public static final long A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean A0G = A0G(userSession, A0Y, currentTimeMillis);
        long A04 = A04(userSession, A0Y) + (AnonymousClass0wJ.A0A() / 1000);
        int i = (currentTimeMillis > A04 ? 1 : (currentTimeMillis == A04 ? 0 : -1));
        if (A0G) {
            if (i < 0) {
                return A04 - SandboxRepository.CACHE_TTL;
            }
            return A04;
        } else if (i > 0) {
            return A04 + SandboxRepository.CACHE_TTL;
        } else {
            return A04;
        }
    }

    public static final long A02(UserSession userSession, long j) {
        C04220Ms.A0B(userSession, 0);
        long A0A = (AnonymousClass0wJ.A0A() / 1000) + A04(userSession, AnonymousClass0wJ.A0Y(userSession));
        if (j >= A0A) {
            return A0A + SandboxRepository.CACHE_TTL;
        }
        return A0A;
    }

    public static final void A0A(UserSession userSession) {
        long j;
        C04220Ms.A0B(userSession, 0);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        boolean A0F = A0F(userSession, A0Y, System.currentTimeMillis() / 1000);
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        if (A0F) {
            long A04 = A04(userSession, A0Y);
            long A03 = A03(userSession, A0Y);
            long A0A = AnonymousClass0wJ.A0A() / 1000;
            if (A04 >= A03) {
                A0A += A03;
                A03 = SandboxRepository.CACHE_TTL;
            }
            j = A0A + A03;
        } else {
            j = 0;
        }
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "quiet_mode_next_end_timestamp", j);
    }

    public static final void A0B(User user, long j, long j2) {
        C04220Ms.A0B(user, 0);
        user.A2G(C18180wK.A0n(new AnonymousClass18Z(Long.valueOf(j2), Long.valueOf(j))));
    }

    public static final boolean A0C(UserSession userSession) {
        List<C84074sV> B5Y;
        C04220Ms.A0B(userSession, 0);
        long A07 = C18190wL.A07();
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        if (A0Y.A3c() && (B5Y = A0Y.A05.B5Y()) != null && !B5Y.isEmpty()) {
            for (C84074sV r0 : B5Y) {
                Long BDS = r0.BDS();
                Long l = null;
                if (BDS == null) {
                    BDS = null;
                }
                Long Afr = r0.Afr();
                if (Afr != null) {
                    l = Afr;
                }
                if (!(BDS == null || l == null)) {
                    long longValue = BDS.longValue();
                    if ((longValue + 1 <= A07 && A07 < l.longValue()) || A07 <= longValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A0E(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return A0F(userSession, AnonymousClass0wJ.A0Y(userSession), C18190wL.A07());
    }

    public static final boolean A0F(UserSession userSession, User user, long j) {
        List B5Y;
        if (user.A3c() && (B5Y = user.A05.B5Y()) != null && !B5Y.isEmpty()) {
            Iterator it = B5Y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C84074sV r0 = (C84074sV) it.next();
                Long BDS = r0.BDS();
                Long l = null;
                if (BDS == null) {
                    BDS = null;
                }
                Long Afr = r0.Afr();
                if (Afr != null) {
                    l = Afr;
                }
                if (BDS != null && l != null && BDS.longValue() + 1 <= j && j < l.longValue()) {
                    break;
                }
            }
        }
        return user.A2w() && A0G(userSession, user, j);
    }

    public static final boolean A0G(UserSession userSession, User user, long j) {
        C04220Ms.A0B(userSession, 0);
        long A04 = A04(userSession, user);
        long A03 = A03(userSession, user);
        long A0A = AnonymousClass0wJ.A0A() / 1000;
        long j2 = A04 + A0A;
        long j3 = A0A + A03;
        if (j3 < j2) {
            j2 -= SandboxRepository.CACHE_TTL;
        }
        if (j > j3) {
            j2 += SandboxRepository.CACHE_TTL;
            j3 += SandboxRepository.CACHE_TTL;
        }
        if (j2 + 1 > j || j >= j3) {
            return false;
        }
        return true;
    }

    public static AnonymousClass3DJ A05(UserSession userSession) {
        return A06(userSession, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r2 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3DJ A06(com.instagram.service.session.UserSession r22, long r23) {
        /*
            r4 = r22
            X.0Ok r0 = X.C18240wQ.A0V(r4)
            com.instagram.user.model.User r3 = r0.A01(r4)
            long r14 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r12
            com.instagram.user.model.User r1 = r0.A01(r4)
            boolean r0 = r1.A3c()
            r2 = 0
            if (r0 == 0) goto L_0x0065
            X.MeW r0 = r1.A05
            java.util.List r1 = r0.B5Y()
            if (r1 == 0) goto L_0x0065
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0065
            java.util.Iterator r11 = r1.iterator()
        L_0x002e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r11.next()
            X.4sV r0 = (X.C84074sV) r0
            java.lang.Long r10 = r0.BDS()
            if (r10 != 0) goto L_0x0041
            r10 = r2
        L_0x0041:
            java.lang.Long r9 = r0.Afr()
            if (r9 != 0) goto L_0x0048
            r9 = r2
        L_0x0048:
            if (r10 == 0) goto L_0x002e
            if (r9 == 0) goto L_0x002e
            long r7 = r10.longValue()
            r0 = 1
            long r5 = r7 + r0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x00a1
            long r5 = r9.longValue()
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a1
        L_0x0060:
            X.18Z r2 = new X.18Z
            r2.<init>(r9, r10)
        L_0x0065:
            r16 = 0
            if (r2 == 0) goto L_0x009c
            java.lang.Long r0 = r2.A01
            if (r0 == 0) goto L_0x009c
            long r14 = r0.longValue()
        L_0x0071:
            java.lang.Long r0 = r2.A00
            if (r0 == 0) goto L_0x0079
            long r16 = r0.longValue()
        L_0x0079:
            boolean r20 = r3.A2w()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 / r12
            boolean r21 = A0F(r4, r3, r0)
            long r8 = A04(r4, r3)
            long r10 = A03(r4, r3)
            boolean r22 = X.AnonymousClass0wJ.A1W(r2)
            long r18 = r16 - r14
            X.3DJ r7 = new X.3DJ
            r12 = r23
            r7.<init>(r8, r10, r12, r14, r16, r18, r20, r21, r22)
            return r7
        L_0x009c:
            r14 = 0
            if (r2 == 0) goto L_0x0079
            goto L_0x0071
        L_0x00a1:
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002e
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63823iP.A06(com.instagram.service.session.UserSession, long):X.3DJ");
    }

    public static String A08(Fragment fragment, long j) {
        String str;
        boolean is24HourFormat = DateFormat.is24HourFormat(fragment.requireContext());
        Locale A02 = C31103Gfm.A02();
        if (is24HourFormat) {
            str = "H:mm";
        } else {
            str = "h:mma";
        }
        return new SimpleDateFormat(str, A02).format(new Date(j * 1000));
    }

    public static final boolean A0D(UserSession userSession) {
        if (userSession == null) {
            return false;
        }
        return AnonymousClass0wJ.A0Y(userSession).A2w();
    }

    public static final long A03(UserSession userSession, User user) {
        List B5Z;
        Integer Afm;
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, user);
        if (!user.A3d() || C63043bN.A01.A06(userSession).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", A1Y) || (B5Z = user.A05.B5Z()) == null || !C18190wL.A1a(B5Z) || (Afm = ((C84084sW) B5Z.get(A1Y ? 1 : 0)).Afm()) == null) {
            return C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36601835850698507L);
        }
        return (long) Afm.intValue();
    }

    public static final long A04(UserSession userSession, User user) {
        List B5Z;
        Integer BDN;
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, user);
        if (!user.A3d() || C63043bN.A01.A06(userSession).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", A1Y) || (B5Z = user.A05.B5Z()) == null || !C18190wL.A1a(B5Z) || (BDN = ((C84084sW) B5Z.get(A1Y ? 1 : 0)).BDN()) == null) {
            return C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36601835850829580L);
        }
        return (long) BDN.intValue();
    }

    public static final String A07(Context context, long j) {
        String str;
        long A0A = AnonymousClass0wJ.A0A() / 1000;
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        Locale A02 = C31103Gfm.A02();
        if (is24HourFormat) {
            str = "H:mm";
        } else {
            str = "h a";
        }
        String A0i = C18240wQ.A0i(new SimpleDateFormat(str, A02), (A0A + j) * 1000);
        C04220Ms.A06(A0i);
        return A0i;
    }

    public static final SimpleDateFormat A09(Context context, long j) {
        String str;
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        boolean A1X = C18180wK.A1X((((j / 60) % 60) > 0 ? 1 : (((j / 60) % 60) == 0 ? 0 : -1)));
        Locale A02 = C31103Gfm.A02();
        if (is24HourFormat) {
            str = "H:mm LLL d";
        } else if (A1X) {
            str = "h:mm a LLL d";
        } else {
            str = "h a LLL d";
        }
        return new SimpleDateFormat(str, A02);
    }
}
