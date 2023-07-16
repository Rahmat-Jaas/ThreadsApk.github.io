package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape42S0300000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5ga  reason: invalid class name and case insensitive filesystem */
public final class C91655ga extends C886359v {
    public final Context A00;
    public final AnonymousClass066 A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final AnonymousClass0YY A04;
    public final AnonymousClass0YM A05;

    public C91655ga(Context context, AnonymousClass066 r4, LoggingContext loggingContext, AnonymousClass0YY r6, AnonymousClass0YY r7, AnonymousClass0YY r8, AnonymousClass0YM r9) {
        super(AnonymousClass69U.A0h, loggingContext, false);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A00 = context;
        this.A01 = r4;
    }

    public static final void A06(C88905Bd r3, C91655ga r4, AnonymousClass7Kx r5) {
        ListCell listCell = r3.A01;
        listCell.A03();
        SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) r5.A01;
        if (selectionEmailViewItem != null) {
            listCell.setPrimaryText(selectionEmailViewItem.A01);
            listCell.setQuaternaryText(selectionEmailViewItem.A03);
        }
        FrameLayout frameLayout = listCell.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        listCell.setActionMenu(r3.A00);
        listCell.setOnClickListener(new IDxCListenerShape42S0300000_2_I2(r3, r4, r5, 2));
    }
}
