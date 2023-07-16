package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.redex.IDxHelperShape66S0000000_I2;
import java.io.StringWriter;

/* renamed from: X.0eS  reason: invalid class name and case insensitive filesystem */
public final class C08880eS {
    public static C08890eT parseFromJson(MMo mMo) {
        return (C08890eT) C25563Dnz.A02(mMo, new IDxHelperShape66S0000000_I2(7));
    }

    public static C08890eT A00(MMo mMo) {
        C08890eT r2 = new C08890eT();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            String A0o = mMo.A0o();
            mMo.A0g();
            A05(mMo, r2, A0o);
            mMo.A0x();
        }
        return r2;
    }

    public static C08890eT A02(String str) {
        MMo A08 = C18987Aon.A00.A08(str);
        A08.A0g();
        return parseFromJson(A08);
    }

    public static String A03(C08890eT r2) {
        StringWriter stringWriter = new StringWriter();
        MMp A04 = C18987Aon.A00.A04(stringWriter);
        A04(A04, r2);
        A04.close();
        return stringWriter.toString();
    }

    public static void A05(MMo mMo, C08890eT r3, String str) {
        String A0p;
        if ("media_id".equals(str)) {
            if (mMo.A0f() == C40318LcR.VALUE_NULL) {
                A0p = null;
            } else {
                A0p = mMo.A0p();
            }
            r3.A03 = A0p;
        } else if (ClientCookie.VERSION_ATTR.equals(str)) {
            r3.A00 = mMo.A0X();
        } else if ("media_pct".equals(str)) {
            r3.A01 = (float) mMo.A0R();
        } else if ("time_info".equals(str)) {
            r3.A02 = C08790eI.parseFromJson(mMo);
        } else if ("was_share_tapped".equals(str)) {
            r3.A05 = mMo.A12();
        }
    }

    public static void A04(MMp mMp, C08890eT r3) {
        mMp.A0J();
        String str = r3.A03;
        if (str != null) {
            mMp.A0d("media_id", str);
        }
        mMp.A0b(ClientCookie.VERSION_ATTR, r3.A00);
        mMp.A0a("media_pct", r3.A01);
        if (r3.A02 != null) {
            mMp.A0U("time_info");
            C08790eI.A02(mMp, r3.A02);
        }
        mMp.A0e("was_share_tapped", r3.A05);
        mMp.A0G();
    }
}
