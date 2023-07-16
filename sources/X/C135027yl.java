package X;

import android.content.Context;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;

/* renamed from: X.7yl  reason: invalid class name and case insensitive filesystem */
public final class C135027yl implements Runnable {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public C135027yl(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public final void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context context = fingerprintDialogFragment.getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        fingerprintDialogFragment.A04.A02(1);
        fingerprintDialogFragment.A04.A03(context.getString(2131827508));
    }
}
