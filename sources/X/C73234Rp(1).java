package X;

import android.content.pm.PackageManager;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.ondevicetech.graphql.AndroidAppHistoryPlistQueryResponseImpl;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4Rp  reason: invalid class name and case insensitive filesystem */
public final class C73234Rp implements Runnable {
    public final /* synthetic */ AnonymousClass5z0 A00;
    public final /* synthetic */ C692247j A01;

    public C73234Rp(AnonymousClass5z0 r1, C692247j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        String str;
        TreeJNI treeJNI = (TreeJNI) this.A00.A01;
        if (treeJNI != null) {
            ImmutableList A0P = C18230wP.A0P(treeJNI, AndroidAppHistoryPlistQueryResponseImpl.IgAndroidAppHistoryPlistQuery.class, "ig_android_app_history_plist_query");
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C1366783w it = A0P.iterator();
            while (it.hasNext()) {
                TreeJNI treeJNI2 = (TreeJNI) it.next();
                String stringValue = treeJNI2.getStringValue("package_name");
                if (stringValue != null) {
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    A0y.put("app_id", AnonymousClass00U.A0L("fb", treeJNI2.getStringValue("app_id")));
                    boolean z = false;
                    try {
                        this.A01.A01.getPackageManager().getPackageInfo(stringValue, 128);
                        z = true;
                    } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                    }
                    A0y.put("install_status", Boolean.valueOf(z));
                    A0v.add(A0y);
                }
            }
            try {
                str = C40118LOg.A00().A06(A0v);
                C04220Ms.A06(str);
            } catch (C35276Irf e) {
                AnonymousClass0LU.A0F("OnDeviceAppHistoryManager", "Fail to parse install states map.", e);
                str = "";
            }
            if (str.length() > 0) {
                C692247j r2 = this.A01;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A03, "on_device_app_history_exclusion_targeting"), 2454);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0T("apps_data", str);
                    A0I.Bb4();
                    AnonymousClass0wJ.A12(r2.A02.edit(), "last_upload_time_in_sec", C18200wM.A0A());
                }
            }
        }
    }
}
