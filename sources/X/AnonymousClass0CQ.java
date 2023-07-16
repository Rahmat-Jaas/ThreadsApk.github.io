package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.TransactionTooLargeException;
import com.facebook.analytics2.logger.AlarmBasedUploadService;
import java.util.Arrays;

/* renamed from: X.0CQ  reason: invalid class name */
public final class AnonymousClass0CQ {
    public static AnonymousClass0CQ A02;
    public static final String A03 = AlarmBasedUploadService.class.getName();
    public final Context A00;
    public volatile String A01;

    public static synchronized AnonymousClass0CQ A00(Context context) {
        AnonymousClass0CQ r1;
        synchronized (AnonymousClass0CQ.class) {
            r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass0CQ(context.getApplicationContext());
                A02 = r1;
            }
        }
        return r1;
    }

    public AnonymousClass0CQ(Context context) {
        this.A00 = context;
    }

    public final boolean A01() {
        String str;
        String str2;
        String A002 = C29896Fw7.A00();
        synchronized (this) {
            if (this.A01 == null) {
                String str3 = A03;
                String str4 = null;
                try {
                    Context context = this.A00;
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        int i = 0;
                        while (true) {
                            if (i >= serviceInfoArr.length) {
                                break;
                            }
                            ServiceInfo serviceInfo = serviceInfoArr[i];
                            if (serviceInfo.name.equals(str3)) {
                                str4 = serviceInfo.processName;
                                break;
                            }
                            i++;
                        }
                        this.A01 = str4;
                    }
                    AnonymousClass0LU.A0N("UploadServiceProcessUtil", "Unable to find the UploadService! Services registered: %s", Arrays.deepToString(serviceInfoArr));
                } catch (PackageManager.NameNotFoundException e) {
                    AnonymousClass0LU.A0M("UploadServiceProcessUtil", "Package %s cannot  be found!", e, this.A00.getPackageName());
                } catch (RuntimeException e2) {
                    Throwable th = e2;
                    while (th.getCause() != null) {
                        th = th.getCause();
                    }
                    if (th instanceof DeadObjectException) {
                        str2 = "DeadObjectException when trying to get package manager from context";
                    } else if (th instanceof TransactionTooLargeException) {
                        str2 = "TransactionTooLargeException Exception when trying to get package manager from context";
                    } else {
                        throw e2;
                    }
                    AnonymousClass0LU.A0E("UploadServiceProcessUtil", str2, e2);
                }
                this.A01 = str4;
            }
            str = this.A01;
        }
        if (str == null) {
            return false;
        }
        return str.equals(A002);
    }
}
