package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

/* renamed from: X.23c  reason: invalid class name and case insensitive filesystem */
public enum C308223c {
    RIGHT_CHEVRON("right_chevron"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (C308223c r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C308223c(String str) {
        this.A00 = str;
    }
}
