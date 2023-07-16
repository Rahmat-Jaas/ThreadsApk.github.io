package com.instagram.fbpay.hub.view;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BrandingRowItem extends ConstraintLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        View inflate = ConstraintLayout.inflate(context, R.layout.branding_row_item, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A07);
        C04220Ms.A06(obtainStyledAttributes);
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(inflate, R.id.icon);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.title);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.subtitle);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            imageView.setImageResource(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            textView.setText(resourceId2);
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId3 != 0) {
            textView2.setText(resourceId3);
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ BrandingRowItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrandingRowItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
