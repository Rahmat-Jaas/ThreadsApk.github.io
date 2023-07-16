package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Tl  reason: invalid class name and case insensitive filesystem */
public final class C122687Tl implements C142648fM {
    public final List A00;

    public final /* bridge */ /* synthetic */ C147228p0 ANq(int i) {
        return (C122787Tv) this.A00.get(i);
    }

    public C122687Tl(C1203479u r5, float f, float f2) {
        AnonymousClass8bH A0C = AnonymousClass8bI.A0C(0, r5.A02());
        ArrayList A0w = AnonymousClass0wJ.A0w(A0C);
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            A0w.add(new C122787Tv(f, f2, r5.A01(((C1367083z) it).A00())));
        }
        this.A00 = A0w;
    }
}
