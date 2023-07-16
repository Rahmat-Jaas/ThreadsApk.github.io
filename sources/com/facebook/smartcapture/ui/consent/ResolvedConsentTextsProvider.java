package com.facebook.smartcapture.ui.consent;

import X.C04220Ms;
import X.C111296n6;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class ResolvedConsentTextsProvider implements ConsentTextsProvider {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(16);
    public final C111296n6 A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C111296n6 r1 = this.A00;
        parcel.writeString(r1.A07);
        parcel.writeString(r1.A06);
        parcel.writeString(r1.A09);
        parcel.writeString(r1.A08);
        parcel.writeString(r1.A04);
        parcel.writeString(r1.A00);
        parcel.writeString(r1.A01);
        parcel.writeString(r1.A02);
        parcel.writeString(r1.A05);
        parcel.writeString(r1.A03);
        parcel.writeString(r1.A0G);
        parcel.writeString(r1.A0A);
        parcel.writeString(r1.A0D);
        parcel.writeString(r1.A0B);
        parcel.writeString(r1.A0C);
        parcel.writeString(r1.A0F);
        parcel.writeString(r1.A0E);
    }

    public ResolvedConsentTextsProvider(C111296n6 r1) {
        this.A00 = r1;
    }
}
