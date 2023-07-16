package X;

import android.content.Context;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Gu  reason: invalid class name and case insensitive filesystem */
public final class C121557Gu {
    public final Context A00;
    public final String A01;

    public C121557Gu(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public static List A00(Map map) {
        Object A0b;
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (Object next : new HashSet(AddressAutofillData.A00)) {
            List list = (List) map.get(next);
            if (!(list == null || list.isEmpty() || (A0b = C18240wQ.A0b(list)) == null)) {
                A0y.put(next, A0b);
            }
        }
        String A0f = C18240wQ.A0f("address-line1", A0y);
        Object obj = A0y.get("street-address");
        if (A0f != null) {
            StringBuilder A0s = C18190wL.A0s(A0f);
            String A0f2 = C18240wQ.A0f("address-line2", A0y);
            if (A0f2 != null && !A0f2.isEmpty()) {
                if (A0s.length() != 0) {
                    A0s.append(" ");
                }
                A0s.append(A0f2);
            }
            String A0f3 = C18240wQ.A0f("address-line3", A0y);
            if (A0f3 != null && !A0f3.isEmpty()) {
                if (A0s.length() != 0) {
                    A0s.append(" ");
                }
                A0s.append(A0f3);
            }
            A0y.put("street-address", A0s.toString());
        } else if (obj != null) {
            A0y.put("address-line1", obj);
            A0y.remove("address-line2");
            A0y.remove("address-line3");
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (!A0y.isEmpty()) {
            A0v.add(new AddressAutofillData((Map) A0y));
        }
        return A0v;
    }

    public static List A01(Map map) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = new HashSet(EmailAutofillData.A00).iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            List list = (List) map.get(A0k);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    A0v.add(new EmailAutofillData(A0k, C18180wK.A0k(it2)));
                }
            }
        }
        return A0v;
    }

    public static List A02(Map map) {
        Object A0b;
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (Object next : new HashSet(NameAutofillData.A00)) {
            List list = (List) map.get(next);
            if (!(list == null || list.isEmpty() || (A0b = C18240wQ.A0b(list)) == null)) {
                A0y.put(next, A0b);
            }
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (!A0y.isEmpty()) {
            A0v.add(new NameAutofillData((Map) A0y));
        }
        return A0v;
    }

    public final List A03(Map map) {
        StringBuilder A0s;
        Object obj;
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (Object next : new HashSet(TelephoneAutofillData.A01)) {
            List list = (List) map.get(next);
            if (list == null || list.isEmpty()) {
                obj = null;
            } else {
                obj = C18240wQ.A0b(list);
            }
            if (obj != null) {
                A0y.put(next, obj);
            }
        }
        String A0f = C18240wQ.A0f("tel", A0y);
        if (A0f == null) {
            String A0f2 = C18240wQ.A0f("tel-country-code", A0y);
            if (A0f2 == null) {
                A0s = C18200wM.A0r();
            } else {
                String replaceFirst = A0f2.replaceFirst("0*", "");
                if (!replaceFirst.isEmpty() && !replaceFirst.startsWith("+")) {
                    replaceFirst = AnonymousClass00U.A0L("+", replaceFirst);
                }
                A0s = C18190wL.A0s(replaceFirst);
            }
            String A0f3 = C18240wQ.A0f("tel-national", A0y);
            if (A0f3 == null) {
                String A0f4 = C18240wQ.A0f("tel-area-code", A0y);
                A0f3 = C18240wQ.A0f("tel-local", A0y);
                if (A0f4 == null || A0f3 == null) {
                    String A0f5 = C18240wQ.A0f("tel-local-prefix", A0y);
                    A0f3 = C18240wQ.A0f("tel-local-suffix", A0y);
                    if (!(A0f4 == null || A0f5 == null || A0f3 == null)) {
                        A0s.append(A0f4);
                        A0s.append(A0f5);
                    }
                    A0f = A0s.toString();
                } else {
                    A0s.append(A0f4);
                }
            }
            A0s.append(A0f3);
            A0f = A0s.toString();
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        PhoneNumberUtil A012 = PhoneNumberUtil.A01(this.A00);
        String str = this.A01;
        TelephoneAutofillData telephoneAutofillData = null;
        if (!C121687Hl.A03(A0f)) {
            try {
                C72344Np A0A = A012.A0A(A0f, str);
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                StringBuilder A0s2 = C86114wI.A0s(20);
                A0s2.setLength(0);
                int i = A0A.A00;
                A0s2.append(PhoneNumberUtil.A03(A0A));
                A0s2.insert(0, i);
                A0s2.insert(0, '+');
                String obj2 = A0s2.toString();
                String l = Long.toString(A0A.A02);
                A0y2.put("tel", obj2);
                A0y2.put("tel-country-code", Integer.toString(A0A.A00));
                A0y2.put("tel-national", l);
                if (!(!C121687Hl.A04(str, A012.A0B(A0A.A00)))) {
                    obj2 = l;
                }
                telephoneAutofillData = new TelephoneAutofillData(obj2, A0y2);
            } catch (C32122Ah unused) {
            }
        }
        if (telephoneAutofillData != null) {
            A0v.add(telephoneAutofillData);
        }
        return A0v;
    }
}
