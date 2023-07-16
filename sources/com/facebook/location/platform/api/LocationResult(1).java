package com.facebook.location.platform.api;

import X.AnonymousClass0wJ;
import X.C18190wL;
import X.C86144wL;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationResult extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0P(LocationResult.class);
    @SafeParcelable.Field(subClass = Location.class, value = 1)
    public List A00 = AnonymousClass0wJ.A0v();

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LocationResult{mLocations=");
        A0s.append(this.A00);
        A0s.append(", mExtras=");
        A0s.append((Object) null);
        return C18190wL.A0o(A0s);
    }
}
