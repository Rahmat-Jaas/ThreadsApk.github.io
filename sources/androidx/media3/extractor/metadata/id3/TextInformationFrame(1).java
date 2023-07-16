package androidx.media3.extractor.metadata.id3;

import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C37065Jjt;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(36);
    public final ImmutableList A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A05(this.A00, textInformationFrame.A00) || !Util.A05(this.A01, textInformationFrame.A01) || !this.A00.equals(textInformationFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, (C18210wN.A00(this.A00.hashCode()) + C18220wO.A07(this.A01)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringArray((String[]) this.A00.toArray(new String[0]));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        C37065Jjt.A01(!list.isEmpty());
        this.A01 = str2;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        this.A00 = copyOf;
        copyOf.get(0);
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        A0r.append(": description=");
        A0r.append(this.A01);
        A0r.append(": values=");
        return C18200wM.A0m(this.A00, A0r);
    }
}
