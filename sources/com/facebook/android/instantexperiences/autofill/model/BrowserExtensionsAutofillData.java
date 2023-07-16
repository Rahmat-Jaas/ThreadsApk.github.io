package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass7CU;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C86144wL;
import X.C86164wN;
import android.os.Parcel;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class BrowserExtensionsAutofillData implements FbAutofillData {
    public Map A00;

    public final boolean BYu(FbAutofillData fbAutofillData) {
        BrowserExtensionsAutofillData browserExtensionsAutofillData;
        if (fbAutofillData != null && getClass().equals(fbAutofillData.getClass()) && (browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData) != null && this.A00.size() <= browserExtensionsAutofillData.A00.size()) {
            Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object key = A0o.getKey();
                String A0u = C18230wP.A0u(A0o);
                Object obj = browserExtensionsAutofillData.A00.get(key);
                if (A0u == null || (obj != null && A0u.equals(obj))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
            if (this.A00.size() == browserExtensionsAutofillData.A00.size()) {
                Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
                while (true) {
                    boolean z = true;
                    if (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        Object key = A0o.getKey();
                        String A0u = C18230wP.A0u(A0o);
                        Object obj2 = browserExtensionsAutofillData.A00.get(key);
                        boolean A1W = AnonymousClass0wJ.A1W(A0u);
                        if (obj2 == null) {
                            z = false;
                        }
                        if ((z ^ A1W) || (A0u != null && obj2 != null && !A0u.equals(obj2))) {
                            break;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String A01() {
        if (this instanceof TelephoneAutofillData) {
            return ((TelephoneAutofillData) this).A00;
        }
        if (this instanceof NameAutofillData) {
            if (!AnonymousClass7CU.A00(C18220wO.A0r(FXPFAccessLibraryDebugFragment.NAME, this.A00))) {
                return C18220wO.A0r(FXPFAccessLibraryDebugFragment.NAME, this.A00);
            }
            String A0r = C18220wO.A0r("given-name", this.A00);
            if (A0r == null) {
                A0r = "";
            }
            String A0r2 = C18220wO.A0r("family-name", this.A00);
            if (A0r2 == null) {
                A0r2 = "";
            }
            return AnonymousClass00U.A0V(A0r, " ", A0r2).trim();
        } else if (this instanceof EmailAutofillData) {
            Map map = this.A00;
            return C18220wO.A0r(C18220wO.A0x(map).next(), map);
        } else {
            StringBuilder A0r3 = C18200wM.A0r();
            if (!AddressAutofillData.A00(C18220wO.A0r("street-address", this.A00), A0r3)) {
                AddressAutofillData.A00(C18220wO.A0r("address-line1", this.A00), A0r3);
                AddressAutofillData.A00(C18220wO.A0r("address-line2", this.A00), A0r3);
                AddressAutofillData.A00(C18220wO.A0r("address-line3", this.A00), A0r3);
            }
            AddressAutofillData.A00(C18220wO.A0r("address-level4", this.A00), A0r3);
            AddressAutofillData.A00(C18220wO.A0r("address-level3", this.A00), A0r3);
            AddressAutofillData.A00(C18220wO.A0r("address-level2", this.A00), A0r3);
            AddressAutofillData.A00(C18220wO.A0r("address-level1", this.A00), A0r3);
            AddressAutofillData.A00(C18220wO.A0r("postal-code", this.A00), A0r3);
            if (!AddressAutofillData.A00(C18220wO.A0r("country", this.A00), A0r3)) {
                AddressAutofillData.A00(C18220wO.A0r("country-name", this.A00), A0r3);
            }
            return A0r3.toString();
        }
    }

    public final Map ASM() {
        if (this instanceof TelephoneAutofillData) {
            return C86164wN.A0j(this.A00);
        }
        if (!(this instanceof NameAutofillData)) {
            return C86164wN.A0j(this.A00);
        }
        HashMap A0j = C86164wN.A0j(this.A00);
        Iterator it = new LinkedList(A0j.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String A0f = C18240wQ.A0f(next, A0j);
            if (A0f == null || A0f.isEmpty()) {
                A0j.remove(next);
            }
        }
        return A0j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("autocomplete_data")) != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                this.A00.put(A0k, optJSONObject.optString(A0k));
            }
        }
    }

    public final Map A02(Set set) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(this.A00);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            if (set.contains(key)) {
                C86144wL.A1P(key, A0y, A0o);
            }
        }
        return A0y;
    }

    public JSONObject A03() {
        JSONObject A0y = C18230wP.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(ASM());
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0y.put(C18200wM.A0p(A0o), A0o.getValue());
        }
        JSONObject A0y2 = C18230wP.A0y();
        A0y2.put("autocomplete_data", A0y);
        return A0y2;
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
    }

    public BrowserExtensionsAutofillData(Map map) {
        this.A00 = map;
    }

    public BrowserExtensionsAutofillData() {
        this.A00 = AnonymousClass0wJ.A0y();
    }
}
