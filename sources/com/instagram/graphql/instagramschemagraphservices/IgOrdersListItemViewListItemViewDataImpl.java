package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IgOrdersListItemViewListItemViewDataImpl extends TreeJNI implements C81204nM {

    public final class StatusWithEntities extends TreeJNI implements C81204nM {

        public final class ColorRanges extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"hex_rgb_color_with_pound_key"};
            }
        }

        public final class CssFontWeightRanges extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"font_weight"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(ColorRanges.class, C18170wI.A00(151), true), CssFontWeightRanges.class, "css_font_weight_ranges", true);
        }

        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"image_shape", "image_uri", "merchant_name", "order_id", "quantity", "status_type", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(StatusWithEntities.class, "status_with_entities");
    }
}
