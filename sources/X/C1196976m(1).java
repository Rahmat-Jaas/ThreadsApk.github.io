package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.76m  reason: invalid class name and case insensitive filesystem */
public final class C1196976m {
    public static C1196976m A05;
    public static C1196976m A06;
    public boolean A00;
    public final Context A01;
    public final SparseArray A02 = C86154wM.A0D();
    public final Class A03;
    public final String A04;

    public static synchronized C1196976m A00(Context context, int i) {
        C1196976m r2;
        synchronized (C1196976m.class) {
            if (i != 0) {
                r2 = A05;
                if (r2 == null) {
                    r2 = new C1196976m(context.getApplicationContext(), 1);
                    A05 = r2;
                }
            } else {
                r2 = A06;
                if (r2 == null) {
                    r2 = new C1196976m(context.getApplicationContext(), 0);
                    A06 = r2;
                }
            }
        }
        return r2;
    }

    public C1196976m(Context context, int i) {
        String str;
        Throwable th;
        int i2;
        RuntimeException A0V;
        RuntimeException A0V2;
        this.A01 = context;
        if (i != 0) {
            this.A03 = GcmTaskServiceCompat.class;
            str = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
        } else {
            this.A03 = JobServiceCompat.class;
            str = "android.permission.BIND_JOB_SERVICE";
        }
        this.A04 = str;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 4740);
            int i3 = packageInfo.versionCode;
            int A002 = AnonymousClass0FX.A00();
            if (i3 != A002) {
                AnonymousClass0LU.A0P("ServiceInfoParser", "Version Codes do not match!packageManager: %d buildConstant: %d updatedPackageManager: %d", C86134wK.A1b(Integer.valueOf(i3), Integer.valueOf(A002), context.createPackageContext(context.getPackageName(), 0).getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 4740).versionCode));
                this.A00 = true;
            } else {
                this.A00 = false;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (this.A04.equals(serviceInfo.permission)) {
                        try {
                            SparseArray sparseArray = this.A02;
                            Class cls = this.A03;
                            Class<C1196976m> cls2 = C1196976m.class;
                            synchronized (cls2) {
                                Bundle bundle = serviceInfo.metaData;
                                if (bundle == null || (i2 = bundle.getInt("com.facebook.common.jobscheduler.compat.jobIds")) == 0) {
                                    th = new C97416Bg(AnonymousClass00U.A0d("Service ", serviceInfo.name, " is missing meta key ", "com.facebook.common.jobscheduler.compat.jobIds"));
                                } else {
                                    try {
                                        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(i2);
                                        int i4 = 0;
                                        while (i4 < obtainTypedArray.length()) {
                                            try {
                                                int resourceId = obtainTypedArray.getResourceId(i4, 0);
                                                if (resourceId != 0) {
                                                    if (sparseArray.get(resourceId) == null) {
                                                        Class<?> cls3 = Class.forName(serviceInfo.name);
                                                        if (cls.isAssignableFrom(cls3)) {
                                                            sparseArray.put(resourceId, cls3);
                                                            i4++;
                                                        } else {
                                                            A0V2 = C18250wR.A0V(AnonymousClass00U.A0d("Service class of ", cls3.getName(), " is not assignable to:  ", cls.getName()));
                                                        }
                                                    } else {
                                                        StringBuilder A0r = C18200wM.A0r();
                                                        A0r.append("Duplicate jobId: ");
                                                        A0r.append(String.valueOf(resourceId));
                                                        A0r.append(" detected for class: ");
                                                        A0r.append(sparseArray.get(resourceId));
                                                        A0r.append(" and ");
                                                        A0V2 = C18250wR.A0V(C18180wK.A0i(serviceInfo.name, A0r));
                                                    }
                                                    throw A0V2;
                                                }
                                                A0V = C18250wR.A0V("value not found");
                                                throw A0V;
                                            } catch (ClassNotFoundException e) {
                                                StringBuilder A0r2 = C18200wM.A0r();
                                                A0r2.append("Unable to resolve service class ");
                                                A0r2.append(serviceInfo.name);
                                                A0r2.append(" class_loader: ");
                                                boolean z = true;
                                                for (ClassLoader classLoader = cls2.getClassLoader(); classLoader != null; classLoader = classLoader.getParent()) {
                                                    if (z) {
                                                        z = false;
                                                    } else {
                                                        A0r2.append("->");
                                                    }
                                                    A0r2.append(classLoader.getClass().getCanonicalName());
                                                }
                                                A0V = C86154wM.A0h(A0r2.toString(), e);
                                            } catch (Throwable th2) {
                                                obtainTypedArray.recycle();
                                                throw th2;
                                            }
                                        }
                                        obtainTypedArray.recycle();
                                    } catch (Resources.NotFoundException e2) {
                                        th = C86114wI.A0k(e2);
                                    }
                                }
                                throw th;
                            }
                        } catch (C97416Bg e3) {
                            AnonymousClass0LU.A0C("ServiceInfoParser", e3.toString());
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw C86114wI.A0k(e4);
        }
    }
}
