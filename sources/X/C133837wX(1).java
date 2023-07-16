package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.7wX  reason: invalid class name and case insensitive filesystem */
public final class C133837wX implements C82854qN {
    public final Callback A00;

    public final void CjW(CountryCodeData countryCodeData) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("country", countryCodeData.A00);
        writableNativeMap.putString("countryCode", countryCodeData.A01);
        this.A00.invoke(writableNativeMap);
    }

    public C133837wX(Callback callback) {
        this.A00 = callback;
    }
}
