package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass3GH;
import X.AnonymousClass3IC;
import X.AnonymousClass3Ie;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C34640IcN;
import X.C61823Vx;
import X.C62993bH;
import X.C67603zp;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;

public class MobileConfigRolloutDiagFragment extends C34640IcN implements C82034oy {
    public final HashMap mDeviceInfo = AnonymousClass0wJ.A0y();
    public C67603zp mDeviceMC;
    public AnonymousClass3Ie mDeviceQEManager;
    public TextView mTextView;
    public final HashMap mUserInfo = AnonymousClass0wJ.A0y();
    public C67603zp mUserMC;
    public AnonymousClass3Ie mUserQEManager;
    public UserSession mUserSession;

    public String getModuleName() {
        return "mobile_config_rollout_diag";
    }

    public static void appendKeyValue(StringBuilder sb, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = "null";
        }
        sb.append(AnonymousClass00U.A0h("<b>", str, "</b>: ", str2, "<br/>"));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setContent() {
        /*
            r7 = this;
            X.3Ie r2 = r7.mDeviceQEManager
            X.3zp r1 = r7.mDeviceMC
            java.util.HashMap r0 = r7.mDeviceInfo
            r7.fillInfo(r2, r1, r0)
            X.3Ie r2 = r7.mUserQEManager
            X.3zp r1 = r7.mUserMC
            java.util.HashMap r0 = r7.mUserInfo
            r7.fillInfo(r2, r1, r0)
            java.lang.String r0 = "<h2>User</h2>"
            java.lang.StringBuilder r2 = X.C18190wL.A0s(r0)
            java.util.HashMap r0 = r7.mUserInfo
            java.util.Iterator r3 = X.C18190wL.A0u(r0)
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.Object r0 = r0.getValue()
            appendKeyValue(r2, r1, r0)
            goto L_0x001e
        L_0x0034:
            java.lang.String r0 = "<h2>Device</h2>"
            r2.append(r0)
            java.util.HashMap r0 = r7.mDeviceInfo
            java.util.Iterator r3 = X.C18190wL.A0u(r0)
        L_0x003f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0055
            java.util.Map$Entry r0 = X.C18180wK.A0o(r3)
            java.lang.String r1 = X.C18200wM.A0p(r0)
            java.lang.Object r0 = r0.getValue()
            appendKeyValue(r2, r1, r0)
            goto L_0x003f
        L_0x0055:
            java.lang.String r0 = "<h2>Overrides</h2>"
            r2.append(r0)
            com.instagram.service.session.UserSession r0 = r7.mUserSession
            com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore r0 = com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager.getOverrideStore(r0)
            java.lang.String r1 = X.C18210wN.A0e(r0)
            java.lang.String r0 = "Override store class"
            appendKeyValue(r2, r0, r1)
            X.3zp r0 = r7.mUserMC
            java.io.File r1 = r0.A07
            java.lang.String r0 = "MC folder"
            appendKeyValue(r2, r0, r1)
            X.3zp r0 = r7.mUserMC
            java.io.File r3 = r0.A07
            java.lang.String r0 = "mobileconfig"
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            java.lang.String r0 = "mc_overrides.json"
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r0)
            boolean r0 = r6.exists()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "Has overrides file"
            appendKeyValue(r2, r0, r1)
            boolean r0 = X.C67653zu.A0A
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "MobileConfigJavaOverridesTable.hasOverridesFile"
            appendKeyValue(r2, r0, r1)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x00dd
            java.lang.StringBuilder r5 = X.C18200wM.A0r()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00c8 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00c8 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00c8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00c8 }
        L_0x00b0:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00bf
            r5.append(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x00b0
        L_0x00bf:
            r1.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00d4
        L_0x00c3:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            throw r0     // Catch:{ IOException -> 0x00c8 }
        L_0x00c8:
            r4 = move-exception
            java.lang.String r3 = "MobileConfigFilesOnDiskUtils"
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "Failed to read file %s"
            X.AnonymousClass0LU.A0K(r3, r0, r4, r1)
        L_0x00d4:
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "Content"
            appendKeyValue(r2, r0, r1)
        L_0x00dd:
            java.lang.String r0 = "<h2>FDID</h2>"
            r2.append(r0)
            X.3zp r0 = r7.mDeviceMC
            X.3Iv r0 = r0.A06()
            com.facebook.mobileconfig.MobileConfigManagerHolderImpl r0 = X.AnonymousClass19e.A00(r0)
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = r0.getFamilyDeviceId()
        L_0x00f2:
            java.lang.String r0 = "From current MC manager"
            appendKeyValue(r2, r0, r1)
            X.0nL r0 = X.C10260hz.A00
            X.3FH r0 = X.C18220wO.A0N(r0)
            if (r0 != 0) goto L_0x0114
            java.lang.String r1 = ""
        L_0x0101:
            java.lang.String r0 = "From current InstagramPhoneIdStore"
            appendKeyValue(r2, r0, r1)
            android.widget.TextView r1 = r7.mTextView
            java.lang.String r0 = r2.toString()
            android.text.Spanned r0 = X.C16370sw.A03(r0)
            r1.setText(r0)
            return
        L_0x0114:
            java.lang.String r1 = r0.A01
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            goto L_0x0101
        L_0x011d:
            java.lang.String r1 = "(null_manager)"
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.MobileConfigRolloutDiagFragment.setContent():void");
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A08(r2, "MobileConfig Rollout Diagnose");
    }

    public C10300i6 getSession() {
        return this.mUserSession;
    }

    private void fillInfo(AnonymousClass3Ie r6, C67603zp r7, HashMap hashMap) {
        AnonymousClass3IC A09 = r7.A09();
        if (A09 != null) {
            hashMap.put("params map configs", Integer.valueOf(A09.A02().size()));
            int i = 0;
            List<AnonymousClass3GH> list = A09.A03;
            for (AnonymousClass3GH r1 : list) {
                if (C62993bH.A03(r1.A00) && C62993bH.A03(r1.A01)) {
                    i++;
                }
            }
            hashMap.put("params map names", AnonymousClass00U.A0K("/", i, list.size()));
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-281987837);
        super.onCreate(bundle);
        this.mUserSession = C18180wK.A0V(this.mArguments);
        C61823Vx r1 = C61823Vx.A01;
        this.mDeviceQEManager = r1.A03();
        AnonymousClass3Ie A04 = r1.A04(this.mUserSession);
        this.mUserQEManager = A04;
        this.mDeviceMC = this.mDeviceQEManager.A01.A00;
        this.mUserMC = A04.A01.A00;
        C14030oh.A09(-562861528, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(984163279);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setPadding(25, 10, 25, 10);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        this.mTextView = textView;
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setContent();
        linearLayout.addView(this.mTextView);
        scrollView.addView(linearLayout);
        C14030oh.A09(1515200521, A02);
        return scrollView;
    }
}
