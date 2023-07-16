package X;

import com.facebook.forker.Process;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.0El  reason: invalid class name and case insensitive filesystem */
public final class C03130El implements C12280ld {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public C18120wD A03;
    public C11420kA A04;
    public IntBuffer A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass0WL A08;
    public final AnonymousClass0WL A09;
    public final C04560Oe A0A;

    public final synchronized void Cb5(int i, int i2, String str, int i3) {
        C11420kA r2;
        int A002 = A00(i, i2);
        if (!(A002 == -1 || (r2 = this.A04) == null)) {
            ByteBuffer byteBuffer = C11420kA.A04;
            byteBuffer.position(0);
            byteBuffer.putInt(i3);
            C11420kA.A00(r2, str, byteBuffer.array(), A002, 1);
        }
    }

    public final synchronized void Cb6(int i, int i2, String str, String str2) {
        C11420kA r2;
        int A002 = A00(i, i2);
        if (!(A002 == -1 || (r2 = this.A04) == null)) {
            if (str2 == null) {
                str2 = "null";
            }
            C11420kA.A00(r2, str, str2.getBytes(), A002, 0);
        }
    }

    public final synchronized void Cb8(int i, int i2) {
        C18120wD r0 = this.A03;
        if (r0 != null) {
            r0.A01(i, i2);
            A01(i, i2);
        }
    }

    public final void Cb9(int i, int i2, String str) {
    }

    public final synchronized void CbA(int i, int i2, boolean z) {
        C18120wD r3 = this.A03;
        if (r3 != null) {
            int i3 = this.A02 + 1;
            this.A02 = i3;
            if ((1879048192 & i3) != 0) {
                this.A02 = 1;
                i3 = 1;
            }
            if (z) {
                i3 |= Process.WAIT_RESULT_TIMEOUT;
            }
            r3.A03(i, i2, i3);
            A02(i, i2, z);
        }
    }

    public final synchronized void CbB() {
        AnonymousClass0WL r1;
        C18120wD r6 = this.A03;
        if (r6 != null) {
            IntBuffer intBuffer = r6.A01;
            intBuffer.position(0);
            int i = 0;
            do {
                int i2 = 0;
                while (true) {
                    int i3 = r6.A00;
                    if (i2 >= i3) {
                        break;
                    }
                    int i4 = intBuffer.get();
                    intBuffer.get();
                    int i5 = intBuffer.get();
                    if (!(i4 == 0 || i5 == 0 || (i5 & Process.WAIT_RESULT_TIMEOUT) == 0)) {
                        int position = intBuffer.position();
                        intBuffer.position(((i * i3) + i2) * 3);
                        intBuffer.put(C18120wD.A02);
                        intBuffer.position(position);
                    }
                    i2++;
                }
                i++;
            } while (i < 2);
            if (!(this.A08 == null || (r1 = this.A09) == null)) {
                this.A01 = 0;
                r1.A00 = 0;
                IntBuffer intBuffer2 = this.A05;
                if (intBuffer2 != null) {
                    intBuffer2.put(2, this.A00);
                }
            }
        }
    }

    public final synchronized void CbC(int i, int i2, boolean z) {
        C18120wD r0 = this.A03;
        if (r0 != null) {
            int A012 = r0.A01(i, i2);
            if (A012 != 0) {
                int i3 = A012 & 268435455;
                int i4 = (A012 & 1879048192) >>> 28;
                C18120wD r1 = this.A03;
                int i5 = i3 | (i4 << 28);
                if (z) {
                    i5 |= Process.WAIT_RESULT_TIMEOUT;
                }
                r1.A03(i, i2, i5);
            }
            A01(i, i2);
            A02(i, i2, z);
        }
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
    }

    private int A00(int i, int i2) {
        int i3;
        C18120wD r5 = this.A03;
        int i4 = -1;
        if (r5 != null) {
            int i5 = 0;
            while (true) {
                int A022 = r5.A02(i, i2, i5);
                IntBuffer intBuffer = r5.A01;
                intBuffer.position(((r5.A00 * i5) + A022) * 3);
                int i6 = intBuffer.get();
                int i7 = intBuffer.get();
                if (i != i6 || i2 != i7) {
                    i5++;
                    if (i5 >= 2) {
                        break;
                    }
                } else {
                    int i8 = intBuffer.get();
                    if (i8 != 0 && (i3 = (1879048192 & i8) >>> 28) < 5) {
                        i4 = i8 & 268435455;
                        boolean z = false;
                        if ((i8 & Process.WAIT_RESULT_TIMEOUT) != 0) {
                            z = true;
                        }
                        C18120wD r1 = this.A03;
                        int i9 = ((i3 + 1) << 28) | i4;
                        if (z) {
                            i9 |= Process.WAIT_RESULT_TIMEOUT;
                        }
                        r1.A03(i, i2, i9);
                    }
                }
            }
        }
        return i4;
    }

