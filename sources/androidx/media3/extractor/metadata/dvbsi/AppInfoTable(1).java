package androidx.media3.extractor.metadata.dvbsi;

import X.AnonymousClass00U;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(21);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass00U.A06(this.A00, "Ait(controlCode=", ",url=", this.A01, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AppInfoTable(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
