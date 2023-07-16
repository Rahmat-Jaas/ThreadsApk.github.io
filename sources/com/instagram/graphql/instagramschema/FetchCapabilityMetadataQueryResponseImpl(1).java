package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass25Y;
import X.C108776iv;
import X.C147948qC;
import X.C18250wR;
import X.C34010Hyr;
import X.C34017Hyy;
import X.C40306LcC;
import X.C86104wH;
import X.C966766g;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

public final class FetchCapabilityMetadataQueryResponseImpl extends TreeJNI implements C147948qC {

    public final class LatestVersionedCapabilities extends TreeJNI implements C34010Hyr {

        public final class Assets extends TreeJNI implements C34017Hyy {
            public final String[] getScalarFields() {
                return new String[]{"cache_key", TraceFieldType.CompressionType, "filename", "filesize_bytes", "id", "md5_hash", "model_asset_type", "uncompressed_filesize_bytes", "uri"};
            }

            public final String AUt() {
                return getStringValue("cache_key");
            }

            public final C966766g AYm() {
                return (C966766g) getEnumValue(TraceFieldType.CompressionType, C966766g.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            public final String AiK() {
                return getStringValue("filename");
            }

            public final int AiL() {
                return getIntValue("filesize_bytes");
            }

            public final String Ato() {
                return getStringValue("md5_hash");
            }

            public final AnonymousClass25Y Aw8() {
                return (AnonymousClass25Y) getEnumValue("model_asset_type", AnonymousClass25Y.A01);
            }

            public final int BJC() {
                return getIntValue("uncompressed_filesize_bytes");
            }

            public final String getId() {
                return getStringValue("strong_id__");
            }

            public final String getUri() {
                return C18250wR.A0Y(this);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"type", ClientCookie.VERSION_ATTR};
        }

        public final ImmutableList ARW() {
            return getTreeList("assets", Assets.class);
        }

        public final C40306LcC BIo() {
            return (C40306LcC) C86104wH.A0a(this, C40306LcC.A01, "type");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Assets.class, "assets");
        }

        public final int getVersion() {
            return getIntValue(ClientCookie.VERSION_ATTR);
        }
    }

    public final ImmutableList ArW() {
        return getTreeList("latest_versioned_capabilities(capability_types:$capability_types,supported_compressions:$supported_compressions)", LatestVersionedCapabilities.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(LatestVersionedCapabilities.class, "latest_versioned_capabilities(capability_types:$capability_types,supported_compressions:$supported_compressions)");
    }
}
