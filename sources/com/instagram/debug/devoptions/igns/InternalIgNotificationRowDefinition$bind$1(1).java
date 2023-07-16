package com.instagram.debug.devoptions.igns;

import X.C14030oh;
import android.view.View;
import com.instagram.debug.devoptions.igns.InternalIgNotificationRowDefinition;

public final class InternalIgNotificationRowDefinition$bind$1 implements View.OnClickListener {
    public final /* synthetic */ InternalIgNotificationRowDefinition.IgNotificationViewModel $model;
    public final /* synthetic */ InternalIgNotificationRowDefinition this$0;

    public InternalIgNotificationRowDefinition$bind$1(InternalIgNotificationRowDefinition internalIgNotificationRowDefinition, InternalIgNotificationRowDefinition.IgNotificationViewModel igNotificationViewModel) {
        this.this$0 = internalIgNotificationRowDefinition;
        this.$model = igNotificationViewModel;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(2093579791);
        this.this$0.delegate.onRowClicked(this.$model.notification);
        C14030oh.A0C(-2090985689, A05);
    }
}
