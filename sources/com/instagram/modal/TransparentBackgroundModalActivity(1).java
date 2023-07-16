package com.instagram.modal;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;

public class TransparentBackgroundModalActivity extends ModalActivity {
    public final boolean A0H() {
        return false;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A0I(intent);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getSupportFragmentManager().A0v(new IDxCListenerShape426S0100000_1_I2(this, 0));
    }
}
