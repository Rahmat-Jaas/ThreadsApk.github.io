package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;

public final class FetchCapabilityLatestVersionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class LatestVersionedCapabilities extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"force_download_group_identifier", "type", ClientCookie.VERSION_ATTR};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(LatestVersionedCapabilities.class, "latest_versioned_capabilities(capability_types:$capability_types,supported_compressions:$supported_compressions)");
    }
}
