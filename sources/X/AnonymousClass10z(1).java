package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape149S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.10z  reason: invalid class name */
public final class AnonymousClass10z extends C41030Luu {
    public final C22961bg A00;
    public final List A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        AnonymousClass1TK r3 = (AnonymousClass1TK) this.A01.get(i);
        View view = m5o.itemView;
        C04220Ms.A05(view);
        IgdsListCell igdsListCell = (IgdsListCell) view;
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_CHECKBOX);
        String str = r3.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0H(str);
        igdsListCell.setChecked(C04220Ms.A0I(r3.A00, C18180wK.A0Y()));
        igdsListCell.A0C(new IDxCListenerShape149S0200000_1_I2(2, this, r3));
    }

    public AnonymousClass10z(C22961bg r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1351782982);
        int size = this.A01.size();
        C14030oh.A0A(218291059, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C197011j(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.add_objectives_list_item, C18200wM.A1Y(viewGroup)));
    }
}
