package androidx.media3.common;

import X.AnonymousClass00U;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(17);
    public final long A00;
    public final Entry[] A01;

    public interface Entry extends Parcelable {
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r6 = r8.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.Metadata A00(androidx.media3.common.Metadata r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return r7
        L_0x0003:
            androidx.media3.common.Metadata$Entry[] r6 = r8.A01
            int r5 = r6.length
            if (r5 != 0) goto L_0x0009
            return r7
        L_0x0009:
            long r2 = r7.A00
            androidx.media3.common.Metadata$Entry[] r1 = r7.A01
            int r4 = r1.length
            int r0 = r4 + r5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 0
            java.lang.System.arraycopy(r6, r0, r1, r4, r5)
            androidx.media3.common.Metadata$Entry[] r1 = (androidx.media3.common.Metadata.Entry[]) r1
            androidx.media3.common.Metadata r0 = new androidx.media3.common.Metadata
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.Metadata.A00(androidx.media3.common.Metadata):androidx.media3.common.Metadata");
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

    public Metadata(Entry[] entryArr, long j) {
        this.A00 = j;
        this.A01 = entryArr;
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

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(entryArr, -9223372036854775807L);
    }
}
