package com.instagram.creation.capture.quickcapture.direct.view;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import X.C63393hP;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAListenerShape128S0300000_2_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReshareTogglePickerView extends LinearLayout {
    public ObjectAnimator A00;
    public final ImageView A01;
    public final TextView A02;
    public final long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A03 = 100;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0V);
        C04220Ms.A06(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        View inflate = LayoutInflater.from(context).inflate(resourceId == 0 ? R.layout.ephemeral_media_toggle : resourceId, this, true);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(inflate, R.id.label);
        this.A01 = (ImageView) AnonymousClass0wJ.A0I(inflate, R.id.icon);
        obtainStyledAttributes.recycle();
    }

    public final void A00(Integer num) {
        int i;
        C04220Ms.A0B(num, 0);
        Context A0A = C18190wL.A0A(this);
        if (1 - num.intValue() != 0) {
            i = R.drawable.instagram_reshare_pano_outline_24;
        } else {
            i = R.drawable.instagram_reshare_off_pano_outline_24;
        }
        Drawable drawable = A0A.getDrawable(i);
        if (drawable != null) {
            C63393hP.A03(A0A, drawable, R.color.canvas_bottom_sheet_description_text_color);
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A01, LinearLayout.ROTATION, new float[]{-90.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
            ofFloat.setDuration(this.A03);
            this.A00 = ofFloat;
            ofFloat.start();
            ObjectAnimator objectAnimator2 = this.A00;
            if (objectAnimator2 != null) {
                objectAnimator2.addListener(new IDxAListenerShape128S0300000_2_I2(1, this, num, drawable));
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReshareTogglePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ ReshareTogglePickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
