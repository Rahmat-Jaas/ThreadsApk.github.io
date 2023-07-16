package com.facebook.messaging.encryptedbackups.encryptedbackupsmanager.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;

public final class OneTimeCodeDevice extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(2);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public OneTimeCodeDevice(String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OneTimeCodeDevice) {
                OneTimeCodeDevice oneTimeCodeDevice = (OneTimeCodeDevice) obj;
                if (!C04220Ms.A0I(this.A00, oneTimeCodeDevice.A00) || !C04220Ms.A0I(this.A04, oneTimeCodeDevice.A04) || !C04220Ms.A0I(this.A01, oneTimeCodeDevice.A01) || !C04220Ms.A0I(this.A03, oneTimeCodeDevice.A03) || !C04220Ms.A0I(this.A02, oneTimeCodeDevice.A02)) {
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
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return ((((((C18180wK.A03(this.A00) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + C18200wM.A09(this.A02);
    }
}
