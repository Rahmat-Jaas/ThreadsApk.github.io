package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class IGFxImSyncResourcesMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class FximSyncResources extends TreeJNI implements C81204nM {

        public final class Error extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"button_text", DevServerEntity.COLUMN_DESCRIPTION, DialogModule.KEY_TITLE};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Error.class, "error");
        }

        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FximSyncResources.class, "fxim_sync_resources(accounts_to_sync:$accounts_to_sync,client_mutation_id:$client_mutation_id,resources_to_sync:[\"PROFILE_PHOTO\",\"NAME\"],source_of_truth_array:[{\"custom_resource\":\"PROFILE_PHOTO\",\"resource_source\":\"FB\"},{\"custom_resource\":\"NAME\",\"resource_source\":\"FB\"}])");
    }
}
