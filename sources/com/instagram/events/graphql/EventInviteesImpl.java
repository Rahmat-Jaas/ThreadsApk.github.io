package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C61943Wl;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.views.maps.IgStaticMapViewManager;

public final class EventInviteesImpl extends TreeJNI implements C81204nM {

    public final class Event extends TreeJNI implements C81204nM {

        public final class Invitees extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"full_name", "id", "profile_pic_url", C61943Wl.A00()};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"cursor"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final class PageInfo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"has_next_page"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(PageInfo.class, "page_info", false), Edges.class, "edges", true);
            }
        }

        public final class InviteesSocialContextObjects extends TreeJNI implements C81204nM {

            public final class SocialContextUsers extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", "profile_pic_url", C61943Wl.A00()};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"rsvp_status", "subtitle", DialogModule.KEY_TITLE};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(SocialContextUsers.class, "social_context_users");
            }
        }

        public final class Location extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"address", "id", IgStaticMapViewManager.LATITUDE_KEY, IgStaticMapViewManager.LONGITUDE_KEY, FXPFAccessLibraryDebugFragment.NAME};
            }
        }

        public final class ProfilePictureObject extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"profile_pic_url"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"custom_location", "event_link", "id", "is_link_sharing_enabled", "time_string", DialogModule.KEY_TITLE, "viewer_status", "visibility"};
        }

        public final class CoHosts extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ProfilePictureObject.class, "profile_picture_object", false), C18190wL.A0G(Location.class, "location", false), C18190wL.A0G(InviteesSocialContextObjects.class, "invitees_social_context_objects(usecase:\"invitee_list\")", true), C18190wL.A0G(CoHosts.class, "co_hosts", true), C18190wL.A0G(Invitees.class, "invitees(invitee_rsvp_status:$rsvp_status,query:$search_query)", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Event.class, "event");
    }
}
