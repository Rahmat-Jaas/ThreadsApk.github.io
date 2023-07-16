package com.facebookpay.widget.pricetable;

import X.AnonymousClass0A5;
import X.AnonymousClass7Fe;
import X.AnonymousClass7Kz;
import X.AnonymousClass86W;
import X.C04220Ms;
import X.C29934Fwk;
import X.C86024w9;
import X.C86114wI;
import X.C86134wK;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TableLayout;
import com.instagram.barcelona.R;
import java.util.List;

public final class PriceTable extends TableLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A06 = {C86134wK.A0x(PriceTable.class, "priceTableRowDataList", "getPriceTableRowDataList()Ljava/util/List;")};
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C86024w9 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        this.A01 = true;
        this.A05 = AnonymousClass86W.A01(this, 71);
        AnonymousClass7Kz.A0G();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUIPriceTable, C29934Fwk.A0f);
        this.A03 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, obtainStyledAttributes.getDimensionPixelOffset(0, 0));
        obtainStyledAttributes.recycle();
        setColumnShrinkable(1, true);
        setColumnStretchable(2, true);
        AnonymousClass7Fe.A02(this, 2);
        setImportantForAccessibility(2);
    }

    public final List getPriceTableRowDataList() {
        return (List) C86114wI.A0i(this, this.A05, A06, 0);
    }

    public final void setPriceTableRowDataList(List list) {
        C86114wI.A1L(this, list, this.A05, A06, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PriceTable(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }
}
