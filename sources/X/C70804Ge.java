package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Ge  reason: invalid class name and case insensitive filesystem */
public final class C70804Ge implements C84384t3 {
    public final AnonymousClass3F2 A00;
    public final Map A01;
    public final Map A02 = new EnumMap(QuickPromotionSurface.class);
    public final int A03;
    public final C70764Ga A04;
    public final AnonymousClass3EU A05;
    public final UserSession A06;

    public final void B4r(C567738m r19, C84574tR r20, QuickPromotionSlot quickPromotionSlot, AnonymousClass3UU r22, Map map, Set set) {
        AnonymousClass3VC r9 = new AnonymousClass3VC(false);
        AnonymousClass3EU r6 = this.A05;
        UserSession userSession = this.A06;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        Map map2 = map;
        AnonymousClass1u9 r5 = new AnonymousClass1u9(r6, quickPromotionSlot2, this, r9, userSession, map2, set);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313888358139612L)) {
            this.A04.Bd2((String) null, quickPromotionSlot2.toString(), map2);
            r5.A01((AnonymousClass3VC) null);
        }
        AnonymousClass3UU r13 = r22;
        AnonymousClass3VC A002 = A00(r19, r13, map2);
        if (!A002.A02.isEmpty()) {
            r5.A01(A002);
        } else {
            int i = this.A03;
            Integer num = AnonymousClass006.A0C;
            C58053Dq r12 = C60933Rd.A00;
            if (r12 == null) {
                r12 = new C58053Dq();
                C60933Rd.A00 = r12;
            }
            H1T A003 = r12.A00(r13, userSession, num, map2, i);
            A003.A01 = new CY0(C18987Aon.A00, AnonymousClass3O1.class);
            C32165H8c A0Q = C18190wL.A0Q(A003);
            A0Q.A00 = r5;
            C31155GhB.A03(A0Q);
        }
        this.A04.Bd5((String) null, quickPromotionSlot2.toString(), map2);
    }

    public final void BQn(C81644o8 r1, QuickPromotionSlot quickPromotionSlot) {
    }

    public final void Cia(C84374t2 r2, QuickPromotionSlot quickPromotionSlot) {
        this.A01.put(quickPromotionSlot, r2);
    }

    public final void D8U(QuickPromotionSlot quickPromotionSlot) {
        this.A01.remove(quickPromotionSlot);
    }

    public C70804Ge(Context context, C70764Ga r9, UserSession userSession) {
        this.A03 = C18190wL.A03(context);
        this.A06 = userSession;
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            this.A02.put(quickPromotionSurface, new AnonymousClass3HC(quickPromotionSurface, this.A06));
        }
        this.A01 = AnonymousClass0wJ.A0y();
        this.A05 = new AnonymousClass3EU();
        this.A04 = r9;
        this.A00 = new AnonymousClass3F2(new C560935t(this.A06));
    }

    public final AnonymousClass3VC A00(C567738m r22, AnonymousClass3UU r23, Map map) {
        List<AnonymousClass18L> A012;
        List list;
        ArrayList<C81644o8> A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object obj = this.A02.get(A0o.getKey());
            obj.getClass();
            AnonymousClass3HC r4 = (AnonymousClass3HC) obj;
            Iterator it = ((Set) A0o.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    C04220Ms.A0B(next, 0);
                    C61263Sn r10 = (C61263Sn) r4.A01.get(next);
                    if (r10 == null) {
                        list = AnonymousClass0ZV.A00;
                    } else {
                        QuickPromotionSurface quickPromotionSurface = r4.A00;
                        C567738m r8 = r22;
                        C04220Ms.A0A(r8);
                        C61563Ua r13 = (C61563Ua) C61563Ua.A03.getValue();
                        AnonymousClass3H6 r5 = r10.A01;
                        long j = r10.A00;
                        if (j < 0) {
                            j = 0;
                        }
                        Set singleton = Collections.singleton(r10.A02);
                        String num = Integer.toString(quickPromotionSurface.A00);
                        AnonymousClass1Pw A002 = r13.A00(r8.A00, r23, r8.A01, num, singleton, j);
                        synchronized (r5) {
                            A012 = r5.A01(A002, r5.A00);
                        }
                        ArrayList A0v2 = AnonymousClass0wJ.A0v();
                        for (AnonymousClass18L r0 : A012) {
                            A0v2.add(r0.A01);
                        }
                        list = A0v2;
                    }
                    A0v.addAll(list);
                }
            }
        }
        AnonymousClass3VC r2 = new AnonymousClass3VC(true);
        for (C81644o8 A013 : A0v) {
            r2.A01(A013);
        }
        return r2;
    }

    public final void A01(AnonymousClass3VC r9, Map map, long j) {
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) A0x.next();
            EnumMap enumMap = new EnumMap(Trigger.class);
            Object obj = map.get(quickPromotionSurface);
            obj.getClass();
            for (Object put : (Set) obj) {
                enumMap.put(put, AnonymousClass0wJ.A0v());
            }
            for (C81644o8 r5 : r9.A00(quickPromotionSurface)) {
                for (Object next : EnumSet.copyOf(((C28291u0) r5).A0F)) {
                    if (enumMap.containsKey(next)) {
                        Object obj2 = enumMap.get(next);
                        obj2.getClass();
                        ((List) obj2).add(r5);
                    }
                }
            }
            Object obj3 = this.A02.get(quickPromotionSurface);
            obj3.getClass();
            AnonymousClass3HC r52 = (AnonymousClass3HC) obj3;
            Iterator A0u = C18190wL.A0u(enumMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                Trigger trigger = (Trigger) A0o.getKey();
                List<C81644o8> list = (List) A0o.getValue();
                AnonymousClass0wJ.A1N(trigger, list);
                C61263Sn A012 = r52.A01(trigger);
                if (A012 != null) {
                    A012.A00 = j;
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    for (C81644o8 r1 : list) {
                        if (r1 instanceof C28291u0) {
                            A0v.add(new AnonymousClass18L((C28291u0) r1));
                        }
                    }
                    A012.A01.A02(A0v);
                }
            }
        }
    }
}
