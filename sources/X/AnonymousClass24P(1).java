package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

/* renamed from: X.24P  reason: invalid class name */
public enum AnonymousClass24P {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    BOLD("BOLD"),
    ITALIC("ITALIC"),
    UNDERLINE("UNDERLINE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass24P r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass24P(String str) {
        this.A00 = str;
    }
}
