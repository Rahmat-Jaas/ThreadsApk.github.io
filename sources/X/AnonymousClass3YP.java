package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.os.BaseBundle;
import android.os.Build;
import android.provider.Settings;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.3YP  reason: invalid class name */
public abstract class AnonymousClass3YP {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:94|95|96|97|145|143) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026c, code lost:
        if (X.C04220Ms.A0I(r9.getPackageName(), r13.getPackageName()) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027e, code lost:
        if (X.C04220Ms.A0I(A00(r9).getClassName(), r13.getClassName()) == false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0280, code lost:
        X.C18200wM.A1U(r16, r1.getInt(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
        r13 = r0.getComponent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025e, code lost:
        if (r13 == null) goto L_0x0289;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0256 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.content.Context r25, int r26) {
        /*
            r24 = this;
            r5 = r24
            boolean r0 = r5 instanceof X.C26501qk
            r9 = r25
            r8 = r26
            if (r0 == 0) goto L_0x003d
            r1 = r5
            X.1qk r1 = (X.C26501qk) r1
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            android.content.Intent r2 = r1.A00     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = "notificationNum"
            r2.putExtra(r0, r8)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = "packageName"
            java.lang.String r0 = r9.getPackageName()     // Catch:{ Exception -> 0x0038 }
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r1 = "className"
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0038 }
            java.lang.String r0 = r0.getClassName()     // Catch:{ Exception -> 0x0038 }
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x0038 }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2.addFlags(r0)     // Catch:{ Exception -> 0x0038 }
            r9.sendBroadcast(r2)     // Catch:{ Exception -> 0x0038 }
            goto L_0x035e
        L_0x0038:
            r2 = move-exception
            java.lang.String r1 = "VivoLauncherBadges"
            goto L_0x0369
        L_0x003d:
            boolean r0 = r5 instanceof X.C26541qo
            if (r0 == 0) goto L_0x0084
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            java.lang.String r1 = X.C10170hq.A01(r9)
            X.C04220Ms.A06(r1)
            android.os.Bundle r4 = X.C18180wK.A06()
            A01(r9, r4, r8)
            r7 = 0
            java.lang.String r0 = "com.transsion.XOSLauncher"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r3 = "change_badge"
            r2 = 0
            if (r0 == 0) goto L_0x006b
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x007f }
            android.net.Uri r0 = X.C26541qo.A01     // Catch:{ Exception -> 0x007f }
            android.os.Bundle r0 = r1.call(r0, r3, r2, r4)     // Catch:{ Exception -> 0x007f }
            goto L_0x035c
        L_0x006b:
            java.lang.String r0 = "com.transsion.hilauncher"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x036f
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x007f }
            android.net.Uri r0 = X.C26541qo.A00     // Catch:{ Exception -> 0x007f }
            android.os.Bundle r0 = r1.call(r0, r3, r2, r4)     // Catch:{ Exception -> 0x007f }
            goto L_0x035c
        L_0x007f:
            r2 = move-exception
            java.lang.String r1 = "TranssionLauncherBadges"
            goto L_0x01b1
        L_0x0084:
            boolean r0 = r5 instanceof X.C26531qn
            if (r0 == 0) goto L_0x0109
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            r7 = 0
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch:{ Exception -> 0x0364 }
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "com.sonymobile.home.resourceprovider"
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r0, r7)     // Catch:{ Exception -> 0x0364 }
            if (r0 == 0) goto L_0x00d1
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0364 }
            r2.<init>()     // Catch:{ Exception -> 0x0364 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "badge_count"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "package_name"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0364 }
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "activity_name"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0364 }
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "content://com.sonymobile.home.resourceprovider/badge"
            android.net.Uri r0 = X.C15430rJ.A01(r0)     // Catch:{ Exception -> 0x0364 }
            android.net.Uri r0 = r1.insert(r0, r2)     // Catch:{ Exception -> 0x0364 }
            if (r0 == 0) goto L_0x036f
            goto L_0x035e
        L_0x00d1:
            java.lang.String r0 = "com.sonyericsson.home.action.UPDATE_BADGE"
            android.content.Intent r2 = X.C18250wR.A05(r0)     // Catch:{ Exception -> 0x0364 }
            r0 = 16
            r2.setFlags(r0)     // Catch:{ Exception -> 0x0364 }
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x0364 }
            boolean r1 = X.C18180wK.A1V(r8)
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.MESSAGE"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ Exception -> 0x0364 }
            java.lang.String r0 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x0364 }
            r9.sendBroadcast(r2)     // Catch:{ Exception -> 0x0364 }
            goto L_0x035e
        L_0x0109:
            boolean r0 = r5 instanceof X.C26521qm
            if (r0 == 0) goto L_0x012c
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r0 = "badge_num"
            r4.putInt(r0, r8)
            r7 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x01ac }
            android.net.Uri r2 = X.C26521qm.A00     // Catch:{ Exception -> 0x01ac }
            java.lang.String r1 = "updateMessageBadge"
            r0 = 0
            android.os.Bundle r0 = r3.call(r2, r1, r0, r4)     // Catch:{ Exception -> 0x01ac }
            if (r0 == 0) goto L_0x036f
            goto L_0x035e
        L_0x012c:
            boolean r0 = r5 instanceof X.C26511ql
            if (r0 == 0) goto L_0x015a
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "app_badge_packageName"
            r4.putString(r0, r1)
            java.lang.String r0 = "app_badge_count"
            r4.putInt(r0, r8)
            r7 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0154 }
            android.net.Uri r2 = X.C26511ql.A00     // Catch:{ Exception -> 0x0154 }
            java.lang.String r1 = "setAppBadgeCount"
            r0 = 0
            android.os.Bundle r0 = r3.call(r2, r1, r0, r4)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x036f
            goto L_0x035e
        L_0x0154:
            r2 = move-exception
            java.lang.String r1 = X.C18220wO.A0q(r5)
            goto L_0x01b1
        L_0x015a:
            boolean r0 = r5 instanceof X.C26491qj
            if (r0 == 0) goto L_0x0183
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            android.os.Bundle r4 = X.C18180wK.A06()
            A01(r9, r4, r8)
            r7 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "content://com.huawei.android.launcher.settings/badge/"
            r2 = 0
            android.net.Uri r1 = X.C15430rJ.A01(r0)     // Catch:{ Exception -> 0x017f }
            java.lang.String r0 = "change_badge"
            android.os.Bundle r0 = r3.call(r1, r0, r2, r4)     // Catch:{ Exception -> 0x017f }
            if (r0 == 0) goto L_0x036f
            goto L_0x035e
        L_0x017f:
            r2 = move-exception
            java.lang.String r1 = "HuaweiLauncherBadges"
            goto L_0x01b1
        L_0x0183:
            boolean r0 = r5 instanceof X.C26481qi
            if (r0 == 0) goto L_0x01b7
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            android.os.Bundle r4 = X.C18180wK.A06()
            A01(r9, r4, r8)
            r7 = 0
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "content://com.hihonor.android.launcher.settings/badge/"
            r2 = 0
            android.net.Uri r1 = X.C15430rJ.A01(r0)     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "change_badge"
            android.os.Bundle r0 = r3.call(r1, r0, r2, r4)     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x036f
            goto L_0x035e
        L_0x01a8:
            r2 = move-exception
            java.lang.String r1 = "HonorLauncherBadges"
            goto L_0x01b1
        L_0x01ac:
            r2 = move-exception
            java.lang.String r1 = X.C18220wO.A0q(r5)
        L_0x01b1:
            java.lang.String r0 = "unexpected exception"
            X.C10450iM.A06(r1, r0, r2)
            return r7
        L_0x01b7:
            boolean r0 = r5 instanceof X.C26551qp
            if (r0 == 0) goto L_0x0321
            r0 = r5
            X.1qp r0 = (X.C26551qp) r0
            r7 = 1
            X.C04220Ms.A0B(r9, r7)
            float r2 = r0.A00     // Catch:{ Exception -> 0x0318 }
            r0 = 1082130432(0x40800000, float:4.0)
            r1 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02f3
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f3
            java.lang.String r17 = "com.htc.launcher.action.UPDATE_SHORTCUT"
            android.content.Intent r6 = X.C18250wR.A05(r17)     // Catch:{ Exception -> 0x0318 }
            r5 = 16
            r6.setFlags(r5)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = r9.getPackageName()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r4 = "packagename"
            r6.putExtra(r4, r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r3 = "count"
            r6.putExtra(r3, r8)     // Catch:{ Exception -> 0x0318 }
            r9.sendBroadcast(r6)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r11 = "_id"
            java.lang.String r10 = "intent"
            java.util.HashSet r16 = X.C18200wM.A0u()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "content://com.htc.launcher.settings/favorites"
            r2 = 0
            android.net.Uri r15 = X.C18210wN.A0A(r0)     // Catch:{ Exception -> 0x0318 }
            android.content.ContentProviderClient r18 = X.C09400fM.A00(r9, r15)     // Catch:{ Exception -> 0x0318 }
            if (r18 == 0) goto L_0x02a7
            r1 = 0
            r14 = 0
            java.lang.String[] r20 = new java.lang.String[]{r11, r10}     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r12 = "%s LIKE ?"
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r21 = java.lang.String.format(r2, r12, r0)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.StringBuilder r12 = X.C18200wM.A0r()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r0 = 37
            r12.append(r0)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r13 = r9.getPackageName()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r12.append(r13)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r12.append(r0)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r0 = r12.toString()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String[] r22 = new java.lang.String[]{r0}     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r23 = r2
            r19 = r15
            android.database.Cursor r1 = r18.query(r19, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r1 != 0) goto L_0x0237
            goto L_0x02a4
        L_0x0237:
            int r11 = r1.getColumnIndex(r11)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            int r12 = r1.getColumnIndex(r10)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r1.moveToFirst()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
        L_0x0242:
            boolean r0 = r1.isAfterLast()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r0 != 0) goto L_0x029d
            java.lang.String r0 = r1.getString(r12)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r0 == 0) goto L_0x0289
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r14)     // Catch:{ URISyntaxException -> 0x0256 }
            X.C04220Ms.A06(r0)     // Catch:{ URISyntaxException -> 0x0256 }
            goto L_0x025a
        L_0x0256:
            r1.moveToNext()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            goto L_0x0242
        L_0x025a:
            android.content.ComponentName r13 = r0.getComponent()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r13 == 0) goto L_0x0289
            java.lang.String r10 = r9.getPackageName()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r0 = r13.getPackageName()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            boolean r0 = X.C04220Ms.A0I(r10, r0)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r0 == 0) goto L_0x0289
            android.content.ComponentName r0 = A00(r9)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r10 = r0.getClassName()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            java.lang.String r0 = r13.getClassName()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            boolean r0 = X.C04220Ms.A0I(r10, r0)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            if (r0 == 0) goto L_0x0289
            int r10 = r1.getInt(r11)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            r0 = r16
            X.C18200wM.A1U(r0, r10)     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
        L_0x0289:
            r1.moveToNext()     // Catch:{ RemoteException -> 0x0297, all -> 0x028d }
            goto L_0x0242
        L_0x028d:
            r0 = move-exception
            r18.release()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0296
            r1.close()     // Catch:{ Exception -> 0x0318 }
        L_0x0296:
            throw r0     // Catch:{ Exception -> 0x0318 }
        L_0x0297:
            r18.release()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02a7
            goto L_0x02a0
        L_0x029d:
            r18.release()     // Catch:{ Exception -> 0x0318 }
        L_0x02a0:
            r1.close()     // Catch:{ Exception -> 0x0318 }
            goto L_0x02a7
        L_0x02a4:
            r18.release()     // Catch:{ Exception -> 0x0318 }
        L_0x02a7:
            java.util.Iterator r12 = r16.iterator()     // Catch:{ Exception -> 0x0318 }
        L_0x02ab:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x036f
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x0318 }
            int r1 = X.AnonymousClass0wJ.A04(r0)     // Catch:{ Exception -> 0x0318 }
            android.content.Intent r10 = X.C18250wR.A05(r17)     // Catch:{ Exception -> 0x0318 }
            r6.setFlags(r5)     // Catch:{ Exception -> 0x0318 }
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = r0.flattenToShortString()     // Catch:{ Exception -> 0x0318 }
            r10.putExtra(r4, r0)     // Catch:{ Exception -> 0x0318 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0318 }
            java.lang.String r11 = "favorite_item_id"
            r10.putExtra(r11, r0)     // Catch:{ Exception -> 0x0318 }
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = r0.flattenToShortString()     // Catch:{ Exception -> 0x0318 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "%%%%s%%"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "selectArgs"
            r10.putExtra(r0, r1)     // Catch:{ Exception -> 0x0318 }
            r10.putExtra(r3, r8)     // Catch:{ Exception -> 0x0318 }
            r9.sendBroadcast(r10)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02ab
        L_0x02f3:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x036e
            java.lang.String r0 = "com.htc.launcher.action.SET_NOTIFICATION"
            android.content.Intent r2 = X.C18250wR.A05(r0)     // Catch:{ Exception -> 0x0318 }
            r0 = 16
            r2.setFlags(r0)     // Catch:{ Exception -> 0x0318 }
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = r0.flattenToShortString()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "com.htc.launcher.extra.COMPONENT"
            r2.putExtra(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "com.htc.launcher.extra.COUNT"
            r2.putExtra(r0, r8)     // Catch:{ Exception -> 0x0318 }
            r9.sendBroadcast(r2)     // Catch:{ Exception -> 0x0318 }
            return r7
        L_0x0318:
            r2 = move-exception
            java.lang.String r1 = "HTCLauncherBadges"
            java.lang.String r0 = "unexpected exception"
            X.C10450iM.A06(r1, r0, r2)
            goto L_0x036e
        L_0x0321:
            r0 = 1
            X.C04220Ms.A0B(r9, r0)
            java.lang.String r1 = X.C10170hq.A01(r9)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "com.sec.android.app.launcher"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0360 }
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = "com.sec.intent.action.BADGE_COUNT_UPDATE"
        L_0x0336:
            android.content.Intent r2 = X.C18250wR.A05(r0)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r0 = "badge_count"
            r2.putExtra(r0, r8)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r1 = "badge_count_package_name"
            java.lang.String r0 = r9.getPackageName()     // Catch:{ Exception -> 0x0360 }
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r1 = "badge_count_class_name"
            android.content.ComponentName r0 = A00(r9)     // Catch:{ Exception -> 0x0360 }
            java.lang.String r0 = r0.getClassName()     // Catch:{ Exception -> 0x0360 }
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x0360 }
            r9.sendBroadcast(r2)     // Catch:{ Exception -> 0x0360 }
            goto L_0x035e
        L_0x0359:
            java.lang.String r0 = "android.intent.action.BADGE_COUNT_UPDATE"
            goto L_0x0336
        L_0x035c:
            if (r0 == 0) goto L_0x036f
        L_0x035e:
            r7 = 1
            return r7
        L_0x0360:
            r2 = move-exception
            java.lang.String r1 = "GenericLauncherBadges"
            goto L_0x0369
        L_0x0364:
            r2 = move-exception
            java.lang.String r1 = X.C18220wO.A0q(r5)
        L_0x0369:
            java.lang.String r0 = "unexpected exception"
            X.C10450iM.A06(r1, r0, r2)
        L_0x036e:
            r7 = 0
        L_0x036f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YP.A02(android.content.Context, int):boolean");
    }

    public boolean A03(Context context, String str) {
        String str2;
        PackageManager packageManager;
        if (this instanceof C26541qo) {
            boolean A1Y = AnonymousClass0wJ.A1Y(context, str);
            if ((str.equals("com.transsion.XOSLauncher") || str.equals("com.transsion.hilauncher")) && (packageManager = context.getPackageManager()) != null) {
                Intent A05 = C18250wR.A05("android.intent.action.MAIN");
                A05.addCategory(AnonymousClass000.A00(763));
                try {
                    ResolveInfo resolveActivity = packageManager.resolveActivity(A05, A1Y ? 1 : 0);
                    if (resolveActivity != null) {
                        PermissionInfo[] permissionInfoArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 4096).permissions;
                        C04220Ms.A05(permissionInfoArr);
                        int length = permissionInfoArr.length;
                        int i = 0;
                        while (i < length) {
                            PermissionInfo permissionInfo = permissionInfoArr[i];
                            if (!"com.transsion.hilauncher.permission.CHANGE_BADGE".equals(permissionInfo.name) && !"com.transsion.XOSLauncher.permission.CHANGE_BADGE".equals(permissionInfo.name)) {
                                i++;
                            }
                        }
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return false;
        } else if (this instanceof C26531qn) {
            C04220Ms.A0B(str, 1);
            return C26531qn.A00.contains(str);
        } else if (this instanceof C26521qm) {
            C04220Ms.A0B(str, 1);
            return str.equals("com.smartisanos.launcher");
        } else if (this instanceof C26511ql) {
            String str3 = Build.BRAND;
            if ((str3.equalsIgnoreCase("oppo") || str3.equalsIgnoreCase("realme")) && str.equals("com.android.launcher")) {
                try {
                    if (C18210wN.A1U((String) Class.forName(AnonymousClass000.A00(47)).getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.version.oplusrom"}))) {
                        return true;
                    }
                } catch (Exception e) {
                    C10450iM.A06("oppo badging", "Exception while getting Oppo build version", e);
                }
            }
            if (str.equals("com.oppo.launcher")) {
                return true;
            }
            return false;
        } else if (this instanceof C26491qj) {
            C04220Ms.A0B(str, 1);
            return C18180wK.A1V(str.equals("com.huawei.android.launcher") ? 1 : 0);
        } else if (this instanceof C26481qi) {
            AnonymousClass0wJ.A1N(context, str);
            if (!str.equals("com.hihonor.android.launcher") || !Boolean.parseBoolean(Settings.Global.getString(context.getContentResolver(), "msc.launcher.enable_number_badge")) || !C63173fJ.A05(AnonymousClass0TJ.A05, 18306052558690285L)) {
                return false;
            }
            return true;
        } else if (this instanceof C26551qp) {
            C26551qp r4 = (C26551qp) this;
            boolean A1Z = AnonymousClass0wJ.A1Z(context, str);
            if (!str.equals("com.htc.launcher")) {
                return false;
            }
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null) {
                FeatureInfo[] systemAvailableFeatures = packageManager2.getSystemAvailableFeatures();
                C04220Ms.A06(systemAvailableFeatures);
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    String str4 = featureInfo.name;
                    if (str4 != null && C18220wO.A1V("com.htc.software.Sense", A1Z ? 1 : 0, str4) == A1Z) {
                        Matcher matcher = C26551qp.A01.matcher(str4);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(A1Z);
                                if (group != null) {
                                    float parseFloat = Float.parseFloat(group);
                                    if (Float.valueOf(parseFloat) != null && parseFloat >= 4.0f) {
                                        r4.A00 = parseFloat;
                                        return A1Z;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (NumberFormatException unused2) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
            throw AnonymousClass0wJ.A0b();
        } else {
            boolean A1Y2 = AnonymousClass0wJ.A1Y(context, str);
            PackageManager packageManager3 = context.getPackageManager();
            if (packageManager3 == null) {
                return A1Y2;
            }
            if ("com.sec.android.app.launcher".equals(str)) {
                str2 = "com.sec.intent.action.BADGE_COUNT_UPDATE";
            } else {
                str2 = "android.intent.action.BADGE_COUNT_UPDATE";
            }
            List<ResolveInfo> queryBroadcastReceivers = packageManager3.queryBroadcastReceivers(C18250wR.A05(str2), A1Y2 ? 1 : 0);
            C04220Ms.A06(queryBroadcastReceivers);
            return C18190wL.A1a(queryBroadcastReceivers);
        }
    }

    public static final ComponentName A00(Context context) {
        String str;
        ComponentName component;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (str = component.getClassName()) == null || str.length() == 0) {
            str = "";
        }
        return new ComponentName(context, str);
    }

    public static void A01(Context context, BaseBundle baseBundle, int i) {
        baseBundle.putString("package", context.getPackageName());
        baseBundle.putString("class", A00(context).getClassName());
        baseBundle.putInt("badgenumber", i);
    }
}