    private void A01(int i, int i2) {
        AnonymousClass0WL r0;
        AnonymousClass0WL r1 = this.A08;
        if (r1 != null && (r0 = this.A09) != null) {
            if (r0.A01(i, i2)) {
                this.A01--;
            }
            if (r1.A01(i, i2)) {
                this.A00--;
            }
            IntBuffer intBuffer = this.A05;
            if (intBuffer != null) {
                intBuffer.put(2, this.A00 + this.A01);
            }
        }
    }

    private void A02(int i, int i2, boolean z) {
        AnonymousClass0WL r1;
        AnonymousClass0WL r2 = this.A08;
        if (r2 != null && (r1 = this.A09) != null) {
            if (z) {
                this.A01++;
                r1.A00(i, i2);
            } else {
                this.A00++;
                r2.A00(i, i2);
            }
            IntBuffer intBuffer = this.A05;
            if (intBuffer != null) {
                intBuffer.put(2, this.A00 + this.A01);
            }
        }
    }

    public C03130El(C04560Oe r2, int i, int i2, boolean z) {
        AnonymousClass0WL r0;
        this.A07 = ((i << 1) * 3) << 2;
        this.A06 = i2;
        this.A0A = r2;
        if (z) {
            this.A09 = new AnonymousClass0WL();
            r0 = new AnonymousClass0WL();
        } else {
            r0 = null;
        }
        this.A08 = r0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x006f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0067=Splitter:B:15:0x0067, B:20:0x006f=Splitter:B:20:0x006f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BQL(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r2 = r13.getAbsolutePath()
            java.lang.String r1 = "/"
            java.lang.String r0 = "qpl_v2_"
            java.lang.String r6 = X.AnonymousClass00U.A0d(r2, r1, r0, r14)
            r5 = r12
            monitor-enter(r5)
            r4 = 16
            int r3 = r12.A07     // Catch:{ all -> 0x0072 }
            int r2 = r3 + 16
            java.lang.String r1 = "rw"
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0070 }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x0070 }
            r1 = 2
            r0.writeInt(r1)     // Catch:{ all -> 0x006b }
            r0.writeInt(r2)     // Catch:{ all -> 0x006b }
            r1 = -1
            r0.writeInt(r1)     // Catch:{ all -> 0x006b }
            r0.writeInt(r1)     // Catch:{ all -> 0x006b }
            java.nio.channels.FileChannel r6 = r0.getChannel()     // Catch:{ all -> 0x006b }
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x006b }
            r8 = 0
            r10 = 16
            java.nio.MappedByteBuffer r1 = r6.map(r7, r8, r10)     // Catch:{ all -> 0x006b }
            java.nio.IntBuffer r1 = r1.asIntBuffer()     // Catch:{ all -> 0x006b }
            r12.A05 = r1     // Catch:{ all -> 0x006b }
            if (r3 <= 0) goto L_0x0050
            java.nio.channels.FileChannel r6 = r0.getChannel()     // Catch:{ all -> 0x006b }
            long r8 = (long) r4     // Catch:{ all -> 0x006b }
            long r10 = (long) r3     // Catch:{ all -> 0x006b }
            java.nio.MappedByteBuffer r3 = r6.map(r7, r8, r10)     // Catch:{ all -> 0x006b }
            X.0wD r1 = new X.0wD     // Catch:{ all -> 0x006b }
            r1.<init>(r3)     // Catch:{ all -> 0x006b }
            r12.A03 = r1     // Catch:{ all -> 0x006b }
        L_0x0050:
            int r3 = r12.A06     // Catch:{ all -> 0x006b }
            r1 = 12
            if (r3 <= r1) goto L_0x0067
            java.nio.channels.FileChannel r6 = r0.getChannel()     // Catch:{ all -> 0x006b }
            long r8 = (long) r2     // Catch:{ all -> 0x006b }
            long r10 = (long) r3     // Catch:{ all -> 0x006b }
            java.nio.MappedByteBuffer r2 = r6.map(r7, r8, r10)     // Catch:{ all -> 0x006b }
            X.0kA r1 = new X.0kA     // Catch:{ all -> 0x006b }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x006b }
            r12.A04 = r1     // Catch:{ all -> 0x006b }
        L_0x0067:
            r0.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0070
        L_0x006b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x006f }
        L_0x006f:
            throw r1     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            monitor-exit(r5)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03130El.BQL(java.io.File, java.lang.String):void");
    }

    public final void Cb7(int i, int i2) {
        Cb8(i, i2);
    }
}
