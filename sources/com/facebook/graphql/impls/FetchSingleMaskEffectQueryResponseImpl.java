package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchSingleMaskEffectQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchMaskEffect extends TreeJNI implements C81204nM {

        public final class BestInstance extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{EffectBestInstanceFragmentImpl.class};
            }
        }

        public final class Thumbnail extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18230wP.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Thumbnail.class, "thumbnail", false), BestInstance.class, C28174Ezk.A00(465), false);
        }

        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchMaskEffect.class, "fetch__MaskEffect(id:$id)");
    }
}
