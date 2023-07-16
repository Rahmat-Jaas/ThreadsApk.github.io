package X;

import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.io.File;

/* renamed from: X.3zs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67633zs implements MobileConfigUpdateOverridesTableCallback {
    public final /* synthetic */ C67603zp A00;

    public /* synthetic */ C67633zs(C67603zp r1) {
        this.A00 = r1;
    }

    public final void onOverridesFileUpdated() {
        C67603zp r2 = this.A00;
        C67653zu r3 = C67653zu.A09;
        String dataDirPath = r2.A05.getDataDirPath();
        if (dataDirPath == null || dataDirPath.isEmpty()) {
            dataDirPath = r2.A07.getPath();
        }
        r3.A02(new File(new File(dataDirPath, MobileConfigBisection.BISECT_DIR), "mc_overrides.json"));
    }
}
