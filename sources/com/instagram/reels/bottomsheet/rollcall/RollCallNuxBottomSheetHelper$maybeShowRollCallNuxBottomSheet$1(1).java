package com.instagram.reels.bottomsheet.rollcall;

import X.AnonymousClass060;
import X.AnonymousClass065;
import X.C18250wR;
import X.C18532Ah8;
import android.content.SharedPreferences;
import androidx.lifecycle.OnLifecycleEvent;

public final class RollCallNuxBottomSheetHelper$maybeShowRollCallNuxBottomSheet$1 implements AnonymousClass065 {
    public final /* synthetic */ C18532Ah8 A00;

    public RollCallNuxBottomSheetHelper$maybeShowRollCallNuxBottomSheet$1(C18532Ah8 ah8) {
        this.A00 = ah8;
    }

    @OnLifecycleEvent(AnonymousClass060.ON_RESUME)
    public final void onFragmentResumed() {
        SharedPreferences.Editor A06 = C18250wR.A06(this.A00.A07);
        A06.putBoolean("has_seen_roll_call_nux", true);
        A06.apply();
    }
}
