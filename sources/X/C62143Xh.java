package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.3Xh  reason: invalid class name and case insensitive filesystem */
public final class C62143Xh {
    public static final Random A07 = new Random();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public String A05;
    public int[] A06;

    public static C15730rn A00(C62143Xh r7, Integer num, long j) {
        long j2;
        C15730rn A0T;
        if (r7.A06 == null) {
            A0T = null;
        } else {
            long j3 = r7.A04;
            if (j > j3) {
                j2 = Math.min(64, (j - r7.A03) + 1);
            } else {
                j2 = (j3 - r7.A03) + 1;
            }
            int i = (int) j2;
            A0T = C18230wP.A0T("time_spent_bit_array");
            A0T.A0D("tos_id", r7.A05);
            A0T.A0C(TraceFieldType.StartTime, Long.valueOf(r7.A03));
            A0T.A0D("tos_array", Arrays.toString(r7.A06));
            A0T.A08(Integer.valueOf(i), "tos_len");
            A0T.A08(Integer.valueOf(r7.A02), "tos_seq");
            A0T.A08(Integer.valueOf(r7.A01), "tos_cum");
            if (num == AnonymousClass006.A0N) {
                A0T.A0D("trigger", "clock_change");
            }
        }
        r7.A06 = null;
        r7.A04 = 0;
        return A0T;
    }

    public C62143Xh() {
        this.A00 = 1;
        this.A00 = (int) Math.ceil(2.0d);
        this.A05 = Integer.toString(Math.abs(A07.nextInt()), 36);
        this.A02 = -1;
        this.A01 = 0;
        this.A06 = null;
    }
}
