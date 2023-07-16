package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;

/* renamed from: X.51s  reason: invalid class name */
public final class AnonymousClass51s extends LinearLayout implements C143538gu {
    public C91905hH A00;

    public void setViewModel(C91905hH r7) {
        C04220Ms.A0B(r7, 0);
        this.A00 = r7;
        View A0K = AnonymousClass0wJ.A0K(this, R.id.card_scan_container);
        C86104wH.A1C(A0K, 18, this);
        Context A0A = C18190wL.A0A(this);
        int A002 = AnonymousClass7IS.A00(A0A, R.attr.fbpay_ui_card_scan_cell_padding);
        int A003 = AnonymousClass7IS.A00(A0A, R.attr.fbpay_ui_card_scan_cell_padding_top);
        int A004 = AnonymousClass7IS.A00(A0A, R.attr.fbpay_ui_card_scan_cell_padding_left);
        C91905hH r1 = this.A00;
        if (r1 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (r1.A00) {
            A004 = 0;
        } else {
            A003 = A002;
        }
        Integer valueOf = Integer.valueOf(A004);
        Integer valueOf2 = Integer.valueOf(A002);
        AnonymousClass7IS.A02(A0K, valueOf, valueOf2, Integer.valueOf(A003), valueOf2);
    }

    public AnonymousClass51s(Context context) {
        super(context);
        LinearLayout.inflate(context, R.layout.ecp_card_scanner_view, this);
        AnonymousClass7Kz.A0G().A04(context, 8, 5);
        throw null;
    }
}
