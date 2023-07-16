package com.instagram.barcelona.handleractivity;

import X.AnonymousClass000;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18250wR;
import X.C28174Ezk;
import X.C28994Fff;
import X.C29252Fkw;
import X.C62333Yi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class BarcelonaShareHandlerActivity extends Activity {
    public final void onNewIntent(Intent intent) {
        C04220Ms.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    private final void A00() {
        Intent A00;
        Intent intent = getIntent();
        String action = intent.getAction();
        String A002 = AnonymousClass000.A00(22);
        if (!C04220Ms.A0I(action, A002) || !C04220Ms.A0I(intent.getType(), HTTP.PLAIN_TEXT_TYPE)) {
            boolean A0I = C04220Ms.A0I(action, A002);
            String A003 = AnonymousClass000.A00(291);
            if (A0I || C04220Ms.A0I(action, A003)) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                boolean A0I2 = C04220Ms.A0I(action, A003);
                String A004 = AnonymousClass000.A00(45);
                if (A0I2) {
                    Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra(A004);
                    if (parcelableArrayListExtra == null) {
                        parcelableArrayListExtra = AnonymousClass0ZV.A00;
                    }
                    A0v.addAll(parcelableArrayListExtra);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra(A004);
                    if (parcelableExtra != null) {
                        A0v.add(parcelableExtra);
                    }
                }
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C04220Ms.A04(next);
                    if (!next.equals(Uri.EMPTY)) {
                        try {
                            String canonicalPath = C29252Fkw.A00(getApplicationContext(), C15430rJ.A01(next.toString()), C28994Fff.CACHE_PATH, (String) null).getCanonicalPath();
                            if (canonicalPath != null) {
                                A0v2.add(canonicalPath);
                            }
                        } catch (IOException | SecurityException unused) {
                        }
                    }
                }
                if (C18250wR.A1K(A0v2)) {
                    A00 = C62333Yi.A00(this);
                    A00.putStringArrayListExtra(C28174Ezk.A00(322), A0v2);
                }
            }
            finish();
        }
        A00 = C62333Yi.A00(this);
        A00.putExtra(C28174Ezk.A00(323), intent.getStringExtra("android.intent.extra.TEXT"));
        C10650ih.A00.A07().A09(this, A00);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(873940283);
        super.onCreate(bundle);
        A00();
        C14030oh.A07(5735395, A00);
    }
}
