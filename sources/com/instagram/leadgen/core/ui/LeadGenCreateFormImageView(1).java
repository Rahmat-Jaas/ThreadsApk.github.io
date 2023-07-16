package com.instagram.leadgen.core.ui;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenCreateFormImageView extends ConstraintLayout {
    public final RoundedCornerImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        ConstraintLayout.inflate(context, R.layout.lead_gen_view_create_form_image, this);
        this.A00 = (RoundedCornerImageView) AnonymousClass0wJ.A0J(this, R.id.lead_form_cover_image);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreateFormImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ LeadGenCreateFormImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
