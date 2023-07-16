package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape112S0000000_I2;

public abstract class AbsSavedState implements Parcelable {
    public static final AbsSavedState A01 = new AbsSavedState() {
    };
    public static final Parcelable.Creator CREATOR = new IDxObjectShape112S0000000_I2(0);
    public final Parcelable A00;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A01 ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public AbsSavedState() {
        this.A00 = null;
    }
}
