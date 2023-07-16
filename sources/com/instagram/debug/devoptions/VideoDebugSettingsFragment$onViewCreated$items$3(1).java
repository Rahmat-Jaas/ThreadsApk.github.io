package com.instagram.debug.devoptions;

import android.widget.CompoundButton;

public final class VideoDebugSettingsFragment$onViewCreated$items$3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ VideoDebugSettingsFragment this$0;

    public VideoDebugSettingsFragment$onViewCreated$items$3(VideoDebugSettingsFragment videoDebugSettingsFragment) {
        this.this$0 = videoDebugSettingsFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r2 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r4, boolean r5) {
        /*
            r3 = this;
            com.instagram.debug.devoptions.VideoDebugSettingsFragment r0 = r3.this$0
            android.content.Context r0 = r0.requireContext()
            boolean r2 = android.provider.Settings.canDrawOverlays(r0)
            if (r5 == 0) goto L_0x0019
            if (r2 != 0) goto L_0x0019
            com.instagram.debug.devoptions.VideoDebugSettingsFragment r0 = r3.this$0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            java.lang.String r0 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            X.C62413Zr.A03(r1, r0)
        L_0x0019:
            X.0et r0 = X.C18190wL.A0X()
            if (r5 == 0) goto L_0x0022
            r1 = 1
            if (r2 != 0) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            X.0dK r0 = r0.A2J
            X.AnonymousClass0wJ.A1L(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.VideoDebugSettingsFragment$onViewCreated$items$3.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
