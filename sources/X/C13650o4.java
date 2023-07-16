package X;

import android.os.SystemClock;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public final class C13650o4 implements C008403q {
    public final /* synthetic */ MqttPushServiceDelegate A00;

    public final void CDq(AnonymousClass0P6 r9, Long l, String str, byte[] bArr, int i, long j) {
        this.A00.A0W(r9, (Long) null, str, bArr, i, j);
    }

    public C13650o4(MqttPushServiceDelegate mqttPushServiceDelegate) {
        this.A00 = mqttPushServiceDelegate;
    }

    public final void Brl() {
        this.A00.A0T();
    }

    public final void Brm() {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        mqttPushServiceDelegate.A00 = SystemClock.elapsedRealtime();
        mqttPushServiceDelegate.A0T();
    }

    public final void Brp(C09740gb r3) {
        MqttPushServiceDelegate mqttPushServiceDelegate = this.A00;
        if (r3.A01()) {
            mqttPushServiceDelegate.A0Y((AnonymousClass0v1) r3.A00());
        }
        mqttPushServiceDelegate.A0T();
    }

    public final void Bsl() {
        this.A00.A0P();
    }

    public final void C7N(C17260ub r2) {
        this.A00.A0Z(r2);
    }

    public final boolean CsA() {
        return this.A00.A0a();
    }

    public final void Cd4(long j, String str, boolean z) {
    }
}
