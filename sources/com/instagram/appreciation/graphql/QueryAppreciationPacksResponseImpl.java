package com.instagram.appreciation.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class QueryAppreciationPacksResponseImpl extends TreeJNI implements C81204nM {

    public final class Viewer extends TreeJNI implements C81204nM {

        public final class User extends TreeJNI implements C81204nM {

            public final class ContentAppreciationFundingConfig extends TreeJNI implements C81204nM {

                public final class ContentAppreciationConsumableProducts extends TreeJNI implements C81204nM {

                    public final class Product extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"external_sku_for_app(app:\"INSTAGRAM\")", "id"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{DialogModule.KEY_TITLE};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Product.class, "product");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(ContentAppreciationConsumableProducts.class, "content_appreciation_consumable_products");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ContentAppreciationFundingConfig.class, "content_appreciation_funding_config(session_id:$session_id)");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(User.class, "user");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Viewer.class, "viewer");
    }
}
