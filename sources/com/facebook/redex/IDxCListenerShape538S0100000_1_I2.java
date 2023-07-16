package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1XY;
import X.AnonymousClass1ZH;
import X.AnonymousClass1dZ;
import X.AnonymousClass269;
import X.AnonymousClass3CM;
import X.AnonymousClass3HO;
import X.C09860go;
import X.C10300i6;
import X.C13330nS;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C63683i7;
import X.C82854qN;
import X.C84604tW;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.phonenumber.model.CountryCodeData;

public class IDxCListenerShape538S0100000_1_I2 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape538S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.A01) {
            case 0:
                AnonymousClass3CM r2 = (AnonymousClass3CM) this.A00;
                C09860go.A0I(view);
                r2.A03.Bj4((C84604tW) r2.A01.getAdapter().getItem(i));
                return;
            case 1:
                CountryCodeData countryCodeData = (CountryCodeData) adapterView.getItemAtPosition(i);
                AnonymousClass1XY r6 = (AnonymousClass1XY) this.A00;
                C82854qN r0 = r6.A01;
                if (!(r0 == null && (r0 = (C82854qN) r6.getTargetFragment()) == null)) {
                    r0.CjW(countryCodeData);
                }
                C10300i6 r8 = r6.A00;
                String A0n = AnonymousClass0wJ.A0n(r6.A03);
                String A012 = countryCodeData.A01();
                AnonymousClass0wJ.A1N(r8, A0n);
                double A002 = C18200wM.A00();
                double A003 = AnonymousClass269.A00();
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "register_country_code_selected"), 2620);
                AnonymousClass0wJ.A1B(A0I, A002, A003);
                C18180wK.A19(A0I);
                A0I.A0T("search_term", A0n);
                A0I.A0T("selected_country", A012);
                AnonymousClass269.A06(A0I, A003);
                C18190wL.A1I(A0I, "phone");
                C63683i7.A0A(A0I, r8);
                if (r6.isAdded()) {
                    r6.A07();
                    return;
                }
                return;
            default:
                AnonymousClass1dZ r3 = (AnonymousClass1dZ) this.A00;
                AnonymousClass1ZH r22 = new AnonymousClass1ZH();
                r22.A00 = (AnonymousClass3HO) r3.A00.getItem(i);
                AnonymousClass0wJ.A19(r22, r3.getActivity(), r3.A03);
                return;
        }
    }
}
