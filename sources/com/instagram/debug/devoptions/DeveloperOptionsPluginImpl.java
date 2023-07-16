package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C23411dm;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class DeveloperOptionsPluginImpl extends DeveloperOptionsPlugin {
    public void removePinnedItemInPrefs(String str) {
        C04220Ms.A0B(str, 0);
        DevOptionsHelper.Companion.removePinnedItemInPrefs(str);
    }

    public Fragment getDeveloperOptionsFragment() {
        return new DeveloperOptionsFragment();
    }

    public Fragment getDirectInboxExperimentSwitcherToolFragment() {
        return new DirectInboxExperimentSwitcherToolFragment();
    }

    public Fragment getHomeDeliveryDebugTool() {
        return new HomeDeliveryDebugToolFragment();
    }

    public Fragment getInjectedMediaToolFragment() {
        return new InjectMediaToolFragment();
    }

    public Fragment getPanavisionExperimentSwitcherToolFragment() {
        return new PanavisionExperimentSwitcherToolFragment();
    }

    public Fragment getStoriesExperimentSwitcherToolFragment() {
        return new StoriesExperimentSwitcherToolFragment();
    }

    public List getPinnedDevOptions(UserSession userSession, C23411dm r3, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        AnonymousClass0wJ.A1N(userSession, r3);
        C04220Ms.A0B(onPinnedDevOptionInteraction, 2);
        return PinnedDeveloperOptionsUtil.getPinnedDevOptions(userSession, r3, onPinnedDevOptionInteraction);
    }
}
