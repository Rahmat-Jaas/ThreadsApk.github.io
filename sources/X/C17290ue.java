package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0ue  reason: invalid class name and case insensitive filesystem */
public enum C17290ue {
    CONNECT(1),
    CONNACK(2),
    PUBLISH(3),
    PUBACK(4),
    SUBSCRIBE(8),
    SUBACK(9),
    UNSUBSCRIBE(10),
    UNSUBACK(11),
    PINGREQ(12),
    PINGRESP(13);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        A01 = Collections.unmodifiableMap(new C17300uf());
    }

    /* access modifiers changed from: public */
    C17290ue(int i) {
        this.A00 = i;
    }
}
