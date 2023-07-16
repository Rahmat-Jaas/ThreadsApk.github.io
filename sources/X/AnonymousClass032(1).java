package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.032  reason: invalid class name */
public final class AnonymousClass032 extends C02950Dn {
    public final long A00() {
        return 2353414016265691865L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass09R r32 = (AnonymousClass09R) r3;
        dataOutput.writeDouble(r32.A03);
        dataOutput.writeDouble(r32.A02);
        dataOutput.writeDouble(r32.A01);
        dataOutput.writeDouble(r32.A00);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r3, DataInput dataInput) {
        AnonymousClass09R r32 = (AnonymousClass09R) r3;
        r32.A03 = dataInput.readDouble();
        r32.A02 = dataInput.readDouble();
        r32.A01 = dataInput.readDouble();
        r32.A00 = dataInput.readDouble();
        return true;
    }
}
