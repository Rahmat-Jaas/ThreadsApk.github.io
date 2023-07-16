package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.logging.FBPayLoggerData;
import java.util.Map;

/* renamed from: X.79t  reason: invalid class name and case insensitive filesystem */
public final class C1203379t {
    public C124827bo A00;
    public final Context A01;
    public final AnonymousClass7IP A02;
    public final AnonymousClass7IP A03;
    public final C104916ca A04;
    public final C121157Ek A05;
    public final C113376rI A06;
    public final C143688h9 A07;
    public final AnonymousClass76O A08;
    public final C104996ci A09;
    public final C109396jw A0A;
    public final C125627dd A0B;
    public final C1193474t A0C;

    public final AnonymousClass7Ic A01(FragmentActivity fragmentActivity) {
        C104996ci r5 = this.A09;
        return new AnonymousClass7Ic(AnonymousClass7Ic.A08, (Fragment) null, fragmentActivity, this, r5);
    }

    public final C143608h1 A02(Context context, Class cls) {
        Number number;
        int intValue;
        C1193474t r2 = this.A0C;
        if (context == null) {
            context = this.A01;
        }
        if (cls.equals(AnonymousClass5jF.class)) {
            return new AnonymousClass5jF(context, C1193474t.A00(r2, cls));
        }
        if (cls.equals(AnonymousClass5jH.class)) {
            return new AnonymousClass5jH(context, C1193474t.A00(r2, cls));
        }
        if (cls.equals(AnonymousClass5jI.class)) {
            int A002 = C1193474t.A00(r2, cls);
            AnonymousClass79P r0 = (AnonymousClass79P) r2.A00.get(cls);
            if (r0 != null && (number = (Number) r0.A01) != null && (intValue = number.intValue()) != 0) {
                return new AnonymousClass5jI(context, A002, intValue);
            }
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Layout is not provided for Fragment Decorator!", cls));
        } else if (cls.equals(AnonymousClass5jG.class)) {
            return new AnonymousClass5jG(context, C1193474t.A00(r2, cls));
        } else {
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Not aware about decorator Class :", cls));
        }
    }

    public final void A03(Bundle bundle) {
        String string = bundle.getString("PAYMENT_TYPE");
        FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) bundle.getParcelable("logger_data");
        if (!TextUtils.isEmpty(string) && fBPayLoggerData != null) {
            C109396jw r0 = this.A0A;
            string.getClass();
            Map map = r0.A02;
            C04220Ms.A05(map);
            Object obj = map.get(string);
            if (obj == null) {
                obj = new AnonymousClass786(r0.A00, r0.A01);
                map.put(string, obj);
            }
            ((AnonymousClass786) obj).A00(fBPayLoggerData, AnonymousClass006.A01, string);
        }
        C121157Ek r02 = this.A05;
        r02.A02();
        AnonymousClass5k1 r1 = r02.A00.A01.A01;
        C1202479j.A02(r1.A03.A00, r1);
    }

    public C1203379t(Context context, AnonymousClass7IP r3, AnonymousClass7IP r4, C1193474t r5, C121157Ek r6, C113376rI r7, C143688h9 r8, AnonymousClass76O r9, C104996ci r10, C109396jw r11, C125627dd r12) {
        this.A01 = context;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A0C = r5;
        this.A03 = r3;
        this.A02 = r4;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
        this.A0B = r12;
        this.A04 = new C104916ca(r6);
    }

    public static C147138nS A00() {
        C1203379t A072 = AnonymousClass7Kz.A07();
        C124827bo r1 = A072.A00;
        if (r1 != null) {
            return r1;
        }
        Context context = A072.A01;
        C121157Ek r5 = A072.A05;
        AnonymousClass7IP r3 = A072.A03;
        AnonymousClass7IP r4 = A072.A02;
        C109396jw r8 = A072.A0A;
        C124827bo r12 = new C124827bo(context, r3, r4, r5, A072.A08, A072.A09, r8, A072.A0B);
        A072.A00 = r12;
        return r12;
    }
}
