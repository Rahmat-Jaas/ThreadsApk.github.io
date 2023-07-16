package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ReelsTogetherJoinInboxQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class InstagramReelsTogetherInboxSnapshot extends TreeJNI implements C81204nM {

        public final class ThreadReelsTogetherData extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"has_rt_session", C28174Ezk.A00(703), C28174Ezk.A00(117)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(ThreadReelsTogetherData.class, "thread_reels_together_data");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(InstagramReelsTogetherInboxSnapshot.class, "InstagramReelsTogetherInboxSnapshot(request:{\"ig_thread_fb_ids\":$id})");
    }
}
