package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0mk  reason: invalid class name and case insensitive filesystem */
public enum C12940mk implements AnonymousClass0LJ {
    MqttDurationMs(0),
    MqttTotalDurationMs(1),
    NetworkDurationMs(2),
    NetworkTotalDurationMs(3),
    ServiceDurationMs(4),
    MessageSendSuccess(6),
    ForegroundPing(7),
    BackgroundPing(8),
    PublishReceived(9),
    FbnsNotificationReceived(10),
    FbnsLiteNotificationReceived(11),
    FbnsLiteNotificationDeliveryRetried(13);
    
    public final String A00;
    public final Class A01;

    /* access modifiers changed from: public */
    C12940mk(int i) {
        this.A00 = r3;
        this.A01 = AtomicLong.class;
    }

    public final String Aqm() {
        return this.A00;
    }

    public final Class BKP() {
        return this.A01;
    }
}
