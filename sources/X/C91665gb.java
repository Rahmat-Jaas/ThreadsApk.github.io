package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape42S0300000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gb  reason: invalid class name and case insensitive filesystem */
public final class C91665gb extends C886359v {
    public final Context A00;
    public final AnonymousClass066 A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final AnonymousClass0YY A04;
    public final AnonymousClass0YM A05;

    public C91665gb(Context context, AnonymousClass066 r4, LoggingContext loggingContext, AnonymousClass0YY r6, AnonymousClass0YY r7, AnonymousClass0YY r8, AnonymousClass0YM r9) {
        super(AnonymousClass69U.A0l, loggingContext, false);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A00 = context;
        this.A01 = r4;
    }

    public static final void A06(C88915Be r3, C91665gb r4, AnonymousClass7Kx r5) {
        ListCell listCell = r3.A01;
        listCell.A03();
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) r5.A01;
        if (selectionPhoneNumberViewItem != null) {
            listCell.setPrimaryText(selectionPhoneNumberViewItem.A01);
            listCell.setQuaternaryText(selectionPhoneNumberViewItem.A03);
        }
        FrameLayout frameLayout = listCell.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        listCell.setActionMenu(r3.A00);
        listCell.setOnClickListener(new IDxCListenerShape42S0300000_2_I2(r3, r4, r5, 7));
    }
}
