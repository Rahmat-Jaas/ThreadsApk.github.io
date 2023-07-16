package X;

import android.content.Context;
import android.os.HandlerThread;
import java.io.File;

/* renamed from: X.0Cm  reason: invalid class name and case insensitive filesystem */
public final class C02700Cm implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ HandlerThread A01;

    public C02700Cm(Context context, HandlerThread handlerThread) {
        this.A00 = context;
        this.A01 = handlerThread;
    }

    public final void run() {
        Context context = this.A00;
        C02710Cn.A00(context, "anr_timeout_setting", true);
        C02710Cn.A00(context, "lmk_minfree_setting", true);
        File file = new File(context.getCacheDir(), "temp_service_jar_dex");
        if (!file.exists()) {
            file.mkdir();
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File deleteOnExit : listFiles) {
                    deleteOnExit.deleteOnExit();
                }
            }
            file.deleteOnExit();
        }
        this.A01.quitSafely();
    }
}
