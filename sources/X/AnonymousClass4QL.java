package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.4QL  reason: invalid class name */
public final class AnonymousClass4QL implements Runnable {
    public final /* synthetic */ AnonymousClass1i5 A00;

    public AnonymousClass4QL(AnonymousClass1i5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C156909Pv r3 = this.A00.A00;
        Fragment A0O = C18250wR.A0B(r3).A0O(C156909Pv.class.getCanonicalName());
        C25786Drz A0Q = C18180wK.A0Q(r3.requireActivity(), r3.A02);
        if (A0O != null) {
            A0Q.A0B(A0O);
        }
        C60113Ns.A00();
        throw null;
    }
}
