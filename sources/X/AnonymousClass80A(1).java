package X;

import android.view.View;

/* renamed from: X.80A  reason: invalid class name */
public final class AnonymousClass80A implements Runnable {
    public final /* synthetic */ AnonymousClass5x9 A00;

    public AnonymousClass80A(AnonymousClass5x9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        AnonymousClass5x9 r3 = this.A00;
        View view = r3.A03;
        if (view == null) {
            str = "updateInfoToastView";
        } else {
            view.setVisibility(8);
            I6I i6i = r3.A04;
            if (i6i == null) {
                str = "viewModel";
            } else {
                i6i.A0D((String) null);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
