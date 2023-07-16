package com.facebook.redex;

import X.C15730rn;
import X.C18180wK;
import X.C19772B9s;
import X.C21735BzM;
import X.C83744rv;
import X.C85914vy;
import X.CUH;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.user.model.User;

public class IDxObjectShape290S0200000_1_I2 implements C85914vy, C21735BzM {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape290S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BuM() {
        if (this.A02 != 0) {
            CUH cuh = (CUH) this.A00;
            String id = ((User) this.A01).getId();
            C15730rn A002 = C15730rn.A00(cuh, "following_overflow_menu_cancelled");
            A002.A0D("target_id", id);
            C18180wK.A1K(A002, cuh.A04);
            return;
        }
        DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A00;
        onDismissListener.getClass();
        onDismissListener.onDismiss(C19772B9s.A0V);
        C83744rv r0 = (C83744rv) this.A01;
        if (r0 != null) {
            r0.onDismiss();
        }
    }

    public final void CJi(View view, int i) {
        if (this.A02 == 0) {
            DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A00;
            onDismissListener.getClass();
            onDismissListener.onDismiss(C19772B9s.A0V);
        }
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        if (this.A02 != 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
