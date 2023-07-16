package com.facebook.compphoto.sdk.compilations.api;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C18250wR;
import X.C29911zW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.ArrayList;
import java.util.Arrays;

public class CompilationSourceClip implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(66);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final C29911zW A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompilationSourceClip)) {
            return false;
        }
        CompilationSourceClip compilationSourceClip = (CompilationSourceClip) obj;
        return Double.compare(compilationSourceClip.A01, this.A01) == 0 && Double.compare(compilationSourceClip.A00, this.A00) == 0 && Double.compare(compilationSourceClip.A02, this.A02) == 0 && Double.compare(compilationSourceClip.A03, this.A03) == 0 && compilationSourceClip.A05 == this.A05 && compilationSourceClip.A04 == this.A04 && compilationSourceClip.A07 == this.A07 && compilationSourceClip.A06 == this.A06 && this.A09.equals(compilationSourceClip.A09) && this.A0A.equals(compilationSourceClip.A0A) && this.A0B.equals(compilationSourceClip.A0B) && this.A08 == compilationSourceClip.A08 && this.A0C == compilationSourceClip.A0C;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18240wQ.A0v(parcel, this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A02);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeDouble(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        C29911zW r1 = this.A08;
        if (r1 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(r1.toString());
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
    }

    public CompilationSourceClip(Parcel parcel) {
        C29911zW r0;
        this.A09 = C18250wR.A0T(parcel);
        String readString = parcel.readString();
        String str = "";
        this.A0A = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.A0B = readString2 != null ? readString2 : str;
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        boolean z = true;
        this.A0D = C18180wK.A1V(parcel.readByte());
        this.A03 = parcel.readDouble();
        this.A07 = parcel.readLong();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A06 = parcel.readInt();
        if (parcel.readByte() != 0) {
            r0 = C29911zW.valueOf(C18240wQ.A0c(parcel));
        } else {
            r0 = C29911zW.UNKNOWN;
        }
        this.A08 = r0;
        this.A0C = parcel.readByte() == 0 ? false : z;
    }

    public final int hashCode() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C29911zW r3 = this.A08;
        A0v.add(r3);
        A0v.add(this.A0B);
        A0v.add(Double.valueOf(this.A01));
        A0v.add(Double.valueOf(this.A00));
        A0v.add(Double.valueOf(this.A02));
        A0v.add(Double.valueOf(this.A03));
        A0v.add(Long.valueOf(this.A07));
        C18200wM.A1U(A0v, this.A05);
        C18200wM.A1U(A0v, this.A04);
        C18200wM.A1U(A0v, this.A06);
        A0v.add(r3);
        A0v.add(Boolean.valueOf(this.A0C));
        return Arrays.hashCode(A0v.toArray());
    }
}
