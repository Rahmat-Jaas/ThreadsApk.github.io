package X;

import java.util.Map;

/* renamed from: X.4EE  reason: invalid class name */
public final class AnonymousClass4EE implements C84184sh, AnonymousClass0i4 {
    public final Map A00 = C18220wO.A0y();

    public final boolean CsW(AnonymousClass25P r8, AnonymousClass25R r9, AnonymousClass17J r10, Integer num) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        C04220Ms.A0B(r8, 2);
        if (r10.A01 + r10.A00 != 0) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(r10.A03);
            A0r.append('|');
            A0r.append(r9);
            A0r.append('|');
            A0r.append(r8);
            A0r.append('|');
            String A0i = C18180wK.A0i(C36392Rd.A00(num), A0r);
            Map map = this.A00;
            Object obj = map.get(A0i);
            C04530Oa r1 = r10.A05;
            if (!C04220Ms.A0I(obj, r1.getValue())) {
                map.put(A0i, r1.getValue());
                return A1Z;
            }
        }
        return false;
    }

    public final boolean CsX(AnonymousClass25P r8, AnonymousClass25R r9, AnonymousClass17J r10) {
        boolean A1Z = C18200wM.A1Z(r8);
        if (r10.A01 + r10.A00 != 0) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(r10.A03);
            A0r.append('|');
            A0r.append(r9);
            A0r.append('|');
            String A0m = C18200wM.A0m(r8, A0r);
            Map map = this.A00;
            Object obj = map.get(A0m);
            C04530Oa r1 = r10.A05;
            if (!C04220Ms.A0I(obj, r1.getValue())) {
                map.put(A0m, r1.getValue());
                return A1Z;
            }
        }
        return false;
    }

    public final void AD8() {
        this.A00.clear();
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
