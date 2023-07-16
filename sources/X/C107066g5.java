package X;

import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6g5  reason: invalid class name and case insensitive filesystem */
public final class C107066g5 {
    public final SharedPreferences A00 = C08340dC.A01("ig_ard_nmlml_migration_capability_version_schema");
    public final Map A01 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());

    public C107066g5() {
        for (C107056g4 r0 : C29143Fil.A00()) {
            SharedPreferences sharedPreferences = this.A00;
            VersionedCapability versionedCapability = r0.A01;
            String serverValue = versionedCapability.toServerValue();
            AnonymousClass68Y r4 = AnonymousClass68Y.ARD;
            String string = sharedPreferences.getString(serverValue, r4.toString());
            Map map = this.A01;
            if (string != null) {
                AnonymousClass68Y r1 = AnonymousClass68Y.NMLML;
                if (!r1.A00.equals(string)) {
                    r1 = r4;
                    if (!r4.A00.equals(string)) {
                        r1 = AnonymousClass68Y.INVALID;
                    }
                }
                r4 = r1;
            }
            map.put(versionedCapability, r4);
        }
    }
}
