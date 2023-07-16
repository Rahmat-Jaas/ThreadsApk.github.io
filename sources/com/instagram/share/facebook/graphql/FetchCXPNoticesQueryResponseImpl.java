package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C313425p;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchCXPNoticesQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpFetchNoticeUser extends TreeJNI implements C81204nM {

        public final class NoticeEligibility extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"bloks_app_id", "client_rules", "client_session_id", "entrypoint", "logging_id", "variant"};
            }

            public final C313425p A00() {
                return (C313425p) getEnumValue("variant", C313425p.A0O);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(NoticeEligibility.class, "notice_eligibility(entrypoints:$entrypoints,metadata:$metadata)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpFetchNoticeUser.class, "xcxp_fetch_notice_user");
    }
}
