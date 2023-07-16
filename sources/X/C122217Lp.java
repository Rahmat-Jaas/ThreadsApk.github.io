package X;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;

/* renamed from: X.7Lp  reason: invalid class name and case insensitive filesystem */
public final class C122217Lp implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public boolean A00 = false;
    public final Callback A01;
    public final Callback A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.A00) {
            this.A01.invoke(C18210wN.A1X(i));
            this.A00 = true;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00) {
            this.A02.invoke(C86164wN.A1T());
            this.A00 = true;
        }
    }

    public C122217Lp(Callback callback, Callback callback2) {
        this.A01 = callback;
        this.A02 = callback2;
    }
}
