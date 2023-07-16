package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.10u  reason: invalid class name and case insensitive filesystem */
public final class C196210u extends I7V {
    public final AnonymousClass36B A00;

    public C196210u(AnonymousClass36B r2) {
        super((JWT) C196010q.A00);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass12L r5 = (AnonymousClass12L) m5o;
        C04220Ms.A0B(r5, 0);
        AnonymousClass0MJ r3 = new AnonymousClass0MJ();
        Object item = getItem(i);
        r3.A00 = item;
        Context A0B = C18240wQ.A0B(r5);
        String A0k = AnonymousClass0wJ.A0k(A0B, ((AnonymousClass19W) ((KtCSuperShape0S0110000_I2) item).A00).A01);
        String A0k2 = AnonymousClass0wJ.A0k(A0B, ((AnonymousClass19W) ((KtCSuperShape0S0110000_I2) r3.A00).A00).A00);
        IgdsListCell igdsListCell = r5.A00;
        igdsListCell.A0H(A0k);
        igdsListCell.A0G(A0k2);
        igdsListCell.setTextCellType(AnonymousClass24V.TYPE_SWITCH);
        igdsListCell.setChecked(((KtCSuperShape0S0110000_I2) r3.A00).A01);
        igdsListCell.A0D(new AnonymousClass4DI(this, r3, i));
    }

    public final long getItemId(int i) {
        int A03 = C14030oh.A03(-2121347804);
        long j = (long) ((AnonymousClass19W) ((KtCSuperShape0S0110000_I2) getItem(i)).A00).A00;
        C14030oh.A0A(-1380351127, A03);
        return j;
    }

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AnonymousClass12L(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.content_language_locale_item, C18200wM.A1Y(viewGroup)));
    }
}
