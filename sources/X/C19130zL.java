package X;

import android.os.Bundle;

/* renamed from: X.0zL  reason: invalid class name and case insensitive filesystem */
public abstract class C19130zL extends I60 {
    public final int A0D(AnonymousClass05O r5, String str, boolean z) {
        C04220Ms.A0B(str, 1);
        AnonymousClass0LU.A0G("IgDialogFragment", "Showing Dialog", new Throwable());
        return super.A0D(r5, str, true);
    }

    public final void A0N(C12560m7 r3, String str) {
        C04220Ms.A0B(r3, 0);
        if (!r3.A0F) {
            A0D(new AnonymousClass01J(r3), str, true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
    }
}
