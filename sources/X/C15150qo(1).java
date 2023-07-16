package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0qo  reason: invalid class name and case insensitive filesystem */
public final class C15150qo {
    public static long A00(C15210qv r1, ByteBuffer byteBuffer, long j) {
        A01(r1, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void A01(C15210qv r3, ByteBuffer byteBuffer, int i, long j) {
        int CYz;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (CYz = r3.CYz(byteBuffer, j)) != -1) {
            j += (long) CYz;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C15160qp("ELF file truncated");
    }

    public static String[] A02(C15210qv r30) {
        long j;
        short s;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        C15210qv r9 = r30;
        long A00 = A00(r9, allocate, 0);
        if (A00 == 1179403647) {
            A01(r9, allocate, 1, 4);
            boolean z = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z = false;
            }
            A01(r9, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = A00(r9, allocate, 28);
                A01(r9, allocate, 2, 44);
                s = 65535;
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 42;
            } else {
                A01(r9, allocate, 8, 32);
                j = allocate.getLong();
                A01(r9, allocate, 2, 56);
                s = 65535;
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 54;
            }
            A01(r9, allocate, 2, j3);
            short s2 = allocate.getShort() & s;
            if (j2 == 65535) {
                if (z) {
                    j14 = A00(r9, allocate, 32) + 28;
                } else {
                    A01(r9, allocate, 8, 40);
                    j14 = allocate.getLong() + 44;
                }
                j2 = A00(r9, allocate, j14);
            }
            long j15 = j;
            long j16 = 0;
            while (true) {
                if (j16 >= j2) {
                    break;
                } else if (A00(r9, allocate, j15 + 0) == 2) {
                    if (z) {
                        j4 = A00(r9, allocate, j15 + 4);
                    } else {
                        A01(r9, allocate, 8, j15 + 8);
                        j4 = allocate.getLong();
                    }
                    if (j4 != 0) {
                        long j17 = j4;
                        long j18 = 0;
                        int i = 0;
                        do {
                            long j19 = j17 + 0;
                            if (z) {
                                j5 = A00(r9, allocate, j19);
                            } else {
                                A01(r9, allocate, 8, j19);
                                j5 = allocate.getLong();
                            }
                            if (j5 == 1) {
                                if (i != Integer.MAX_VALUE) {
                                    i++;
                                } else {
                                    throw new C15160qp("malformed DT_NEEDED section");
                                }
                            } else if (j5 == 5) {
                                if (z) {
                                    j18 = A00(r9, allocate, j17 + 4);
                                } else {
                                    A01(r9, allocate, 8, j17 + 8);
                                    j18 = allocate.getLong();
                                }
                            }
                            j6 = 16;
                            if (z) {
                                j7 = 8;
                            } else {
                                j7 = 16;
                            }
                            j17 += j7;
                        } while (j5 != 0);
                        if (j18 != 0) {
                            int i2 = 0;
                            while (true) {
                                if (((long) i2) >= j2) {
                                    break;
                                }
                                if (A00(r9, allocate, j + 0) == 1) {
                                    if (z) {
                                        j8 = A00(r9, allocate, j + 8);
                                        j9 = A00(r9, allocate, j + 20);
                                    } else {
                                        A01(r9, allocate, 8, j + j6);
                                        j8 = allocate.getLong();
                                        A01(r9, allocate, 8, j + 40);
                                        j9 = allocate.getLong();
                                    }
                                    if (j8 <= j18 && j18 < j9 + j8) {
                                        if (z) {
                                            j10 = A00(r9, allocate, j + 4);
                                        } else {
                                            A01(r9, allocate, 8, j + 8);
                                            j10 = allocate.getLong();
                                        }
                                        long j20 = j10 + (j18 - j8);
                                        if (j20 != 0) {
                                            String[] strArr = new String[i];
                                            int i3 = 0;
                                            do {
                                                long j21 = j4 + 0;
                                                if (z) {
                                                    j11 = A00(r9, allocate, j21);
                                                } else {
                                                    A01(r9, allocate, 8, j21);
                                                    j11 = allocate.getLong();
                                                }
                                                if (j11 == 1) {
                                                    if (z) {
                                                        j13 = A00(r9, allocate, j4 + 4);
                                                    } else {
                                                        A01(r9, allocate, 8, j4 + 8);
                                                        j13 = allocate.getLong();
                                                    }
                                                    long j22 = j13 + j20;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j23 = 1 + j22;
                                                        A01(r9, allocate, 1, j22);
                                                        short s3 = (short) (allocate.get() & 255);
                                                        if (s3 == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s3);
                                                        j22 = j23;
                                                    }
                                                    strArr[i3] = sb.toString();
                                                    if (i3 != Integer.MAX_VALUE) {
                                                        i3++;
                                                    } else {
                                                        throw new C15160qp("malformed DT_NEEDED section");
                                                    }
                                                }
                                                if (z) {
                                                    j12 = 8;
                                                } else {
                                                    j12 = 16;
                                                }
                                                j4 += j12;
                                            } while (j11 != 0);
                                            if (i3 == i) {
                                                return strArr;
                                            }
                                            throw new C15160qp("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                j += (long) s2;
                                i2++;
                                j6 = 16;
                            }
                            throw new C15160qp("did not find file offset of DT_STRTAB table");
                        }
                        throw new C15160qp("Dynamic section string-table not found");
                    }
                } else {
                    j15 += (long) s2;
                    j16++;
                }
            }
            throw new C15160qp("ELF file does not contain dynamic linking information");
        }
        throw new C15160qp(AnonymousClass00U.A0L("file is not ELF: 0x", Long.toHexString(A00)));
    }
}
