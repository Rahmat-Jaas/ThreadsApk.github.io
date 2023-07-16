package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.cameracore.mediapipeline.services.worldnavigationservice.WorldNavigationServiceDelegateWrapper;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.82F  reason: invalid class name */
public final class AnonymousClass82F implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ WorldNavigationServiceDelegateWrapper A02;

    public AnonymousClass82F(WorldNavigationServiceDelegateWrapper worldNavigationServiceDelegateWrapper, double d, double d2) {
        this.A02 = worldNavigationServiceDelegateWrapper;
        this.A00 = d;
        this.A01 = d2;
    }

    public final void run() {
        C104426bl r5 = this.A02.mDelegate;
        double d = this.A00;
        double d2 = this.A01;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(d);
        C86144wL.A1T(A0r);
        A0r.append(d2);
        String encode = Uri.encode(A0r.toString());
        Intent A0B = C86164wN.A0B(C18250wR.A05("android.intent.action.VIEW").setFlags(268435456), AnonymousClass00U.A0L("geo:0,0?q=", encode));
        C04220Ms.A06(A0B);
        Context context = r5.A00;
        if (context.getPackageManager().queryIntentActivities(A0B, Constants.LOAD_RESULT_PGO_ATTEMPTED).isEmpty()) {
            A0B.setData(C15430rJ.A01(AnonymousClass00U.A0L("http://maps.google.com/maps?q=", encode)));
        }
        C10650ih.A0B(context, A0B);
    }
}
