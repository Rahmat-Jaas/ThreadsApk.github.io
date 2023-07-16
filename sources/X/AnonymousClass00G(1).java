package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.00G  reason: invalid class name */
public final class AnonymousClass00G extends C010204r {
    public final /* synthetic */ AnonymousClass099 A00;
    public final /* synthetic */ C010204r A01;

    public AnonymousClass00G(AnonymousClass099 r1, C010204r r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final View A00(int i) {
        C010204r r1 = this.A01;
        if (r1.A01()) {
            return r1.A00(i);
        }
        Dialog dialog = this.A00.A02;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean A01() {
        if (this.A01.A01() || this.A00.A07) {
            return true;
        }
        return false;
    }
}
