package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0E8  reason: invalid class name */
public final class AnonymousClass0E8 extends C15880s2 {
    public C11660kZ A00;
    public final Object A01 = new Object();
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();

    public final String B1c() {
        return null;
    }

    public final String B1d() {
        return null;
    }

    public final boolean BTc(C15730rn r2) {
        return true;
    }

    public final void Cd7(C15730rn r4) {
        C04220Ms.A0B(r4, 0);
        List list = this.A02;
        C11660kZ r0 = this.A00;
        if (r0 == null) {
            synchronized (this.A01) {
                r0 = this.A00;
                if (r0 == null) {
                    list.add(r4);
                    r0 = null;
                }
            }
            if (r0 == null) {
                return;
            }
        }
        r0.Cd7(r4);
    }

    public final void Ce1(C15730rn r4) {
        C04220Ms.A0B(r4, 0);
        List list = this.A03;
        C11660kZ r0 = this.A00;
        if (r0 == null) {
            synchronized (this.A01) {
                r0 = this.A00;
                if (r0 == null) {
                    list.add(r4);
                    r0 = null;
                }
            }
            if (r0 == null) {
                return;
            }
        }
        r0.Ce1(r4);
    }
}
