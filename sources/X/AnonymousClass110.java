package X;

import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2;
import com.facebook.redex.IDxCListenerShape16S0101000_1_I2;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.110  reason: invalid class name */
public final class AnonymousClass110 extends C41030Luu {
    public List A00 = AnonymousClass0ZV.A00;
    public final AnonymousClass0YY A01;

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I2 = (KtCSuperShape0S2020000_I2) this.A00.get(i);
        String str = ktCSuperShape0S2020000_I2.A01;
        boolean z = ktCSuperShape0S2020000_I2.A02;
        boolean z2 = ktCSuperShape0S2020000_I2.A03;
        AnonymousClass0YY r3 = this.A01;
        IgdsListCell igdsListCell = ((AnonymousClass12H) m5o).A00;
        igdsListCell.A04();
        igdsListCell.A0H(str);
        igdsListCell.A0F(AnonymousClass24V.TYPE_CHECKBOX, true);
        igdsListCell.setEnabled(true);
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(z2);
        igdsListCell.A0C(new IDxCListenerShape16S0101000_1_I2(i, 1, r3));
        C18190wL.A17(igdsListCell);
    }

    public AnonymousClass110(AnonymousClass0YY r2) {
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-2072347969);
        int size = this.A00.size();
        C14030oh.A0A(473399668, A03);
        return size;
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C18240wQ.A1H(viewGroup);
        return new AnonymousClass12H(C18240wQ.A0T(C18190wL.A0A(viewGroup)));
    }
}
