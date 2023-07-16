package com.instagram.direct.fragment.stickertray.graphql;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGGenerateText2StickersResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbPairGenerateText2stickers extends TreeJNI implements C81204nM {

        public final class Stickers extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "url"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Stickers.class, "stickers");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbPairGenerateText2stickers.class, AnonymousClass000.A00(1181));
    }
}
