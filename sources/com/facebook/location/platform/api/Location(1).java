package com.facebook.location.platform.api;

import X.AnonymousClass0wJ;
import X.C18190wL;
import X.C28174Ezk;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.microg.safeparcel.AutoSafeParcelable;

public class Location extends AutoSafeParcelable {
    public static final Map A00;
    public static final Set A01 = C86114wI.A0t(new String[]{"UNDERLYING_PROVIDER", "EXTRA_SUBSCRIPTION_UUID", "LOCATION_UUID", "IS_CACHED"});
    public static final Parcelable.Creator CREATOR = C86144wL.A0P(Location.class);

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Location{mProvider=");
        A0s.append((String) null);
        A0s.append(C28174Ezk.A00(HttpStatus.SC_MOVED_PERMANENTLY));
        A0s.append((Object) null);
        A0s.append(", mElapsedRealtimeNanos=");
        A0s.append((Object) null);
        A0s.append(", mAccuracy=");
        A0s.append((Object) null);
        A0s.append("");
        A0s.append("");
        A0s.append("");
        A0s.append("");
        A0s.append(", mExtras=");
        A0s.append((Object) null);
        C86134wK.A1U(A0s, ", mIsMockLocation=");
        A0s.append(", underlyingProvider=");
        A0s.append((String) null);
        return C18190wL.A0o(A0s);
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A00 = A0y;
        A0y.put("stub", "network");
        A0y.put("wps", "network");
        A0y.put("wps_zero_power", "network");
    }
}
