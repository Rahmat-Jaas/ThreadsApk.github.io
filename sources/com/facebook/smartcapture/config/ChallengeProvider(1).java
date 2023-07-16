package com.facebook.smartcapture.config;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C28958Fez;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

public final class ChallengeProvider implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(11);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeList(this.A03);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ChallengeProvider{mSteps=");
        A0s.append(TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A03));
        A0s.append(", mPhotoQuality=");
        A0s.append(this.A00);
        A0s.append(", mVideoQuality=");
        A0s.append(this.A02);
        A0s.append(", mVideoBitrate=");
        A0s.append(this.A01);
        return C18190wL.A0o(A0s);
    }

    public ChallengeProvider(Parcel parcel) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        C86134wK.A17(parcel, C28958Fez.class, A0v);
        Class cls = Integer.TYPE;
        this.A00 = (Integer) C86114wI.A0e(parcel, cls);
        this.A02 = (Integer) C86114wI.A0e(parcel, cls);
        this.A01 = (Integer) C86114wI.A0e(parcel, cls);
    }

    public ChallengeProvider(List list) {
        this.A03 = list;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
