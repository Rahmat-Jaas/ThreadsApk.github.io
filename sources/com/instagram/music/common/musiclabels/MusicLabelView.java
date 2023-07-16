package com.instagram.music.common.musiclabels;

import X.AnonymousClass2B0;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MusicLabelView extends TextView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setLabelModel(AnonymousClass2B0 r2) {
        if (r2 != null) {
            C04220Ms.A06(getContext());
            throw C18210wN.A0W("getLabel");
        } else {
            setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        setBackground(context.getDrawable(R.drawable.label_bg));
        setMaxLines(1);
        setIncludeFontPadding(false);
        setTextSize(2, 7.0f);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.bugreporter_button_guide_offset);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setTypeface(Typeface.DEFAULT_BOLD);
        C18180wK.A0s(context, this, R.color.canvas_bottom_sheet_description_text_color);
        setVisibility(8);
    }

    public /* synthetic */ MusicLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
