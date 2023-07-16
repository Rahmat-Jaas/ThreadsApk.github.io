package X;

import android.app.Application;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.File;

/* renamed from: X.0LZ  reason: invalid class name */
public final class AnonymousClass0LZ extends C07410bT {
    public final C04170Mn A00(AnonymousClass0ND r6) {
        C04170Mn r4 = new C04170Mn((Throwable) null);
        r4.A03(AnonymousClass0MU.A4b, "anr");
        r4.A03(AnonymousClass0MU.A6J, AnonymousClass00U.A0V("android_", r6.A00, "anr"));
        return r4;
    }

    public final void A03(AnonymousClass0ND r10, File file, File file2) {
        if (file2 != null) {
            File file3 = new File(file2, "critical_anr_prop.txt");
            if (file3.exists()) {
                file3.renameTo(new File(file3.getParentFile(), "critical_suppl_anr_extra_prop.txt"));
            }
            File[] listFiles = file2.listFiles(new IDxFFilterShape519S0100000_I2(this, 5));
            File file4 = null;
            if (listFiles != null) {
                int i = -1;
                for (File file5 : listFiles) {
                    try {
                        int parseInt = Integer.parseInt(file5.getName().replace("large_", "").replace("_anr_prop.txt", ""));
                        if (parseInt > i) {
                            file4 = file5;
                            i = parseInt;
                        }
                    } catch (NumberFormatException e) {
                        AnonymousClass0LU.A0O("lacrima", "Invalid anr report name %s", file5.getName(), e);
                        C04790Pd.A00();
                    }
                }
                if (file4 != null && file4.exists()) {
                    file4.renameTo(new File(file4.getParentFile(), "large_suppl_anr_extra_prop.txt"));
                }
            }
        }
        super.A03(r10, file, file2);
    }

    public AnonymousClass0LZ(Application application, C07390bR r2, C04840Pi r3) {
        super(application, r2, r3);
    }

    public final AnonymousClass0PD A01() {
        return AnonymousClass0PD.ANR_APP_DEATH;
    }

    public final Integer A02() {
        return AnonymousClass006.A00;
    }
}
