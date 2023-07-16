package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class InstagramRoomCreationSubscriptionResponseImpl extends TreeJNI implements C81204nM {

    public final class RoomsCreation extends TreeJNI implements C81204nM {

        public final class IgRoomLink extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{IGRoomLinkImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"publish_time_ms"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IgRoomLink.class, "ig_room_link");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(RoomsCreation.class, "xfb_joinable_ig_rooms_create_subscribe(data:$input)");
    }
}
