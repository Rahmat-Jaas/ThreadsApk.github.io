package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass69L;
import X.C108776iv;
import X.C147958qD;
import X.C147968qE;
import X.C147978qF;
import X.C147988qG;
import X.C147998qH;
import X.C148298qn;
import X.C148398qx;
import X.C148548rG;
import X.C148568rI;
import X.C169419tJ;
import X.C18190wL;
import X.C18220wO;
import X.C35294Is8;
import X.C35383Ito;
import X.C81204nM;
import X.C86104wH;
import X.L4O;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class FinancialEntityFragmentImpl extends TreeJNI implements C148568rI {

    public final class CompanyAddress extends TreeJNI implements C147958qD {
        public final L4O A9I() {
            return (L4O) reinterpret(AddressFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{AddressFragmentImpl.class};
        }
    }

    public final class OwnerAddress extends TreeJNI implements C147968qE {
        public final L4O A9I() {
            return (L4O) reinterpret(AddressFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{AddressFragmentImpl.class};
        }
    }

    public final class Payees extends TreeJNI implements C147978qF {

        public final class DeferredStatus extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_deferred"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"payee_id", "payee_name", "payee_type", "subtype"};
        }

        public final C35383Ito BEq() {
            return (C35383Ito) C86104wH.A0a(this, C35383Ito.A08, "subtype");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(DeferredStatus.class, "deferred_status");
        }
    }

    public final class PayoutBatchItems extends TreeJNI implements C147988qG {
        public final C148298qn A9f() {
            return (C148298qn) reinterpret(PayoutBatchItemFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{PayoutBatchItemFragmentImpl.class};
        }
    }

    public final class PayoutHold extends TreeJNI implements C148398qx {
        public final String[] getScalarFields() {
            return new String[]{"action_type", "external_reason_code", "id", "memo", "onboarding_type"};
        }

        public final AnonymousClass69L Agi() {
            return (AnonymousClass69L) C86104wH.A0a(this, AnonymousClass69L.A03, "external_reason_code");
        }

        public final C169419tJ AyZ() {
            return (C169419tJ) C86104wH.A0a(this, C169419tJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "onboarding_type");
        }
    }

    public final class PayoutInfo extends TreeJNI implements C147998qH {
        public final C148548rG A9g() {
            return (C148548rG) reinterpret(PayoutMethodInfoFragmentImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{PayoutMethodInfoFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"company_emails", "company_name", "company_phone", "company_tin_type", "company_type", "id", "owner_birthday"};
    }

    public final C147958qD AYZ() {
        return (C147958qD) getTreeValue("company_address", CompanyAddress.class);
    }

    public final ImmutableList AYa() {
        return getStringList("company_emails");
    }

    public final String AYb() {
        return getStringValue("company_name");
    }

    public final String AYc() {
        return getStringValue("company_phone");
    }

    public final String AYd() {
        return getStringValue("company_tin_type");
    }

    public final C35294Is8 AYe() {
        return (C35294Is8) C86104wH.A0a(this, C35294Is8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "company_type");
    }

    public final C147968qE AzY() {
        return (C147968qE) getTreeValue("owner_address", OwnerAddress.class);
    }

    public final String AzZ() {
        return getStringValue("owner_birthday");
    }

    public final ImmutableList B0K() {
        return getTreeList("payees", Payees.class);
    }

    public final C147988qG B0a() {
        return (C147988qG) getTreeValue("payout_batch_items(first:$payoutTransactionsLimit)", PayoutBatchItems.class);
    }

    public final ImmutableList B0f() {
        return getTreeList("payout_hold", PayoutHold.class);
    }

    public final ImmutableList B0g() {
        return getTreeList("payout_info", PayoutInfo.class);
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(CompanyAddress.class, "company_address", false), C18190wL.A0G(OwnerAddress.class, "owner_address", false), C18190wL.A0G(PayoutInfo.class, "payout_info", true), C18190wL.A0G(Payees.class, "payees", true), C18190wL.A0G(PayoutBatchItems.class, "payout_batch_items(first:$payoutTransactionsLimit)", false), C18190wL.A0G(PayoutHold.class, "payout_hold", true)};
    }

    public final String getId() {
        return C18220wO.A0m(this);
    }
}
