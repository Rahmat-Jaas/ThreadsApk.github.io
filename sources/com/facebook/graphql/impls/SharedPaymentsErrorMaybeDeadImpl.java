package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class SharedPaymentsErrorMaybeDeadImpl extends TreeJNI implements C81204nM {

    public final class PrimaryCta extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ErrorCallToActionImpl.class};
        }
    }

    public final class SecondaryCta extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{ErrorCallToActionImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{TraceFieldType.ErrorCode, TraceFieldType.Error, "error_form_field_id", "error_title", "extra_data", "flow_step", "image"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(PrimaryCta.class, "primary_cta", false), SecondaryCta.class, "secondary_cta", false);
    }
}
