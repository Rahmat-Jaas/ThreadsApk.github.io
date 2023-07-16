package com.instagram.urlhandlers.direct;

import X.AnonymousClass000;
import X.AnonymousClass0BO;
import X.AnonymousClass0wJ;
import X.AnonymousClass2MN;
import X.AnonymousClass2RP;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C18240wQ;
import X.C41060Lvg;
import X.C62333Yi;
import X.C63813iO;
import X.MMp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.realtimeclient.InAppNotificationDestinations;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DirectUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-784729631);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null || C18240wQ.A1T(A0C, "original_url")) {
            finish();
            i = -1713598885;
        } else {
            this.A00 = C18190wL.A0S(A0C);
            Uri A01 = C15430rJ.A01(A0C.getString("original_url"));
            if (A01 != null && "INSTAGRAM".equalsIgnoreCase(A01.getScheme())) {
                if (AnonymousClass000.A00(1252).equalsIgnoreCase(A01.getHost())) {
                    Intent data = C62333Yi.A00(this).setData(A01);
                    data.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
                    C10650ih.A02(this, data);
                    finish();
                    i = 1117598215;
                }
            }
            String host = A01.getHost();
            String queryParameter = A01.getQueryParameter("id");
            String queryParameter2 = A01.getQueryParameter("sender_id");
            if (host == null || !host.equalsIgnoreCase("direct-thread") || queryParameter == null || queryParameter2 == null) {
                finish();
                i = -942772653;
            } else {
                Bundle A06 = C18180wK.A06();
                A06.putString("id", queryParameter);
                A06.putString("sender_id", queryParameter2);
                A06.putString("destination_id", host);
                A06.putString("encoded_query", A01.getEncodedQuery());
                A0C.putAll(A06);
                UserSession A02 = C05030Qo.A02(this.A00);
                AnonymousClass0BO r11 = A02.multipleAccountHelper;
                String string = A0C.getString("id");
                String string2 = A0C.getString("sender_id");
                if (string2.equals(A02.getUserId())) {
                    C18240wQ.A0o();
                    throw null;
                }
                if (r11.A0G((String) null).contains(string2)) {
                    User A0E = r11.A0E(string2);
                    if (A0E != null && r11.A0N(this, A02, A0E)) {
                        List singletonList = Collections.singletonList(new PendingRecipient(new User(string, "")));
                        Uri.Builder authority = new Uri.Builder().scheme("ig").authority(InAppNotificationDestinations.DIRECT_ACTION);
                        if (singletonList != null) {
                            try {
                                StringWriter A0d = C18230wP.A0d();
                                MMp A0K = C18180wK.A0K(A0d);
                                Iterator A0t = C18190wL.A0t(A0K, "recipients", singletonList);
                                while (A0t.hasNext()) {
                                    PendingRecipient pendingRecipient = (PendingRecipient) A0t.next();
                                    if (pendingRecipient != null) {
                                        C41060Lvg.A00(A0K, pendingRecipient);
                                    }
                                }
                                A0K.A0F();
                                authority.appendQueryParameter("recipients", C18180wK.A0h(A0K, A0d));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if (!TextUtils.isEmpty((CharSequence) null)) {
                            authority.appendQueryParameter("prefill_text", (String) null);
                        }
                        Uri build = authority.build();
                        Intent A003 = C62333Yi.A00(this);
                        AnonymousClass2MN.A00(this, A003, build, string2, "DirectUrlHandler");
                        r11.A0H(this, A003, A02, A0E, "deep_link");
                    }
                } else if (AnonymousClass2RP.A00(A02)) {
                    A0C.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                    AnonymousClass3YR.A00(this, A0C, A02);
                } else {
                    C63813iO.A00(this, 2131830299);
                    finish();
                }
                i = 1117598215;
            }
        }
        C14030oh.A07(i, A002);
    }
}
