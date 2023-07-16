package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.02D  reason: invalid class name */
public final class AnonymousClass02D extends C02950Dn {
    public final long A00() {
        return -153197510099727452L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r8, DataOutput dataOutput) {
        AnonymousClass076 r82 = (AnonymousClass076) r8;
        dataOutput.writeLong(r82.A01);
        dataOutput.writeLong(r82.A00);
        dataOutput.writeBoolean(r82.A02);
        if (r82.A02) {
            C002000x r6 = r82.A03;
            int size = r6.size();
            dataOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                Object[] objArr = r6.A02;
                int i2 = i << 1;
                String str = (String) objArr[i2];
                long longValue = ((Number) objArr[i2 + 1]).longValue();
                dataOutput.writeInt(str.length());
                dataOutput.writeChars(str);
                dataOutput.writeLong(longValue);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r8, DataInput dataInput) {
        AnonymousClass076 r82 = (AnonymousClass076) r8;
        C002000x r6 = r82.A03;
        r6.clear();
        r82.A01 = dataInput.readLong();
        r82.A00 = dataInput.readLong();
        boolean readBoolean = dataInput.readBoolean();
        r82.A02 = readBoolean;
        if (!readBoolean) {
            return true;
        }
        int readInt = dataInput.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInput.readInt();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < readInt2; i2++) {
                sb.append(dataInput.readChar());
            }
            r6.put(sb.toString(), Long.valueOf(dataInput.readLong()));
        }
        return true;
    }
}
