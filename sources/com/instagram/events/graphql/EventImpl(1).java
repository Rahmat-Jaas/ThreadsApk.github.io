package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.views.maps.IgStaticMapViewManager;

public final class EventImpl extends TreeJNI implements C81204nM {

    public final class EventEvent extends TreeJNI implements C81204nM {

        public final class CoHosts extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EventUserInfoImpl.class};
            }
        }

        public final class EventPageButtons extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"button_text", "button_type"};
            }
        }

        public final class InviteesSocialContextObjects extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EventSocialContextImpl.class};
            }
        }

        public final class Location extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"address", "id", IgStaticMapViewManager.LATITUDE_KEY, IgStaticMapViewManager.LONGITUDE_KEY, FXPFAccessLibraryDebugFragment.NAME};
            }
        }

        public final class Owner extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EventUserInfoImpl.class};
            }
        }

        public final class OwnerCohostSocialContext extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EventSocialContextImpl.class};
            }
        }

        public final class ProfilePictureObject extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"profile_pic_url"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"custom_location", DevServerEntity.COLUMN_DESCRIPTION, "emoji_background_unicode", "emoji_profile_unicode", "end_time", "event_link", "id", "is_link_sharing_enabled", TraceFieldType.StartTime, "thread_id", "time_string", DialogModule.KEY_TITLE, "viewer_rsvp_status", "viewer_status", "visibility"};
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Owner.class, "owner", false), C18190wL.A0G(OwnerCohostSocialContext.class, "owner_cohost_social_context", false), C18190wL.A0G(CoHosts.class, "co_hosts", true), C18190wL.A0G(Location.class, "location", false), C18190wL.A0G(ProfilePictureObject.class, "profile_picture_object", false), C18190wL.A0G(InviteesSocialContextObjects.class, "invitees_social_context_objects(usecase:\"event_page\")", true), C18190wL.A0G(EventPageButtons.class, "event_page_buttons", true)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EventEvent.class, "event");
    }
}
