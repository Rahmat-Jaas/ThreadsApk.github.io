package X;

import java.util.List;

/* renamed from: X.2J4  reason: invalid class name */
public final class AnonymousClass2J4 {
    public static final Object A00(C63893iY r3) {
        AnonymousClass099 r0;
        C04220Ms.A0B(r3, 0);
        String A0D = C63893iY.A0D(r3, 0);
        List A03 = AnonymousClass3ZR.A03(AnonymousClass3ZR.A00(C63913ic.A04(C63893iY.A01(r3, 2))));
        if (A03 == null || A03.isEmpty()) {
            r0 = null;
        } else {
            r0 = C63123bZ.A00(A0D, A03);
        }
        AnonymousClass1Xb r02 = (AnonymousClass1Xb) r0;
        if (r02 == null) {
            C30967GcS.A02("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
            return null;
        }
        AnonymousClass1Xb.A00(r02).A08(A0D);
        return null;
    }
}
