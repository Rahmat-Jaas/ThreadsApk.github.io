package androidx.media3.extractor.metadata.scte35;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(43);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = parcel.createByteArray();
    }
}
