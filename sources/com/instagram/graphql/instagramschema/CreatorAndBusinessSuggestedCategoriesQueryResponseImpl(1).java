package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18220wO;
import X.C18250wR;
import X.C85024uO;
import X.C85034uP;
import X.C85574vQ;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class CreatorAndBusinessSuggestedCategoriesQueryResponseImpl extends TreeJNI implements C85034uP {

    public final class IgBusinessTopCategories extends TreeJNI implements C85024uO {

        public final class Items extends TreeJNI implements C85574vQ {
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

    public final C85024uO Anp() {
        return (C85024uO) getTreeValue("ig_business_top_categories(locale:$locale)", IgBusinessTopCategories.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgBusinessTopCategories.class, "ig_business_top_categories(locale:$locale)");
    }
}
