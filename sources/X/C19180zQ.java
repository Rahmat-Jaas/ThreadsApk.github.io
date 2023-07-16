package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0zQ  reason: invalid class name and case insensitive filesystem */
public final class C19180zQ extends AnonymousClass099 implements DialogInterface.OnClickListener {
    public final C37456Jsy A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C37456Jsy jsy = this.A00;
        if (jsy != null) {
            jsy.onClick(dialogInterface, i);
        }
    }

    public C19180zQ(Bundle bundle, C37456Jsy jsy) {
        this.A00 = jsy;
        setArguments(bundle);
    }

    public final Dialog A0C(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Bundle bundle2 = this.mArguments;
        AlertDialog.Builder title = new AlertDialog.Builder(activity).setTitle(bundle2.getString(DialogModule.KEY_TITLE));
        if (bundle2.containsKey("button_positive")) {
            title.setPositiveButton(bundle2.getString("button_positive"), this);
        }
        if (bundle2.containsKey("button_negative")) {
            title.setNegativeButton(bundle2.getString("button_negative"), this);
        }
        if (bundle2.containsKey("button_neutral")) {
            title.setNeutralButton(bundle2.getString("button_neutral"), this);
        }
        if (bundle2.containsKey(DialogModule.KEY_MESSAGE)) {
            title.setMessage(bundle2.getString(DialogModule.KEY_MESSAGE));
        }
        if (bundle2.containsKey(DialogModule.KEY_ITEMS)) {
            title.setItems(bundle2.getCharSequenceArray(DialogModule.KEY_ITEMS), this);
        }
        return title.create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C37456Jsy jsy = this.A00;
        if (jsy != null) {
            jsy.onDismiss(dialogInterface);
        }
    }

    public C19180zQ() {
        this.A00 = null;
    }
}
