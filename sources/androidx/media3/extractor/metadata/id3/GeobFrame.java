package androidx.media3.extractor.metadata.id3;

import X.AnonymousClass00U;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(32);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            GeobFrame geobFrame = (GeobFrame) obj;
            if (!Util.A05(this.A02, geobFrame.A02) || !Util.A05(this.A01, geobFrame.A01) || !Util.A05(this.A00, geobFrame.A00) || !Arrays.equals(this.A03, geobFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public final int hashCode() {
        int i = 0;
        int A002 = (C18210wN.A00(C18220wO.A07(this.A02)) + C18220wO.A07(this.A01)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return C86164wN.A07(this.A03, (A002 + i) * 31);
    }

    public final String toString() {
        return AnonymousClass00U.A0j(this.A00, ": mimeType=", this.A02, ", filename=", this.A01, ", description=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public GeobFrame(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }
}
