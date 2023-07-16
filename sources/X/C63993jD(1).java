package X;

import android.content.DialogInterface;

/* renamed from: X.3jD  reason: invalid class name and case insensitive filesystem */
public final class C63993jD implements DialogInterface.OnClickListener {
    public final DialogInterface.OnClickListener A00;
    public final C07530bf A01;
    public final AnonymousClass269 A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass269 r0 = this.A02;
        C63313hF.A04(this.A01, (C313625r) null, AnonymousClass265.ACCESS_DIALOG, r0.A01);
        this.A00.onClick(dialogInterface, i);
    }

    public C63993jD(DialogInterface.OnClickListener onClickListener, C07530bf r2, AnonymousClass269 r3) {
        this.A01 = r2;
        this.A00 = onClickListener;
        this.A02 = r3;
    }
}
