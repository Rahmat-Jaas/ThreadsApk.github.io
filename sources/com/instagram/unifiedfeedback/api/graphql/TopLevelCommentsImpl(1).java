package com.instagram.unifiedfeedback.api.graphql;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class TopLevelCommentsImpl extends TreeJNI implements C81204nM {

    public final class Nodes extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBCommentImpl.class};
        }
    }

    public final class PageInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"end_cursor", "has_next_page"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"count"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(PageInfo.class, "page_info", false), Nodes.class, "nodes", true);
    }
}
