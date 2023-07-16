package X;

/* renamed from: X.0vI  reason: invalid class name and case insensitive filesystem */
public enum C17640vI {
    ACKNOWLEDGED_DELIVERY(0),
    PROCESSING_LASTACTIVE_PRESENCEINFO(1),
    EXACT_KEEPALIVE(2),
    DELTA_SENT_MESSAGE_ENABLED(4),
    USE_ENUM_TOPIC(5),
    USE_THRIFT_FOR_INBOX(7),
    FBNS_EXPLICIT_DELIVERY_ACK(13);
    
    public final byte A00;

    /* access modifiers changed from: public */
    C17640vI(int i) {
        this.A00 = (byte) i;
    }
}
