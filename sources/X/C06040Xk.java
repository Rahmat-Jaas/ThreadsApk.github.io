package X;

import android.os.SystemClock;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.common.dextricks.StringTreeSet;
import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Xk  reason: invalid class name and case insensitive filesystem */
public final class C06040Xk {
    public static AtomicReference A02 = new AtomicReference();
    public final C06160Xx A00;
    public final Object A01 = new Object();

    public C06040Xk(C06160Xx r13) {
        this.A00 = r13;
        if (A02.compareAndSet((Object) null, this)) {
            A02(this, AnonymousClass006.A02, (Integer) null, (Integer) null, ' ', '0', false, true);
            A0A(AnonymousClass0NQ.A0E);
            A04(' ');
            A0B((Boolean) null);
            synchronized (this.A01) {
                this.A00.A00.put(HttpStatus.SC_PARTIAL_CONTENT, (byte) 48);
                A06(System.currentTimeMillis());
            }
            A09(0, "", false);
            A05(-1);
            A0C("unknown");
            A08(0, 0, true);
            A07(0, 0, true);
            synchronized (this.A01) {
                this.A00.A00.putLong(1769, 0);
                A06(System.currentTimeMillis());
            }
        }
    }

    private void A00(int i, int i2, long j, long j2) {
        boolean z = false;
        if (i2 != -103) {
            z = true;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format("Offset %d cannot be negative", new Object[]{Integer.valueOf(i2)}));
            }
        }
        if (j >= 0) {
            synchronized (this.A01) {
                MappedByteBuffer mappedByteBuffer = this.A00.A00;
                mappedByteBuffer.put(i, (byte) 1);
                if (z) {
                    mappedByteBuffer.put(i2, (byte) 1);
                }
                mappedByteBuffer.putLong(i + 1, j);
                if (z) {
                    mappedByteBuffer.putLong(i2 + 1, j);
                }
                mappedByteBuffer.putLong(i + 9, j2);
                if (z) {
                    mappedByteBuffer.putLong(i2 + 9, j2);
                }
                mappedByteBuffer.put(i, (byte) 0);
                if (z) {
                    mappedByteBuffer.put(i2, (byte) 0);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void A07(long j, long j2, boolean z) {
        long j3 = j;
        A01(j);
        long j4 = j2;
        A01(j2);
        int i = -103;
        if (z) {
            i = 258;
        }
        A00(241, i, j3, j4);
        synchronized (this.A01) {
            A06(System.currentTimeMillis());
        }
    }

    public final void A08(long j, long j2, boolean z) {
        long j3 = j;
        A01(j);
        long j4 = j2;
        A01(j2);
        int i = -103;
        if (z) {
            i = 224;
        }
        A00(HttpStatus.SC_MULTI_STATUS, i, j3, j4);
        synchronized (this.A01) {
            A06(System.currentTimeMillis());
        }
    }

    public static void A01(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(String.format("Timestamp %d is invalid since it is negative", new Object[]{Long.valueOf(j)}));
        }
    }

    public static void A03(C06040Xk r4, String str, int i, int i2, boolean z) {
        if (str == null) {
            str = "";
        }
        synchronized (r4.A01) {
            r4.A00.A00.put(i, z ? (byte) 1 : 0);
            r4.A0D(str, i2, 128);
            r4.A06(System.currentTimeMillis());
        }
    }

    public final void A04(char c) {
        synchronized (this.A01) {
            this.A00.A00.put(166, (byte) c);
            A06(System.currentTimeMillis());
        }
    }

    public final void A05(int i) {
        synchronized (this.A01) {
            MappedByteBuffer mappedByteBuffer = this.A00.A00;
            mappedByteBuffer.putInt(749, i);
            mappedByteBuffer.putLong(1753, System.currentTimeMillis());
            mappedByteBuffer.putLong(1761, SystemClock.uptimeMillis());
            A06(System.currentTimeMillis());
        }
    }

    public final void A06(long j) {
        synchronized (this.A01) {
            A0D(Long.toString(j), 180, 15);
        }
    }

    public final void A09(long j, String str, boolean z) {
        int i = 48;
        if (z) {
            i = 49;
        }
        synchronized (this.A01) {
            MappedByteBuffer mappedByteBuffer = this.A00.A00;
            mappedByteBuffer.put(275, (byte) i);
            mappedByteBuffer.putLong(276, j);
            A0D(str, 284, 80);
            A06(System.currentTimeMillis());
        }
    }

    public final void A0A(AnonymousClass0NQ r6) {
        char c = r6.A01;
        synchronized (this.A01) {
            this.A00.A00.put(0, (byte) c);
            A06(System.currentTimeMillis());
        }
    }

    public final void A0B(Boolean bool) {
        synchronized (this.A01) {
            int i = 32;
            if (bool != null) {
                i = 48;
                if (bool.booleanValue()) {
                    i = 49;
                }
            }
            this.A00.A00.put(HttpStatus.SC_RESET_CONTENT, (byte) i);
            A06(System.currentTimeMillis());
        }
    }

    public static void A02(C06040Xk r7, Integer num, Integer num2, Integer num3, char c, char c2, boolean z, boolean z2) {
        char A002 = C019909g.A00(num);
        if (c < 0 || c > 127) {
            throw new IllegalStateException("State byte should be ASCII");
        }
        synchronized (r7.A01) {
            MappedByteBuffer mappedByteBuffer = r7.A00.A00;
            mappedByteBuffer.put(1, (byte) A002);
            mappedByteBuffer.put(196, (byte) c2);
            mappedByteBuffer.put(2, (byte) c);
            int i = 48;
            if (z) {
                i = 49;
            }
            mappedByteBuffer.put(198, (byte) i);
            if (z2 || num.compareTo(AnonymousClass006.A0Y) < 0) {
                mappedByteBuffer.put(HttpStatus.SC_ACCEPTED, (byte) 48);
                mappedByteBuffer.put(200, (byte) 48);
            }
            byte b = -1;
            int i2 = StringTreeSet.MAX_SYMBOL_COUNT;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue > 127) {
                    intValue = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                mappedByteBuffer.put(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, (byte) intValue);
            } else {
                mappedByteBuffer.put(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, (byte) -1);
            }
            if (num3 != null) {
                int intValue2 = num3.intValue();
                if (intValue2 <= 127) {
                    i2 = intValue2;
                }
                b = (byte) i2;
            }
            mappedByteBuffer.put(HttpStatus.SC_NO_CONTENT, b);
            r7.A06(System.currentTimeMillis());
        }
    }

    public final void A0C(String str) {
        int i = 0;
        if (str.length() > 1000) {
            str = str.substring(0, 1000);
        }
        synchronized (this.A01) {
            MappedByteBuffer mappedByteBuffer = this.A00.A00;
            mappedByteBuffer.putShort(753, 0);
            byte[] bytes = str.getBytes();
            while (true) {
                int length = bytes.length;
                if (i < length) {
                    mappedByteBuffer.put(i + 755, bytes[i]);
                    i++;
                } else {
                    mappedByteBuffer.putShort(753, (short) length);
                    A06(System.currentTimeMillis());
                }
            }
        }
    }

    public final void A0D(String str, int i, int i2) {
        int i3 = 0;
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        synchronized (this.A01) {
            MappedByteBuffer mappedByteBuffer = this.A00.A00;
            mappedByteBuffer.put(i, (byte) 0);
            byte[] bytes = str.getBytes();
            while (true) {
                int length = bytes.length;
                if (i3 < length) {
                    mappedByteBuffer.put(i + 1 + i3, bytes[i3]);
                    i3++;
                } else {
                    mappedByteBuffer.put(i, (byte) length);
                }
            }
        }
    }
}
