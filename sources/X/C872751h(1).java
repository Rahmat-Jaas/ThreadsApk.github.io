package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.51h  reason: invalid class name and case insensitive filesystem */
public final class C872751h extends FrameLayout implements C143538gu {
    public C91935hK A00;

    public final C91935hK getFulfillmentOptionCellViewModel() {
        return this.A00;
    }

    public void setViewModel(C91935hK r12) {
        Integer num;
        this.A00 = r12;
        Context A0A = C18190wL.A0A(this);
        ListCell listCell = new ListCell(A0A, (AttributeSet) null);
        Context A0A2 = C18190wL.A0A(listCell);
        AnonymousClass51H r4 = new AnonymousClass51H(A0A2);
        Context context = r4.getContext();
        C91935hK r0 = this.A00;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00);
        } else {
            num = null;
        }
        if (num != null) {
            r4.setText(context.getString(num.intValue()));
            r4.setTextStyle(AnonymousClass69Q.A0z);
            listCell.setLeftAddOnText(r4);
            C91935hK r02 = this.A00;
            if (r02 != null) {
                int i = r02.A01;
                if (Integer.valueOf(i) != null) {
                    listCell.setPrimaryText(A0A2.getString(i));
                    listCell.setPrimaryTextStyle(AnonymousClass69Q.A1A);
                    listCell.setBackgroundStyle(AnonymousClass699.ACCORDION_PUX_CELL);
                    C121047Dv.A01(A0A, listCell, AnonymousClass006.A00, (Integer) null, (Integer) null, 24);
                    addView(listCell, new FrameLayout.LayoutParams(-1, -2));
                    return;
                }
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public C872751h(Context context) {
        super(context);
    }

    public final void setFulfillmentOptionCellViewModel(C91935hK r1) {
        this.A00 = r1;
    }
}
