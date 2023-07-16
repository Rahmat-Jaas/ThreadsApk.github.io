package com.instagram.attribution;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ReportAdvertiserIDMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class ReportAdvertiserId extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ReportAdvertiserId.class, "report_advertiser_id(data:$input)");
    }
}
