package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148228qg;
import X.C148238qh;
import X.C148248qi;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18250wR;
import X.C34014Hyv;
import X.C34016Hyx;
import X.C81204nM;
import X.C86104wH;
import X.C966966i;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class NativeMLModelBatchedQueryResponseImpl extends TreeJNI implements C148248qi {

    public final class AimModelBatchedManifest extends TreeJNI implements C148238qh {

        public final class Models extends TreeJNI implements C34014Hyv {

            public final class Properties extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{FXPFAccessLibraryDebugFragment.NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
            }

            public final class Assets extends TreeJNI implements C34016Hyx {

                public final class DeltaCache extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"base_md5", "delta_url"};
                    }
                }

                public final class Metadata extends TreeJNI implements C148228qg {
                    public final String[] getScalarFields() {
                        return new String[]{"bytecode_version", "file_name", "operators"};
                    }

                    public final String getFileName() {
                        return getStringValue("file_name");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"asset_handle", "cache_key", TraceFieldType.CompressionType, "creation_time", "filesize_bytes", "id", "md5_hash", FXPFAccessLibraryDebugFragment.NAME, "source_content_hash", "url"};
                }

                public final C966966i AYn() {
                    return (C966966i) C86104wH.A0a(this, C966966i.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, TraceFieldType.CompressionType);
                }

                public final int AiL() {
                    return getIntValue("filesize_bytes");
                }

                public final String Ato() {
                    return getStringValue("md5_hash");
                }

                public final C148228qg AvW() {
                    return (C148228qg) getTreeValue("metadata", Metadata.class);
                }

                public final String BCs() {
                    return getStringValue("source_content_hash");
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(Metadata.class, "metadata", false), DeltaCache.class, "delta_cache", true);
                }

                public final String getUrl() {
                    return getStringValue("url");
                }

                public final String getId() {
                    return C18250wR.A0X(this);
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

        public final ImmutableList AwH() {
            return getTreeList("models", Models.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Models.class, "models");
        }
    }

    public final C148238qh AQ2() {
        return (C148238qh) getTreeValue("aim_model_batched_manifest(client_capability_metadata:$client_capability_metadata,model_request_metadatas:$model_request_metadatas)", AimModelBatchedManifest.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AimModelBatchedManifest.class, "aim_model_batched_manifest(client_capability_metadata:$client_capability_metadata,model_request_metadatas:$model_request_metadatas)");
    }
}
