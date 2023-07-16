package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.2Fz  reason: invalid class name and case insensitive filesystem */
public final class C33512Fz {
    public static void A00(View view, AnonymousClass3HX r7, C127397h3 r8) {
        AnonymousClass47I r5 = (AnonymousClass47I) AnonymousClass7K7.A04(r7, r8);
        if (r5 == null) {
            C30967GcS.A02("IGShoppingNavBarExtensionBinderUtils", "Got null NavbarExtensionController on binding.");
            return;
        }
        C04220Ms.A0B(view, 0);
        AnonymousClass3HX r4 = r5.A07;
        E2V A00 = C33502Fy.A00(C63913ic.A04(r4), r4);
        if (A00 != null) {
            r5.A00 = A00;
        }
        Fragment A002 = C63913ic.A00(r4);
        if (A002 instanceof AnonymousClass1c8) {
            AnonymousClass1c8 r2 = (AnonymousClass1c8) A002;
            r2.A0A.A0X = true;
            E2V.A03(r2.A03).A08.remove(r2);
        }
        C63913ic.A0O(r4, r5);
        view.post(new C72934Qh(A002, r5));
    }
}
