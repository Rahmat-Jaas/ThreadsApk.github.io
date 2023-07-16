package X;

import android.content.DialogInterface;

/* renamed from: X.3kK  reason: invalid class name and case insensitive filesystem */
public final class C64363kK implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ boolean[] A00;

    public C64363kK(boolean[] zArr) {
        this.A00 = zArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00[i] = true;
    }
}
