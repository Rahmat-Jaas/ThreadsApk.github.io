package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C18210wN;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(71);
    public final int A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetPhoneNumberHintIntentRequest)) {
            return false;
        }
        return C117046y2.A01(Integer.valueOf(this.A00), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(C18210wN.A1X(this.A00));
    }

    public GetPhoneNumberHintIntentRequest(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
