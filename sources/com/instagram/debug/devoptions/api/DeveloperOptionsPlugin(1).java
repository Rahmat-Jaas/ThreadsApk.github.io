package com.instagram.debug.devoptions.api;

import X.C23411dm;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.List;

public abstract class DeveloperOptionsPlugin {
    public static DeveloperOptionsPlugin sInstance;

    public interface OnPinnedDevOptionInteraction {
        void onPinnedDevOptionRemoved();

        void onPinnedDevOptionSelected();
    }

    public abstract Fragment getDeveloperOptionsFragment();

    public abstract Fragment getDirectInboxExperimentSwitcherToolFragment();

    public abstract Fragment getHomeDeliveryDebugTool();

    public abstract Fragment getInjectedMediaToolFragment();

    public abstract Fragment getPanavisionExperimentSwitcherToolFragment();

    public abstract List getPinnedDevOptions(UserSession userSession, C23411dm r2, OnPinnedDevOptionInteraction onPinnedDevOptionInteraction);

    public abstract Fragment getStoriesExperimentSwitcherToolFragment();

    public abstract void removePinnedItemInPrefs(String str);

    public static DeveloperOptionsPlugin getInstance() {
        return sInstance;
    }

    public static void setInstance(DeveloperOptionsPlugin developerOptionsPlugin) {
        sInstance = developerOptionsPlugin;
    }
}
