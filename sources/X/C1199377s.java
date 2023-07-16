package X;

import java.nio.ByteBuffer;

/* renamed from: X.77s  reason: invalid class name and case insensitive filesystem */
public class C1199377s {
    public static final ThreadLocal A02 = new C1375188w();
    public static final ThreadLocal A03 = new ThreadLocal();
    public static final ThreadLocal A04 = new C1375088v();
    public int A00;
    public ByteBuffer A01;

    public final int A00(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }
}
