package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PAYTextWithEntitiesFragmentImpl extends TreeJNI implements C81204nM {

    public final class ColorRanges extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"length", "offset", "usage_color_enum"};
        }
    }

    public final class InlineStyleRanges extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18230wP.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(InlineStyleRanges.class, "inline_style_ranges", true), ColorRanges.class, "color_ranges", true);
    }

    public final String[] getScalarFields() {
        return C18210wN.A1a();
    }
}
