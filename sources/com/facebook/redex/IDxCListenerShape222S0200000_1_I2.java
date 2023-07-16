package com.facebook.redex;

import X.AnonymousClass054;
import X.AnonymousClass3GN;
import X.C12560m7;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;

public class IDxCListenerShape222S0200000_1_I2 implements AnonymousClass054 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape222S0200000_1_I2(FragmentActivity fragmentActivity, C12560m7 r2, int i) {
        this.A02 = i;
        if (2 - i != 0) {
            this.A01 = r2;
            this.A00 = fragmentActivity;
            return;
        }
        this.A00 = r2;
        this.A01 = fragmentActivity;
    }

    public final void onBackStackChanged() {
        Activity activity;
        switch (this.A02) {
            case 0:
                AnonymousClass3GN r1 = (AnonymousClass3GN) this.A00;
                if (((C12560m7) this.A01).A0I() == 0) {
                    activity = r1.A0J;
                    break;
                } else {
                    return;
                }
            case 1:
                C12560m7 r12 = (C12560m7) this.A01;
                if (r12.A0I() <= 0) {
                    ArrayList arrayList = r12.A0E;
                    if (arrayList != null) {
                        arrayList.remove(this);
                    }
                    ((ModalActivity) this.A00).finish();
                    return;
                }
                return;
            case 2:
                activity = (Activity) this.A01;
                if (((C12560m7) this.A00).A0I() != 0) {
                    return;
                }
                break;
            default:
                if (((C12560m7) this.A01).A0I() <= 0) {
                    activity = (Activity) this.A00;
                    break;
                } else {
                    return;
                }
        }
        activity.finish();
    }

    public IDxCListenerShape222S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
