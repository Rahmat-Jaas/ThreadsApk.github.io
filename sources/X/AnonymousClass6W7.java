package X;

import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.6W7  reason: invalid class name */
public final class AnonymousClass6W7 {
    public static final C145658kr A00(Object obj, Encoder encoder, C1372787c r3) {
        AnonymousClass0W7 r1;
        C04220Ms.A0B(r3, 0);
        C145658kr A01 = r3.A01(obj, encoder);
        if (A01 != null) {
            return A01;
        }
        C02230Ai A16 = C86124wJ.A16(obj);
        if (r3 instanceof C141548bo) {
            r1 = ((C141548bo) r3).A04;
        } else {
            r1 = ((PolymorphicSerializer) r3).A01;
        }
        String A00 = AnonymousClass0N8.A00(A16.A00);
        if (A00 == null) {
            A00 = String.valueOf(A16);
        }
        AnonymousClass6W8.A00(A00, r1);
        throw null;
    }
}
