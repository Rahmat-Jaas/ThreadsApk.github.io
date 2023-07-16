package com.facebook.profilo.ipc;

import X.AnonymousClass0UJ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.config.ConfigParams;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class TraceConfigExtras implements Parcelable {
    public static final TraceConfigExtras A07 = new TraceConfigExtras((TreeMap) null, (TreeMap) null, (TreeMap) null, (TreeMap) null, (TreeMap) null);
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(10);
    public final int A00;
    public final AnonymousClass0UJ A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;
    public final TreeMap A05;
    public final TreeMap A06;

    public final String A01(String str) {
        String str2;
        AnonymousClass0UJ r1 = this.A01;
        if (r1 != null) {
            return r1.optTraceConfigParamString(this.A00, str, (String) null);
        }
        TreeMap treeMap = this.A06;
        if (treeMap == null || (str2 = (String) treeMap.get(str)) == null) {
            return null;
        }
        return str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final int A00(String str, int i) {
        Number number;
        AnonymousClass0UJ r1 = this.A01;
        if (r1 != null) {
            return r1.optTraceConfigParamInt(this.A00, str, i);
        }
        TreeMap treeMap = this.A04;
        if (treeMap == null || (number = (Number) treeMap.get(str)) == null) {
            return i;
        }
        return number.intValue();
    }

    public final boolean A02(String str, boolean z) {
        Boolean bool;
        AnonymousClass0UJ r1 = this.A01;
        if (r1 != null) {
            return r1.optTraceConfigParamBool(this.A00, str, z);
        }
        TreeMap treeMap = this.A02;
        if (treeMap == null || (bool = (Boolean) treeMap.get(str)) == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public final int[] A03(String str) {
        AnonymousClass0UJ r1 = this.A01;
        if (r1 != null) {
            return r1.optTraceConfigParamIntList(this.A00, str);
        }
        TreeMap treeMap = this.A03;
        if (treeMap == null) {
            return null;
        }
        return (int[]) treeMap.get(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0UJ r1;
        TreeMap treeMap = this.A04;
        TreeMap treeMap2 = this.A02;
        TreeMap treeMap3 = this.A03;
        TreeMap treeMap4 = this.A05;
        TreeMap treeMap5 = this.A06;
        int i2 = this.A00;
        if (i2 >= 0 && (r1 = this.A01) != null) {
            ConfigParams traceConfigParams = r1.getTraceConfigParams(i2);
            treeMap = traceConfigParams.intParams;
            treeMap2 = traceConfigParams.boolParams;
            treeMap3 = traceConfigParams.intListParams;
        }
        Bundle bundle = new Bundle();
        if (treeMap != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                bundle.putInt((String) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        if (treeMap2 != null) {
            for (Map.Entry entry2 : treeMap2.entrySet()) {
                bundle2.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle();
        if (treeMap3 != null) {
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                bundle3.putIntArray((String) entry3.getKey(), (int[]) entry3.getValue());
            }
        }
        parcel.writeBundle(bundle3);
        Bundle bundle4 = new Bundle();
        if (treeMap4 != null) {
            for (Map.Entry entry4 : treeMap4.entrySet()) {
                bundle4.putStringArrayList((String) entry4.getKey(), (ArrayList) entry4.getValue());
            }
        }
        parcel.writeBundle(bundle4);
        Bundle bundle5 = new Bundle();
        if (treeMap5 != null) {
            for (Map.Entry entry5 : treeMap5.entrySet()) {
                bundle5.putCharArray((String) entry5.getKey(), ((String) entry5.getValue()).toCharArray());
            }
        }
        parcel.writeBundle(bundle5);
    }

    public TraceConfigExtras(Parcel parcel) {
        this.A01 = null;
        this.A00 = -1;
        Class<?> cls = getClass();
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet = readBundle.keySet();
        if (!keySet.isEmpty()) {
            this.A04 = new TreeMap();
            for (String next : keySet) {
                this.A04.put(next, Integer.valueOf(readBundle.getInt(next)));
            }
        } else {
            this.A04 = null;
        }
        Bundle readBundle2 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet2 = readBundle2.keySet();
        if (!keySet2.isEmpty()) {
            this.A02 = new TreeMap();
            for (String next2 : keySet2) {
                this.A02.put(next2, Boolean.valueOf(readBundle2.getBoolean(next2)));
            }
        } else {
            this.A02 = null;
        }
        Bundle readBundle3 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet3 = readBundle3.keySet();
        if (!keySet3.isEmpty()) {
            this.A03 = new TreeMap();
            for (String next3 : keySet3) {
                this.A03.put(next3, readBundle3.getIntArray(next3));
            }
        } else {
            this.A03 = null;
        }
        Bundle readBundle4 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet4 = readBundle4.keySet();
        if (!keySet4.isEmpty()) {
            this.A05 = new TreeMap();
            for (String next4 : keySet4) {
                this.A05.put(next4, readBundle4.getStringArrayList(next4));
            }
        } else {
            this.A05 = null;
        }
        Bundle readBundle5 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet5 = readBundle5.keySet();
        if (!keySet5.isEmpty()) {
            this.A06 = new TreeMap();
            for (String next5 : keySet5) {
                this.A06.put(next5, new String(readBundle5.getCharArray(next5)));
            }
            return;
        }
        this.A06 = null;
    }

    public TraceConfigExtras(AnonymousClass0UJ r2, int i) {
        this.A01 = r2;
        this.A00 = i;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public TraceConfigExtras(TreeMap treeMap, TreeMap treeMap2, TreeMap treeMap3, TreeMap treeMap4, TreeMap treeMap5) {
        this.A04 = treeMap;
        this.A02 = treeMap2;
        this.A03 = treeMap3;
        this.A05 = treeMap4;
        this.A06 = treeMap5;
        this.A01 = null;
        this.A00 = -1;
    }
}
