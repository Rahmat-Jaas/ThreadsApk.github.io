package com.instagram.barcelona.feed.data;

import X.AnonymousClass6UW;
import X.C04220Ms;
import X.C09810gi;
import X.C09820gj;
import X.C120627Bu;
import X.C134047ww;
import X.C41012LuB;
import X.M11;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;

public final class BarcelonaFeedCacheRoom {
    public final M11 A00;
    public final BarcelonaFeedItemDatabase A01;
    public final C09810gi A02;
    public final UserSession A03;

    public BarcelonaFeedCacheRoom(UserSession userSession) {
        M11 m11;
        C134047ww r5 = BarcelonaFeedItemDatabase.A00;
        Class<BarcelonaFeedItemDatabase> cls = BarcelonaFeedItemDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    C41012LuB A002 = C120627Bu.A00(r5, userSession, cls);
                    AnonymousClass6UW.A00(A002, 767, 766, true);
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        BarcelonaFeedItemDatabase barcelonaFeedItemDatabase = (BarcelonaFeedItemDatabase) igRoomDatabase;
        C09810gi r1 = C09820gj.A00;
        C04220Ms.A0B(barcelonaFeedItemDatabase, 2);
        this.A03 = userSession;
        this.A01 = barcelonaFeedItemDatabase;
        this.A02 = r1;
        BarcelonaFeedItemDatabase_Impl barcelonaFeedItemDatabase_Impl = (BarcelonaFeedItemDatabase_Impl) barcelonaFeedItemDatabase;
        if (barcelonaFeedItemDatabase_Impl.A00 != null) {
            m11 = barcelonaFeedItemDatabase_Impl.A00;
        } else {
            synchronized (barcelonaFeedItemDatabase_Impl) {
                if (barcelonaFeedItemDatabase_Impl.A00 == null) {
                    barcelonaFeedItemDatabase_Impl.A00 = new M11(barcelonaFeedItemDatabase_Impl);
                }
                m11 = barcelonaFeedItemDatabase_Impl.A00;
            }
        }
        this.A00 = m11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (((kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r3).A05 != 0) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8 A[Catch:{ Exception -> 0x00f3, all -> 0x0110 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Integer r22, java.util.List r23, X.C146958n9 r24, int r25, long r26, boolean r28) {
        /*
            r21 = this;
            java.lang.String r11 = "BarcelonaFeedCacheRoom"
            r6 = 0
            r3 = r24
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2
            if (r0 == 0) goto L_0x0011
            r0 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r0 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r0
            int r1 = r0.A05
            r0 = 1
            if (r1 == r6) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r7 = r21
            if (r0 == 0) goto L_0x0036
            r5 = r3
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2) r5
            int r2 = r5.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r5.A01 = r2
        L_0x0024:
            java.lang.Object r0 = r5.A03
            X.D0E r10 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A01
            r4 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 != r4) goto L_0x003c
            int r9 = r5.A00
            java.lang.Object r8 = r5.A02
            java.util.List r8 = (java.util.List) r8
            goto L_0x00ab
        L_0x0036:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0302000_I2
            r5.<init>(r7, r3, r6)
            goto L_0x0024
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0041:
            X.AnonymousClass0OU.A00(r0)
            int r0 = android.os.Process.myTid()
            int r9 = android.os.Process.getThreadPriority(r0)
            com.instagram.service.session.UserSession r3 = r7.A03     // Catch:{ Exception -> 0x00f3 }
            X.0TJ r2 = X.AnonymousClass0TJ.A05     // Catch:{ Exception -> 0x00f3 }
            r0 = 36320906334968213(0x8109ac00041995, double:3.032825646560107E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)     // Catch:{ Exception -> 0x00f3 }
            if (r0 == 0) goto L_0x0067
            r0 = 36602381311741793(0x8209ac00050f61, double:3.2108315552804763E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)     // Catch:{ Exception -> 0x00f3 }
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x00f3 }
        L_0x0067:
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()     // Catch:{ Exception -> 0x00f3 }
            r14 = 0
            if (r22 == 0) goto L_0x0089
            int r13 = r22.intValue()     // Catch:{ Exception -> 0x00f3 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00f3 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f3 }
            long r2 = r2.toSeconds(r0)     // Catch:{ Exception -> 0x00f3 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ Exception -> 0x00f3 }
            long r0 = (long) r13     // Catch:{ Exception -> 0x00f3 }
            long r0 = r12.toSeconds(r0)     // Catch:{ Exception -> 0x00f3 }
            long r2 = r2 - r0
            java.lang.Long r14 = new java.lang.Long     // Catch:{ Exception -> 0x00f3 }
            r14.<init>(r2)     // Catch:{ Exception -> 0x00f3 }
        L_0x0089:
            X.M11 r13 = r7.A00     // Catch:{ Exception -> 0x00f3 }
            boolean r20 = X.C18180wK.A1V(r28)
            r5.A02 = r8     // Catch:{ Exception -> 0x00f3 }
            r5.A00 = r9     // Catch:{ Exception -> 0x00f3 }
            r5.A01 = r4     // Catch:{ Exception -> 0x00f3 }
            X.M6w r0 = r13.A01     // Catch:{ Exception -> 0x00f3 }
            com.facebook.redex.IDxObjectShape0S0311100_7_I2 r12 = new com.facebook.redex.IDxObjectShape0S0311100_7_I2     // Catch:{ Exception -> 0x00f3 }
            r15 = r23
            r16 = r25
            r18 = r26
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r0 = X.C98516Fv.A00(r0, r5, r12)     // Catch:{ Exception -> 0x00f3 }
            if (r0 != r10) goto L_0x00ae
            return r10
        L_0x00ab:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ Exception -> 0x00f3 }
        L_0x00ae:
            java.util.Iterator r4 = X.C86144wL.A0y(r0)     // Catch:{ Exception -> 0x00f3 }
        L_0x00b2:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00f3 }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x00f3 }
            X.Lt1 r0 = (X.C40962Lt1) r0     // Catch:{ Exception -> 0x00f3 }
            byte[] r2 = r0.A05     // Catch:{ Exception -> 0x00f3 }
            java.nio.charset.Charset r1 = X.AnonymousClass74V.A05     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00f3 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00f3 }
            X.MMo r0 = X.C18180wK.A0L(r0)     // Catch:{ Exception -> 0x00f3 }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r1 = X.AnonymousClass6NB.parseFromJson(r0)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r3 = r1.A03     // Catch:{ Exception -> 0x00f3 }
            if (r3 != 0) goto L_0x00e3
            java.lang.Object r0 = r1.A00     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r0 = X.C86124wJ.A0p(r0, r6)     // Catch:{ Exception -> 0x00f3 }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2) r0     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r0 = r0.A01     // Catch:{ Exception -> 0x00f3 }
            X.BKU r0 = (X.BKU) r0     // Catch:{ Exception -> 0x00f3 }
            X.BKN r0 = r0.A0f     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r3 = r0.A4Y     // Catch:{ Exception -> 0x00f3 }
        L_0x00e3:
            X.BKS r2 = new X.BKS     // Catch:{ Exception -> 0x00f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00f3 }
            X.Iu1 r1 = X.C35393Iu1.A0q     // Catch:{ Exception -> 0x00f3 }
            X.JrZ r0 = new X.JrZ     // Catch:{ Exception -> 0x00f3 }
            r0.<init>(r2, r1, r3)     // Catch:{ Exception -> 0x00f3 }
            r8.add(r0)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00b2
        L_0x00f3:
            r1 = move-exception
            r0 = 650(0x28a, float:9.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0110 }
            X.AnonymousClass0LU.A0E(r11, r0, r1)     // Catch:{ all -> 0x0110 }
            r0 = 651(0x28b, float:9.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = X.C18230wP.A0t(r0, r1)     // Catch:{ all -> 0x0110 }
            X.C10450iM.A03(r11, r0)     // Catch:{ all -> 0x0110 }
            X.0ZV r8 = X.AnonymousClass0ZV.A00     // Catch:{ all -> 0x0110 }
        L_0x010c:
            android.os.Process.setThreadPriority(r9)
            return r8
        L_0x0110:
            r0 = move-exception
            android.os.Process.setThreadPriority(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCacheRoom.A00(java.lang.Integer, java.util.List, X.8n9, int, long, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.Collection r26, X.C146958n9 r27) {
        /*
            r25 = this;
            r3 = 47
            r4 = r27
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r4)
            r14 = r25
            if (r0 == 0) goto L_0x002d
            r9 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r9 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r9.A02
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r9.A00
            java.lang.String r7 = "BarcelonaFeedCacheRoom"
            r6 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r6) goto L_0x0032
            java.lang.Object r5 = r9.A01
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            goto L_0x0184
        L_0x002d:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r9 = X.C86164wN.A0n(r14, r4, r3)
            goto L_0x001a
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0037:
            X.AnonymousClass0OU.A00(r1)
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x018b }
            java.util.LinkedHashSet r5 = X.C86134wK.A0u()     // Catch:{ Exception -> 0x018b }
            java.util.Iterator r16 = r26.iterator()     // Catch:{ Exception -> 0x018b }
        L_0x0046:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x016f
            java.lang.Object r13 = r16.next()     // Catch:{ Exception -> 0x018b }
            X.JrZ r13 = (X.C37415JrZ) r13     // Catch:{ Exception -> 0x018b }
            X.C0U r0 = r13.A0O     // Catch:{ Exception -> 0x018b }
            X.BKS r0 = (X.BKS) r0     // Catch:{ Exception -> 0x018b }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r0 = r0.A00     // Catch:{ Exception -> 0x018b }
            java.lang.Object r0 = r0.A00     // Catch:{ Exception -> 0x018b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x018b }
            r12 = 0
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x018b }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2) r0     // Catch:{ Exception -> 0x018b }
            java.lang.Object r11 = r0.A01     // Catch:{ Exception -> 0x018b }
            X.BKU r11 = (X.BKU) r11     // Catch:{ Exception -> 0x018b }
            X.C0U r0 = r13.A0O     // Catch:{ Exception -> 0x018b }
            X.BKS r0 = (X.BKS) r0     // Catch:{ Exception -> 0x018b }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2 r10 = r0.A00     // Catch:{ Exception -> 0x018b }
            java.io.StringWriter r4 = X.C18230wP.A0d()     // Catch:{ Exception -> 0x018b }
            X.MMp r3 = X.C18180wK.A0K(r4)     // Catch:{ Exception -> 0x018b }
            java.lang.String r1 = r10.A02     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "header"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x007e:
            java.lang.String r1 = r10.A03     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = "id"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x0087:
            boolean r1 = r10.A05     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "show_create_reply_cta"
            r3.A0e(r0, r1)     // Catch:{ Exception -> 0x018b }
            java.lang.Object r1 = r10.A00     // Catch:{ Exception -> 0x018b }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x0115
            java.lang.String r0 = "thread_items"
            java.util.Iterator r15 = X.C18190wL.A0t(r3, r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x009a:
            boolean r0 = r15.hasNext()     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x0112
            java.lang.Object r2 = r15.next()     // Catch:{ Exception -> 0x018b }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2) r2     // Catch:{ Exception -> 0x018b }
            if (r2 == 0) goto L_0x009a
            r3.A0J()     // Catch:{ Exception -> 0x018b }
            boolean r1 = r2.A05     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "can_inline_expand_below"
            r3.A0e(r0, r1)     // Catch:{ Exception -> 0x018b }
            java.lang.Object r0 = r2.A00     // Catch:{ Exception -> 0x018b }
            com.instagram.api.schemas.LineType r0 = (com.instagram.api.schemas.LineType) r0     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "line_type"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x00bf:
            java.lang.Object r1 = r2.A01     // Catch:{ Exception -> 0x018b }
            X.BKU r1 = (X.BKU) r1     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = "post"
            r3.A0U(r0)     // Catch:{ Exception -> 0x018b }
            X.BKU.A1R(r3, r1)     // Catch:{ Exception -> 0x018b }
        L_0x00cd:
            java.lang.Object r1 = r2.A02     // Catch:{ Exception -> 0x018b }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x00f0
            r0 = 206(0xce, float:2.89E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x018b }
            java.util.Iterator r1 = X.C18190wL.A0t(r3, r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x00dd:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x00ed
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x00dd
            X.C19527Axo.A05(r3, r0)     // Catch:{ Exception -> 0x018b }
            goto L_0x00dd
        L_0x00ed:
            r3.A0F()     // Catch:{ Exception -> 0x018b }
        L_0x00f0:
            java.lang.Object r1 = r2.A03     // Catch:{ Exception -> 0x018b }
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "reply_to_author"
            r3.A0U(r0)     // Catch:{ Exception -> 0x018b }
            X.C19527Axo.A05(r3, r1)     // Catch:{ Exception -> 0x018b }
        L_0x00fe:
            boolean r1 = r2.A06     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "should_show_replies_cta"
            r3.A0e(r0, r1)     // Catch:{ Exception -> 0x018b }
            java.lang.String r1 = r2.A04     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x010e
            java.lang.String r0 = "view_replies_cta_string"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x010e:
            r3.A0G()     // Catch:{ Exception -> 0x018b }
            goto L_0x009a
        L_0x0112:
            r3.A0F()     // Catch:{ Exception -> 0x018b }
        L_0x0115:
            java.lang.Object r0 = r10.A01     // Catch:{ Exception -> 0x018b }
            com.instagram.api.schemas.ThreadContainerType r0 = (com.instagram.api.schemas.ThreadContainerType) r0     // Catch:{ Exception -> 0x018b }
            if (r0 == 0) goto L_0x0122
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "thread_type"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x0122:
            java.lang.String r1 = r10.A04     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x012b
            java.lang.String r0 = "view_state_item_type"
            r3.A0d(r0, r1)     // Catch:{ Exception -> 0x018b }
        L_0x012b:
            java.lang.String r1 = X.C18180wK.A0h(r3, r4)     // Catch:{ Exception -> 0x018b }
            if (r1 == 0) goto L_0x0137
            int r0 = r1.length()     // Catch:{ Exception -> 0x018b }
            if (r0 != 0) goto L_0x0138
        L_0x0137:
            r12 = 1
        L_0x0138:
            if (r12 != 0) goto L_0x0046
            java.lang.String r4 = r13.A0j     // Catch:{ Exception -> 0x018b }
            X.C04220Ms.A06(r4)     // Catch:{ Exception -> 0x018b }
            r2 = 0
            if (r11 == 0) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r3 = r2
            goto L_0x0149
        L_0x0145:
            X.BKN r0 = r11.A0f     // Catch:{ Exception -> 0x018b }
            java.lang.Float r3 = r0.A3D     // Catch:{ Exception -> 0x018b }
        L_0x0149:
            X.C04220Ms.A06(r1)     // Catch:{ Exception -> 0x018b }
            byte[] r22 = X.AnonymousClass74V.A00(r1)     // Catch:{ Exception -> 0x018b }
            if (r11 == 0) goto L_0x015b
            long r0 = r11.A1t()     // Catch:{ Exception -> 0x018b }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ Exception -> 0x018b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x018b }
        L_0x015b:
            X.Iu1 r18 = X.C35393Iu1.A0q     // Catch:{ Exception -> 0x018b }
            X.Lt1 r0 = new X.Lt1     // Catch:{ Exception -> 0x018b }
            r17 = r0
            r19 = r3
            r20 = r2
            r21 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x018b }
            r5.add(r0)     // Catch:{ Exception -> 0x018b }
            goto L_0x0046
        L_0x016f:
            X.M11 r3 = r14.A00     // Catch:{ Exception -> 0x018b }
            r9.A01 = r5     // Catch:{ Exception -> 0x018b }
            r9.A00 = r6     // Catch:{ Exception -> 0x018b }
            X.M6w r2 = r3.A01     // Catch:{ Exception -> 0x018b }
            r1 = 7
            com.facebook.redex.IDxObjectShape133S0200000_2_I2 r0 = new com.facebook.redex.IDxObjectShape133S0200000_2_I2     // Catch:{ Exception -> 0x018b }
            r0.<init>(r1, r5, r3)     // Catch:{ Exception -> 0x018b }
            java.lang.Object r0 = X.C98516Fv.A00(r2, r9, r0)     // Catch:{ Exception -> 0x018b }
            if (r0 != r8) goto L_0x0187
            return r8
        L_0x0184:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ Exception -> 0x018b }
        L_0x0187:
            r5.size()     // Catch:{ Exception -> 0x018b }
            goto L_0x01a2
        L_0x018b:
            r1 = move-exception
            r0 = 648(0x288, float:9.08E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.AnonymousClass0LU.A0E(r7, r0, r1)
            r0 = 649(0x289, float:9.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C18230wP.A0t(r0, r1)
            X.C10450iM.A03(r7, r0)
        L_0x01a2:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedCacheRoom.A01(java.util.Collection, X.8n9):java.lang.Object");
    }
}
