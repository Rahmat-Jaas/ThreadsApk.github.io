package com.instagram.debug.devoptions;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;

public final class PublicDeveloperOptions$addMainOptions$52 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FragmentActivity $fragmentActivity;

    public PublicDeveloperOptions$addMainOptions$52(Context context, FragmentActivity fragmentActivity) {
        this.$context = context;
        this.$fragmentActivity = fragmentActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r4, boolean r5) {
        /*
            r3 = this;
            android.content.Context r0 = r3.$context
            boolean r2 = android.provider.Settings.canDrawOverlays(r0)
            if (r5 == 0) goto L_0x0011
            if (r2 != 0) goto L_0x0011
            androidx.fragment.app.FragmentActivity r1 = r3.$fragmentActivity
            java.lang.String r0 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            X.C62413Zr.A03(r1, r0)
        L_0x0011:
            X.0et r0 = X.C18190wL.A0X()
            if (r5 == 0) goto L_0x001a
            r1 = 1
            if (r2 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            X.0dK r0 = r0.A2N
            X.AnonymousClass0wJ.A1L(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PublicDeveloperOptions$addMainOptions$52.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
