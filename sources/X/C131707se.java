package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.redex.IDxDListenerShape442S0100000_2_I2;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.push.FbnsInitBroadcastReceiver;

/* renamed from: X.7se  reason: invalid class name and case insensitive filesystem */
public final class C131707se implements C146338m4 {
    public HGC A00;
    public FbnsInitBroadcastReceiver A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C16850tr A06;
    public final C10390iG A07 = new IDxDListenerShape442S0100000_2_I2(this, 1);
    public final C146338m4 A08;
    public final String A09;

    public C131707se(Context context, C146338m4 r5) {
        String A002 = AnonymousClass000.A00(91);
        this.A05 = context;
        this.A09 = A002;
        this.A08 = r5;
        this.A06 = new C16850tr(context, new C127897ht(this));
        this.A04 = AnonymousClass6UB.A00(context);
    }

    public final PushChannelType B59() {
        if (this.A04) {
            return PushChannelType.FBNS;
        }
        C146338m4 r0 = this.A08;
        if (r0 != null) {
            return r0.B59();
        }
        return PushChannelType.NONE;
    }

    public final void BPv(HGC hgc, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = hgc;
        if (!this.A04) {
            C5S();
            return;
        }
        synchronized (this) {
            C691847d.A02(this.A07);
            if (this.A01 == null) {
                Context context = this.A05;
                if (context.getApplicationInfo().targetSdkVersion >= 24) {
                    this.A01 = new FbnsInitBroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter(AnonymousClass000.A00(46));
                    if (context.getApplicationInfo().targetSdkVersion >= 26) {
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                    }
                    context.registerReceiver(this.A01, intentFilter);
                }
            }
        }
        Context context2 = this.A05;
        Class<FbnsInitBroadcastReceiver> cls = FbnsInitBroadcastReceiver.class;
        ComponentName componentName = new ComponentName(context2, cls);
        PackageManager packageManager = context2.getPackageManager();
        cls.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        if (str != null) {
            String A052 = C09140ev.A02.A05(context2);
            int i = 30;
            if (z || !(!AnonymousClass0PL.A00(context2).A02)) {
                i = 10000;
            }
            Integer valueOf = Integer.valueOf(i);
            Bundle A062 = C18180wK.A06();
            if (z) {
                AnonymousClass0tp.A03.A01(A062, str);
            } else {
                AnonymousClass0tp.A03.A01(A062, "");
            }
            AnonymousClass0tp.A05.A01(A062, A052);
            AnonymousClass0tp.A04.A01(A062, Boolean.valueOf(z));
            AnonymousClass0tp.A06.A01(A062, -1);
            AnonymousClass0tp.A0A.A01(A062, valueOf);
            new C16950u2(context2).A01(new FbnsAIDLRequest(C16930u0.SET_ANALYTICS_CONFIG.A00, A062));
        }
        boolean z2 = null;
        if (C09650fs.A04(context2) && (!C63173fJ.A05(AnonymousClass0TJ.A05, 18296805494161885L))) {
            z2 = true;
        }
        AnonymousClass0YN r3 = new AnonymousClass0YN(z2, (Integer) null);
        C16850tr r1 = this.A06;
        String Ahj = r1.A01.Ahj();
        if (Ahj != null) {
            if (AnonymousClass0s5.A02(Ahj)) {
                C16890tv.A00(r1.A00);
            }
            C16890tv.A01(r1.A00, r3, FbnsServiceDelegate.A00(Ahj), "init", Ahj, "Orca.START");
        } else {
            C16890tv.A00(r1.A00);
        }
        C146338m4 r0 = this.A08;
        if (r0 != null) {
            r0.BPv(hgc, str, z);
        }
    }

    public final void BiW(C106326er r3) {
        C146338m4 r0 = this.A08;
        if (r0 != null) {
            r0.BiW(r3);
        } else {
            r3.A00.C3z(false);
        }
    }

    public final void C5S() {
        Context context = this.A05;
        Class<FbnsInitBroadcastReceiver> cls = FbnsInitBroadcastReceiver.class;
        ComponentName componentName = new ComponentName(context, cls);
        PackageManager packageManager = context.getPackageManager();
        cls.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        synchronized (this) {
            C691847d.A03(this.A07);
            FbnsInitBroadcastReceiver fbnsInitBroadcastReceiver = this.A01;
            if (fbnsInitBroadcastReceiver != null) {
                try {
                    context.unregisterReceiver(fbnsInitBroadcastReceiver);
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
                this.A01 = null;
            }
        }
        C16850tr r6 = this.A06;
        String Ahj = r6.A01.Ahj();
        if (Ahj != null) {
            Context context2 = r6.A00;
            String A002 = FbnsServiceDelegate.A00(Ahj);
            if (A002 == null) {
                A002 = FbnsServiceDelegate.A00(Ahj);
            }
            Intent A052 = C18250wR.A05("com.facebook.rti.fbns.intent.UNREGISTER");
            A052.setComponent(new ComponentName(Ahj, A002));
            A052.putExtra("pkg_name", context2.getPackageName());
            C12610mC.A01(A052, new C12710mM(context2));
        }
        Context context3 = r6.A00;
        C16890tv.A00(context3);
        SharedPreferences.Editor edit = new C12800mV(context3).A00(AnonymousClass006.A04).A00.edit();
        edit.clear();
        edit.apply();
        Bundle A062 = C18180wK.A06();
        AnonymousClass0tp.A03.A01(A062, (Object) null);
        AnonymousClass0tp.A04.A01(A062, C18180wK.A0X());
        new C16950u2(context).A01(new FbnsAIDLRequest(C16930u0.SET_ANALYTICS_CONFIG.A00, A062));
    }

    public final void CZk() {
        HGC hgc = this.A00;
        if (hgc != null) {
            hgc.A07(this.A05, PushChannelType.FBNS, 1);
        } else {
            C10450iM.A03("FbnsPushRegistrar register", "Unable to log because delegate was null");
        }
        boolean A002 = AnonymousClass6UB.A00(this.A05);
        if (this.A04 != A002) {
            this.A04 = A002;
            BPv(this.A00, this.A02, this.A03);
        }
        if (this.A04) {
            C16850tr r1 = this.A06;
            String str = this.A09;
            String Ahj = r1.A01.Ahj();
            if (Ahj != null) {
                Context context = r1.A00;
                String A003 = FbnsServiceDelegate.A00(Ahj);
                context.getClass();
                C12710mM r3 = new C12710mM(context);
                if (!TextUtils.isEmpty(str)) {
                    if (context.getPackageName().equals(Ahj)) {
                        ComponentName componentName = new ComponentName(context, A003);
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        componentName.getShortClassName();
                    }
                    Intent A052 = C18250wR.A05("com.facebook.rti.fbns.intent.REGISTER");
                    A052.setComponent(new ComponentName(Ahj, A003));
                    A052.putExtra("pkg_name", context.getPackageName());
                    A052.putExtra("appid", str);
                    C12610mC.A01(A052, r3);
                } else {
                    throw C18190wL.A0a("Missing appId");
                }
            }
        }
        C146338m4 r0 = this.A08;
        if (r0 != null) {
            r0.CZk();
        }
    }
}
