package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass8sP;
import X.C04220Ms;
import kotlinx.serialization.Serializable;

@Serializable
public final class DcpMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final String A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return DcpMetadata$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DcpMetadata) && C04220Ms.A0I(this.A00, ((DcpMetadata) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ DcpMetadata(String str, int i) {
        if ((i & 1) == 0) {
            this.A00 = "0.1";
        } else {
            this.A00 = str;
        }
    }

    public DcpMetadata() {
        this.A00 = "0.1";
    }
}
