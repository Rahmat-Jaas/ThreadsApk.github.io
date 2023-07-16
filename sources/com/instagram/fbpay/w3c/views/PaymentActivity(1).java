package com.instagram.fbpay.w3c.views;

import X.AnonymousClass00J;
import X.AnonymousClass0LU;
import X.AnonymousClass3VE;
import X.C04220Ms;
import X.C10300i6;
import X.C117036y1;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;

public final class PaymentActivity extends IgFragmentActivity {
    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18230wP.A0Z();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            setResult(i2, intent);
            finish();
        }
    }

    public final void onPostCreate(Bundle bundle) {
        Object obj;
        int i;
        String str;
        Bundle extras;
        ArrayList<String> stringArrayList;
        String str2;
        Bundle extras2;
        ArrayList<String> stringArrayList2;
        super.onPostCreate(bundle);
        boolean A01 = ((AnonymousClass3VE) C117036y1.A00().A03.getValue()).A01(this, getIntent());
        Intent intent = getIntent();
        if (intent == null || (extras2 = intent.getExtras()) == null || (stringArrayList2 = extras2.getStringArrayList("methodNames")) == null) {
            obj = null;
        } else {
            obj = AnonymousClass00J.A0D(stringArrayList2);
        }
        if (!C04220Ms.A0I(obj, "https://www.facebook.com/basiccard") || !A01) {
            StringBuilder A0s = C18190wL.A0s("Cannot process card for Payment method ");
            Intent intent2 = getIntent();
            if (intent2 == null || (extras = intent2.getExtras()) == null || (stringArrayList = extras.getStringArrayList("methodNames")) == null) {
                str = null;
            } else {
                str = (String) AnonymousClass00J.A0D(stringArrayList);
            }
            A0s.append(str);
            A0s.append(". isCallerAppTrusted = ");
            A0s.append(A01);
            AnonymousClass0LU.A0B("PaymentActivity", A0s.toString());
            i = 0;
        } else {
            Bundle A0C = C18190wL.A0C(this);
            Parcelable parcelable = null;
            if (A0C != null) {
                str2 = A0C.getString("keyCredentialId");
            } else {
                str2 = null;
            }
            Bundle A0C2 = C18190wL.A0C(this);
            if (A0C2 != null) {
                parcelable = A0C2.getParcelable("keyAuthFlow");
            }
            Bundle A06 = C18180wK.A06();
            A06.putString("keyCredentialId", str2);
            A06.putParcelable("keyAuthFlow", parcelable);
            i = 0;
            if (!(str2 == null || str2.length() == 0)) {
                Intent intent3 = new Intent(this, DemaskCardActivity.class);
                intent3.putExtras(A06);
                startActivityForResult(intent3, 100);
                return;
            }
        }
        finishActivity(i);
    }
}
