package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class UpdateAutoCrossPostingSettingMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpUnifiedCrosspostingConfigsMutationRoot extends TreeJNI implements C81204nM {

        public final class XcxpUnifiedCrosspostingConfigResponse extends TreeJNI implements C81204nM {

            public final class AccountLinkingConfigs extends TreeJNI implements C81204nM {

                public final class CrosspostSettings extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{XpostingUnifiedConfigCrosspostingSettingImpl.class};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"destination_app"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(CrosspostSettings.class, "crosspost_settings");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(AccountLinkingConfigs.class, "account_linking_configs");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"actor_id", "client_mutation_id"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(XcxpUnifiedCrosspostingConfigResponse.class, "xcxp_unified_crossposting_config_response");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpUnifiedCrosspostingConfigsMutationRoot.class, "xcxp_unified_crossposting_configs_mutation_root(mutation_request:$configs_request)");
    }
}
