package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape149S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.10y  reason: invalid class name and case insensitive filesystem */
public final class C196610y extends C41030Luu {
    public final C22971bh A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        C563937a r3 = (C563937a) this.A01.get(i);
        View view = m5o.itemView;
        C04220Ms.A05(view);
        AnonymousClass1TL r1 = r3.A00;
        IgdsListCell igdsListCell = (IgdsListCell) view;
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHECKBOX);
        String str = r1.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0H(str);
        igdsListCell.setAlpha(C18230wP.A00(r3.A01 ? 1 : 0));
        Boolean bool = r1.A00;
        boolean z = true;
        if (!C18190wL.A1Z(bool, true) || !r3.A01) {
            z = false;
        }
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(r3.A01);
        igdsListCell.A0C(new IDxCListenerShape149S0200000_1_I2(1, this, r3));
    }

    public C196610y(C22971bh r2) {
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1303997032);
        int size = this.A01.size();
        C14030oh.A0A(-596426457, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass11i(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.add_objectives_list_item, C18200wM.A1Y(viewGroup)));
    }
}
