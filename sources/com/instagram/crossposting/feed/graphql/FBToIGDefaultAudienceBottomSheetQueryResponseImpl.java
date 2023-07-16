package com.instagram.crossposting.feed.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class FBToIGDefaultAudienceBottomSheetQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpGetFeedCrosspostingAudienceConsentContent extends TreeJNI implements C81204nM {

        public final class ButtonLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"primary", "secondary"};
            }
        }

        public final class Description extends TreeJNI implements C81204nM {

            public final class Ranges extends TreeJNI implements C81204nM {

                public final class Entity extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"url"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"length", "offset"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Entity.class, "entity");
                }
            }

            public final class InlineStyleRanges extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18230wP.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(InlineStyleRanges.class, "inline_style_ranges", true), Ranges.class, "ranges", true);
            }

            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class ToasterStylised extends TreeJNI implements C81204nM {

            public final class InlineStyleRanges extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18230wP.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(InlineStyleRanges.class, "inline_style_ranges");
            }

            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"footer", "future_post_audience", DialogModule.KEY_TITLE, "toaster"};
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Description.class, DevServerEntity.COLUMN_DESCRIPTION, true), C18190wL.A0G(ButtonLabel.class, "button_label", false), C18190wL.A0G(ToasterStylised.class, "toaster_stylised", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpGetFeedCrosspostingAudienceConsentContent.class, "xcxp_get_feed_crossposting_audience_consent_content");
    }
}
