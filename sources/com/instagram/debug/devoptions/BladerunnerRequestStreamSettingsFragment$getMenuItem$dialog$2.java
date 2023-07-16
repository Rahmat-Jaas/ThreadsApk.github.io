package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import android.content.DialogInterface;
import com.instagram.debug.devoptions.BladerunnerRequestStreamSettingsFragment;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SearchEditText $input;
    public final /* synthetic */ BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey $key;
    public final /* synthetic */ BladerunnerRequestStreamSettingsFragment this$0;

    public BladerunnerRequestStreamSettingsFragment$getMenuItem$dialog$2(BladerunnerRequestStreamSettingsFragment bladerunnerRequestStreamSettingsFragment, BladerunnerRequestStreamSettingsFragment.RealTimeSandboxConfigSourceKey realTimeSandboxConfigSourceKey, SearchEditText searchEditText) {
        this.this$0 = bladerunnerRequestStreamSettingsFragment;
        this.$key = realTimeSandboxConfigSourceKey;
        this.$input = searchEditText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.setValueForSandboxOverride(this.$key, AnonymousClass0wJ.A0n(this.$input));
        this.this$0.generateView();
    }
}
