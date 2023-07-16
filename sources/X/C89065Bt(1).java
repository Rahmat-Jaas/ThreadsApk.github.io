package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5Bt  reason: invalid class name and case insensitive filesystem */
public final class C89065Bt extends M5O {
    public ViewStub A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C107306gX A05;

    public C89065Bt(View view) {
        super(view);
        this.A01 = C18200wM.A0J(view, R.id.icon);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.subtitle);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.description);
        this.A00 = (ViewStub) view.requireViewById(R.id.rightView);
    }
}
