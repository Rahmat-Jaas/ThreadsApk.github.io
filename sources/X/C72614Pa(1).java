package X;

import android.os.Bundle;

/* renamed from: X.4Pa  reason: invalid class name and case insensitive filesystem */
public final class C72614Pa implements Runnable {
    public final /* synthetic */ C24751jz A00;

    public C72614Pa(C24751jz r1) {
        this.A00 = r1;
    }

    public final void run() {
        C24751jz r2 = this.A00;
        C25786Drz A0Q = C18180wK.A0Q(r2.A06.getActivity(), r2.A08);
        C63463hW.A01();
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, "IgSessionManager.LOGGED_OUT_TOKEN");
        AnonymousClass1cj r0 = new AnonymousClass1cj();
        r0.setArguments(A06);
        A0Q.A03 = r0;
        A0Q.A05();
    }
}
