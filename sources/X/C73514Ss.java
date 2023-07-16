package X;

import android.view.View;

/* renamed from: X.4Ss  reason: invalid class name and case insensitive filesystem */
public final class C73514Ss implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C57943Dd A02;
    public final /* synthetic */ C23041bp A03;

    public C73514Ss(View view, C57943Dd r2, C23041bp r3, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = view;
    }

    public final void run() {
        C23041bp r2 = this.A03;
        if (r2.getActivity() != null) {
            C25553Dnn A012 = AnonymousClass4DS.A01(r2.requireActivity(), C59523Ld.A01(r2, this.A02));
            A012.A02(this.A01, 0, this.A00, true);
            A012.A03(D0f.BELOW_ANCHOR);
            C18200wM.A1Q(A012);
        }
    }
}
