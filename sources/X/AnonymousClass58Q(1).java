package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.58Q  reason: invalid class name */
public final class AnonymousClass58Q extends C62793ak implements C141898dQ {
    public static final C147138nS A01 = new C124067aS();
    public final Map A00 = C18220wO.A0y();

    public final void onCleared() {
        Map map = this.A00;
        Iterator A14 = C86104wH.A14(map);
        while (A14.hasNext()) {
            ((AnonymousClass06B) A14.next()).A00();
        }
        map.clear();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("NavControllerViewModel{");
        A0s.append(C86144wL.A0u(this));
        A0s.append("} ViewModelStores (");
        Iterator A0x = C18220wO.A0x(this.A00);
        while (A0x.hasNext()) {
            A0s.append(C18180wK.A0k(A0x));
            if (A0x.hasNext()) {
                C86144wL.A1T(A0s);
            }
        }
        String A0u = AnonymousClass0wJ.A0u(A0s);
        C04220Ms.A06(A0u);
        return A0u;
    }
}
