package com.facebook.profilo.ipc;

import X.AnonymousClass0UJ;
import X.AnonymousClass0VH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;
import java.io.File;

public final class TraceContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(11);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass0UJ A07;
    public TraceConfigExtras A08;
    public Buffer A09;
    public File A0A;
    public Object A0B;
    public Object A0C;
    public String A0D;
    public String A0E;
    public Buffer[] A0F;
    public volatile AnonymousClass0VH A0G;

    public final int describeContents() {
        return 0;
    }

    public TraceContext(TraceContext traceContext) {
        TraceContext traceContext2 = traceContext;
        long j = traceContext2.A06;
        String str = traceContext2.A0D;
        AnonymousClass0UJ r17 = traceContext2.A07;
        int i = traceContext2.A01;
        Object obj = traceContext2.A0C;
        Object obj2 = traceContext2.A0B;
        long j2 = traceContext2.A05;
        int i2 = traceContext2.A02;
        int i3 = traceContext2.A03;
        int i4 = traceContext2.A00;
        int i5 = traceContext2.A04;
        TraceConfigExtras traceConfigExtras = traceContext2.A08;
        Buffer buffer = traceContext2.A09;
        Buffer[] bufferArr = traceContext2.A0F;
        File file = traceContext2.A0A;
        String str2 = traceContext2.A0E;
        this.A06 = j;
        this.A0D = str;
        this.A07 = r17;
        this.A01 = i;
        this.A0C = obj;
        this.A0B = obj2;
        this.A05 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = i5;
        this.A08 = traceConfigExtras;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        this.A08.writeToParcel(parcel, i);
    }

    public TraceContext(AnonymousClass0UJ r6, TraceConfigExtras traceConfigExtras, Buffer buffer, File file, Object obj, String str, Buffer[] bufferArr, int i, int i2, int i3, int i4, long j, long j2) {
        this.A06 = j;
        this.A0D = str;
        this.A07 = r6;
        this.A01 = i;
        this.A0C = obj;
        this.A0B = null;
        this.A05 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = 0;
        this.A04 = i4;
        this.A08 = traceConfigExtras;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = "main";
    }

    public TraceContext(TraceContext traceContext, int i) {
        TraceContext traceContext2 = traceContext;
        long j = traceContext2.A06;
        String str = traceContext2.A0D;
        AnonymousClass0UJ r16 = traceContext2.A07;
        int i2 = traceContext2.A01;
        Object obj = traceContext2.A0C;
        Object obj2 = traceContext2.A0B;
        long j2 = traceContext2.A05;
        int i3 = traceContext2.A02;
        int i4 = traceContext2.A03;
        int i5 = traceContext2.A04;
        TraceConfigExtras traceConfigExtras = traceContext2.A08;
        Buffer buffer = traceContext2.A09;
        Buffer[] bufferArr = traceContext2.A0F;
        File file = traceContext2.A0A;
        String str2 = traceContext2.A0E;
        this.A06 = j;
        this.A0D = str;
        this.A07 = r16;
        this.A01 = i2;
        this.A0C = obj;
        this.A0B = obj2;
        this.A05 = j2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i;
        this.A04 = i5;
        this.A08 = traceConfigExtras;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = str2;
    }

    public TraceContext(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0D = parcel.readString();
        this.A01 = parcel.readInt();
        this.A0C = null;
        this.A0B = null;
        this.A05 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A08 = (TraceConfigExtras) TraceConfigExtras.CREATOR.createFromParcel(parcel);
    }

    public TraceContext() {
    }
}
