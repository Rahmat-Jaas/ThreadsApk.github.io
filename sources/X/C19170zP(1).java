package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.0zP  reason: invalid class name and case insensitive filesystem */
public final class C19170zP extends AnonymousClass099 {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    public final Dialog A0C(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        this.A0A = false;
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            return dialog2;
        }
        Context context = getContext();
        C13320nQ.A01(context);
        AlertDialog create = new AlertDialog.Builder(context).create();
        this.A02 = create;
        return create;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
