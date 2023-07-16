package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class DeleteEventResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtAsyncDeleteEvent extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18230wP.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtAsyncDeleteEvent.class, "xdt_async_delete_event(input:$input)");
    }
}
