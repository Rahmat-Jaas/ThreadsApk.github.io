package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02f  reason: invalid class name and case insensitive filesystem */
public final class C004902f extends C02950Dn {
    public final long A00() {
        return -2479634339626480691L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        C016808a r32 = (C016808a) r3;
        dataOutput.writeLong(r32.A00);
        dataOutput.writeLong(r32.A01);
        dataOutput.writeLong(r32.A02);
        dataOutput.writeLong(r32.A03);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r3, DataInput dataInput) {
        C016808a r32 = (C016808a) r3;
        r32.A00 = dataInput.readLong();
        r32.A01 = dataInput.readLong();
        r32.A02 = dataInput.readLong();
        r32.A03 = dataInput.readLong();
        return true;
    }
}
