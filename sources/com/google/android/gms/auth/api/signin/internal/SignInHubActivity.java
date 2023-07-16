package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass06E;
import X.AnonymousClass7HJ;
import X.AnonymousClass83q;
import X.C1199977y;
import X.C124957c1;
import X.C13320nQ;
import X.C14030oh;
import X.C18230wP;
import X.C18250wR;
import X.C86114wI;
import X.C86164wN;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    private final void A00(int i) {
        Status status = new Status(i, (String) null);
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("googleSignInStatus", status);
        setResult(0, A0B);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A02) != null) {
                        C1199977y A002 = C1199977y.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            AnonymousClass7HJ r4 = A002.A02;
                            C13320nQ.A01(googleSignInOptions);
                            String str = googleSignInAccount.A07;
                            r4.A05("defaultGoogleSignInAccount", str);
                            C13320nQ.A01(googleSignInOptions);
                            String A012 = AnonymousClass7HJ.A01("googleSignInAccount", str);
                            JSONObject A0y = C18230wP.A0y();
                            try {
                                String str2 = googleSignInAccount.A02;
                                if (str2 != null) {
                                    A0y.put("id", str2);
                                }
                                String str3 = googleSignInAccount.A03;
                                if (str3 != null) {
                                    A0y.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A04;
                                if (str4 != null) {
                                    A0y.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A05;
                                if (str5 != null) {
                                    A0y.put("displayName", str5);
                                }
                                String str6 = googleSignInAccount.A08;
                                if (str6 != null) {
                                    A0y.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A09;
                                if (str7 != null) {
                                    A0y.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A01;
                                if (uri != null) {
                                    C86164wN.A1H(uri, "photoUrl", A0y);
                                }
                                String str8 = googleSignInAccount.A06;
                                if (str8 != null) {
                                    A0y.put("serverAuthCode", str8);
                                }
                                A0y.put("expirationTime", googleSignInAccount.A00);
                                A0y.put("obfuscatedIdentifier", str);
                                JSONArray A0i = C18250wR.A0i();
                                List list = googleSignInAccount.A0A;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, AnonymousClass83q.A00);
                                for (Scope scope : scopeArr) {
                                    A0i.put(scope.A01);
                                }
                                A0y.put("grantedScopes", A0i);
                                A0y.remove("serverAuthCode");
                                r4.A05(A012, A0y.toString());
                                String A013 = AnonymousClass7HJ.A01("googleSignInOptions", str);
                                JSONObject A0y2 = C18230wP.A0y();
                                try {
                                    JSONArray A0i2 = C18250wR.A0i();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0B);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        A0i2.put(((Scope) it.next()).A01);
                                    }
                                    A0y2.put("scopes", A0i2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A0y2.put("accountName", account.name);
                                    }
                                    A0y2.put("idTokenRequested", googleSignInOptions.A05);
                                    A0y2.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A0y2.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A0y2.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A0y2.put("hostedDomain", str10);
                                    }
                                    r4.A05(A013, A0y2.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = C86114wI.A0k(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = C86114wI.A0k(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        AnonymousClass06E.A00(this).A02((Bundle) null, new C124957c1(this), 0);
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i3 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A00(i3);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String packageName;
        int A002 = C14030oh.A00(-1639906415);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action != null) {
            if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
                A00(12500);
                i2 = -1030414423;
            } else {
                boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
                if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                    Bundle bundleExtra = intent.getBundleExtra(DexStore.CONFIG_FILENAME);
                    if (bundleExtra != null) {
                        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(DexStore.CONFIG_FILENAME);
                        if (signInConfiguration == null) {
                            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                            setResult(0);
                            finish();
                            i2 = -677715940;
                        } else {
                            this.A02 = signInConfiguration;
                            if (bundle != null) {
                                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                                this.A04 = z;
                                if (z) {
                                    this.A00 = bundle.getInt("signInResultCode");
                                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                                    if (intent2 != null) {
                                        this.A01 = intent2;
                                        AnonymousClass06E.A00(this).A02((Bundle) null, new C124957c1(this), 0);
                                        A05 = false;
                                        i2 = 1417466859;
                                    } else {
                                        i = -1314743039;
                                    }
                                } else {
                                    i2 = -541711958;
                                }
                            } else if (A05) {
                                setResult(0);
                                A00(12502);
                                i2 = -1680183990;
                            } else {
                                A05 = true;
                                Intent A052 = C18250wR.A05(action);
                                if (equals) {
                                    packageName = "com.google.android.gms";
                                } else {
                                    packageName = getPackageName();
                                }
                                A052.setPackage(packageName);
                                A052.putExtra(DexStore.CONFIG_FILENAME, this.A02);
                                try {
                                    startActivityForResult(A052, 40962);
                                } catch (ActivityNotFoundException unused) {
                                    this.A03 = true;
                                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                                    A00(17);
                                }
                                i2 = -1174643578;
                            }
                        }
                    } else {
                        i = -812549903;
                    }
                } else {
                    Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
                    finish();
                    i2 = -417818207;
                }
            }
            C14030oh.A07(i2, A002);
            return;
        }
        i = -1067329039;
        C14030oh.A07(i, A002);
        throw null;
    }

    public final void onDestroy() {
        int A002 = C14030oh.A00(641151584);
        super.onDestroy();
        A05 = false;
        C14030oh.A07(489646596, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
