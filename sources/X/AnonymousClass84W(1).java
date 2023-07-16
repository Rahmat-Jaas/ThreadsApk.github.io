package X;

import java.util.Observable;
import java.util.Observer;

/* renamed from: X.84W  reason: invalid class name */
public final class AnonymousClass84W implements Observer {
    public C143718hC A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass84W) || !this.A00.equals(((AnonymousClass84W) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void update(Observable observable, Object obj) {
        this.A00.CRe(obj);
    }

    public AnonymousClass84W(C143718hC r1) {
        this.A00 = r1;
    }
}
