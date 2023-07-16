package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.facebook.redex.IDxCListenerShape538S0100000_1_I2;
import com.facebook.redex.IDxObjectShape796S0100000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3HV  reason: invalid class name */
public final class AnonymousClass3HV {
    public static AnonymousClass3HV A04;
    public List A00 = AnonymousClass0wJ.A0v();
    public List A01 = AnonymousClass0wJ.A0v();
    public List A02 = AnonymousClass0wJ.A0v();
    public List A03 = AnonymousClass0wJ.A0v();
    public List mFacebookAutoCompleteAccountList = AnonymousClass0wJ.A0v();

    public final void A00(Context context, C11630kW r13, C10300i6 r14, C145538kf r15, C85964w3 r16) {
        List list = this.A01;
        list.clear();
        C10300i6 r8 = r14;
        C63533hk.A02(r14).A0D(r14);
        Iterator A042 = C63533hk.A04(r14);
        while (A042.hasNext()) {
            list.add(new C27121s0(C18250wR.A0Q(A042)));
        }
        C85964w3 r10 = r16;
        A01(r14, r10);
        r15.schedule(new C25021la(context, r13, r8, r15, r10, this));
        AnonymousClass44X A002 = AnonymousClass44X.A00();
        if (AnonymousClass44X.A01(r14, A002, "ig_android_growth_fx_access_fb_ig_autocomplete")) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add(C63883iV.A0G(FxcalAccountType.FACEBOOK, A002.A03(r14, "ig_android_growth_fx_access_fb_ig_autocomplete"), A002.A02(r14, "ig_android_growth_fx_access_fb_ig_autocomplete")));
            C32165H8c A003 = C63883iV.A00(context, r14, "login", A0v);
            A003.A00 = new IDxACallbackShape15S0300000_1_I2(r14, r10, this, 10);
            r15.schedule(A003);
            return;
        }
        C38040KHr.A01.CWx(new AnonymousClass45H((String) null));
    }

    public final void A01(C10300i6 r7, C85964w3 r8) {
        AnonymousClass3CM r4;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        List list = this.A01;
        A0v.addAll(list);
        A0v2.addAll(list);
        for (C27141s2 r2 : this.mFacebookAutoCompleteAccountList) {
            if (r2 != null && TextUtils.equals(AnonymousClass44X.A00().A02(r7, "ig_android_growth_fx_access_fb_ig_autocomplete"), r2.A02)) {
                int indexOf = A0v.indexOf(r2);
                if (indexOf >= 0) {
                    A0v.set(indexOf, r2);
                } else {
                    A0v.add(r2);
                }
                A0v2.add(r2);
            }
        }
        for (Object next : this.A00) {
            if (A0v.indexOf(next) < 0) {
                A0v.add(next);
            }
            A0v2.add(next);
        }
        this.A02 = A0v;
        this.A03 = A0v2;
        if (r8 != null) {
            IDxObjectShape796S0100000_1_I2 iDxObjectShape796S0100000_1_I2 = (IDxObjectShape796S0100000_1_I2) r8;
            switch (iDxObjectShape796S0100000_1_I2.A01) {
                case 0:
                    return;
                case 1:
                    r4 = ((C57453Bc) iDxObjectShape796S0100000_1_I2.A00).A03;
                    break;
                default:
                    r4 = ((C566638b) iDxObjectShape796S0100000_1_I2.A00).A00;
                    break;
            }
            C18900y5 r3 = r4.A02;
            synchronized (r3) {
                List list2 = r3.A09;
                list2.clear();
                list2.addAll(A0v);
            }
            C14020og.A00(r3, 743264062);
            if (A0v.isEmpty()) {
                ArrayAdapter arrayAdapter = r4.A00;
                if (arrayAdapter != null && !arrayAdapter.isEmpty()) {
                    AutoCompleteTextView autoCompleteTextView = r4.A01;
                    autoCompleteTextView.setAdapter(r4.A00);
                    autoCompleteTextView.setOnItemClickListener((AdapterView.OnItemClickListener) null);
                    return;
                }
                return;
            }
            AutoCompleteTextView autoCompleteTextView2 = r4.A01;
            autoCompleteTextView2.setAdapter(r3);
            autoCompleteTextView2.setOnItemClickListener(new IDxCListenerShape538S0100000_1_I2(r4, 0));
            if (r4.A04 == AnonymousClass265.A1A) {
                r3.A02 = true;
            }
        }
    }
}
