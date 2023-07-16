package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.1kj  reason: invalid class name and case insensitive filesystem */
public final class C24851kj extends AnonymousClass1lO {
    public final C28321u4 A00;
    public final AnonymousClass47H A01;

    public final Class modelClass() {
        return AnonymousClass19A.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass19A r4 = (AnonymousClass19A) mfV;
        C198211z r5 = (C198211z) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        IgdsListCell igdsListCell = r5.A00;
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHEVRON);
        CharSequence text = igdsListCell.getResources().getText(2131828926);
        C04220Ms.A06(text);
        igdsListCell.A0H(text);
        igdsListCell.A0B(r4.A00);
    }

    public C24851kj(C28321u4 r1, AnonymousClass47H r2) {
        AnonymousClass0wJ.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        C198211z r4 = new C198211z(C18240wQ.A0T(C18190wL.A0A(viewGroup)));
        AnonymousClass47H r3 = this.A01;
        C28321u4 r2 = this.A00;
        r3.A00(r4.itemView, QPTooltipAnchor.A04, r2);
        return r4;
    }
}
