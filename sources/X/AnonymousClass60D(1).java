package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.60D  reason: invalid class name */
public final class AnonymousClass60D extends AnonymousClass1lO {
    public final AnonymousClass0ZU A00;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        return new C88695Ag(new IgdsListCell(C18190wL.A0A(viewGroup), (AttributeSet) null));
    }

    public final Class modelClass() {
        return C131807sq.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131807sq r5 = (C131807sq) mfV;
        C88695Ag r6 = (C88695Ag) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        View view = r6.itemView;
        Context context = view.getContext();
        C86104wH.A1C(view, 81, this);
        IgdsListCell igdsListCell = r6.A00;
        igdsListCell.A0H(AnonymousClass0wJ.A0k(context, 2131821376));
        igdsListCell.A0G(AnonymousClass0wJ.A0k(context, 2131821375));
        igdsListCell.A0F(r5.A00, A1Z);
    }

    public AnonymousClass60D(AnonymousClass0ZU r1) {
        this.A00 = r1;
    }
}
