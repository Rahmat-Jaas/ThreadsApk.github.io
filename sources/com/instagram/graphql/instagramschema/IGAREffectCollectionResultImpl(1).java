package com.instagram.graphql.instagramschema;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148088qQ;
import X.C148098qR;
import X.C28085EyH;
import X.C34008Hyp;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGAREffectCollectionResultImpl extends TreeJNI implements C148098qR {

    public final class EffectPage extends TreeJNI implements C28085EyH {

        public final class Effects extends TreeJNI implements C148088qQ {
            public final C34008Hyp A9W() {
                return (C34008Hyp) reinterpret(IGAREffectWWWSchemaImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{IGAREffectWWWSchemaImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"cursor", "has_next"};
        }

        public final String Abt() {
            return getStringValue("cursor");
        }

        public final ImmutableList Af0() {
            return getTreeList("effects", Effects.class);
        }

        public final boolean Alz() {
            return getBooleanValue("has_next");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Effects.class, "effects");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"display_name", AnonymousClass000.A00(1039)};
    }

    public final C28085EyH Aeq() {
        return (C28085EyH) getTreeValue("effect_page(cursor:$cursor)", EffectPage.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(EffectPage.class, "effect_page(cursor:$cursor)");
    }
}
