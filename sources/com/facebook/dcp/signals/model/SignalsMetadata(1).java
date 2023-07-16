package com.facebook.dcp.signals.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18180wK;
import X.C18220wO;
import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.Type;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class SignalsMetadata extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final String A00;
    public final List A01;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return SignalsMetadata$$serializer.INSTANCE;
        }
    }

    public SignalsMetadata() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalsMetadata) {
                SignalsMetadata signalsMetadata = (SignalsMetadata) obj;
                if (!C04220Ms.A0I(this.A00, signalsMetadata.A00) || !C04220Ms.A0I(this.A01, signalsMetadata.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SignalsMetadata(List list, int i, String str) {
        List list2 = list;
        this.A00 = (i & 1) == 0 ? "0.0.0" : str;
        this.A01 = (i & 2) == 0 ? C18180wK.A0n(new SignalMetadata((DcpData) null, (Type) null, (String) null, (String) null, (String) null, 0, 0, 262143, 0, 0, 0, false)) : list2;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignalsMetadata(String str, int i) {
        this((i & 1) != 0 ? "0.0.0" : str, (i & 2) != 0 ? C18180wK.A0n(new SignalMetadata((DcpData) null, (Type) null, (String) null, (String) null, (String) null, 0, 0, 262143, 0, 0, 0, false)) : null);
    }

    public SignalsMetadata(String str, List list) {
        AnonymousClass0wJ.A1O(str, list);
        this.A00 = str;
        this.A01 = list;
    }
}
