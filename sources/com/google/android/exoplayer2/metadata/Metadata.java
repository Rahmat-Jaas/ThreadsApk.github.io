package com.google.android.exoplayer2.metadata;

import X.AnonymousClass00U;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(27);
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
        byte[] BMK();

        Format BML();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            if (!Arrays.equals(this.A01, metadata.A01) || this.A00 != metadata.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        String A08;
        String arrays = Arrays.toString(this.A01);
        long j = this.A00;
        if (j == -9223372036854775807L) {
            A08 = "";
        } else {
            A08 = AnonymousClass00U.A08(j, ", presentationTimeUs=");
        }
        return AnonymousClass00U.A0V("entries=", arrays, A08);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(r3);
        for (Entry writeParcelable : this.A01) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.A00);
    }

    public Metadata(Parcel parcel) {
        this.A01 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = C18180wK.A0A(parcel, Entry.class);
                i++;
            } else {
                this.A00 = parcel.readLong();
                return;
            }
        }
    }

    public Metadata(Entry... entryArr) {
        this.A00 = -9223372036854775807L;
        this.A01 = entryArr;
    }
}
