package androidx.media3.extractor.metadata.id3;

import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(30);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.A02 != chapterTocFrame.A02 || this.A01 != chapterTocFrame.A01 || !Util.A05(this.A00, chapterTocFrame.A00) || !Arrays.equals(this.A03, chapterTocFrame.A03) || !Arrays.equals(this.A04, chapterTocFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        boolean z = true;
        this.A02 = C18180wK.A1V(parcel.readByte());
        this.A01 = parcel.readByte() == 0 ? false : z;
        this.A03 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A04[i] = C18180wK.A0A(parcel, Id3Frame.class);
        }
    }

    public final int hashCode() {
        return ((C18210wN.A00(this.A02 ? 1 : 0) + (this.A01 ? 1 : 0)) * 31) + C18220wO.A07(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(r3);
        for (Id3Frame writeParcelable : this.A04) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterTocFrame(String str, Id3Frame[] id3FrameArr, String[] strArr, boolean z, boolean z2) {
        super("CTOC");
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }
}
