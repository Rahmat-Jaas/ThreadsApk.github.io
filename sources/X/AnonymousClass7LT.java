package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: X.7LT  reason: invalid class name */
public final class AnonymousClass7LT implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass586) weakReference.get()).A04(true);
        }
    }

    public AnonymousClass7LT(AnonymousClass586 r2) {
        this.A00 = C86144wL.A0w(r2);
    }
}
