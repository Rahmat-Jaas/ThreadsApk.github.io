package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02x  reason: invalid class name and case insensitive filesystem */
public final class C006602x extends C02950Dn {
    public final long A00() {
        return 6566077622105075903L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass09D r32 = (AnonymousClass09D) r3;
        C04220Ms.A0B(r32, 0);
        C04220Ms.A0B(dataOutput, 1);
        dataOutput.writeLong(r32.A03);
        dataOutput.writeLong(r32.A00);
        dataOutput.writeLong(r32.A02);
        dataOutput.writeLong(r32.A01);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r4, DataInput dataInput) {
        AnonymousClass09D r42 = (AnonymousClass09D) r4;
        C04220Ms.A0B(r42, 0);
        C04220Ms.A0B(dataInput, 1);
        r42.A03 = dataInput.readLong();
        r42.A00 = dataInput.readLong();
        r42.A02 = dataInput.readLong();
        r42.A01 = dataInput.readLong();
        return true;
    }
}
