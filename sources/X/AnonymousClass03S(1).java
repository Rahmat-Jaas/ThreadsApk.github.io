package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.03S  reason: invalid class name */
public final class AnonymousClass03S extends C02950Dn {
    public final C002000x A00 = new C002000x();
    public final C002000x A01 = new C002000x();
    public final C002000x A02 = new C002000x();

    public final long A00() {
        return -3137023965338009377L;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass0DW r8, DataOutput dataOutput) {
        AnonymousClass0A6 r82 = (AnonymousClass0A6) r8;
        C002000x r6 = this.A02;
        int size = r6.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (r82.A08((Class) r6.A02[i2 << 1])) {
                i++;
            }
        }
        dataOutput.writeInt(i);
        for (int i3 = 0; i3 < size; i3++) {
            Class cls = (Class) r6.A02[i3 << 1];
            if (r82.A08(cls)) {
                C02950Dn r2 = (C02950Dn) r6.A02[(i3 << 1) + 1];
                dataOutput.writeLong(r2.A00());
                r2.A01(r82.A04(cls), dataOutput);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A02(AnonymousClass0DW r7, DataInput dataInput) {
        AnonymousClass0A6 r72 = (AnonymousClass0A6) r7;
        C002000x r5 = r72.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            r72.A07((Class) r5.A02[i << 1], false);
        }
        int readInt = dataInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            long readLong = dataInput.readLong();
            C002000x r0 = this.A01;
            Long valueOf = Long.valueOf(readLong);
            C02950Dn r2 = (C02950Dn) r0.get(valueOf);
            Class cls = (Class) this.A00.get(valueOf);
            if (r2 == null || cls == null || !r2.A02(r72.A04(cls), dataInput)) {
                return false;
            }
            r72.A07(cls, true);
        }
        return true;
    }

    public final void A03(C02950Dn r7, Class cls) {
        C002000x r5 = this.A00;
        long A002 = r7.A00();
        Long valueOf = Long.valueOf(A002);
        Class cls2 = (Class) r5.get(valueOf);
        if (cls2 == null || cls2 == cls) {
            this.A02.put(cls, r7);
            this.A01.put(valueOf, r7);
            r5.put(valueOf, cls);
            return;
        }
        StringBuilder sb = new StringBuilder("Serializers ");
        sb.append(cls2.getCanonicalName());
        sb.append(" and ");
        sb.append(cls.getCanonicalName());
        sb.append(" have a conflicting tag: `");
        sb.append(A002);
        sb.append("`.");
        throw new RuntimeException(sb.toString());
    }
}
