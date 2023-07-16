package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;

/* renamed from: X.3Tq  reason: invalid class name and case insensitive filesystem */
public final class C61493Tq {
    public static final C61493Tq A00 = new C61493Tq();

    public final boolean A00(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("_ci_", PendingIntent.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("_ci_");
        }
        PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
        if (pendingIntent == null) {
            return false;
        }
        String creatorPackage = pendingIntent.getCreatorPackage();
        return C04220Ms.A0I(creatorPackage, "com.whatsapp") || C04220Ms.A0I(creatorPackage, AnonymousClass000.A00(147));
    }
}
