package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass6WA;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import kotlinx.serialization.Serializable;

@Serializable
public final class DcpRule extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final DcpData A00;
    public final DcpRuleType A01;
    public final Type A02;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return DcpRule$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DcpRule) {
                DcpRule dcpRule = (DcpRule) obj;
                if (!(this.A01 == dcpRule.A01 && C04220Ms.A0I(this.A00, dcpRule.A00) && this.A02 == dcpRule.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A00, C18210wN.A04(this.A01)));
    }

    public DcpRule(DcpData dcpData, DcpRuleType dcpRuleType, Type type) {
        this.A01 = dcpRuleType;
        this.A00 = dcpData;
        this.A02 = type;
    }

    public /* synthetic */ DcpRule(DcpData dcpData, DcpRuleType dcpRuleType, Type type, int i) {
        if (7 != (i & 7)) {
            AnonymousClass6WA.A00(DcpRule$$serializer.descriptor, i, 7);
            throw null;
        }
        this.A01 = dcpRuleType;
        this.A00 = dcpData;
        this.A02 = type;
    }
}
