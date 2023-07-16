package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C85194uf;
import X.C85204ug;
import X.C85474vF;
import X.C85484vG;
import X.C85614vU;
import X.C85674va;
import X.C85684vb;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;

public final class IGFXIMNUXConfigQueryResponseImpl extends TreeJNI implements C85204ug {

    public final class FxIdentityManagement extends TreeJNI implements C85194uf {

        public final class FxIgNuxConfig extends TreeJNI implements C85484vG {

            public final class Content extends TreeJNI implements C85684vb {

                public final class CardContent extends TreeJNI implements C85614vU {
                    public final String[] getScalarFields() {
                        return new String[]{"facebook_name", "facebook_profile_picture_url", "preview_label_text"};
                    }

                    public final String Ah2() {
                        return getStringValue("facebook_name");
                    }

                    public final String Ah4() {
                        return getStringValue("facebook_profile_picture_url");
                    }

                    public final String B2z() {
                        return getStringValue("preview_label_text");
                    }
                }

                public final class FooterContent extends TreeJNI implements C85674va {
                    public final String[] getScalarFields() {
                        return new String[]{"disclosure_text", "help_center_url", "learn_more_text", "primary_button_label", "secondary_button_label"};
                    }

                    public final String AdP() {
                        return getStringValue("disclosure_text");
                    }

                    public final String Amm() {
                        return getStringValue("help_center_url");
                    }

                    public final String Arn() {
                        return getStringValue("learn_more_text");
                    }

                    public final String B3I() {
                        return getStringValue("primary_button_label");
                    }

                    public final String B9J() {
                        return getStringValue("secondary_button_label");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"accounts_to_sync", "body", DialogModule.KEY_TITLE};
                }

                public final ImmutableList AOc() {
                    return getStringList("accounts_to_sync");
                }

                public final String ATn() {
                    return getStringValue("body");
                }

                public final C85614vU AWT() {
                    return (C85614vU) getTreeValue("card_content", CardContent.class);
                }

                public final C85674va AjP() {
                    return (C85674va) getTreeValue("footer_content", FooterContent.class);
                }

                public final String BH2() {
                    return getStringValue(DialogModule.KEY_TITLE);
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(CardContent.class, "card_content", false), FooterContent.class, "footer_content", false);
                }
            }

            public final class Error extends TreeJNI implements C85474vF {
                public final String[] getScalarFields() {
                    return new String[]{DialogModule.KEY_MESSAGE, "primary_button"};
                }

                public final String AvQ() {
                    return getStringValue(DialogModule.KEY_MESSAGE);
                }

                public final String B3H() {
                    return getStringValue("primary_button");
                }
            }

            public final C85684vb AZT() {
                return (C85684vb) getTreeValue("content", Content.class);
            }

            public final C85474vF Ag5() {
                return (C85474vF) getTreeValue("error", Error.class);
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Content.class, "content", false), Error.class, "error", false);
            }
        }

        public final C85484vG AkQ() {
            return (C85484vG) getTreeValue("fx_ig_nux_config", FxIgNuxConfig.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FxIgNuxConfig.class, "fx_ig_nux_config");
        }
    }

    public final C85194uf AkO() {
        return (C85194uf) getTreeValue("fx_identity_management", FxIdentityManagement.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxIdentityManagement.class, "fx_identity_management");
    }
}
