package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5BQ  reason: invalid class name */
public final class AnonymousClass5BQ extends M5O {
    public final TextView A00;
    public final View A01;
    public final /* synthetic */ C91325g3 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BQ(View view, C91325g3 r6) {
        super(view);
        this.A02 = r6;
        TextView A0G = C18180wK.A0G(view, R.id.title);
        this.A00 = A0G;
        View findViewById = view.findViewById(R.id.divider);
        this.A01 = findViewById;
        C04220Ms.A04(A0G);
        AnonymousClass7Fd.A02(A0G, AnonymousClass69Q.A0q);
        Context A0A = C18190wL.A0A(view);
        C04220Ms.A06(findViewById);
        C121047Dv.A00(A0A, findViewById, 19, false);
    }
}
