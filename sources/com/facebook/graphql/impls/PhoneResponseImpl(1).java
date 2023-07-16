package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class PhoneResponseImpl extends TreeJNI implements C81204nM {

    public final class Error extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{SharedPaymentsErrorImpl.class};
        }
    }

    public final class Phone extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayPhoneNumberImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"error_step"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Phone.class, "phone", false), Error.class, "error", false);
    }
}
