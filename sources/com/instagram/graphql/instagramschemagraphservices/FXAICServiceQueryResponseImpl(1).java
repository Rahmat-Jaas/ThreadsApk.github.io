package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class FXAICServiceQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxAccounts extends TreeJNI implements C81204nM {

        public final class PlatformInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"type"};
            }
        }

        public final class RawServicesSettingsWithObid extends TreeJNI implements C81204nM {

            public final class Services extends TreeJNI implements C81204nM {

                public final class CustomServiceData extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{CustomServiceDataObjectImpl.class};
                    }
                }

                public final class ExtraClientCacheData extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"data_key", "data_value"};
                    }
                }

                public final class IdentityMapping extends TreeJNI implements C81204nM {

                    public final class DestinationIdentities extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"identity_id", "identity_type", "obfuscated_identity_id"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"source_identity_id"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(DestinationIdentities.class, "destination_identities");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"service_name", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(ExtraClientCacheData.class, "extra_client_cache_data", true), C18190wL.A0G(CustomServiceData.class, "custom_service_data", false), C18190wL.A0G(IdentityMapping.class, "identity_mapping", true)};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Services.class, "services");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PlatformInfo.class, "platform_info", false), RawServicesSettingsWithObid.class, "raw_services_settings_with_obid(caller_name:$caller_name,custom_partner_params:$custom_partner_params,service_names:$service_names)", false);
        }

        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final class FxAic extends TreeJNI implements C81204nM {

        public final class Accounts extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"account_type", "badge_count", "id", "identity_type", "instagram_id", FXPFAccessLibraryDebugFragment.NAME, "obfuscated_id", "profile_picture_url", C61963Wn.A01(22, 8, 61)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Accounts.class, "accounts");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(FxAic.class, "fx_aic(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],family_device_id:$family_device_id)", false), FxAccounts.class, "fx_accounts", true);
    }
}
