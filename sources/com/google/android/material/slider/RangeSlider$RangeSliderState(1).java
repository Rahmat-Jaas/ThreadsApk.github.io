package com.google.android.material.slider;

import X.C18180wK;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

public class RangeSlider$RangeSliderState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(69);
    public float A00;
    public int A01;

    public RangeSlider$RangeSliderState(Parcel parcel) {
        super(C18180wK.A0A(parcel, RangeSlider$RangeSliderState.class));
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
