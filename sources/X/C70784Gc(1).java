package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Gc  reason: invalid class name and case insensitive filesystem */
public abstract class C70784Gc implements C84374t2 {
    public final void C9I() {
        A00(new AnonymousClass3VC(false));
    }

    public final void A00(AnonymousClass3VC r10) {
        if (this instanceof C28361u8) {
            C28361u8 r8 = (C28361u8) this;
            C70814Gf r6 = r8.A04;
            Set set = r6.A03;
            QuickPromotionSlot quickPromotionSlot = r8.A02;
            set.remove(quickPromotionSlot);
            r6.A00.D8U(quickPromotionSlot);
            boolean z = r8.A07;
            C84574tR r7 = r8.A01;
            if (z) {
                r7.ANG("skip_local_store");
                C70814Gf.A01(quickPromotionSlot, r8.A03, r6, r10, r8.A05);
                return;
            }
            r7.ANG("update_local_store");
            C70804Ge r4 = r6.A01;
            r4.A01(r10, r8.A06, System.currentTimeMillis());
            Map map = r8.A05;
            AnonymousClass3UU r2 = r8.A03;
            C567738m r1 = r8.A00;
            r7.ANG("compare_local_remote");
            C70814Gf.A01(quickPromotionSlot, r2, r6, r4.A00(r1, r2, map), map);
            return;
        }
        C28351u7 r42 = (C28351u7) this;
        C70814Gf r3 = r42.A04;
        C70804Ge r0 = r3.A01;
        QuickPromotionSlot quickPromotionSlot2 = r42.A02;
        r0.D8U(quickPromotionSlot2);
        C70814Gf.A01(quickPromotionSlot2, r42.A03, r3, r10, r42.A05);
    }

    public final void Bwn(Map map) {
        if (this instanceof C28361u8) {
            C28361u8 r1 = (C28361u8) this;
            C70814Gf r3 = r1.A04;
            Set set = r3.A03;
            QuickPromotionSlot quickPromotionSlot = r1.A02;
            set.remove(quickPromotionSlot);
            r3.A00.D8U(quickPromotionSlot);
            Map map2 = r1.A05;
            C84374t2 r0 = (C84374t2) r3.A02.get(quickPromotionSlot);
            if (r0 != null) {
                r0.Bwn(map2);
                return;
            }
            return;
        }
        C28351u7 r12 = (C28351u7) this;
        C70814Gf r5 = r12.A04;
        C70804Ge r02 = r5.A01;
        QuickPromotionSlot quickPromotionSlot2 = r12.A02;
        r02.D8U(quickPromotionSlot2);
        C84574tR r2 = r12.A01;
        r2.ANG("cache_miss");
        Set set2 = r12.A07;
        Map map3 = r12.A05;
        Map map4 = r12.A06;
        C70814Gf.A00(r12.A00, r2, quickPromotionSlot2, r12.A03, r5, map3, map4, set2);
    }

    public final void CDd(AnonymousClass3VC r1, Map map) {
        A00(r1);
    }

    public final void CDe(AnonymousClass3UU r1, AnonymousClass3VC r2, Map map) {
        A00(r2);
    }
}
