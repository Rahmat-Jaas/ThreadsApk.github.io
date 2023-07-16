package com.google.android.material.datepicker;

import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(61);
    public final long A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointForward) && this.A00 == ((DateValidatorPointForward) obj).A00;
        }
        return true;
    }

    public final boolean BZd(long j) {
        return C86114wI.A1S((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return C86124wJ.A0F(Long.valueOf(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }

    public DateValidatorPointForward(long j) {
        this.A00 = j;
    }
}
