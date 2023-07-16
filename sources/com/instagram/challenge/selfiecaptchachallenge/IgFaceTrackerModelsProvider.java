package com.instagram.challenge.selfiecaptchachallenge;

import X.AnonymousClass0RA;
import X.C04220Ms;
import X.C10300i6;
import X.C12100lJ;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import java.util.Map;

public class IgFaceTrackerModelsProvider implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(17);
    public C10300i6 A00;

    public final Map AwI(Context context) {
        C04220Ms.A0B(context, 0);
        return C12100lJ.A00(context, this.A00);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }

    public IgFaceTrackerModelsProvider(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", readString);
            this.A00 = AnonymousClass0RA.A0C.A02(bundle);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public IgFaceTrackerModelsProvider(C10300i6 r1) {
        this.A00 = r1;
    }
}
