package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02z  reason: invalid class name and case insensitive filesystem */
public final class C006802z extends C02950Dn {
    public final long A00() {
        return -2269842438411178483L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass09G r32 = (AnonymousClass09G) r3;
        dataOutput.writeFloat(r32.A00);
        dataOutput.writeLong(r32.A01);
        dataOutput.writeLong(r32.A02);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r3, DataInput dataInput) {
        AnonymousClass09G r32 = (AnonymousClass09G) r3;
        r32.A00 = dataInput.readFloat();
        r32.A01 = dataInput.readLong();
        r32.A02 = dataInput.readLong();
        return true;
    }
}
