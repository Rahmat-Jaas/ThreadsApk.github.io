package com.instagram.ar.core.discovery.minigallery.services;

import X.AnonymousClass0wJ;
import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class MiniGalleryCategoriesService {
    public final long A00 = TimeUnit.DAYS.toMillis(90);
    public final Context A01;
    public final MiniGalleryCategoriesRepository A02;
    public final UserSession A03;

    public /* synthetic */ MiniGalleryCategoriesService(Context context, UserSession userSession) {
        MiniGalleryCategoriesRepository miniGalleryCategoriesRepository = new MiniGalleryCategoriesRepository(userSession);
        AnonymousClass0wJ.A1O(userSession, context);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = miniGalleryCategoriesRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r6, X.D1X r7, X.C146958n9 r8) {
        /*
            r3 = 35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x0045
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0045
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r3) goto L_0x004f
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.6jP r1 = (X.C109066jP) r1
            java.util.List r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004a
            X.5ut r0 = X.C94425ut.A00
            X.1jB r4 = X.C86164wN.A0R(r0)
            return r4
        L_0x0035:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r2 = r6.A02
            long r0 = r6.A00
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r7, r5, r0)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0045:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = X.C86114wI.A0x(r6, r8, r3)
            goto L_0x0016
        L_0x004a:
            X.1jA r4 = X.AnonymousClass1jA.A00(r1)
            return r4
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService.A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService, X.D1X, X.8n9):java.lang.Object");
    }
}
