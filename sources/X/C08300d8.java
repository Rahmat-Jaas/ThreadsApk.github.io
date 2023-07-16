package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0d8  reason: invalid class name and case insensitive filesystem */
public final class C08300d8 {
    public static final long A02 = TimeUnit.HOURS.toMillis(2);
    public final Context A00;
    public final File A01;

    public C08300d8(Context context) {
        this.A01 = new File(context.getFilesDir(), "profilo_config_temp");
        this.A00 = context.getApplicationContext();
    }

    public static File A00() {
        return new File(ITF.A00().A01(), "profilo_config.json");
    }

    private boolean A01(boolean z) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - C08360dF.A00().A00.getLong("loom_config_last_sync_timestamp", 0);
        boolean z2 = false;
        if (currentTimeMillis > A02) {
            z2 = true;
        }
        AnonymousClass0Vt.A00().A02(Boolean.valueOf(z2), Long.valueOf(currentTimeMillis), "IgProfiloConfigStore", "isConfigStale: %b (time since last sync = %d ms)");
        if (!z2) {
            Context context = this.A00;
            File file = new File(context.getFilesDir(), "profilo");
            File file2 = new File(file, "ProfiloInitFileConfig.json.bak");
            if (file2.exists() && file2.renameTo(new File(file, "ProfiloInitFileConfig.json"))) {
                return false;
            }
            AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "No backup config file on disk");
            if (z) {
                if (!A00().exists()) {
                    AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "No config in Cask cache");
                } else if (new File(new File(context.getFilesDir(), "profilo"), "ProfiloInitFileConfig.json").exists()) {
                    return false;
                } else {
                    try {
                        AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "Restoring the config from Cask cache");
                        File A002 = A00();
                        File file3 = this.A01;
                        GY3.A01(A002, file3);
                        C07880cL r1 = new C07880cL(context);
                        r1.A00 = file3;
                        r1.A02 = AnonymousClass006.A01;
                        C08000cZ.A00().A06(r1);
                        return false;
                    } catch (IOException e) {
                        C08600dr A003 = AnonymousClass0Vt.A00();
                        if (e.getMessage() != null) {
                            str = e.getMessage();
                        } else {
                            str = "n/a";
                        }
                        A003.A03(str, "IgProfiloConfigStore", "Failed to restore config from Cask cache. Exception: %s");
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public final void A02(UserSession userSession, boolean z) {
        boolean booleanValue = AnonymousClass2SW.A00().booleanValue();
        Context context = this.A00;
        if (!TextUtils.isEmpty("com.facebook.loom.config.file")) {
            String A012 = C02640Cf.A01("com.facebook.loom.config.file");
            if (!TextUtils.isEmpty(A012)) {
                try {
                    File cacheDir = context.getCacheDir();
                    File file = new File(cacheDir, A012);
                    if (file.exists() && file.getParentFile().getCanonicalPath().equals(cacheDir.getCanonicalPath())) {
                        C07880cL r1 = new C07880cL(context);
                        r1.A00 = file;
                        r1.A02 = AnonymousClass006.A01;
                        C08000cZ.A00().A06(r1);
                        return;
                    }
                } catch (IOException unused) {
                }
            }
        }
        if (z || A01(booleanValue)) {
            AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "syncConfig: start");
            C32165H8c A002 = C08320dA.A00(userSession, this.A01);
            A002.A01(new C08310d9(this, booleanValue));
            C31155GhB.A03(A002);
            return;
        }
        AnonymousClass0Vt.A00().A04("IgProfiloConfigStore", "syncConfig: skipped");
    }
}
