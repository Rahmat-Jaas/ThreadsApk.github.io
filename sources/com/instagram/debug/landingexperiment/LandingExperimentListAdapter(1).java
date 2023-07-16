package com.instagram.debug.landingexperiment;

import X.AnonymousClass0wJ;
import X.AnonymousClass1fz;
import X.C04220Ms;
import X.C27900EvB;
import X.C34727Idy;
import X.C57583Bq;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LandingExperimentListAdapter extends C34727Idy implements C27900EvB {
    public final ArrayList landingExperimentList = AnonymousClass0wJ.A0v();
    public AnonymousClass1fz menuItemBinderGroup;

    public LandingExperimentListAdapter(Context context) {
        C04220Ms.A0B(context, 1);
        AnonymousClass1fz r0 = new AnonymousClass1fz(context);
        this.menuItemBinderGroup = r0;
        init(r0);
        updateItems();
    }

    public LandingExperimentListAdapter getAdapter() {
        return this;
    }

    public final void setMenuItemList(List list) {
        C04220Ms.A0B(list, 0);
        ArrayList arrayList = this.landingExperimentList;
        arrayList.clear();
        arrayList.addAll(list);
        updateItems();
    }

    private final void updateItems() {
        clear();
        Iterator it = this.landingExperimentList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C04220Ms.A0C(next, "null cannot be cast to non-null type com.instagram.ui.menu.MenuItem");
            addModel(next, new C57583Bq(false, false, false, false), this.menuItemBinderGroup);
        }
        notifyDataSetChanged();
    }

    public void updateListView() {
        notifyDataSetChanged();
    }
}
