package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.25F  reason: invalid class name */
public enum AnonymousClass25F {
    FIRST_PARTY("first_party");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (AnonymousClass25F r1 : values()) {
            builder.put(r1.A00, r1);
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        A01 = build;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25F(String str) {
        this.A00 = str;
    }
}
