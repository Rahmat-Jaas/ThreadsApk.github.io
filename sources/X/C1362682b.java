package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.82b  reason: invalid class name and case insensitive filesystem */
public final class C1362682b implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ IgdsBanner A02;

    public C1362682b(Context context, ImageUrl imageUrl, IgdsBanner igdsBanner) {
        this.A01 = imageUrl;
        this.A02 = igdsBanner;
        this.A00 = context;
    }

    public final void run() {
        Bitmap A002 = C37744K2e.A00(C37744K2e.A01(), this.A01, "IgUiHelper", false);
        IgdsBanner igdsBanner = this.A02;
        igdsBanner.post(new AnonymousClass61N(this.A00, A002, igdsBanner));
    }
}
