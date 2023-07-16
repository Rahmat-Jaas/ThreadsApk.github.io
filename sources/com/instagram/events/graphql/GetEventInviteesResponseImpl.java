package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class GetEventInviteesResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtAsyncGetEventDetails extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{EventInviteesImpl.class};
        }

        public final String[] getScalarFields() {
            return C18230wP.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtAsyncGetEventDetails.class, "xdt_async_get_event_details(input:$request_data)");
    }
}
