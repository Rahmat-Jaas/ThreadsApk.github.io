package com.instagram.clips.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ClipsProfileQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtUserClipsGraphql extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ClipsProfileFragmentImpl.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtUserClipsGraphql.class, "xdt_user_clips_graphql(data:$data)");
    }
}
