package com.facebook.location.platform.api;

import X.AnonymousClass0wJ;
import X.C86144wL;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

public class LocationSettingsRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0P(LocationSettingsRequest.class);
    @SafeParcelable.Field(subClass = LocationRequest.class, value = 1)
    public List A00 = AnonymousClass0wJ.A0v();
}
