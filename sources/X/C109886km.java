package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.6km  reason: invalid class name and case insensitive filesystem */
public final class C109886km {
    public final int A00;
    public final ImmutableMap A01;
    public final boolean A02;
    public final boolean A03;

    public C109886km(Map map, int i, boolean z, boolean z2) {
        ImmutableMap immutableMap;
        this.A00 = i;
        if (map != null) {
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            immutableMap = null;
        }
        this.A01 = immutableMap;
        this.A02 = z;
        this.A03 = z2;
    }
}
