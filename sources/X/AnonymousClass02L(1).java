package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02L  reason: invalid class name */
public final class AnonymousClass02L extends C02950Dn {
    public final long A00() {
        return -7207777727314674541L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r3, DataOutput dataOutput) {
        AnonymousClass07p r32 = (AnonymousClass07p) r3;
        C04220Ms.A0B(r32, 0);
        C04220Ms.A0B(dataOutput, 1);
        dataOutput.writeInt(r32.A04);
        dataOutput.writeInt(r32.A05);
        dataOutput.writeLong(r32.A0D);
        dataOutput.writeLong(r32.A0C);
        dataOutput.writeInt(r32.A06);
        dataOutput.writeInt(r32.A07);
        dataOutput.writeInt(r32.A00);
        dataOutput.writeInt(r32.A01);
        dataOutput.writeLong(r32.A0B);
        dataOutput.writeLong(r32.A0A);
        dataOutput.writeInt(r32.A02);
        dataOutput.writeInt(r32.A03);
        dataOutput.writeInt(r32.A08);
        dataOutput.writeInt(r32.A09);
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r4, DataInput dataInput) {
        AnonymousClass07p r42 = (AnonymousClass07p) r4;
        C04220Ms.A0B(r42, 0);
        C04220Ms.A0B(dataInput, 1);
        r42.A04 = dataInput.readInt();
        r42.A05 = dataInput.readInt();
        r42.A0D = dataInput.readLong();
        r42.A0C = dataInput.readLong();
        r42.A06 = dataInput.readInt();
        r42.A07 = dataInput.readInt();
        r42.A00 = dataInput.readInt();
        r42.A01 = dataInput.readInt();
        r42.A0B = dataInput.readLong();
        r42.A0A = dataInput.readLong();
        r42.A02 = dataInput.readInt();
        r42.A03 = dataInput.readInt();
        r42.A08 = dataInput.readInt();
        r42.A09 = dataInput.readInt();
        return true;
    }
}
