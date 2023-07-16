package android.support.v4.media.session;

import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86124wJ;
import X.C97686Cj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = C86124wJ.A0W(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder A0s = C18190wL.A0s("Action:mName='");
            A0s.append(this.A02);
            A0s.append(", mIcon=");
            A0s.append(this.A00);
            A0s.append(", mExtras=");
            return C18200wM.A0m(this.A01, A0s);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = parcel.readBundle(C97686Cj.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PlaybackState {");
        A0s.append("state=");
        A0s.append(this.A03);
        A0s.append(", position=");
        A0s.append(this.A07);
        A0s.append(", buffered position=");
        A0s.append(this.A06);
        A0s.append(", speed=");
        A0s.append(this.A01);
        A0s.append(", updated=");
        A0s.append(this.A08);
        A0s.append(", actions=");
        A0s.append(this.A04);
        A0s.append(", error code=");
        A0s.append(this.A02);
        A0s.append(", error message=");
        A0s.append(this.A0A);
        A0s.append(", custom actions=");
        A0s.append(this.A00);
        A0s.append(", active item id=");
        A0s.append(this.A05);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = parcel.readBundle(C97686Cj.class.getClassLoader());
        this.A02 = parcel.readInt();
    }
}
