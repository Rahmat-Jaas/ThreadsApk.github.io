package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;

/* renamed from: X.0mC  reason: invalid class name and case insensitive filesystem */
public final class C12610mC {
    public static Integer A00(Intent intent, C12710mM r2, String str) {
        intent.setPackage(str);
        if (!((C12530m4) C17250ua.A00).A01(intent, r2).BZj()) {
            return AnonymousClass006.A15;
        }
        Context context = r2.A00;
        boolean z = false;
        try {
            context.sendBroadcast(intent);
            z = true;
        } catch (SecurityException e) {
            AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to sendBroadcast", e);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
        return z ? AnonymousClass006.A0Y : AnonymousClass006.A0j;
    }

    public static void A01(Intent intent, C12710mM r4) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            Context context = r4.A00;
            if (AnonymousClass0PS.A01(context, packageName)) {
                r4.A02(intent);
                try {
                    context.startService(intent);
                } catch (SecurityException e) {
                    AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to startService", e);
                } catch (IllegalStateException unused) {
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof DeadObjectException)) {
                        throw e2;
                    }
                }
            }
        }
    }
}
