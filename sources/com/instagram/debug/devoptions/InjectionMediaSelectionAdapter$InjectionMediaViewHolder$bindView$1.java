package com.instagram.debug.devoptions;

import X.AnonymousClass4O1;
import android.widget.CompoundButton;
import java.util.Set;

public final class InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass4O1 $injectedMedia;
    public final /* synthetic */ InjectionMediaSelectionAdapter this$0;

    public InjectionMediaSelectionAdapter$InjectionMediaViewHolder$bindView$1(InjectionMediaSelectionAdapter injectionMediaSelectionAdapter, AnonymousClass4O1 r2) {
        this.this$0 = injectionMediaSelectionAdapter;
        this.$injectedMedia = r2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Set set = this.this$0.savedMediaInjections;
        String str = this.$injectedMedia.A02;
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = this.this$0;
        injectionMediaSelectionAdapter.delegate.onItemSelectionChanged(injectionMediaSelectionAdapter.savedMediaInjections);
    }
}
