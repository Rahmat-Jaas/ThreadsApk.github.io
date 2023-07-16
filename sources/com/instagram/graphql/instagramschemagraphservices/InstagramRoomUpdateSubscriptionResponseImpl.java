package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class InstagramRoomUpdateSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class RoomsUpdate extends TreeJNI implements C81204nM {

        public final class IgRoomLink extends TreeJNI implements C81204nM {

            public final class ActiveParticipants extends TreeJNI implements C81204nM {

                public final class IgUsers extends TreeJNI implements C81204nM {

                    public final class ProfilePicture extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return C18230wP.A1Z();
                        }
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"id", "instagram_user_id", FXPFAccessLibraryDebugFragment.NAME, C61963Wn.A00()};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(IgUsers.class, "ig_users");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ActiveParticipants.class, "active_participants");
            }

            public final Class[] getInlineClasses() {
                return new Class[]{IGRoomLinkImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"action", "publish_time_ms"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IgRoomLink.class, "ig_room_link");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(RoomsUpdate.class, "xfb_joinable_ig_rooms_update_subscribe(data:$input)");
    }
}
