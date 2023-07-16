package X;

import java.util.Iterator;

/* renamed from: X.846  reason: invalid class name */
public final class AnonymousClass846 implements Iterator, C03740Kn {
    public String A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass86Y A02;

    public AnonymousClass846(AnonymousClass86Y r1) {
        this.A02 = r1;
    }

    public final boolean hasNext() {
        String str = this.A00;
        if (str == null && !this.A01) {
            str = this.A02.A00.readLine();
            this.A00 = str;
            if (str == null) {
                this.A01 = true;
            }
        }
        if (str == null) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            String str = this.A00;
            this.A00 = null;
            C04220Ms.A0A(str);
            return str;
        }
        throw C86154wM.A0u();
    }

    public final void remove() {
        throw C18220wO.A0v();
    }
}
