package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Zt  reason: invalid class name and case insensitive filesystem */
public final class C103586Zt {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Integer A0d = C18220wO.A0d();
        A0y.put("auto", A0d);
        A0y.put("yes", 1);
        Integer A0X = C86154wM.A0X();
        A0y.put("no", A0X);
        A0y.put("no_hide_descendants", 4);
        A00 = Collections.unmodifiableMap(A0y);
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        A0y2.put(NetInfoModule.CONNECTION_TYPE_NONE, A0d);
        A0y2.put("polite", 1);
        A0y2.put("assertive", A0X);
        A01 = Collections.unmodifiableMap(A0y2);
    }
}
