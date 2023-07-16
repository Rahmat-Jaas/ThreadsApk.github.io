package com.instagram.ar.core.discovery.minigallery.persistence;

import X.AnonymousClass6UW;
import X.AnonymousClass765;
import X.C04220Ms;
import X.C09810gi;
import X.C09820gj;
import X.C103076Xs;
import X.C120627Bu;
import X.C134027wu;
import X.C41012LuB;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class MiniGalleryCategoriesRepository {
    public final long A00;
    public final AnonymousClass765 A01;
    public final C09810gi A02;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[LOOP:0: B:10:0x0033->B:12:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.D1X r11, X.C146958n9 r12, long r13) {
        /*
            r10 = this;
            r7 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2.A00(r7, r12)
            if (r0 == 0) goto L_0x008c
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r9 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 != r9) goto L_0x0092
            long r13 = r6.A01
            java.lang.Object r7 = r6.A02
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r7 = (com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository) r7
            X.AnonymousClass0OU.A00(r1)
        L_0x0029:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x0033:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r6.next()
            X.6m4 r1 = (X.C110666m4) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.String r4 = r1.A01
            java.lang.String r3 = r1.A02
            java.lang.String r0 = r1.A04
            X.D1X r2 = X.D1X.valueOf(r0)
            boolean r1 = r1.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2
            r0.<init>((X.D1X) r2, (java.lang.String) r4, (java.lang.String) r3, (boolean) r1)
            r5.add(r0)
            goto L_0x0033
        L_0x0058:
            X.AnonymousClass0OU.A00(r1)
            X.765 r5 = r10.A01
            java.lang.String r4 = r11.name()
            long r1 = X.C18240wQ.A09(r13)
            r6.A02 = r10
            r6.A01 = r13
            r6.A00 = r9
            java.lang.String r3 = "\n        SELECT * FROM mini_gallery_categories  \n        WHERE miniGallerySurface=? and syncedAt\n        AND syncedAt>=?\n  "
            r0 = 2
            X.MAm r3 = X.Lv1.A00(r3, r0)
            X.C86154wM.A1L(r3, r4, r9)
            r3.AAa(r0, r1)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.M6w r1 = r5.A01
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r7, r5, r3)
            java.lang.Object r1 = X.C120467Az.A00(r2, r1, r0, r6)
            if (r1 == r8) goto L_0x00a4
            r7 = r10
            goto L_0x0029
        L_0x008c:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2
            r6.<init>(r10, r12, r7)
            goto L_0x0015
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0097:
            long r1 = r7.A00
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            java.lang.Integer r0 = X.AnonymousClass006.A0C
        L_0x009f:
            X.6jP r8 = new X.6jP
            r8.<init>(r0, r5)
        L_0x00a4:
            return r8
        L_0x00a5:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository.A00(X.D1X, X.8n9, long):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryCategoriesRepository(UserSession userSession) {
        AnonymousClass765 r2;
        C134027wu r5 = MiniGalleryDatabase.A00;
        Class<MiniGalleryDatabase> cls = MiniGalleryDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    C41012LuB A002 = C120627Bu.A00(r5, userSession, cls);
                    AnonymousClass6UW.A00(A002, 797293936, 2023115286, false);
                    A002.A03(C103076Xs.A00);
                    A002.A05 = true;
                    A002.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        MiniGalleryDatabase_Impl miniGalleryDatabase_Impl = (MiniGalleryDatabase_Impl) ((MiniGalleryDatabase) igRoomDatabase);
        if (miniGalleryDatabase_Impl.A00 != null) {
            r2 = miniGalleryDatabase_Impl.A00;
        } else {
            synchronized (miniGalleryDatabase_Impl) {
                if (miniGalleryDatabase_Impl.A00 == null) {
                    miniGalleryDatabase_Impl.A00 = new AnonymousClass765(miniGalleryDatabase_Impl);
                }
                r2 = miniGalleryDatabase_Impl.A00;
            }
        }
        C09810gi r1 = C09820gj.A00;
        C04220Ms.A0B(r2, 2);
        this.A01 = r2;
        this.A02 = r1;
        this.A00 = TimeUnit.DAYS.toMillis(90);
    }
}
