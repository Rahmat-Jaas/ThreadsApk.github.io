package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass6WA;
import X.AnonymousClass8sP;
import X.C04220Ms;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class DcpDataList extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final List A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return DcpDataList$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DcpDataList) && C04220Ms.A0I(this.A00, ((DcpDataList) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ DcpDataList(List list, int i) {
        if (1 != (i & 1)) {
            AnonymousClass6WA.A00(DcpDataList$$serializer.descriptor, i, 1);
            throw null;
        } else {
            this.A00 = list;
        }
    }
}
