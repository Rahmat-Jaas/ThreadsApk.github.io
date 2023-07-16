package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class CoWatchCatalogQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FbInstagramCowatchCatalog extends TreeJNI implements C81204nM {

        public final class Catalog extends TreeJNI implements C81204nM {

            public final class Items extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{CoWatchCatalogMovieImpl.class, CoWatchCatalogShowImpl.class, CoWatchCatalogVideoImpl.class};
                }
            }

            public final class PageInfo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"end_cursor", "has_next_page"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Items.class, DialogModule.KEY_ITEMS, true), PageInfo.class, "page_info", false);
            }
        }

        public final class Curated extends TreeJNI implements C81204nM {

            public final class Content extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{CoWatchCatalogMovieImpl.class, CoWatchCatalogShowImpl.class, CoWatchCatalogVideoImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Content.class, "content");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"needs_age"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Curated.class, "curated", false), Catalog.class, "catalog(after:$after,first:$first)", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbInstagramCowatchCatalog.class, "fb_instagram_cowatch_catalog");
    }
}
