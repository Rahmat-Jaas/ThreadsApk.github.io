package com.facebookpay.expresscheckout.logging;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

public final class ComponentLoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(9);
    public final String A00;
    public final String A01;
    public final ImmutableMap A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComponentLoggingData) {
                ComponentLoggingData componentLoggingData = (ComponentLoggingData) obj;
                if (!C04220Ms.A0I(this.A00, componentLoggingData.A00) || !C04220Ms.A0I(this.A01, componentLoggingData.A01) || !C04220Ms.A0I(this.A02, componentLoggingData.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A00)) + AnonymousClass0wJ.A03(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ComponentLoggingData(contextComponentName=");
        A0s.append(this.A00);
        A0s.append(", targetName=");
        A0s.append(this.A01);
        A0s.append(", extraPayload=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public ComponentLoggingData(ImmutableMap immutableMap, String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = immutableMap;
    }
}
