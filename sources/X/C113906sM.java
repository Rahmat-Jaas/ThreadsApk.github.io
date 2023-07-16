package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6sM  reason: invalid class name and case insensitive filesystem */
public final class C113906sM {
    public int A00;
    public int A01;
    public C143988hd A02;
    public Set A03;
    public final Set A04 = C18200wM.A0u();
    public final Set A05;

    public final AnonymousClass78C A00() {
        if (AnonymousClass0wJ.A1W(this.A02)) {
            return new AnonymousClass78C(this.A02, new HashSet(this.A05), new HashSet(this.A04), this.A03, this.A00, this.A01);
        }
        throw C18180wK.A0a("Missing required property: factory.");
    }

    public final void A01(AnonymousClass79T r3) {
        if (!this.A05.contains(r3.A01)) {
            this.A04.add(r3);
            return;
        }
        throw C18190wL.A0a("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C113906sM(Class cls, Class... clsArr) {
        HashSet A0u = C18200wM.A0u();
        this.A05 = A0u;
        int i = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = C18200wM.A0u();
        A0u.add(cls);
        int length = clsArr.length;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw C18210wN.A0W("Null interface");
            }
        }
        Collections.addAll(this.A05, clsArr);
    }
}
