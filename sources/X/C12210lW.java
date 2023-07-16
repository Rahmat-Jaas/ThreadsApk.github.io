package X;

import java.io.ObjectOutputStream;

/* renamed from: X.0lW  reason: invalid class name and case insensitive filesystem */
public final class C12210lW extends C17960vq {
    public final C17970vr A00;

    public final void A03(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeByte(1);
        C17970vr r1 = this.A00;
        objectOutputStream.writeInt(r1.A00);
        C17970vr.A02(r1.A03, objectOutputStream);
        C17970vr.A02(r1.A02, objectOutputStream);
        C17970vr.A02(r1.A01, objectOutputStream);
    }

    public final int A01() {
        C17970vr r2 = this.A00;
        C04730Ow r0 = r2.A03;
        int i = 1;
        if (r0 != null) {
            i = 1 + r0.size();
        }
        C04730Ow r02 = r2.A02;
        if (r02 != null) {
            return i + r02.size();
        }
        return i;
    }

    public final long A02(int i) {
        C04730Ow r1;
        int i2;
        C17970vr r3 = this.A00;
        C04730Ow r0 = r3.A02;
        if ((r0 == null || (i2 = r0.get(i, -1)) == -1) && ((r1 = r3.A03) == null || (i2 = r1.get((short) (i >> 16), -1)) == -1)) {
            i2 = r3.A00;
        }
        return (long) i2;
    }

    public C12210lW(C17970vr r1) {
        this.A00 = r1;
    }
}
