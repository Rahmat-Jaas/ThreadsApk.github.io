package com.instagram.graphql.instagramschema;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFxImBusinessReminderQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class BusinessPresence extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"ig_is_in_bci_sync_toggle_message", "is_bci"};
        }
    }

    public final class FxIdentityManagement extends TreeJNI implements C81204nM {

        public final class BciReminderContent extends TreeJNI implements C81204nM {

            public final class BusinessInfoSyncReminder extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"subtext"};
                }
            }

            public final class DeletePhotoReminder extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"cancel_cta", "confirm_cta", "header", "subtext"};
                }
            }

            public final class PhotoSyncReminder extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"cancel_cta", "confirm_cta", "header", "subtext"};
                }
            }

            public final class ProfileSyncRedirectDialog extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"header", "subtext"};
                }
            }

            public final class UsernameSyncReminder extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"subtext"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(BusinessInfoSyncReminder.class, "business_info_sync_reminder(business_info_type:\"GENERAL\",identity_id:$identity_id)", false), C18190wL.A0G(ProfileSyncRedirectDialog.class, "profile_sync_redirect_dialog(identity_id:$identity_id)", false), C18190wL.A0G(PhotoSyncReminder.class, "photo_sync_reminder(identity_id:$identity_id)", false), C18190wL.A0G(DeletePhotoReminder.class, "delete_photo_reminder(identity_id:$identity_id)", false), C18190wL.A0G(UsernameSyncReminder.class, "username_sync_reminder(identity_id:$identity_id)", false)};
            }
        }

        public final class EditNameUri extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"error", "uri"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(BciReminderContent.class, "bci_reminder_content", false), EditNameUri.class, "edit_name_uri(identity_id:$identity_id,is_mobile:true)", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(BusinessPresence.class, "business_presence", false), FxIdentityManagement.class, "fx_identity_management", false);
    }
}
