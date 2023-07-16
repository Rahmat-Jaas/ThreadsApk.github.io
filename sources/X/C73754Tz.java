package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.concurrent.Callable;

/* renamed from: X.4Tz  reason: invalid class name and case insensitive filesystem */
public final class C73754Tz implements Callable {
    public final /* synthetic */ IgdsListCell A00;
    public final /* synthetic */ C22064CEu A01;
    public final /* synthetic */ EK3 A02;
    public final /* synthetic */ Integer A03;

    public C73754Tz(IgdsListCell igdsListCell, C22064CEu cEu, EK3 ek3, Integer num) {
        this.A00 = igdsListCell;
        this.A03 = num;
        this.A01 = cEu;
        this.A02 = ek3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00.getContext();
        C04220Ms.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        C25553Dnn A002 = AnonymousClass4DS.A00((Activity) context, this.A03.intValue());
        A002.A0D = true;
        C18230wP.A15(AnonymousClass0wJ.A0K(this.A01.itemView, R.id.igds_textcell_title), A002);
        A002.A0A = false;
        AnonymousClass4DQ.A01(A002, this.A02, 7);
        return true;
    }
}
