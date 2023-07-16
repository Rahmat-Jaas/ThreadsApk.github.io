package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C18190wL;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerController;

public final class PublicDeveloperOptions$addAnalytics$2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;

    public PublicDeveloperOptions$addAnalytics$2(FragmentActivity fragmentActivity) {
        this.$fragmentActivity = fragmentActivity;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A1L(C18190wL.A0X().A2D, z);
        EventVisualizerController instance = EventVisualizerController.getInstance();
        if (z) {
            instance.onEventVisualizerShow(this.$fragmentActivity);
        } else {
            instance.onEventVisualizerDismiss();
        }
    }
}
