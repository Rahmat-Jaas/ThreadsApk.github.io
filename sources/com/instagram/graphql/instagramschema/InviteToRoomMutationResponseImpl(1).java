package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class InviteToRoomMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class InviteToIgRoom extends TreeJNI implements C81204nM {

        public final class ActualInvitedIgUsers extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"instagram_user_id", C61963Wn.A00()};
            }
        }

        public final class IgRoom extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{RoomDataImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"actor_id", "client_mutation_id", "success"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(ActualInvitedIgUsers.class, "actual_invited_ig_users", true), IgRoom.class, "ig_room", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(InviteToIgRoom.class, "invite_to_ig_room(data:$input)");
    }
}
