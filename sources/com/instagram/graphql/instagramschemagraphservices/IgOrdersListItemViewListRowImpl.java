package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IgOrdersListItemViewListRowImpl extends TreeJNI implements C81204nM {

    public final class HistoryRowViewData extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{IgOrdersListItemViewListItemViewDataImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"__typename"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(HistoryRowViewData.class, "history_row_view_data");
    }
}
