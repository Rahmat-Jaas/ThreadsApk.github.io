package X;

import android.os.SystemClock;
import android.util.Base64;
import java.nio.MappedByteBuffer;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: X.0Nu  reason: invalid class name and case insensitive filesystem */
public final class C04470Nu {
    public int A00 = -1;
    public int A01;
    public boolean A02;
    public byte A03;
    public int A04;
    public boolean A05 = false;
    public final int A06;
    public final int A07;
    public final C04440Nq A08;
    public final MappedByteBuffer A09;
    public final byte[] A0A;
    public final byte[] A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final byte A0E;
    public final int A0F;
    public final LinkedList A0G;
    public final boolean A0H;
    public final boolean A0I;

    private synchronized void A06(Object obj, LinkedList linkedList) {
        if (linkedList.size() >= this.A0F) {
            linkedList.remove();
        }
        linkedList.add(obj);
        this.A04++;
    }

    private boolean A09(byte[] bArr, int i, boolean z) {
        boolean z2 = false;
        if (i != 0) {
            A01();
            MappedByteBuffer mappedByteBuffer = this.A09;
            int position = mappedByteBuffer.position() + i;
            int i2 = this.A06;
            if (position >= i2) {
                boolean A082 = A08(z);
                int position2 = i2 - mappedByteBuffer.position();
                mappedByteBuffer.put(bArr, 0, position2);
                mappedByteBuffer.position(this.A07);
                mappedByteBuffer.put(bArr, position2, i - position2);
                z2 = A082;
            } else {
                mappedByteBuffer.put(bArr, 0, i);
            }
            if (this.A01 == 0) {
                this.A01 = this.A07;
            }
        }
        return z2;
    }

    public final synchronized int A0A(StringBuilder sb) {
        LinkedList linkedList = this.A0G;
        if (linkedList != null) {
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                if (next != null) {
                    sb.append(next);
                    sb.append(10);
                }
            }
        }
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r1 != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(int r15) {
        /*
            r14 = this;
            int r12 = r14.A01
            if (r12 != 0) goto L_0x0074
            int r12 = r14.A06
            java.nio.MappedByteBuffer r2 = r14.A09
            int r0 = r2.position()
            int r12 = r12 - r0
        L_0x000d:
            int[] r5 = r14.A0D
            r0 = 1
            int r15 = r15 - r0
            r13 = r5[r15]
            byte[] r6 = r14.A0B
            int r4 = r6.length
            int r13 = r13 + r4
            byte[] r0 = r14.A0A
            int r3 = r0.length
            int r13 = r13 + r3
            r10 = 0
            r1 = 0
        L_0x001d:
            if (r13 <= r12) goto L_0x009c
            int r0 = r14.A01
            r11 = 0
            if (r0 == 0) goto L_0x008c
            int r9 = r2.position()
            int r0 = r14.A01
            r2.position(r0)
            r8 = 0
        L_0x002e:
            if (r8 >= r4) goto L_0x006f
            byte r7 = r2.get()
            if (r8 != 0) goto L_0x005b
            if (r7 != 0) goto L_0x005b
        L_0x0038:
            r2.position(r9)
            if (r11 <= 0) goto L_0x008c
            int r0 = r5.length
            byte r0 = (byte) r0
            if (r11 > r0) goto L_0x008c
            int r0 = r11 + -1
            r0 = r5[r0]
            int r0 = r0 + r4
            int r0 = r0 + r3
            int r12 = r12 + r0
            int r1 = r14.A01
            int r1 = r1 + r0
            r14.A01 = r1
            int r0 = r14.A06
            if (r1 < r0) goto L_0x0059
            int r1 = r1 - r0
            r14.A01 = r1
            int r0 = r14.A07
            int r1 = r1 + r0
            r14.A01 = r1
        L_0x0059:
            r1 = 1
            goto L_0x001d
        L_0x005b:
            int r1 = r2.position()
            int r0 = r14.A06
            if (r1 < r0) goto L_0x0068
            int r0 = r14.A07
            r2.position(r0)
        L_0x0068:
            byte r0 = r6[r8]
            if (r7 != r0) goto L_0x0084
            int r8 = r8 + 1
            goto L_0x002e
        L_0x006f:
            byte r11 = r2.get()
            goto L_0x0038
        L_0x0074:
            java.nio.MappedByteBuffer r2 = r14.A09
            int r0 = r2.position()
            int r12 = r12 - r0
            if (r12 >= 0) goto L_0x000d
            int r1 = r14.A06
            int r0 = r14.A07
            int r1 = r1 - r0
            int r12 = r12 + r1
            goto L_0x000d
        L_0x0084:
            java.lang.String r1 = "Invalid start record marker"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            java.lang.String r8 = "Invalid type for next record: "
            java.lang.String r9 = " space: "
            java.lang.String r10 = " size: "
            java.lang.String r1 = X.AnonymousClass00U.A0b(r8, r9, r10, r11, r12, r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x009c:
            if (r1 == 0) goto L_0x00a0
            int r10 = r12 - r13
        L_0x00a0:
            int r0 = r14.A01
            if (r0 == 0) goto L_0x00aa
            if (r1 == 0) goto L_0x00a9
        L_0x00a6:
            r14.A02()
        L_0x00a9:
            return r10
        L_0x00aa:
            int r0 = r14.A07
            r14.A01 = r0
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04470Nu.A00(int):int");
    }

    private void A01() {
        int position = this.A09.position();
        if (position < this.A07) {
            throw new IllegalStateException("Writing on header");
        } else if (position >= this.A06) {
            throw new IllegalStateException("Wrote past buffer end");
        }
    }

    /* JADX INFO: finally extract failed */
    private void A02() {
        MappedByteBuffer mappedByteBuffer = this.A09;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(2);
            if (this.A0H) {
                mappedByteBuffer.putShort((short) this.A01);
            } else {
                mappedByteBuffer.putInt(this.A01);
            }
            mappedByteBuffer.position(position);
        } catch (Throwable th) {
            mappedByteBuffer.position(position);
            throw th;
        }
    }

