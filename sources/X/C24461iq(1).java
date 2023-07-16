package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1iq  reason: invalid class name and case insensitive filesystem */
public abstract class C24461iq extends C63873iU implements C84374t2 {
    public final AnonymousClass3EU A00;
    public final QuickPromotionSlot A01;
    public final AnonymousClass3VC A02;
    public final UserSession A03;
    public final Map A04;
    public final Set A05;

    public final void C9I() {
        A01((AnonymousClass3VC) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.1u9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.1uA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1u9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1u9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C84374t2 A00() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C28371uA
            if (r0 == 0) goto L_0x0014
            r2 = r3
            X.1uA r2 = (X.C28371uA) r2
            X.4Gd r0 = r2.A00
            java.util.Map r1 = r0.A00
        L_0x000b:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r2.A01
            java.lang.Object r0 = r1.get(r0)
            X.4t2 r0 = (X.C84374t2) r0
            return r0
        L_0x0014:
            r2 = r3
            X.1u9 r2 = (X.AnonymousClass1u9) r2
            X.4Ge r0 = r2.A00
            java.util.Map r1 = r0.A01
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24461iq.A00():X.4t2");
    }

    public final void A01(AnonymousClass3VC r6) {
        AnonymousClass01V r3;
        int hashCode;
        int i;
        short s;
        if (this instanceof C28371uA) {
            C84374t2 A002 = A00();
            if (A002 != null) {
                if (r6 == null || r6.A02.isEmpty()) {
                    A002.C9I();
                } else {
                    A002.CDd(r6, this.A04);
                }
                QuickPromotionSlot quickPromotionSlot = this.A01;
                C04220Ms.A0B(quickPromotionSlot, 0);
                r3 = AnonymousClass01V.A0p;
                hashCode = quickPromotionSlot.hashCode();
                i = 35061762;
                s = 2;
            } else {
                QuickPromotionSlot quickPromotionSlot2 = this.A01;
                C04220Ms.A0B(quickPromotionSlot2, 0);
                r3 = AnonymousClass01V.A0p;
                hashCode = quickPromotionSlot2.hashCode();
                i = 35061762;
                s = 4;
            }
            r3.markerEnd(i, hashCode, s);
            return;
        }
        AnonymousClass1u9 r4 = (AnonymousClass1u9) this;
        if (r6 != null) {
            r4.A00.A01(r6, r4.A04, System.currentTimeMillis());
        }
        C84374t2 A003 = r4.A00();
        if (A003 == null) {
            return;
        }
        if (r6 == null || r6.A02.isEmpty()) {
            A003.C9I();
        } else {
            A003.CDd(r6, r4.A04);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        long j;
        long j2;
        long j3;
        Long l;
        Long l2;
        int A032 = C14030oh.A03(-1002141406);
        C963064g r13 = (C963064g) obj;
        int A033 = C14030oh.A03(1478728618);
        QuickPromotionSlot quickPromotionSlot = this.A01;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        C04220Ms.A0B(quickPromotionSlot, 0);
        int hashCode = quickPromotionSlot2.hashCode();
        AnonymousClass01V.A0p.markerStart(35061762, hashCode);
        AnonymousClass01V.A0p.markerAnnotate(35061762, hashCode, "slot", quickPromotionSlot2.name());
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.A04;
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) A0x.next();
            Set set = (Set) map.get(quickPromotionSurface);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(currentTimeMillis);
            UserSession userSession = this.A03;
            Set set2 = this.A05;
            if (set != null) {
                ArrayList<C57833Cq> A0v = AnonymousClass0wJ.A0v();
                List<C57833Cq> A002 = r13.A00(quickPromotionSurface);
                if (A002 != null && !A002.isEmpty()) {
                    long seconds2 = timeUnit.toSeconds(System.currentTimeMillis());
                    for (C57833Cq r9 : A002) {
                        if (this.A00.A00((Context) null, quickPromotionSurface, r9, userSession, set, set2, seconds2, seconds, r9.A05).A02) {
                            A0v.add(r9);
                        }
                    }
                    if (!A0v.isEmpty()) {
                        for (C57833Cq r8 : A0v) {
                            AnonymousClass3GI r7 = r8.A02;
                            C568038p r0 = r8.A01;
                            if (r0 != null && (l2 = r0.A00) != null) {
                                j = l2.longValue();
                            } else if (r8.A03 != null) {
                                j = timeUnit.toSeconds(System.currentTimeMillis()) + r8.A03.longValue();
                            } else {
                                j = 0;
                            }
                            C568038p r92 = r8.A01;
                            if (r92 == null || (l = r92.A01) == null) {
                                j2 = 0;
                            } else {
                                j2 = l.longValue();
                            }
                            Long l3 = r8.A03;
                            C62303Ye A003 = AnonymousClass3XY.A00(AnonymousClass3XY.A01(), userSession.getUserId(), r7.A05);
                            if (A003 == null) {
                                A003 = new C62303Ye(userSession.getUserId(), r7.A05, j);
                                AnonymousClass3XY.A01().A01.A01(A003);
                            }
                            List list = r7.A06;
                            list.getClass();
                            C28221tt r93 = (C28221tt) list.get(0);
                            AnonymousClass3VC r72 = this.A02;
                            String userId = userSession.getUserId();
                            AnonymousClass3GI r22 = r8.A02;
                            if (l3 != null) {
                                j3 = l3.longValue();
                            } else {
                                j3 = Long.MAX_VALUE;
                            }
                            r72.A01(C36802Ss.A00(quickPromotionSurface, r93, r22, A003, userId, r8.A00, j2, j, j3, r8.A05, r8.A04));
                        }
                    }
                }
            }
        }
        int i = this.A02.A00;
        int hashCode2 = quickPromotionSlot2.hashCode();
        AnonymousClass01V.A0p.markerPoint(35061762, hashCode2, "edges_validated");
        AnonymousClass01V.A0p.markerAnnotate(35061762, hashCode2, "promotion_count", i);
        C14030oh.A0A(851402093, A033);
        C14030oh.A0A(278070553, A032);
    }

    public C24461iq(AnonymousClass3EU r1, QuickPromotionSlot quickPromotionSlot, AnonymousClass3VC r3, UserSession userSession, Map map, Set set) {
        this.A01 = quickPromotionSlot;
        this.A04 = map;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = userSession;
        this.A05 = set;
    }

    public final void Bwn(Map map) {
        C84374t2 A002 = A00();
        if (A002 != null) {
            A002.Bwn(map);
        }
    }

    public final void CDd(AnonymousClass3VC r1, Map map) {
        A01(r1);
    }

    public final void CDe(AnonymousClass3UU r1, AnonymousClass3VC r2, Map map) {
        A01(r2);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032 = C14030oh.A03(982666394);
        Bwn((Map) null);
        C14030oh.A0A(-1499037536, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(779045661);
        int A033 = C14030oh.A03(1413565541);
        AnonymousClass3VC r1 = this.A02;
        if (r1.A02.isEmpty()) {
            r1 = null;
        }
        A01(r1);
        C14030oh.A0A(-1280180852, A033);
        C14030oh.A0A(814425904, A032);
    }
}
