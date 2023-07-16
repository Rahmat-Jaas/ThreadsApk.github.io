package X;

import android.text.TextUtils;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4MM  reason: invalid class name */
public final class AnonymousClass4MM implements C33686HsX {
    public final /* synthetic */ AnonymousClass1XY A00;

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public AnonymousClass4MM(AnonymousClass1XY r1) {
        this.A00 = r1;
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String A02 = AnonymousClass0hA.A02(charSequence);
        C18780xt r5 = this.A00.A02;
        String lowerCase = A02.toLowerCase(Locale.getDefault());
        List list = r5.A01;
        list.clear();
        boolean isEmpty = TextUtils.isEmpty(lowerCase);
        ArrayList arrayList = r5.A00;
        if (isEmpty) {
            list.addAll(arrayList);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CountryCodeData countryCodeData = (CountryCodeData) it.next();
                if (AnonymousClass0hA.A06(0, countryCodeData.A01(), lowerCase) || AnonymousClass0hA.A06(0, countryCodeData.A01, lowerCase) || AnonymousClass0hA.A06(0, countryCodeData.A00(), lowerCase)) {
                    list.add(countryCodeData);
                }
            }
        }
        C14020og.A00(r5, -1075342464);
    }
}
