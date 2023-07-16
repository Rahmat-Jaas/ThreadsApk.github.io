package com.facebook.redex;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0TJ;
import X.AnonymousClass0gE;
import X.AnonymousClass0wJ;
import X.AnonymousClass236;
import X.AnonymousClass6XJ;
import X.AnonymousClass77P;
import X.C04220Ms;
import X.C110576lv;
import X.C127047gR;
import X.C132377tn;
import X.C132437tt;
import X.C146148lj;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C63803iN;
import X.C86114wI;
import X.C86134wK;
import X.C971268a;
import X.C972968u;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.client.executor.generic.GenericExecutorFactory;
import com.facebook.papaya.fb.instagram.PapayaExecutionJobService;
import com.facebook.papaya.fb.instagram.UserScopedTransport;
import com.facebook.papaya.fb.instagram.VoltronizedEngineFactory;
import com.facebook.papaya.fb.instagram.VoltronizedExecutorFactory;
import com.google.common.collect.ImmutableMap;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.KtLambdaShape5S0500000_I2;

public class IDxCallableShape88S0200000_2_I2 implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallableShape88S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static final /* bridge */ /* synthetic */ Object A00(IDxCallableShape88S0200000_2_I2 iDxCallableShape88S0200000_2_I2) {
        IDxCallableShape88S0200000_2_I2 iDxCallableShape88S0200000_2_I22 = iDxCallableShape88S0200000_2_I2;
        Context context = (Context) iDxCallableShape88S0200000_2_I22.A00;
        C132437tt r11 = (C132437tt) iDxCallableShape88S0200000_2_I22.A01;
        C04220Ms.A0B(context, 0);
        List list = r11.A05;
        List list2 = r11.A04;
        List<C146148lj> A0V = AnonymousClass00J.A0V(list2, list);
        LinkedHashMap A0y = C18220wO.A0y();
        Bundle A06 = C18180wK.A06();
        for (C146148lj name : A0V) {
            String name2 = name.getName();
            C04220Ms.A06(name2);
            A0y.put(name2, VoltronizedExecutorFactory.class);
        }
        for (C146148lj r3 : A0V) {
            Bundle AgN = r3.AgN();
            AgN.putString("class_name", GenericExecutorFactory.class.getCanonicalName());
            A06.putBundle(r3.getName(), AgN);
        }
        LinkedHashMap A0y2 = C18220wO.A0y();
        for (C146148lj r2 : A0V) {
            if (r2.BTd()) {
                String name3 = r2.getName();
                C04220Ms.A06(name3);
                A0y2.put(name3, r2.AgO());
            }
        }
        LinkedHashSet A0u = C86134wK.A0u();
        for (C146148lj r1 : AnonymousClass00J.A0V(r11.A06, AnonymousClass00J.A0V(list2, list))) {
            if (r1.BTd()) {
                String name4 = r1.getName();
                C04220Ms.A06(name4);
                A0u.add(name4);
            }
        }
        Iterator A0z = AnonymousClass0wJ.A0z(A0y2);
        while (A0z.hasNext()) {
            String A0p = C18200wM.A0p(C18180wK.A0o(A0z));
            if (!A0u.contains(A0p)) {
                throw C18190wL.A0a(AnonymousClass00U.A0V("The executor, ", A0p, ", is either not found in supported executor map or disabled."));
            }
        }
        ImmutableMap of = ImmutableMap.of("federated", new VoltronizedEngineFactory(context, new IDxCallableShape17S0500000_2_I2(0, context, A06, r11, A0y, A0y2)));
        C132377tn r32 = r11.A01;
        AnonymousClass77P r22 = new AnonymousClass77P();
        r22.A01(C972968u.MAX_EXECUTION_TIME_PER_DAY_SEC, r32.A00);
        r22.A01(C972968u.MAX_EXECUTION_TIME_SEC, r32.A01);
        r22.A01(C972968u.MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES, r32.A02 * ((long) 1048576));
        r22.A01(C972968u.DEVICE_IDLE_REQUIRED, C86114wI.A09(r32.A03 ? 1 : 0));
        r22.A01(C972968u.WIFI_REQUIRED, C86114wI.A09(r32.A04 ? 1 : 0));
        PapayaRestrictions A002 = AnonymousClass77P.A00(C972968u.EXTERNAL_POWER_REQUIRED, r22, C86114wI.A09(r32.A05 ? 1 : 0));
        return new C127047gR(context, new C110576lv(new ComponentName(context, PapayaExecutionJobService.class), A002, AnonymousClass236.INFO, of, r11.A02, r11.A03));
    }

    public static final /* bridge */ /* synthetic */ Object A01(IDxCallableShape88S0200000_2_I2 iDxCallableShape88S0200000_2_I2) {
        C971268a r8;
        Object obj = iDxCallableShape88S0200000_2_I2.A00;
        UserSession userSession = (UserSession) iDxCallableShape88S0200000_2_I2.A01;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0gE.A00().A00;
        File A012 = AnonymousClass6XJ.A00.A01(userSession);
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        boolean A0E = C63803iN.A0E(r3, userSession, 36319385917658254L);
        boolean A0E2 = C63803iN.A0E(r3, userSession, 2342162395131417743L);
        if (!A0E) {
            r8 = C971268a.Disabled;
        } else if (A0E2) {
            r8 = C971268a.EnabledWithFileStorage;
        } else {
            r8 = C971268a.EnabledWithMemoryStorage;
        }
        boolean A1Z = AnonymousClass0wJ.A1Z(obj, userSession);
        C04220Ms.A0B(r8, 4);
        return userSession.A01(UserScopedTransport.class, new KtLambdaShape5S0500000_I2(A1Z ? 1 : 0, obj, userSession, scheduledThreadPoolExecutor, A012, r8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0398, code lost:
        r2.close();
        r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x039e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03d5, code lost:
        r2.close();
        r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03db, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04e1, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04e4, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x003d;
                case 2: goto L_0x04ca;
                case 3: goto L_0x0434;
                case 4: goto L_0x041b;
                case 5: goto L_0x0402;
                case 6: goto L_0x03e4;
                case 7: goto L_0x03a7;
                case 8: goto L_0x0374;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0353;
                case 13: goto L_0x0325;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x02e3;
                case 17: goto L_0x02a0;
                case 18: goto L_0x0262;
                case 19: goto L_0x022c;
                case 20: goto L_0x01fe;
                case 21: goto L_0x01d8;
                case 22: goto L_0x019a;
                case 23: goto L_0x013e;
                case 24: goto L_0x00f7;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00af;
                case 27: goto L_0x0081;
                case 28: goto L_0x0047;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.Dr2 r0 = (X.C25736Dr2) r0
            X.M6w r1 = r0.A02
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            int r1 = r2.getInt(r3)     // Catch:{ all -> 0x039f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x039f }
            goto L_0x002e
        L_0x002d:
            r1 = r0
        L_0x002e:
            if (r1 == 0) goto L_0x0398
            int r0 = r1.intValue()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x0037
            r3 = 1
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x003d:
            java.lang.Object r0 = A01(r3)
            return r0
        L_0x0042:
            java.lang.Object r0 = A00(r3)
            return r0
        L_0x0047:
            java.lang.String r0 = "DELETE FROM drafts WHERE id in ("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A01(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.Dku r0 = (X.C25395Dku) r0
            X.M6w r4 = r0.A02
            X.Exi r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x006d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0079
            X.C86134wK.A1D(r3, r2, r1)
            int r1 = r1 + 1
            goto L_0x006d
        L_0x0079:
            r4.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r4, r3)     // Catch:{ all -> 0x02de }
            return r0
        L_0x0081:
            java.lang.Object r0 = r3.A00
            X.Dku r0 = (X.C25395Dku) r0
            X.M6w r0 = r0.A02
            java.lang.Object r5 = r3.A01
            X.MAm r5 = (X.MAm) r5
            r4 = 0
            r3 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r0, r5, r4)
            int r0 = r2.getCount()     // Catch:{ all -> 0x03dc }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x03dc }
        L_0x0099:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x03d5
            boolean r1 = r2.isNull(r4)     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x00a7
            r1 = r3
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r1 = r2.getString(r4)     // Catch:{ all -> 0x03dc }
        L_0x00ab:
            r0.add(r1)     // Catch:{ all -> 0x03dc }
            goto L_0x0099
        L_0x00af:
            java.lang.Object r0 = r3.A00
            X.Dku r0 = (X.C25395Dku) r0
            X.M6w r1 = r0.A02
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 != 0) goto L_0x0398
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x00d1:
            java.lang.Object r0 = r3.A00
            X.Dku r0 = (X.C25395Dku) r0
            X.M6w r1 = r0.A02
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 != 0) goto L_0x0398
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x039f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x00f7:
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r2)
            java.lang.String r0 = "        DELETE FROM content_filter_dictionary_client_availability"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "        WHERE client_id IN ("
            r1.append(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A00(r1, r0)
            java.lang.String r0 = "      "
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.DrV r0 = (X.C25758DrV) r0
            X.M6w r4 = r0.A05
            X.Exi r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x012a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0136
            X.C86134wK.A1D(r3, r2, r1)
            int r1 = r1 + 1
            goto L_0x012a
        L_0x0136:
            r4.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r4, r3)     // Catch:{ all -> 0x02de }
            return r0
        L_0x013e:
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r2)
            java.lang.String r0 = "        DELETE FROM content_filter_dictionary_client_availability"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "        WHERE dictionary_id IN ("
            r1.append(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A00(r1, r0)
            java.lang.String r0 = "      "
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.DrV r0 = (X.C25758DrV) r0
            X.M6w r5 = r0.A05
            X.Exi r4 = r5.compileStatement(r1)
            java.util.Iterator r3 = r2.iterator()
            r2 = 1
        L_0x0171:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x0185
            r4.AAb(r2)
        L_0x0182:
            int r2 = r2 + 1
            goto L_0x0171
        L_0x0185:
            long r0 = r0.longValue()
            r4.AAa(r2, r0)
            goto L_0x0182
        L_0x018d:
            r5.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r5, r4)     // Catch:{ all -> 0x0195 }
            return r0
        L_0x0195:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x019a:
            java.lang.String r0 = "DELETE FROM HeadmojiSticker WHERE id in ("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A01(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.DpA r0 = (X.C25633DpA) r0
            X.M6w r4 = r0.A02
            X.Exi r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x01c0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.String r0 = X.C18180wK.A0k(r2)
            X.C86144wL.A1F(r3, r0, r1)
            int r1 = r1 + 1
            goto L_0x01c0
        L_0x01d0:
            r4.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r4, r3)     // Catch:{ all -> 0x02de }
            return r0
        L_0x01d8:
            java.lang.Object r0 = r3.A00
            X.DpA r0 = (X.C25633DpA) r0
            X.M6w r1 = r0.A02
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 != 0) goto L_0x0398
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x039f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x01fe:
            java.lang.Object r0 = r3.A00
            X.DpA r0 = (X.C25633DpA) r0
            X.M6w r0 = r0.A02
            java.lang.Object r5 = r3.A01
            X.MAm r5 = (X.MAm) r5
            r4 = 0
            r3 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r0, r5, r4)
            int r0 = r2.getCount()     // Catch:{ all -> 0x03dc }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x03dc }
        L_0x0216:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x03d5
            boolean r1 = r2.isNull(r4)     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x0224
            r1 = r3
            goto L_0x0228
        L_0x0224:
            java.lang.String r1 = r2.getString(r4)     // Catch:{ all -> 0x03dc }
        L_0x0228:
            r0.add(r1)     // Catch:{ all -> 0x03dc }
            goto L_0x0216
        L_0x022c:
            java.lang.Object r0 = r3.A00
            X.Dkf r0 = (X.C25380Dkf) r0
            X.M6w r1 = r0.A01
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0249
            goto L_0x0252
        L_0x0249:
            int r1 = r2.getInt(r3)     // Catch:{ all -> 0x039f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x039f }
            goto L_0x0253
        L_0x0252:
            r1 = r0
        L_0x0253:
            if (r1 == 0) goto L_0x0398
            int r0 = r1.intValue()     // Catch:{ all -> 0x039f }
            if (r0 == 0) goto L_0x025c
            r3 = 1
        L_0x025c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x0262:
            java.lang.String r0 = "DELETE FROM story_drafts WHERE draft_id in("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A01(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.Dkf r0 = (X.C25380Dkf) r0
            X.M6w r4 = r0.A01
            X.Exi r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x0288:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0298
            java.lang.String r0 = X.C18180wK.A0k(r2)
            X.C86144wL.A1F(r3, r0, r1)
            int r1 = r1 + 1
            goto L_0x0288
        L_0x0298:
            r4.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r4, r3)     // Catch:{ all -> 0x02de }
            return r0
        L_0x02a0:
            java.lang.String r0 = "DELETE FROM drafts WHERE id in ("
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            X.C116116wS.A01(r1, r0)
            java.lang.String r0 = ")"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.Object r0 = r3.A00
            X.Dr2 r0 = (X.C25736Dr2) r0
            X.M6w r4 = r0.A02
            X.Exi r3 = r4.compileStatement(r1)
            java.util.Iterator r2 = r2.iterator()
            r1 = 1
        L_0x02c6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = X.C18180wK.A0k(r2)
            X.C86144wL.A1F(r3, r0, r1)
            int r1 = r1 + 1
            goto L_0x02c6
        L_0x02d6:
            r4.beginTransaction()
            kotlin.Unit r0 = X.C86124wJ.A14(r4, r3)     // Catch:{ all -> 0x02de }
            return r0
        L_0x02de:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        L_0x02e3:
            java.lang.Object r0 = r3.A00
            X.Dr2 r0 = (X.C25736Dr2) r0
            X.M6w r0 = r0.A02
            java.lang.Object r6 = r3.A01
            X.MAm r6 = (X.MAm) r6
            r5 = 0
            r4 = 0
            android.database.Cursor r3 = X.C30586GLy.A00(r0, r6, r5)
            int r0 = r3.getCount()     // Catch:{ all -> 0x031d }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x031d }
        L_0x02fb:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x031d }
            if (r1 == 0) goto L_0x0316
            boolean r1 = r3.isNull(r5)     // Catch:{ all -> 0x031d }
            if (r1 == 0) goto L_0x0309
            r2 = r4
            goto L_0x030d
        L_0x0309:
            java.lang.String r2 = r3.getString(r5)     // Catch:{ all -> 0x031d }
        L_0x030d:
            X.6eJ r1 = new X.6eJ     // Catch:{ all -> 0x031d }
            r1.<init>(r2)     // Catch:{ all -> 0x031d }
            r0.add(r1)     // Catch:{ all -> 0x031d }
            goto L_0x02fb
        L_0x0316:
            r3.close()
            r6.A00()
            return r0
        L_0x031d:
            r0 = move-exception
            r3.close()
            r6.A00()
            throw r0
        L_0x0325:
            java.lang.Object r0 = r3.A00
            X.Dr2 r0 = (X.C25736Dr2) r0
            X.M6w r0 = r0.A02
            java.lang.Object r5 = r3.A01
            X.MAm r5 = (X.MAm) r5
            r4 = 0
            r3 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r0, r5, r4)
            int r0 = r2.getCount()     // Catch:{ all -> 0x03dc }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x03dc }
        L_0x033d:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x03d5
            boolean r1 = r2.isNull(r4)     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x034b
            r1 = r3
            goto L_0x034f
        L_0x034b:
            java.lang.String r1 = r2.getString(r4)     // Catch:{ all -> 0x03dc }
        L_0x034f:
            r0.add(r1)     // Catch:{ all -> 0x03dc }
            goto L_0x033d
        L_0x0353:
            java.lang.Object r0 = r3.A00
            X.Dr2 r0 = (X.C25736Dr2) r0
            X.M6w r1 = r0.A02
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 != 0) goto L_0x0398
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x039f }
            goto L_0x0398
        L_0x0374:
            java.lang.Object r0 = r3.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.M6w r1 = r0.A07
            java.lang.Object r4 = r3.A01
            X.MAm r4 = (X.MAm) r4
            r3 = 0
            r0 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r1, r4, r3)
            boolean r1 = r2.moveToFirst()     // Catch:{ all -> 0x039f }
            if (r1 == 0) goto L_0x0398
            boolean r1 = r2.isNull(r3)     // Catch:{ all -> 0x039f }
            if (r1 != 0) goto L_0x0398
            long r0 = r2.getLong(r3)     // Catch:{ all -> 0x039f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x039f }
        L_0x0398:
            r2.close()
            r4.A00()
            return r0
        L_0x039f:
            r0 = move-exception
            r2.close()
            r4.A00()
            throw r0
        L_0x03a7:
            java.lang.Object r0 = r3.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.M6w r0 = r0.A07
            java.lang.Object r5 = r3.A01
            X.MAm r5 = (X.MAm) r5
            r4 = 0
            r3 = 0
            android.database.Cursor r2 = X.C30586GLy.A00(r0, r5, r4)
            int r0 = r2.getCount()     // Catch:{ all -> 0x03dc }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x03dc }
        L_0x03bf:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x03d5
            boolean r1 = r2.isNull(r4)     // Catch:{ all -> 0x03dc }
            if (r1 == 0) goto L_0x03cd
            r1 = r3
            goto L_0x03d1
        L_0x03cd:
            java.lang.String r1 = r2.getString(r4)     // Catch:{ all -> 0x03dc }
        L_0x03d1:
            r0.add(r1)     // Catch:{ all -> 0x03dc }
            goto L_0x03bf
        L_0x03d5:
            r2.close()
            r5.A00()
            return r0
        L_0x03dc:
            r0 = move-exception
            r2.close()
            r5.A00()
            throw r0
        L_0x03e4:
            java.lang.Object r0 = r3.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.M6w r2 = r0.A07
            r2.beginTransaction()
            X.5C8 r1 = r0.A03     // Catch:{ all -> 0x04e5 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x04e5 }
            X.6h8 r0 = (X.C107676h8) r0     // Catch:{ all -> 0x04e5 }
            int r0 = r1.A00(r0)     // Catch:{ all -> 0x04e5 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x04e5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x04e5 }
            r2.endTransaction()
            return r0
        L_0x0402:
            java.lang.Object r0 = r3.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.M6w r2 = r0.A07
            r2.beginTransaction()
            X.5C8 r1 = r0.A00     // Catch:{ all -> 0x04e5 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x04e5 }
            X.Lnp r0 = (X.C40791Lnp) r0     // Catch:{ all -> 0x04e5 }
            r1.A00(r0)     // Catch:{ all -> 0x04e5 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x04e5 }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x04e5 }
            goto L_0x04e1
        L_0x041b:
            java.lang.Object r0 = r3.A00
            X.M5p r0 = (X.C41253M5p) r0
            X.M6w r2 = r0.A07
            r2.beginTransaction()
            X.CHX r1 = r0.A04     // Catch:{ all -> 0x04e5 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x04e5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x04e5 }
            r1.insert((java.lang.Iterable) r0)     // Catch:{ all -> 0x04e5 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x04e5 }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x04e5 }
            goto L_0x04e1
        L_0x0434:
            java.lang.Object r0 = r3.A00
            X.765 r0 = (X.AnonymousClass765) r0
            X.M6w r1 = r0.A01
            java.lang.Object r7 = r3.A01
            X.MAm r7 = (X.MAm) r7
            r0 = 0
            r10 = 0
            android.database.Cursor r6 = X.C30586GLy.A00(r1, r7, r0)
            java.lang.String r0 = "miniGallerySurface"
            int r5 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            java.lang.String r0 = "categoryId"
            int r4 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            java.lang.String r0 = "displayName"
            int r3 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            java.lang.String r0 = "syncedAt"
            int r8 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            java.lang.String r0 = "id"
            int r2 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            java.lang.String r0 = "isDefaultCategory"
            int r1 = X.C116106wR.A01(r6, r0)     // Catch:{ all -> 0x04c2 }
            int r0 = r6.getCount()     // Catch:{ all -> 0x04c2 }
            java.util.ArrayList r0 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x04c2 }
        L_0x0470:
            boolean r9 = r6.moveToNext()     // Catch:{ all -> 0x04c2 }
            if (r9 == 0) goto L_0x04bb
            boolean r9 = r6.isNull(r5)     // Catch:{ all -> 0x04c2 }
            if (r9 == 0) goto L_0x047e
            r12 = r10
            goto L_0x0482
        L_0x047e:
            java.lang.String r12 = r6.getString(r5)     // Catch:{ all -> 0x04c2 }
        L_0x0482:
            boolean r9 = r6.isNull(r4)     // Catch:{ all -> 0x04c2 }
            if (r9 == 0) goto L_0x048a
            r13 = r10
            goto L_0x048e
        L_0x048a:
            java.lang.String r13 = r6.getString(r4)     // Catch:{ all -> 0x04c2 }
        L_0x048e:
            boolean r9 = r6.isNull(r3)     // Catch:{ all -> 0x04c2 }
            if (r9 == 0) goto L_0x0496
            r14 = r10
            goto L_0x049a
        L_0x0496:
            java.lang.String r14 = r6.getString(r3)     // Catch:{ all -> 0x04c2 }
        L_0x049a:
            long r16 = r6.getLong(r8)     // Catch:{ all -> 0x04c2 }
            boolean r9 = r6.isNull(r2)     // Catch:{ all -> 0x04c2 }
            if (r9 == 0) goto L_0x04a6
            r15 = r10
            goto L_0x04aa
        L_0x04a6:
            java.lang.String r15 = r6.getString(r2)     // Catch:{ all -> 0x04c2 }
        L_0x04aa:
            int r9 = r6.getInt(r1)     // Catch:{ all -> 0x04c2 }
            boolean r18 = X.C18180wK.A1V(r9)
            X.6m4 r11 = new X.6m4     // Catch:{ all -> 0x04c2 }
            r11.<init>(r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x04c2 }
            r0.add(r11)     // Catch:{ all -> 0x04c2 }
            goto L_0x0470
        L_0x04bb:
            r6.close()
            r7.A00()
            return r0
        L_0x04c2:
            r0 = move-exception
            r6.close()
            r7.A00()
            throw r0
        L_0x04ca:
            java.lang.Object r0 = r3.A00
            X.765 r0 = (X.AnonymousClass765) r0
            X.M6w r2 = r0.A01
            r2.beginTransaction()
            X.CHX r1 = r0.A00     // Catch:{ all -> 0x04e5 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x04e5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x04e5 }
            r1.insert((java.lang.Iterable) r0)     // Catch:{ all -> 0x04e5 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x04e5 }
            kotlin.Unit r0 = kotlin.Unit.A00     // Catch:{ all -> 0x04e5 }
        L_0x04e1:
            r2.endTransaction()
            return r0
        L_0x04e5:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCallableShape88S0200000_2_I2.call():java.lang.Object");
    }
}
