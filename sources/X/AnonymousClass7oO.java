package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.7oO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oO implements C144008hg {
    public static final AnonymousClass7oO A00 = new AnonymousClass7oO();

    public final String ALB(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}
