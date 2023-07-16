package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5BR  reason: invalid class name */
public final class AnonymousClass5BR extends M5O {
    public final ImageView A00;
    public final TextView A01;
    public final /* synthetic */ C91375g8 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BR(View view, C91375g8 r10) {
        super(view);
        this.A02 = r10;
        this.A00 = (ImageView) view.findViewById(R.id.icon);
        TextView A0G = C18180wK.A0G(view, R.id.title);
        this.A01 = A0G;
        AnonymousClass7Fe.A03(view, (float[]) null, 2, 11, 11, 4);
        C04220Ms.A04(A0G);
        AnonymousClass7Fd.A02(A0G, AnonymousClass69Q.POST_PURCHASE_ACTION_TEXT);
    }
}
