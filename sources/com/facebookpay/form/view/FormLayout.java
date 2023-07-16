package com.facebookpay.form.view;

import X.AnonymousClass0ZU;
import X.AnonymousClass7Kz;
import X.C117006xy;
import X.C14030oh;
import X.C143158gC;
import X.C86114wI;
import X.C883057n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

public class FormLayout extends TableLayout {
    public float A00;
    public C883057n A01;
    public AnonymousClass0ZU A02;
    public int A03;
    public final C143158gC A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormLayout(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, R.style.Ig4aFbPay), attributeSet);
        AnonymousClass7Kz.A0K();
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A02 = null;
        this.A03 = 0;
        this.A04 = C86114wI.A0Q(this, 81);
    }

    public final void addView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        float f = ((TableRow.LayoutParams) layoutParams).weight;
        Context context = getContext();
        int A002 = (int) C117006xy.A00(context, R.attr.fbpay_cell_horizontal_margin);
        float f2 = this.A00;
        if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 + f > 1.0f) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            TableRow tableRow = new TableRow(context);
            TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
            if (getChildCount() > 0) {
                layoutParams2.topMargin = this.A03;
            }
            addView(tableRow, layoutParams2);
        } else {
            ViewGroup viewGroup = (ViewGroup) getChildAt(getChildCount() - 1);
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getChildAt(viewGroup.getChildCount() - 1).getLayoutParams();
            layoutParams3.getClass();
            ((TableRow.LayoutParams) layoutParams3).rightMargin = A002;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            layoutParams4.getClass();
            ((TableRow.LayoutParams) layoutParams4).leftMargin = A002;
        }
        this.A00 += f;
        ((ViewGroup) getChildAt(getChildCount() - 1)).addView(view);
    }

    public void onAttachedToWindow() {
        int A06 = C14030oh.A06(1312790527);
        super.onAttachedToWindow();
        C883057n r0 = this.A01;
        if (r0 != null) {
            r0.A04.A0E(this.A04);
        }
        C14030oh.A0D(-944951535, A06);
    }

    public void onDetachedFromWindow() {
        int A06 = C14030oh.A06(519839021);
        super.onDetachedFromWindow();
        C883057n r0 = this.A01;
        if (r0 != null) {
            r0.A04.A0F(this.A04);
        }
        C14030oh.A0D(-1439790898, A06);
    }

    public void setRowSpacing(int i) {
        this.A03 = getResources().getDimensionPixelOffset(i);
    }

    public void setOnRebuild(AnonymousClass0ZU r1) {
        this.A02 = r1;
    }

    public FormLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
