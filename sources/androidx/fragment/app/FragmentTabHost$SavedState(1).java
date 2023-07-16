package androidx.fragment.app;

import X.AnonymousClass00U;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;

public class FragmentTabHost$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(7);
    public String A00;

    public final String toString() {
        return AnonymousClass00U.A0h("FragmentTabHost.SavedState{", Integer.toHexString(System.identityHashCode(this)), " curTab=", this.A00, "}");
    }

    public FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
