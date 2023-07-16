package com.instagram.debug.devoptions.section.graphexperiences;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.C18180wK;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class GraphExperiencesOptions implements DeveloperOptionsSection {
    public final Bundle bundle;
    public final Context context;
    public final int titleRes = 2131825196;

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final Context getContext() {
        return this.context;
    }

    public Integer getTitleRes() {
        return Integer.valueOf(this.titleRes);
    }

    public GraphExperiencesOptions(Bundle bundle2, Context context2) {
        AnonymousClass0wJ.A1O(bundle2, context2);
        this.bundle = bundle2;
        this.context = context2;
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        AnonymousClass0wJ.A1N(userSession, fragmentActivity);
        return C18180wK.A0n(AnonymousClass4MA.A00(new GraphExperiencesOptions$getItems$1(this, userSession, fragmentActivity), 2131825399));
    }

    public /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
