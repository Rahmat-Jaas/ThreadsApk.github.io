package com.google.android.exoplayer2.metadata.icy;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(31);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.A00 != icyHeaders.A00 || !Util.A0C(this.A02, icyHeaders.A02) || !Util.A0C(this.A03, icyHeaders.A03) || !Util.A0C(this.A04, icyHeaders.A04) || this.A05 != icyHeaders.A05 || this.A01 != icyHeaders.A01) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ byte[] BMK() {
        return null;
    }

    public final /* synthetic */ Format BML() {
        return null;
    }

    public final int hashCode() {
        int i = 0;
        int A002 = (((C18210wN.A00(this.A00) + C18220wO.A07(this.A02)) * 31) + C18220wO.A07(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A002 + i) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("IcyHeaders: name=\"");
        A0s.append(this.A03);
        A0s.append("\", genre=\"");
        A0s.append(this.A02);
        A0s.append("\", bitrate=");
        A0s.append(this.A00);
        A0s.append(", metadataInterval=");
        return C86144wL.A0v(A0s, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = C18180wK.A1V(parcel.readInt());
        this.A01 = parcel.readInt();
    }
}
