package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5Bg  reason: invalid class name and case insensitive filesystem */
public final class C88935Bg extends M5O {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final /* synthetic */ C91595gU A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88935Bg(LinearLayout linearLayout, C91595gU r3) {
        super(linearLayout);
        C04220Ms.A0B(linearLayout, 2);
        this.A03 = r3;
        this.A01 = linearLayout;
        this.A02 = (TextView) AnonymousClass0wJ.A0J(linearLayout, R.id.description);
        this.A00 = (ImageView) AnonymousClass0wJ.A0J(linearLayout, R.id.back_button);
    }
}
