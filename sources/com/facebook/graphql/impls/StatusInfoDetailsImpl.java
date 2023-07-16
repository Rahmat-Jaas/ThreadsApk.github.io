package com.facebook.graphql.impls;

import X.AnonymousClass000;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class StatusInfoDetailsImpl extends TreeJNI implements C81204nM {

    public final class StatusTimelineEvents extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{TimelineEventImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"section_title", AnonymousClass000.A00(1132)};
    }

    public final class Status extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Status.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, false), StatusTimelineEvents.class, "status_timeline_events", true);
    }
}
