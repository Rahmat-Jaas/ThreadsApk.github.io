package com.instagram.creation.capture.metagallery.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class MetaGalleryRecentsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class MetaGallery extends TreeJNI implements C81204nM {

        public final class Recents extends TreeJNI implements C81204nM {

            public final class PageInfo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"end_cursor", "has_next_page", "has_previous_page", "start_cursor"};
                }
            }

            public final class Nodes extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PhotoInfoImpl.class, VideoInfoImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"count"};
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Nodes.class, "nodes", true), PageInfo.class, "page_info", false);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"opt_in_status"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Recents.class, C28174Ezk.A00(706));
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(MetaGallery.class, C28174Ezk.A00(95));
    }
}
