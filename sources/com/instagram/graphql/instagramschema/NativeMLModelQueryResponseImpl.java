package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass20D;
import X.AnonymousClass21A;
import X.C108776iv;
import X.C148258qj;
import X.C148268qk;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C41855Mf4;
import X.C41856Mf5;
import X.C41865MfE;
import X.C41866MfF;
import X.C41867MfG;
import X.C86104wH;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class NativeMLModelQueryResponseImpl extends TreeJNI implements C148268qk {

    public final class AimModelManifest extends TreeJNI implements C41867MfG {

        public final class Models extends TreeJNI implements C41865MfE {

            public final class Assets extends TreeJNI implements C41866MfF {

                public final class DeltaCache extends TreeJNI implements C41855Mf4 {
                    public final String[] getScalarFields() {
                        return new String[]{"base_md5", "delta_url"};
                    }

                    public final String AT4() {
                        return getStringValue("base_md5");
                    }

                    public final String Acp() {
                        return getStringValue("delta_url");
                    }
                }

                public final class Metadata extends TreeJNI implements C148258qj {
                    public final String[] getScalarFields() {
                        return new String[]{"bytecode_version", "file_name", "operators"};
                    }

                    public final int AUo() {
                        return getIntValue("bytecode_version");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"asset_handle", "cache_key", TraceFieldType.CompressionType, "creation_time", "filesize_bytes", "md5_hash", FXPFAccessLibraryDebugFragment.NAME, "url"};
                }

                public final String ARR() {
                    return getStringValue("asset_handle");
                }

                public final String AUt() {
                    return getStringValue("cache_key");
                }

                public final String Aac() {
                    return getStringValue("creation_time");
                }

                public final ImmutableList Aco() {
                    return getTreeList("delta_cache", DeltaCache.class);
                }

                public final String Ato() {
                    return getStringValue("md5_hash");
                }

                public final C148258qj AvX() {
                    return (C148258qj) getTreeValue("metadata", Metadata.class);
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(Metadata.class, "metadata", false), DeltaCache.class, "delta_cache", true);
                }

                public final String getUrl() {
                    return getStringValue("url");
                }

                public final String getName() {
                    return C18220wO.A0l(this);
                }
            }

            public final class Properties extends TreeJNI implements C41856Mf5 {
                public final String[] getScalarFields() {
                    return new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }

                public final String getValue() {
                    return getStringValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                }

                public final String getName() {
                    return C18220wO.A0l(this);
                }
            }

            public final String[] getScalarFields() {
                return new String[]{FXPFAccessLibraryDebugFragment.NAME, ClientCookie.VERSION_ATTR};
            }

            public final ImmutableList ARW() {
                return getTreeList("assets", Assets.class);
            }

            public final ImmutableList B4v() {
                return getTreeList("properties", Properties.class);
            }

            public final boolean BOm() {
                return hasFieldValue(ClientCookie.VERSION_ATTR);
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Assets.class, "assets", true), Properties.class, "properties", true);
            }

            public final int getVersion() {
                return getIntValue(ClientCookie.VERSION_ATTR);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"asset_count", "entry_point", "model_count", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "status_details"};
        }

        public final int ARQ() {
            return getIntValue("asset_count");
        }

        public final AnonymousClass20D Ag1() {
            return (AnonymousClass20D) C86104wH.A0a(this, AnonymousClass20D.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "entry_point");
        }

        public final int AwB() {
            return getIntValue("model_count");
        }

        public final ImmutableList AwH() {
            return getTreeList("models", Models.class);
        }

        public final AnonymousClass21A BDk() {
            return (AnonymousClass21A) C86104wH.A0a(this, AnonymousClass21A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        }

        public final String BDo() {
            return getStringValue("status_details");
        }

        public final boolean BNi() {
            return hasFieldValue("asset_count");
        }

        public final boolean BOF() {
            return hasFieldValue("model_count");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Models.class, "models");
        }
    }

    public final C41867MfG AQ3() {
        return (C41867MfG) getTreeValue("aim_model_manifest(client_capability_metadata:$client_capability_metadata,model_request_metadata:$model_request_metadata)", AimModelManifest.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AimModelManifest.class, "aim_model_manifest(client_capability_metadata:$client_capability_metadata,model_request_metadata:$model_request_metadata)");
    }
}
