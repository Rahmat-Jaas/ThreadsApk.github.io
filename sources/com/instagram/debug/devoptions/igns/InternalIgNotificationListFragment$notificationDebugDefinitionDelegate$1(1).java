package com.instagram.debug.devoptions.igns;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C25786Drz;
import X.C31084GfL;
import com.instagram.debug.devoptions.igns.InternalIgNotificationDetailsFragment;
import com.instagram.debug.devoptions.igns.InternalIgNotificationRowDefinition;

public final class InternalIgNotificationListFragment$notificationDebugDefinitionDelegate$1 implements InternalIgNotificationRowDefinition.Delegate {
    public final /* synthetic */ InternalIgNotificationListFragment this$0;

    public void onRowClicked(C31084GfL gfL) {
        C04220Ms.A0B(gfL, 0);
        InternalIgNotificationListFragment internalIgNotificationListFragment = this.this$0;
        C25786Drz A0Q = C18180wK.A0Q(internalIgNotificationListFragment.getActivity(), AnonymousClass0wJ.A0X(internalIgNotificationListFragment.userSession$delegate));
        InternalIgNotificationDetailsFragment.Companion companion = InternalIgNotificationDetailsFragment.Companion;
        String str = gfL.A0k;
        if (str == null) {
            str = gfL.toString();
        }
        C04220Ms.A09(str);
        A0Q.A03 = companion.newInstance(str);
        A0Q.A05();
    }

    public InternalIgNotificationListFragment$notificationDebugDefinitionDelegate$1(InternalIgNotificationListFragment internalIgNotificationListFragment) {
        this.this$0 = internalIgNotificationListFragment;
    }
}
