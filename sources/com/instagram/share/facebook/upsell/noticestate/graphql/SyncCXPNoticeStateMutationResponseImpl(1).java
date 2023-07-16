package com.instagram.share.facebook.upsell.noticestate.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class SyncCXPNoticeStateMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpSyncNoticeState extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"impression_count", "last_impression_time", "variant"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XcxpSyncNoticeState.class, "xcxp_sync_notice_state(params:$client_states)");
    }
}
