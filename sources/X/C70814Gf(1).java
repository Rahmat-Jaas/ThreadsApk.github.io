package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Gf  reason: invalid class name and case insensitive filesystem */
public final class C70814Gf implements C84384t3, AnonymousClass0i4 {
    public final C84384t3 A00;
    public final C70804Ge A01;
    public final Map A02 = AnonymousClass0wJ.A0y();
    public final Set A03 = C18200wM.A0u();
    public final AnonymousClass44Y A04;
    public final UserSession A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r13.A01.isEmpty() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C567738m r10, X.C84574tR r11, com.instagram.quickpromotion.intf.QuickPromotionSlot r12, X.AnonymousClass3UU r13, X.C70814Gf r14, java.util.Map r15, java.util.Map r16, java.util.Set r17) {
        /*
            r4 = r13
            if (r13 == 0) goto L_0x000c
            com.google.common.collect.ImmutableMap r0 = r13.A01
            boolean r0 = r0.isEmpty()
            r8 = 1
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r8 = 0
        L_0x000d:
            r5 = r14
            java.util.Set r0 = r14.A03
            r3 = r12
            r0.add(r12)
            java.lang.String r0 = "fetch_remote"
            r2 = r11
            r11.ANG(r0)
            X.4t3 r9 = r14.A00
            X.1u8 r0 = new X.1u8
            r1 = r10
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.Cia(r0, r12)
            r15 = r17
            r14 = r7
            r9.B4r(r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70814Gf.A00(X.38m, X.4tR, com.instagram.quickpromotion.intf.QuickPromotionSlot, X.3UU, X.4Gf, java.util.Map, java.util.Map, java.util.Set):void");
    }

    public static void A01(QuickPromotionSlot quickPromotionSlot, AnonymousClass3UU r2, C70814Gf r3, AnonymousClass3VC r4, Map map) {
        C84374t2 r1 = (C84374t2) r3.A02.get(quickPromotionSlot);
        if (r1 == null) {
            return;
        }
        if (r4.A02.isEmpty()) {
            r1.C9I();
        } else {
            r1.CDe(r2, r4, map);
        }
    }

    public final void B4r(C567738m r34, C84574tR r35, QuickPromotionSlot quickPromotionSlot, AnonymousClass3UU r37, Map map, Set set) {
        String str;
        AnonymousClass3UU r21;
        C70814Gf r22;
        Map map2;
        HashMap hashMap;
        C70764Ga A002 = AnonymousClass2SX.A00(this.A05);
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        C84574tR r4 = r35;
        Map map3 = map;
        if (this.A03.contains(quickPromotionSlot2)) {
            r4.ANG("request_already_inprogress");
            A002.Bda((String) null, quickPromotionSlot2.toString(), map3, true);
            return;
        }
        String obj = quickPromotionSlot2.toString();
        A002.Bda((String) null, obj, map3, false);
        C567738m r18 = r34;
        AnonymousClass3UU r2 = r37;
        Set set2 = set;
        if (r37 == null || r2.A01.isEmpty()) {
            C70804Ge r10 = this.A01;
            if (!map3.isEmpty()) {
                int i = 1;
                Iterator A0z = AnonymousClass0wJ.A0z(map3);
                while (true) {
                    if (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        if (i == 3) {
                            break;
                        }
                        Object obj2 = r10.A02.get(A0o.getKey());
                        obj2.getClass();
                        AnonymousClass3HC r8 = (AnonymousClass3HC) obj2;
                        Iterator it = ((Set) A0o.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int A003 = r8.A00((Trigger) it.next());
                            if (A003 == 3) {
                                i = 3;
                                break;
                            } else if (A003 == 2 || (A003 == 0 && i != 2)) {
                                i = A003;
                            }
                        }
                    } else {
                        if (i == 0) {
                            str = "unset";
                        } else if (i == 1) {
                            this.A04.A00(quickPromotionSlot2.name(), "cache", "fresh", map3, false, false);
                            r4.ANG("fetch_cache_result");
                            C84574tR r19 = r4;
                            QuickPromotionSlot quickPromotionSlot3 = quickPromotionSlot2;
                            r10.Cia(new C28351u7(r18, r19, quickPromotionSlot3, r2, this, map3, map3, set2), quickPromotionSlot2);
                            r10.B4r(r18, r4, quickPromotionSlot2, r2, map3, set2);
                            return;
                        } else if (i == 2) {
                            str = "dirty";
                        }
                        r4.ANG("dirty_unset_cache");
                        HashMap A0y = AnonymousClass0wJ.A0y();
                        for (C40337Lct lct : M5W.A01(quickPromotionSlot2)) {
                            Map map4 = r10.A02;
                            QuickPromotionSurface quickPromotionSurface = lct.A00;
                            Object obj3 = map4.get(quickPromotionSurface);
                            obj3.getClass();
                            AnonymousClass3HC r13 = (AnonymousClass3HC) obj3;
                            HashSet A0u = C18200wM.A0u();
                            AnonymousClass3F2 r6 = r10.A00;
                            EnumSet enumSet = lct.A01;
                            C04220Ms.A06(enumSet);
                            for (Trigger trigger : r6.A00(enumSet)) {
                                int A004 = r13.A00(trigger);
                                if (A004 == 0 || A004 == 2) {
                                    A0u.add(trigger);
                                }
                            }
                            if (!A0u.isEmpty()) {
                                A0y.put(quickPromotionSurface, A0u);
                            }
                        }
                        this.A04.A00(quickPromotionSlot2.name(), "remote", str, map3, false, false);
                        r21 = r2;
                        r22 = this;
                        map2 = map3;
                        hashMap = A0y;
                    }
                }
            }
            C10450iM.A03("IG-QP", AnonymousClass0wJ.A0t("Surface to trigger mapping is invalid: ", map3));
            A002.BbU((String) null, obj, map3);
            C84374t2 r0 = (C84374t2) this.A02.get(quickPromotionSlot2);
            if (r0 != null) {
                r0.Bwn(map3);
                return;
            }
            return;
        }
        boolean z = r2.A00;
        r4.ANG("skip_cache");
        this.A04.A00(quickPromotionSlot2.name(), "cache", (String) null, map3, true, z);
        hashMap = map3;
        r21 = r2;
        r22 = this;
        map2 = map3;
        A00(r18, r4, quickPromotionSlot2, r21, r22, map2, hashMap, set2);
    }

    public final void BQn(C81644o8 r6, QuickPromotionSlot quickPromotionSlot) {
        C70804Ge r3 = this.A01;
        C28291u0 r62 = (C28291u0) r6;
        QuickPromotionSurface quickPromotionSurface = r62.A06;
        EnumSet<Trigger> copyOf = EnumSet.copyOf(r62.A0F);
        Object obj = r3.A02.get(quickPromotionSurface);
        obj.getClass();
        AnonymousClass3HC r4 = (AnonymousClass3HC) obj;
        for (Trigger trigger : copyOf) {
            C04220Ms.A0B(trigger, 0);
            C61263Sn A012 = r4.A01(trigger);
            if (A012 != null) {
                A012.A00 = -1;
                A012.A01.A02(Collections.emptyList());
            }
        }
    }

    public final void Cia(C84374t2 r2, QuickPromotionSlot quickPromotionSlot) {
        this.A02.put(quickPromotionSlot, r2);
    }

    public final void D8U(QuickPromotionSlot quickPromotionSlot) {
        this.A02.remove(quickPromotionSlot);
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
        this.A03.clear();
        this.A05.A03(C70814Gf.class);
    }

    public C70814Gf(Context context, AnonymousClass44Y r3, C70764Ga r4, C84384t3 r5, UserSession userSession) {
        this.A05 = userSession;
        this.A01 = new C70804Ge(context, r4, userSession);
        this.A00 = r5;
        this.A04 = r3;
    }
}
