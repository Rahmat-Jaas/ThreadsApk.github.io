package com.instagram.model.business;

import X.C04220Ms;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.Arrays;

public final class PublicPhoneContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(45);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            PublicPhoneContact publicPhoneContact = (PublicPhoneContact) obj;
            if (!C04220Ms.A0I(this.A03, publicPhoneContact.A03) || !C04220Ms.A0I(this.A00, publicPhoneContact.A00) || !C04220Ms.A0I(this.A01, publicPhoneContact.A01) || !C04220Ms.A0I(this.A02, publicPhoneContact.A02)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }

    public PublicPhoneContact(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public PublicPhoneContact(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public PublicPhoneContact() {
    }
}
