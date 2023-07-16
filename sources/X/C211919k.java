package X;

import com.facebook.redex.IDxProviderShape244S0100000_1_I2;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/* renamed from: X.19k  reason: invalid class name and case insensitive filesystem */
public class C211919k extends C67693zz implements C07810cE {
    public AnonymousClass32L A00;
    public AnonymousClass32L A01;
    public final C211419b A02;
    public final C04560Oe A03;
    public final AnonymousClass3Iv A04;

    public static int A01(M4c m4c, int i, int i2) {
        return m4c.A01.getInt(m4c.A05(i) + (i2 << 2));
    }

    public double A03(double d, long j, boolean z) {
        int i;
        C211419b r4 = this.A02;
        if (r4 != null && C18190wL.A01(j) == 4) {
            int i2 = (int) (j & 65535);
            try {
                int i3 = r4.A02;
                if (i3 != 0) {
                    i = A01(r4, i3, i2);
                } else {
                    i = 0;
                }
                if (!z && (((byte) i) & 6) != 0) {
                    A08(AnonymousClass0TF.AUTO_EXPOSURE, i);
                }
                if (AnonymousClass3QX.A00(i) != AnonymousClass0TN.SERVER) {
                    return d;
                }
                int i4 = r4.A03;
                if (i4 != 0) {
                    return r4.A01.getDouble(r4.A05(i4) + (i2 << 3));
                }
                return 0.0d;
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            }
        }
        return d;
    }

    public long A04(long j, long j2, boolean z) {
        int i;
        C211419b r4 = this.A02;
        if (r4 != null && C18190wL.A01(j) == 2) {
            int i2 = (int) (j & 65535);
            try {
                int i3 = r4.A05;
                if (i3 != 0) {
                    i = A01(r4, i3, i2);
                } else {
                    i = 0;
                }
                if (!z && (((byte) i) & 6) != 0) {
                    A08(AnonymousClass0TF.AUTO_EXPOSURE, i);
                }
                if (AnonymousClass3QX.A00(i) != AnonymousClass0TN.SERVER) {
                    return j2;
                }
                int i4 = r4.A06;
                if (i4 != 0) {
                    return r4.A01.getLong(r4.A05(i4) + (i2 << 3));
                }
                return 0;
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            }
        }
        return j2;
    }

