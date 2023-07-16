package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EndRoomMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class EndIgRoomCall extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EndIgRoomCall.class, "end_ig_room_call(data:$input)");
    }
}
