package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.23q  reason: invalid class name and case insensitive filesystem */
public enum C309623q {
    ACTIVE(AppStateModule.APP_STATE_ACTIVE),
    INACTIVE("inactive");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (C309623q r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C309623q(String str) {
        this.A00 = str;
    }
}
