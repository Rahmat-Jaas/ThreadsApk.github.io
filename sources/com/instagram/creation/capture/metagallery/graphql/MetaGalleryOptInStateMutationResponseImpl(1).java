package com.instagram.creation.capture.metagallery.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class MetaGalleryOptInStateMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class MetaGallerySetOptInStatus extends TreeJNI implements C81204nM {

        public final class Albums extends TreeJNI implements C81204nM {

            public final class Nodes extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"icon", "id", FXPFAccessLibraryDebugFragment.NAME, "thumbnail", "type"};
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
                return C18180wK.A1a(C18190wL.A0G(Nodes.class, "nodes", true), PageInfo.class, "page_info", false);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"opt_in_status"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Albums.class, "albums(after:$albums_after,first:$albums_first)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(MetaGallerySetOptInStatus.class, "meta_gallery_set_opt_in_status(opt_in_status:$opt_in_state)");
    }
}
