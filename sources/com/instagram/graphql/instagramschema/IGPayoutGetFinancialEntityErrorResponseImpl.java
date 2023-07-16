package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass69L;
import X.C108776iv;
import X.C148198qd;
import X.C148208qe;
import X.C148218qf;
import X.C148438r3;
import X.C18180wK;
import X.C18190wL;
import X.C35383Ito;
import X.C86104wH;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGPayoutGetFinancialEntityErrorResponseImpl extends TreeJNI implements C148218qf {

    public final class PayFinancialEntityByAdmin extends TreeJNI implements C148438r3 {

        public final class Payees extends TreeJNI implements C148198qd {
            public final String[] getScalarFields() {
                return new String[]{"subtype"};
            }

            public final C35383Ito BEq() {
                return (C35383Ito) C86104wH.A0a(this, C35383Ito.A08, "subtype");
            }
        }

        public final class PayoutHold extends TreeJNI implements C148208qe {
            public final String[] getScalarFields() {
                return new String[]{"external_reason_code"};
            }

            public final AnonymousClass69L Agi() {
                return (AnonymousClass69L) C86104wH.A0a(this, AnonymousClass69L.A03, "external_reason_code");
            }
        }

        public final ImmutableList B0K() {
            return getTreeList("payees", Payees.class);
        }

        public final ImmutableList B0f() {
            return getTreeList("payout_hold", PayoutHold.class);
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Payees.class, "payees", true), PayoutHold.class, "payout_hold", true);
        }
    }

    public final ImmutableList B0I() {
        return getTreeList("pay_financial_entity_by_admin(where:$input)", PayFinancialEntityByAdmin.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayFinancialEntityByAdmin.class, "pay_financial_entity_by_admin(where:$input)");
    }
}
