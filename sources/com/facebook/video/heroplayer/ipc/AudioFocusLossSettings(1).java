package com.facebook.video.heroplayer.ipc;

import X.C18190wL;
import X.C86104wH;
import X.C86124wJ;
import X.C86144wL;
import X.C967566o;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;

public class AudioFocusLossSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(23);
    public final float A00;
    public final C967566o A01;
    public final C967566o A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusLossSettings)) {
            return false;
        }
        AudioFocusLossSettings audioFocusLossSettings = (AudioFocusLossSettings) obj;
        return Float.compare(audioFocusLossSettings.A00, this.A00) == 0 && this.A01 == audioFocusLossSettings.A01 && this.A02 == audioFocusLossSettings.A02;
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A01, this.A02, Float.valueOf(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        A0s.append(this.A01);
        A0s.append(", mAudioFocusTransientLossBehavior=");
        A0s.append(this.A02);
        A0s.append(", mAudioFocusTransientLossDuckVolume=");
        A0s.append(this.A00);
        return C18190wL.A0o(A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C86104wH.A1B(parcel, this.A01);
        C86104wH.A1B(parcel, this.A02);
        parcel.writeFloat(this.A00);
    }

    public AudioFocusLossSettings(Parcel parcel) {
        C967566o valueOf;
        C967566o valueOf2;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = C967566o.NONE;
        } else {
            valueOf = C967566o.valueOf(readString);
        }
        this.A01 = valueOf;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = C967566o.NONE;
        } else {
            valueOf2 = C967566o.valueOf(readString2);
        }
        this.A02 = valueOf2;
        this.A00 = parcel.readFloat();
    }

    public AudioFocusLossSettings() {
        this.A01 = C967566o.PAUSE;
        this.A02 = C967566o.NONE;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }
}
