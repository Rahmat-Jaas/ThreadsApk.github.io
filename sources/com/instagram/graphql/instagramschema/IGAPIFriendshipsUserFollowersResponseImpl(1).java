package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148958sd;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAPIFriendshipsUserFollowersResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtApiV1FriendshipsFollowers extends TreeJNI implements C81204nM {

        public final class FriendRequests extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"profile_id", "profile_image", "request_count", "request_count_overflow", AnonymousClass000.A00(209), "sub_text"};
            }
        }

        public final class Users extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{TestFollowerUserImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(FriendRequests.class, "friend_requests", false), Users.class, "users", true);
        }

        public final String[] getScalarFields() {
            return C148958sd.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtApiV1FriendshipsFollowers.class, "xdt_api__v1__friendships__followers(_request_data:{},include_global_blacklist_sample:false,query:$query,search_surface:$search_surface,user_id:$user_id)");
    }
}
