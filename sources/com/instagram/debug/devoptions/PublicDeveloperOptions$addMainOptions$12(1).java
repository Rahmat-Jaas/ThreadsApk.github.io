package com.instagram.debug.devoptions;

import X.AnonymousClass0gN;
import X.AnonymousClass1mO;
import X.AnonymousClass3XY;
import X.AnonymousClass3Y6;
import X.C04220Ms;
import X.C14030oh;
import X.C36622Sa;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.facebook.quickpromotion.sdk.QPSdkModule;
import com.facebook.quickpromotion.sdk.controllers.QPSdkSurfaceControllerManager;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

public final class PublicDeveloperOptions$addMainOptions$12 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$12(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-725826644);
        C36622Sa.A00();
        UserSession userSession = this.$userSession;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3XY A01 = AnonymousClass3XY.A01();
        AnonymousClass3Y6 r1 = A01.A01;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
        AnonymousClass0gN.A00().AKp(new AnonymousClass1mO(A01));
        InstagramQpSdkModule instagramQpSdkModule = (InstagramQpSdkModule) userSession.A01(InstagramQpSdkModule.class, new KtLambdaShape95S0100000_I2_75(userSession, 14));
        synchronized (instagramQpSdkModule) {
            QPSdkModule qPSdkModule = (QPSdkModule) instagramQpSdkModule.A03.getValue();
            synchronized (qPSdkModule) {
                for (QPSdkSurfaceControllerManager A00 : qPSdkModule.A03.values()) {
                    A00.A00();
                }
            }
        }
        C63813iO.A03(this.$context, (String) null, 2131825393, 1);
        C14030oh.A0C(1779487388, A05);
    }
}
