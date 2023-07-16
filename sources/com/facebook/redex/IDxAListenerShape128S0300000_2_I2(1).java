package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C04530Oa;
import X.C113036qb;
import X.C18190wL;
import X.C18240wQ;
import X.C86144wL;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;

public class IDxAListenerShape128S0300000_2_I2 implements Animator.AnimatorListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxAListenerShape128S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj3;
        this.A02 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (2 - this.A03 == 0) {
            C18240wQ.A1G(this.A00);
            ((Animator) this.A02).removeAllListeners();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        switch (this.A03) {
            case 0:
                C18240wQ.A1G(this.A00);
                C04530Oa r2 = ((C113036qb) this.A02).A03;
                C86144wL.A0I(r2).setVisibility(4);
                C86144wL.A0I(r2).setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                C86144wL.A0I(r2).setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                C86144wL.A0I(r2).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                View view = (View) this.A01;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            case 1:
                ReshareTogglePickerView reshareTogglePickerView = (ReshareTogglePickerView) this.A02;
                reshareTogglePickerView.A01.setImageDrawable((Drawable) this.A00);
                TextView textView = reshareTogglePickerView.A02;
                Context A0A = C18190wL.A0A(reshareTogglePickerView);
                if (1 - AnonymousClass0wJ.A04(this.A01) != 0) {
                    i = 2131834107;
                } else {
                    i = 2131834108;
                }
                textView.setText(AnonymousClass0wJ.A0k(A0A, i));
                return;
            default:
                C18240wQ.A1G(this.A00);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.A03) {
            case 0:
                C86144wL.A0I(((C113036qb) this.A02).A03).setVisibility(0);
                return;
            case 1:
                return;
            default:
                C18240wQ.A1G(this.A01);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
