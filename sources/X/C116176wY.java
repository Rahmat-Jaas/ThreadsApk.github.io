package X;

import android.content.Context;

/* renamed from: X.6wY  reason: invalid class name and case insensitive filesystem */
public final class C116176wY {
    public static synchronized H8F A00(Context context, C33874HwA hwA, C10300i6 r22) {
        AnonymousClass0gV r8;
        AnonymousClass0gV r9;
        AnonymousClass0gV r10;
        H8F h8f;
        synchronized (C116176wY.class) {
            C10300i6 r7 = r22;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, r7, 36323109652930197L)) {
                r8 = new AnonymousClass0gV(AnonymousClass0gN.A00(), 575, 2, false, false);
                r9 = new AnonymousClass0gV(AnonymousClass0gN.A00(), 575, 3, false, false);
                r10 = new AnonymousClass0gV(AnonymousClass0gN.A00(), 575, 4, false, false);
            } else {
                r8 = new AnonymousClass0gV(AnonymousClass0gN.A00(), 575, 3, false, false);
                r9 = r8;
                r10 = r8;
            }
            h8f = (H8F) r7.A01(H8F.class, new AnonymousClass86C(context, hwA, r7, r8, r9, r10));
        }
        return h8f;
    }
}
