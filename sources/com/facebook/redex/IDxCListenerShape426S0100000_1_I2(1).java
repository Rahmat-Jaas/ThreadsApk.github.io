package com.facebook.redex;

import X.AnonymousClass054;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;

public class IDxCListenerShape426S0100000_1_I2 implements AnonymousClass054 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape426S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onBackStackChanged() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) obj;
            if (fragmentActivity.getSupportFragmentManager().A0I() <= 0) {
                fragmentActivity.finish();
                return;
            }
            return;
        }
        ModalActivity modalActivity = (ModalActivity) obj;
        if (modalActivity.getSupportFragmentManager().A0I() == 0) {
            modalActivity.finish();
        }
    }
}
