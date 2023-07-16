package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13M  reason: invalid class name */
public final class AnonymousClass13M extends M5O {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;

    public AnonymousClass13M(View view) {
        super(view);
        this.A00 = (ViewStub) view.findViewById(R.id.info_icon);
        this.A02 = C18180wK.A0G(view, R.id.info_header);
        this.A01 = C18180wK.A0G(view, R.id.info_text);
    }
}
