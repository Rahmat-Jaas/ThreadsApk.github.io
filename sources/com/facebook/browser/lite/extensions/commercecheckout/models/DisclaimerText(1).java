package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class DisclaimerText extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(98);
    public final int A00;
    public final int A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerText) {
                DisclaimerText disclaimerText = (DisclaimerText) obj;
                if (!(C04220Ms.A0I(this.A02, disclaimerText.A02) && this.A00 == disclaimerText.A00 && this.A01 == disclaimerText.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A06(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DisclaimerText(text=");
        A0s.append(this.A02);
        A0s.append(", ctaBegin=");
        A0s.append(this.A00);
        A0s.append(", ctaEnd=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public DisclaimerText(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }
}
