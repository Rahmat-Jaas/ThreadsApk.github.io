package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.7RD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7RD implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ C25828Dsm A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass7RD(DialogInterface.OnClickListener onClickListener, C25828Dsm dsm, int i, boolean z) {
        this.A02 = dsm;
        this.A01 = onClickListener;
        this.A00 = i;
        this.A03 = z;
    }

    public final void onClick(View view) {
        C25828Dsm dsm = this.A02;
        DialogInterface.OnClickListener onClickListener = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        if (onClickListener != null) {
            onClickListener.onClick(dsm.A05, i);
        }
        if (z) {
            dsm.A05.dismiss();
        }
    }
}
