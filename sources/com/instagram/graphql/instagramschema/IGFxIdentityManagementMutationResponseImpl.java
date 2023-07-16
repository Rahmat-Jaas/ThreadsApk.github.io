package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class IGFxIdentityManagementMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class FximUpdateRemindersState extends TreeJNI implements C81204nM {

        public final class Error extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{DevServerEntity.COLUMN_DESCRIPTION, DialogModule.KEY_TITLE};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"is_synced", "should_remind"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Error.class, "error");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FximUpdateRemindersState.class, "fxim_update_reminders_state(field:\"PROFILE_PHOTO\",set_reminder_shown:$set_reminder_shown)");
    }
}
