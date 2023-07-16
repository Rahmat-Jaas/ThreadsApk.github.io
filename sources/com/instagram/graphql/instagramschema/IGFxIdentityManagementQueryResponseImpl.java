package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass219;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import X.C84904uC;
import X.C84914uD;
import X.C84924uE;
import X.C85214uh;
import X.C85224ui;
import X.C85234uj;
import X.C85244uk;
import X.C85254ul;
import X.C85264um;
import X.C85274un;
import X.C85284uo;
import X.C85494vH;
import X.C85504vI;
import X.C85514vJ;
import X.C85524vK;
import X.C85534vL;
import X.C85544vM;
import X.C85624vV;
import X.C85634vW;
import X.C85694vc;
import X.C85724vf;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;

public final class IGFxIdentityManagementQueryResponseImpl extends TreeJNI implements C85634vW {

    public final class BusinessPresence extends TreeJNI implements C85214uh {
        public final String[] getScalarFields() {
            return new String[]{"is_bci"};
        }

        public final boolean Apn() {
            return getBooleanValue("is_bci");
        }
    }

    public final class FxIdentityManagement extends TreeJNI implements C85694vc {

        public final class Identities extends TreeJNI implements C85224ui {

            public final class Results extends TreeJNI implements C85504vI {

                public final class Accounts extends TreeJNI implements C85494vH {

                    public final class Account extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"platform_name"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"is_silhouette", "profile_picture_url"};
                    }

                    public final boolean Aq8() {
                        return getBooleanValue("is_silhouette");
                    }

                    public final String B4V() {
                        return getStringValue("profile_picture_url");
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Account.class, "account");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"synced_resources"};
                }

                public final ImmutableList AOa() {
                    return getTreeList("accounts", Accounts.class);
                }

                public final ImmutableList BFJ() {
                    return getEnumList("synced_resources", AnonymousClass219.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(Accounts.class, "accounts");
                }
            }

