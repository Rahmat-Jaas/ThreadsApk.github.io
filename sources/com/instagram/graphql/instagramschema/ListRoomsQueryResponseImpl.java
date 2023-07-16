package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ListRoomsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class ListIgRoomsQuery extends TreeJNI implements C81204nM {

        public final class IgRooms extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{RoomDataImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(IgRooms.class, "ig_rooms");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ListIgRoomsQuery.class, "list_ig_rooms_query(data:$data)");
    }
}
