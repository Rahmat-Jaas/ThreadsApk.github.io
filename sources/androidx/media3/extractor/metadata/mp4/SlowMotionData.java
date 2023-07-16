package androidx.media3.extractor.metadata.mp4;

import X.C1366383p;
import X.C18190wL;
import X.C18200wM;
import X.C37065Jjt;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(40);
    public final List A00;

    public final class Segment implements Parcelable {
        public static final Comparator A03 = C1366383p.A00;
        public static final Parcelable.Creator CREATOR = C86124wJ.A0W(41);
        public final int A00;
        public final long A01;
        public final long A02;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Segment segment = (Segment) obj;
                if (!(this.A02 == segment.A02 && this.A01 == segment.A01 && this.A00 == segment.A00)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return C86124wJ.A0I(Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00));
        }

        public final String toString() {
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", C86134wK.A1b(Long.valueOf(this.A02), Long.valueOf(this.A01), this.A00));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A02);
            parcel.writeLong(this.A01);
            parcel.writeInt(this.A00);
        }

        public Segment(long j, long j2, int i) {
            C37065Jjt.A01(C86124wJ.A1X((j > j2 ? 1 : (j == j2 ? 0 : -1))));
            this.A02 = j;
            this.A01 = j2;
            this.A00 = i;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((SlowMotionData) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C18200wM.A0m(this.A00, C18190wL.A0s("SlowMotion: segments="));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }

    public SlowMotionData(List list) {
        boolean z;
        this.A00 = list;
        if (!list.isEmpty()) {
            long j = ((Segment) list.get(0)).A01;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((Segment) list.get(i)).A02 < j) {
                    z = true;
                    break;
                } else {
                    j = ((Segment) list.get(i)).A01;
                    i++;
                }
            }
        }
        z = false;
        C37065Jjt.A01(!z);
    }
}
