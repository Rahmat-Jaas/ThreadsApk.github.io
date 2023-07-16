package com.instagram.leadgen.core.ui;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenCreativesSectionHeaderRow extends ConstraintLayout {
    public final IgTextView A00;
    public final IgImageView A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void A04(String str, AnonymousClass0ZU r5, boolean z) {
        this.A00.setText(str);
        int i = R.drawable.instagram_chevron_down_outline_16;
        if (z) {
            i = R.drawable.instagram_chevron_up_outline_16;
        }
        C18180wK.A0r(getContext(), this.A01, i);
        AnonymousClass0wJ.A16(this, 483, r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        ConstraintLayout.inflate(context, R.layout.lead_gen_view_creatives_section_header_row, this);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0J(this, R.id.title_text_view);
        this.A01 = (IgImageView) AnonymousClass0wJ.A0J(this, R.id.chevron);
    }

    public /* synthetic */ LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
