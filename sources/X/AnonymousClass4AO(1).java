package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4AO  reason: invalid class name */
public final class AnonymousClass4AO implements C34096I0r {
    public final ArrayList A00 = AnonymousClass0wJ.A0v();

    public final void A5P(C33454Ho9 ho9) {
        C04220Ms.A0B(ho9, 0);
        this.A00.add(ho9);
    }

    public final C33454Ho9 ANu(int i) {
        Object obj = this.A00.get(i);
        C04220Ms.A06(obj);
        return (C33454Ho9) obj;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final Iterator iterator() {
        Iterator it = this.A00.iterator();
        C04220Ms.A06(it);
        return it;
    }

    public final int size() {
        return this.A00.size();
    }
}
