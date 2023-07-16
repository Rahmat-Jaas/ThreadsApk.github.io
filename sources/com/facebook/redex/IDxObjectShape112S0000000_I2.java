package com.facebook.redex;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class IDxObjectShape112S0000000_I2 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public IDxObjectShape112S0000000_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return AbsSavedState.A01;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new Fragment.SavedState(parcel, (ClassLoader) null);
            default:
                return new ViewPager.SavedState(parcel, (ClassLoader) null);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new AbsSavedState[i];
            case 1:
                return new Fragment.SavedState[i];
            default:
                return new ViewPager.SavedState[i];
        }
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.A01;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new Fragment.SavedState(parcel, classLoader);
            default:
                return new ViewPager.SavedState(parcel, classLoader);
        }
    }
}
