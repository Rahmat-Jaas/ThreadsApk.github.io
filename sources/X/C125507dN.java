package X;

import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.7dN  reason: invalid class name and case insensitive filesystem */
public final class C125507dN implements C143258gN {
    public final SharedPreferences A00 = C08340dC.A01("ig_ard_versioned_capability_experiment");

    public final boolean ACg(VersionedCapability versionedCapability, String str) {
        SharedPreferences sharedPreferences = this.A00;
        String name = versionedCapability.name();
        String A0h = C18200wM.A0h(sharedPreferences, name);
        boolean z = false;
        if (!C98336Fc.A00(str, A0h)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (A0h == null || str != null) {
                edit.putString(name, str);
                z = true;
            } else {
                edit.remove(name);
            }
            edit.apply();
        }
        return z;
    }
}