            public final ImmutableList B7y() {
                return getTreeList("results", Results.class);
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Results.class, "results");
            }
        }

        public final class ProfilePhotoReminderInfo extends TreeJNI implements C85514vJ {
            public final String[] getScalarFields() {
                return new String[]{"is_synced", "should_remind"};
            }

            public final boolean AqA() {
                return getBooleanValue("is_synced");
            }

            public final boolean BBJ() {
                return getBooleanValue("should_remind");
            }
        }

        public final class ScreenResources extends TreeJNI implements C85724vf {

            public final class IgSoapUsernameReminderTextWithEntities extends TreeJNI implements C81204nM {

                public final class InlineStyleRanges extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1b();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(InlineStyleRanges.class, "inline_style_ranges");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"ig_initial_photo_reminder_header_text", "ig_initial_photo_reminder_supporting_text", "ig_photo_persistent_reminder_header_text", "ig_photo_persistent_reminder_remove_button_text", "ig_photo_persistent_reminder_sub_header_text", "ig_remove_photo_reminder_body_text", "ig_remove_photo_reminder_header_text", "ig_remove_photo_reminder_remove_button_text", "name_update_reminder_primary_button_text", "reminders_cancel_text", "reminders_manage_settings_text", "reminders_ok_text", "screen_custom_resource(screen_resource_name:\"reminder_new_profile_photo\")", "screen_custom_resource(screen_resource_name:\"reminder_remove_photo\")", "screen_custom_resource(screen_resource_name:\"reminders_cancel_btn\")", "screen_custom_resource(screen_resource_name:\"reminders_change_photo_btn_updated\")", "screen_custom_resource(screen_resource_name:\"reminders_change_photo_description\")", "screen_custom_resource(screen_resource_name:\"reminders_change_photo_title\")", "screen_custom_resource(screen_resource_name:\"reminders_manage_sync_settings\")", "screen_custom_resource(screen_resource_name:\"reminders_photo_bottom_sheet_remove_photo_button\")", "screen_custom_resource(screen_resource_name:\"reminders_photo_bottom_sheet_title\")", "screen_custom_resource(screen_resource_name:\"reminders_remove_photo_description\")", "screen_custom_resource(screen_resource_name:\"reminders_remove_photo_remove_btn\")", "screen_custom_resource(screen_resource_name:\"reminders_remove_photo_title\")"};
            }

            public final String Ao8() {
                return getStringValue("ig_photo_persistent_reminder_remove_button_text");
            }

            public final String Ao9() {
                return getStringValue("ig_remove_photo_reminder_remove_button_text");
            }

            public final String B6j() {
                return getStringValue("screen_custom_resource(screen_resource_name:\"reminder_new_profile_photo\")");
            }

            public final String B6k() {
                return getStringValue("reminders_cancel_text");
            }

            public final String B6l() {
                return getStringValue("screen_custom_resource(screen_resource_name:\"reminders_change_photo_btn_updated\")");
            }

            public final String B6m() {
                return getStringValue("reminders_manage_settings_text");
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(IgSoapUsernameReminderTextWithEntities.class, "ig_soap_username_reminder_text_with_entities");
            }
        }

        public final class UsernameReminderInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_synced", "should_remind"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"can_see_fxim", "can_see_native_reminders"};
        }

        public final boolean AVp() {
            return getBooleanValue("can_see_fxim");
        }

        public final boolean AVq() {
            return getBooleanValue("can_see_native_reminders");
        }

        public final C85224ui AnY() {
            return (C85224ui) getTreeValue("identities", Identities.class);
        }

        public final C85514vJ B4J() {
            return (C85514vJ) getTreeValue("fxim_reminder_info(field:\"PROFILE_PHOTO\")", ProfilePhotoReminderInfo.class);
        }

        public final C85724vf B92() {
            return (C85724vf) getTreeValue("screen_resources", ScreenResources.class);
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ProfilePhotoReminderInfo.class, "fxim_reminder_info(field:\"PROFILE_PHOTO\")", false), C18190wL.A0G(UsernameReminderInfo.class, "fxim_reminder_info(field:\"USERNAME\")", false), C18190wL.A0G(ScreenResources.class, "screen_resources", false), C18190wL.A0G(Identities.class, "identities", false)};
        }
    }

    public final class FximViewerIdentity extends TreeJNI implements C85624vV {

        public final class NameUpdateInterstitialReminder extends TreeJNI implements C84924uE {
            public final String[] getScalarFields() {
                return new String[]{"manage_destination"};
            }

            public final class Body extends TreeJNI implements C84904uC {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class ManageLabel extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C84914uD {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Body.class, "body", false), C18190wL.A0G(ManageLabel.class, "manage_label", false)};
            }
        }

        public final class NameUpdatePassiveReminder extends TreeJNI implements C81204nM {

            public final class Body extends TreeJNI implements C81204nM {

                public final class Ranges extends TreeJNI implements C81204nM {

                    public final class Entity extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"url"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"length", "offset"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Entity.class, "entity");
                    }
                }

                public final class InlineStyleRanges extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1b();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(InlineStyleRanges.class, "inline_style_ranges", true), Ranges.class, "ranges", true);
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), Body.class, "body", false);
            }
        }

        public final class PhotoDeleteInterstitialReminder extends TreeJNI implements C85524vK {

            public final class Body extends TreeJNI implements C85234uj {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C85244uk {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"manage_destination"};
            }

            public final class ManageLabel extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C85234uj ATk() {
                return (C85234uj) getTreeValue("body", Body.class);
            }

            public final C85244uk BGz() {
                return (C85244uk) getTreeValue(DialogModule.KEY_TITLE, Title.class);
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Body.class, "body", false), C18190wL.A0G(ManageLabel.class, "manage_label", false)};
            }
        }

        public final class PhotoUpdateInterstitialReminder extends TreeJNI implements C85534vL {

            public final class Body extends TreeJNI implements C85254ul {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C85264um {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"manage_destination"};
            }

            public final class ManageLabel extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C85254ul ATl() {
                return (C85254ul) getTreeValue("body", Body.class);
            }

            public final C85264um BH0() {
                return (C85264um) getTreeValue(DialogModule.KEY_TITLE, Title.class);
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Body.class, "body", false), C18190wL.A0G(ManageLabel.class, "manage_label", false)};
            }
        }

        public final class PhotoUpdatePassiveReminder extends TreeJNI implements C85544vM {

            public final class Body extends TreeJNI implements C85274un {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C85284uo {
                public final String BFt() {
                    return getStringValue("text");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"manage_destination"};
            }

            public final class ManageLabel extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C85274un ATm() {
                return (C85274un) getTreeValue("body", Body.class);
            }

            public final C85284uo BH1() {
                return (C85284uo) getTreeValue(DialogModule.KEY_TITLE, Title.class);
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Body.class, "body", false), C18190wL.A0G(ManageLabel.class, "manage_label", false)};
            }
        }

        public final class UsernameUpdateReminder extends TreeJNI implements C81204nM {

            public final class Body extends TreeJNI implements C81204nM {

                public final class Ranges extends TreeJNI implements C81204nM {

                    public final class Entity extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"url"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"length", "offset"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Entity.class, "entity");
                    }
                }

                public final class InlineStyleRanges extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1b();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(InlineStyleRanges.class, "inline_style_ranges", true), Ranges.class, "ranges", true);
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), Body.class, "body", false);
            }
        }

        public final C85524vK B1N() {
            return (C85524vK) getTreeValue("reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"DELETE_INTERSTITIAL\")", PhotoDeleteInterstitialReminder.class);
        }

        public final C85534vL B1U() {
            return (C85534vL) getTreeValue("reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"UPDATE_INTERSTITIAL\")", PhotoUpdateInterstitialReminder.class);
        }

        public final C85544vM B1V() {
            return (C85544vM) getTreeValue("reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"UPDATE_PASSIVE\")", PhotoUpdatePassiveReminder.class);
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(PhotoUpdatePassiveReminder.class, "reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"UPDATE_PASSIVE\")", false), C18190wL.A0G(PhotoUpdateInterstitialReminder.class, "reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"UPDATE_INTERSTITIAL\")", false), C18190wL.A0G(PhotoDeleteInterstitialReminder.class, "reminder(field:\"PROFILE_PHOTO\",interface:\"IG_ANDROID\",type:\"DELETE_INTERSTITIAL\")", false), C18190wL.A0G(UsernameUpdateReminder.class, "reminder(field:\"USERNAME\",interface:\"IG_ANDROID\",type:\"UPDATE_PASSIVE\")", false), C18190wL.A0G(NameUpdatePassiveReminder.class, "reminder(field:\"NAME\",interface:\"IG_ANDROID\",type:\"UPDATE_PASSIVE\")", false), C18190wL.A0G(NameUpdateInterstitialReminder.class, "reminder(field:\"NAME\",interface:\"IG_ANDROID\",type:\"UPDATE_INTERSTITIAL\")", false)};
        }
    }

    public final C85214uh AUa() {
        return (C85214uh) getTreeValue("business_presence", BusinessPresence.class);
    }

    public final C85694vc AkP() {
        return (C85694vc) getTreeValue("fx_identity_management", FxIdentityManagement.class);
    }

    public final C85624vV AkW() {
        return (C85624vV) getTreeValue("fxim_viewer_identity", FximViewerIdentity.class);
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(BusinessPresence.class, "business_presence", false), C18190wL.A0G(FxIdentityManagement.class, "fx_identity_management", false), C18190wL.A0G(FximViewerIdentity.class, "fxim_viewer_identity", false)};
    }
}
