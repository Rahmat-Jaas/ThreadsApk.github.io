package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gc  reason: invalid class name and case insensitive filesystem */
public final class C91675gc extends C886359v {
    public final Context A00;
    public final AnonymousClass066 A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final AnonymousClass0YY A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91675gc(Context context, AnonymousClass066 r4, LoggingContext loggingContext, AnonymousClass0YY r6, AnonymousClass0YY r7, AnonymousClass0YY r8, boolean z) {
        super(AnonymousClass69U.A06, loggingContext, false);
        C04220Ms.A0B(r6, 2);
        this.A04 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A00 = context;
        this.A01 = r4;
        this.A05 = z;
    }

    public static final void A06(C88925Bf r4, C91675gc r5, AnonymousClass7Kx r6) {
        InlineActionMenu inlineActionMenu;
        ListCell listCell = r4.A01;
        listCell.A03();
        SelectionShippingAddressItem selectionShippingAddressItem = (SelectionShippingAddressItem) r6.A01;
        if (selectionShippingAddressItem != null) {
            listCell.setPrimaryText(selectionShippingAddressItem.A03);
            listCell.setSecondaryText(selectionShippingAddressItem.A02);
            listCell.setTertiaryText(selectionShippingAddressItem.A04);
            String str = null;
            if (selectionShippingAddressItem.A0H) {
                inlineActionMenu = r4.A00;
            } else {
                inlineActionMenu = null;
            }
            listCell.setActionMenu(inlineActionMenu);
            String str2 = selectionShippingAddressItem.A05;
            if (str2 == null) {
                Integer num = selectionShippingAddressItem.A00;
                if (num != null) {
                    str = r5.A00.getString(num.intValue());
                }
            } else {
                str = str2;
            }
            listCell.setErrorText(str);
        }
        FrameLayout frameLayout = listCell.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        C86144wL.A1C(listCell, r5, r6, r4, 8);
    }
}
