package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass8sP;
import X.C04220Ms;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class ServerFeaturesResponse extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final List A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return ServerFeaturesResponse$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ServerFeaturesResponse) && C04220Ms.A0I(this.A00, ((ServerFeaturesResponse) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ ServerFeaturesResponse(List list, int i) {
        if ((i & 1) == 0) {
            this.A00 = AnonymousClass0ZV.A00;
        } else {
            this.A00 = list;
        }
    }

    public ServerFeaturesResponse(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public ServerFeaturesResponse() {
        this(AnonymousClass0ZV.A00);
    }
}
