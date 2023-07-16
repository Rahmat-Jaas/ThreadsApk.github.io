package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import com.instagram.service.session.UserSession;
import kotlin.Pair;

/* renamed from: X.77K  reason: invalid class name */
public final class AnonymousClass77K {
    public static final AnonymousClass77K A00 = new AnonymousClass77K();

    public final Pair A00(Context context, UserSession userSession, boolean z) {
        AnonymousClass229 r0;
        AnonymousClass0TJ r2;
        boolean z2 = false;
        if (!context.getPackageManager().hasSystemFeature(AnonymousClass000.A00(294))) {
            r0 = AnonymousClass229.SYSTEM_FEATURE_NOT_PRESENT;
        } else {
            Object systemService = context.getSystemService("appops");
            C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) {
                if (z) {
                    r2 = AnonymousClass0TJ.A06;
                } else {
                    r2 = AnonymousClass0TJ.A05;
                }
                if (C63803iN.A0E(r2, userSession, 36311697924948663L)) {
                    z2 = true;
                    r0 = null;
                } else {
                    r0 = AnonymousClass229.IG_FEATURE_NOT_ENABLED;
                }
            } else {
                r0 = AnonymousClass229.SYSTEM_PERMISSION_DENIED;
            }
        }
        return C18180wK.A0p(z2, r0);
    }
}
