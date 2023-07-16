package androidx.media3.extractor.metadata.mp4;

import X.C18190wL;
import X.C18210wN;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(42);
    public final float A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (!(this.A00 == smtaMetadataEntry.A00 && this.A01 == smtaMetadataEntry.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A00(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("smta: captureFrameRate=");
        A0s.append(this.A00);
        A0s.append(", svcTemporalLayerCount=");
        return C86144wL.A0v(A0s, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }
}
