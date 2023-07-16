package com.facebook.dcp.signals.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass8sP;
import X.C04220Ms;
import kotlinx.serialization.Serializable;

@Serializable
public final class MetadataResponse extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final SignalsMetadata A00;

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

    public /* synthetic */ MetadataResponse(SignalsMetadata signalsMetadata, int i) {
        if ((i & 1) == 0) {
            this.A00 = new SignalsMetadata((String) null, 3);
        } else {
            this.A00 = signalsMetadata;
        }
    }

    public MetadataResponse(SignalsMetadata signalsMetadata) {
        C04220Ms.A0B(signalsMetadata, 1);
        this.A00 = signalsMetadata;
    }

    public MetadataResponse() {
        this(new SignalsMetadata((String) null, 3));
    }
}
