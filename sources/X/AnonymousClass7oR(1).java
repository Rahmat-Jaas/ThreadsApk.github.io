package X;

import android.content.Context;

/* renamed from: X.7oR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oR implements C144008hg {
    public static final AnonymousClass7oR A00 = new AnonymousClass7oR();

    public final String ALB(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return installerPackageName.replace(' ', '_').replace('/', '_');
        }
        return "";
    }
}
