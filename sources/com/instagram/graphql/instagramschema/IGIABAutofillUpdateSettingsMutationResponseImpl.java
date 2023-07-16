package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass216;
import X.AnonymousClass4vN;
import X.C108776iv;
import X.C85314ur;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IGIABAutofillUpdateSettingsMutationResponseImpl extends TreeJNI implements C85314ur {

    public final class IgIabAutofillUpdateSettings extends TreeJNI implements AnonymousClass4vN {
        public final String[] getScalarFields() {
            return new String[]{"count", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }

        public final AnonymousClass216 BDj() {
            return (AnonymousClass216) getEnumValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, AnonymousClass216.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public final int getCount() {
            return getIntValue("count");
        }
    }

    public final AnonymousClass4vN Ao1() {
        return (AnonymousClass4vN) getTreeValue("ig_iab_autofill_update_settings(request:$request)", IgIabAutofillUpdateSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgIabAutofillUpdateSettings.class, "ig_iab_autofill_update_settings(request:$request)");
    }
}
