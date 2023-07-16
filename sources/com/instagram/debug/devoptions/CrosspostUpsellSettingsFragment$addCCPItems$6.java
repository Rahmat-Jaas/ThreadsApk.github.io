package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Zu;
import android.widget.CompoundButton;

public final class CrosspostUpsellSettingsFragment$addCCPItems$6 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CrosspostUpsellSettingsFragment this$0;

    public CrosspostUpsellSettingsFragment$addCCPItems$6(CrosspostUpsellSettingsFragment crosspostUpsellSettingsFragment) {
        this.this$0 = crosspostUpsellSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass0wJ.A13(AnonymousClass3Zu.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate)), "PREFERENCE_Always_Show_Panavision_CCP_Nux", z);
    }
}
