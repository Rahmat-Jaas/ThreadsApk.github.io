package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class FBPayTransactionInfoImpl extends TreeJNI implements C81204nM {

    public final class ShippingOptions extends TreeJNI implements C81204nM {

        public final class ShippingOptionsShippingOptions extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{DevServerEntity.COLUMN_DESCRIPTION};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(ShippingOptionsShippingOptions.class, "shipping_options");
        }
    }

    public final class CurrencyAmount extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"amount", "currency"};
        }
    }

    public final class PriceItems extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayECPPriceInfoImpl.class};
        }
    }

    public final class ProductItems extends TreeJNI implements C81204nM {

        public final class Amount extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{CurrencyAmountImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{DevServerEntity.COLUMN_DESCRIPTION, "icon_uri", "label", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Amount.class, "amount");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"country_code"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(CurrencyAmount.class, "currency_amount", false), C18190wL.A0G(PriceItems.class, "price_items", true), C18190wL.A0G(ProductItems.class, "product_items", true), C18190wL.A0G(ShippingOptions.class, "shipping_options", false)};
    }
}
