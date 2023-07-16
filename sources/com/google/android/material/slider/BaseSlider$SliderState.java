package com.google.android.material.slider;

import X.AnonymousClass0wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

public class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(68);
    public float A00;
    public float A01;
    public float A02;
    public ArrayList A03;
    public boolean A04;

    public BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        C86134wK.A17(parcel, Float.class, A0v);
        this.A00 = parcel.readFloat();
        this.A04 = parcel.createBooleanArray()[0];
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeList(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeBooleanArray(new boolean[]{this.A04});
    }
}
