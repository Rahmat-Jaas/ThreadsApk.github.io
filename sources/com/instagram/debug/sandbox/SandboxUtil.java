package com.instagram.debug.sandbox;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass3PE;
import X.AnonymousClass3h3;
import X.C04220Ms;
import X.C09120et;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C41026Luf;
import X.C83364rG;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class SandboxUtil {
    public static final SandboxUtil INSTANCE = new SandboxUtil();

    private final SearchEditText setup(SearchEditText searchEditText) {
        searchEditText.setSearchIconEnabled(false);
        searchEditText.setClearButtonEnabled(true);
        AnonymousClass3PE.A01(searchEditText);
        return searchEditText;
    }

    public static /* synthetic */ Dialog getSandboxDialog$default(Context context, C10300i6 r2, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return getSandboxDialog(context, r2, list);
    }

    private final String getFormattedText(EditText editText) {
        Editable text = editText.getText();
        C04220Ms.A06(text);
        int length = text.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1U = C18230wP.A1U(text.charAt(i2));
            if (z) {
                if (!A1U) {
                    break;
                }
                length--;
            } else if (!A1U) {
                z = true;
            } else {
                i++;
            }
        }
        String obj = text.subSequence(i, length + 1).toString();
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        return C18190wL.A0r(locale, obj);
    }

    public static final Dialog getSandboxDialog(Context context, C10300i6 r6, List list) {
        boolean A1Y = AnonymousClass0wJ.A1Y(context, r6);
        C09120et A0X = C18190wL.A0X();
        ViewGroup A0I = C18220wO.A0I(LayoutInflater.from(context), (ViewGroup) null, R.layout.layout_dev_host_options, A1Y);
        SandboxUtil sandboxUtil = INSTANCE;
        SearchEditText searchEditText = (SearchEditText) AnonymousClass0wJ.A0I(A0I, R.id.dev_server);
        sandboxUtil.setup(searchEditText);
        if (A0X.A0X()) {
            searchEditText.setText(C18200wM.A0j(A0X.A0d));
        }
        SearchEditText searchEditText2 = (SearchEditText) AnonymousClass0wJ.A0I(A0I, R.id.dev_mqtt_server);
        sandboxUtil.setup(searchEditText2);
        if (AnonymousClass0wJ.A1V(A0X.A1a)) {
            searchEditText2.setText(C18200wM.A0j(A0X.A1l));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18240wQ.A0x(A0I, it);
            }
        }
        C41026Luf luf = new C41026Luf(context);
        luf.A02(2131824948);
        luf.A07(A0I);
        luf.A03(new SandboxUtil$getSandboxDialog$4(A0I, A0X, context, r6), 2131826219);
        return luf.A00();
    }

    /* access modifiers changed from: private */
    public final void processDevServerChange(View view, C09120et r6) {
        C83364rG r1;
        String formattedText = getFormattedText((EditText) AnonymousClass0wJ.A0I(view, R.id.dev_server));
        int length = formattedText.length();
        AnonymousClass0wJ.A1L(r6.A1Z, C18180wK.A1X(length));
        if (length > 0) {
            String A03 = AnonymousClass3h3.A03(formattedText);
            C04220Ms.A06(A03);
            C18240wQ.A1D(r6.A0d, A03);
        }
        synchronized (AnonymousClass3h3.class) {
            AnonymousClass3h3.A00 = null;
        }
        Context context = view.getContext();
        if ((context instanceof C83364rG) && (r1 = (C83364rG) context) != null) {
            r1.Bti(r6);
        }
    }

    /* access modifiers changed from: private */
    public final void processMqttChange(View view, C09120et r7) {
        String formattedText = getFormattedText((EditText) AnonymousClass0wJ.A0I(view, R.id.dev_mqtt_server));
        int length = formattedText.length();
        AnonymousClass0wJ.A1L(r7.A1a, C18180wK.A1X(length));
        if (length > 0) {
            if (!C04220Ms.A0B(formattedText, 0)) {
                formattedText = AnonymousClass00U.A0L(formattedText, ".sb.facebook.com:8883");
            }
            C04220Ms.A0B(formattedText, 0);
            C18240wQ.A1D(r7.A1l, formattedText);
        }
    }
}
