package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.6p3  reason: invalid class name and case insensitive filesystem */
public final class C112136p3 {
    public final Exception A00;
    public final Map A01;

    public final Map A00() {
        Map map = this.A01;
        if (map != null) {
            return map;
        }
        Exception exc = this.A00;
        if (exc != null) {
            throw new AnonymousClass6CQ("Model load failed.", exc);
        }
        throw new AnonymousClass6CQ("Model load failed due to an unspecified cause.");
    }

    public C112136p3(Exception exc, Map map) {
        ImmutableMap copyOf;
        this.A00 = exc;
        if (map == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableMap.copyOf(map);
        }
        this.A01 = copyOf;
    }
}
