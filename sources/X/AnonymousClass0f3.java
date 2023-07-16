package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.0f3  reason: invalid class name */
public final class AnonymousClass0f3 {
    public static AnonymousClass0f3 A01;
    public Vibrator A00;

    private void A00() {
        Vibrator vibrator;
        if (Build.VERSION.SDK_INT >= 29 && (vibrator = this.A00) != null) {
            try {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
            } catch (NullPointerException unused) {
            }
        }
    }

    private void A01() {
        Vibrator vibrator;
        if (Build.VERSION.SDK_INT >= 29 && (vibrator = this.A00) != null) {
            try {
                vibrator.vibrate(VibrationEffect.createPredefined(2));
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void A02() {
        A05(30);
    }

    public final void A03() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A00();
        }
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A01();
        }
    }

    public final void A05(long j) {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            try {
                vibrator.vibrate(j);
            } catch (NullPointerException unused) {
            }
        }
    }

    public AnonymousClass0f3(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
            this.A00 = (Vibrator) context.getSystemService("vibrator");
        }
    }
}
