package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C63813iO;
import android.content.Context;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.view.View;
import com.instagram.barcelona.R;

public final class PublicDeveloperOptions$getApplicationShortcutOptions$1 implements View.OnClickListener {
    public final /* synthetic */ Context $context;

    public PublicDeveloperOptions$getApplicationShortcutOptions$1(Context context) {
        this.$context = context;
    }

    public final void onClick(View view) {
        int i;
        int A05 = C14030oh.A05(-185827888);
        ShortcutManager shortcutManager = (ShortcutManager) this.$context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            for (ShortcutInfo id : shortcutManager.getPinnedShortcuts()) {
                if (C04220Ms.A0I(id.getId(), this.$context.getString(2131825032))) {
                    C63813iO.A03(this.$context, (String) null, 2131825030, 1);
                    i = -1115068442;
                    break;
                }
            }
            Context context = this.$context;
            ShortcutInfo build = new ShortcutInfo.Builder(context, context.getString(2131825032)).setShortLabel(this.$context.getString(2131825033)).setLongLabel(this.$context.getString(2131825034)).setIcon(Icon.createWithResource(this.$context, R.drawable.instagram_camera_pano_outline_24)).setIntent(C18190wL.A0B(this.$context.getString(2131825031))).build();
            C04220Ms.A06(build);
            shortcutManager.requestPinShortcut(build, (IntentSender) null);
        }
        i = -463303567;
        C14030oh.A0C(i, A05);
    }
}
