package com.facebook.smartcapture.download;

import X.C04220Ms;
import X.C10300i6;
import X.C18180wK;
import X.C86114wI;
import X.C86144wL;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class IgVoltronAndNmlModulesDownloader implements Parcelable, CreditCardModulesDownloader {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(12);
    public final Bundle A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeBundle(this.A00);
    }

    public IgVoltronAndNmlModulesDownloader(C10300i6 r4) {
        Bundle A06 = C18180wK.A06();
        this.A00 = A06;
        A06.putString("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
    }

    public IgVoltronAndNmlModulesDownloader(Parcel parcel) {
        this.A00 = parcel.readBundle(C86114wI.A0Z(this));
    }
}
