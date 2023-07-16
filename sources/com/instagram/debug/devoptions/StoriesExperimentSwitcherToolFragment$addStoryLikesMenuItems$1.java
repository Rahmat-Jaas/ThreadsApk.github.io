package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass3Zs;
import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C28161tl;
import X.C63813iO;
import X.D2R;
import android.view.View;

public final class StoriesExperimentSwitcherToolFragment$addStoryLikesMenuItems$1 implements View.OnClickListener {
    public final /* synthetic */ StoriesExperimentSwitcherToolFragment this$0;

    public StoriesExperimentSwitcherToolFragment$addStoryLikesMenuItems$1(StoriesExperimentSwitcherToolFragment storiesExperimentSwitcherToolFragment) {
        this.this$0 = storiesExperimentSwitcherToolFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-366749548);
        C18190wL.A11(AnonymousClass3Zs.A03(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)).A01(D2R.A2B));
        C28161tl A01 = AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
        C04220Ms.A0B("STORY_LIKES", 0);
        AnonymousClass0wJ.A13(C28161tl.A02(A01), AnonymousClass00U.A0L("dismissed_reel_viewers_list_megaphone", "STORY_LIKES"), false);
        C63813iO.A02(this.this$0.getContext(), "Reset completed", (String) null, 0);
        C14030oh.A0C(-18819868, A05);
    }
}
