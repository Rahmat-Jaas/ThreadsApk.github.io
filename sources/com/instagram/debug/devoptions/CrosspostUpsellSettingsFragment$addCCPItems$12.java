package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Zu;
import android.widget.CompoundButton;

public final class CrosspostUpsellSettingsFragment$addCCPItems$12 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$12(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_BYPASS_XAR_CCP_MIGRATION_UPSELL_COOLDOWNS", z);
    }
}
