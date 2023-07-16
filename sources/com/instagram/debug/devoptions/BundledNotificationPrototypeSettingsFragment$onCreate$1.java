package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass3XX;
import X.C14030oh;
import X.C18180wK;
import X.C28161tl;
import X.C63813iO;
import X.C63873iU;
import com.instagram.debug.devoptions.api.BundledActivityFeedExperienceResponse;

public final class BundledNotificationPrototypeSettingsFragment$onCreate$1 extends C63873iU {
    public final /* synthetic */ BundledNotificationPrototypeSettingsFragment this$0;

    public BundledNotificationPrototypeSettingsFragment$onCreate$1(BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment) {
        this.this$0 = bundledNotificationPrototypeSettingsFragment;
    }

    public void onFail(AnonymousClass3XX r6) {
        int A03 = C14030oh.A03(731758880);
        C63813iO.A03(this.this$0.getContext(), (String) null, 2131825543, 0);
        C14030oh.A0A(-1197026895, A03);
    }

    public void onSuccess(BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse) {
        int A00 = AnonymousClass0wJ.A00(-1975116655, bundledActivityFeedExperienceResponse);
        C28161tl A01 = AnonymousClass3WS.A01(this.this$0.getSession());
        C18180wK.A0v(C28161tl.A02(A01), "shopping_bundled_notification_prototype_experience", bundledActivityFeedExperienceResponse.mExperience);
        BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment = this.this$0;
        bundledNotificationPrototypeSettingsFragment.setItems(bundledNotificationPrototypeSettingsFragment.getItems(bundledActivityFeedExperienceResponse.mExperience));
        C14030oh.A0A(1688295525, A00);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-333643275);
        onSuccess((BundledActivityFeedExperienceResponse) obj);
        C14030oh.A0A(-697938972, A03);
    }
}
