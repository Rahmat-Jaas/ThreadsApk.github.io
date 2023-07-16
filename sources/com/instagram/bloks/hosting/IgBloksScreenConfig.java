package com.instagram.bloks.hosting;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2JP;
import X.AnonymousClass2JQ;
import X.AnonymousClass3TP;
import X.AnonymousClass49P;
import X.AnonymousClass4nQ;
import X.AnonymousClass7Kk;
import X.AnonymousClass7Ko;
import X.C10300i6;
import X.C109326jp;
import X.C121997Jj;
import X.C127397h3;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C210718u;
import X.C29721zB;
import X.C30967GcS;
import X.C66883yU;
import X.C72284Ni;
import X.C85984w5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import com.instagram.bloks.hosting.intf.IgBloksScreenExitCallback;
import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IgBloksScreenConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(86);
    public int A00;
    public C66883yU A01;
    public AnonymousClass4nQ A02;
    public C72284Ni A03;
    public IgBloksScreenExitCallback A04;
    public C85984w5 A05;
    public IgBloksScreenRequestCallback A06;
    public C121997Jj A07;
    public C121997Jj A08;
    public C127397h3 A09;
    public C109326jp A0A;
    public C109326jp A0B;
    public C10300i6 A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public HashMap A0T;
    public HashMap A0U;
    public List A0V;
    public Map A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public Integer A0k;
    public Integer A0l;
    public final Set A0m;

    public final int describeContents() {
        return 0;
    }

    public static IgBloksScreenConfig A00(Bundle bundle, C10300i6 r2) {
        AnonymousClass7Ko.A07(bundle, "Fragment must be passed args");
        AnonymousClass7Ko.A07(r2, "A valid session must be provided");
        IgBloksScreenConfig igBloksScreenConfig = (IgBloksScreenConfig) bundle.getParcelable("screen_config");
        if (igBloksScreenConfig == null) {
            return null;
        }
        igBloksScreenConfig.A0C = r2;
        AnonymousClass49P A002 = AnonymousClass49P.A00(r2);
        igBloksScreenConfig.A08 = (C121997Jj) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0L);
        igBloksScreenConfig.A0A = (C109326jp) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0G);
        igBloksScreenConfig.A0B = (C109326jp) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0K);
        igBloksScreenConfig.A07 = (C121997Jj) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0I);
        igBloksScreenConfig.A0J = (Integer) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0J);
        igBloksScreenConfig.A09 = (C127397h3) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0H);
        igBloksScreenConfig.A0V = (List) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0N);
        igBloksScreenConfig.A0W = (Map) igBloksScreenConfig.A02(A002, igBloksScreenConfig.A0F);
        return igBloksScreenConfig;
    }

    public static Integer A01(Parcel parcel) {
        return (Integer) parcel.readValue(IgBloksScreenConfig.class.getClassLoader());
    }

    private Object A02(AnonymousClass49P r2, Integer num) {
        if (num == null) {
            return null;
        }
        this.A0m.add(num);
        return r2.A02(num.intValue());
    }

    public static void A03(Bundle bundle, IgBloksScreenConfig igBloksScreenConfig) {
        if (igBloksScreenConfig.A08 != null && igBloksScreenConfig.A0L == null) {
            igBloksScreenConfig.A0L = Integer.valueOf(AnonymousClass49P.A00(igBloksScreenConfig.A0C).A01(igBloksScreenConfig.A08));
        }
        if (igBloksScreenConfig.A0B != null && igBloksScreenConfig.A0K == null) {
            igBloksScreenConfig.A0K = Integer.valueOf(AnonymousClass49P.A00(igBloksScreenConfig.A0C).A01(igBloksScreenConfig.A0B));
        }
        if (igBloksScreenConfig.A0W != null && igBloksScreenConfig.A0F == null) {
            igBloksScreenConfig.A0F = Integer.valueOf(AnonymousClass49P.A00(igBloksScreenConfig.A0C).A01(igBloksScreenConfig.A0W));
        }
        bundle.putParcelable("screen_config", igBloksScreenConfig);
    }

    public final C210718u A04() {
        return new C210718u(this.A0C, this.A0Z, this.A0j, this.A0a);
    }

    public final void A05() {
        AnonymousClass7Ko.A07(this.A0C, "Can't destroy an uninitialized config!");
        Set<Object> set = this.A0m;
        if (!set.isEmpty()) {
            AnonymousClass49P A002 = AnonymousClass49P.A00(this.A0C);
            for (Object A042 : set) {
                A002.A03(AnonymousClass0wJ.A04(A042));
            }
        }
    }

    public final void A06(AnonymousClass3TP r4) {
        this.A0S = r4.A06;
        this.A0R = r4.A05;
        this.A0g = !r4.A0A;
        this.A0f = r4.A08;
        this.A0i = !r4.A09;
        C127397h3 r2 = r4.A03;
        if (r2 != null) {
            try {
                String A0N2 = r2.A0N(36);
                int i = 0;
                if (A0N2 != null) {
                    i = AnonymousClass7Kk.A04(A0N2);
                }
                this.A0E = Integer.valueOf(i);
                String A0o = C18220wO.A0o(r2);
                int i2 = 0;
                if (A0o != null) {
                    i2 = AnonymousClass7Kk.A04(A0o);
                }
                this.A0D = Integer.valueOf(i2);
            } catch (C29721zB unused) {
                C30967GcS.A02("invalid_themed_color", "Error parsing themed color for NavBar");
            }
        }
        AnonymousClass49P A002 = AnonymousClass49P.A00(this.A0C);
        Integer num = this.A0G;
        if (num != null) {
            A002.A03(num.intValue());
            this.A0A = null;
            this.A0G = null;
        }
        Integer num2 = this.A0I;
        if (num2 != null) {
            A002.A03(num2.intValue());
            this.A07 = null;
            this.A0I = null;
        }
        Integer num3 = this.A0J;
        if (num3 != null) {
            A002.A03(num3.intValue());
            this.A02 = null;
            this.A0J = null;
        }
        Integer num4 = this.A0H;
        if (num4 != null) {
            A002.A03(num4.intValue());
            this.A09 = null;
            this.A0H = null;
        }
        Integer num5 = this.A0N;
        if (num5 != null) {
            A002.A03(num5.intValue());
            this.A0V = null;
            this.A0N = null;
        }
        C109326jp r0 = r4.A04;
        if (r0 != null) {
            this.A0A = r0;
            this.A0G = Integer.valueOf(A002.A01(r0));
        }
        C121997Jj r02 = r4.A01;
        if (r02 != null) {
            this.A07 = r02;
            this.A0I = Integer.valueOf(A002.A01(r02));
        }
        AnonymousClass4nQ r03 = r4.A00;
        if (r03 != null) {
            this.A02 = r03;
            this.A0J = Integer.valueOf(A002.A01(r03));
        }
        C127397h3 r04 = r4.A02;
        if (r04 != null) {
            this.A09 = r04;
            this.A0H = Integer.valueOf(A002.A01(r04));
        }
        List list = r4.A07;
        if (list != null) {
            this.A0V = list;
            this.A0N = Integer.valueOf(A002.A01(list));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0R);
        parcel.writeSerializable(this.A05);
        parcel.writeSerializable(this.A03);
        parcel.writeString(this.A0P);
        parcel.writeSerializable(this.A0U);
        parcel.writeSerializable(this.A0T);
        parcel.writeValue(this.A0M);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeValue(this.A0E);
        parcel.writeValue(this.A0D);
        parcel.writeValue(this.A0L);
        parcel.writeValue(this.A0G);
        parcel.writeValue(this.A0K);
        parcel.writeValue(this.A0I);
        parcel.writeValue(this.A0J);
        parcel.writeValue(this.A0H);
        parcel.writeValue(this.A0N);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeValue(this.A0F);
        parcel.writeString(AnonymousClass2JQ.A00(this.A0O));
        parcel.writeString(this.A0Q);
        parcel.writeValue(this.A0l);
        parcel.writeValue(this.A0k);
        if (this.A01 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeBundle(this.A01.A05());
    }

    public IgBloksScreenConfig(Parcel parcel) {
        this.A00 = 16;
        boolean z = false;
        this.A0h = false;
        this.A0e = false;
        this.A0g = true;
        this.A0f = false;
        this.A0i = false;
        this.A0X = true;
        this.A0b = false;
        this.A0d = false;
        this.A0c = false;
        this.A0j = false;
        this.A0a = false;
        this.A0Z = false;
        this.A0O = AnonymousClass006.A00;
        this.A0m = C18200wM.A0u();
        this.A0S = parcel.readString();
        this.A0R = parcel.readString();
        this.A05 = (C85984w5) parcel.readSerializable();
        this.A03 = (C72284Ni) parcel.readSerializable();
        this.A0P = parcel.readString();
        this.A0U = (HashMap) parcel.readSerializable();
        this.A0T = (HashMap) parcel.readSerializable();
        this.A0M = A01(parcel);
        this.A06 = (IgBloksScreenRequestCallback) C18180wK.A0A(parcel, IgBloksScreenRequestCallback.class);
        this.A04 = (IgBloksScreenExitCallback) C18180wK.A0A(parcel, IgBloksScreenExitCallback.class);
        this.A0h = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0e = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0g = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0f = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0i = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0b = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0d = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0c = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0j = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0a = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0X = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A0E = A01(parcel);
        this.A0D = A01(parcel);
        this.A0L = A01(parcel);
        this.A0G = A01(parcel);
        this.A0K = A01(parcel);
        this.A0I = A01(parcel);
        this.A0J = A01(parcel);
        this.A0H = A01(parcel);
        this.A0N = A01(parcel);
        this.A0Y = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A00 = parcel.readInt();
        this.A0Z = parcel.readInt() == 1 ? true : z;
        this.A0F = A01(parcel);
        this.A0O = AnonymousClass2JP.A00(parcel.readString());
        this.A0Q = parcel.readString();
        this.A0k = Integer.valueOf(parcel.readInt());
        this.A0l = Integer.valueOf(parcel.readInt());
        if (parcel.readByte() == 1) {
            Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
            if (readBundle == null) {
                C30967GcS.A02("IgBloksScreenConfig", "Parcelized CdsOpenScreenConfig should not be null");
            } else {
                this.A01 = C66883yU.A01(readBundle);
            }
        }
    }

    public IgBloksScreenConfig(C10300i6 r3) {
        this.A00 = 16;
        this.A0h = false;
        this.A0e = false;
        this.A0g = true;
        this.A0f = false;
        this.A0i = false;
        this.A0X = true;
        this.A0b = false;
        this.A0d = false;
        this.A0c = false;
        this.A0j = false;
        this.A0a = false;
        this.A0Z = false;
        this.A0O = AnonymousClass006.A00;
        this.A0m = C18200wM.A0u();
        this.A0C = r3;
    }
}
