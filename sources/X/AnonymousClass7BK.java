package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7BK  reason: invalid class name */
public final class AnonymousClass7BK {
    public static final void A00(int i, int i2, short s) {
        if (s == 3 || s == 2) {
            A01("display", (Map) null, i, i2, 8);
        }
        if (AnonymousClass7Kz.A06().A00.isMarkerOn(i, i2)) {
            AnonymousClass7Kz.A06().A00.markerEnd(i, i2, s);
        }
    }

    public static /* synthetic */ void A01(String str, Map map, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            map = AnonymousClass4WJ.A0A();
        }
        C04220Ms.A0B(map, 4);
        if (AnonymousClass7Kz.A06().A00.isMarkerOn(i, i2)) {
            AnonymousClass7Kz.A06().A00.markerPoint(i, i2, str);
            A02(map, i, i2);
        }
    }

    public static final void A02(Map map, int i, int i2) {
        if (AnonymousClass7Kz.A06().A00.isMarkerOn(i, i2)) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                AnonymousClass7Kz.A06().A00.markerAnnotate(i, i2, C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
        }
    }
}
