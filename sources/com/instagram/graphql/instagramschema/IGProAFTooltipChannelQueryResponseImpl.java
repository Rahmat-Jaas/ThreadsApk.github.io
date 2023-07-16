package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IGProAFTooltipChannelQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbAymtInstagramGraphqlChannelTip extends TreeJNI implements C81204nM {

        public final class Specs extends TreeJNI implements C81204nM {

            public final class Title extends TreeJNI implements C81204nM {

                public final class Text extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18210wN.A1a();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Text.class, "text");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Title.class, DialogModule.KEY_TITLE);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"channel_id", "id", "tip_id", "tip_name"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Specs.class, "specs");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XfbAymtInstagramGraphqlChannelTip.class, "xfb_aymt_instagram_graphql_channel_tip(input:$input)");
    }
}
