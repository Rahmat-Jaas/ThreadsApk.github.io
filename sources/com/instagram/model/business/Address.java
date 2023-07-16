package com.instagram.model.business;

import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.Arrays;

public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(43);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            Address address = (Address) obj;
            if (!C04220Ms.A0I(this.A03, address.A03) || !C04220Ms.A0I(this.A01, address.A01) || !C04220Ms.A0I(this.A04, address.A04) || !C04220Ms.A0I(this.A00, address.A00) || !C04220Ms.A0I(this.A02, address.A02)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, this.A04, this.A00, this.A02});
    }

    public Address(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public Address(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean A1b = C18200wM.A1b(str, !z ? i : length);
                if (z) {
                    if (!A1b) {
                        break;
                    }
                    length--;
                } else if (!A1b) {
                    z = true;
                } else {
                    i++;
                }
            }
            str6 = C18220wO.A0s(str, length, i);
        } else {
            str6 = null;
        }
        this.A04 = str6;
        this.A01 = str2;
        if (str4 != null) {
            int length2 = str4.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length2) {
                boolean A1b2 = C18200wM.A1b(str4, !z2 ? i2 : length2);
                if (z2) {
                    if (!A1b2) {
                        break;
                    }
                    length2--;
                } else if (!A1b2) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            str7 = C18220wO.A0s(str4, length2, i2);
        }
        this.A02 = str7;
        this.A00 = str3;
        this.A03 = str5;
    }

    public Address() {
    }
}
