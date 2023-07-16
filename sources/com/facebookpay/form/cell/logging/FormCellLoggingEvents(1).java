package com.facebookpay.form.cell.logging;

import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class FormCellLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(54);
    public final FormCellFocusEvents A00;

    public FormCellLoggingEvents(FormCellFocusEvents formCellFocusEvents) {
        C04220Ms.A0B(formCellFocusEvents, 1);
        this.A00 = formCellFocusEvents;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
