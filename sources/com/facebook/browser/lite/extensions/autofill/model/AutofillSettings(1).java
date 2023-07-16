package com.facebook.browser.lite.extensions.autofill.model;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class AutofillSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(95);
    public final int A00;
    public final int A01;
    public final AutofillConnectPayload A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final boolean A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        AutofillConnectPayload autofillConnectPayload = this.A02;
        if (autofillConnectPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autofillConnectPayload.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
    }

    public AutofillSettings(AutofillConnectPayload autofillConnectPayload, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = i;
        this.A06 = z;
        this.A01 = i2;
        this.A04 = z2;
        this.A03 = z3;
        this.A07 = z4;
        this.A02 = autofillConnectPayload;
        this.A00 = i3;
    }
}
