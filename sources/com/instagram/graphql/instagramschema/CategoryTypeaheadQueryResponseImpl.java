package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18220wO;
import X.C18250wR;
import X.C84944uG;
import X.C84954uH;
import X.C85564vP;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class CategoryTypeaheadQueryResponseImpl extends TreeJNI implements C84954uH {

    public final class IgBusinessCategoriesTypeahead extends TreeJNI implements C84944uG {

        public final class Items extends TreeJNI implements C85564vP {
            public final String[] getScalarFields() {
                return new String[]{"account_type", "id", FXPFAccessLibraryDebugFragment.NAME};
            }

            public final String AOY() {
                return getStringValue("account_type");
            }

            public final String getId() {
                return C18250wR.A0X(this);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final ImmutableList AqW() {
            return getTreeList(DialogModule.KEY_ITEMS, Items.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Items.class, DialogModule.KEY_ITEMS);
        }
    }

    public final C84944uG Ano() {
        return (C84944uG) getTreeValue("ig_business_categories_typeahead(filter_temp_deprecated_cat:$filter_temp_deprecated_cat,locale:$locale,query:$query,vertical:$vertical)", IgBusinessCategoriesTypeahead.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgBusinessCategoriesTypeahead.class, "ig_business_categories_typeahead(filter_temp_deprecated_cat:$filter_temp_deprecated_cat,locale:$locale,query:$query,vertical:$vertical)");
    }
}
