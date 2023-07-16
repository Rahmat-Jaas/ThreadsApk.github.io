package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7i4  reason: invalid class name */
public final class AnonymousClass7i4 implements C145298kG {
    public final Context A00;

    public AnonymousClass7i4(Context context) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
    }

    public final String BaB() {
        return "fs";
    }

    public final Map CXv() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C98976Hq.A00(Environment.getDataDirectory(), "device", A0y);
        try {
            synchronized (C14620pq.class) {
            }
            Environment.getExternalStorageDirectory();
            String externalStorageState = Environment.getExternalStorageState();
            if (!"mounted".equals(externalStorageState)) {
                "mounted_ro".equals(externalStorageState);
            }
            File[] externalFilesDirs = this.A00.getExternalFilesDirs((String) null);
            C04220Ms.A06(externalFilesDirs);
            for (File file : externalFilesDirs) {
                if (file != null) {
                    String externalStorageState2 = Environment.getExternalStorageState(file);
                    if ("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) {
                        String str = "external";
                        if (Environment.isExternalStorageRemovable()) {
                            str = "sd";
                        }
                        C98976Hq.A00(file, str, A0y);
                    }
                }
            }
        } catch (Exception e) {
            AnonymousClass0JV.A05("FsInfoDataProvider", "Failed to measure external fs information", e);
        }
        return A0y;
    }
}
