package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.04b  reason: invalid class name and case insensitive filesystem */
public final class C009204b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ AnonymousClass099 A00;

    public C009204b(AnonymousClass099 r1) {
        this.A00 = r1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass099 r1 = this.A00;
        Dialog dialog = r1.A02;
        if (dialog != null) {
            r1.onCancel(dialog);
        }
    }
}
