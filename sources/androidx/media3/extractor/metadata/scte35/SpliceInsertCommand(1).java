package androidx.media3.extractor.metadata.scte35;

import X.AnonymousClass0wJ;
import X.C108606id;
import X.C18240wQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(44);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C108606id r2 = (C108606id) list.get(i2);
            parcel.writeInt(r2.A00);
            parcel.writeLong(r2.A02);
            parcel.writeLong(r2.A01);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        boolean z = false;
        this.A0B = AnonymousClass0wJ.A1T(parcel.readByte(), 1);
        this.A09 = AnonymousClass0wJ.A1T(parcel.readByte(), 1);
        this.A0A = AnonymousClass0wJ.A1T(parcel.readByte(), 1);
        this.A0C = AnonymousClass0wJ.A1T(parcel.readByte(), 1);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A0k = C18240wQ.A0k(readInt);
        for (int i = 0; i < readInt; i++) {
            A0k.add(new C108606id(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.A07 = Collections.unmodifiableList(A0k);
        this.A08 = parcel.readByte() == 1 ? true : z;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
