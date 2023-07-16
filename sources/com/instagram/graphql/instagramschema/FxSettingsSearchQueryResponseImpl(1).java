package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass25Z;
import X.C108776iv;
import X.C18220wO;
import X.C85124uY;
import X.C85134uZ;
import X.C85454vD;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class FxSettingsSearchQueryResponseImpl extends TreeJNI implements C85134uZ {

    public final class FxcalSettings extends TreeJNI implements C85124uY {

        public final class SearchableSettingsNodes extends TreeJNI implements C85454vD {
            public final String[] getScalarFields() {
                return new String[]{FXPFAccessLibraryDebugFragment.NAME, "node_id"};
            }

            public final AnonymousClass25Z Axd() {
                return (AnonymousClass25Z) getEnumValue("node_id", AnonymousClass25Z.A01);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final ImmutableList B9H() {
            return getTreeList("searchable_settings_nodes", SearchableSettingsNodes.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(SearchableSettingsNodes.class, "searchable_settings_nodes");
        }
    }

    public final C85124uY AkU() {
        return (C85124uY) getTreeValue("fxcal_settings", FxcalSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxcalSettings.class, "fxcal_settings");
    }
}
