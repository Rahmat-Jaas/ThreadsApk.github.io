package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.3yZ  reason: invalid class name and case insensitive filesystem */
public final class C66913yZ implements C39804L0x {
    public final AlertDialog.Builder A00;
    public final /* synthetic */ Context A01;

    public final C39804L0x CnL(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setNegativeButton(charSequence, (DialogInterface.OnClickListener) null);
        return this;
    }

    public C66913yZ(Context context) {
        this.A01 = context;
        this.A00 = new AlertDialog.Builder(context);
    }

    public final Dialog AEr() {
        return this.A00.create();
    }

    public final C39804L0x Cn2(CharSequence charSequence) {
        this.A00.setMessage(charSequence);
        return this;
    }

    public final C39804L0x Co8(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    public final C39804L0x Cqa(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
        return this;
    }
}
