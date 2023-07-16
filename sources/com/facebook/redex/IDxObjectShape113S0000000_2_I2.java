package com.facebook.redex;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;

public class IDxObjectShape113S0000000_2_I2 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public IDxObjectShape113S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                return new SearchView.SavedState(parcel, classLoader);
            case 1:
                return new CoordinatorLayout.SavedState(parcel, classLoader);
            case 2:
                return new ParcelableSparseArray(parcel, classLoader);
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SearchView.SavedState[i];
            case 1:
                return new CoordinatorLayout.SavedState[i];
            case 2:
                return new ParcelableSparseArray[i];
            default:
                return new ExtendableSavedState[i];
        }
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new SearchView.SavedState(parcel, (ClassLoader) null);
            case 1:
                return new CoordinatorLayout.SavedState(parcel, (ClassLoader) null);
            case 2:
                return new ParcelableSparseArray(parcel, (ClassLoader) null);
            default:
                return new ExtendableSavedState(parcel, (ClassLoader) null);
        }
    }
}
