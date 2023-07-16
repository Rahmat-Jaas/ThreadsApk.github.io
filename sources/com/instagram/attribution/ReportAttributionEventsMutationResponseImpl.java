package com.instagram.attribution;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ReportAttributionEventsMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class ReportAttributionEvents extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ReportAttributionEvents.class, "report_attribution_events(data:$input)");
    }
}
