package X;

import java.util.List;

/* renamed from: X.3Gy  reason: invalid class name */
public final class AnonymousClass3Gy {
    public String A00;
    public List A01;

    public final C58473Fu A00(String str) {
        List<C58473Fu> list = this.A01;
        if (list == null || str == null) {
            return null;
        }
        for (C58473Fu r1 : list) {
            if (str.equals(r1.A02)) {
                return r1;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("{ QpToolTipTemplate name: ");
        A0s.append(this.A00);
        A0s.append(",parameters: ");
        A0s.append(this.A01);
        return C18180wK.A0i(" }", A0s);
    }
}
