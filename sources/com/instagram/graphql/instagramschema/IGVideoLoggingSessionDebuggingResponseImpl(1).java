package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGVideoLoggingSessionDebuggingResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchXFBVideoPlaySessionObjectFetch extends TreeJNI implements C81204nM {

        public final class PlayCount extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"frame_based", "legacy", "snapl"};
            }
        }

        public final class TimeSpent extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"frame_based", "legacy", "snapl"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"id", "is_legacy_session_found", "is_snapl_session_found"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(TimeSpent.class, "time_spent", false), PlayCount.class, "play_count", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchXFBVideoPlaySessionObjectFetch.class, "fetch__XFBVideoPlaySessionObjectFetch(id:$id)");
    }
}
