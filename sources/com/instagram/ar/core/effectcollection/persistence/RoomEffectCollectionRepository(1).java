package com.instagram.ar.core.effectcollection.persistence;

import X.AnonymousClass6UW;
import X.C04220Ms;
import X.C09810gi;
import X.C09820gj;
import X.C103956b0;
import X.C120627Bu;
import X.C134037wv;
import X.C41012LuB;
import X.C41253M5p;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase_Impl;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;

public final class RoomEffectCollectionRepository {
    public final C41253M5p A00;
    public final C09810gi A01;

    public /* synthetic */ RoomEffectCollectionRepository(UserSession userSession) {
        C41253M5p m5p;
        C134037wv r2 = EffectCollectionDatabase.A00;
        Class<EffectCollectionDatabase> cls = EffectCollectionDatabase.class;
        UserSession userSession2 = userSession;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession2.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r2) {
                igRoomDatabase = (IgRoomDatabase) userSession2.A00(cls);
                if (igRoomDatabase == null) {
                    C41012LuB A002 = C120627Bu.A00(r2, userSession2, cls);
                    AnonymousClass6UW.A00(A002, 474693601, 141850174, false);
                    A002.A03(C103956b0.A07, C103956b0.A08, C103956b0.A09, C103956b0.A0A, C103956b0.A0B, C103956b0.A0C, C103956b0.A0D, C103956b0.A0E, C103956b0.A0F, C103956b0.A00, C103956b0.A01, C103956b0.A02, C103956b0.A03, C103956b0.A04, C103956b0.A05, C103956b0.A06);
                    A002.A05 = true;
                    A002.A03 = true;
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession2.A04(cls, igRoomDatabase);
                }
            }
        }
        EffectCollectionDatabase_Impl effectCollectionDatabase_Impl = (EffectCollectionDatabase_Impl) ((EffectCollectionDatabase) igRoomDatabase);
        if (effectCollectionDatabase_Impl.A00 != null) {
            m5p = effectCollectionDatabase_Impl.A00;
        } else {
            synchronized (effectCollectionDatabase_Impl) {
                if (effectCollectionDatabase_Impl.A00 == null) {
                    effectCollectionDatabase_Impl.A00 = new C41253M5p(effectCollectionDatabase_Impl);
                }
                m5p = effectCollectionDatabase_Impl.A00;
            }
        }
        C09810gi r1 = C09820gj.A00;
        C04220Ms.A0B(m5p, 2);
        this.A00 = m5p;
        this.A01 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r9, X.C146958n9 r10) {
        /*
            r8 = this;
            r3 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x005e
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A01
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r5 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r5) goto L_0x0063
            X.AnonymousClass0OU.A00(r0)
        L_0x0024:
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r0 > 0) goto L_0x002b
            r5 = 0
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r0)
            r0 = 16
            boolean r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2.A00(r0, r9)
            if (r0 == 0) goto L_0x0068
            X.M5p r4 = r8.A00
            java.lang.Object r0 = r9.A00
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r1 = r0.A0I
            X.C04220Ms.A06(r1)
            int r0 = r0.A01
            X.6h8 r3 = new X.6h8
            r3.<init>(r1, r0)
            r6.A00 = r5
            X.M6w r2 = r4.A07
            r1 = 6
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r1, r4, r3)
            java.lang.Object r0 = X.C120467Az.A01(r2, r0, r6)
            if (r0 != r7) goto L_0x0024
            return r7
        L_0x005e:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r6 = X.C86114wI.A0x(r8, r10, r3)
            goto L_0x0016
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0068:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A00(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C25515Dn3 r10, com.instagram.camera.effect.models.CameraAREffect r11, X.C146958n9 r12) {
        /*
            r9 = this;
            r3 = 46
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x0022
            r8 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A01
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r6) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r8 = X.C86114wI.A0x(r9, r12, r3)
            goto L_0x0016
        L_0x0027:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ SQLiteException -> 0x0053 }
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r1)
            long r1 = java.lang.System.currentTimeMillis()
            X.M5p r5 = r9.A00     // Catch:{ SQLiteException -> 0x0053 }
            X.GDr r4 = X.C30955Gc7.A00(r11, r1)     // Catch:{ SQLiteException -> 0x0053 }
            r3 = 0
            r0 = 0
            X.GBb r2 = X.C30955Gc7.A01(r10, r3, r1, r0)     // Catch:{ SQLiteException -> 0x0053 }
            r8.A00 = r6     // Catch:{ SQLiteException -> 0x0053 }
            X.M6w r1 = r5.A07     // Catch:{ SQLiteException -> 0x0053 }
            com.facebook.redex.IDxObjectShape101S0300000_2_I2 r0 = new com.facebook.redex.IDxObjectShape101S0300000_2_I2     // Catch:{ SQLiteException -> 0x0053 }
            r0.<init>(r6, r5, r4, r2)     // Catch:{ SQLiteException -> 0x0053 }
            java.lang.Object r0 = X.C98516Fv.A00(r1, r8, r0)     // Catch:{ SQLiteException -> 0x0053 }
            if (r0 != r7) goto L_0x005b
            return r7
        L_0x0053:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effect into collection"
            X.C10450iM.A05(r1, r0, r6, r2)
        L_0x005b:
            kotlin.Unit r7 = kotlin.Unit.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A01(X.Dn3, com.instagram.camera.effect.models.CameraAREffect, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C25515Dn3 r13, java.lang.Integer r14, X.C146958n9 r15, long r16) {
        /*
            r12 = this;
            r3 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r15)
            if (r0 == 0) goto L_0x0054
            r5 = r15
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r3) goto L_0x005b
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.G4C r1 = (X.G4C) r1
            if (r1 == 0) goto L_0x0059
            X.6s5 r4 = X.C30955Gc7.A03(r1)
            return r4
        L_0x002d:
            X.AnonymousClass0OU.A00(r1)
            X.M5p r7 = r12.A00
            java.lang.String r2 = r13.A02
            java.lang.String r1 = r13.A01
            X.C18210wN.A0n(r3, r2, r1)
            r0 = 95
            java.lang.String r9 = X.AnonymousClass00U.A0N(r2, r1, r0)
            long r10 = X.C18240wQ.A09(r16)
            r5.A00 = r3
            X.M6w r0 = r7.A07
            X.86M r6 = new X.86M
            r8 = r14
            r6.<init>(r7, r8, r9, r10)
            java.lang.Object r1 = X.C98516Fv.A00(r0, r5, r6)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0054:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = X.C86114wI.A0x(r12, r15, r3)
            goto L_0x0016
        L_0x0059:
            r4 = 0
            return r4
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A02(X.Dn3, java.lang.Integer, X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (r2 == r8) goto L_0x00b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C25515Dn3 r11, java.util.List r12, X.C146958n9 r13, long r14) {
        /*
            r10 = this;
            r3 = 37
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r13)
            if (r0 == 0) goto L_0x00b8
            r7 = r13
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b8
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A02
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r7.A00
            r0 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 != r0) goto L_0x00be
            java.lang.Object r11 = r7.A01
            X.Dn3 r11 = (X.C25515Dn3) r11
            X.AnonymousClass0OU.A00(r2)
        L_0x0028:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r2.next()
            X.GDr r1 = (X.C30441GDr) r1
            if (r11 == 0) goto L_0x004a
            java.lang.String r0 = r11.A01
        L_0x0042:
            com.instagram.camera.effect.models.CameraAREffect r0 = X.C30955Gc7.A02(r1, r0)
            r8.add(r0)
            goto L_0x0032
        L_0x004a:
            r0 = 0
            goto L_0x0042
        L_0x004c:
            X.AnonymousClass0OU.A00(r2)
            X.M5p r6 = r10.A00
            long r1 = X.C18240wQ.A09(r14)
            r7.A01 = r11
            r7.A00 = r0
            java.lang.String r5 = "\n"
            java.lang.StringBuilder r4 = X.C18190wL.A0s(r5)
            java.lang.String r0 = "    SELECT * FROM effects "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = "    WHERE effectId IN("
            r4.append(r0)
            int r3 = r12.size()
            X.C116116wS.A00(r4, r3)
            java.lang.String r0 = "    AND syncedAt>="
            r4.append(r0)
            java.lang.String r0 = "?"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = "  "
            java.lang.String r0 = X.C18180wK.A0i(r0, r4)
            r9 = 1
            int r5 = r3 + 1
            X.MAm r4 = X.Lv1.A00(r0, r5)
            java.util.Iterator r3 = r12.iterator()
        L_0x0091:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = X.C18180wK.A0k(r3)
            X.C86154wM.A1L(r4, r0, r9)
            int r9 = r9 + 1
            goto L_0x0091
        L_0x00a1:
            r4.AAa(r5, r1)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.M6w r2 = r6.A07
            r1 = 7
            com.facebook.redex.IDxCallableShape92S0200000_7_I2 r0 = new com.facebook.redex.IDxCallableShape92S0200000_7_I2
            r0.<init>(r1, r4, r6)
            java.lang.Object r2 = X.C120467Az.A00(r3, r2, r0, r7)
            if (r2 != r8) goto L_0x0028
        L_0x00b7:
            return r8
        L_0x00b8:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r10, r13, r3)
            goto L_0x0016
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A03(X.Dn3, java.util.List, X.8n9, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ SQLiteException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C113756s5 r13, X.C146958n9 r14, boolean r15) {
        /*
            r12 = this;
            r3 = 44
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r14)
            if (r0 == 0) goto L_0x0023
            r6 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A01
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r5) goto L_0x0028
            goto L_0x0083
        L_0x0023:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r6 = X.C86114wI.A0x(r12, r14, r3)
            goto L_0x0016
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002d:
            X.AnonymousClass0OU.A00(r0)
            X.M5p r8 = r12.A00     // Catch:{ SQLiteException -> 0x008f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x008f }
            r0 = 0
            X.C04220Ms.A0B(r13, r0)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Object r11 = r13.A00     // Catch:{ SQLiteException -> 0x008f }
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2 r11 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2) r11     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Object r9 = r11.A00     // Catch:{ SQLiteException -> 0x008f }
            X.Dn3 r9 = (X.C25515Dn3) r9     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r4 = r13.A01     // Catch:{ SQLiteException -> 0x008f }
            boolean r0 = r13.A02     // Catch:{ SQLiteException -> 0x008f }
            X.GBb r10 = X.C30955Gc7.A01(r9, r4, r1, r0)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Object r0 = r11.A01     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ SQLiteException -> 0x008f }
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0w(r0)     // Catch:{ SQLiteException -> 0x008f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ SQLiteException -> 0x008f }
        L_0x0056:
            boolean r0 = r4.hasNext()     // Catch:{ SQLiteException -> 0x008f }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r4.next()     // Catch:{ SQLiteException -> 0x008f }
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0     // Catch:{ SQLiteException -> 0x008f }
            X.GDr r0 = X.C30955Gc7.A00(r0, r1)     // Catch:{ SQLiteException -> 0x008f }
            r9.add(r0)     // Catch:{ SQLiteException -> 0x008f }
            goto L_0x0056
        L_0x006a:
            X.G4C r4 = new X.G4C     // Catch:{ SQLiteException -> 0x008f }
            r4.<init>(r10, r9)     // Catch:{ SQLiteException -> 0x008f }
            boolean r2 = X.C18180wK.A1V(r15)
            r6.A00 = r5     // Catch:{ SQLiteException -> 0x008f }
            X.M6w r1 = r8.A07     // Catch:{ SQLiteException -> 0x008f }
            X.86L r0 = new X.86L     // Catch:{ SQLiteException -> 0x008f }
            r0.<init>(r8, r4, r2)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.Object r0 = X.C98516Fv.A00(r1, r6, r0)     // Catch:{ SQLiteException -> 0x008f }
            if (r0 != r7) goto L_0x0086
            return r7
        L_0x0083:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ SQLiteException -> 0x008f }
        L_0x0086:
            X.G4C r0 = (X.G4C) r0     // Catch:{ SQLiteException -> 0x008f }
            if (r0 == 0) goto L_0x0097
            X.6s5 r3 = X.C30955Gc7.A03(r0)     // Catch:{ SQLiteException -> 0x008f }
            return r3
        L_0x008f:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting collection"
            X.C10450iM.A05(r1, r0, r5, r2)
        L_0x0097:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A04(X.6s5, X.8n9, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.util.List r10, X.C146958n9 r11) {
        /*
            r9 = this;
            r3 = 45
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r11)
            if (r0 == 0) goto L_0x0022
            r8 = r11
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r8 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r8.A01
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r5) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r8 = X.C86114wI.A0x(r9, r11, r3)
            goto L_0x0016
        L_0x0027:
            X.AnonymousClass0OU.A00(r1)     // Catch:{ SQLiteException -> 0x0066 }
            goto L_0x006f
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r1)
            X.M5p r6 = r9.A00     // Catch:{ SQLiteException -> 0x0066 }
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r10)     // Catch:{ SQLiteException -> 0x0066 }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ SQLiteException -> 0x0066 }
        L_0x003d:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteException -> 0x0066 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r2 = r3.next()     // Catch:{ SQLiteException -> 0x0066 }
            com.instagram.camera.effect.models.CameraAREffect r2 = (com.instagram.camera.effect.models.CameraAREffect) r2     // Catch:{ SQLiteException -> 0x0066 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0066 }
            X.GDr r0 = X.C30955Gc7.A00(r2, r0)     // Catch:{ SQLiteException -> 0x0066 }
            r4.add(r0)     // Catch:{ SQLiteException -> 0x0066 }
            goto L_0x003d
        L_0x0055:
            r8.A00 = r5     // Catch:{ SQLiteException -> 0x0066 }
            X.M6w r2 = r6.A07     // Catch:{ SQLiteException -> 0x0066 }
            r1 = 4
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2     // Catch:{ SQLiteException -> 0x0066 }
            r0.<init>(r1, r6, r4)     // Catch:{ SQLiteException -> 0x0066 }
            java.lang.Object r0 = X.C120467Az.A01(r2, r0, r8)     // Catch:{ SQLiteException -> 0x0066 }
            if (r0 != r7) goto L_0x006f
            return r7
        L_0x0066:
            r2 = move-exception
            java.lang.String r1 = "RoomEffectCollectionRepository"
            java.lang.String r0 = "exception when inserting effects"
            X.C10450iM.A05(r1, r0, r5, r2)
            r5 = 0
        L_0x006f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.effectcollection.persistence.RoomEffectCollectionRepository.A05(java.util.List, X.8n9):java.lang.Object");
    }
}
