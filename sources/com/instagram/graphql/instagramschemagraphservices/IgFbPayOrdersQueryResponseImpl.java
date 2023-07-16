package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgFbPayOrdersQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class Me extends TreeJNI implements C81204nM {

        public final class InlineUser extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id"};
            }

            public final Class[] getInlineClasses() {
                return new Class[]{IgOrdersViewPaymentAccountImpl.class};
            }
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineUser.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Me.class, "me");
    }
}
