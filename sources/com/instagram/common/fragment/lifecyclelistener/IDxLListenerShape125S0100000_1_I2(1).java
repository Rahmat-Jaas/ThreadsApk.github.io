package com.instagram.common.fragment.lifecyclelistener;

import X.AnonymousClass3ZB;
import X.C19819BBt;

public class IDxLListenerShape125S0100000_1_I2 extends C19819BBt {
    public Object A00;
    public final int A01;

    public IDxLListenerShape125S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.355} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.356} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.3G9] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r3.A03 != null) goto L_0x0085;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r2 = r17
            int r1 = r2.A01
            r4 = r18
            r0 = r19
            r7 = r20
            if (r1 == 0) goto L_0x0010
            super.onActivityResult(r4, r0, r7)
            return
        L_0x0010:
            java.lang.Object r1 = r2.A00
            X.3YF r1 = (X.AnonymousClass3YF) r1
            java.util.List r5 = r1.A04
            monitor-enter(r5)
            r9 = 0
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x019e }
        L_0x001c:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x0199
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x019e }
            X.357 r2 = (X.AnonymousClass357) r2     // Catch:{ all -> 0x019e }
            int r1 = r2.A00     // Catch:{ all -> 0x019e }
            if (r4 != r1) goto L_0x001c
            boolean r1 = r2 instanceof X.C26981ra     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x00a6
            r6 = r2
            X.1ra r6 = (X.C26981ra) r6     // Catch:{ all -> 0x019e }
            r1 = 0
            if (r20 == 0) goto L_0x0059
            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x0059
            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "com.google.android.gms.credentials.Credential"
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x0059
            android.os.Bundle r3 = r7.getExtras()     // Catch:{ all -> 0x019e }
            android.os.Parcelable r3 = r3.getParcelable(r4)     // Catch:{ all -> 0x019e }
            com.google.android.gms.auth.api.credentials.Credential r3 = (com.google.android.gms.auth.api.credentials.Credential) r3     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x0059
            X.355 r9 = new X.355     // Catch:{ all -> 0x019e }
            r9.<init>(r3)     // Catch:{ all -> 0x019e }
        L_0x0059:
            boolean r3 = r6.A04     // Catch:{ all -> 0x019e }
            if (r3 != 0) goto L_0x006a
            X.0i6 r4 = r6.A00     // Catch:{ all -> 0x019e }
            X.265 r3 = r6.A03     // Catch:{ all -> 0x019e }
            if (r9 == 0) goto L_0x0067
            com.google.android.gms.auth.api.credentials.Credential r1 = r9.A00     // Catch:{ all -> 0x019e }
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x019e }
        L_0x0067:
            X.AnonymousClass3YF.A00(r4, r3, r1, r0)     // Catch:{ all -> 0x019e }
        L_0x006a:
            r4 = 0
            if (r9 == 0) goto L_0x0077
            com.google.android.gms.auth.api.credentials.Credential r3 = r9.A00     // Catch:{ all -> 0x019e }
            java.lang.String r1 = r3.A01     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x019e }
            if (r1 != 0) goto L_0x0085
        L_0x0077:
            X.3aj r1 = X.C62783aj.getInstance()     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x0085
            X.3aj r1 = X.C62783aj.getInstance()     // Catch:{ all -> 0x019e }
            com.instagram.login.smartlock.impl.SmartLockPluginImpl r1 = (com.instagram.login.smartlock.impl.SmartLockPluginImpl) r1     // Catch:{ all -> 0x019e }
            r1.A00 = r4     // Catch:{ all -> 0x019e }
        L_0x0085:
            X.356 r11 = new X.356     // Catch:{ all -> 0x019e }
            r11.<init>(r9)     // Catch:{ all -> 0x019e }
            X.4tD r1 = r6.A02     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x00a2
            if (r19 != 0) goto L_0x0095
            r1.Bgj()     // Catch:{ all -> 0x019e }
            goto L_0x0198
        L_0x0095:
            if (r9 == 0) goto L_0x009d
            com.google.android.gms.auth.api.credentials.Credential r0 = r9.A00     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x00a2
        L_0x009d:
            r1.Bhv()     // Catch:{ all -> 0x019e }
            goto L_0x0198
        L_0x00a2:
            X.4q4 r0 = r6.A01     // Catch:{ all -> 0x019e }
            goto L_0x0195
        L_0x00a6:
            boolean r1 = r2 instanceof X.C26971rZ     // Catch:{ all -> 0x019e }
            if (r1 == 0) goto L_0x0127
            r1 = r2
            X.1rZ r1 = (X.C26971rZ) r1     // Catch:{ all -> 0x019e }
            X.3aj r3 = X.C62783aj.getInstance()     // Catch:{ all -> 0x019e }
            r4 = 1
            if (r3 == 0) goto L_0x00bc
            X.3aj r3 = X.C62783aj.getInstance()     // Catch:{ all -> 0x019e }
            com.instagram.login.smartlock.impl.SmartLockPluginImpl r3 = (com.instagram.login.smartlock.impl.SmartLockPluginImpl) r3     // Catch:{ all -> 0x019e }
            r3.A00 = r4     // Catch:{ all -> 0x019e }
        L_0x00bc:
            r3 = -1
            if (r0 != r3) goto L_0x00cc
            android.content.SharedPreferences r6 = X.C18200wM.A0C()     // Catch:{ all -> 0x019e }
            android.content.SharedPreferences$Editor r7 = r6.edit()     // Catch:{ all -> 0x019e }
            java.lang.String r6 = "preference_smartlock_credential_have_been_saved"
            X.AnonymousClass0wJ.A13(r7, r6, r4)     // Catch:{ all -> 0x019e }
        L_0x00cc:
            boolean r6 = r1.A03     // Catch:{ all -> 0x019e }
            if (r6 == 0) goto L_0x00ee
            if (r0 != r3) goto L_0x00eb
            X.0i6 r10 = r1.A00     // Catch:{ all -> 0x019e }
            r6 = 0
            X.C04220Ms.A0B(r10, r6)     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "login_smartlock_save_impression_save_clicked"
            java.lang.String r12 = "login_smart_lock"
            java.lang.String r13 = "smartlock"
            r14 = r9
            r15 = r9
            r16 = r9
            X.AnonymousClass3LL.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "login_smartlock_save_success"
            X.AnonymousClass3LL.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x019e }
            goto L_0x011a
        L_0x00eb:
            if (r19 != 0) goto L_0x011a
            goto L_0x0107
        L_0x00ee:
            X.0i6 r7 = r1.A00     // Catch:{ all -> 0x019e }
            X.265 r6 = r1.A02     // Catch:{ all -> 0x019e }
            if (r6 != 0) goto L_0x00f6
            r8 = 0
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r8 = r6.A01     // Catch:{ all -> 0x019e }
        L_0x00f8:
            boolean r11 = X.AnonymousClass0wJ.A1T(r0, r3)     // Catch:{ all -> 0x019e }
            r6 = 0
            X.C04220Ms.A0B(r7, r6)     // Catch:{ all -> 0x019e }
            r10 = 48
            r12 = r4
            X.C63523hf.A04(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x019e }
            goto L_0x011a
        L_0x0107:
            X.0i6 r10 = r1.A00     // Catch:{ all -> 0x019e }
            r6 = 0
            X.C04220Ms.A0B(r10, r6)     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "login_smartlock_save_impression_save_cancelled"
            java.lang.String r12 = "login_smart_lock"
            java.lang.String r13 = "smartlock"
            r14 = r9
            r15 = r9
            r16 = r9
            X.AnonymousClass3LL.A00(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x019e }
        L_0x011a:
            X.4q4 r1 = r1.A01     // Catch:{ all -> 0x019e }
            if (r0 == r3) goto L_0x011f
            r4 = 0
        L_0x011f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x019e }
            r1.BrJ(r0)     // Catch:{ all -> 0x019e }
            goto L_0x0198
        L_0x0127:
            r4 = r2
            X.1rY r4 = (X.C26961rY) r4     // Catch:{ all -> 0x019e }
            r11 = 0
            r3 = -1
            if (r0 != r3) goto L_0x018c
            if (r20 == 0) goto L_0x018c
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "com.google.android.gms.credentials.Credential"
            android.os.Parcelable r1 = r1.getParcelable(r0)     // Catch:{ all -> 0x019e }
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1     // Catch:{ all -> 0x019e }
            java.lang.String r6 = r1.A01     // Catch:{ all -> 0x019e }
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ all -> 0x019e }
            boolean r0 = X.C18240wQ.A1V(r6, r0)     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0148
            r8 = r6
            goto L_0x0152
        L_0x0148:
            java.util.regex.Pattern r0 = android.util.Patterns.PHONE     // Catch:{ all -> 0x019e }
            boolean r0 = X.C18240wQ.A1V(r6, r0)     // Catch:{ all -> 0x019e }
            r8 = r9
            if (r0 == 0) goto L_0x0152
            r9 = r6
        L_0x0152:
            java.util.List r0 = r1.A07     // Catch:{ all -> 0x019e }
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x019e }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x019e }
        L_0x015c:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x019e }
            com.google.android.gms.auth.api.credentials.IdToken r0 = (com.google.android.gms.auth.api.credentials.IdToken) r0     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x019e }
            r12.add(r0)     // Catch:{ all -> 0x019e }
            goto L_0x015c
        L_0x016e:
            java.lang.String r10 = r1.A02     // Catch:{ all -> 0x019e }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0178
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x019e }
        L_0x0178:
            java.lang.String r13 = r1.A04     // Catch:{ all -> 0x019e }
            java.lang.String r14 = r1.A05     // Catch:{ all -> 0x019e }
            java.lang.String r15 = r1.A06     // Catch:{ all -> 0x019e }
            X.3G9 r7 = new X.3G9     // Catch:{ all -> 0x019e }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x019e }
            X.0i6 r1 = r4.A00     // Catch:{ all -> 0x019e }
            X.265 r0 = r4.A02     // Catch:{ all -> 0x019e }
            X.AnonymousClass3YF.A00(r1, r0, r6, r3)     // Catch:{ all -> 0x019e }
            r11 = r7
            goto L_0x0193
        L_0x018c:
            X.0i6 r3 = r4.A00     // Catch:{ all -> 0x019e }
            X.265 r1 = r4.A02     // Catch:{ all -> 0x019e }
            X.AnonymousClass3YF.A00(r3, r1, r9, r0)     // Catch:{ all -> 0x019e }
        L_0x0193:
            X.4q4 r0 = r4.A01     // Catch:{ all -> 0x019e }
        L_0x0195:
            r0.BrJ(r11)     // Catch:{ all -> 0x019e }
        L_0x0198:
            r9 = r2
        L_0x0199:
            r5.remove(r9)     // Catch:{ all -> 0x019e }
            monitor-exit(r5)     // Catch:{ all -> 0x019e }
            return
        L_0x019e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x019e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape125S0100000_1_I2.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroy() {
        if (1 - this.A01 != 0) {
            super.onDestroy();
            return;
        }
        AnonymousClass3ZB r1 = (AnonymousClass3ZB) this.A00;
        r1.A0E.dismiss();
        r1.A00 = null;
    }
}
