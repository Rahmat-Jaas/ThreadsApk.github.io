package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.78w  reason: invalid class name */
public final class AnonymousClass78w {
    public static final Charset A05 = Charset.forName("UTF-8");
    public final String A00;
    public final ByteBuffer A01;
    public final C109336jq[] A02;
    public final AtomicReferenceArray A03;
    public final AtomicReferenceArray A04;

    public final C110036l1 A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A03;
        C110036l1 r4 = (C110036l1) atomicReferenceArray.get(i);
        if (r4 != null) {
            return r4;
        }
        int i2 = this.A02[0].A02 + (i << 4);
        ByteBuffer byteBuffer = this.A01;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        short s = byteBuffer.getShort(i2 + 8);
        byteBuffer.getShort(i2 + 10);
        C110036l1 r42 = new C110036l1(this, i3, i4, s);
        if (!atomicReferenceArray.compareAndSet(i, (Object) null, r42)) {
            return (C110036l1) atomicReferenceArray.get(i);
        }
        return r42;
    }

    public final Object A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A04;
        Object obj = atomicReferenceArray.get(i);
        if (obj == null) {
            int i2 = this.A02[1].A02 + (i << 4);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            byteBuffer.getInt(i2 + 8);
            byteBuffer.getInt();
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i3);
            duplicate.limit(i3 + i4);
            byte[] bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
            obj = new String(bArr, A05);
            if (!atomicReferenceArray.compareAndSet(i, (Object) null, obj)) {
                return atomicReferenceArray.get(i);
            }
        }
        return obj;
    }

    public AnonymousClass78w(String str, ByteBuffer byteBuffer, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, C109336jq[] r5) {
        this.A01 = byteBuffer;
        this.A02 = r5;
        this.A00 = str;
        this.A03 = atomicReferenceArray;
        this.A04 = atomicReferenceArray2;
    }
}
