package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6pk  reason: invalid class name and case insensitive filesystem */
public final class C112526pk {
    public final int A00;
    public final Map A01 = AnonymousClass0wJ.A0y();
    public final Set A02 = C18200wM.A0u();

    public final void A00() {
        Iterator A0z = AnonymousClass0wJ.A0z(this.A01);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            AnonymousClass01V.A0p.markerAnnotate(this.A00, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
        }
        AnonymousClass01V.A0p.markerEnd(this.A00, 467);
    }

    public C112526pk(int i) {
        this.A00 = i;
    }
}
