package X;

import java.util.Map;

/* renamed from: X.0uK  reason: invalid class name and case insensitive filesystem */
public final class C17120uK implements AnonymousClass0M5 {
    public final void CYX(String str, C04560Oe r4) {
        C16740tf r1 = C016307t.A00;
        C16770ti r0 = new C16770ti(this, r4);
        Map map = r1.A03;
        synchronized (map) {
            map.put(str, r0);
        }
    }

    public final void Cbc(String str) {
        AnonymousClass091.A00.Cbc(str);
    }

    public final void CYW(String str, String str2) {
        C16740tf.A00(str, str2);
    }
}
