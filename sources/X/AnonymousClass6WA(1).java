package X;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.6WA  reason: invalid class name */
public final class AnonymousClass6WA {
    public static final void A00(SerialDescriptor serialDescriptor, int i, int i2) {
        C04220Ms.A0B(serialDescriptor, 2);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i3 = (i ^ -1) & i2;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if ((i3 & 1) != 0) {
                A0v.add(serialDescriptor.AfB(i4));
            }
            i3 >>>= 1;
            if (i5 < 32) {
                i4 = i5;
            } else {
                throw new C141518bk(A0v, serialDescriptor.BAP());
            }
        }
    }
}
