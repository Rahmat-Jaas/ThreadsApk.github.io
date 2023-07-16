package com.instagram.hangouts.args;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class HangoutsDeeplinkArguments extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(87);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HangoutsDeeplinkArguments) {
                HangoutsDeeplinkArguments hangoutsDeeplinkArguments = (HangoutsDeeplinkArguments) obj;
                if (!C04220Ms.A0I(this.A01, hangoutsDeeplinkArguments.A01) || !C04220Ms.A0I(this.A02, hangoutsDeeplinkArguments.A02) || this.A00 != hangoutsDeeplinkArguments.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        switch (num.intValue()) {
            case 1:
                str = "SHARE_SHEET_NUX";
                break;
            case 2:
                str = "SHARE_SHEET_TOAST";
                break;
            default:
                str = "INBOX";
                break;
        }
        parcel.writeString(str);
    }

    public final int hashCode() {
        String str;
        int i = 0;
        int A06 = ((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "SHARE_SHEET_NUX";
                    break;
                case 2:
                    str = "SHARE_SHEET_TOAST";
                    break;
                default:
                    str = "INBOX";
                    break;
            }
            i = str.hashCode() + intValue;
        }
        return A06 + i;
    }

    public HangoutsDeeplinkArguments(String str, Integer num, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }
}
