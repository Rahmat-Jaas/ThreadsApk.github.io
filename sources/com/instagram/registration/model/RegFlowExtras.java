package com.instagram.registration.model;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2TX;
import X.AnonymousClass3V3;
import X.C09140ev;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C18240wQ;
import X.C28174Ezk;
import X.C313625r;
import X.C569038z;
import X.C58603Gk;
import X.C62663aU;
import X.C63383hO;
import X.H1T;
import X.MMp;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegFlowExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(29);
    public long A00;
    public CountryCodeData A01;
    public C58603Gk A02;
    public UserBirthDate A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public List A0e;
    public List A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l = false;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t = false;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;

    public final C313625r A01() {
        try {
            String str = this.A0S;
            if (str != null) {
                return C313625r.valueOf(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Integer A02() {
        try {
            String str = this.A0V;
            if (str != null) {
                if (str.equals("EMAIL")) {
                    return AnonymousClass006.A00;
                }
                if (str.equals("PHONE_REG")) {
                    return AnonymousClass006.A01;
                }
                if (str.equals("MAIN_ACCOUNT")) {
                    return AnonymousClass006.A0C;
                }
                if (str.equals("SIMPLE_SAC")) {
                    return AnonymousClass006.A0N;
                }
                if (str.equals("ADD_PHONE")) {
                    return AnonymousClass006.A0Y;
                }
                if (str.equals("SAC_CAL")) {
                    return AnonymousClass006.A0j;
                }
                if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    return AnonymousClass006.A0u;
                }
                throw C18190wL.A0a(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr;
        ArrayList arrayList;
        int i2;
        String str;
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0X);
        parcel.writeLong(this.A00);
        parcel.writeByte(this.A0m ? (byte) 1 : 0);
        parcel.writeByte(this.A0z ? (byte) 1 : 0);
        parcel.writeByte(this.A0h ? (byte) 1 : 0);
        parcel.writeByte(this.A0p ? (byte) 1 : 0);
        parcel.writeByte(this.A0v ? (byte) 1 : 0);
        parcel.writeByte(this.A0g ? (byte) 1 : 0);
        parcel.writeByte(this.A11 ? (byte) 1 : 0);
        parcel.writeByte(this.A0r ? (byte) 1 : 0);
        parcel.writeByte(this.A0u ? (byte) 1 : 0);
        parcel.writeByte(this.A0j ? (byte) 1 : 0);
        parcel.writeByte(this.A0t ? (byte) 1 : 0);
        parcel.writeByte(this.A10 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeStringList(this.A0e);
        List list = this.A0f;
        if (list != null) {
            strArr = new String[list.size()];
            for (int i3 = 0; i3 < this.A0f.size(); i3++) {
                C569038z r5 = (C569038z) this.A0f.get(i3);
                try {
                    StringWriter A0d2 = C18230wP.A0d();
                    MMp A0K2 = C18180wK.A0K(A0d2);
                    String str2 = r5.A01;
                    if (str2 != null) {
                        A0K2.A0d(C63383hO.A00(), str2);
                    }
                    String str3 = r5.A00;
                    if (str3 != null) {
                        A0K2.A0d("prototype", str3);
                    }
                    str = C18180wK.A0h(A0K2, A0d2);
                } catch (IOException unused) {
                    str = null;
                }
                strArr[i3] = str;
            }
        } else {
            strArr = null;
        }
        parcel.writeStringArray(strArr);
        C58603Gk r0 = this.A02;
        if (r0 != null) {
            arrayList = AnonymousClass0wJ.A0v();
            for (AnonymousClass3V3 r02 : r0.A00) {
                arrayList.add(r02.A00);
            }
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = -1;
        }
        parcel.writeInt(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = arrayList.get(i4);
            obj.getClass();
            parcel.writeList((List) obj);
        }
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0k ? (byte) 1 : 0);
        parcel.writeByte(this.A0w ? (byte) 1 : 0);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0q ? (byte) 1 : 0);
        parcel.writeByte(this.A0l ? (byte) 1 : 0);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeByte(this.A0s ? (byte) 1 : 0);
        parcel.writeByte(this.A0x ? (byte) 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0y ? (byte) 1 : 0);
        parcel.writeByte(this.A0i ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0n ? (byte) 1 : 0);
        parcel.writeByte(this.A0o ? (byte) 1 : 0);
    }

    public RegFlowExtras(Parcel parcel) {
        C569038z r0;
        boolean z = false;
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = (CountryCodeData) parcel.readParcelable(classLoader);
        this.A0R = parcel.readString();
        this.A0Q = parcel.readString();
        this.A08 = parcel.readString();
        this.A0O = parcel.readString();
        this.A0Z = parcel.readString();
        this.A0W = parcel.readString();
        this.A0P = parcel.readString();
        this.A05 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0D = parcel.readString();
        this.A0C = parcel.readString();
        this.A0X = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0m = C18180wK.A1Y(parcel);
        this.A0z = C18180wK.A1Y(parcel);
        this.A0h = C18180wK.A1Y(parcel);
        this.A0p = C18180wK.A1Y(parcel);
        this.A0v = C18180wK.A1Y(parcel);
        this.A0g = C18180wK.A1Y(parcel);
        this.A11 = C18180wK.A1Y(parcel);
        this.A0r = C18180wK.A1Y(parcel);
        this.A0u = C18180wK.A1Y(parcel);
        this.A0j = C18180wK.A1Y(parcel);
        this.A0t = C18180wK.A1Y(parcel);
        this.A10 = C18180wK.A1Y(parcel);
        this.A03 = (UserBirthDate) parcel.readParcelable(classLoader);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        this.A0e = A0v2;
        parcel.readStringList(A0v2);
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        parcel.readStringList(A0v3);
        this.A0f = C18240wQ.A0k(A0v3.size());
        Iterator it = A0v3.iterator();
        while (it.hasNext()) {
            String A0k2 = C18180wK.A0k(it);
            List list = this.A0f;
            try {
                r0 = AnonymousClass2TX.parseFromJson(C18180wK.A0L(A0k2));
            } catch (IOException unused) {
                r0 = null;
            }
            list.add(r0);
        }
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            this.A02 = new C58603Gk();
            for (int i = 0; i < readInt; i++) {
                ArrayList A0v4 = AnonymousClass0wJ.A0v();
                parcel.readList(A0v4, classLoader);
                this.A02.A00.add(new AnonymousClass3V3(A0v4));
            }
        }
        this.A0S = parcel.readString();
        this.A0N = parcel.readString();
        this.A0V = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0k = C18180wK.A1Y(parcel);
        this.A0w = C18180wK.A1Y(parcel);
        this.A0Y = parcel.readString();
        this.A0A = parcel.readString();
        this.A04 = parcel.readString();
        this.A0T = parcel.readString();
        this.A0U = parcel.readString();
        this.A0J = parcel.readString();
        this.A0M = parcel.readString();
        this.A09 = parcel.readString();
        this.A0q = C18180wK.A1Y(parcel);
        this.A0l = C18180wK.A1Y(parcel);
        this.A0b = parcel.readString();
        this.A0d = parcel.readString();
        this.A0c = parcel.readString();
        this.A0a = parcel.readString();
        this.A0H = parcel.readString();
        this.A0G = parcel.readString();
        this.A0s = C18180wK.A1Y(parcel);
        this.A0x = C18180wK.A1Y(parcel);
        this.A0K = parcel.readString();
        this.A0L = parcel.readString();
        this.A0I = parcel.readString();
        this.A0y = C18180wK.A1Y(parcel);
        this.A0i = C18180wK.A1Y(parcel);
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        this.A0n = C18180wK.A1Y(parcel);
        this.A0o = parcel.readByte() != 0 ? true : z;
    }

    public static void A00(Context context, H1T h1t, C10300i6 r7, RegFlowExtras regFlowExtras, boolean z) {
        context.getClass();
        if (!TextUtils.isEmpty(regFlowExtras.A08)) {
            String str = regFlowExtras.A08;
            if (str == null) {
                str = "";
            }
            h1t.A0O("email", str);
        }
        String str2 = regFlowExtras.A0Z;
        if (str2 == null) {
            str2 = "";
        }
        h1t.A0O(C63383hO.A00(), str2);
        String str3 = regFlowExtras.A0W;
        if (str3 == null) {
            str3 = "";
        }
        h1t.A0O("suggestedUsername", str3);
        if (!regFlowExtras.A10) {
            C62663aU r1 = new C62663aU(r7);
            String str4 = regFlowExtras.A0P;
            if (str4 == null) {
                str4 = "";
            }
            h1t.A0O("enc_password", r1.A02(str4));
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0Q)) {
            String str5 = regFlowExtras.A0Q;
            if (str5 == null) {
                str5 = "";
            }
            h1t.A0O(C63383hO.A01(28, 12, 80), str5);
        }
        String A002 = C09140ev.A00(context);
        if (A002 == null) {
            A002 = "";
        }
        C18180wK.A0t(context, h1t, C63383hO.A01(11, 9, 12), A002);
        String str6 = regFlowExtras.A0O;
        if (str6 == null) {
            str6 = "";
        }
        h1t.A0O("first_name", str6);
        String str7 = regFlowExtras.A0B;
        if (str7 == null) {
            str7 = "";
        }
        h1t.A0O("force_sign_up_code", str7);
        if (!TextUtils.isEmpty(regFlowExtras.A05)) {
            String str8 = regFlowExtras.A05;
            if (str8 == null) {
                str8 = "";
            }
            h1t.A0O(C63383hO.A01(91, 17, 41), str8);
        }
        if (regFlowExtras.A0z) {
            h1t.A0O("skip_email", "true");
        }
        if (regFlowExtras.A0h) {
            h1t.A0O("allow_contacts_sync", "true");
        }
        if (regFlowExtras.A0p) {
            h1t.A0O("has_sms_consent", "true");
        }
        if (regFlowExtras.A0k) {
            h1t.A0O("force_create_account", "true");
        }
        if (regFlowExtras.A0w) {
            h1t.A0O("requested_username_change", "true");
        }
        if (regFlowExtras.A0v) {
            h1t.A0O("one_tap_opt_in", "true");
        }
        if (regFlowExtras.A10) {
            h1t.A0O("skip_password_setup", "true");
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0C)) {
            h1t.A0O("gdpr_s", regFlowExtras.A0C);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0D)) {
            h1t.A0O("id_token", regFlowExtras.A0D);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0X)) {
            h1t.A0O("tos_version", regFlowExtras.A0X);
        }
        C58603Gk r0 = regFlowExtras.A02;
        if (r0 != null) {
            StringBuilder A0r2 = C18200wM.A0r();
            ArrayList<List> A0v2 = AnonymousClass0wJ.A0v();
            for (AnonymousClass3V3 r02 : r0.A00) {
                A0v2.add(r02.A00);
            }
            for (List<Object> it : A0v2) {
                for (Object obj : it) {
                    A0r2.append(obj.toString());
                    A0r2.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                if (A0r2.length() > 0) {
                    A0r2.deleteCharAt(A0r2.length() - 1);
                }
                A0r2.append("|");
            }
            if (A0r2.length() > 0) {
                A0r2.deleteCharAt(A0r2.length() - 1);
            }
            h1t.A0O("qs_stamp", A0r2.toString());
        }
        if (regFlowExtras.A0y) {
            h1t.A0O("should_link_to_main", "true");
        }
        if (regFlowExtras.A0i) {
            h1t.A0O("convert_to_group", "true");
            String str9 = regFlowExtras.A0E;
            if (str9 != null) {
                h1t.A0O("group_biography", str9);
            }
            String str10 = regFlowExtras.A0F;
            if (str10 != null) {
                h1t.A0O("group_external_url", str10);
            }
            if (regFlowExtras.A0n) {
                h1t.A0O("group_should_be_private", "true");
            }
            if (regFlowExtras.A0o) {
                h1t.A0O("group_post_approvals_enabled", "true");
            }
        }
        String str11 = regFlowExtras.A07;
        if (str11 != null) {
            h1t.A0O("sn_result", str11);
        }
        String str12 = regFlowExtras.A06;
        if (str12 != null) {
            h1t.A0O("sn_nonce", str12);
        }
        if (z) {
            h1t.A0U(C28174Ezk.A00(106));
        }
    }

    public final void A03(C313625r r2) {
        this.A0S = r2.name();
    }

    public RegFlowExtras() {
    }
}
