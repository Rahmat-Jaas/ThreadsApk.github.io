package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CreateRoomMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class CreateIgNativeRoom extends TreeJNI implements C81204nM {

        public final class IgRoom extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{RoomDataImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IgRoom.class, "ig_room");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CreateIgNativeRoom.class, "create_ig_native_room(data:$input)");
    }
}
