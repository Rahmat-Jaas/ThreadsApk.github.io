package X;

import android.view.View;

/* renamed from: X.04d  reason: invalid class name */
public final class AnonymousClass04d implements C143158gC {
    public final /* synthetic */ AnonymousClass099 A00;

    public AnonymousClass04d(AnonymousClass099 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        if (obj != null) {
            AnonymousClass099 r2 = this.A00;
            if (r2.A0A) {
                View requireView = r2.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (r2.A02 != null) {
                    C12560m7.A0E(3);
                    r2.A02.setContentView(requireView);
                }
            }
        }
    }
}
