package com.instagram.debug.devoptions;

import X.AnonymousClass3WS;
import X.AnonymousClass3XX;
import X.C14030oh;
import X.C18180wK;
import X.C28161tl;
import X.C31155GhB;
import X.C62563aI;
import X.C63813iO;
import X.C63873iU;
import X.C85814vo;
import android.widget.RadioGroup;
import com.instagram.debug.devoptions.api.BundledNotificationPrototypeApiHelper;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class BundledNotificationPrototypeSettingsFragment$createExperienceOptions$1 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ List $options;
    public final /* synthetic */ BundledNotificationPrototypeSettingsFragment this$0;

    public BundledNotificationPrototypeSettingsFragment$createExperienceOptions$1(BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment, List list) {
        this.this$0 = bundledNotificationPrototypeSettingsFragment;
        this.$options = list;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment = this.this$0;
        if (bundledNotificationPrototypeSettingsFragment.checkedValue != null) {
            C63813iO.A0B(bundledNotificationPrototypeSettingsFragment.getContext(), "Network Call Pending");
            return;
        }
        final String A00 = C62563aI.A00(this.$options, i);
        BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment2 = this.this$0;
        bundledNotificationPrototypeSettingsFragment2.checkedValue = A00;
        UserSession session = bundledNotificationPrototypeSettingsFragment2.getSession();
        final BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment3 = this.this$0;
        C31155GhB.A02(BundledNotificationPrototypeApiHelper.createBundledActivityFeedPrototypeTask(session, A00, new C63873iU() {
            public void onFail(AnonymousClass3XX r6) {
                int A03 = C14030oh.A03(417169679);
                BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment = bundledNotificationPrototypeSettingsFragment3;
                bundledNotificationPrototypeSettingsFragment.checkedValue = null;
                C63813iO.A03(bundledNotificationPrototypeSettingsFragment.getContext(), (String) null, 2131825543, 0);
                C14030oh.A0A(873681498, A03);
            }

            public void onSuccess(C85814vo r6) {
                int A03 = C14030oh.A03(157443949);
                if (A00 != null) {
                    C28161tl A01 = AnonymousClass3WS.A01(bundledNotificationPrototypeSettingsFragment3.getSession());
                    C18180wK.A0v(C28161tl.A02(A01), "shopping_bundled_notification_prototype_experience", A00);
                }
                BundledNotificationPrototypeSettingsFragment bundledNotificationPrototypeSettingsFragment = bundledNotificationPrototypeSettingsFragment3;
                bundledNotificationPrototypeSettingsFragment.checkedValue = null;
                C63813iO.A03(bundledNotificationPrototypeSettingsFragment.getContext(), (String) null, 2131825547, 0);
                C14030oh.A0A(-2068881536, A03);
            }

            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C14030oh.A03(-105875888);
                onSuccess((C85814vo) obj);
                C14030oh.A0A(955482898, A03);
            }
        }));
    }
}
