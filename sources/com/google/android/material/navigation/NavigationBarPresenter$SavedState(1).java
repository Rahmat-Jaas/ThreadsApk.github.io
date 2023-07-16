package com.google.android.material.navigation;

import X.C18180wK;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(67);
    public int A00;
    public ParcelableSparseArray A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public NavigationBarPresenter$SavedState(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (ParcelableSparseArray) C18180wK.A0A(parcel, getClass());
    }

    public NavigationBarPresenter$SavedState() {
    }
}
