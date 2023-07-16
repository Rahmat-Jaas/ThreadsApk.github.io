package com.instagram.debug.devoptions;

import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;

public final class PublicDeveloperOptions$addPinnedDevOptions$1 implements DeveloperOptionsPlugin.OnPinnedDevOptionInteraction {
    public final /* synthetic */ DeveloperOptionsFragment $fragment;

    public void onPinnedDevOptionSelected() {
    }

    public PublicDeveloperOptions$addPinnedDevOptions$1(DeveloperOptionsFragment developerOptionsFragment) {
        this.$fragment = developerOptionsFragment;
    }

    public void onPinnedDevOptionRemoved() {
        this.$fragment.refreshItems();
    }
}
