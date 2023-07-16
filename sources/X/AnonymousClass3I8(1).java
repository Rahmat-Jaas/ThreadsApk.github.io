package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.3I8  reason: invalid class name */
public final class AnonymousClass3I8 {
    public final C57343Ar A00 = new C57343Ar();
    public final List A01 = AnonymousClass0wJ.A0v();
    public final List A02 = AnonymousClass0wJ.A0v();

    public final void A01(AnonymousClass395 r5, boolean z, boolean z2) {
        AnonymousClass395 r1;
        AnonymousClass395 r12;
        List list;
        if (z) {
            r5.A00 = true;
            this.A01.add(r5);
            List list2 = this.A02;
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C04220Ms.A0I(((AnonymousClass395) it.next()).A01, r5.A01)) {
                        r12 = r5;
                        break;
                    }
                } else {
                    r12 = null;
                    break;
                }
            }
            C03940Lk.A00(list2).remove(r12);
            C57343Ar r2 = this.A00;
            User user = r5.A01;
            r2.A02.remove(user);
            if (z2) {
                list = r2.A01;
            } else {
                list = r2.A00;
            }
            list.add(user);
            return;
        }
        r5.A00 = false;
        this.A02.add(r5);
        List list3 = this.A01;
        Iterator it2 = list3.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C04220Ms.A0I(((AnonymousClass395) it2.next()).A01, r5.A01)) {
                    r1 = r5;
                    break;
                }
            } else {
                r1 = null;
                break;
            }
        }
        C03940Lk.A00(list3).remove(r1);
        C57343Ar r22 = this.A00;
        User user2 = r5.A01;
        r22.A02.add(user2);
        r22.A00.remove(user2);
        r22.A01.remove(user2);
    }

    public final void A00() {
        List<AnonymousClass395> list = this.A01;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (AnonymousClass395 r0 : list) {
            r0.A00 = false;
            A0w.add(Unit.A00);
        }
        for (AnonymousClass395 r02 : list) {
            C57343Ar r2 = this.A00;
            User user = r02.A01;
            r2.A02.add(user);
            r2.A00.remove(user);
            r2.A01.remove(user);
        }
        this.A02.addAll(0, list);
        list.clear();
    }

    public final void A02(List list) {
        List list2 = this.A01;
        list2.clear();
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0w.add(new AnonymousClass395(C18220wO.A0c(it), true));
        }
        list2.addAll(A0w);
    }
}
