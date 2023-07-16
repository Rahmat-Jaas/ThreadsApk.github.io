package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Q5  reason: invalid class name */
public final class AnonymousClass0Q5 {
    public static long A08 = -1;
    public int A00 = -1;
    public long A01 = 0;
    public long A02 = -1;
    public long A03 = -1;
    public List A04;
    public List A05;
    public final String A06;
    public final boolean A07;

    public static void A02(AnonymousClass0Q5 r5, long j, long j2) {
        List list;
        int i = 0;
        while (true) {
            list = r5.A04;
            if (i >= list.size() || ((Number) list.get(i)).longValue() > j2) {
                list.add(i, Long.valueOf(j2));
                r5.A05.add(i, Long.valueOf(j));
            } else if (((Number) list.get(i)).longValue() != j2) {
                i++;
            } else {
                return;
            }
        }
        list.add(i, Long.valueOf(j2));
        r5.A05.add(i, Long.valueOf(j));
    }

    public static void A03(AnonymousClass0Q5 r11, ByteBuffer byteBuffer, int i) {
        int i2 = 4;
        if (i < 2) {
            i2 = 8;
        }
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        int i4 = 0;
        do {
            jArr[i4] = (long) byteBuffer.getInt();
            jArr2[i4] = ((long) byteBuffer.getInt()) + A08;
            i4++;
        } while (i4 < i2);
        int i5 = 1;
        do {
            if (jArr2[i5] < jArr2[i3]) {
                i3 = i5;
            }
            i5++;
        } while (i5 < i2);
        for (int i6 = i3; i6 < i3 + i2; i6++) {
            int i7 = i6 % i2;
            if (!(jArr[i7] == -1 || jArr[i7] == 65535)) {
                A02(r11, jArr[i7], jArr2[i7]);
            }
        }
    }

    public final void A05(ByteBuffer byteBuffer) {
        A03(this, byteBuffer, 0);
        long j = byteBuffer.getLong();
        int i = byteBuffer.getInt();
        this.A00 = i;
        if (j > -1) {
            this.A02 = j - ((long) i);
        }
        this.A01 = (long) byteBuffer.getInt();
        A01(this);
    }

    public final void A06(ByteBuffer byteBuffer) {
        int i = 0;
        do {
            A03(this, byteBuffer, i);
            i++;
        } while (i < 5);
        long j = byteBuffer.getLong();
        int i2 = byteBuffer.getInt();
        this.A00 = i2;
        if (j > -1) {
            this.A02 = j - ((long) i2);
        }
        this.A01 = (long) byteBuffer.getInt();
        A01(this);
    }

    public final void A07(ByteBuffer byteBuffer) {
        int i = 1;
        do {
            A03(this, byteBuffer, i);
            i++;
        } while (i < 5);
        A01(this);
    }

    public static void A01(AnonymousClass0Q5 r9) {
        if (r9.A03 > 0 && A08 > 0) {
            List list = r9.A04;
            if (list.isEmpty() || ((Number) list.get(0)).longValue() > A08) {
                A02(r9, r9.A03, A08);
            }
        }
        List list2 = r9.A04;
        int size = list2.size() - 1;
        if (r9.A02 > 0 && !list2.isEmpty() && r9.A02 > ((Number) list2.get(size)).longValue()) {
            A02(r9, ((Number) r9.A05.get(size)).longValue(), r9.A02);
        }
    }

    public final void A04(long j) {
        this.A03 = j;
        A02(this, j, A08);
    }

    public final void A09(boolean z, boolean z2, Map map) {
        if (this.A01 > 0) {
            List list = this.A05;
            if (list.isEmpty()) {
                return;
            }
            if (!z || this.A07) {
                StringBuilder sb = new StringBuilder("[");
                StringBuilder sb2 = new StringBuilder("[");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i).toString());
                    sb2.append(((Number) this.A04.get(i)).longValue() - A08);
                    if (i < list.size() - 1) {
                        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        sb2.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                }
                sb.append("]");
                sb2.append("]");
                String str = this.A06;
                map.put(AnonymousClass00U.A0L(str, "_tier0"), sb.toString());
                map.put(AnonymousClass00U.A0L(str, "_time_ms0"), sb2.toString());
                if (z2) {
                    long j = this.A01;
                    if (j != -1) {
                        map.put(AnonymousClass00U.A0L(str, "_count"), String.valueOf(j));
                    }
                    int i2 = this.A00;
                    if (i2 != -1) {
                        map.put(AnonymousClass00U.A0L(str, "_sample_ms"), String.valueOf(i2));
                    }
                }
            }
        }
    }

    public AnonymousClass0Q5(String str, boolean z) {
        this.A06 = AnonymousClass00U.A0L("night_watch_", str);
        this.A07 = z;
        this.A05 = new ArrayList();
        this.A04 = new ArrayList();
    }

    public static String A00(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        if (j == -1) {
            return "";
        }
        short[] sArr = {-1, -1, -1, -1};
        int i = 3;
        do {
            sArr[i] = (short) ((int) (65535 & j));
            j >>= 16;
            i--;
        } while (i >= 0);
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            short s = -1;
            if (sArr[i2] != -1) {
                s = sArr[i2] & 65535;
            }
            sb.append(s);
            i2++;
            if (i2 >= 4) {
                sb.append("]");
                return sb.toString();
            } else if (i2 > 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
    }

    public final void A08(short s) {
        this.A03 = (long) (s & 65535);
    }
}
