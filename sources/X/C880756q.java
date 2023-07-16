package X;

import java.util.Iterator;

/* renamed from: X.56q  reason: invalid class name and case insensitive filesystem */
public class C880756q extends C880856r {
    public MNg A00 = new MNg();

    public static C880756q A01() {
        return new C880756q();
    }

    public void A09() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C123957a2 r1 = (C123957a2) C18180wK.A0o(it).getValue();
            r1.A02.A0E(r1);
        }
    }

    public void A0A() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C123957a2 r1 = (C123957a2) C18180wK.A0o(it).getValue();
            r1.A02.A0F(r1);
        }
    }

    public final void A0J(M5J m5j) {
        C123957a2 r1 = (C123957a2) this.A00.A03(m5j);
        if (r1 != null) {
            r1.A02.A0F(r1);
        }
    }

    public final void A0K(M5J m5j, C143158gC r4) {
        if (m5j != null) {
            C123957a2 r1 = new C123957a2(m5j, r4);
            C123957a2 r0 = (C123957a2) this.A00.A04(m5j, r1);
            if (r0 != null) {
                if (r0.A01 != r4) {
                    throw C18190wL.A0a("This source was already added with the different observer");
                }
            } else if (A0I()) {
                r1.A02.A0E(r1);
            }
        } else {
            throw C18210wN.A0W("source cannot be null");
        }
    }
}
