package com.google.android.gms.flags.impl;

import X.AnonymousClass4Tv;
import X.AnonymousClass6D6;
import X.AnonymousClass6J3;
import X.C1367284c;
import X.C1367684h;
import X.C1367784i;
import X.C14030oh;
import X.C73734Tu;
import X.C86104wH;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;

public class FlagProviderImpl extends zzd {
    public SharedPreferences A00;
    public boolean A01 = false;

    public FlagProviderImpl() {
        int A03 = C14030oh.A03(-1741199633);
        C14030oh.A0A(-1023645763, A03);
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        int A03 = C14030oh.A03(-2070042418);
        if (!this.A01) {
            C14030oh.A0A(1788763518, A03);
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) AnonymousClass6J3.A00(new C73734Tu(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C86104wH.A0w(e.getMessage(), "Flag value not available, returning default: "));
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        C14030oh.A0A(1630667707, A03);
        return booleanValue;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        int A03 = C14030oh.A03(2065136014);
        if (!this.A01) {
            C14030oh.A0A(-697527951, A03);
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) AnonymousClass6J3.A00(new AnonymousClass4Tv(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C86104wH.A0w(e.getMessage(), "Flag value not available, returning default: "));
            num = valueOf;
        }
        int intValue = num.intValue();
        C14030oh.A0A(716281568, A03);
        return intValue;
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        int A03 = C14030oh.A03(-2136135437);
        if (!this.A01) {
            C14030oh.A0A(1634664166, A03);
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) AnonymousClass6J3.A00(new C1367684h(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C86104wH.A0w(e.getMessage(), "Flag value not available, returning default: "));
            l = valueOf;
        }
        long longValue = l.longValue();
        C14030oh.A0A(-2105866292, A03);
        return longValue;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        int A03 = C14030oh.A03(-1939083101);
        if (!this.A01) {
            C14030oh.A0A(440927957, A03);
            return str2;
        }
        try {
            str3 = (String) AnonymousClass6J3.A00(new C1367784i(this.A00, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C86104wH.A0w(e.getMessage(), "Flag value not available, returning default: "));
            str3 = str2;
        }
        C14030oh.A0A(-1556420234, A03);
        return str3;
    }

    public void init(IObjectWrapper iObjectWrapper) {
        int i;
        SharedPreferences sharedPreferences;
        int A03 = C14030oh.A03(-1400581887);
        Context context = (Context) ObjectWrapper.A01(iObjectWrapper);
        if (this.A01) {
            i = 1138904607;
        } else {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = AnonymousClass6D6.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) AnonymousClass6J3.A00(new C1367284c(createPackageContext));
                        AnonymousClass6D6.A00 = sharedPreferences;
                    }
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
                i = -752775161;
            } catch (PackageManager.NameNotFoundException unused) {
                C14030oh.A0A(190901158, A03);
                return;
            } catch (Exception e) {
                Log.w("FlagProviderImpl", C86104wH.A0w(e.getMessage(), "Could not retrieve sdk flags, continuing with defaults: "));
                i = -537315490;
            }
        }
        C14030oh.A0A(i, A03);
    }
}
