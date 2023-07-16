package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CrosspostingUnifiedConfigsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpUnifiedCrosspostingConfigsRoot extends TreeJNI implements C81204nM {

        public final class AccountLinkingConfigs extends TreeJNI implements C81204nM {

            public final class CloseFriendsXpostSettings extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{XpostingUnifiedConfigCrosspostingSettingImpl.class};
                }
            }

            public final class CrosspostSettings extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{XpostingUnifiedConfigCrosspostingSettingImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"destination_app"};
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(CrosspostSettings.class, "crosspost_settings", true), CloseFriendsXpostSettings.class, "close_friends_xpost_settings", true);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(AccountLinkingConfigs.class, "account_linking_configs");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpUnifiedCrosspostingConfigsRoot.class, "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)");
    }
}
