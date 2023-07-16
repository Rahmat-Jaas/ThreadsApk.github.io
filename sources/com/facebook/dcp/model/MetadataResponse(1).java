package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass4WJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class MetadataResponse extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final Map A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return MetadataResponse$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof MetadataResponse) && C04220Ms.A0I(this.A00, ((MetadataResponse) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ MetadataResponse(Map map, int i) {
        if ((i & 1) == 0) {
            this.A00 = AnonymousClass4WJ.A0A();
        } else {
            this.A00 = map;
        }
    }

    public MetadataResponse(Map map) {
        this.A00 = map;
    }

    public MetadataResponse() {
        this(AnonymousClass4WJ.A0A());
    }
}
