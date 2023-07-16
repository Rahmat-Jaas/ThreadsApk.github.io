package X;

import android.content.SharedPreferences;

/* renamed from: X.3G1  reason: invalid class name */
public final class AnonymousClass3G1 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final SharedPreferences A05;

    public final void A00() {
        C18190wL.A11(this.A05);
        this.A00 = "";
        this.A03 = "";
        this.A04 = "";
        this.A01 = "";
        this.A02 = "";
    }

    public AnonymousClass3G1(SharedPreferences sharedPreferences) {
        String str = "";
        String str2 = str;
        String string = sharedPreferences.getString("IG-U-IG-DIRECT-REGION-HINT", str);
        this.A00 = string != null ? string : str;
        String str3 = str2;
        String string2 = sharedPreferences.getString("IG-U-SHBID", str2);
        this.A03 = string2 != null ? string2 : str3;
        String str4 = str2;
        String string3 = sharedPreferences.getString("IG-U-SHBTS", str2);
        this.A04 = string3 != null ? string3 : str4;
        String str5 = str2;
        String string4 = sharedPreferences.getString("IG-U-DS-USER-ID", str2);
        this.A01 = string4 != null ? string4 : str5;
        String string5 = sharedPreferences.getString("IG-U-RUR", str2);
        this.A02 = string5 != null ? string5 : str2;
        this.A05 = sharedPreferences;
    }
}
