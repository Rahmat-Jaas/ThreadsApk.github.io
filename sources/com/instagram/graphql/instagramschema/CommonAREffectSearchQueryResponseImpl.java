package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C147928qA;
import X.C147938qB;
import X.C148378qv;
import X.C148388qw;
import X.C18180wK;
import X.C18190wL;
import X.C34020Hz1;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class CommonAREffectSearchQueryResponseImpl extends TreeJNI implements C147938qB {

    public final class CommonArEffectSearch extends TreeJNI implements C148388qw {

        public final class Nodes extends TreeJNI implements C147928qA {
            public final C34020Hz1 A9M() {
                return (C34020Hz1) reinterpret(CommonAREffectImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{CommonAREffectImpl.class};
            }
        }

        public final class PageInfo extends TreeJNI implements C148378qv {
            public final String[] getScalarFields() {
                return new String[]{"end_cursor", "has_next_page"};
            }

            public final String Afk() {
                return getStringValue("end_cursor");
            }

            public final boolean Am0() {
                return getBooleanValue("has_next_page");
            }
        }

        public final ImmutableList Axf() {
            return getTreeList("nodes", Nodes.class);
        }

        public final C148378qv Azr() {
            return (C148378qv) getTreeValue("page_info", PageInfo.class);
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PageInfo.class, "page_info", false), Nodes.class, "nodes", true);
        }
    }

    public final C148388qw AYY() {
        return (C148388qw) getTreeValue("common_ar_effect_search(after:$cursor,context:$context,device_capabilities:$device_capabilities,first:$page_size,query:$query,surface:$surface)", CommonArEffectSearch.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(CommonArEffectSearch.class, "common_ar_effect_search(after:$cursor,context:$context,device_capabilities:$device_capabilities,first:$page_size,query:$query,surface:$surface)");
    }
}
