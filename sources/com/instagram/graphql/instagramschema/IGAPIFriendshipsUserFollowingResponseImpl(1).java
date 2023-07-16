package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148958sd;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAPIFriendshipsUserFollowingResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtApiV1FriendshipsFollowing extends TreeJNI implements C81204nM {

        public final class Users extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{TestFollowerUserImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Users.class, "users", true)};
        }

        public final String[] getScalarFields() {
            return C148958sd.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtApiV1FriendshipsFollowing.class, "xdt_api__v1__friendships__following(_request_data:{},enable_groups:false,query:$query,user_id:$user_id)");
    }
}
