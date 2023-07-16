package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C106376ew;
import X.C18240wQ;
import X.C86134wK;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import com.instagram.model.mediatype.ProductType;

public class IDxAListenerShape183S0200000_2_I2 implements Animator.AnimatorListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxAListenerShape183S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A02) {
            case 1:
            case 2:
                C18240wQ.A1G(this.A00);
                ((Animator) this.A01).removeAllListeners();
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        long currentTimeMillis;
        SharedPreferences.Editor edit;
        String str;
        Activity activity;
        switch (this.A02) {
            case 0:
                Dialog dialog = (Dialog) this.A01;
                if (dialog.isShowing() && (activity = (Activity) this.A00) != null && !activity.isDestroyed()) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                int ordinal = ((ProductType) this.A01).ordinal();
                if (ordinal == 1) {
                    SharedPreferences sharedPreferences = ((C106376ew) this.A00).A00;
                    AnonymousClass0wJ.A14(sharedPreferences, "exclusive_content_animation_post_count", 0);
                    currentTimeMillis = System.currentTimeMillis();
                    edit = sharedPreferences.edit();
                    str = "exclusive_content_animation_post_timestamp";
                } else if (ordinal == 9) {
                    SharedPreferences sharedPreferences2 = ((C106376ew) this.A00).A00;
                    AnonymousClass0wJ.A14(sharedPreferences2, "exclusive_content_animation_story_count", 0);
                    currentTimeMillis = System.currentTimeMillis();
                    edit = sharedPreferences2.edit();
                    str = "exclusive_content_animation_story_timestamp";
                } else if (ordinal == 13) {
                    SharedPreferences sharedPreferences3 = ((C106376ew) this.A00).A00;
                    AnonymousClass0wJ.A14(sharedPreferences3, "exclusive_content_animation_tall_video_count", 0);
                    currentTimeMillis = System.currentTimeMillis();
                    edit = sharedPreferences3.edit();
                    str = "exclusive_content_animation_tall_video_timestamp";
                } else {
                    throw C86134wK.A0s("ProductType does not match");
                }
                AnonymousClass0wJ.A12(edit, str, currentTimeMillis);
                return;
            case 4:
                return;
            default:
                C18240wQ.A1G(this.A00);
                ((Animator) this.A01).removeAllListeners();
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        if (4 - this.A02 == 0) {
            PropertyValuesHolder[] values = ((ValueAnimator) this.A00).getValues();
            C04220Ms.A06(values);
            for (PropertyValuesHolder propertyValuesHolder : values) {
                if (C04220Ms.A0I(propertyValuesHolder.getPropertyName(), "rotation")) {
                    propertyValuesHolder.setFloatValues(new float[]{((float) (Math.random() * ((double) 29))) + ((float) -14)});
                }
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
    }
}
