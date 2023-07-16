package com.instagram.debug.devoptions.section.graphexperiences;

import X.C14030oh;
import X.C63863iT;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

public final class GraphExperiencesOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ GraphExperiencesOptions this$0;

    public GraphExperiencesOptions$getItems$1(GraphExperiencesOptions graphExperiencesOptions, UserSession userSession, FragmentActivity fragmentActivity) {
        this.this$0 = graphExperiencesOptions;
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2034748894);
        this.this$0.bundle.putString("target_user_id", this.$userSession.getUserId());
        Bundle bundle = this.this$0.bundle;
        C63863iT.A04(this.$activity, bundle, this.$userSession, ModalActivity.class, "recs_from_friends_sender").A0I(this.this$0.context);
        C14030oh.A0C(-710636737, A05);
    }
}
