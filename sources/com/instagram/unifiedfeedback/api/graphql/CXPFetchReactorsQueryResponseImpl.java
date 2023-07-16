package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CXPFetchReactorsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpFetchFeedback extends TreeJNI implements C81204nM {

        public final class InlineXFBFeedback extends TreeJNI implements C81204nM {

            public final class Reactors extends TreeJNI implements C81204nM {

                public final class Edges extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{FBReactorOfContentImpl.class};
                    }
                }

                public final class PageInfo extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"end_cursor", "has_next_page", "has_previous_page", "start_cursor"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(PageInfo.class, "page_info", false), Edges.class, "edges", true);
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Reactors.class, "reactors(after:$after_cursor,first:$page_size)");
            }

            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXFBFeedback.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XcxpFetchFeedback.class, "xcxp_fetch_feedback(content_destinations:$content_destinations,content_source:$content_source,id:$content_id)");
    }
}
