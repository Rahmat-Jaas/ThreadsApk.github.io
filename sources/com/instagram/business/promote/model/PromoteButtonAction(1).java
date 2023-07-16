package com.instagram.business.promote.model;

import X.C04220Ms;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class PromoteButtonAction implements Parcelable {
    public static final PCreatorCreatorShape10S0000000_I2_10 CREATOR = new PCreatorCreatorShape10S0000000_I2_10(32);
    public PromoteButtonActionType A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        String str2 = this.A01;
        if (str2 != null) {
            parcel.writeString(str2);
            String str3 = this.A02;
            if (str3 != null) {
                parcel.writeString(str3);
                PromoteButtonActionType promoteButtonActionType = this.A00;
                if (promoteButtonActionType != null) {
                    parcel.writeParcelable(promoteButtonActionType, i);
                    return;
                }
                str = "type";
            } else {
                str = "link";
            }
        } else {
            str = "displayText";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public PromoteButtonAction(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            this.A01 = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A02 = readString2;
                Parcelable A0A = C18180wK.A0A(parcel, PromoteButtonActionType.class);
                if (A0A != null) {
                    PromoteButtonActionType promoteButtonActionType = (PromoteButtonActionType) A0A;
                    C04220Ms.A0B(promoteButtonActionType, 0);
                    this.A00 = promoteButtonActionType;
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public PromoteButtonAction() {
    }
}
