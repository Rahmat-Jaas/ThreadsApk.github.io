package X;

import android.content.Context;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Wz  reason: invalid class name and case insensitive filesystem */
public final class C05930Wz implements C04050Mb {
    public final Context A00;
    public final File A01;

    public final void CWp(C04170Mn r11, AnonymousClass0ND r12) {
        String str;
        File A002;
        Context context = this.A00;
        File file = new File(context.getApplicationInfo().dataDir, "core");
        if (file.exists() && file.length() != 0) {
            if (AnonymousClass0FX.A02()) {
                str = "/system/bin/app_process64";
            } else {
                str = "/system/bin/app_process32";
            }
            File file2 = new File(str);
            if (!file2.exists()) {
                file2 = new File("/system/bin/app_process");
            }
            if (file2.exists() && (A002 = AnonymousClass0O5.A00(context, this.A01.getName())) != null && Math.abs(file.lastModified() - A002.lastModified()) <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                File file3 = new File(context.getApplicationInfo().dataDir, "core_done");
                if (!file3.exists() || file3.lastModified() <= System.currentTimeMillis() - 86400000) {
                    r11.A04(AnonymousClass0MY.A07, r12, file);
                    r11.A04(AnonymousClass0MY.A03, r12, file2);
                    file3.delete();
                    try {
                        file3.createNewFile();
                        return;
                    } catch (IOException unused) {
                        C04790Pd.A00();
                        return;
                    }
                }
            }
        }
        File A003 = AnonymousClass0O5.A00(context, this.A01.getName());
        if (A003 != null) {
            File file4 = new File(A003.getParentFile(), AnonymousClass00U.A0V(A003.getName().split("_")[0], "_", "extra-maps.fatdmp"));
            if (file4.exists()) {
                r11.A04(AnonymousClass0MY.A08, r12, file4);
            }
        }
    }

    public C05930Wz(Context context, File file) {
        this.A00 = context;
        this.A01 = file;
    }

    public final Integer Awy() {
        return AnonymousClass006.A05;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