    public AnonymousClass0TO A05(long j) {
        AnonymousClass0TN r1;
        if (this.A02 != null) {
            r1 = AnonymousClass3QX.A00(A00(j));
            if (r1 != AnonymousClass0TN.DEFAULT__MISSING_SERVER_VALUE) {
                B7Z();
            }
        } else {
            r1 = AnonymousClass0TN.DEFAULT__NO_DATA_ON_DISK;
        }
        return new AnonymousClass0TO(r1);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: IndexOutOfBoundsException | BufferUnderflowException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:17:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(java.lang.String r5, long r6, boolean r8) {
        /*
            r4 = this;
            X.19b r2 = r4.A02
            if (r2 == 0) goto L_0x004b
            int r1 = X.C18190wL.A01(r6)
            r0 = 3
            if (r1 != r0) goto L_0x004b
            r0 = 65535(0xffff, double:3.23786E-319)
            long r6 = r6 & r0
            int r3 = (int) r6
            int r0 = r2.A07     // Catch:{  }
            if (r0 == 0) goto L_0x0019
            int r1 = A01(r2, r0, r3)     // Catch:{  }
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r8 != 0) goto L_0x002a
            byte r0 = (byte) r1
            r0 = r0 & 6
            boolean r0 = X.C18180wK.A1V(r0)
            if (r0 == 0) goto L_0x002a
            X.0TF r0 = X.AnonymousClass0TF.AUTO_EXPOSURE
            r4.A08(r0, r1)
        L_0x002a:
            X.0TN r1 = X.AnonymousClass3QX.A00(r1)
            X.0TN r0 = X.AnonymousClass0TN.SERVER
            boolean r0 = X.C18240wQ.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0037
            return r5
        L_0x0037:
            int r0 = r2.A08     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b }
            if (r0 == 0) goto L_0x0047
            int r1 = r2.A05(r0)     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b }
            int r0 = r3 << 2
            int r1 = r1 + r0
            java.lang.String r0 = r2.A07(r1)     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b, IndexOutOfBoundsException | BufferUnderflowException -> 0x004b }
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 == 0) goto L_0x004b
            return r0
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211919k.A06(java.lang.String, long, boolean):java.lang.String");
    }

    public boolean A07(long j, boolean z, boolean z2) {
        byte b;
        C211419b r4 = this.A02;
        if (r4 == null || C18190wL.A01(j) != 1) {
            return z;
        }
        int i = (int) (j & 65535);
        try {
            int i2 = r4.A01;
            if (i2 != 0) {
                b = r4.A01.get(r4.A05(i2) + i);
            } else {
                b = 0;
            }
            if (!z2 && (b & 6) != 0) {
                int i3 = AnonymousClass3QX.A00;
                try {
                    int i4 = r4.A00;
                    if (i4 != 0) {
                        i3 = A01(r4, i4, i);
                    } else {
                        i3 = 0;
                    }
                } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
                }
                A08(AnonymousClass0TF.AUTO_EXPOSURE, i3);
            }
            if (AnonymousClass3QX.A00(b) == AnonymousClass0TN.SERVER) {
                return C18180wK.A1V(b >>> 7);
            }
            return z;
        } catch (IndexOutOfBoundsException | BufferUnderflowException unused2) {
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: IndexOutOfBoundsException | BufferUnderflowException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass0TF r7, int r8) {
        /*
            r6 = this;
            X.3Iv r3 = r6.A04
            X.19b r5 = r6.A02
            if (r5 == 0) goto L_0x004c
            byte r0 = (byte) r8
            r0 = r0 & 6
            if (r0 == 0) goto L_0x004c
            r4 = 1
            int r2 = r8 >>> 8
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            X.0TF r0 = X.AnonymousClass0TF.AUTO_EXPOSURE
            if (r7 != r0) goto L_0x0019
            X.32L r0 = r6.A00
            goto L_0x001b
        L_0x0019:
            X.32L r0 = r6.A01
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerArray r1 = r0.A00     // Catch:{  }
            r0 = 0
            boolean r0 = r1.compareAndSet(r2, r0, r4)     // Catch:{  }
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            int r0 = r5.A04     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c }
            if (r0 == 0) goto L_0x004c
            int r1 = r5.A05(r0)     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c }
            int r0 = r2 << 2
            int r1 = r1 + r0
            java.lang.String r2 = r5.A07(r1)     // Catch:{ IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c, IndexOutOfBoundsException | BufferUnderflowException -> 0x004c }
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x004c
            r0 = r8 & 8
            if (r0 == 0) goto L_0x004d
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r0)
        L_0x0047:
            java.lang.String r0 = r7.A00
            r3.logExposure(r2, r0, r1)
        L_0x004c:
            return
        L_0x004d:
            java.lang.String r1 = ""
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211919k.A08(X.0TF, int):void");
    }

    public final Map AfP() {
        if (this instanceof C211819j) {
            return null;
        }
        C211419b r0 = this.A02;
        if (r0 == null) {
            return AnonymousClass0wJ.A0y();
        }
        return r0.A09;
    }

    public String Asv(long j) {
        C211419b r4 = this.A02;
        if (r4 == null) {
            return null;
        }
        int A002 = A00(j);
        int i = -1;
        if (C18180wK.A1V(((byte) A002) & 6)) {
            i = (A002 >>> 8) & 16777215;
        }
        if (i < 0) {
            return null;
        }
        try {
            int i2 = r4.A04;
            if (i2 != 0) {
                return r4.A07(r4.A05(i2) + (i << 2));
            }
            return null;
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | OutOfMemoryError | BufferUnderflowException unused) {
            return null;
        }
    }

    public int Asz(long j) {
        if (this.A02 == null) {
            return 0;
        }
        int A002 = A00(j);
        int i = (A002 & 6) >>> 1;
        if ((A002 & 8) != 0) {
            return i | 128;
        }
        return i;
    }

    public void Bc8(AnonymousClass0TF r3, long j) {
        if (this.A02 != null) {
            int A002 = A00(j);
            if ((((byte) A002) & 6) != 0) {
                A08(r3, A002);
            }
        }
    }

    public C211919k(AnonymousClass3Iv r13, AnonymousClass0TK r14, C84594tV r15, ByteBuffer byteBuffer) {
        super(r14, r15);
        C211419b r6;
        AnonymousClass32L r0;
        int A042;
        int i;
        int i2;
        short s;
        short s2;
        int A043;
        this.A04 = r13;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer == null || byteBuffer2.capacity() <= 0) {
            r6 = null;
        } else {
            C211419b r9 = new C211419b();
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            r9.A00 = byteBuffer2.getInt(byteBuffer2.position()) + byteBuffer2.position();
            r9.A01 = byteBuffer2;
            r6 = null;
            try {
                int A044 = r9.A04(28);
                if (A044 != 0 && r9.A01.getInt(A044 + r9.A00) == 123456 && (((A042 = r9.A04(34)) != 0 && r9.A01.getInt(A042 + r9.A00) == 123456) || (A043 = r9.A04(34)) == 0 || r9.A01.getInt(A043 + r9.A00) == 0)) {
                    r9.A01 = r9.A04(6);
                    r9.A00 = r9.A04(8);
                    r9.A06 = r9.A04(10);
                    r9.A05 = r9.A04(12);
                    r9.A04(14);
                    r9.A04(16);
                    r9.A03 = r9.A04(18);
                    r9.A02 = r9.A04(20);
                    r9.A08 = r9.A04(22);
                    r9.A07 = r9.A04(24);
                    r9.A04 = r9.A04(26);
                    int A045 = r9.A04(32);
                    if (A045 != 0) {
                        int A06 = r9.A06(A045);
                        if (A06 <= 65536) {
                            for (int i3 = 0; i3 < A06; i3++) {
                                int A046 = r9.A04(32);
                                if (A046 != 0) {
                                    int A05 = r9.A05(A046) + (i3 << 2);
                                    int i4 = A05 + r9.A01.getInt(A05);
                                    ByteBuffer byteBuffer3 = r9.A01;
                                    Map map = r9.A09;
                                    int i5 = i4 - byteBuffer3.getInt(i4);
                                    if (8 >= byteBuffer3.getShort(i5) || (s2 = byteBuffer3.getShort(i5 + 8)) == 0) {
                                        i = 0;
                                    } else {
                                        i = byteBuffer3.getInt(s2 + i4);
                                    }
                                    Integer valueOf = Integer.valueOf(i);
                                    int i6 = i4 - byteBuffer3.getInt(i4);
                                    if (6 >= byteBuffer3.getShort(i6) || (s = byteBuffer3.getShort(i6 + 6)) == 0) {
                                        i2 = 0;
                                    } else {
                                        i2 = byteBuffer3.getInt(s + i4);
                                    }
                                    map.put(valueOf, Integer.valueOf(i2));
                                }
                            }
                        }
                    }
                    r6 = r9;
                } else {
                    int A047 = r9.A04(28);
                    if (A047 != 0) {
                        r9.A01.getInt(A047 + r9.A00);
                    }
                    int A048 = r9.A04(34);
                    if (A048 != 0) {
                        r9.A01.getInt(A048 + r9.A00);
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        this.A02 = r6;
        int i7 = 0;
        if (r6 != null) {
            try {
                int A049 = r6.A04(26);
                if (A049 != 0) {
                    i7 = r6.A06(A049);
                }
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused2) {
                this.A00 = new AnonymousClass32L(0);
                r0 = new AnonymousClass32L(0);
            } catch (Throwable th) {
                this.A00 = new AnonymousClass32L(0);
                this.A01 = new AnonymousClass32L(0);
                throw th;
            }
        }
        this.A00 = new AnonymousClass32L(i7);
        r0 = new AnonymousClass32L(i7);
        this.A01 = r0;
        this.A03 = new AnonymousClass4UC(new IDxProviderShape244S0100000_1_I2(this, 0));
    }

    private int A00(long j) {
        int A012 = C18190wL.A01(j);
        int i = (int) (j & 65535);
        if (A012 == 0) {
            AnonymousClass0LU.A0B("MobileConfigContextV2Impl", String.format("Null type specifier is given: %d", C18240wQ.A1b(j)));
        } else if (A012 == 1) {
            C211419b r1 = this.A02;
            int i2 = r1.A00;
            if (i2 != 0) {
                return A01(r1, i2, i);
            }
            return 0;
        } else if (A012 == 2) {
            C211419b r12 = this.A02;
            int i3 = r12.A05;
            if (i3 != 0) {
                return A01(r12, i3, i);
            }
            return 0;
        } else if (A012 == 3) {
            C211419b r13 = this.A02;
            int i4 = r13.A07;
            if (i4 != 0) {
                return A01(r13, i4, i);
            }
            return 0;
        } else if (A012 == 4) {
            try {
                C211419b r14 = this.A02;
                int i5 = r14.A02;
                if (i5 != 0) {
                    return A01(r14, i5, i);
                }
                return 0;
            } catch (IndexOutOfBoundsException | BufferUnderflowException unused) {
            }
        }
        AnonymousClass0LU.A0B("MobileConfigContextV2Impl", String.format("Fail to get meta for spec: %d", C18240wQ.A1b(j)));
        return AnonymousClass3QX.A00;
    }
}
