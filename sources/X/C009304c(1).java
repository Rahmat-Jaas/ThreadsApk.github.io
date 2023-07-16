package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.04c  reason: invalid class name and case insensitive filesystem */
public final class C009304c implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass099 A00;

    public C009304c(AnonymousClass099 r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass099 r1 = this.A00;
        Dialog dialog = r1.A02;
        if (dialog != null) {
            r1.onDismiss(dialog);
        }
    }
}
