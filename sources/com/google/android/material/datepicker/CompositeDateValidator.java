package com.google.android.material.datepicker;

import X.AnonymousClass7mV;
import X.AnonymousClass7mW;
import X.C145418kT;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final C145418kT A02 = new AnonymousClass7mW();
    public static final C145418kT A03 = new AnonymousClass7mV();
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(59);
    public final C145418kT A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.A01.equals(compositeDateValidator.A01) && this.A00.AnQ() == compositeDateValidator.A00.AnQ();
    }

    public final boolean BZd(long j) {
        return this.A00.BZe(this.A01, j);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00.AnQ());
    }

    public CompositeDateValidator(C145418kT r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
