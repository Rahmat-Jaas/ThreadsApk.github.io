package X;

import android.util.Pair;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.7HM  reason: invalid class name */
public final class AnonymousClass7HM {
    public C132697uM A00;
    public C132687uL A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;

    public final synchronized void A03(Pair pair, Reel reel, UserSession userSession) {
        C132697uM r1;
        C21785C0k c0k;
        User user;
        C132687uL r5 = this.A01;
        Long l = (Long) pair.first;
        synchronized (r5) {
            C113776s7 r6 = r5.A02;
            String A012 = A01(reel);
            long longValue = l.longValue();
            boolean A013 = r6.A01(A012, longValue);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316581303356632L) && (c0k = reel.A0V) != null && c0k.BIy() == AnonymousClass006.A03) {
                for (BKH bkh : reel.A0P(userSession)) {
                    if (!(bkh.A09() > longValue || (user = bkh.A0S) == null || user.getId() == null)) {
                        r6.A01(user.getId(), bkh.A09());
                    }
                }
            }
            if (A013) {
                r5.A00.A01(C18200wM.A0c());
            }
        }
        Object obj = pair.second;
        if (!(obj == null || (r1 = this.A00) == null || !this.A07.booleanValue() || r1 == null)) {
            r1.A00(reel, userSession, (Set) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A04(android.util.Pair r7, com.instagram.model.reels.Reel r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.7uL r5 = r6.A01     // Catch:{ all -> 0x005f }
            java.lang.Object r2 = r7.first     // Catch:{ all -> 0x005f }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x005f }
            monitor-enter(r5)     // Catch:{ all -> 0x005f }
            X.6s7 r1 = r5.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = A01(r8)     // Catch:{ all -> 0x0059 }
            long r3 = r1.A00(r0)     // Catch:{ all -> 0x0059 }
            r2.getClass()     // Catch:{ all -> 0x0059 }
            long r1 = r2.longValue()     // Catch:{ all -> 0x0059 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.C86114wI.A1S(r0)
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r7.second     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0057
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x005f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0057
            X.7uM r3 = r6.A00     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0057
            java.lang.Boolean r0 = r6.A03     // Catch:{ all -> 0x005f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r2 = r7.second     // Catch:{ all -> 0x005f }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x005f }
            monitor-enter(r3)     // Catch:{ all -> 0x005f }
            X.6s6 r1 = r3.A02     // Catch:{ all -> 0x005c }
            java.lang.String r0 = A01(r8)     // Catch:{ all -> 0x005c }
            java.util.Set r0 = r1.A00(r0)     // Catch:{ all -> 0x005c }
            boolean r2 = r0.containsAll(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "LocalSeenStateStore#areAllReelItemsSeen"
            java.lang.String r0 = A01(r8)     // Catch:{ all -> 0x005f }
            r6.A02(r1, r0, r2, r4)     // Catch:{ all -> 0x005f }
            monitor-exit(r6)
            return r2
        L_0x0057:
            monitor-exit(r6)
            return r4
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            goto L_0x005e
        L_0x005c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HM.A04(android.util.Pair, com.instagram.model.reels.Reel):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A05(com.instagram.model.reels.Reel r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.7uL r5 = r6.A01     // Catch:{ all -> 0x0048 }
            monitor-enter(r5)     // Catch:{ all -> 0x0048 }
            X.6s7 r1 = r5.A02     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x0042 }
            long r3 = r1.A00(r0)     // Catch:{ all -> 0x0042 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.C18180wK.A1X(r0)
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            X.7uM r3 = r6.A00     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0040
            java.lang.Boolean r0 = r6.A03     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            monitor-enter(r3)     // Catch:{ all -> 0x0048 }
            X.6s6 r1 = r3.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x0045 }
            java.util.Set r0 = r1.A00(r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            r2 = r0 ^ 1
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "LocalSeenStateStore#areAnyReelItemsSeen"
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x0048 }
            r6.A02(r1, r0, r2, r4)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return r2
        L_0x0040:
            monitor-exit(r6)
            return r4
        L_0x0042:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0047
        L_0x0045:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HM.A05(com.instagram.model.reels.Reel):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A06(com.instagram.model.reels.Reel r7, X.BKH r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.7uL r5 = r6.A01     // Catch:{ all -> 0x005a }
            monitor-enter(r5)     // Catch:{ all -> 0x005a }
            X.6s7 r1 = r5.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x0054 }
            long r3 = r1.A00(r0)     // Catch:{ all -> 0x0054 }
            long r1 = r8.A09()     // Catch:{ all -> 0x0054 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.C86114wI.A1S(r0)
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            X.7uM r3 = r6.A00     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0052
            java.lang.Boolean r0 = r6.A03     // Catch:{ all -> 0x005a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0052
            monitor-enter(r3)     // Catch:{ all -> 0x005a }
            X.6s6 r1 = r3.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x0057 }
            java.util.Set r2 = r1.A00(r0)     // Catch:{ all -> 0x0057 }
            X.BKU r1 = r8.A0M     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = r1.A0N     // Catch:{ all -> 0x0057 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r1.A0N     // Catch:{ all -> 0x0057 }
        L_0x003e:
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0046
        L_0x0043:
            java.lang.String r0 = r8.A0U     // Catch:{ all -> 0x0057 }
            goto L_0x003e
        L_0x0046:
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "LocalSeenStateStore#isReelItemSeen"
            java.lang.String r0 = A01(r7)     // Catch:{ all -> 0x005a }
            r6.A02(r1, r0, r2, r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r6)
            return r2
        L_0x0052:
            monitor-exit(r6)
            return r4
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0059
        L_0x0057:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
        L_0x0059:
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HM.A06(com.instagram.model.reels.Reel, X.BKH):boolean");
    }

    public static AnonymousClass7HM A00(UserSession userSession) {
        return (AnonymousClass7HM) C86134wK.A0f(userSession, AnonymousClass7HM.class, 14);
    }

    public static String A01(Reel reel) {
        if (reel.A1L) {
            return "NUX";
        }
        return reel.getId();
    }

    private void A02(String str, String str2, int i, int i2) {
        if (this.A09.booleanValue() && i != i2) {
            StringBuilder A0s = C18190wL.A0s("Result was [");
            A0s.append(i);
            A0s.append("], but expected [");
            A0s.append(i2);
            A0s.append("] for Reel with seen state key [");
            A0s.append(str2);
            String A0i = C18180wK.A0i("].", A0s);
            if (this.A08.booleanValue()) {
                C132697uM r0 = this.A00;
                r0.getClass();
                A0i = AnonymousClass00U.A0h(A0i, "\nLocalReelItemSeenState was {", r0.toString(), "}.\nLocalReelSeenState was + {", this.A01.toString());
            }
            C10450iM.A03(str, A0i);
        }
    }

    public AnonymousClass7HM(UserSession userSession) {
        this.A01 = (C132687uL) C86134wK.A0f(userSession, C132687uL.class, 13);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        boolean A0E = C63803iN.A0E(r2, userSession, 36310929125671229L);
        this.A07 = Boolean.valueOf(A0E);
        this.A03 = C63803iN.A05(r2, userSession, 36310929125802302L);
        this.A09 = C63803iN.A05(r2, userSession, 36310929126392131L);
        this.A08 = C63803iN.A05(r2, userSession, 36310929126588740L);
        this.A04 = C63803iN.A05(r2, userSession, 36310929126261057L);
        this.A06 = C63803iN.A05(r2, userSession, 36310929126129984L);
        this.A02 = C63803iN.A05(r2, userSession, 36310929126326594L);
        this.A05 = C63803iN.A05(r2, userSession, 36310929126916422L);
        if (A0E) {
            this.A00 = (C132697uM) C86134wK.A0f(userSession, C132697uM.class, 12);
        }
    }
}
