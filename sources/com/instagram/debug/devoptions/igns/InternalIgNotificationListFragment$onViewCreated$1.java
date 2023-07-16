package com.instagram.debug.devoptions.igns;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C143158gC;
import X.C304721l;
import X.C31084GfL;
import com.instagram.debug.devoptions.igns.InternalIgNotificationRowDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InternalIgNotificationListFragment$onViewCreated$1 implements C143158gC {
    public final /* synthetic */ InternalIgNotificationListFragment this$0;

    public InternalIgNotificationListFragment$onViewCreated$1(InternalIgNotificationListFragment internalIgNotificationListFragment) {
        this.this$0 = internalIgNotificationListFragment;
    }

    public final void onChanged(List list) {
        InternalIgNotificationListFragment internalIgNotificationListFragment = this.this$0;
        C304721l r4 = C304721l.LOADED;
        C04220Ms.A07(list);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0w.add(new InternalIgNotificationRowDefinition.IgNotificationViewModel((C31084GfL) it.next()));
        }
        internalIgNotificationListFragment.updateUi(r4, A0w);
    }
}
