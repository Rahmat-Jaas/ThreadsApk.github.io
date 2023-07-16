package X;

import java.util.Iterator;
import kotlin.Unit;

/* renamed from: X.83y  reason: invalid class name and case insensitive filesystem */
public final class C1366983y implements Iterator, C146958n9, C03740Kn {
    public int A00;
    public Iterator A01;
    public C146958n9 A02;
    public Object A03;

    public final Object A00(Object obj, C146958n9 r3) {
        this.A03 = obj;
        this.A00 = 3;
        this.A02 = r3;
        return D0E.COROUTINE_SUSPENDED;
    }

    public final C27952Ew2 getContext() {
        return AnonymousClass869.A00;
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.A01;
                    C04220Ms.A0A(it);
                    if (it.hasNext()) {
                        this.A00 = 2;
                        return true;
                    }
                    this.A01 = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw C18180wK.A0a("Iterator has failed.");
                }
            }
            this.A00 = 5;
            C146958n9 r1 = this.A02;
            C04220Ms.A0A(r1);
            this.A02 = null;
            r1.resumeWith(Unit.A00);
        }
    }

    public final Object next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw C86154wM.A0u();
        } else if (i == 2) {
            this.A00 = 1;
            Iterator it = this.A01;
            C04220Ms.A0A(it);
            return it.next();
        } else if (i == 3) {
            this.A00 = 0;
            Object obj = this.A03;
            this.A03 = null;
            return obj;
        } else if (i != 4) {
            throw C18180wK.A0a("Iterator has failed.");
        } else {
            throw C86154wM.A0u();
        }
    }

    public final Object A01(C146958n9 r3, C146838mw r4) {
        Object obj;
        Iterator it = r4.iterator();
        if (!it.hasNext()) {
            obj = Unit.A00;
        } else {
            this.A01 = it;
            this.A00 = 2;
            this.A02 = r3;
            obj = D0E.COROUTINE_SUSPENDED;
        }
        if (obj != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return obj;
    }

    public final void remove() {
        throw C18220wO.A0v();
    }

    public final void resumeWith(Object obj) {
        AnonymousClass0OU.A00(obj);
        this.A00 = 4;
    }
}
