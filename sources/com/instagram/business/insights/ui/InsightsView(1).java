package com.instagram.business.insights.ui;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C18190wL;
import X.C18250wR;
import X.C29881zS;
import X.C29934Fwk;
import X.C81344nd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

public class InsightsView extends LinearLayout {
    public int A00;
    public View A01;
    public View A02;
    public LinearLayout.LayoutParams A03;
    public LinearLayout.LayoutParams A04;
    public LinearLayout.LayoutParams A05;
    public LinearLayout.LayoutParams A06;
    public LinearLayout A07;
    public C81344nd A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public final Typeface A0D = Typeface.create("Roboto-Regular", 0);

    private void setSurfaceFromAttribute(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1Z);
            if (!obtainStyledAttributes.hasValue(0) || (i = obtainStyledAttributes.getInt(0, 0)) == 0 || i == 1) {
                obtainStyledAttributes.recycle();
                return;
            }
            throw C18190wL.A0a(AnonymousClass00U.A0S("InsightsView Surface[", "] undefined", i));
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public InsightsView(Context context) {
        super(context);
        A00(context);
    }

    private void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_insights_view, this);
        this.A02 = inflate;
        this.A0A = C18250wR.A0L(inflate, R.id.insights_title);
        this.A0B = C18250wR.A0L(this.A02, R.id.insights_value);
        this.A0C = C18250wR.A0L(this.A02, R.id.insights_value_message);
        this.A09 = C18250wR.A0L(this.A02, R.id.insights_footer);
        this.A07 = (LinearLayout) this.A02.requireViewById(R.id.insights_sections_view);
        View requireViewById = this.A02.requireViewById(R.id.insights_info);
        this.A01 = requireViewById;
        AnonymousClass0wJ.A16(requireViewById, 177, this);
        Resources resources = getResources();
        resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A00 = C18250wR.A00(resources);
        this.A06 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        this.A03 = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A04 = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        this.A05 = layoutParams;
        layoutParams.setMargins(0, 0, this.A00, 0);
    }

    public void setDelegate(C81344nd r1) {
        this.A08 = r1;
    }

    public void setSurface(C29881zS r1) {
    }

    public InsightsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
        setSurfaceFromAttribute(context, attributeSet);
    }
}
