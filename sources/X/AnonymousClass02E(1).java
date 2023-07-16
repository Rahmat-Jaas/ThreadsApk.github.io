package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02E  reason: invalid class name */
public final class AnonymousClass02E extends C02950Dn {
    public final long A00() {
        return 4345974300167284411L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass07M r32 = (AnonymousClass07M) r3;
        dataOutput.writeLong(r32.A00);
        dataOutput.writeLong(r32.A01);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r3, DataInput dataInput) {
        AnonymousClass07M r32 = (AnonymousClass07M) r3;
        r32.A00 = dataInput.readLong();
        r32.A01 = dataInput.readLong();
        return true;
    }
}
