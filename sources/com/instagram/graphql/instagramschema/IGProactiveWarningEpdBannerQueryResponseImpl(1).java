package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IGProactiveWarningEpdBannerQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgProactiveWarningEpdBannerQuery extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"banner_position", "button_layout", "context", "flow_type", "primary_button_style", "secondary_button_style"};
        }

        public final class PrimaryButtonAccessibilityLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class PrimaryButtonLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class SecondaryButtonAccessibilityLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class SecondaryButtonLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class Subtitle extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class Title extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Subtitle.class, "subtitle", false), C18190wL.A0G(PrimaryButtonLabel.class, "primary_button_label", false), C18190wL.A0G(PrimaryButtonAccessibilityLabel.class, "primary_button_accessibility_label", false), C18190wL.A0G(SecondaryButtonLabel.class, "secondary_button_label", false), C18190wL.A0G(SecondaryButtonAccessibilityLabel.class, "secondary_button_accessibility_label", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgProactiveWarningEpdBannerQuery.class, "ig_proactive_warning_epd_banner_query(target_user_id:$target_user_id)");
    }
}
