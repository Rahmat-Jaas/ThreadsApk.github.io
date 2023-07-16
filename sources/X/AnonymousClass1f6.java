package X;

import android.app.Activity;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1f6  reason: invalid class name */
public final class AnonymousClass1f6 extends C197111k {
    public final Activity A00;
    public final IgdsListCell A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;

    public AnonymousClass1f6(Activity activity, View view, AnonymousClass0YY r5, AnonymousClass0YY r6) {
        super(view);
        this.A00 = activity;
        this.A02 = r5;
        this.A03 = r6;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A01 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(AnonymousClass24V.TYPE_RADIO);
        }
    }
}
