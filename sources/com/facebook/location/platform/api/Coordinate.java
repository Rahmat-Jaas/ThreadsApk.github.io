package com.facebook.location.platform.api;

import X.C18190wL;
import X.C86144wL;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import org.microg.safeparcel.AutoSafeParcelable;

public class Coordinate extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0P(Coordinate.class);

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Coordinate{timeStamp=");
        A0s.append(0);
        A0s.append(", utcTimeStamp=");
        A0s.append(0);
        A0s.append(", x=");
        A0s.append(0.0d);
        A0s.append(", y=");
        A0s.append(0.0d);
        A0s.append(", confidence=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        return C18190wL.A0o(A0s);
    }
}
