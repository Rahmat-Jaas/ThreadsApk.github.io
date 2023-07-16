package X;

import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: X.0Q6  reason: invalid class name */
public final class AnonymousClass0Q6 {
    public byte A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public String A05;
    public short A06 = -1;

    public final void A01(Map map) {
        long j = this.A03;
        if (j != -1) {
            if (j > 0) {
                map.put(AnonymousClass00U.A0L(this.A05, "_start_time_ms"), String.valueOf(j));
            }
            long j2 = this.A04;
            if (j2 > 0) {
                map.put(AnonymousClass00U.A0L(this.A05, "_start_uptime_ms"), String.valueOf(j2));
            }
            long j3 = this.A01;
            if (j3 > 0) {
                map.put(AnonymousClass00U.A0L(this.A05, "_end_time_ms"), String.valueOf(j3));
            }
            long j4 = this.A02;
            if (j4 > 0) {
                map.put(AnonymousClass00U.A0L(this.A05, "_end_uptime_ms"), String.valueOf(j4));
            }
            short s = this.A06;
            if (s > -1) {
                map.put(AnonymousClass00U.A0L(this.A05, "_oom_score_adj"), String.valueOf(s));
            }
            byte b = this.A00;
            if (b > -1) {
                map.put(AnonymousClass00U.A0L(this.A05, "_oom_adj"), String.valueOf(b));
            }
        }
    }

    public AnonymousClass0Q6(String str) {
        this.A05 = AnonymousClass00U.A0L("night_watch_", str);
    }

    public final void A00(ByteBuffer byteBuffer) {
        this.A03 = byteBuffer.getLong();
        this.A04 = byteBuffer.getLong();
        this.A01 = byteBuffer.getLong();
        this.A02 = byteBuffer.getLong();
        this.A06 = byteBuffer.getShort();
        this.A00 = byteBuffer.get();
        byteBuffer.get();
        byteBuffer.getInt();
    }
}
