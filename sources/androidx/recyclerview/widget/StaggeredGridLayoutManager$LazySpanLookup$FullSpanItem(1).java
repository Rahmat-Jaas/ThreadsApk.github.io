package androidx.recyclerview.widget;

import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(59);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FullSpanItem{mPosition=");
        A0s.append(this.A01);
        A0s.append(", mGapDir=");
        A0s.append(this.A00);
        A0s.append(", mHasUnwantedGapAfter=");
        A0s.append(this.A02);
        A0s.append(", mGapPerSpan=");
        A0s.append(Arrays.toString(this.A03));
        return C18190wL.A0o(A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(length);
        parcel.writeIntArray(this.A03);
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = C86114wI.A1V(parcel);
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.A03 = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {
    }
}
