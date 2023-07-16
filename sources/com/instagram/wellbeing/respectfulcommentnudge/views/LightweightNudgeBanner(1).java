package com.instagram.wellbeing.respectfulcommentnudge.views;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LightweightNudgeBanner extends IgLinearLayout {
    public final TextView A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setBody(String str) {
        C04220Ms.A0B(str, 0);
        this.A00.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        C18190wL.A17(View.inflate(context, R.layout.layout_lightweight_nudge, this));
        this.A00 = (TextView) AnonymousClass0wJ.A0I(this, R.id.banner_body);
        setOrientation(1);
    }

    public /* synthetic */ LightweightNudgeBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LightweightNudgeBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
