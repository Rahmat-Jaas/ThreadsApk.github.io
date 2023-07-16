package com.instagram.model.direct.messageid;

import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public class MessageIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(64);
    public String A00;
    public String A01;

    public MessageIdentifier(String str, String str2) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageIdentifier)) {
            return false;
        }
        MessageIdentifier messageIdentifier = (MessageIdentifier) obj;
        if (C04220Ms.A0I(this.A01, messageIdentifier.A01)) {
            if (this instanceof DirectMessageIdentifier) {
                str = null;
            } else {
                str = this.A00;
            }
            if (messageIdentifier instanceof DirectMessageIdentifier) {
                str2 = null;
            } else {
                str2 = messageIdentifier.A00;
            }
            if (C04220Ms.A0I(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public int hashCode() {
        String str;
        int A03 = C18180wK.A03(this.A01);
        if (this instanceof DirectMessageIdentifier) {
            str = null;
        } else {
            str = this.A00;
        }
        return A03 + C18220wO.A07(str);
    }
}
