package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148348qs;
import X.C148358qt;
import X.C148368qu;
import X.C41868MfH;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class UpdateRoomMutationResponseImpl extends TreeJNI implements C148368qu {

    public final class UpdateIgNativeRoom extends TreeJNI implements C148358qt {

        public final class IgRoom extends TreeJNI implements C148348qs {
            public final C41868MfH A9k() {
                return (C41868MfH) reinterpret(RoomDataImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{RoomDataImpl.class};
            }
        }

        public final C148348qs AoB() {
            return (C148348qs) getTreeValue("ig_room", IgRoom.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(IgRoom.class, "ig_room");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C148358qt BJd() {
        return (C148358qt) getTreeValue("update_ig_native_room(data:$input)", UpdateIgNativeRoom.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(UpdateIgNativeRoom.class, "update_ig_native_room(data:$input)");
    }
}
