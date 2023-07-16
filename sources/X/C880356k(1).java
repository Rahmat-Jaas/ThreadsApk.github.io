package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.56k  reason: invalid class name and case insensitive filesystem */
public final class C880356k extends C880756q {
    public final Set A00 = C18200wM.A0u();

    public final void A0B(AnonymousClass066 r6) {
        C04220Ms.A0B(r6, 0);
        Set set = this.A00;
        ArrayList<C123947a1> A0v = AnonymousClass0wJ.A0v();
        for (Object next : set) {
            C123947a1 r1 = (C123947a1) next;
            if ((r1 instanceof AnonymousClass602) && C18180wK.A1Z(((AnonymousClass602) r1).A00, r6)) {
                A0v.add(next);
            }
        }
        for (C123947a1 r0 : A0v) {
            A0F(r0.A01);
        }
    }

    public final void A0E(C143158gC r5) {
        C04220Ms.A0B(r5, 0);
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C123947a1) next).A01 == r5) {
                if (next != null) {
                    if (!(!(next instanceof AnonymousClass602))) {
                        throw C18190wL.A0a("Cant attach observer using different lifecycle");
                    }
                    return;
                }
            }
        }
        C123947a1 r0 = new C123947a1(r5);
        set.add(r0);
        super.A0E(r0);
    }

    public final void A0F(C143158gC r5) {
        Object obj;
        C04220Ms.A0B(r5, 0);
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C123947a1) obj).A01 == r5) {
                break;
            }
        }
        C123947a1 r1 = (C123947a1) obj;
        if (r1 != null) {
            super.A0F(r1);
            set.remove(r1);
        }
    }

    public final void A0H(Object obj) {
        for (C123947a1 r1 : this.A00) {
            r1.A00 = false;
        }
        super.A0H(obj);
    }

    public final void A0C(AnonymousClass066 r5, C143158gC r6) {
        Object obj;
        AnonymousClass0wJ.A1N(r5, r6);
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C123947a1) obj).A01 == r6) {
                break;
            }
        }
        C123947a1 r1 = (C123947a1) obj;
        if (r1 == null) {
            AnonymousClass602 r0 = new AnonymousClass602(r5, r6);
            set.add(r0);
            super.A0C(r5, r0);
        } else if (!(r1 instanceof AnonymousClass602) || !C18180wK.A1Z(((AnonymousClass602) r1).A00, r5)) {
            throw C18190wL.A0a("Cant attach observer using different lifecycle");
        }
    }
}
