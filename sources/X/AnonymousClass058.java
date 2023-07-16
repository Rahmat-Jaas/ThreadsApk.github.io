package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;

/* renamed from: X.058  reason: invalid class name */
public final class AnonymousClass058 extends AnonymousClass0EL {
    public AnonymousClass058(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    public final Integer A0B() {
        return AnonymousClass006.A0j;
    }

    public final boolean A0H(Context context, ComponentInfo componentInfo) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
        if (applicationInfo == null || applicationInfo2 == null) {
            C16240si r2 = this.A02;
            StringBuilder sb = new StringBuilder("Null app info, current app: ");
            sb.append(applicationInfo);
            sb.append(", target app: ");
            sb.append(applicationInfo2);
            r2.Ccw("ExternalIntentScope", sb.toString(), (Throwable) null);
            return false;
        }
        try {
            return !C15980sH.A05(context, applicationInfo.uid, applicationInfo2.uid);
        } catch (SecurityException e) {
            this.A02.Ccw("ExternalIntentScope", AnonymousClass00U.A0L("Unexpected exception in verifying signature for: ", componentInfo.packageName), e);
            return !A0E();
        }
    }
}
