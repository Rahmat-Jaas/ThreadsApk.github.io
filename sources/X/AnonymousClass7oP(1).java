package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.7oP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oP implements C144008hg {
    public static final AnonymousClass7oP A00 = new AnonymousClass7oP();

    public final String ALB(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }
}
