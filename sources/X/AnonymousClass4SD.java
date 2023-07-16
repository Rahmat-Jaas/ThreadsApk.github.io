package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4SD  reason: invalid class name */
public final class AnonymousClass4SD implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ ImageUrl A02;

    public AnonymousClass4SD(Fragment fragment, C11630kW r2, ImageUrl imageUrl) {
        this.A00 = fragment;
        this.A02 = imageUrl;
        this.A01 = r2;
    }

    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            ImageUrl imageUrl = this.A02;
            C11630kW r2 = this.A01;
            C25828Dsm A0W = C18190wL.A0W(context);
            A0W.A0L(2131833561);
            A0W.A0K(2131833560);
            C18180wK.A1M(A0W);
            A0W.A0n(imageUrl, r2);
            AnonymousClass0wJ.A1K(A0W);
        }
    }
}
