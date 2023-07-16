package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: X.76W  reason: invalid class name */
public final class AnonymousClass76W {
    public static final Pattern A04 = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    public static final String[] A05 = {"-journal", "-journal", "-uid", "-wal", "-shm", "-selfcheck", ".dat", ".back", ".corrupt"};
    public String A00;
    public String A01;
    public final Context A02;
    public final C104786cN A03;

    public AnonymousClass76W(Context context) {
        C104786cN r0;
        File parentFile;
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        if (applicationInfo == null || TextUtils.isEmpty(applicationInfo.dataDir)) {
            File cacheDir = applicationContext.getCacheDir();
            if (cacheDir == null || (parentFile = cacheDir.getParentFile()) == null) {
                r0 = null;
                this.A03 = r0;
            }
        } else {
            parentFile = C86144wL.A0Z(applicationInfo.dataDir);
        }
        r0 = new C104786cN(parentFile);
        this.A03 = r0;
    }
}
