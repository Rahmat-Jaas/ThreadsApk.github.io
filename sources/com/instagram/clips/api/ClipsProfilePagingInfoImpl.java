package com.instagram.clips.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ClipsProfilePagingInfoImpl extends TreeJNI implements C81204nM {

    public final class PagingInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"max_id", "more_available"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PagingInfo.class, "paging_info");
    }
}
