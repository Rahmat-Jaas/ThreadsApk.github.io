package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class AREffectBlockFragmentImpl extends TreeJNI implements C81204nM {

    public final class PackagedFile extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cache_key", TraceFieldType.CompressionType, "filesize_bytes", "id", "md5_hash", "uri"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"id"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(PackagedFile.class, C28174Ezk.A00(241));
    }
}
