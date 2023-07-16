package X;

import android.view.View;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.2sm  reason: invalid class name and case insensitive filesystem */
public final class C50302sm {
    public static final void A00(C57693Cc r6, AnonymousClass12V r7) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        IgdsListCell igdsListCell = r7.A00;
        igdsListCell.A0H(r6.A04);
        String str = "";
        C04220Ms.A0B(str, 0);
        igdsListCell.A0I(str, str, false);
        AnonymousClass24V r1 = r6.A01;
        if (r1 != AnonymousClass24V.TYPE_UNKNOWN) {
            igdsListCell.A0F(r1, A1Z);
        }
        String str2 = r6.A03;
        if (str2 != null) {
            str = str2;
        }
        igdsListCell.A0G(str);
        View.OnClickListener onClickListener = r6.A00;
        if (onClickListener != null) {
            igdsListCell.setClickable(A1Z);
            igdsListCell.setOnClickListener(onClickListener);
            C18210wN.A0y(igdsListCell);
        } else {
            igdsListCell.setClickable(false);
            igdsListCell.setOnClickListener((View.OnClickListener) null);
        }
        Integer num = r6.A02;
        if (num != null) {
            igdsListCell.A05(num.intValue());
        }
    }
}
