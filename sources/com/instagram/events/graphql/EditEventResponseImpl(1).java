package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class EditEventResponseImpl extends TreeJNI implements C81204nM {

    public final class XdtAsyncEditEvent extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{EventImpl.class};
        }

        public final String[] getScalarFields() {
            return C18230wP.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XdtAsyncEditEvent.class, "xdt_async_edit_event(input:$input)");
    }
}
