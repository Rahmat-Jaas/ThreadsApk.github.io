package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148308qo;
import X.C148318qp;
import X.C148328qq;
import X.C41868MfH;
import com.facebook.pando.TreeJNI;

public final class ResolveRoomLinkQueryResponseImpl extends TreeJNI implements C148328qq {

    public final class ResolveIgRoomLinkQuery extends TreeJNI implements C148318qp {

        public final class IgRoom extends TreeJNI implements C148308qo {
            public final C41868MfH A9k() {
                return (C41868MfH) reinterpret(RoomDataImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{RoomDataImpl.class};
            }
        }

        public final C148308qo AoA() {
            return (C148308qo) getTreeValue("ig_room", IgRoom.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IgRoom.class, "ig_room");
        }
    }

    public final C148318qp B7i() {
        return (C148318qp) getTreeValue("resolve_ig_room_link_query(data:$data)", ResolveIgRoomLinkQuery.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ResolveIgRoomLinkQuery.class, "resolve_ig_room_link_query(data:$data)");
    }
}
