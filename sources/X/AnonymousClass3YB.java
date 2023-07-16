package X;

import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YB  reason: invalid class name */
public final class AnonymousClass3YB {
    public final AnonymousClass35J A00;
    public final UserSession A01;
    public final HashMap A02;

    public AnonymousClass3YB(AnonymousClass35J r15, UserSession userSession) {
        AnonymousClass2AP r1;
        C04220Ms.A0B(r15, 1);
        this.A00 = r15;
        this.A01 = userSession;
        HashMap A0y = AnonymousClass0wJ.A0y();
        this.A02 = A0y;
        A0y.clear();
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A00.A00, 36310877586063632L)) {
            r1 = AnonymousClass2AP.A0a;
        } else {
            r1 = AnonymousClass2AP.A0R;
        }
        AnonymousClass2AP r6 = AnonymousClass2AP.A0N;
        AnonymousClass2AP r8 = AnonymousClass2AP.A0S;
        C61633Uq A012 = A01(r1, new C61633Uq[0]);
        AnonymousClass2AP r10 = AnonymousClass2AP.A0Q;
        UserSession userSession2 = this.A01;
        List A0G = userSession2.multipleAccountHelper.A0G(userSession2.getUserId());
        ArrayList A0x = AnonymousClass0wJ.A0x(A0G, 10);
        Iterator it = A0G.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            AnonymousClass4EA r11 = new AnonymousClass4EA((AnonymousClass2AP) null, A0k);
            List<AnonymousClass2AP> list = AnonymousClass4EA.A03;
            ArrayList<AnonymousClass4EA> A0x2 = AnonymousClass0wJ.A0x(list, 10);
            for (AnonymousClass2AP r12 : list) {
                A0x2.add(new AnonymousClass4EA(r12, A0k));
            }
            ArrayList A0x3 = AnonymousClass0wJ.A0x(A0x2, 10);
            for (AnonymousClass4EA A013 : A0x2) {
                A0x3.add(A01(A013, new C61633Uq[0]));
            }
            A0x.add(A00(r11, A0x3));
        }
        C61633Uq A014 = A01(r8, A012, A00(r10, A0x));
        AnonymousClass2AP r5 = AnonymousClass2AP.A06;
        ArrayList<C83654rl> A0v = AnonymousClass0wJ.A0v();
        for (Object add : AnonymousClass31A.A00) {
            A0v.add(add);
        }
        A0v.add(AnonymousClass2AP.A08);
        A0v.add(AnonymousClass2AP.A0O);
        ArrayList A0x4 = AnonymousClass0wJ.A0x(A0v, 10);
        for (C83654rl A015 : A0v) {
            A0x4.add(A01(A015, new C61633Uq[0]));
        }
        A01(r6, A014, A00(r5, A0x4));
        A01(AnonymousClass2AP.A0K, A01(r5, new C61633Uq[0]));
        A01(AnonymousClass2AP.A05, new C61633Uq[0]);
        A01(AnonymousClass2AP.A0V, new C61633Uq[0]);
    }

    private final C61633Uq A00(C83654rl r4, List list) {
        Object[] array = list.toArray(new C61633Uq[0]);
        HashMap hashMap = this.A02;
        C61633Uq r1 = (C61633Uq) hashMap.get(r4);
        if (r1 != null) {
            return r1;
        }
        C61633Uq r12 = new C61633Uq(r4, this, AnonymousClass8AP.A0A(array));
        hashMap.put(r4, r12);
        return r12;
    }

    private final C61633Uq A01(C83654rl r4, C61633Uq... r5) {
        HashMap hashMap = this.A02;
        C61633Uq r1 = (C61633Uq) hashMap.get(r4);
        if (r1 != null) {
            return r1;
        }
        C61633Uq r12 = new C61633Uq(r4, this, AnonymousClass8AP.A0A(r5));
        hashMap.put(r4, r12);
        return r12;
    }

    public final void A02(AnonymousClass17J r4) {
        HashMap hashMap = this.A02;
        C83654rl r2 = r4.A03;
        C61633Uq r1 = (C61633Uq) hashMap.get(r2);
        if (r1 != null && C04220Ms.A0I(r1.A00, r2)) {
            r1.A02.CrC(r4);
        }
    }
}
