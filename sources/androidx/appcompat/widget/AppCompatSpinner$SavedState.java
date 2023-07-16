package androidx.appcompat.widget;

import X.C18180wK;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(12);
    public boolean A00;

    public AppCompatSpinner$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = C18180wK.A1V(parcel.readByte());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public AppCompatSpinner$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
