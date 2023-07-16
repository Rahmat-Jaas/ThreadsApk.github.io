package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;
import java.util.ArrayList;

public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(5);
    public int A00;
    public String A01 = null;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04;
    public ArrayList A05;
    public ArrayList A06;
    public BackStackRecordState[] A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A05);
        parcel.writeStringList(this.A06);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A02);
        parcel.writeTypedList(this.A03);
        parcel.writeTypedList(this.A04);
    }

    public FragmentManagerState(Parcel parcel) {
        this.A05 = parcel.createStringArrayList();
        this.A06 = parcel.createStringArrayList();
        this.A07 = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.createStringArrayList();
        this.A03 = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.A04 = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }

    public FragmentManagerState() {
    }
}
