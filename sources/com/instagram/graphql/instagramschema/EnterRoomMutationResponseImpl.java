package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C84894uB;
import X.C85044uQ;
import com.facebook.pando.TreeJNI;

public final class EnterRoomMutationResponseImpl extends TreeJNI implements C85044uQ {

    public final class EnterIgRoomMutation extends TreeJNI implements C84894uB {
        public final String[] getScalarFields() {
            return new String[]{"actor_id", "client_mutation_id", "success"};
        }
    }

    public final C84894uB Afw() {
        return (C84894uB) getTreeValue("enter_ig_room_mutation(data:$input)", EnterIgRoomMutation.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EnterIgRoomMutation.class, "enter_ig_room_mutation(data:$input)");
    }
}
