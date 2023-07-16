package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.facebook.nobreak.CrashLoop$LastState;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public class C05460Tv {
    public static final String[] A00 = {"crash_log", "insta_crash_log", "crash_lock", "remedy_log", "app_was_disabled", "ACRA-INSTALLATION", "is_employee", "app_state_logs"};

    public String A04() {
        return "Default Crash Loop Remedy";
    }

    public void A05(Context context, C05470Tw r2) {
    }

    public final C05480Tx A01(Context context, int i, int i2) {
        String str;
        boolean z = true;
        if (C07850cI.A0E) {
            String.format("Handling crash level %d, previous %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
        if (i > i2) {
            if (new File(context.getApplicationInfo().dataDir, "flags/is_employee").exists()) {
                try {
                    String A04 = A04();
                    Locale locale = Locale.US;
                    if (i == 1) {
                        str = "cleared caches";
                    } else if (i == 2) {
                        str = "cleared data and logged out";
                    } else if (i != 3) {
                        str = String.format(locale, "??? %s", new Object[]{Integer.valueOf(i)});
                    } else {
                        str = "disabled auto-start";
                    }
                    if (A04 == null) {
                        A04 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    }
                    String format = String.format(locale, "[employee only] %s using class %s in process %s.", new Object[]{str, A04, AnonymousClass0KY.A00().A01});
                    Notification.Builder smallIcon = new Notification.Builder(context).setWhen(System.currentTimeMillis()).setContentTitle("[fb] crash mitigation applied").setContentText(format).setSmallIcon(17301533);
                    smallIcon.setShowWhen(true);
                    smallIcon.setStyle(new Notification.BigTextStyle().bigText(format));
                    ((NotificationManager) context.getSystemService("notification")).notify(1, smallIcon.getNotification());
                } catch (Throwable th) {
                    Log.w("CrashLoopRemedy", "non-fatal error showing notification", th);
                }
            }
            C07850cI.A01(context);
            if (i == 1) {
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    A00(cacheDir, new String[0], (Pattern[]) null);
                }
            } else if (i == 2) {
                A06(context, new String[0], (Pattern[]) null);
            } else if (i != 3) {
                Log.w("CrashLoopRemedy", AnonymousClass00U.A0J("unknown remedy level ", i));
            } else {
                File file = new File(context.getApplicationInfo().dataDir, "app_was_disabled");
                try {
                    file.createNewFile();
                    if (file.exists()) {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            ComponentName componentName = new ComponentName(context, CrashLoop$LastState.class);
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(C05440Tt.A00(context, packageManager.getPackageInfo(context.getPackageName(), 642).receivers));
                            arrayList.addAll(C05440Tt.A00(context, packageManager.getPackageInfo(context.getPackageName(), 641).activities));
                            arrayList.addAll(C05440Tt.A00(context, packageManager.getPackageInfo(context.getPackageName(), 648).providers));
                            arrayList.addAll(C05440Tt.A00(context, packageManager.getPackageInfo(context.getPackageName(), 644).services));
                            Collections.sort(arrayList, new C05430Tr());
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ComponentInfo componentInfo = (ComponentInfo) it.next();
                                arrayList2.add(new ComponentName(componentInfo.packageName, componentInfo.name));
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ComponentName componentName2 = (ComponentName) it2.next();
                                componentName2.getClassName();
                                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
                            }
                            packageManager.setComponentEnabledSetting(componentName, 2, 1);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (RuntimeException e2) {
                            Log.e("CrashLoopRemedy", "unable to disable app entry points", e2);
                        }
                        return new C05480Tx(true, z);
                    }
                    throw new RuntimeException("could not disable crash loop: could not create signal file");
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
            z = false;
            return new C05480Tx(true, z);
        }
        return new C05480Tx(false, false);
    }

    public C05480Tx A03(Context context, Map map, int i, int i2) {
        if (C07850cI.A0E) {
            String.format("Handling INSTA crash level %d, previous %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
        return A01(context, i, i2);
    }

    public static void A00(File file, String[] strArr, Pattern[] patternArr) {
        String name = file.getName();
        int i = 0;
        while (i < strArr.length) {
            if (!name.matches(strArr[i])) {
                i++;
            } else {
                return;
            }
        }
        if (patternArr != null) {
            String path = file.getPath();
            int length = patternArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!patternArr[i2].matcher(path).matches()) {
                    i2++;
                } else {
                    return;
                }
            }
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File A002 : listFiles) {
                    A00(A002, strArr, patternArr);
                }
            } else {
                return;
            }
        }
        file.delete();
    }

    public C05480Tx A02(Context context, Map map, int i, int i2) {
        return A01(context, i, i2);
    }

    public final void A06(Context context, String[] strArr, Pattern[] patternArr) {
        File file = new File(context.getApplicationInfo().dataDir);
        String[] strArr2 = A00;
        int length = strArr2.length;
        int length2 = strArr.length;
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, length + length2);
        System.arraycopy(strArr, 0, strArr3, length, length2);
        A00(file, strArr3, patternArr);
    }
}