    public static void A03(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void A04(long j, byte[] bArr, int i) {
        bArr[i] = (byte) ((int) (j >>> 56));
        bArr[i + 1] = (byte) ((int) (j >>> 48));
        bArr[i + 2] = (byte) ((int) (j >>> 40));
        bArr[i + 3] = (byte) ((int) (j >>> 32));
        bArr[i + 4] = (byte) ((int) (j >>> 24));
        bArr[i + 5] = (byte) ((int) (j >>> 16));
        bArr[i + 6] = (byte) ((int) (j >>> 8));
        bArr[i + 7] = (byte) ((int) j);
    }

    public static void A05(C04470Nu r1) {
        if (!r1.A05) {
            throw new IllegalStateException("Buffer not initialized before write");
        }
    }

    public static void A07(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    /* JADX INFO: finally extract failed */
    private boolean A08(boolean z) {
        if (!z || this.A03 >= Byte.MAX_VALUE) {
            return false;
        }
        MappedByteBuffer mappedByteBuffer = this.A09;
        int position = mappedByteBuffer.position();
        this.A03 = (byte) (this.A03 + 1);
        try {
            mappedByteBuffer.position(1);
            mappedByteBuffer.put(this.A03);
            mappedByteBuffer.position(position);
            return true;
        } catch (Throwable th) {
            mappedByteBuffer.position(position);
            throw th;
        }
    }

    public final long A0B() {
        MappedByteBuffer mappedByteBuffer = this.A09;
        mappedByteBuffer.position(0);
        mappedByteBuffer.put(this.A0E);
        mappedByteBuffer.put((byte) 0);
        boolean z = this.A0H;
        int i = this.A07;
        if (z) {
            mappedByteBuffer.putShort((short) i);
        } else {
            mappedByteBuffer.putInt(i);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        mappedByteBuffer.putLong(uptimeMillis);
        C04440Nq r7 = this.A08;
        if (r7 != null) {
            for (int i2 = 0; i2 < r7.AyA(); i2++) {
                int BCL = r7.BCL(i2);
                if (BCL == 1) {
                    mappedByteBuffer.put(r7.AUm(i2));
                } else if (BCL == 2) {
                    mappedByteBuffer.putShort(r7.BB3(i2));
                } else if (BCL == 4) {
                    mappedByteBuffer.putInt(r7.ApQ(i2));
                } else if (BCL == 8) {
                    mappedByteBuffer.putLong(r7.At5(i2));
                } else {
                    throw new IllegalArgumentException(AnonymousClass00U.A0J("Invalid field size: ", BCL));
                }
            }
        }
        mappedByteBuffer.put(new byte[(this.A06 - i)]);
        mappedByteBuffer.position(i);
        this.A05 = true;
        return uptimeMillis;
    }

    public final String A0C() {
        MappedByteBuffer mappedByteBuffer = this.A09;
        int position = mappedByteBuffer.position();
        mappedByteBuffer.position(0);
        byte[] bArr = new byte[this.A06];
        mappedByteBuffer.get(bArr);
        mappedByteBuffer.position(position);
        return Base64.encodeToString(bArr, 2);
    }

    public final void A0E() {
        MappedByteBuffer mappedByteBuffer = this.A09;
        int i = this.A07;
        mappedByteBuffer.position(i);
        for (int i2 = i; i2 < this.A06; i2++) {
            mappedByteBuffer.put((byte) 0);
        }
        mappedByteBuffer.position(2);
        if (this.A0H) {
            mappedByteBuffer.putShort((short) i);
        } else {
            mappedByteBuffer.putInt(i);
        }
        mappedByteBuffer.position(i);
        this.A01 = 0;
        LinkedList linkedList = this.A0G;
        if (linkedList != null) {
            A06(new AnonymousClass0Nt(), linkedList);
        }
    }

    public final void A0I(StringBuilder sb) {
        sb.append("Read position: ");
        sb.append(this.A01);
        sb.append(" cycle counter: ");
        sb.append(this.A03);
        sb.append(" write position: ");
        sb.append(this.A09.position());
        sb.append(" last record start: ");
        sb.append(this.A00);
        sb.append(" last cycled: ");
        sb.append(this.A02);
    }

    public C04470Nu(C04440Nq r9, MappedByteBuffer mappedByteBuffer, int[] iArr, byte b, int i, int i2, boolean z) {
        int i3;
        int i4;
        LinkedList linkedList;
        if (i > 0) {
            this.A0H = i <= 32767;
            this.A09 = mappedByteBuffer;
            this.A06 = i;
            this.A08 = r9;
            if (r9 != null) {
                i3 = r9.AyA();
                i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    i4 += this.A08.BCL(i5);
                }
                if (i4 > i) {
                    throw new IllegalArgumentException("Header size too big");
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            this.A0C = new int[i3];
            int i6 = (this.A0H ? 2 : 4) + 10;
            if (this.A08 != null) {
                int i7 = i6;
                for (int i8 = 0; i8 < i3; i8++) {
                    if (i8 > 0) {
                        i7 += this.A08.BCL(i8 - 1);
                    }
                    this.A0C[i8] = i7;
                }
            }
            this.A0E = b;
            int i9 = i4 + i6;
            this.A07 = i9;
            if (r3 < 127) {
                this.A0D = iArr;
                int i10 = 0;
                for (int i11 : iArr) {
                    if (i11 > i10) {
                        i10 = i11;
                    }
                }
                if (i10 <= this.A06 - i9) {
                    this.A0I = z;
                    this.A0B = new byte[0];
                    this.A0A = new byte[0];
                    this.A0F = i2;
                    if (i2 > 0) {
                        linkedList = new LinkedList();
                    } else {
                        linkedList = null;
                    }
                    this.A0G = linkedList;
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass00U.A0S("Record size of ", " too big", i10));
            }
            throw new IllegalArgumentException("Too many record types");
        }
        throw new IllegalArgumentException("Invalid buffer size");
    }

    public final void A0D() {
        IllegalStateException th;
        A05(this);
        int i = this.A00;
        if (i != -1) {
            int i2 = this.A06;
            MappedByteBuffer mappedByteBuffer = this.A09;
            if (i >= i2) {
                mappedByteBuffer.position(this.A07);
            } else {
                mappedByteBuffer.position(i);
            }
            try {
                mappedByteBuffer.put((byte) 0);
                if (this.A02) {
                    this.A03 = (byte) (this.A03 - 1);
                    mappedByteBuffer.position(1);
                    mappedByteBuffer.put(this.A03);
                    this.A02 = false;
                }
                mappedByteBuffer.position(this.A00);
                if (this.A00 == this.A07 && this.A03 == 0) {
                    this.A01 = 0;
                    A02();
                }
                this.A00 = -1;
                LinkedList linkedList = this.A0G;
                if (linkedList != null) {
                    A06(new C04460Ns(i), linkedList);
                }
            } catch (Throwable th2) {
                th = th2;
                mappedByteBuffer.position(this.A00);
                if (this.A00 == this.A07 && this.A03 == 0) {
                    this.A01 = 0;
                    A02();
                    throw th;
                }
            }
        } else {
            th = new IllegalStateException("Cannot remove");
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0F(byte b, int i) {
        A05(this);
        int i2 = this.A0C[i];
        MappedByteBuffer mappedByteBuffer = this.A09;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(i2);
            mappedByteBuffer.put(b);
            mappedByteBuffer.position(position);
        } catch (Throwable th) {
            mappedByteBuffer.position(position);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0G(int i, long j) {
        A05(this);
        int i2 = this.A0C[i];
        MappedByteBuffer mappedByteBuffer = this.A09;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(i2);
            mappedByteBuffer.putLong(j);
            mappedByteBuffer.position(position);
        } catch (Throwable th) {
            mappedByteBuffer.position(position);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r1 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r1 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r2 != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r2 >= r8) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r0 = r11[r2];
        A01();
        r5.put(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r5.position() < r3) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r1 = A08(true);
        r5.position(r9.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        if (r1 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r0 = r7;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r0 == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        r1 = r9.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (A09(r1, r1.length, true) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        if (r7 != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r4 <= 0) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r2 = r5.position();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        A01();
        r5.put((byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        if (r5.position() < r3) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        r0 = r9.A07;
        r5.position(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d9, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00db, code lost:
        if (r1 < r4) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dd, code lost:
        r5.position(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e2, code lost:
        r5.position(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(int r10, byte... r11) {
        /*
            r9 = this;
            A05(r9)
            boolean r2 = r9.A0I
            int[] r1 = r9.A0D
            int r0 = r10 + -1
            r8 = r1[r0]
            r6 = 1
            int r8 = r8 - r6
            int r0 = r11.length
            if (r2 == 0) goto L_0x005d
            if (r0 < r8) goto L_0x00eb
            java.nio.MappedByteBuffer r5 = r9.A09
            int r0 = r5.position()
            r9.A00 = r0
            int r4 = r9.A00(r10)
            byte[] r1 = r9.A0B
            int r0 = r1.length
            boolean r2 = r9.A09(r1, r0, r6)
            byte[] r1 = new byte[r6]
            byte r0 = (byte) r10
            r3 = 0
            r1[r3] = r0
            boolean r0 = r9.A09(r1, r6, r6)
            if (r0 != 0) goto L_0x0034
            r1 = 0
            if (r2 == 0) goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            boolean r0 = r9.A09(r11, r8, r6)
            if (r0 != 0) goto L_0x003e
            r2 = 0
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            byte[] r1 = r9.A0A
            int r0 = r1.length
            boolean r0 = r9.A09(r1, r0, r6)
            if (r0 != 0) goto L_0x004b
            if (r2 != 0) goto L_0x004b
            r6 = 0
        L_0x004b:
            if (r4 <= 0) goto L_0x00e9
            int r1 = r5.position()
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x0058 }
            r9.A09(r0, r4, r3)     // Catch:{ all -> 0x0058 }
            goto L_0x00e6
        L_0x0058:
            r0 = move-exception
            r5.position(r1)
            throw r0
        L_0x005d:
            if (r0 < r8) goto L_0x00eb
            java.nio.MappedByteBuffer r5 = r9.A09
            int r0 = r5.position()
            r9.A00 = r0
            int r4 = r9.A00(r10)
            byte[] r1 = r9.A0B
            int r0 = r1.length
            boolean r2 = r9.A09(r1, r0, r6)
            byte r0 = (byte) r10
            r9.A01()
            r5.put(r0)
            int r0 = r5.position()
            int r3 = r9.A06
            if (r0 < r3) goto L_0x008c
            boolean r1 = r9.A08(r6)
            int r0 = r9.A07
            r5.position(r0)
            if (r1 != 0) goto L_0x008f
        L_0x008c:
            r7 = 0
            if (r2 == 0) goto L_0x0090
        L_0x008f:
            r7 = 1
        L_0x0090:
            r2 = 0
        L_0x0091:
            if (r2 >= r8) goto L_0x00b4
            byte r0 = r11[r2]
            r9.A01()
            r5.put(r0)
            int r0 = r5.position()
            if (r0 < r3) goto L_0x00ac
            boolean r1 = r9.A08(r6)
            int r0 = r9.A07
            r5.position(r0)
            if (r1 != 0) goto L_0x00b0
        L_0x00ac:
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x00b1
        L_0x00b0:
            r7 = 1
        L_0x00b1:
            int r2 = r2 + 1
            goto L_0x0091
        L_0x00b4:
            byte[] r1 = r9.A0A
            int r0 = r1.length
            boolean r0 = r9.A09(r1, r0, r6)
            if (r0 != 0) goto L_0x00c0
            if (r7 != 0) goto L_0x00c0
            r6 = 0
        L_0x00c0:
            if (r4 <= 0) goto L_0x00e9
            int r2 = r5.position()
            r1 = 0
        L_0x00c7:
            r0 = 0
            r9.A01()     // Catch:{ all -> 0x00e1 }
            r5.put(r0)     // Catch:{ all -> 0x00e1 }
            int r0 = r5.position()     // Catch:{ all -> 0x00e1 }
            if (r0 < r3) goto L_0x00d9
            int r0 = r9.A07     // Catch:{ all -> 0x00e1 }
            r5.position(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00d9:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x00c7
            r5.position(r2)
            goto L_0x00e9
        L_0x00e1:
            r0 = move-exception
            r5.position(r2)
            throw r0
        L_0x00e6:
            r5.position(r1)
        L_0x00e9:
            r9.A02 = r6
        L_0x00eb:
            java.util.LinkedList r1 = r9.A0G
            if (r1 == 0) goto L_0x00f7
            X.0Nr r0 = new X.0Nr
            r0.<init>(r10)
            r9.A06(r0, r1)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04470Nu.A0H(int, byte[]):void");
    }
}
