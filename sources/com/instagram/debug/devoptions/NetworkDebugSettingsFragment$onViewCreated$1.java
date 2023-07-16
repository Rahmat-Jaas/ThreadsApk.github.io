package com.instagram.debug.devoptions;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C04220Ms;
import X.C09120et;
import X.C18210wN;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import kotlin.Unit;

public final class NetworkDebugSettingsFragment$onViewCreated$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C09120et $preferences;
    public final /* synthetic */ NetworkDebugSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkDebugSettingsFragment$onViewCreated$1(C09120et r2, NetworkDebugSettingsFragment networkDebugSettingsFragment) {
        super(1);
        this.$preferences = r2;
        this.this$0 = networkDebugSettingsFragment;
    }

    public final void invoke(int i) {
        C18210wN.A1I(this.$preferences.A0b, i);
        FragmentActivity requireActivity = this.this$0.requireActivity();
        C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0G(this.this$0.getSession());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(AnonymousClass0wJ.A04(obj));
        return Unit.A00;
    }
}
