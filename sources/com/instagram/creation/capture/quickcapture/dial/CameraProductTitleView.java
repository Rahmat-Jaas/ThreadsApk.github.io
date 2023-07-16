package com.instagram.creation.capture.quickcapture.dial;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ib;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.model.shopping.Product;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CameraProductTitleView extends LinearLayout {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public TextView A03;
    public TextView A04;
    public Integer A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    public final void setProduct(Product product) {
        TextView textView;
        int i = 8;
        if (product != null) {
            TextView textView2 = this.A04;
            String str = product.A00.A0g;
            C04220Ms.A06(str);
            textView2.setText(C18220wO.A0u(Locale.ROOT, str));
            if (this.A01) {
                this.A03.setText(TextUtils.concat(new CharSequence[]{" · ", AnonymousClass3ib.A04(getContext(), product, this.A05, (Integer) null)}));
            }
            textView = this.A03;
            if (this.A02) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView2.setGravity(8388611);
            if (this.A01) {
                i = 0;
            }
        } else {
            TextView textView3 = this.A04;
            textView3.setText(2131837211);
            textView = this.A03;
            if (this.A02) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            textView3.setGravity(17);
        }
        textView.setVisibility(i);
    }

    public final void setPriceVisibility(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraProductTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        this.A01 = true;
        LayoutInflater.from(context).inflate(R.layout.camera_product_title_view, this);
        this.A04 = (TextView) AnonymousClass0wJ.A0I(this, R.id.title);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(this, R.id.price);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0D);
            C04220Ms.A06(obtainStyledAttributes);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = z;
            if (z) {
                this.A00 = context.getDrawable(R.drawable.dial_element_title_chevron);
                this.A03.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.audition_audio_item_selected_stroke_border_width));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, R.style.TextViewStyle);
                Integer valueOf = Integer.valueOf(resourceId);
                this.A05 = valueOf;
                if (valueOf != null) {
                    this.A04.setTextAppearance(resourceId);
                }
                Integer num = this.A05;
                if (num != null) {
                    this.A03.setTextAppearance(num.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ CameraProductTitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
