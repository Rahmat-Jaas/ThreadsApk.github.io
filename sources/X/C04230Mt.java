package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.0Mt  reason: invalid class name and case insensitive filesystem */
public final class C04230Mt {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = 0;
    public final C12800mV A03;
    public final AnonymousClass0MO A04;
    public final RealtimeSinceBootClock A05;
    public final boolean A06;

    public final synchronized void A00() {
        long j;
        if (this.A06) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.A00;
            if (j2 < 0) {
                this.A00 = elapsedRealtime;
                this.A01 = elapsedRealtime;
            } else {
                long j3 = elapsedRealtime - j2;
                this.A00 = elapsedRealtime;
                if (j3 > 10000) {
                    j = this.A02 + 10000;
                } else {
                    j = this.A02 + j3;
                }
                this.A02 = j;
                if (elapsedRealtime - this.A01 > MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS) {
                    C12800mV r11 = this.A03;
                    Integer num = AnonymousClass006.A03;
                    this.A02 = j + r11.A00(num).A00.getLong("total_wake_ms", 0);
                    SharedPreferences.Editor edit = r11.A00(num).A00.edit();
                    edit.putLong("total_wake_ms", this.A02);
                    edit.apply();
                    this.A02 = 0;
                    this.A01 = elapsedRealtime;
                }
                C12800mV r7 = this.A03;
                Integer num2 = AnonymousClass006.A03;
                if (elapsedRealtime - r7.A00(num2).A00.getLong("last_log_ms", elapsedRealtime) > 3600000) {
                    this.A04.A07("mqtt_radio_active_time", C14740q4.A01("total_wake_ms", Long.toString(r7.A00(num2).A00.getLong("total_wake_ms", 0))));
                    SharedPreferences.Editor edit2 = r7.A00(num2).A00.edit();
                    edit2.clear();
                    edit2.apply();
                    SharedPreferences.Editor edit3 = r7.A00(num2).A00.edit();
                    edit3.putLong("last_log_ms", elapsedRealtime);
                    edit3.apply();
                }
            }
        }
    }

    public C04230Mt(C12800mV r8, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0MO r10, boolean z) {
        this.A04 = r10;
        this.A05 = realtimeSinceBootClock;
        this.A06 = z;
        this.A03 = r8;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Integer num = AnonymousClass006.A03;
        if (r8.A00(num).A00.getLong("last_log_ms", elapsedRealtime) >= elapsedRealtime) {
            SharedPreferences.Editor edit = r8.A00(num).A00.edit();
            edit.putLong("last_log_ms", elapsedRealtime);
            edit.apply();
        }
    }
}
