package X;

import android.os.Bundle;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.redex.IDxSProviderShape515S0100000_2_I2;
import com.facebookpay.msc.logging.LoggingData;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.585  reason: invalid class name */
public final class AnonymousClass585 extends C62793ak {
    public LoggingData A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public Integer A05;
    public final C880856r A06 = C880856r.A03();
    public final C880856r A07 = C880856r.A03();
    public final C880856r A08 = C880856r.A03();
    public final C880856r A09 = C880856r.A03();
    public final C880856r A0A = C880856r.A04(new C114986uF(C128097is.A00(C86164wN.A1T(), 2131832224), C86134wK.A0T(), true));
    public final C880856r A0B = C880856r.A03();
    public final C880856r A0C = C880856r.A03();
    public final C143158gC A0D;
    public final C121177En A0E;
    public final C04530Oa A0F = AnonymousClass0OY.A02(C138308Gz.A00);

    public AnonymousClass585(C121177En r5) {
        C04220Ms.A0B(r5, 1);
        this.A0E = r5;
        r5.A04.put("tab_index_bundle", new IDxSProviderShape515S0100000_2_I2(this, 5));
        this.A0D = C86114wI.A0Q(this, 107);
    }

    public final void A02(String str, String str2) {
        int i;
        C04220Ms.A0B(str, 0);
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass7Kz.A06();
            AnonymousClass7BK.A00(intValue, 0, 615);
        }
        int hashCode = str.hashCode();
        if (hashCode != -1868875270) {
            if (hashCode != -1260171540) {
                if (hashCode == 48250454 && str.equals("overview_fragment")) {
                    i = 667754853;
                } else {
                    return;
                }
            } else if (str.equals("settings_fragment")) {
                i = 667749724;
            } else {
                return;
            }
        } else if (str.equals("transactions_fragment")) {
            i = 667758015;
        } else {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            AnonymousClass7Kz.A06();
            MarkerEditor A022 = AnonymousClass7Kz.A02(intValue2, 0);
            if (str2 != null) {
                A022.annotate("entry_point", str2);
                A022.point("entry_point_clicked");
            }
            A022.markerEditingCompleted();
            this.A05 = valueOf;
        }
    }

    public static final String A00(AnonymousClass585 r3) {
        C115176ud r0;
        String str;
        Number number = (Number) r3.A08.A08();
        if (number != null) {
            int intValue = number.intValue();
            List list = (List) r3.A06.A08();
            if (!(list == null || (r0 = (C115176ud) AnonymousClass00J.A0G(list, intValue)) == null || (str = r0.A03) == null)) {
                switch (str.hashCode()) {
                    case -1868875270:
                        if (str.equals("transactions_fragment")) {
                            return "transactions";
                        }
                        break;
                    case -966253274:
                        if (str.equals("earnings_fragment")) {
                            return "payouthub_earnings";
                        }
                        break;
                    case 48250454:
                        if (str.equals("overview_fragment")) {
                            return "overview";
                        }
                        break;
                    case 1148185282:
                        if (str.equals("payouts_fragment")) {
                            return "payouthub_payouts";
                        }
                        break;
                }
            }
        }
        return null;
    }

    public final Bundle A01() {
        String str;
        Bundle A062 = C18180wK.A06();
        List list = this.A03;
        if (list == null) {
            str = "financialEntities";
        } else {
            C121697Hn.A03(A062, list);
            A062.putString("page_id", this.A02);
            A062.putBoolean("has_container_fragment", true);
            LoggingData loggingData = this.A00;
            if (loggingData == null) {
                str = "loggingData";
            } else {
                A062.putParcelable("logging_data", loggingData);
                A062.putBoolean("IS_V2", this.A04);
                return A062;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void A03(String str, String str2) {
        String A002 = A00(this);
        C143688h9 A082 = AnonymousClass7Kz.A08();
        LoggingData loggingData = this.A00;
        if (loggingData == null) {
            C04220Ms.A0E("loggingData");
            throw null;
        }
        HashMap A003 = AnonymousClass6IH.A00(loggingData);
        if (str != null) {
            A003.put("target_name", str);
        }
        if (str2 != null) {
            A003.put("target_url", str2);
        }
        if (A002 != null) {
            A003.put("view_name", A002);
        }
        A082.Bb8("user_click_payouthub_atomic", A003);
    }
}
