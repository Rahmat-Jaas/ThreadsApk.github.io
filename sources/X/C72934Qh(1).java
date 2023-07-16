package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.4Qh  reason: invalid class name and case insensitive filesystem */
public final class C72934Qh implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass47I A01;

    public C72934Qh(Fragment fragment, AnonymousClass47I r2) {
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A00.isResumed()) {
            AnonymousClass47I r1 = this.A01;
            E2V.A0G(r1.A01());
            AnonymousClass47I.A00(r1);
            AnonymousClass7JU.A00(r1.A01().A0P);
        }
    }
}
