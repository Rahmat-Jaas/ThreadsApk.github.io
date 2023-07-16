package com.instagram.urlhandlers.infocenterfactexternal;

import X.AnonymousClass0LU;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LR;
import X.AnonymousClass4A9;
import X.C04690Os;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C12560m7;
import X.C130667qT;
import X.C13950oZ;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18190wL;
import X.C18330wh;
import X.C28174Ezk;
import X.C31155GhB;
import X.C63263h8;
import X.C65873w9;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import ch.boye.httpclientandroidlib.HttpHost;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape4S0400000_1_I2;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

public class InfoCenterFactExternalUrlHandlerActivity extends BaseFragmentActivity implements C11630kW {
    public C10300i6 A00;
    public UserSession A01;

    public final void A0D(Bundle bundle) {
    }

    public final String getModuleName() {
        return C28174Ezk.A00(602);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        int A002 = C14030oh.A00(-1622647775);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1371901064;
        } else {
            AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
            this.A00 = r1.A02(A0C);
            this.A01 = r1.A06(A0C);
            if (this.A00 != null) {
                try {
                    C18190wL.A0J().A00(this, getIntent(), (C16240si) null);
                    String A0i = C18190wL.A0i(A0C);
                    if (!TextUtils.isEmpty(A0i)) {
                        try {
                            Uri A012 = C15430rJ.A01(A0i);
                            String scheme = A012.getScheme();
                            if ("https".equalsIgnoreCase(scheme) || HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "instagram".equalsIgnoreCase(scheme)) {
                                String queryParameter = A012.getQueryParameter("params");
                                UserSession userSession = this.A01;
                                if (queryParameter != null) {
                                    try {
                                        HashMap A003 = AnonymousClass2LR.A00(C04690Os.A02.A04(userSession, queryParameter));
                                        if (A003 != null && !A003.isEmpty()) {
                                            C10300i6 r12 = this.A00;
                                            C18330wh A004 = C18330wh.A00(this);
                                            C13950oZ.A00(A004);
                                            C12560m7 supportFragmentManager = getSupportFragmentManager();
                                            supportFragmentManager.A0v(new C65873w9(this, supportFragmentManager, this));
                                            C130667qT A005 = C130667qT.A00((SparseArray) null, this, this, r12);
                                            AnonymousClass4A9 A006 = C63263h8.A00(r12, "com.instagram.stories.bloks_tappable_stickers.covid_fact.action", A003);
                                            A006.A00 = new IDxACallbackShape4S0400000_1_I2(supportFragmentManager, A005, A004, this);
                                            C31155GhB.A03(A006);
                                            i = -1773595305;
                                        }
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                            }
                        } catch (NullPointerException unused) {
                            str2 = "Error parsing uri with NullPointerException";
                            C10450iM.A03("INFO_CENTER_FACT", str2);
                            finish();
                            i = -1773595305;
                            C14030oh.A07(i, A002);
                        } catch (SecurityException unused2) {
                            str2 = "Error parsing uri with SecurityException";
                            C10450iM.A03("INFO_CENTER_FACT", str2);
                            finish();
                            i = -1773595305;
                            C14030oh.A07(i, A002);
                        }
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    str = "Security issue with caller";
                    AnonymousClass0LU.A0E("INFO_CENTER_FACT", str, e);
                    finish();
                    i = -1773595305;
                    C14030oh.A07(i, A002);
                } catch (IllegalStateException e3) {
                    e = e3;
                    str = "Failed to verify caller";
                    AnonymousClass0LU.A0E("INFO_CENTER_FACT", str, e);
                    finish();
                    i = -1773595305;
                    C14030oh.A07(i, A002);
                }
                finish();
                i = -1773595305;
            } else {
                finish();
                i = 2024786196;
            }
        }
        C14030oh.A07(i, A002);
    }
}
