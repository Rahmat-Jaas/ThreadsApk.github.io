package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.68i  reason: invalid class name and case insensitive filesystem */
public enum C972068i {
    CONNECTED(RealtimeConstants.MQTT_CONNECTED),
    UNCONNECTED("unconnected"),
    MARQUEE("marquee"),
    UNKNOWN("unknown");
    
    public final String A00;

    /* access modifiers changed from: public */
    C972068i(String str) {
        this.A00 = str;
    }
}
