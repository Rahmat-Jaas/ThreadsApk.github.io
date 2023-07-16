package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.03g  reason: invalid class name and case insensitive filesystem */
public final class C007503g extends C02950Dn {
    public final long A00() {
        return -5544646103548483595L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass0B7 r32 = (AnonymousClass0B7) r3;
        dataOutput.writeLong(r32.A00);
        dataOutput.writeLong(r32.A01);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r3, DataInput dataInput) {
        AnonymousClass0B7 r32 = (AnonymousClass0B7) r3;
        r32.A00 = dataInput.readLong();
        r32.A01 = dataInput.readLong();
        return true;
    }
}
