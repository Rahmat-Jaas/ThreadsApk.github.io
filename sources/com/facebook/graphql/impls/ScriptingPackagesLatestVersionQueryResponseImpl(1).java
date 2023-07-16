package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ScriptingPackagesLatestVersionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class ArScriptingModulesPackageDownload extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cdn_uri", "revision"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ArScriptingModulesPackageDownload.class, "ar_scripting_modules_package_download(package_hash:$package_hash)");
    }
}
