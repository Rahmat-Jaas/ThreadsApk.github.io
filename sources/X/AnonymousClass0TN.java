package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0TN  reason: invalid class name */
public enum AnonymousClass0TN {
    UNKNOWN(-1),
    SERVER(0),
    OVERRIDE(1),
    DEFAULT__SERVER_RETURNED_NULL(2),
    DEFAULT__ACCESSED_BEFORE_MC_INIT(3),
    DEFAULT__NO_DATA_ON_DISK(4),
    DEFAULT__ACCESSED_AFTER_MC_DISPOSE(5),
    DEFAULT__MISSING_SERVER_VALUE(6),
    DEFAULT__INVALID_CONFIG_PARAM_NAME(7),
    DEFAULT__SERVICE_NOT_FOUND(8),
    DEFAULT__MISMATCH_UNIT_TYPE(10),
    DEFAULT__MISMATCH_PARAM_TYPE(11),
    DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID(12);
    
    public static final Map A01 = null;
    public int A00;

    /* access modifiers changed from: public */
    static {
        A01 = new HashMap();
        for (AnonymousClass0TN r2 : values()) {
            A01.put(Integer.valueOf(r2.A00), r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass0TN(int i) {
        this.A00 = i;
    }
}
