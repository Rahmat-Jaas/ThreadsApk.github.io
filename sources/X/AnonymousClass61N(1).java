package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.61N  reason: invalid class name */
public final class AnonymousClass61N extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ IgdsBanner A02;

    public final void run() {
        IgdsBanner igdsBanner = this.A02;
        Resources resources = this.A00.getResources();
        C04220Ms.A06(resources);
        F6Z f6z = new F6Z(resources, this.A01);
        f6z.A01();
        igdsBanner.setIcon((Drawable) f6z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61N(Context context, Bitmap bitmap, IgdsBanner igdsBanner) {
        super(1492230029);
        this.A02 = igdsBanner;
        this.A00 = context;
        this.A01 = bitmap;
    }
}
