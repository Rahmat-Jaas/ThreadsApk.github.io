package androidx.appcompat.widget;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(11);
    public int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public ActionMenuPresenter$SavedState(Parcel parcel) {
        this.A00 = parcel.readInt();
    }

    public ActionMenuPresenter$SavedState() {
    }
}
