package com.facebook.papaya.client.type;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C972968u;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

public final class PapayaRestrictions {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public final ImmutableMap A00() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            builder.put(((C972968u) A0o.getKey()).A00, Long.valueOf(C18190wL.A08(A0o.getValue())));
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((PapayaRestrictions) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
