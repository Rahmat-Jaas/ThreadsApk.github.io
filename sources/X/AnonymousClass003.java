package X;

import android.text.TextUtils;
import androidx.activity.ComponentActivity;

/* renamed from: X.003  reason: invalid class name */
public final class AnonymousClass003 implements Runnable {
    public final /* synthetic */ ComponentActivity A00;

    public AnonymousClass003(ComponentActivity componentActivity) {
        this.A00 = componentActivity;
    }

    public final void run() {
        try {
            AnonymousClass003.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
