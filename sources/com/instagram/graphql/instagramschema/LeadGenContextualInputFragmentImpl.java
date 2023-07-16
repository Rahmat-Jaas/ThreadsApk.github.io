package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class LeadGenContextualInputFragmentImpl extends TreeJNI implements C81204nM {

    public final class UserInputBasedFields extends TreeJNI implements C81204nM {

        public final class Options extends TreeJNI implements C81204nM {

            public final class InlineXFBLeadGenDealerData extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"address", "distance", "distance_unit", "key", FXPFAccessLibraryDebugFragment.NAME};
                }
            }

            public final class InlineXFBLeadGenKeyValue extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"key", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
            }

            public final Class[] getInlineClasses() {
                return new Class[]{InlineXFBLeadGenDealerData.class, InlineXFBLeadGenKeyValue.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Options.class, "options");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(UserInputBasedFields.class, AnonymousClass000.A00(1168));
    }
}
