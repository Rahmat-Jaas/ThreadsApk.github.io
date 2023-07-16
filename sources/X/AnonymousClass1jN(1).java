package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape73S0300000_1_I2;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1jN  reason: invalid class name */
public final class AnonymousClass1jN extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        C04220Ms.A0B(context, 0);
        return C18240wQ.A0T(context);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        return C18240wQ.A0T(context);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r5, C127397h3 r6, Object obj) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        AnonymousClass0wJ.A1N(igdsListCell, r5);
        C04220Ms.A0B(r6, 2);
        AnonymousClass2BY.A00(r5, r6, igdsListCell);
        C109326jp A0L = r6.A0L(40);
        if (A0L == null) {
            return null;
        }
        igdsListCell.A0B(new IDxCListenerShape41S0300000_1_I2(r5, r6, A0L, 4));
        igdsListCell.A0C(new IDxCListenerShape73S0300000_1_I2(0, r5, r6, A0L));
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r4, C127397h3 r5, Object obj, Object obj2) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        C04220Ms.A0B(igdsListCell, 0);
        igdsListCell.setOnClickListener((View.OnClickListener) null);
        igdsListCell.A0C((CompoundButton.OnCheckedChangeListener) null);
        igdsListCell.A0H("");
        igdsListCell.setEnabled(false);
        igdsListCell.A0J("", false);
        igdsListCell.A04();
    }

    public AnonymousClass1jN(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
