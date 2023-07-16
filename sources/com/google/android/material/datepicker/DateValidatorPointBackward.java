package com.google.android.material.datepicker;

import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(60);
    public final long A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointBackward) && this.A00 == ((DateValidatorPointBackward) obj).A00;
        }
        return true;
    }

    public final boolean BZd(long j) {
        if (j <= this.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0F(Long.valueOf(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
    }

    public DateValidatorPointBackward(long j) {
        this.A00 = j;
    }
}
