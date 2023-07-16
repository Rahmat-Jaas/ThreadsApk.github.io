package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.251  reason: invalid class name */
public enum AnonymousClass251 {
    OWNER(0, "OWNER"),
    CO_HOST(1, "CO_HOST"),
    INVITEE(2, "INVITEE"),
    NONE(3, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass251[] values = values();
        int length = values.length;
        int A0N = AnonymousClass4WK.A0N(length);
        if (A0N < 16) {
            A0N = 16;
        }
        LinkedHashMap A0v = C18190wL.A0v(A0N);
        int i2 = 0;
        while (i2 < length) {
            AnonymousClass251 r1 = values[i2];
            i2 = C18200wM.A08(r1, A0v, r1.A00, i2);
        }
        A03 = A0v;
        LinkedHashMap A0v2 = C18190wL.A0v(AnonymousClass4WK.A0M(r3));
        for (AnonymousClass251 r12 : values()) {
            A0v2.put(r12.A01, r12);
        }
        A02 = A0v2;
    }

    /* access modifiers changed from: public */
    AnonymousClass251(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
