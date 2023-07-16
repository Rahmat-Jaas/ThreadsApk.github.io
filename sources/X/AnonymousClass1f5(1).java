package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1f5  reason: invalid class name */
public final class AnonymousClass1f5 extends C197111k {
    public final IgdsListCell A00;
    public final AnonymousClass0YY A01;

    public AnonymousClass1f5(View view, AnonymousClass0YY r4) {
        super(view);
        this.A01 = r4;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A00 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(AnonymousClass24V.TYPE_RADIO);
            igdsListCell.A06(2131831852);
        }
    }
}
