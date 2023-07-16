package com.instagram.urlhandlers.bloksformflow;

import X.C14030oh;
import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class BloksFormFlowUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0D(Bundle bundle) {
    }

    public final void onPause() {
        int A00 = C14030oh.A00(1393610211);
        super.onPause();
        setRequestedOrientation(10);
        C14030oh.A07(911946973, A00);
    }

    public final void onResume() {
        int A00 = C14030oh.A00(-1536160541);
        super.onResume();
        setRequestedOrientation(1);
        C14030oh.A07(1902042767, A00);
    }
}
