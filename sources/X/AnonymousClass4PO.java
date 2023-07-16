package X;

import android.os.Bundle;

/* renamed from: X.4PO  reason: invalid class name */
public final class AnonymousClass4PO implements Runnable {
    public final /* synthetic */ C22841am A00;

    public AnonymousClass4PO(C22841am r1) {
        this.A00 = r1;
    }

    public final void run() {
        Integer num;
        C22841am r4 = this.A00;
        Bundle requireArguments = r4.requireArguments();
        if (r4.A03) {
            requireArguments.putBoolean(C63833iQ.A07(0, 33, 124), true);
        }
        C58803Hi A01 = C62653aT.A01();
        String str = r4.A02;
        if (str == null) {
            C04220Ms.A0E("currPhoneNumber");
            throw null;
        }
        if (r4.A04) {
            num = AnonymousClass006.A0C;
        } else {
            num = AnonymousClass006.A00;
        }
        AnonymousClass0wJ.A19(A01.A00(requireArguments, num, AnonymousClass006.A00, str, false), r4.requireActivity(), AnonymousClass0wJ.A0U(r4.A08));
    }
}
